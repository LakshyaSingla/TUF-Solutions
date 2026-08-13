# [Combination Sum II](https://takeuforward.org/plus/dsa/problems/combination-sum-ii?subject=dsa&approach=optimal-positives-negatives&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given collection of candidate numbers (candidates) and a integer target *.* Find all **unique combinations** in candidates where the sum is equal to the target.There can only be **one** **usage** of each number in the candidates combination and return the answer in **sorted** order.

e.g : The combination [1, 1, 2] and [1, 2, 1] are not unique.

### Example 1

<p>

**Input:** candidates = [2, 1, 2, 7, 6, 1, 5] , target = 8</p><p>

**Output:** &nbsp;[ [1, 1, 6] , [1, 2, 5] , [1, 7] , [2, 6] ]</p><p>

**Explanation:** The combinations sum up to target are</p>1 + 1 + 6 => 8.

1 + 2 + 5 => 8.

1 + 7 => 8.

2 + 6 => 8.

### Example 2

<p>

**Input:** candidates = [2, 5, 2, 1, 2] , target = 5</p><p>

**Output:** &nbsp;[ [1, 2, 2] , [5] ]</p><p>

**Explanation:** The combinations sum up to target are</p>1 + 2 + 2 => 5.

5 => 5.

### Constraints

- 1 <= candidates.length <= 100
- 1 <= candidates[i] <= 50
- 1 <= target <= 30

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
