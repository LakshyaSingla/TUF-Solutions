# [Large Classes](https://takeuforward.org/plus/sql-data-engineering-foundations/aggregation-and-analysis/large-classes?subject=sql-data-engineering-foundations)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A school wants to identify popular classes that have at least 5 students enrolled. This helps the administration in allocating resources, such as assigning larger classrooms or more teaching assistants.

You are given a **Courses** table with two columns:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column name ║ Type ║
╠═════════════╬══════════╣
║ student ║ varchar ║
║─────────────┼──────────║
║ class ║ varchar ║
╚═════════════╩══════════╝
</pre>

- **student** : The name of a student.
- **class** : The name of the class the student is enrolled in.

Each (student, class) pair is unique. Write an SQL query to find the names of classes where the number of enrolled students is **at least 5** . The result can be returned in any order.

### Example 1

**Example:**

<p>

**Input:** </p> **Courses Table:**

<pre class="ql-syntax" spellcheck="false">╔══════════╦══════════╗
║ student ║ class ║
╠══════════╬══════════╣
║ A ║ Math ║
║ B ║ English ║
║ C ║ Math ║
║ D ║ Biology ║
║ E ║ Math ║
║ F ║ Computer ║
║ G ║ Math ║
║ H ║ Math ║
║ I ║ Math ║
╚══════════╩══════════╝
</pre>

<p>

**Output:** </p><pre class="ql-syntax" spellcheck="false">╔════════╗
║ class ║
╠════════╣
║ Math ║
╚════════╝
</pre>

<p>

**Explanation:** </p>
- Math has 6 students enrolled.
- English, Biology, and Computer each have only 1 student.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
