# [Non-Referred Customers](https://takeuforward.org/plus/sql-data-engineering-foundations/querying-essentials/non-referred-customers?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company has a customer referral program, where existing customers can refer new customers to the platform. Each customer record includes the referee_id, which indicates who referred them.

The company maintains a table named **Customer** to store customer details.

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ &nbsp; Type &nbsp; ║
╠═════════════╬══════════╣
║ &nbsp; &nbsp; id &nbsp; &nbsp; &nbsp;║ &nbsp; int &nbsp; &nbsp;║
║─────────────┼──────────║
║ &nbsp; &nbsp;name &nbsp; &nbsp; ║ &nbsp;varchar&nbsp;║
║─────────────┼──────────║
║ referee_id &nbsp;║ &nbsp; int &nbsp; &nbsp;║
╚═════════════╩══════════╝
</pre>

- *id:* A unique identifier (primary key) for the customer table.
- *name:* The name of the customer.
- *referee_id:* The id of the customer who referred them (can be NULL if they were not referred).

You need to retrieve the names of customers who were **NOT** referred by customer **id = 2** . The output can be in any order.

The sample output format is in the following example.

### Example 1

Example 1:

Customer Table:

<pre class="ql-syntax" spellcheck="false">╔══════════╦══════════╦════════════╗
║ &nbsp; &nbsp;id &nbsp; &nbsp;║ &nbsp; name &nbsp; ║ referee_id ║
╠══════════╬══════════╬════════════╣
║ &nbsp; &nbsp;1 &nbsp; &nbsp; ║ &nbsp;Alice &nbsp; ║ &nbsp; &nbsp;NULL &nbsp; &nbsp;║
║──────────┼──────────┼────────────║
║ &nbsp; &nbsp;2 &nbsp; &nbsp; ║ &nbsp;Daniel &nbsp;║ &nbsp; &nbsp;NULL &nbsp; &nbsp;║
║──────────┼──────────┼────────────║
║ &nbsp; &nbsp;3 &nbsp; &nbsp; ║ &nbsp;James &nbsp; ║ &nbsp; &nbsp; 2 &nbsp; &nbsp; &nbsp;║
║──────────┼──────────┼────────────║
║ &nbsp; &nbsp;4 &nbsp; &nbsp; ║ &nbsp;Sarah &nbsp; ║ &nbsp; &nbsp;NULL &nbsp; &nbsp;║
║──────────┼──────────┼────────────║
║ &nbsp; &nbsp;5 &nbsp; &nbsp; ║ &nbsp;Kevin &nbsp; ║ &nbsp; &nbsp; 1 &nbsp; &nbsp; &nbsp;║
║──────────┼──────────┼────────────║
║ &nbsp; &nbsp;6 &nbsp; &nbsp; ║ &nbsp;Robert &nbsp;║ &nbsp; &nbsp; 2 &nbsp; &nbsp; &nbsp;║
╚══════════╩══════════╩════════════╝
</pre>

Output:

<pre class="ql-syntax" spellcheck="false">╔══════════╗
║ &nbsp; name &nbsp; ║
╠══════════╣
║ &nbsp;Alice &nbsp; ║
║──────────║
║ &nbsp;Daniel &nbsp;║
║──────────║
║ &nbsp;Sarah &nbsp; ║
║──────────║
║ &nbsp;Kevin &nbsp; ║
╚══════════╝
</pre>

<p>

**Explanation:** </p>
- Alice,&nbsp;Daniel,&nbsp;Sarah, and&nbsp;Kevin&nbsp;are included in the output because they were&nbsp;not referred by customer&nbsp;id = 2.
- James&nbsp;and&nbsp;Robert&nbsp;are excluded because they were referred by customer&nbsp;id = 2.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
