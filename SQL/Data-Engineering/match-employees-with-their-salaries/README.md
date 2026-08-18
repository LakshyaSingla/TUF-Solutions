# [Match Employees With Their Salaries](https://takeuforward.org/plus/sql-data-engineering-foundations/sql-joins/match-employees-with-their-salaries?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company stores employee details and salary information in two separate tables.

Only employees who have a corresponding salary record should appear in the final report.

Table: Employees

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ employee_id ║ int ║
║─────────────┼──────────║
║ name ║ varchar ║
╚═════════════╩══════════╝
</pre>
- employee_id is the primary key.
- Each row represents one employee.

Table: Salaries

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ employee_id ║ int ║
║─────────────┼──────────║
║ salary ║ int ║
╚═════════════╩══════════╝
</pre>
- employee_id is the primary key.
- Each row represents a salary record.

Write an SQL query using ONLY IMPLICIT JOIN syntax to return employees who have salary records.

Return:

- employee_id
- name
- salary

The result can be returned in any order.

### Example 1

Input:

Employees:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ employee_id ║ name ║
╠═════════════╬══════════╣
║ 1 ║ Aarav ║
║─────────────┼──────────║
║ 2 ║ Neha ║
║─────────────┼──────────║
║ 3 ║ Rohan ║
╚═════════════╩══════════╝
</pre>

Salaries:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ employee_id ║ salary ║
╠═════════════╬══════════╣
║ 1 ║ 50000 ║
║─────────────┼──────────║
║ 3 ║ 60000 ║
╚═════════════╩══════════╝
</pre>

Output:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╦══════════╗
║ employee_id ║ name ║ salary ║
╠═════════════╬══════════╬══════════╣
║ 1 ║ Aarav ║ 50000 ║
║─────────────┼──────────┼──────────║
║ 3 ║ Rohan ║ 60000 ║
╚═════════════╩══════════╩══════════╝
</pre>

Explanation:

Neha has no salary record, so she is excluded.

Only rows where employee_id matches in both tables are returned.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
