def checkHarshad( n ) : 
    sum = 0
    temp = n 
    while temp > 0 : 
        sum = sum + temp % 10
        temp = temp // 10
    return n % sum == 0

def safe(arr,m,n,i,j):
    if(i>=m or j>=n or i<0 or j<0):
        return False
    if(checkHarshad(arr[i][j])):
        return True
    return False
def check(arr,m,n,i,j):
    if(safe(arr,m,n,i,j) and safe(arr,m,n,i,j+1) and safe(arr,m,n,i+1,j+1) and safe(arr,m,n,i+1,j)):
        return True
    return False
        
def printall(arr,i,j):
    print(arr[i][j],arr[i][j+1],sep=' ')
    print(arr[i+1][j],arr[i+1][j+1],sep=' ')
    
    
def printMatrix(arr,m,n):
    val=0
    for i in range(0,m):
        for j in range(0,n):
            if(check(arr,m,n,i,j)):
                val=1
                printall(arr,i,j)
    if(val==0):
        print("-1")

m=int(input())
arr=[]
n=0
for _ in range(m):
    L = list(map(int, input().split(','))) 
    arr.append(L)
    n=len(L)
printMatrix(arr,m,n)