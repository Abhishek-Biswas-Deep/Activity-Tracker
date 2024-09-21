<img src="https://github.com/user-attachments/assets/2ad86f70-12b4-4500-997d-9f8c1874a9b5" alt="Dal logo" width="80"/>
<h1>Associated with Dalhousie University</h1>

## CSCI1110
### Activity Tracker
#### Project Description
The program tracks a user's active time (in minutes) for a specified month, calculates total and average active minutes, identifies the most active day, and visualizes the activity data.

#### Features
1. Input and process active minutes for a chosen month.
2. Calculate and display total active minutes and percentage of active time.
3. Identify and display the most active day.
4. Generate an activity histogram.
5. Generate an activity graph.

#### How to Run
First clone the repository. Then navigate to the project directory. Compile and run the program.

#### Input Format
The program expects input in the following format:

1. An integer representing the month (1-12).
2. Pairs of integers representing the day and active minutes.
3. Input ends when 0 is entered for the day.

Example input:
```
2
1
30
4
90
8
100
15
9
0
```
The program will output:
1. Total active minutes for the month.
2. Percentage of active time.
3. The most active day and its minutes.
4. An activity histogram.
5. An activity graph.

Notes
1. The implementation handles invalid day inputs by discarding the corresponding minutes.
2. February is assumed to always have 28 days.
