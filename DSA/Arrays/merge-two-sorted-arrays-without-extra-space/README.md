# [Merge two sorted arrays without extra space](https://takeuforward.org/plus/dsa/problems/merge-two-sorted-arrays-without-extra-space?subject=dsa&approach=optimal-iii&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given two integer arrays **nums1** and **nums2** . Both arrays are sorted in **non-decreasing** order.

**Merge** **both** the arrays into a **single** array **sorted** in **non-decreasing** order.

- The **final** sorted array should be stored inside the array **nums1** and it should be done in-place.

- **nums1** has a length of **m + n** , where the first **m** elements denote the elements of **nums1** and rest are **0s** .

- **nums2** has a length of **n.**

### Example 1

<p>

**Input:** nums1 = [-5, -2, 4, 5], nums2 = [-3, 1, 8]</p><p>

**Output:** [-5, -3, -2, 1, 4, 5, 8]</p><p>

**Explanation:** </p>The merged array is: [-5, -3, -2, 1, 4, 5, 8], where [-5, -2, 4, 5] are from nums1 and [-3, 1, 8] are from nums2

### Example 2

<p>

**Input:** nums1 = [0, 2, 7, 8], nums2 = [-7, -3, -1]</p><p>

**Output:** [-7, -3, -1, 0, 2, 7, 8]</p><p>

**Explanation:** </p>The merged array is: [-7, -3, -1, 0, 2, 7, 8], where [0, 2, 7, 8] are from nums1 and [-7, -3, -1] are from nums2

### Constraints

- n == nums2.length.
- m + n == nums1.length.
- 0 <= n, m <= 1000
- -10^4 <= nums1[i], nums2[i] <= 10^4
- Both nums1 and nums2 are sorted in non-decreasing order.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
