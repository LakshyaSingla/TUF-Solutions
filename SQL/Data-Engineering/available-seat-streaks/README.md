# [Available Seat Streaks](https://takeuforward.org/plus/sql-data-engineering-foundations/sql-joins/available-seat-streaks?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A cinema manager wants to improve the booking experience for users who prefer sitting together.

You are given a table named **Cinema** :

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ seat_id ║ int ║
║─────────────┼──────────║
║ free ║ bool ║
╚═════════════╩══════════╝
</pre>

- **seat_id:** Unique identifier for the seat (auto-incremented, meaning it increases automatically by 1 for each row)
- **free:** Indicates whether the seat is free (1) or occupied (0)

Write a query to identify all seats that are part of any group of consecutive available seats. Return the result ordered by seat_id in ascending order.

The test cases are designed to ensure that there are at least three consecutive available seats.

### Example 1

**Example:**

<p>

**Input:** </p>

Cinema

<pre class="ql-syntax" spellcheck="false">╔═════════╦══════╗
║ seat_id ║ free ║
╠═════════╬══════╣
║ 1 ║ 1 ║
║─────────┼──────║
║ 2 ║ 0 ║
║─────────┼──────║
║ 3 ║ 1 ║
║─────────┼──────║
║ 4 ║ 1 ║
║─────────┼──────║
║ 5 ║ 1 ║
╚═════════╩══════╝
</pre>

**Expected Output:**

<pre class="ql-syntax" spellcheck="false">╔═════════╗
║ seat_id ║
╠═════════╣
║ 3 ║
║─────────║
║ 4 ║
║─────────║
║ 5 ║
╚═════════╝
</pre>

<p>

**Explanation:** </p>
- **Seat 1** is free but not adjacent to any other free seat.
- **Seat 3** is followed by free seat 4 → included.
- **Seat 4** is between two free seats → included.
- **Seat 5** is preceded by free seat 4 → included.

Hence, only seats 3, 4, and 5 qualify.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
