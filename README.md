# aprilchallenge
codechef april challenge 2021 
This repository consist of problems I solved in code chef long challenge(april)2021.

Ques:-Chef has three socks in his drawer. Each sock has one of 10 possible colours, which are represented by integers between 1 and 10. Specifically, the colours of the socks are A, B, and C.

Chef has to wear two socks which have the same colour. Help Chef find out if that is possible or not.

Input
The first and only line of the input contains three space-separated integers A, B and C.

Output
Print a single line containing the string "YES" if it is possible for Chef to wear two socks with the same colour or "NO" if it is impossible (without quotes).

You may print each character of each string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

Constraints
1≤A,B,C≤10
Subtasks
Subtask #1 (100 points): original constraints

Example Input 1
5 4 3
Example Output 1
NO


Solution:-socks.java

Ques:-"Usain Bolt makes a new world record completing 100 m in 9.58 seconds".

This news headline has been echoing in Chef's mind since 2009 when he started his career in sprinting. This time in the 2021 Tokyo Olympics he is determined to make a new world record.

There are mainly 3 important factors that result in the variation in speed during practice and during competition.

The first factor is a difference in track material which results in variation in the speed at competition with respect to practice by a factor of k1.

The second factor is wind speed which results in variation in the speed at competition with respect to practice by a factor of k2.

The final factor is the maximum speed achieved during practice. If the maximum speed during practice is v m/s then in competition it will be k3∗v m/s.

Given Chef's max speed v during practice and the factors k1,k2,k3, find whether he will be able to create a new world record, i.e, can he complete 100 m in less than 9.58 seconds?

Note: The final time displayed by the Olympics clock is showing after rounding the original time to 2 places of decimal and is the only measure of runners performance.

Input:
First line will contain T, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, four floats k1,k2,k3,v.
Output:
Output in a single line, the answer, which should be "YES" if it's possible for Chef to create a new world record and "NO" if not.

You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

Constraints
1≤T≤105
0<k1,k2<2
0<k3≤1
9<v<11
k1,k2,k3 contain 1 digit after decimal.
v contains 2 digits after decimal.
Subtasks
Subtask #1 (100 points): original constraints

Sample Input:
3
1.0 1.0 1.0 10.45
1.0 1.0 1.0 10.44
1.0 1.0 0.9 10.44
Sample Output:
YES
NO
NO


Solution:-bolt.java

Ques:--A string is said to be using strong language if it contains at least K consecutive characters '*'.

You are given a string S with length N. Determine whether it uses strong language or not.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains two space-separated integers N and K.
The second line contains a single string S with length N.
Output
Print a single line containing the string "YES" if the string contains strong language or "NO" if it does not (without quotes).

You may print each character of each string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

Constraints
1≤T≤10
1≤K≤N≤106
S contains only lowercase English letters and characters '*'
Sum of N over all testcases is atmost 106.
Subtasks
Subtask #1 (30 points): N≤104, Sum of N over all testcases is atmost 104
Subtask #2 (70 points): original constraints

Example Input
3
5 2
*a*b*
5 2
*a**b
5 1
abcde
Example Output
NO
YES
NO


Solution:strongstring.java
