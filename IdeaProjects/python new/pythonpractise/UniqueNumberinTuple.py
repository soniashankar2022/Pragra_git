t1 = (10, 20, 10, 30, 20, 40, 60)
t2 = ()
for x in t1:
    if x not in t2:
        t2 += (x,)
print("original t1 :", t1)
print("unique t2 :", t2)
