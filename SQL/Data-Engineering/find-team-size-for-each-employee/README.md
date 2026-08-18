# [Find Team Size for Each Employee](https://takeuforward.org/plus/sql-data-engineering-foundations/sql-joins/find-team-size-for-each-employee?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

We have a table named **Employee** that contains the information about employees and their respective teams.

**Table: Employee**

<pre class="ql-syntax" spellcheck="false">+---------------+---------+
| Column Name | Type |
+---------------+---------+
| employee_id | int |
| team_id | int |
+---------------+---------+
</pre>
- employee_id is the primary key (a unique column) for this table.
- Each row in this table contains the employee_id of an employee and their team_id.

**Task:**

Your task is to write a query that returns the employee_id and their respective team size (number of employees in the same team).

Return the result table in ascending order by employee_id.

### Example 1

**Example:**

<p>

**Input:** </p>Employee Table:

<pre class="ql-syntax" spellcheck="false">+-------------+------------+
| employee_id | team_id |
+-------------+------------+
| 1 | 8 |
| 2 | 8 |
| 3 | 8 |
| 4 | 7 |
| 5 | 9 |
| 6 | 9 |
+-------------+------------+
</pre>

<p>

**Output:** </p><pre class="ql-syntax" spellcheck="false">+-------------+------------+
| employee_id | team_size |
+-------------+------------+
| 1 | 3 |
| 2 | 3 |
| 3 | 3 |
| 4 | 1 |
| 5 | 2 |
| 6 | 2 |
+-------------+------------+
</pre>

<p>

**Explanation:** </p>
- Employees with IDs 1, 2, and 3 belong to the same team (team_id = 8) and hence their team size is 3.
- Employee with ID 4 belongs to a team with team_id = 7, so their team size is 1.
- Employees with IDs 5 and 6 belong to the same team (team_id = 9), so their team size is 2.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
