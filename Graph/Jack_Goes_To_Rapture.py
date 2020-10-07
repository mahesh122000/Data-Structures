n, e = map(int, raw_input().strip().split())
parent = [-1]*n

def find(n):
    if parent[n] < 0:
        return n
    pt = find(parent[n])
    parent[n] = pt
    return pt

edges = []
for ee in xrange(e):
    a, b, c = map(int, raw_input().strip().split())
    a -= 1
    b -= 1
    edges.append((c, a, b))

edges.sort()


if find(0) == find(n-1):
    print 0
else:
    for c, a, b in edges:
        a = find(a)
        b = find(b)
        if a != b:
            if parent[a] == parent[b]: parent[b] -= 1
            if parent[a] > parent[b]:
                parent[a] = b
            else:
                parent[b] = a
        if find(0) == find(n-1):
            print c
            break
    else:
        print 'NO PATH EXISTS'