from collections import deque

for _ in range(int(input())):
    _,q=input(),deque(map(int,input().split()))
    for i in reversed(sorted(q)):
        if q[-1]==i:
            q.pop()
        elif q[0]==i:
            q.popleft()
        else:
            print("No")
            break
    else:
        print("Yes")
