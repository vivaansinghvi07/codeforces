print("\n".join([str(sum([min(10-i//10 if i//10>4 else i//10+1, 10-i%10 if i%10>4 else i%10+1) for i, c in enumerate(s) if c == "X"])) for s in (lambda x: [''.join(x[i:i+10]).replace('\n', '') for i in range(0, len(x), 10)])([*open(0)][1:])]))