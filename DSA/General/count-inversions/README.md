# [Count Inversions](https://takeuforward.org/practice/dsa/count-inversions)

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer array **nums** . Return the **number** of **inversions** in the array.

Two elements **a[i]** and **a[j]** form an **inversion** if **a[i] > a[j]** and **i < j** .

- It indicates how **close** an array is to being **sorted** .

- A **sorted** array has an inversion count of **0** .

- An array **sorted** in **descending** order has **maximum** inversion.

### Example 1:

**Input:** nums = [2, 3, 7, 1, 3, 5]

**Output:** 5

**Explanation:**

The responsible indexes are:

nums[0], nums[3], values: 2 > 1 & indexes: 0 < 3

nums[1], nums[3], values: 3 > 1 & indexes: 1 < 3

nums[2], nums[3], values: 7 > 1 & indexes: 2 < 3

nums[2], nums[4], values: 7 > 3 & indexes: 2 < 4

nums[2], nums[5], values: 7 > 5 & indexes: 2 < 5

### Example 2:

**Input:** nums = [-10, -5, 6, 11, 15, 17]

**Output:** 0

**Explanation:**

nums is sorted, hence no inversions present.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= nums.length <= 10^5
- -10^5 <= nums[i] <= 10^5

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
