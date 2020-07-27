import os
import random
import re
import sys

nu = list("0123456789")
lc = list("abcdefghijklmnopqrstuvwxyz")
uc = list("ABCDEFGHIJKLMNOPQRSTUVWXYZ")
sc = list("!@#$%^&*()-+")

def minimumNumber(n, password):
    p = list(password)
    c = 0
    d=0
    e=0
    f=0
    s=0
    for i in p:
        if i in nu:
            c += 1
        if i in lc:
            d += 1
        if i in uc:
            e += 1
        if i in sc:
            f += 1
    if(c==0):
        s+=1
    if(d==0):
        s+=1
    if(e==0):
        s+=1
    if(f==0):
        s+=1
    return max(s,6-n)

n = int(input())
password = input()
answer = minimumNumber(n, password)
print(answer)
