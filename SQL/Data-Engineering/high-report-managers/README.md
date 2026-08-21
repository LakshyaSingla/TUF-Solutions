# [High-Report Managers](https://takeuforward.org/plus/sql-data-engineering-foundations/subqueries/high-report-managers?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

A company’s HR system keeps track of employees and their reporting structure. The management wants to identify managers who have at least 5 employees directly reporting to them.

The company maintains an **Employee** table that stores:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║&nbsp; &nbsp;Type&nbsp; &nbsp;║
╠═════════════╬══════════╣
║&nbsp; &nbsp; &nbsp;id&nbsp; &nbsp; &nbsp; ║&nbsp; &nbsp;int&nbsp; &nbsp; ║
║─────────────┼──────────║
║&nbsp; &nbsp; name&nbsp; &nbsp; &nbsp;║ varchar&nbsp; ║
║─────────────┼──────────║
║ department&nbsp; ║ varchar&nbsp; ║
║─────────────┼──────────║
║&nbsp; managerld&nbsp; ║&nbsp; &nbsp;int&nbsp; &nbsp; ║
╚═════════════╩══════════╝
</pre>

- *id:* A unique identifier (primary key) for each employee.
- *name* : The name of the employee.
- *department* : The department in which the employee works.
- *managerId:* The id of the employee’s direct manager (NULL if the employee has no manager).

Your task is to find all managers who have 5 or more employees directly reporting to them.

The result should be returned in any order.

The sample output format is in the following example.

### Example 1

Input:

**Employee Table**

<pre class="ql-syntax" spellcheck="false">╔══════════╦══════════╦════════════╦═══════════╗
║&nbsp; &nbsp;Id&nbsp; &nbsp; &nbsp;║&nbsp; &nbsp;name&nbsp; &nbsp;║ department ║ managerId ║
╠══════════╬══════════╬════════════╬═══════════╣
║&nbsp; &nbsp;101&nbsp; &nbsp; ║&nbsp; Emily &nbsp;║&nbsp; &nbsp; &nbsp;A&nbsp; &nbsp; &nbsp; ║&nbsp; &nbsp;Null&nbsp; &nbsp; ║
║──────────┼──────────┼────────────┼───────────║
║&nbsp; &nbsp;102&nbsp; &nbsp; ║&nbsp; &nbsp;Jak&nbsp; &nbsp; ║&nbsp; &nbsp; &nbsp;A&nbsp; &nbsp; &nbsp; ║&nbsp; &nbsp; 101&nbsp; &nbsp; ║
║──────────┼──────────┼────────────┼───────────║
║&nbsp; &nbsp;10^3&nbsp; &nbsp; ║&nbsp; Olive&nbsp; &nbsp;║&nbsp; &nbsp; &nbsp;A&nbsp; &nbsp; &nbsp; ║&nbsp; &nbsp; 101&nbsp; &nbsp; ║
║──────────┼──────────┼────────────┼───────────║
║&nbsp; &nbsp;10^4&nbsp; &nbsp; ║&nbsp; &nbsp;Emy&nbsp; &nbsp; ║&nbsp; &nbsp; &nbsp;A&nbsp; &nbsp; &nbsp; ║&nbsp; &nbsp; 101&nbsp; &nbsp; ║
║──────────┼──────────┼────────────┼───────────║
║&nbsp; &nbsp;10^5&nbsp; &nbsp; ║&nbsp; &nbsp;Liam&nbsp; &nbsp;║&nbsp; &nbsp; &nbsp;A&nbsp; &nbsp; &nbsp; ║&nbsp; &nbsp; 101&nbsp; &nbsp; ║
║──────────┼──────────┼────────────┼───────────║
║&nbsp; &nbsp;10^6&nbsp; &nbsp; ║&nbsp; &nbsp;Lie&nbsp; &nbsp; ║&nbsp; &nbsp; &nbsp;B&nbsp; &nbsp; &nbsp; ║&nbsp; &nbsp; 101&nbsp; &nbsp; ║
╚══════════╩══════════╩════════════╩═══════════╝
</pre>

<strong style="color: rgb(229, 231, 235);">Output:</strong>

<pre class="ql-syntax" spellcheck="false">╔══════════╗
║&nbsp; &nbsp;name&nbsp; &nbsp;║
╠══════════╣
║&nbsp; Emily&nbsp; &nbsp;║
╚══════════╝
</pre>

<p>

**Explanation:** </p>
- Emily (id = 101) - Has 5 direct reports (102, 10^3, 10^4, 10^5, 10^6), so he is included.
- Jak (id = 102), Olive (id = 10^3), Emy (id = 10^4), Liam (id = 10^5), Lie (id = 10^6) - None of them have 5 or more reports, so they are excluded.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
