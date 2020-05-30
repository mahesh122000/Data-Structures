import math
import os
import random
import re
import sys

def poisonousPlants(p):
    stack=[]
    ans=-1
    for i in p:
        d=1
        while stack and stack[-1][0]>=i:
            ind,pd=stack.pop()
            d=max(d,pd+1)
        if not stack:
            d=0
        ans=max(ans,d)
        stack.append((i,d))
    return ans

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    p = list(map(int, input().rstrip().split()))

    result = poisonousPlants(p)

    fptr.write(str(result) + '\n')

    fptr.close()
