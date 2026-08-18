# [Word Search](https://takeuforward.org/plus/dsa/problems/word-search?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given a grid of n x m dimension grid of characters board and a string word.The word can be created by assembling the letters of successively surrounding cells, whether they are next to each other **vertically** or **horizontally** . It is forbidden to use the same letter cell more than once.

Return true if the word exists in the grid otherwise false.

### Example 1

<p>

**Input:** board = [ ["A", "B", "C", "E"] , ["S" ,"F" ,"C" ,"S"] , ["A", "D", "E", "E"] ] , word = "ABCCED"</p><p>

**Output:** true</p><p>

**Explanation:** The word is coloured in yellow.</p>

<img src="https://static.takeuforward.org/content/ProblemSetter-P9Dc3q6C">

### Example 2

<p>

**Input:** board = [["A", "B", "C", "E"] , ["S", "F", "C", "S"] , ["A", "D", "E", "E"]] , word = "SEE"</p><p>

**Output:** true</p><p>

**Explanation:** The word is coloured in yellow.</p>

<img src="https://static.takeuforward.org/content/ProblemSetter-Q0bcgifi">

### Constraints

- n = board.length
- m = board[i].length
- 1 <= n, m <=6
- 1 <= word.length <= 15
- board and word consist of only lowercase and uppercase English letters.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
