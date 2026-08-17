# [System Settings](https://takeuforward.org/plus/sql-data-engineering-foundations/data-modification-and-schema-evolution/system-settings?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company stores its application configuration settings in a database table named SystemSettings.

Each setting can be active or inactive.

Due to a system-wide policy change, the company has decided to deactivate all configuration settings, regardless of their current status.

Table: SystemSettings

<pre class="ql-syntax" spellcheck="false">╔══════════════╦══════════╗
║ Column Name ║ Type ║
╠══════════════╬══════════╣
║ setting_id ║ int ║
║──────────────┼──────────║
║ setting_name ║ varchar ║
║──────────────┼──────────║
║ is_active ║ tinyint ║
╚══════════════╩══════════╝
</pre>
- setting_id is the primary key.
- Each row represents a system configuration setting.

Existing Data

<pre class="ql-syntax" spellcheck="false">╔════════════╦════════════════════╦═══════════╗
║ setting_id ║ setting_name ║ is_active ║
╠════════════╬════════════════════╬═══════════╣
║ 1 ║ EmailNotifications ║ 1 ║
║────────────┼────────────────────┼───────────║
║ 2 ║ AutoBackup ║ 1 ║
║────────────┼────────────────────┼───────────║
║ 3 ║ DarkMode ║ 0 ║
╚════════════╩════════════════════╩═══════════╝
</pre>

Write an SQL query that updates the table so that every setting is marked as inactive.

### Example 1

Input (Before Update)

<pre class="ql-syntax" spellcheck="false">╔════════════╦════════════════════╦═══════════╗
║ setting_id ║ setting_name ║ is_active ║
╠════════════╬════════════════════╬═══════════╣
║ 1 ║ EmailNotifications ║ 1 ║
║────────────┼────────────────────┼───────────║
║ 2 ║ AutoBackup ║ 1 ║
║────────────┼────────────────────┼───────────║
║ 3 ║ DarkMode ║ 0 ║
╚════════════╩════════════════════╩═══════════╝
</pre>

Output (After Update)

<pre class="ql-syntax" spellcheck="false">╔════════════╦════════════════════╦═══════════╗
║ setting_id ║ setting_name ║ is_active ║
╠════════════╬════════════════════╬═══════════╣
║ 1 ║ EmailNotifications ║ 0 ║
║────────────┼────────────────────┼───────────║
║ 2 ║ AutoBackup ║ 0 ║
║────────────┼────────────────────┼───────────║
║ 3 ║ DarkMode ║ 0 ║
╚════════════╩════════════════════╩═══════════╝
</pre>Explanation

Since no WHERE clause is used, all rows are updated.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
