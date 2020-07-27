import math
import os
import random
import re
import sys

# Complete the staircase function below.
def staircase(n):
    for i in range(0,n,1):
        for j in range(0,n-i-1,1):
            print(' ',end='')
        for k in range(0,i+1,1):
            print('#',end='')
        print('\n',end='')
if __name__ == '__main__':
    n = int(input())

    staircase(n)
