# FatnessChecker
<div style="text-align:right">Language: <i>English</i> | <a href="README_JA.md">日本語</a></div>

This project is sample of dependency injection for Java.

If you want to see details, please see the 12th article of [Java Advent Calendar 2018](https://qiita.com/advent-calendar/2018/java). (Japanese only)



# Short Story: Obese Judgement

:man: I want to check my health. Let's ask the Fatness-Assessment-Company for inspection!

After several hours.

:person_frowning: Welcome to the Fatness-Assessment-Company. May I ask your height and weight?

:man: Well, my height is 170 cm, weight is 70 kg.

:person_frowning: Certainly. Please wait a moment. We will calculate your BMI with our latest type robot.

:robot: Now Calculating...  70 kg divided by 1.70 m equals 41.18, so the BMI is ** 41.18 **!

:person_frowning: OK, The BMI is over 40, so you are  **Obese (Level 4)** in Japan.

:man: No way!

After several hours

:man: I'm definitely not obese. That robot must have been broken.

:older_man: Are you having trouble of Fatness-Assessment-Company? Let me hear your story if you do not mind.

:man: Yeah, Bla bla bla...

A few days later

:information_desk_person: Welcome to the Fatness-Assessment-Company. May I ask your height and weight?

:man: Height is 170 cm, weight is 70 kg.

:information_desk_person: Just a moment please. I will calculate the BMI with the robot.

:man: Wait! I want this person to calculate the BMI.

:older_man: Let me see, 70 kg divided by the square of 1.70 m equals 24.22, so his BMI is ** 24.22 **.

:information_desk_person: Certainly. The BMI is over 18.5 and less than 25, so you are **Normal Weight ** in Japan.

:man: I did it!



# Role of the People

The people who appeared in this story are as follows.

- :man: is a person who want to know his degree of obesity. We will call him `User` in this article.
- :person_frowning: is a person who uses :robot: to determine the degree of obesity. We will call her `FatnessChecker` in this article.
- :robot: is a robot that calculates BMI. There is still a bug. We will call it `BmiRobot` in this article.
- :older_man: is an expert in calculating BMI. He definitely do not mistake the calculation. We will call him `BmiMaster` in this article.
- :information_desk_person: is a person who judges the degree of obesity by using :older_man:. :person_frowning: is same person, but to distinguish it for explanation, we will call her `FatnessCheckerDi` in this article.



# Problems of this case

:robot: `BmiRobot` has mistakenly calculated BMI. Apparently there seems to be a bug.

:person_frowning: `FatnessChecker` performed obesity degree judgment based on this incorrect calculation result, so the judgment result was also wrong.

In other words, it is a problem that :person_frowning: `FatnessChecker` depended on :robot:` BmiRobot` with low reliability.



# DI

:man: `User` asked 💁 `FatnessCheckerDi` to let :older_man:` BmiMaster` calculate BMI, because he trust him.

This will enable that  the judgment result of:information_desk_person: `FatnessCheckerDi` will depend on a reliable :older_man:` BmiMaster`.

This is ** DI ** (dependency injection)! In other words,

### :man: `User` injected:older_man:` BmiMaster` against:information_desk_person: `FatnessCheckerDi`! 