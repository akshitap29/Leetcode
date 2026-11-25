
import java.util.*;

class Solution {

    static final long BASE1 = 911382323L;
    static final long BASE2 = 972663749L;

    static final long MOD1 = 1_000_000_007L;
    static final long MOD2 = 1_000_000_009L;

    public int smallestUniqueSubarray(int[] nums) {

        int n = nums.length;

        long[] hash1 = new long[n + 1];
        long[] hash2 = new long[n + 1];

        long[] power1 = new long[n + 1];
        long[] power2 = new long[n + 1];

        power1[0] = 1;
        power2[0] = 1;

        // Build prefix hashes and powers
        for (int i = 0; i < n; i++) {

            power1[i + 1] = (power1[i] * BASE1) % MOD1;
            power2[i + 1] = (power2[i] * BASE2) % MOD2;

            hash1[i + 1] =
                (hash1[i] * BASE1 + nums[i]) % MOD1;

            hash2[i + 1] =
                (hash2[i] * BASE2 + nums[i]) % MOD2;
        }

        int low = 1;
        int high = n;
        int ans = n;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (check(nums, mid, hash1, hash2,
                      power1, power2)) {

                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public boolean check(int[] nums, int k,
                         long[] hash1, long[] hash2,
                         long[] power1, long[] power2) {

        HashMap<Long, Integer> map = new HashMap<>();

        int n = nums.length;

        // Generate hashes of all windows of length k
        for (int i = 0; i + k <= n; i++) {

            long h1 = (hash1[i + k]
                    - hash1[i] * power1[k] % MOD1
                    + MOD1) % MOD1;

            long h2 = (hash2[i + k]
                    - hash2[i] * power2[k] % MOD2
                    + MOD2) % MOD2;

            // Combine both hashes into one key
            long key = h1 * MOD2 + h2;

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // Check whether any window occurs exactly once
        for (int count : map.values()) {

            if (count == 1) {
                return true;
            }
        }

        return false;
    }
}
