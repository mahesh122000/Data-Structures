s=input()
l=[]
u=[]
e=[]
o=[]
for c in sorted(s):
    if c>='a' and c<='z':
        l.append(c)
    elif c>='A' and c<='Z':
        u.append(c)
    elif c>='0' and c<='9':
        if int(c)%2==0:
            e.append(c)
        else:
            o.append(c)
sorted(l)
sorted(u)
sorted(o)
sorted(e)
print(*(l+u+o+e),sep='')
