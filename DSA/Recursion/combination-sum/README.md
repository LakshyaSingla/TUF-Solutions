# [Combination Sum](https://takeuforward.org/practice/dsa/combination-sum)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Provided with a goal integer **target** and an array of unique integers **nums** , provide a list of all possible combinations of nums in which the selected numbers add up to the target. The combinations can be returned in any order.

A number may be selected from nums an infinite number of times. There are two distinct combinations if the frequency of at least one of the selected numbers differs.

The test cases are created so that, for the given input, there are fewer than 150 possible combinations that add up to the target.

If there is no possible combination, then return an empty vector.

### Example 1:

**Input:** nums = [2, 3, 5, 4] , target = 7

**Output:** [ [2, 2, 3], [2, 5] , [3, 4] ]

**Explanation:**

2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.

2 and 5 are candidates, and 2 + 5 = 7.

3 and 4 are candidates, and 3 + 4 = 7.

There are total three combinations.

### Example 2:

**Input:** nums = [2], target = 1

**Output:** []

**Explanation:** There is no way we can choose the candidates to sum up to target.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

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
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
