# [Binary Subarrays With Sum](https://takeuforward.org/plus/dsa/problems/binary-subarrays-with-sum?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given a binary array nums and an integer goal. Return the **number** of **non-empty subarrays** with a sum goal.

A subarray is a continuous part of the array.

### Example 1

<p>

**Input:** nums = [1, 1, 0, 1, 0, 0, 1] , goal = 3</p><p>

**Output:** 4</p><p>

**Explanation:** The subarray with sum 3 are</p>[1, 1, 0, 1]

[1, 1, 0, 1, 0]

[1, 1, 0, 1, 0, 0]

[1, 0, 1, 0, 0, 1].

### Example 2

<p>

**Input:** nums = [0, 0, 0, 0, 1] , goal = 0</p><p>

**Output:** 10</p><p>

**Explanation:** Some of the subarray with sum 0 are</p>[0]

[0, 0]

[0, 0, 0]

[0, 0, 0, 0]

### Constraints

- 1 <= nums.length <= 3*10^4
- 0 <= goal <= nums.length
- *nums* consist of only 0 and 1.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
