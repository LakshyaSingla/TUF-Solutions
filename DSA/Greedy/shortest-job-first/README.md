# [Shortest Job First](https://takeuforward.org/practice/dsa/shortest-job-first)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

A software engineer is tasked with using the shortest job first **(SJF)** policy to calculate the average waiting time for each process. The shortest job first also known as shortest job next **(SJN)** scheduling policy selects the waiting process with the least execution time to run next.

You are given an array of integers **bt** of size **n** representing the **burst times (execution times)** of n processes.

Your task is to calculate the average waiting time for all processes when scheduled using the SJF policy. The waiting time of a process is the total time a process has to wait before its execution starts, which is the sum of burst times of all previously executed processes.

Return the **floor** of the average waiting time, **i.e., the largest whole number less than or equal to the actual average.**

### Example 1:

**Input:** bt = [4, 1, 3, 7, 2]

**Output:** 4

**Explanation:** The total waiting time is 20.

So the average waiting time will be 20/5 => 4.

### Example 2:

**Input:** bt = [1, 2, 3, 4]

**Output:** 2

**Explanation:** The total waiting time is 10.

So the average waiting time will be 10/4 => 2.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= n <= 10^5
- 1 <= bt[i] <= 10^5

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
