# [Frequent Actor-Director Duos](https://takeuforward.org/plus/sql-data-engineering-foundations/aggregation-and-analysis/frequent-actor-director-duos?subject=sql-data-engineering-foundations&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

In the film industry, analyzing collaborations between actors and directors can help production houses identify successful pairs. These frequent collaborations may reflect strong creative chemistry and successful outcomes.

You are given a **ActorDirector** table:

<pre class="ql-syntax" spellcheck="false">╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ actor_id ║ int ║
║─────────────┼──────────║
║ director_id ║ int ║
║─────────────┼──────────║
║ timestamp ║ int ║
╚═════════════╩══════════╝
</pre>

- **actor_id** : ID of the actor involved in the collaboration
- **director_id** : ID of the director involved in the collaboration
- **timestamp** : This ensures that each record is uniquely identified by the time it happened.

Write a query to find all (actor_id, director_id) pairs where the actor has worked with the director three or more times.

### Example 1

**Example:**

<p>

**Input:** </p>ActorDirector Table:

<pre class="ql-syntax" spellcheck="false">╔══════════╦═════════════╦═══════════╗
║ actor_id ║ director_id ║ timestamp ║
╠══════════╬═════════════╬═══════════╣
║ 1 ║ 1 ║ 0 ║
║──────────┼─────────────┼───────────║
║ 1 ║ 1 ║ 1 ║
║──────────┼─────────────┼───────────║
║ 1 ║ 1 ║ 2 ║
║──────────┼─────────────┼───────────║
║ 1 ║ 2 ║ 3 ║
║──────────┼─────────────┼───────────║
║ 1 ║ 2 ║ 4 ║
║──────────┼─────────────┼───────────║
║ 2 ║ 1 ║ 5 ║
║──────────┼─────────────┼───────────║
║ 2 ║ 1 ║ 6 ║
╚══════════╩═════════════╩═══════════╝
</pre>

<p>

**Output:** </p><pre class="ql-syntax" spellcheck="false">╔══════════╦═════════════╗
║ actor_id ║ director_id ║
╠══════════╬═════════════╣
║ 1 ║ 1 ║
╚══════════╩═════════════╝
</pre>

<p>

**Explanation:** </p>
- **(1, 1)** appears 3 times → included.
- **(1, 2)** appears 2 times → excluded.
- **(2, 1)** appears 2 times → excluded.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
