# [Number of Jumps](https://takeuforward.org/plus/dsa/contest/arrays/number-of-jumps?approach=optimal&tab=submissions)

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given an array **nums** of n integers and an integer **k** , return the **total** number of jumps needed in the array.

An element **nums[i]** needs to jump another element **nums[j]** if:

- **0 <= i < j <= n-1**
- **nums[i] + k < nums[j]**

### Example 1

<p>

**Input:** nums = [3, 1, 10, 6, 5], k = 2</p><p>

**Output:** 5</p><p>

**Explanation:** </p>Number of jumps for each index:

nums[0] -> 2, nums[1] -> 3, nums[2] -> 0, nums[3] -> 0, nums[4] -> 0

Total = 2 + 3 + 0 + 0 + 0 = 5

### Example 2

<p>

**Input:** nums = [1, 4, 5, 1, 7], k = 3</p><p>

**Output:** 3</p><p>

**Explanation:** </p>Number of jumps for each index:

nums[0] -> 2, nums[1] -> 0, nums[2] -> 0, nums[3] -> 1, nums[4] -> 0

Total = 2 + 0 + 0 + 1 + 0 = 3

### Constraints

- 1 <= n <= 10^5
- -10^4 <= nums[i] <= 10^4
- 0 <= k <= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
