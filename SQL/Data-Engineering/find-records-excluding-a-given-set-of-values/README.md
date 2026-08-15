# [Find Records Excluding a Given Set of Values](https://takeuforward.org/plus/sql-data-engineering-foundations/querying-essentials/find-records-excluding-a-given-set-of-values?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

An e-commerce platform tracks customer orders. Some orders are marked as cancelled or returned, and the business team wants to analyze only the valid orders.

Table: Orders

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column ║ Type ║
╠═════════════╬══════════╣
║ order_id ║ int ║
║─────────────┼──────────║
║ customer_id ║ int ║
║─────────────┼──────────║
║ status ║ varchar ║
╚═════════════╩══════════╝
</pre>
- order_id is the primary key.
- Each row represents one order.
- status can be values like: 'Completed', 'Cancelled', 'Returned', 'Pending', 'Shipped', 'Processing'.

Write an SQL query to return all orders whose status is NOT:

- 'Cancelled'
- 'Returned'

Return: order_id | customer_id | status

Result can be returned in any order.

### Example 1

Input:

Orders:

<pre class="ql-syntax" spellcheck="false">╔══════════╦═════════════╦═══════════╗
║ order_id ║ customer_id ║ status ║
╠══════════╬═════════════╬═══════════╣
║ 1 ║ 101 ║ Completed ║
║──────────┼─────────────┼───────────║
║ 2 ║ 102 ║ Cancelled ║
║──────────┼─────────────┼───────────║
║ 3 ║ 10^3 ║ Returned ║
║──────────┼─────────────┼───────────║
║ 4 ║ 10^4 ║ Pending ║
╚══════════╩═════════════╩═══════════╝
</pre>

Output:

<pre class="ql-syntax" spellcheck="false">╔══════════╦═════════════╦═══════════╗
║ order_id ║ customer_id ║ status ║
╠══════════╬═════════════╬═══════════╣
║ 1 ║ 101 ║ Completed ║
║──────────┼─────────────┼───────────║
║ 4 ║ 10^4 ║ Pending ║
╚══════════╩═════════════╩═══════════╝
</pre>

Explanation:

Orders with status Cancelled and Returned are excluded.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
