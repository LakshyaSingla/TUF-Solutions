# [Table Join Operation](https://takeuforward.org/plus/sql-data-engineering-foundations/sql-joins/table-join-operation?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

You are building a system that displays personal and address information for users. However, not all users have addresses on file. You need to return their first name, last name, city, and state, ensuring that if no address exists, you still return the user with null values for city and state.

You are building a system that displays personal and address information for users. However, not all users have addresses on file.&nbsp;You are given two tables:

Person:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ personId ║ int ║
║─────────────┼──────────║
║ firstName ║ varchar ║
║─────────────┼──────────║
║ lastName ║ varchar ║
╚═════════════╩══════════╝
</pre>
- Contains personal information (personId, firstName, lastName).
- personId is the primary key.

Address:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ addressId ║ int ║
║─────────────┼──────────║
║ personId ║ int ║
║─────────────┼──────────║
║ city ║ varchar ║
║─────────────┼──────────║
║ state ║ varchar ║
╚═════════════╩══════════╝
</pre>
- Contains address information (personId, city, state).
- addressId is the primary key.

Additionally, Order the result by firstName in ascending order. If multiple users have the same first name, order them by lastName in ascending order.

### Example 1

Example:

Input:

Person:

<pre class="ql-syntax" spellcheck="false">╔══════════╦══════════╦═══════════╗
║ personId ║ lastName ║ firstName ║
╠══════════╬══════════╬═══════════╣
║ 1 ║ Wang ║ Allen ║
║──────────┼──────────┼───────────║
║ 2 ║ Alice ║ Bob ║
╚══════════╩══════════╩═══════════╝
</pre>Address:

<pre class="ql-syntax" spellcheck="false">╔═══════════╦══════════╦═══════════════╦════════════╗
║ addressId ║ personId ║ city ║ state ║
╠═══════════╬══════════╬═══════════════╬════════════╣
║ 1 ║ 2 ║ New York City ║ New York ║
║───────────┼──────────┼───────────────┼────────────║
║ 2 ║ 3 ║ San Jose ║ California ║
╚═══════════╩══════════╩═══════════════╩════════════╝
</pre>Output:

<pre class="ql-syntax" spellcheck="false">╔═══════════╦══════════╦═══════════════╦══════════╗
║ firstName ║ lastName ║ city ║ state ║
╠═══════════╬══════════╬═══════════════╬══════════╣
║ Allen ║ Wang ║ NULL ║ NULL ║
║───────────┼──────────┼───────────────┼──────────║
║ Bob ║ Alice ║ New York City ║ New York ║
╚═══════════╩══════════╩═══════════════╩══════════╝
</pre>Explanation:

- Allen (personId 1) = No match in Address, still shown with null for city/state.
- Bob (personId 2) = Match found, City and state included.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
