def Acc():
    tot = 0

    def add(v):
        nonlocal tot
        tot += v
        return tot
    return add


a = Acc()
b = Acc()

a(10)
a(20)
b(20)
print(a(1))
print(b(1))