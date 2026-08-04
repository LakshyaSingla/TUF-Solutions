# [3 Sum](https://takeuforward.org/plus/dsa/problems/3-sum?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer array **nums** . Return all triplets such that:

- i != j, i != k, and j != k

- nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets. One element can be a part of multiple triplets. The output and the triplets can be returned in any order.

### Example 1

<p>

**Input:** nums = [2, -2, 0, 3, -3, 5]</p><p>

**Output:** [[-2, 0, 2], [-3, -2, 5], [-3, 0, 3]]</p><p>

**Explanation:** </p>nums[1] + nums[2] + nums[0] = 0

nums[4] + nums[1] + nums[5] = 0

nums[4] + nums[2] + nums[3] = 0

### Example 2

<p>

**Input:** nums = [2, -1,&nbsp;-1, 3, -1]</p><p>

**Output:** [[-1, -1, 2]]</p><p>

**Explanation:** </p>nums[1] + nums[2] + nums[0] = 0

Note that we have used two -1s as they are separate elements with different indexes

But we have not used the -1 at index 4 as that would create a duplicate triplet

### Constraints

- 1 <= nums.length <= 3000
- -10^4 <= nums[i] <= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
