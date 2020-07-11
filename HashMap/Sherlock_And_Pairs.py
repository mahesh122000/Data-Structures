t=int(input())
for _ in range(t):
    n=int(input())
    a=dict()
    l=list(map(int,input().split()))
    for k in l:
        if k not in a :
            a[k]=1
        else:
            a[k]+=1
    ans=0
    for val in a.values():
        ans+=val*(val-1)
    print(ans)