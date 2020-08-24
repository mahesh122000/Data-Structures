def get_ans(n):
    for i in range(0, n//2):
        print(' '*i + '*' + ' '*(n-1-2*i) + '*' + ' '*i, end = '')
    for i in range(n//2, n):
        print(' '*(n//2) + '*' + ' '*(n//2), end = '')
    
if __name__ == '__main__':
    cases = int(input())
    for _ in range(cases):
        n = int(input())
        get_ans(n)
        print()