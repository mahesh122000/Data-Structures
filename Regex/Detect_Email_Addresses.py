# Enter your code here. Read input from STDIN. Print output to STDOUT
import re
text="\n".join(input() for _ in range(int(input())))
regex=r'\w+(\.\w+)*@\w+\.\w+(\.\w+)*'
res=list(set(i.group(0) for i in re.finditer(regex,text)))
res.sort()
print(";".join(res))