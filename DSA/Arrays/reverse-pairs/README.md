# [Reverse Pairs](https://takeuforward.org/practice/dsa/reverse-pairs?category=faqs-hard&source=strivers-a2z-dsa-sheet)

![Difficulty: Pro](https://img.shields.io/badge/Difficulty-Pro-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer array **nums** . Return the **number** of **reverse pairs** in the array.

An index pair **(i, j)** is called a **reverse** pair if:

- 0 <= i < j < nums.length

- nums[i] > 2 * nums[j]

### Example 1:

**Input:** nums = [6, 4, 1, 2, 7]

**Output:** 3

**Explanation:**

The reverse pairs are:

(0, 2) : nums[0] = 6, nums[2] = 1, 6 > 2 * 1

(0, 3) : nums[0] = 6, nums[3] = 2, 6 > 2 * 2

(1, 2) : nums[1] = 4, nums[2] = 1, 4 > 2 * 1

### Example 2:

**Input:** nums = [5, 4, 4, 3, 3]

**Output:** 0

**Explanation:**

No pairs satisfy both the conditons.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= nums.length <= 5 * 10^4
- -2^31 <= nums[i] <= 2^31 - 1

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
