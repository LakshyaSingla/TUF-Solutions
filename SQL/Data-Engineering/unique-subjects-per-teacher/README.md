# [Unique Subjects per Teacher](https://takeuforward.org/plus/sql-data-engineering-foundations/aggregation-and-analysis/unique-subjects-per-teacher?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

At a university, teachers may teach the same subject in multiple departments, but for reporting purposes, the administration wants to know how many distinct subjects each teacher is responsible for, regardless of department.

You are given a **Teacher** table with the following columns:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column name ║ Type ║
╠═════════════╬══════════╣
║ teacher_id ║ int ║
║─────────────┼──────────║
║ subject_id ║ int ║
║─────────────┼──────────║
║ dept_id ║ int ║
╚═════════════╩══════════╝
</pre>
- teacher_id: The ID of the teacher.
- subject_id: The ID of the subject being taught.
- dept_id: The department in which the subject is being taught.

(subject_id, dept_id) is the primary key of this table. Each row shows that a teacher teaches a specific subject in a department.

**Write an SQL query to return the number of unique subjects taught by each teacher** . The result can be returned in any order.

### Example 1

**Example Input:**

<pre class="ql-syntax" spellcheck="false">Teacher Table
╔════════════╦════════════╦══════════╗
║ teacher_id ║ subject_id ║ dept_id ║
╠════════════╬════════════╬══════════╣
║ 1 ║ 2 ║ 3 ║
║ 1 ║ 2 ║ 4 ║
║ 1 ║ 3 ║ 3 ║
║ 2 ║ 1 ║ 1 ║
║ 2 ║ 2 ║ 1 ║
║ 2 ║ 3 ║ 1 ║
║ 2 ║ 4 ║ 1 ║
╚════════════╩════════════╩══════════╝
</pre>

<p>

**Output:** </p><pre class="ql-syntax" spellcheck="false">╔════════════╦═════╗
║ teacher_id ║ cnt ║
╠════════════╬═════╣
║ 1 ║ 2 ║
║ 2 ║ 4 ║
╚════════════╩═════╝
</pre>

<p>

**Explanation:** </p>
- **Teacher 1** : Teaches subject 2 in departments 3 and 4 (counted once) and subject 3 in department 3 → Total = 2 unique subjects
- **Teacher 2** : Teaches subjects 1, 2, 3, 4 → All unique → Total = 4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
