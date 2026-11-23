

class ProductOfNumbers {

    ArrayList<Integer> prefixP = new ArrayList<>();

    public ProductOfNumbers() {
        prefixP.add(1);
    }

    public void add(int num) {

        if (num == 0) {
            prefixP.clear();
            prefixP.add(1);
        }
        else {
            int lastProduct = prefixP.get(prefixP.size() - 1);
            prefixP.add(lastProduct * num);
        }
    }

    public int getProduct(int k) {

        int n = prefixP.size();

        if (k >= n) {
            return 0;
        }

        return prefixP.get(n - 1) / prefixP.get(n - 1 - k);
    }
}