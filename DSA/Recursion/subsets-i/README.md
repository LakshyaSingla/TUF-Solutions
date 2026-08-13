# [Subsets I](https://takeuforward.org/plus/dsa/problems/subsets-i?subject=dsa&approach=optimal-positives-negatives&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an array nums of n integers. Return array of **sum** of all subsets of the array nums.

Output can be returned in any order.

### Example 1

<p>

**Input:** nums = [2, 3]</p><p>

**Output:** [0, 2, 3, 5]</p><p>

**Explanation:** </p>When no elements is taken then Sum = 0.

When only 2 is taken then Sum = 2.

When only 3 is taken then Sum = 3.

When element 2 and 3 are taken then&nbsp;sum = 2+3 = 5.

### Example 2

<p>

**Input:** nums = [5, 2, 1]</p><p>

**Output:** [0, 1, 2, 3, 5, 6, 7, 8]</p><p>

**Explanation:** </p>When no elements is taken then Sum = 0.

When only 5 is taken then Sum = 5.

When only 2 is taken then Sum = 2.

When only 1 is taken then Sum = 1.

When element 2 and 1 are taken then&nbsp;sum = 2+1 = 3.

### Constraints

- 1 <= n <= 15
- 0 <= nums[i] <= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
