# [Employee Salary](https://takeuforward.org/plus/sql-data-engineering-foundations/data-modification-and-schema-evolution/employee-salary?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company stores employee details in an Employees table. After a performance review, the HR team decided to give a salary hike to employees working in a specific department.

Table: Employees

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ employee_id ║ int ║
║─────────────┼──────────║
║ name ║ varchar ║
║─────────────┼──────────║
║ department ║ varchar ║
║─────────────┼──────────║
║ salary ║ int ║
╚═════════════╩══════════╝
</pre>
- employee_id is the primary key.
- Each row represents one employee.

Existing Data

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╦═════════════╦══════════╗
║ employee_id ║ name ║ department ║ salary ║
╠═════════════╬══════════╬═════════════╬══════════╣
║ 1 ║ Aarav ║ Engineering ║ 70000 ║
║─────────────┼──────────┼─────────────┼──────────║
║ 2 ║ Neha ║ HR ║ 50000 ║
║─────────────┼──────────┼─────────────┼──────────║
║ 3 ║ Rohan ║ Engineering ║ 80000 ║
║─────────────┼──────────┼─────────────┼──────────║
║ 4 ║ Meera ║ Finance ║ 65000 ║
╚═════════════╩══════════╩═════════════╩══════════╝
</pre>Increase the salary of all employees in the Engineering department by 10,000. Only employees belonging to Engineering should be updated.

### Example 1

Output (After Update)

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╦═════════════╦══════════╗
║ employee_id ║ name ║ department ║ salary ║
╠═════════════╬══════════╬═════════════╬══════════╣
║ 1 ║ Aarav ║ Engineering ║ 80000 ║
║─────────────┼──────────┼─────────────┼──────────║
║ 2 ║ Neha ║ HR ║ 50000 ║
║─────────────┼──────────┼─────────────┼──────────║
║ 3 ║ Rohan ║ Engineering ║ 90000 ║
║─────────────┼──────────┼─────────────┼──────────║
║ 4 ║ Meera ║ Finance ║ 65000 ║
╚═════════════╩══════════╩═════════════╩══════════╝
</pre>

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
