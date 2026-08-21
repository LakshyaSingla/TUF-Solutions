# [Find the First Device Logged In by Each Player](https://takeuforward.org/plus/sql-data-engineering-foundations/subqueries/find-the-first-device-logged-in-by-each-player?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

We have a table named **Activity** that records the activity of players using various devices to play games.

**Table: Activity**

<pre class="ql-syntax" spellcheck="false">╔══════════════╦═════════╗
║ Column Name ║ Type ║
╠══════════════╬═════════╣
║ player_id ║ int ║
║──────────────┼─────────║
║ device_id ║ int ║
║──────────────┼─────────║
║ event_date ║ date ║
║──────────────┼─────────║
║ games_played ║ int ║
╚══════════════╩═════════╝
</pre>

( **player_id** , **event_date** ) is the primary key (combination of columns with unique values) for this table.

This table shows the activity of players of some games. Each row represents a record of a player who logged in and played a number of games (possibly 0) before logging out on a specific date using some device.

**Your task is to report the device that was first logged in for each player.**

Return the result table ordered by player_id and device_id in ascending order.

### Example 1

**Example**

<p>

**Input:** </p>

**Activity table:**

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

<p>

**Output:** </p><pre class="ql-syntax" spellcheck="false">╔═══════════╦═══════════╗
║ player_id ║ device_id ║
╠═══════════╬═══════════╣
║ 1 ║ 2 ║
║───────────┼───────────║
║ 2 ║ 3 ║
║───────────┼───────────║
║ 3 ║ 1 ║
╚═══════════╩═══════════╝
</pre>

<p>

**Explanation:** </p>For player_id = 1, the first login device is device_id = 2 on 2016-03-01.

For player_id = 2, the first login device is device_id = 3 on 2017-06-25.

For player_id = 3, the first login device is device_id = 1 on 2016-03-02.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
