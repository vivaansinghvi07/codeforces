print("\n".join([str(max(map(len, (a:=t.strip()).split(">")+a.split("<")))+1) for t in [*open(0)][2::2]]))