I, IN, M, R, LN, LS, P, S, ST, A, SO, MX, MN = int, input, map, range, len, list, print, sum, str, abs, sorted, max, min
n = I(IN())
a = LS(M(I, IN().split()))
s = a.index(MX(a)) + a[::-1].index(MN(a))
P(s-1 if s >= n else s)