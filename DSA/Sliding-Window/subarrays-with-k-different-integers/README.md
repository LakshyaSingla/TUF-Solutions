# [Subarrays with K Different Integers](https://takeuforward.org/practice/dsa/subarrays-with-k-different-integers?category=counting-subarrays-and-substrings-problems&source=strivers-a2z-dsa-sheet)

![Difficulty: Pro](https://img.shields.io/badge/Difficulty-Pro-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

You are given an integer array **nums** and an integer k.

Return the number of good subarrays of **nums** .

A good subarray is defined as a contiguous subarray of **nums** that contains exactly k distinct integers.

A subarray is a contiguous part of the array.

### Example 1:

**Input:** nums = [1, 2, 1, 2, 3], k = 2&nbsp;&nbsp;

**Output:** 7&nbsp;&nbsp;

**Explanation:** The 7 subarrays with exactly 2 different integers are:&nbsp;&nbsp;

[1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]

### Example 2:

**Input:** nums = [1, 2, 1, 3, 4], k = 3&nbsp;&nbsp;

**Output:** 3&nbsp;&nbsp;

**Explanation:** The 3 subarrays with exactly 3 different integers are:&nbsp;&nbsp;

[1,2,1,3], [2,1,3], [1,3,4]

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

1 <= nums.length <= 2 * 10^4

1 <= nums[i], k <= nums.length

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
