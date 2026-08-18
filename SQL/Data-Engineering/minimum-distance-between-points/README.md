# [Minimum Distance Between Points](https://takeuforward.org/plus/sql-data-engineering-foundations/sql-joins/minimum-distance-between-points?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Imagine you're building a mapping or sensor system that tracks positions along a straight line (like the X-axis). For optimization or collision detection, you need to find the **closest two data points** in terms of distance. This is a common operation in spatial analysis and robotics path planning.

You are given a table **Point** :

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ x ║ int ║
╚═════════════╩══════════╝
</pre>

- **x:** X-coordinate of a point on the X-axis. It is the primary key, so all values are unique.

Write a query to find the **shortest distance** between any two points listed in the Point table.

### Example 1

**Example:**

<p>

**Input:** </p>

Point Table

<pre class="ql-syntax" spellcheck="false">╔═════╗
║ x ║
╠═════╣
║ -1 ║
║─────║
║ 0 ║
║─────║
║ 2 ║
╚═════╝
</pre>

**Expected Output:**

<pre class="ql-syntax" spellcheck="false">╔═══════════╗
║ shortest ║
╠═══════════╣
║ 1 ║
╚═══════════╝
</pre>

<p>

**Explanation:** </p>
- **Distances:** |(-1) - 0| = 1, |(-1) - 2| = 3, |0 - 2| = 2
- The minimum distance is 1.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
