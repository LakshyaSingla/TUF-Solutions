# [Maximum Value Of A Subarray](https://takeuforward.org/practice/dsa/contest/410/active?source=strivers-a2z-dsa-sheet&category=stack-and-queues)

![Difficulty: Pro](https://img.shields.io/badge/Difficulty-Pro-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

You are given an array of integers nums and an integer k. The value of a subarray is defined as the minimum value within the subarray multiplied by its length. You need to choose a subarray where the index k is included, i.e., there exists a subarray (nums[i], nums[i+1], ..., nums[j]) such that i≤k≤j.

Return the maximum possible value of any such subarray.

### Example 1:

**Input:** nums = [1, 3, 5, 2, 8], k = 2

**Output:** 8

**Explanation:**

The optimal subarray is from index 1 to index 4(inclusive), where the minimum value is 2.

The value is calculated as&nbsp;min(3,5,2,8)×4=2×4=8.

### Example 2:

**Input:** nums = [4, 6, 3, 5, 7, 8], k = 4

**Output:** 18

**Explanation:**

The optimal subarray is from index 0 to index 5 (inclusive), where the minimum value is 3. The value is calculated as =3×6=18.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= nums.length <= 10^5
- 1 <= nums[i] <= 10^4
- 0 <= k < nums.length

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
