#!/bin/python3

import os
import sys

def sum(l, r):
    return (r * (r + 1) // 2) - (l * (l - 1) // 2)

t = int(input())
while t > 0:
    t -= 1
    
    n, k, b = map(int, input().split())

    if sum(1, b) > n or sum(k - b + 1, k) < n: print(-1)
    else:
