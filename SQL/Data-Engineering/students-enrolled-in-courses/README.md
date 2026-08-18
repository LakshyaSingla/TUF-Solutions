# [Students Enrolled in Courses](https://takeuforward.org/plus/sql-data-engineering-foundations/sql-joins/students-enrolled-in-courses?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

An online education platform wants to list students along with the courses they are enrolled in. You are given two tables Students and Enrollments. Both tables share a common column named student_id.

Table: Students

<pre class="ql-syntax" spellcheck="false">╔════════════╦══════════╗
║ Column ║ Type ║
╠════════════╬══════════╣
║ student_id ║ int ║
║────────────┼──────────║
║ name ║ varchar ║
╚════════════╩══════════╝
</pre>
- student_id is the primary key.

Table: Enrollments

<pre class="ql-syntax" spellcheck="false">╔════════════╦══════════╗
║ Column ║ Type ║
╠════════════╬══════════╣
║ student_id ║ int ║
║────────────┼──────────║
║ course ║ varchar ║
╚════════════╩══════════╝
</pre>
- Each row represents a student enrolled in a course.

Write an SQL query using NATURAL JOIN only to return:

- name
- course

Return the result in any order.

### Example 1

Input:

Students:

<pre class="ql-syntax" spellcheck="false">╔════════════╦══════════╗
║ student_id ║ name ║
╠════════════╬══════════╣
║ 1 ║ Aarav ║
║────────────┼──────────║
║ 2 ║ Neha ║
║────────────┼──────────║
║ 3 ║ Rohan ║
╚════════════╩══════════╝
</pre>

Enrollments:

<pre class="ql-syntax" spellcheck="false">╔════════════╦═══════════╗
║ student_id ║ course ║
╠════════════╬═══════════╣
║ 1 ║ Math ║
║────────────┼───────────║
║ 1 ║ Physics ║
║────────────┼───────────║
║ 3 ║ Chemistry ║
╚════════════╩═══════════╝
</pre>

Output:

<pre class="ql-syntax" spellcheck="false">╔══════════╦═══════════╗
║ name ║ course ║
╠══════════╬═══════════╣
║ Aarav ║ Math ║
║──────────┼───────────║
║ Aarav ║ Physics ║
║──────────┼───────────║
║ Rohan ║ Chemistry ║
╚══════════╩═══════════╝
</pre>

Explanation:

Neha has no enrollment, so she is excluded.

Only matching student_id values appear.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
