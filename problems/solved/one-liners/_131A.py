a = input(); print("".join([c.lower() if c.isupper() else c.upper() for c in a]) if a.isupper() or len(a) == 1 or (a[0].islower() and a[1::].isupper()) else a)