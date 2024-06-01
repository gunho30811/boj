import sys
from collections import defaultdict

tree_count=defaultdict(int)
total_trees=0

input=sys.stdin.read().strip().split('\n')

for line in input:
    tree=line
    tree_count[tree] +=1
    total_trees+=1
    
for tree in sorted(tree_count):
    per=(tree_count[tree] / total_trees) *100
    print(f"{tree} {per:.4f}")
    


