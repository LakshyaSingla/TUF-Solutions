# [Combination Sum](https://takeuforward.org/plus/dsa/problems/combination-sum?subject=dsa&approach=optimal-ii&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Provided with a goal integer **target** and an array of unique integer **candidates** , provide a list of all possible combinations of candidates in which the selected numbers add up to the target. The combinations can be returned in any order.

A candidate may be selected from the pool an **infinite** number of times. There are two distinct combinations if the frequency of at least one of the selected figures differs.

The test cases are created so that, for the given input, there are fewer than 150 possible combinations that add up to the target.

If there is no possible subsequences then return **empty** **vector** .

### Example 1

<p>

**Input:** candidates = [2, 3, 5, 4] , target = 7</p><p>

**Output:** [ [2, 2, 3] , [3, 4] , [5, 2] ]</p><p>

**Explanation:** </p>2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.

5 and 2 are candidates, and 5 + 2 = 7.

3 and 4 are candidates, and 3 + 4 = 7.

There are total three combinations.

### Example 2

<p>

**Input:** candidates = [2], target = 1</p><p>

**Output:** []</p><p>

**Explanation:** There is no way we can choose the candidates to sum up to target.</p>

### Constraints

- 1 <= candidates.length <= 30
- 2 <= candidates[i] <= 40
- All elements of candidates are distinct.
- 1 <= target <= 40

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
