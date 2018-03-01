# Advanced-Data-Structures---Java
All programs written in Advanced Data Structures course at Duquesne University 

ASSIGNMENT 1:
Write a function, void bubblesort(int *low, int *high) that sorts an array of integers whose first element is pointed to by low and whose last element is pointed to by high. The program must be in C+ + and must use pointers, rather than indices, to access and manipulate the elements of the array.
Also, write a function, int *binsearch(int *low, int *high, int key) that finds key in the array of integers pointed to by low and high, inclusive, using the binary search algorithm. The elements of the array are assumed to be in order. binsearch should return a pointer to the element in the array equal to key, if found. If key is not in the array, then binsearch should return high+1.
Be sure to write a main program that tests both methods on a sufficient number of cases.
Additional Requirement
The program must use pointers to access the elements and must modify the pointers directly. The program may not use indices (int values which are added to the base element of the array) either explicitly, i.e., a[i] or implicitly, *(a+i).

ASSIGNMENT 2:
Your program must use linked lists and must use recursion. You may not use iteration (loops) anywhere in the program. No while, for, do-while statements - just recursion. Your code must be efficient.
Program Description
From Wikipedia (http://en.wikipedia.org/wiki/Josephus_problem):
In computer science and mathematics, the Josephus Problem (or Josephus permutation) is a
theoretical problem related to a certain counting-out game.
There are people standing in a circle waiting to be executed. The counting out begins at some point in the circle and proceeds around the circle in a fixed direction. In each step, a certain number of people are skipped and the next person is executed. The elimination proceeds around the circle (which is becoming smaller and smaller as the executed people are removed), until only the last person remains, who is given freedom.
The task is to choose the place in the initial circle so that you are the last one remaining and so survive.
n denotes the number of people in the initial circle, and k denotes the count for each step, that is, k-1 people are skipped and the kth is executed. The people in the circle are numbered from 1 to n.
Your program should read in n and k and then create a list of people numbered from 1 to n. The program should repeatedly count out and kill off the kth person going around the circle until there is only one person left. Finally, the program should print out the number of the survivor. The program should print out the current list and indicate who should be killed next each time.
Sample Run
Enter n and k > 10 3
  1   2   3   4   5   6   7   8   9  10
^
1 2 4 5 6 7 8 9 10 ^
1 2 4 5 7 8 9 10 ^
1 2 4 5 7 8 10 ^
 
1 4 5 7 8 10 ^
1 4 5 8 10 ^
4 5 8 10 ^
4 5 10 ^
4 10 ^
4 is the last one alive.

