# [Email Duplicates](https://takeuforward.org/plus/sql-data-engineering-foundations/aggregation-and-analysis/email-duplicates?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

In user account systems, duplicate email registrations can lead to confusion, security issues, or data corruption. Detecting these duplicates is essential for maintaining data integrity, ensuring unique logins, and preventing fraudulent registrations.

You are given a **Person** table:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ id ║ int ║
║─────────────┼──────────║
║ email ║ varchar ║
╚═════════════╩══════════╝
</pre>

- **id** : A unique identifier for the user.
- **email** : The email address registered. The emails will not contain uppercase letters.

Write a query to find all duplicate email addresses from the table. It is guaranteed that the email field is never NULL. The result can be returned in any order.

### Example 1

**Example:**

<p>

**Input:** </p>Person Table:

<pre class="ql-syntax" spellcheck="false">╔════╦═════════╗
║ id ║ email ║
╠════╬═════════╣
║ 1 ║ a@b.com ║
║────┼─────────║
║ 2 ║ c@d.com ║
║────┼─────────║
║ 3 ║ a@b.com ║
╚════╩═════════╝
</pre>

<p>

**Output:** </p><pre class="ql-syntax" spellcheck="false">╔═════════╗
║ email ║
╠═════════╣
║ a@b.com ║
╚═════════╝
</pre>

<p>

**Explanation:** </p>
- **a@b.com** appears **twice** , which qualifies it as a duplicate.
- **c@d.com** appears only once, so it's excluded.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
