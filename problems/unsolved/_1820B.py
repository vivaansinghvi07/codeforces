for _ in range(int(input())): s = input(); a = min(max(map(len, (s * 2).split("0"))), len(s)); print(max(a, ((a+1)//2)*((a + 1) - (a + 1)//2)))