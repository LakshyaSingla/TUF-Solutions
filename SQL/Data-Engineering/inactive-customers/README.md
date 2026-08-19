# [Inactive Customers](https://takeuforward.org/plus/sql-data-engineering-foundations/sql-joins/inactive-customers?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

You are managing an e-commerce platform and want to identify customers who have never placed an order. This can help your marketing or sales team target those users with special promotions or reminders.

You are given two tables:

Customers:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ id ║ int ║
║─────────────┼──────────║
║ name ║ vachar ║
╚═════════════╩══════════╝
</pre>
- *id* : Unique id of the customer.
- *name* : name of each customer.

Orders:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ id ║ int ║
║─────────────┼──────────║
║ customerid ║ int ║
╚═════════════╩══════════╝
</pre>
- *id* : Unique id of the order
- *customerId* : customerId is a foreign key, which is taking reference from Customer table

Write an SQL query to return the names of all customers who do not appear in the Orders table.

The result can be returned in any order.

### Example 1

Example:

Input:

Customers Table:

<pre class="ql-syntax" spellcheck="false">╔══════════╦══════════╗
║ id ║ name ║
╠══════════╬══════════╣
║ 1 ║ Joe ║
║──────────┼──────────║
║ 2 ║ Henry ║
║──────────┼──────────║
║ 3 ║ Sam ║
║──────────┼──────────║
║ 4 ║ Max ║
╚══════════╩══════════╝
</pre>

Orders Table:

<pre class="ql-syntax" spellcheck="false">╔══════════╦════════════╗
║ id ║ customerId ║
╠══════════╬════════════╣
║ 1 ║ 3 ║
║──────────┼────────────║
║ 2 ║ 1 ║
╚══════════╩════════════╝
</pre>

Expected Output:

<pre class="ql-syntax" spellcheck="false">╔═══════════╗
║ Customers ║
╠═══════════╣
║ Henry ║
║───────────║
║ Max ║
╚═══════════╝
</pre>Explanation:

- Joe (1) = Ordered&nbsp;
- Henry (2) = No order&nbsp;
- Sam (3) = Ordered&nbsp;
- Max (4) = No order&nbsp;

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
