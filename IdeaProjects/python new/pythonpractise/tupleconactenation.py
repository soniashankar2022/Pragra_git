T1 = (10,20,30,40)
T2 = ('one', 'two', 'three', 'four')
L1, L2 = list(T1), list(T2)
L3 = [y for x in [L1, L2] for y in x]
L3 = []
for x in [L1, L2]:
    for y in x:
        L3.append(y)
T3 = tuple(L3)
print ("Joined Tuple:", T3)