print("\n".join([" ".join([str(i*2 if not n%2 and i==n//2 else i) for i in range(1, n+1)]) for n in map(int, [*open(0)][1::])]))