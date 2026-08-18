# [Sales Analysis](https://takeuforward.org/plus/sql-data-engineering-foundations/sql-joins/sales-analysis?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company tracks product sales over different years. Each sale record includes the product ID, year of sale, quantity sold, and price per unit, the company wants to analyze yearly sales trends.

Your task is to generate this sales report by joining product names with sales data.

The company maintains two tables:

**Sales** table, which contains:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column name ║ &nbsp; Type &nbsp; ║
╠═════════════╬══════════╣
║ &nbsp; sale_id &nbsp; ║ &nbsp; int &nbsp; &nbsp;║
║─────────────┼──────────║
║ product_id &nbsp;║ &nbsp; int &nbsp; &nbsp;║
║─────────────┼──────────║
║ &nbsp; &nbsp;year &nbsp; &nbsp; ║ &nbsp; int &nbsp; &nbsp;║
║─────────────┼──────────║
║ &nbsp;quantity &nbsp; ║ &nbsp; int &nbsp; &nbsp;║
║─────────────┼──────────║
║ &nbsp; &nbsp;price &nbsp; &nbsp;║ &nbsp; int &nbsp; &nbsp;║
╚═════════════╩══════════╝
</pre>
- sale_id: A unique identifier for each sale transaction.
- product_id: The ID (foreign key) of the product being sold.
- year: The year in which the sale occurred.
- quantity: The number of units sold.
- price: The price per unit at the time of the sale.

Here, (sale_id, year) is the primary key (combination of columns with unique values) of this table.

**Product** table, which contains:

<pre class="ql-syntax" spellcheck="false">╔══════════════╦═══════════╗
║ Column name &nbsp;║ &nbsp; Type &nbsp; ║
╠══════════════╬═══════════╣
║ &nbsp;product_id &nbsp;║ &nbsp; int &nbsp; &nbsp;║
║──────────────┼───────────║
║ product_name ║ varchar &nbsp;║
╚══════════════╩═══════════╝
</pre>
- product_id: The unique ID (primary key) of each product.
- product_name: The name of the product.

Your task is to **retrieve the product name, year of sale, and price per unit** for each sale.

The result should be returned **in any order** .

### Example 1

Input:

Sales Table:

<pre class="ql-syntax" spellcheck="false">╔══════════╦════════════╦══════════╦══════════╦══════════╗
║ sale_id &nbsp;║ product_id ║ &nbsp; year &nbsp; ║ quantity ║ &nbsp;price &nbsp; ║
╠══════════╬════════════╬══════════╬══════════╬══════════╣
║ &nbsp; &nbsp;1 &nbsp; &nbsp; ║ &nbsp; &nbsp;101 &nbsp; &nbsp; ║ &nbsp; 2008 &nbsp; ║ &nbsp; &nbsp;10 &nbsp; &nbsp;║ &nbsp; 5000 &nbsp; ║
║──────────┼────────────┼──────────┼──────────┼──────────║
║ &nbsp; &nbsp;2 &nbsp; &nbsp; ║ &nbsp; &nbsp;101 &nbsp; &nbsp; ║ &nbsp; 2009 &nbsp; ║ &nbsp; &nbsp;12 &nbsp; &nbsp;║ &nbsp; 5000 &nbsp; ║
║──────────┼────────────┼──────────┼──────────┼──────────║
║ &nbsp; &nbsp;3 &nbsp; &nbsp; ║ &nbsp; &nbsp;202 &nbsp; &nbsp; ║ &nbsp; 2011 &nbsp; ║ &nbsp; &nbsp;15 &nbsp; &nbsp;║ &nbsp; 9000 &nbsp; ║
╚══════════╩════════════╩══════════╩══════════╩══════════╝

</pre>

Product Table:

<pre class="ql-syntax" spellcheck="false">╔════════════╦══════════════╗
║ product_id ║ product_name ║
╠════════════╬══════════════╣
║ &nbsp; &nbsp;101 &nbsp; &nbsp; ║ &nbsp; &nbsp; Sony &nbsp; &nbsp; ║
║────────────┼──────────────║
║ &nbsp; &nbsp;202 &nbsp; &nbsp; ║ &nbsp; &nbsp;Lenovo &nbsp; &nbsp;║
║────────────┼──────────────║
║ &nbsp; &nbsp;303 &nbsp; &nbsp; ║ &nbsp; &nbsp; Dell &nbsp; &nbsp; ║
╚════════════╩══════════════╝

</pre>

Output:

<pre class="ql-syntax" spellcheck="false">╔══════════════╦══════════╦══════════╗
║ product_name ║ &nbsp; year &nbsp; ║ &nbsp;price &nbsp; ║
╠══════════════╬══════════╬══════════╣
║ &nbsp; &nbsp; Sony &nbsp; &nbsp; ║ &nbsp; 2008 &nbsp; ║ &nbsp; 5000 &nbsp; ║
║──────────────┼──────────┼──────────║
║ &nbsp; &nbsp; Sony &nbsp; &nbsp; ║ &nbsp; 2009 &nbsp; ║ &nbsp; 5000 &nbsp; ║
║──────────────┼──────────┼──────────║
║ &nbsp; &nbsp;Lenovo &nbsp; &nbsp;║ &nbsp; 2011 &nbsp; ║ &nbsp; 9000 &nbsp; ║
╚══════════════╩══════════╩══════════╝

</pre>

Explanation:

- Sony (product_id = 101) - Sold for 5000 in 2008 and 5000 in 2009.
- Lenovo (product_id = 202) - Sold for 9000 in 2011.
- Dell (product_id = 303) - No matching sale in Sales table, so it's excluded.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
