# [Filter Records Excluding a Specific Pattern](https://takeuforward.org/plus/sql-data-engineering-foundations/querying-essentials/filter-records-excluding-a-specific-pattern?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company stores customer email addresses and wants to identify users who are NOT using a particular email domain.

This helps the analytics team understand external user distribution.

Table: Users

<pre class="ql-syntax" spellcheck="false">╔══════════╦══════════╗
║ Column ║ Type ║
╠══════════╬══════════╣
║ user_id ║ int ║
║──────────┼──────────║
║ name ║ varchar ║
║──────────┼──────────║
║ email ║ varchar ║
╚══════════╩══════════╝
</pre>
- user_id is the primary key.
- Each row represents one user and their registered email.

Write an SQL query to return all users whose email does NOT end with @gmail.com.

Return: user_id | name | email

Result can be returned in any order.

### Example 1

Input:

Users:

<pre class="ql-syntax" spellcheck="false">╔══════════╦══════════╦═══════════════════╗
║ user_id ║ name ║ email ║
╠══════════╬══════════╬═══════════════════╣
║ 1 ║ Aarav ║ aarav@gmail.com ║
║──────────┼──────────┼───────────────────║
║ 2 ║ Neha ║ neha@yahoo.com ║
║──────────┼──────────┼───────────────────║
║ 3 ║ Rohan ║ rohan@gmail.com ║
║──────────┼──────────┼───────────────────║
║ 4 ║ Meera ║ meera@outlook.com ║
╚══════════╩══════════╩═══════════════════╝
</pre>

Output:

<pre class="ql-syntax" spellcheck="false">╔══════════╦══════════╦═══════════════════╗
║ user_id ║ name ║ email ║
╠══════════╬══════════╬═══════════════════╣
║ 2 ║ Neha ║ neha@yahoo.com ║
║──────────┼──────────┼───────────────────║
║ 4 ║ Meera ║ meera@outlook.com ║
╚══════════╩══════════╩═══════════════════╝
</pre>

Explanation:

- Emails ending with @gmail.com are excluded.
- Only non-gmail users remain.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
