# [Find the repeating and missing number](https://takeuforward.org/plus/dsa/problems/find-the-repeating-and-missing-number?subject=dsa&approach=optimal-i&sidebar=open&tab=submissions)

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer array **nums** of size **n** containing values from **[1, n]** and **each** value appears **exactly** once in the array, except for **A** , which appears **twice** and **B** which is **missing** .

Return the values **A** and **B** , as an array of size 2, where **A** appears in the **0-th** index and **B** in the **1st** index.

**Note:** You are not allowed to modify the original array.

### Example 1

<p>

**Input:** nums = [3, 5, 4, 1, 1]</p><p>

**Output:** [1, 2]</p><p>

**Explanation:** </p>1 appears two times in the array and 2 is missing from nums

### Example 2

<p>

**Input:** nums = [1, 2, 3, 6, 7, 5, 7]</p><p>

**Output:** [7, 4]</p><p>

**Explanation:** </p>7 appears two times in the array and 4 is missing from nums.

### Constraints

- n == nums.length
- 1 <= n <= 10^5
- n - 2 elements in nums appear exactly once and are valued between [1, n].
- 1 element in nums appears twice, and is valued between [1, n].

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
