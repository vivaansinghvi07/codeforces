for _ in range(int(input())): input(); a = list(map(int, input().split())); even = sum([0 != n%2 for n in a[::2]]); odd = sum([1 != n%2 for n in a[1::2]]); print(odd if odd==even else -1)