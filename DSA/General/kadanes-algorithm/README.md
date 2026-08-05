# [Kadane's Algorithm](https://takeuforward.org/plus/dsa/problems/kadane's-algorithm?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer array **nums** , find the subarray with the largest sum and return the sum of the elements present in that subarray.

A subarray is a contiguous non-empty sequence of elements within an array.

### Example 1

<p>

**Input:** nums = [2, 3, 5, -2, 7, -4]</p><p>

**Output:** 15</p><p>

**Explanation:** </p>The subarray from index 0 to index 4 has the largest sum = 15

### Example 2

<p>

**Input:** nums = [-2, -3, -7, -2, -10, -4]</p><p>

**Output:** -2</p><p>

**Explanation:** </p>The element on index 0 or index 3 make up the largest sum when taken as a subarray

### Constraints

- 1 <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
