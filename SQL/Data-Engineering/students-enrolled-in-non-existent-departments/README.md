# [Students Enrolled in Non-Existent Departments](https://takeuforward.org/plus/sql-data-engineering-foundations/sql-joins/students-enrolled-in-non-existent-departments?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

We have two tables: **Departments** and **Students** .

**Table: Departments**

<pre class="ql-syntax" spellcheck="false">╔════════════╦═════════╗
║ Column Name║ Type ║
╠════════════╬═════════╣
║ id ║ int ║
║────────────┼─────────║
║ name ║ varchar ║
╚════════════╩═════════╝
</pre>

The **id** column is the primary key for the **Departments** table. This table contains the information about department IDs at a university.

**Table: Students**

<pre class="ql-syntax" spellcheck="false">╔════════════════╦═════════╗
║ Column Name ║ Type ║
╠════════════════╬═════════╣
║ id ║ int ║
║────────────────┼─────────║
║ name ║ varchar ║
║────────────────┼─────────║
║ department_id ║ int ║
╚════════════════╩═════════╝
</pre>

The **id** column is the primary key for the **Students** table. This table contains information about student IDs and the department IDs they belong to.

**Your task is to find the id and name of all students who are enrolled in departments that no longer exist.**

### Example 1

**Example**

<p>

**Input:** </p>

**Departments table:**

<pre class="ql-syntax" spellcheck="false">╔═════╦═════════════════════════════╗
║ id ║ name ║
╠═════╬═════════════════════════════╣
║ 1 ║ Electrical Engineering ║
║─────┼─────────────────────────────║
║ 7 ║ Computer Engineering ║
║─────┼─────────────────────────────║
║ 13 ║ Business Administration ║
╚═════╩═════════════════════════════╝
</pre>

**Students table:**

<pre class="ql-syntax" spellcheck="false">╔═════╦══════════╦═══════════════╗
║ id ║ name ║ department_id ║
╠═════╬══════════╬═══════════════╣
║ 23 ║ Alice ║ 1 ║
║─────┼──────────┼───────────────║
║ 1 ║ Bob ║ 7 ║
║─────┼──────────┼───────────────║
║ 5 ║ Jennifer ║ 13 ║
║─────┼──────────┼───────────────║
║ 2 ║ John ║ 14 ║
║─────┼──────────┼───────────────║
║ 4 ║ Jasmine ║ 77 ║
║─────┼──────────┼───────────────║
║ 3 ║ Steve ║ 74 ║
║─────┼──────────┼───────────────║
║ 6 ║ Luis ║ 1 ║
║─────┼──────────┼───────────────║
║ 8 ║ Jonathan ║ 7 ║
║─────┼──────────┼───────────────║
║ 7 ║ Daiana ║ 33 ║
║─────┼──────────┼───────────────║
║ 11 ║ Madelynn ║ 1 ║
╚═════╩══════════╩═══════════════╝
</pre>

<p>

**Output:** </p><pre class="ql-syntax" spellcheck="false">╔═════╦═════════╗
║ id ║ name ║
╠═════╬═════════╣
║ 2 ║ John ║
║─────┼─────────║
║ 7 ║ Daiana ║
║─────┼─────────║
║ 4 ║ Jasmine ║
║─────┼─────────║
║ 3 ║ Steve ║
╚═════╩═════════╝
</pre>

<p>

**Explanation:** </p>John, Daiana, Steve, and Jasmine are enrolled in departments 14, 33, 74, and 77 respectively. These departments do not exist in the Departments table.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
