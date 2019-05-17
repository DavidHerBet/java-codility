# java-codility
Java solutions to **Codility Limited**: https://codility.com/ tasks from their lessons and challenges.

Codility lessons: https://codility.com/programmers/lessons/

Codility challenges: https://codility.com/programmers/challenges/

Introduction
============
All tasks are **Codility Limited** ownership. This repository represents my solutions to **Codility Limited** algorithmic tasks. The plan is to solve easier tasks first, and gradually solve all, even the hardest tasks at last. All tasks are considered completed only when when their performance is optimal, this means having 100% score in correctness, performance and task score.

Directory structure example
============
<pre>
src/main/java/com/dherbet/codility/lessonX # Package for certain lesson
    Solution1.java       # Task1 solution
    Solution2.java       # Task2 solution
    Solution3.java       # Task3 solution
</pre>

Every solution has description according to this example:
```java
/**
 * CODILITY ANALYSIS: https://app.codility.com/demo/results/trainingQY36WV-8GR/
 * Category: PAINLESS
 * Level: EASY
 * Correctness:	100%
 * Performance:	100%
 * Task score:	100%
 */
public class BinaryGap {

    private int solution(int A) {
        // ... some java code
    }

}
```

Test cases
============
Codility test cases follow a predictable methodology, using correctness and performance tests.

For the correctness tests:
* An empty or zero test case
* A minimal test case. One input or problem's minimal input.
* Edge cases
* One or two simple or small test cases, like the example solution provided on problem's description.

For performance tests, which include time constraints:
* Worst case scenario
* Medium sized test cases
* Some extreme test cases, typically involving generating maximal random data sets.

Although we may not like very much to try these test cases, it is necessary to do so to ensure that our solution is correct.

This repository is provided in Maven form to unit test some possible scenarios with JUnit.

Codility Lessons
============
Lesson 1 Iterations
- [BinaryGap](https://github.com/DavidHerBet/java-codility/blob/master/src/main/java/com/dherbet/codility/lesson1/BinaryGap.java) - [100%](https://app.codility.com/demo/results/trainingRGMR4Z-2RY/)

Copyright and License
============

According to the [Codility Programmer Terms of Service](https://codility.com/terms-of-service-for-programmers/) **section 8.2.** it is allowed to publish, share and reproduce training section, training tasks and past challenges, their solutions and assessment results.

---
> 8\. Confidentiality

> 8.1. Any Task, statement or information on the Site (including Tests Sessions and Test Session results) is confidential information. You agree not to:

> (a) disclose, publish or reproduce (including posting on any webpage or blog) such information; or

> (b) disclose to others details of a recruitment Task, ongoing Challenge or ongoing competition Task (including details relating to its completion).

> **8.2. This clause does not apply to: Training section of Codility service, Training Tasks and Past Challenges, their solutions and assessment results**.

---

Copyright (c) 2019 David Hernández Bethencourt
Licensed under the [MIT License](https://github.com/DavidHerBet/java-codility/blob/master/LICENSE)