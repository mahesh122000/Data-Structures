def largestSegment(radius, segments):
    areas = [math.pi * r * r for r in radius]
    def valid(x):
        k = 0
        for a in areas:
            k += a // x
            if k >= segments:
                return True
        return False
    
    l, r = 0, max(areas)
    while l + 1e-5 <= r:
        x = (l + r) / 2
        if valid(x):
            l = x
        else:
            r = x
    return str(round(x,4))