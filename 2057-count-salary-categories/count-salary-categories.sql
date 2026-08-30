# Write your MySQL query statement below
SELECT c.category,
COALESCE(counts.accounts_count,0) AS accounts_count
FROM(
    SELECT 'Low Salary' AS category
    UNION ALL
    SELECT 'Average Salary'
    UNION ALL
    SELECT 'High Salary'
)c
LEFT JOIN(SELECT CASE

            WHEN income<20000 THEN 'Low Salary'
            WHEN income BETWEEN 20000 AND 50000 THEN 'Average Salary'
            ELSE 'High Salary'
        END AS category,
        COUNT(account_id) AS accounts_count
FROM Accounts
GROUP BY category)counts
ON c.category=counts.category;
