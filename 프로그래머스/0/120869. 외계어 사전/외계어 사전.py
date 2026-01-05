def solution(spell, dic):
    answer = 0
    spell.sort()
    
    arr= [sorted(s) for s in dic]
    
    for s in arr:
        if(s==spell):
            return 1

    return 2