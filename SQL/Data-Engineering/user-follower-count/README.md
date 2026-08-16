# [User Follower Count](https://takeuforward.org/plus/sql-data-engineering-foundations/aggregation-and-analysis/user-follower-count?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

In a social media application, users can follow other users. The system needs to track the number of followers for each user.

You are given a **Followers** table with:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ user_id ║ int ║
║─────────────┼──────────║
║ follower_id ║ int ║
╚═════════════╩══════════╝
</pre>

- **user_id** : ID of the user being followed.
- **follower_id** : ID of the user who follows user_id.
- (user_id, follower_id) is the combination of columns with unique values for this table.

Write an SQL query to count the number of followers for each user, and return the result sorted by user_id in ascending order.

### Example 1

**Example:**

<p>

**Input:** </p>Followers Table

<pre class="ql-syntax" spellcheck="false">╔═════════╦═════════════╗
║ user_id ║ follower_id ║
╠═════════╬═════════════╣
║ 0 ║ 1 ║
║─────────┼─────────────║
║ 1 ║ 0 ║
║─────────┼─────────────║
║ 2 ║ 0 ║
║─────────┼─────────────║
║ 2 ║ 1 ║
╚═════════╩═════════════╝
</pre>

**Expected Output:**

<pre class="ql-syntax" spellcheck="false">╔═════════╦═════════════════╗
║ user_id ║ followers_count ║
╠═════════╬═════════════════╣
║ 0 ║ 1 ║
║─────────┼─────────────────║
║ 1 ║ 1 ║
║─────────┼─────────────────║
║ 2 ║ 2 ║
╚═════════╩═════════════════╝
</pre>

<p>

**Explanation:** </p>
- User 0 has 1 follower: {1}.
- User 1 has 1 follower: {0}.
- User 2 has 2 followers: {0, 1}.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
