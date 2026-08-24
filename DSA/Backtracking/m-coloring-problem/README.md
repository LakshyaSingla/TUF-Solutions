# [M Coloring Problem](https://takeuforward.org/plus/dsa/problems/m-coloring-problem?subject=dsa&approach=optimal&sidebar=open&tab=submissions)

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer M and an **undirected graph** with N vertices (zero indexed) and E edges. The goal is to determine whether the graph can be coloured with a maximum of **M colors** so that no two of its adjacent vertices have the same colour applied to them.

In this context, colouring a graph refers to giving each vertex a different colour. If the colouring of vertices is possible then return true, otherwise return false.

### Example 1

<p>

**Input:** N = 4 , M = 3 , E = 5 , Edges = [ (0, 1) , (1, 2) , (2, 3) , (3, 0) , (0, 2) ]</p><p>

**Output:** true</p><p>

**Explanation:** Consider the three colors to be red, green, blue.</p>We can color the vertex 0 with red, vertex 1 with blue, vertex 2 with green, vertex 3 with blue.

In this way we can color graph using 3 colors at most.

<img src="https://static.takeuforward.org/content/ProblemSetter-_ztgCPdg">

### Example 2

<p>

**Input:** N = 3 , M = 2 , E = 3 , Edges = [ (0, 1) , (1, 2) , (0, 2) ]</p><p>

**Output:** false</p><p>

**Explanation:** Consider the two colors to be red, green.</p>We can color the vertex 0 with red, vertex 1 with green.

As the vertex 2 is adjacent to both vertex 1 and 0 , so we cannot color with red and green.

Hence as we could not color all vertex of graph we return false.

<img src="https://static.takeuforward.org/content/ProblemSetter-VJ4WwBU_">

### Constraints

- 1 <= N <= 20
- 1 <= E <= (N*(N-1)/2)
- 1 <= M <= N

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
