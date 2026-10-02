# [Count Collisons](https://takeuforward.org/practice/dsa/contest/410/active?source=strivers-a2z-dsa-sheet&category=stack-and-queues)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given a road having n cars arranged from left to right at unique positions. Each car has a predefined movement direction or remains stationary, represented by a string directions of length n. In the string, 'L' denotes a car moving left, 'R' denotes a car moving right, and 'S' denotes a stationary car. All moving cars travel at the same speed. When two cars moving in opposite directions collide, the collision count increases by 2, and when a moving car collides with a stationary car, the collision count increases by 1. After any collision, the cars involved stop and remain stationary at the point of collision.&nbsp;

Your task is to calculate the total number of collisions that occur on the road.

### Example 1:

Input: directions = "RLLRS"

Output: 4

Explanation:

Car 1 ('R') collides with Car 2 ('L'), Total Collisons: 0+2=2

Car 2, now stationary, collides with Car 3 ('L'), Total Collisons: 2+1=3

Car 4 ('R') collides with Car 5 ('S'), Total Collisons: 3+1=4.

### Example 2:

Input: directions = "SSRRLL"

Output: 4

Explanation:

Car 4 ('R') collides with Car 5 ('L'),Total Collisons: 0+2=2.

Car 5 ('L') collides with Car 5 after it becomes stationary,Total Collisons: 2+1=3.

Car 3 ('L') collides with Car 4 after it becomes stationary,Total Collisons: 3+1=4.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= directions.length <= 10^5

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
