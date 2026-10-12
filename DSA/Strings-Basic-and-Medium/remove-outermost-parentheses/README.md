# [Remove Outermost Parentheses](https://takeuforward.org/practice/dsa/remove-outermost-parentheses?category=parentheses&source=strivers-a2z-dsa-sheet)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

A valid parentheses string is defined by the following rules:

- It is the **empty** string "".
- If A is a valid parentheses string, then so is **"(" + A + ")"** .
- If A and B are valid parentheses strings, then **A + B** is also valid.

A primitive valid parentheses string is a non-empty valid string that **cannot be split into two or more** non-empty valid parentheses strings.

Given a **valid parentheses string s,** consider its primitive decomposition: **s = P** _ **1** **+ P** _ **2** **+ ... + P** _ **k** , where **P** _ **i** are **primitive** **valid parentheses strings.**

*Return* **s** *after removing the outermost parentheses of every primitive string in the* **primitive decomposition of s** *.*

### Example 1:

**Input:** s = "((()))"

**Output:** "(())"

**Explanation:**

The input string is a single primitive: "((()))".

Removing the outermost layer yields: "(())".

### Example 2:

**Input:** s = "()(()())(())"

**Output:** "()()()"

**Explanation:**

Primitive decomposition: "()" + "(()())" + "(())"

After removing outermost parentheses: "" + "()()" + "()"

Final result: "()()()".

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= s.length <= 10⁵
- s[i] is either '(' or ')'
- s is a valid parentheses string

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
