# [Highest Non-Repeating Number](https://takeuforward.org/plus/sql-data-engineering-foundations/subqueries/highest-non-repeating-number?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

In a data analytics task, you're given a list of integers that may contain duplicates.

You're given a table MyNumbers with one column:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ num ║ int ║
╚═════════════╩══════════╝
</pre>

- num: an integer (may be repeated across rows).

Write an SQL query to find the largest number that occurs only once in the MyNumbers table. If no such number exists, return NULL.

### Example 1

Example 1:

<pre class="ql-syntax" spellcheck="false">MyNumbers Table:
╔═════╗
║ num ║
╠═════╣
║ 8 ║
║ 8 ║
║ 3 ║
║ 3 ║
║ 1 ║
║ 4 ║
║ 5 ║
║ 6 ║
╚═════╝
</pre>Output:

<pre class="ql-syntax" spellcheck="false">╔═════╗
║ num ║
╠═════╣
║ 6 ║
╚═════╝
</pre>Explanation: Numbers that appear once: 1, 4, 5, 6. Largest = 6.

### Example 2

Example 2:

<pre class="ql-syntax" spellcheck="false">MyNumbers Table:
╔═════╗
║ num ║
╠═════╣
║ 8 ║
║ 8 ║
║ 7 ║
║ 7 ║
║ 3 ║
║ 3 ║
║ 3 ║
╚═════╝
</pre>Output:

<pre class="ql-syntax" spellcheck="false">╔══════╗
║ num ║
╠══════╣
║ null ║
╚══════╝
</pre>Explanation: Every number appears more than once => result is NULL.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
