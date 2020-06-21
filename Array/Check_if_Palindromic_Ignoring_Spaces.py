t=int(input())
for _ in range(t):
    l=''.join(list(input().split(' ')))
    n=len(l)
    v=0
    for i in range((n+1)//2):
        if l[i]!=l[-i-1]:
            v=1
    if v==0:
        print("YES")
    else:
        print("NO")