# [Employees With Confirmed Salary Records](https://takeuforward.org/plus/sql-data-engineering-foundations/sql-joins/employees-with-confirmed-salary-records?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

An HR system stores employee information and salary details in separate tables. Only employees who have both personal details and salary records are considered valid for payroll processing.

**Table: Employees**

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ employee_id ║ int ║
║─────────────┼──────────║
║ name ║ varchar ║
╚═════════════╩══════════╝
</pre>
- employee_id is the primary key.
- Each row represents an employee.

**Table: Salaries**

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ employee_id ║ int ║
║─────────────┼──────────║
║ salary ║ int ║
╚═════════════╩══════════╝
</pre>
- employee_id is the primary key.
- Each row represents a salary entry.

Write an SQL query to return only those employees who have a salary record.

For each qualifying employee, return:

- employee_id
- name
- salary

The result can be returned in any order.

### Example 1

Example:

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

Explanation

Neha does not have a salary record, so she is excluded.

Only employees present in both tables appear in the output.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
