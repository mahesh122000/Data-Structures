def find(n):
        if n == '1' or int(n) < 0: return "0"
        if n == '0': return 1
        minimal = float('inf')
        l_left = (len(n)+1)//2
        prefix = n[:l_left]
        n1 = int(prefix + prefix[::-1][int(len(n)%2==1):])
        n3_prefix = str(int(prefix) + 1)
        if len(n3_prefix) != len(prefix):
            n3 = 10**len(n) + 1
        else:
            n3 = int(n3_prefix + n3_prefix[::-1][int(len(n)%2==1):])
        ans = None
        for cand in [n3,n1]:
            if abs(cand - int(n)) <= minimal and str(cand) > n:
                ans = cand
                minimal = abs(cand - int(n))
                
        return str(ans)
        
t=int(input())
for _ in range(t):
    n=int(input())
    a=list(map(int,input().split()))
    val=0
    for i in a:
        val=val*10+i
    ans=find(str(val))
    result=""
    for c in ans:
        result=result+c+" "
    print(result)