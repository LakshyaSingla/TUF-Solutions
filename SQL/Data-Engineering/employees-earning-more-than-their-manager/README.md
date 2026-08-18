# [Employees Earning More Than Their Manager](https://takeuforward.org/plus/sql-data-engineering-foundations/sql-joins/employees-earning-more-than-their-manager?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company wants to identify employees whose salary is higher than their direct manager’s salary to review compensation structure.

Table: Employees

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ employee_id ║ int ║
║─────────────┼──────────║
║ name ║ varchar ║
║─────────────┼──────────║
║ salary ║ int ║
║─────────────┼──────────║
║ manager_id ║ int ║
╚═════════════╩══════════╝
</pre>
- employee_id is the primary key.
- manager_id refers to another employee.
- The top manager has manager_id = NULL.

Write an SQL query to return the names of employees whose salary is strictly greater than their manager’s salary. Return the result in any order.

### Example 1

Input:

Employees:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╦══════════╦════════════╗
║ employee_id ║ name ║ salary ║ manager_id ║
╠═════════════╬══════════╬══════════╬════════════╣
║ 1 ║ Ritesh ║ 90000 ║ NULL ║
║─────────────┼──────────┼──────────┼────────────║
║ 2 ║ Ananya ║ 95000 ║ 1 ║
║─────────────┼──────────┼──────────┼────────────║
║ 3 ║ Mohit ║ 85000 ║ 1 ║
║─────────────┼──────────┼──────────┼────────────║
║ 4 ║ Kunal ║ 97000 ║ 2 ║
╚═════════════╩══════════╩══════════╩════════════╝
</pre>

Output:

<pre class="ql-syntax" spellcheck="false">╔══════════╗
║ name ║
╠══════════╣
║ Ananya ║
║──────────║
║ Kunal ║
╚══════════╝
</pre>

Explanation:

- Ananya (95000) > Ritesh (90000), included
- Mohit (85000) < Ritesh (90000), excluded
- Kunal (97000) > Ananya (95000), included

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
