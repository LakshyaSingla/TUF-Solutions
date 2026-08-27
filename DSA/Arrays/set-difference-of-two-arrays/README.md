# [Set difference of two arrays](https://takeuforward.org/plus/dsa/contest/arrays/set-difference-of-two-arrays?tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given two sorted arrays **nums1** and **nums2** , return an array that contains the **set difference** of these two arrays. The elements in the set difference must be in ascending order.

The **set difference** of two arrays is an array where all values are **distinct** and are present in either the first array or the second array, but **not** in both.

### Example 1

<p>

**Input:** nums1 = [1, 5, 7, 9], nums2 = [1, 3, 4, 7]</p><p>

**Output:** [3, 4, 5, 9]</p><p>

**Explanation:** </p>[<u>3</u>, <u>4</u>, 5, 9] where,

[3, 4] come from nums2 and [5, 9] comes from nums1.

### Example 2

<p>

**Input:** nums1 = [1, 2, 6, 6], nums2 = [-2, 2, 3, 4, 6]</p><p>

**Output:** [-2, 1, 3, 4]</p><p>

**Explanation:** </p>[<u>-2</u>, 1, <u>3</u>, <u>4</u>] where,

[1] comes from nums1 and [-2, 3, 4] from nums2.

### Constraints

- 1 <= nums1.length, nums2.length <= 10^5
- -10^4 <= nums1[i] , nums2[i] <= 10^4
- Both nums1 and nums2 are sorted in non-decreasing order

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
