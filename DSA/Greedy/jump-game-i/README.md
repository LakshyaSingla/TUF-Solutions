# [Jump Game - I](https://takeuforward.org/plus/dsa/problems/jump-game---i?subject=dsa&approach=optimal&sidebar=open&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Given an array of integers nums, each element in the array represents the maximum jump length at that position. Initially starting at the first index of the array, determine if it is possible to **reach** the last index. Return **true** if the last index can be reached, otherwise return **false** .

### Example 1

<p>

**Input:** [2, 3, 1, 1, 4]</p>

<p>

**Output:** true</p>

<p>

**Explanation:** We can simply take Jump of 1 step at each index to reach the last index.</p>

### Example 2

<p>

**Input:** [3, 2, 1, 0, 4]</p>

<p>

**Output:** false</p>

<p>

**Explanation:** No matter how you make jumps you will always reach the third index (0 base) of the array.</p>The maximum jump of index three is 0, So you can never reach the last index of array.

### Constraints

- 1 <= nums.length <= 10^4
- 0 <= nums[i] <= 10^5

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
