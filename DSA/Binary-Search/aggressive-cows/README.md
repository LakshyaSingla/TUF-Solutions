# [Aggressive Cows](https://takeuforward.org/plus/dsa/problems/aggressive-cows?subject=dsa&approach=binary-search&tab=submissions)

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given an array nums of size n, which denotes the positions of stalls, and an integer k, which denotes the number of aggressive cows, assign stalls to k cows such that the **minimum** **distance** between any two cows is the **maximum possible** . Find the maximum possible minimum distance.

### Example 1

Input: n = 6, k = 4, nums = [0, 3, 4, 7, 10, 9]

Output: 3

Explanation:

The maximum possible minimum distance between any two cows will be 3 when 4 cows are placed at positions [0, 3, 7, 10]. Here the distances between cows are 3, 4, and 3 respectively.

In no manner can we increase the minimum distance beyond 3.

### Example 2

Input : n = 5, k = 2, nums = [4, 2, 1, 3, 6]

Output: 5

Explanation: The maximum possible minimum distance between any two cows will be 5 when 2 cows are placed at positions [1, 6].&nbsp;

### Constraints

- &nbsp;&nbsp;2 <= n <= 10^5
- &nbsp;&nbsp;2 <= k <= n
- &nbsp;&nbsp;0 <= nums[i] <= 10^9

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
