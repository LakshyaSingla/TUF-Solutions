# [Minimum number of platforms required for a railway](https://takeuforward.org/practice/dsa/minimum-number-of-platforms-required-for-a-railway)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the arrival and departure times of all trains reaching a particular railway station, determine the **minimum** number of platforms required so that no train is kept waiting. Consider all trains arrive and depart on the same day.

In any particular instance, the same platform cannot be used for both the departure of one train and the arrival of another train, necessitating the use of different platforms in such cases.

**Note:** Time intervals are in the minutes , **Leading zeros for minutes less than 1000 are optional (e.g., 0900 is the same as 900).**

### Example 1:

**Input:** Arrival = [900, 940, 950, 1100, 1500, 1800] , Departure = [910, 1200, 1120, 1130, 1900, 2000]

**Output:** 3

**Explanation:** The first , second , fifth number train can use the platform 1.

- The third and sixth train can use the platform 2.
- The fourth train will use platform 3.
- So total we need 3 different platforms for the railway station so that no train is kept waiting.

### Example 2:

**Input:** Arrival = [900, 1100, 1235] , Departure = [1000, 1200, 1240]

**Output:** 1

**Explanation:** All the three trains can use the platform 1.

- So we required only 1 platform.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= N <= 10^5
- 0000 <= Arrival[i] <= Departure[i] <= 2359

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
