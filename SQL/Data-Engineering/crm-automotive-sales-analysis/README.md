# [CRM Automotive Sales Analysis](https://takeuforward.org/plus/sql-data-engineering-foundations/aggregation-and-analysis/crm-automotive-sales-analysis?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

In a CRM-based automotive sales environment, managers often need to analyze the number of unique customer leads and partner interactions across different products (make_name) per day. This helps evaluate marketing reach and channel performance.

You are given a table **DailySales** :

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ date_id ║ date ║
║─────────────┼──────────║
║ make_name ║ varchar ║
║─────────────┼──────────║
║ lead_id ║ int ║
║─────────────┼──────────║
║ partner_id ║ int ║
╚═════════════╩══════════╝
</pre>

- **date_id:** Date of the sale.
- **make_name:** The brand of the car (only in lower english letters).
- **lead_id:** ID representing a potential customer lead.
- **partner_id:** ID representing a sales partner or channel.

Write a query to find, for each **date_id** and **make_name** , the count of distinct **lead_id** 's and distinct **partner_id** 's.

Return the result table ordered by date_id and make_name in ascending order.

### Example 1

**Example:**

<p>

**Input:** </p>DailySales

<pre class="ql-syntax" spellcheck="false">╔═══════════╦═══════════╦═════════╦════════════╗
║ date_id ║ make_name ║ lead_id ║ partner_id ║
╠═══════════╬═══════════╬═════════╬════════════╣
║ 2020-12-8 ║ toyota ║ 0 ║ 1 ║
║───────────┼───────────┼─────────┼────────────║
║ 2020-12-8 ║ toyota ║ 1 ║ 0 ║
║───────────┼───────────┼─────────┼────────────║
║ 2020-12-8 ║ toyota ║ 1 ║ 2 ║
║───────────┼───────────┼─────────┼────────────║
║ 2020-12-7 ║ toyota ║ 0 ║ 2 ║
║───────────┼───────────┼─────────┼────────────║
║ 2020-12-7 ║ toyota ║ 0 ║ 1 ║
║───────────┼───────────┼─────────┼────────────║
║ 2020-12-8 ║ honda ║ 1 ║ 2 ║
║───────────┼───────────┼─────────┼────────────║
║ 2020-12-8 ║ honda ║ 2 ║ 1 ║
║───────────┼───────────┼─────────┼────────────║
║ 2020-12-7 ║ honda ║ 0 ║ 1 ║
║───────────┼───────────┼─────────┼────────────║
║ 2020-12-7 ║ honda ║ 1 ║ 2 ║
║───────────┼───────────┼─────────┼────────────║
║ 2020-12-7 ║ honda ║ 2 ║ 1 ║
╚═══════════╩═══════════╩═════════╩════════════╝
</pre>

**Expected Output:**

<pre class="ql-syntax" spellcheck="false">╔═══════════╦═════════════╦══════════════╦═════════════════╗
║ date_id ║ make_name ║ unique_leads ║ unique_partners ║
╠═══════════╬═════════════╬══════════════╬═════════════════╣
║ 2020-12-7 ║ honda ║ 3 ║ 2 ║
║───────────┼─────────────┼──────────────┼─────────────────║
║ 2020-12-7 ║ toyota ║ 1 ║ 2 ║
║───────────┼─────────────┼──────────────┼─────────────────║
║ 2020-12-8 ║ honda ║ 2 ║ 2 ║
║───────────┼─────────────┼──────────────┼─────────────────║
║ 2020-12-8 ║ toyota ║ 2 ║ 3 ║
╚═══════════╩═════════════╩══════════════╩═════════════════╝
</pre><p>

**Explanation:** </p>For each group:

Count how many distinct lead_ids and partner_ids occurred on that date for that car make.

Example: For 2020-12-8, toyota has leads [0, 1] and partners [0, 1, 2] → counts = 2, 3.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
