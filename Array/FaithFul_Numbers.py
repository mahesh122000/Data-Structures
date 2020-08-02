import math
for _ in range (int(input())):
    n=int(input())
    val=0
    while(n>0):
        k=int(math.log(n,2))
        n=n-(2**k)
        val+=(7**k)
    print(val)