# [All-Product Buyers](https://takeuforward.org/plus/sql-data-engineering-foundations/subqueries/all-product-buyers?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

A company wants to identify customers who have purchased all available products in their catalog. This helps the company target promotions and understand customer engagement.

You are given two tables:

**Customer Table**

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column name ║ Type ║
╠═════════════╬══════════╣
║ customer_id ║ int ║
║─────────────┼──────────║
║ product_key ║ int ║
╚═════════════╩══════════╝
</pre>

**Product Table**

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column name ║ Type ║
╠═════════════╬══════════╣
║ product_key ║ int ║
╚═════════════╩══════════╝
</pre>
- **customer_id** : Unique ID of the customer.
- **product_key** : The ID of the product purchased by the customer or listed in the catalog.

**Note:** There may be duplicate rows in the Customer table.

Write an SQL query to find the customer_ids of customers who have bought **all** products from the Product table. The result should be returned in ascending order of customer_id.

### Example 1

**Example:**

<p>

**Input:** </p><pre class="ql-syntax" spellcheck="false">Customer Table:
╔══════════════╦═════════════╗
║ customer_id ║ product_key ║
╠══════════════╬═════════════╣
║ 1 ║ 5 ║
║ 2 ║ 6 ║
║ 3 ║ 5 ║
║ 3 ║ 6 ║
║ 1 ║ 6 ║
╚══════════════╩═════════════╝

Product Table:
╔═════════════╗
║ product_key ║
╠═════════════╣
║ 5 ║
║ 6 ║
╚═════════════╝
</pre>

<p>

**Output:** </p><pre class="ql-syntax" spellcheck="false">╔═════════════╗
║ customer_id ║
╠═════════════╣
║ 1 ║
║ 3 ║
╚═════════════╝
</pre>

<p>

**Explanation:** </p>
- Customer 1 bought products 5 and 6 → **Included** .
- Customer 2 only bought product 6 → **Excluded** .
- Customer 3 bought products 5 and 6 → **Included** .

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
