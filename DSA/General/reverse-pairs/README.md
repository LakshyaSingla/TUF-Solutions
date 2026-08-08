# [Reverse Pairs](https://takeuforward.org/plus/dsa/problems/reverse-pairs?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer array **nums** . Return the **number** of **reverse pairs** in the array.

An index pair **(i, j)** is called a **reverse** pair if:

- 0 <= i < j < nums.length

- nums[i] > 2 * nums[j]

### Example 1

<p>

**Input:** nums = [6, 4, 1, 2, 7]</p><p>

**Output:** 3</p><p>

**Explanation:** </p>The reverse pairs are:

(0, 2) : nums[0] = 6, nums[2] = 1, 6 > 2 * 1

(0, 3) : nums[0] = 6, nums[3] = 2, 6 > 2 * 2

(1, 2) : nums[1] = 4, nums[2] = 1, 4 > 2 * 1

### Example 2

<p>

**Input:** nums = [5, 4, 4, 3, 3]</p><p>

**Output:** 0</p><p>

**Explanation:** </p>No pairs satisfy both the conditons.

### Constraints

- 1 <= nums.length <= 5 * 10^4
- -2^31 <= nums[i] <= 2^31 - 1

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
