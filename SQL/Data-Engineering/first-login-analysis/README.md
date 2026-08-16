# [First Login Analysis](https://takeuforward.org/plus/sql-data-engineering-foundations/aggregation-and-analysis/first-login-analysis?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

In any gaming platform, it's important to know when each player first started using the platform. This helps in tracking user lifecycle, cohort analysis, and retention strategies.

You are given a table named **Activity** :

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ player_id ║ int ║
║─────────────┼──────────║
║ device_id ║ int ║
║─────────────┼──────────║
║ event_date ║ date ║
║─────────────┼──────────║
║games_played ║ int ║
╚═════════════╩══════════╝
</pre>

- **player_id:** the unique ID of the player
- **device_id:** the device used to play
- **event_date:** the date of the login
- **games_played:** how many games the player played on that day.
- The primary key is **(player_id, event_date)** . A player can appear only once per day in this table. A player may use multiple devices, but per day only one row is recorded.

Write a query to get the earliest (first) login date for each player. Return the result ordered by player_id.

### Example 1

**Example:**

<p>

**Input:** </p>

Activity Table

<pre class="ql-syntax" spellcheck="false">╔═══════════╦═══════════╦════════════╦══════════════╗
║ player_id ║ device_id ║ event_date ║ games_played ║
╠═══════════╬═══════════╬════════════╬══════════════╣
║ 1 ║ 2 ║ 2016-03-01 ║ 5 ║
║───────────┼───────────┼────────────┼──────────────║
║ 1 ║ 2 ║ 2016-05-02 ║ 6 ║
║───────────┼───────────┼────────────┼──────────────║
║ 2 ║ 3 ║ 2017-06-25 ║ 1 ║
║───────────┼───────────┼────────────┼──────────────║
║ 3 ║ 1 ║ 2016-03-02 ║ 0 ║
║───────────┼───────────┼────────────┼──────────────║
║ 3 ║ 4 ║ 2018-07-03 ║ 5 ║
╚═══════════╩═══════════╩════════════╩══════════════╝
</pre>

**Expected Output:**

<pre class="ql-syntax" spellcheck="false">╔═══════════╦═════════════╗
║ player_id ║ first_login ║
╠═══════════╬═════════════╣
║ 1 ║ 2016-03-01 ║
║───────────┼─────────────║
║ 2 ║ 2017-06-25 ║
║───────────┼─────────────║
║ 3 ║ 2016-03-02 ║
╚═══════════╩═════════════╝
</pre>

<p>

**Explanation:** </p>
- Player 1 logged in on 2016-03-01 and 2016-05-02. Earliest = 2016-03-01
- Player 2 has only one login on 2017-06-25. Earliest = 2017-06-25
- Player 3 logged in on 2016-03-02 and 2018-07-03. Earliest = 2016-03-02

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
