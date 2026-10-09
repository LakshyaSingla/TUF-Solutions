# [712. Number of Jumps](https://takeuforward.org/practice/dsa/number-of-jumps?solution=optimal)

![Difficulty: Pro](https://img.shields.io/badge/Difficulty-Pro-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given an array **nums** of n integers and an integer **k** , return the **total** number of jumps needed in the array.

An element **nums[i]** needs to jump another element **nums[j]** if:

- **0 <= i < j <= n-1**
- **nums[i] + k < nums[j]**

### Example 1:

**Input:** nums = [3, 1, 10, 6, 5], k = 2

**Output:** 5

**Explanation:**

Number of jumps for each index:

nums[0] -> 2, nums[1] -> 3, nums[2] -> 0, nums[3] -> 0, nums[4] -> 0

Total = 2 + 3 + 0 + 0 + 0 = 5

### Example 2:

**Input:** nums = [1, 4, 5, 1, 7], k = 3

**Output:** 3

**Explanation:**

Number of jumps for each index:

nums[0] -> 2, nums[1] -> 0, nums[2] -> 0, nums[3] -> 1, nums[4] -> 0

Total = 2 + 0 + 0 + 1 + 0 = 3

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

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
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
