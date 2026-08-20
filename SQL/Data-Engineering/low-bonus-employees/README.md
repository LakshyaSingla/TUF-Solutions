# [Low Bonus Employees](https://takeuforward.org/plus/sql-data-engineering-foundations/sql-joins/low-bonus-employees?subject=sql-data-engineering-foundations&tab=editorial)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company maintains an employee database where each employee may receive a performance bonus.

The company wants to identify employees whose bonus is less than a particular amount or those who have not received any bonus at all. Your task is to fetch the employee names and their respective bonuses from the system. The company maintains two tables:

**Employee** table, which contains:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ &nbsp; Type &nbsp; ║
╠═════════════╬══════════╣
║ &nbsp; &nbsp;empId &nbsp; &nbsp;║ &nbsp; int &nbsp; &nbsp;║
║─────────────┼──────────║
║ &nbsp; &nbsp;name &nbsp; &nbsp; ║ varchar &nbsp;║
║─────────────┼──────────║
║ supervisor &nbsp;║ &nbsp; int &nbsp; &nbsp;║
║─────────────┼──────────║
║ &nbsp; salary &nbsp; &nbsp;║ &nbsp; int &nbsp; &nbsp;║
╚═════════════╩══════════╝
</pre>

- *empId* : A unique identifier (primary key) for each employee.
- *name* : The employee’s name.
- *supervisor* : The ID of their manager.
- *salary* : The employee's salary.

**Bonus** table, which contains:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column name ║ &nbsp; Type &nbsp; ║
╠═════════════╬══════════╣
║ &nbsp; &nbsp;empId &nbsp; &nbsp;║ &nbsp; int &nbsp; &nbsp;║
║─────────────┼──────────║
║ &nbsp; &nbsp;bonus &nbsp; &nbsp;║ &nbsp; int &nbsp; &nbsp;║
╚═════════════╩══════════╝
</pre>

- *empId* : A reference (foreign key) to the empId in the Employee table.
- *bonus* : The bonus amount the employee received.

Some employees may not have received a bonus, meaning they do not have a corresponding entry in the Bonus table.

Write an SQL query to retrieve the name of each employee along with their bonus amount. If an employee has not received a bonus, display NULL for the bonus.

Only include employees whose bonus is less than 1000 or who have not received any bonus.

The result should be returned in **any order** .

### Example 1

Example:

Input:

Employee Table:

<pre class="ql-syntax" spellcheck="false">╔══════════╦══════════╦════════════╦══════════╗
║ &nbsp;empId &nbsp; ║ &nbsp; name &nbsp; ║ supervisor ║ &nbsp;salary &nbsp;║
╠══════════╬══════════╬════════════╬══════════╣
║ &nbsp; &nbsp;3 &nbsp; &nbsp; ║ &nbsp;Ethan &nbsp; ║ &nbsp; &nbsp;Null &nbsp; &nbsp;║ &nbsp; 4000 &nbsp; ║
║──────────┼──────────┼────────────┼──────────║
║ &nbsp; &nbsp;1 &nbsp; &nbsp; ║ Sophia &nbsp; ║ &nbsp; &nbsp; 3 &nbsp; &nbsp; &nbsp;║ &nbsp; 1000 &nbsp; ║
║──────────┼──────────┼────────────┼──────────║
║ &nbsp; &nbsp;2 &nbsp; &nbsp; ║ &nbsp; Liam &nbsp; ║ &nbsp; &nbsp; 3 &nbsp; &nbsp; &nbsp;║ &nbsp; 2000 &nbsp; ║
║──────────┼──────────┼────────────┼──────────║
║ &nbsp; &nbsp;4 &nbsp; &nbsp; ║ &nbsp;Olivia &nbsp;║ &nbsp; &nbsp; 3 &nbsp; &nbsp; &nbsp;║ &nbsp; 3000 &nbsp; ║
╚══════════╩══════════╩════════════╩══════════╝
</pre>

Bonus Table:

<pre class="ql-syntax" spellcheck="false">╔══════════╦══════════╗
║ &nbsp;empId &nbsp; ║ &nbsp;bonus &nbsp; ║
╠══════════╬══════════╣
║ &nbsp; &nbsp;2 &nbsp; &nbsp; ║ &nbsp; 500 &nbsp; &nbsp;║
║──────────┼──────────║
║ &nbsp; &nbsp;4 &nbsp; &nbsp; ║ &nbsp; 2000 &nbsp; ║
╚══════════╩══════════╝
</pre>

Output:

<pre class="ql-syntax" spellcheck="false">╔══════════╦══════════╗
║ &nbsp; name &nbsp; ║ &nbsp;bonus &nbsp; ║
╠══════════╬══════════╣
║ &nbsp;Ethan &nbsp; ║ &nbsp; Null &nbsp; ║
║──────────┼──────────║
║ &nbsp;Sophia &nbsp;║ &nbsp; Null &nbsp; ║
║──────────┼──────────║
║ &nbsp; Liam &nbsp; ║ &nbsp; 500 &nbsp; &nbsp;║
╚══════════╩══════════╝
</pre>

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
