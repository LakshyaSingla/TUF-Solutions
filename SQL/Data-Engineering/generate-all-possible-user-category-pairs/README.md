# [Generate All Possible User-Category Pairs](https://takeuforward.org/plus/sql-data-engineering-foundations/sql-joins/generate-all-possible-user-category-pairs?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A recommendation system wants to precompute all possible combinations of users and content categories so that personalized suggestions can later be applied.

Table: Users

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ user_id ║ int ║
║─────────────┼──────────║
║ name ║ varchar ║
╚═════════════╩══════════╝
</pre>
- user_id is the primary key.
- Each row represents a registered user.

Table: Categories

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ category_id ║ int ║
║─────────────┼──────────║
║ category ║ varchar ║
╚═════════════╩══════════╝
</pre>
- category_id is the primary key.
- Each row represents a content category.

Write an SQL query to generate all possible combinations of users and categories. The result can be returned in any order.

### Example 1

Input:

Users:

<pre class="ql-syntax" spellcheck="false">╔══════════╦══════════╗
║ user_id ║ name ║
╠══════════╬══════════╣
║ 1 ║ Aarav ║
║──────────┼──────────║
║ 2 ║ Neha ║
╚══════════╩══════════╝
</pre>

Categories:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ category_id ║ category ║
╠═════════════╬══════════╣
║ 10 ║ Sports ║
║─────────────┼──────────║
║ 20 ║ Music ║
╚═════════════╩══════════╝
</pre>

Output:

<pre class="ql-syntax" spellcheck="false">╔══════════╦══════════╦═════════════╦══════════╗
║ user_id ║ name ║ category_id ║ category ║
╠══════════╬══════════╬═════════════╬══════════╣
║ 1 ║ Aarav ║ 10 ║ Sports ║
║──────────┼──────────┼─────────────┼──────────║
║ 1 ║ Aarav ║ 20 ║ Music ║
║──────────┼──────────┼─────────────┼──────────║
║ 2 ║ Neha ║ 10 ║ Sports ║
║──────────┼──────────┼─────────────┼──────────║
║ 2 ║ Neha ║ 20 ║ Music ║
╚══════════╩══════════╩═════════════╩══════════╝
</pre>Explanation

There are 2 users and 2 categories, so total rows = 2 × 2 = 4.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
