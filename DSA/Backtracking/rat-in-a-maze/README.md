# [Rat in a Maze](https://takeuforward.org/plus/dsa/problems/rat-in-a-maze?subject=dsa&approach=optimal&sidebar=open&tab=submissions)

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given a grid of dimensions n x n. A rat is placed at coordinates (0, 0) and wants to reach at coordinates (n-1, n-1).

Find all possible paths that rat can take to travel from (0, 0) to (n-1, n-1). The directions in which rat can move are **'U' (up) , 'D' (down) , 'L' (left) , 'R' (right)** .

The value 0 in grid denotes that the cell is blocked and rat cannot use that cell for travelling, whereas value 1 represents that rat can travel through the cell. If the cell (0, 0) has 0 value, then mouse cannot move to any other cell.

**Note :**

- In a path no cell can be visited more than once.
- If there is no possible path then return empty vector.

### Example 1

<p>

**Input:** n = 4 , grid = [ [1, 0, 0, 0] , [1, 1, 0, 1], [1, 1, 0, 0], [0, 1, 1, 1] ]</p><p>

**Output:** [ "DDRDRR" , "DRDDRR" ]</p><p>

**Explanation:** The rat has two different path to reach (3, 3).</p>The first path is (0, 0) => (1, 0) => (2, 0) => (2, 1) => (3, 1) => (3, 2) => (3, 3).

The second path is (0,0) => (1,0) => (1,1) => (2,1) => (3,1) => (3,2) => (3,3).

### Example 2

<p>

**Input:** n = 2 , grid = [ [1, 0] , [1, 0] ]</p><p>

**Output:** -1</p><p>

**Explanation:** There is no path that rat can choose to travel from (0,0) to (1,1).</p>

### Constraints

- 2 <= n <= 5
- 0 <= grid[i][j] <= 1

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
