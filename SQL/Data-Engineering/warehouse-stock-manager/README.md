# [Warehouse Stock Manager](https://takeuforward.org/plus/sql-data-engineering-foundations/sql-joins/warehouse-stock-manager?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

As a warehouse manager, you need to track how much physical space is occupied by products in each warehouse. This is crucial for logistics, expansion planning, and inventory control. You are given two tables:

**Warehouse**

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ name ║ varchar ║
║─────────────┼──────────║
║ product_id ║ int ║
║─────────────┼──────────║
║ units ║ int ║
╚═════════════╩══════════╝
</pre>

- **name:** Name of the warehouse
- **product_id:** ID of the product stored in the warehouse (foreign key to Products)
- **units:** Number of units of the product stored in that warehouse
- **(name, product_id)** is the primary key

**Products**

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ product_id ║ int ║
║─────────────┼──────────║
║product_name ║ varchar ║
║─────────────┼──────────║
║ Width ║ int ║
║─────────────┼──────────║
║ Length ║ int ║
║─────────────┼──────────║
║ Height ║ int ║
╚═════════════╩══════════╝
</pre>

- **product_id:** Unique ID for the product (Primary Key)
- **product_name:** Name of the product
- **Width:** Width of the product in feet
- **Length:** Length of the product in feet
- **Height:** Height of the product in feet

Write a query to calculate the total volume (in cubic feet) occupied by the inventory in each warehouse. The result can be returned in any order.

### Example 1

**Example:**

<p>

**Input:** </p>

Warehouse Table

<pre class="ql-syntax" spellcheck="false">╔═══════════╦════════════╦═══════╗
║ name ║ product_id ║ units ║
╠═══════════╬════════════╬═══════╣
║ VCHouse1 ║ 1 ║ 1 ║
║───────────┼────────────┼───────║
║ VCHouse1 ║ 2 ║ 10 ║
║───────────┼────────────┼───────║
║ VCHouse1 ║ 3 ║ 5 ║
║───────────┼────────────┼───────║
║ VCHouse2 ║ 1 ║ 2 ║
║───────────┼────────────┼───────║
║ VCHouse2 ║ 2 ║ 2 ║
║───────────┼────────────┼───────║
║ VCHouse3 ║ 4 ║ 1 ║
╚═══════════╩════════════╩═══════╝
</pre>

Products Table

<pre class="ql-syntax" spellcheck="false">╔════════════╦══════════════╦═══════╦════════╦════════╗
║ product_id ║ product_name ║ Width ║ Length ║ Height ║
╠════════════╬══════════════╬═══════╬════════╬════════╣
║ 1 ║ VC-TV ║ 5 ║ 50 ║ 40 ║
║────────────┼──────────────┼───────┼────────┼────────║
║ 2 ║ VC-KeyChain ║ 5 ║ 5 ║ 5 ║
║────────────┼──────────────┼───────┼────────┼────────║
║ 3 ║ VC-Phone ║ 2 ║ 10 ║ 10 ║
║────────────┼──────────────┼───────┼────────┼────────║
║ 4 ║ VC-T-Shirt ║ 4 ║ 10 ║ 20 ║
╚════════════╩══════════════╩═══════╩════════╩════════╝
</pre>

**Expected Output:**

<pre class="ql-syntax" spellcheck="false">╔════════════════╦════════╗
║ warehouse_name ║ volume ║
╠════════════════╬════════╣
║ VCHouse1 ║ 12250 ║
║────────────────┼────────║
║ VCHouse2 ║ 20250 ║
║────────────────┼────────║
║ VCHouse3 ║ 800 ║
╚════════════════╩════════╝
</pre>

<p>

**Explanation:** </p>Calculate volume per product using: **Width × Length × Height**

- VC-TV = 5×50×40 = 10000
- VC-KeyChain = 5×5×5 = 125
- VC-Phone = 2×10×10 = 200
- VC-T-Shirt = 4×10×20 = 800

Now, compute total volume per warehouse:

- **VCHouse1:** 1×10000 + 10×125 + 5×200 = 12250
- **VCHouse2:** 2×10000 + 2×125 = 20250
- **VCHouse3:** 1×800 = 800

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
