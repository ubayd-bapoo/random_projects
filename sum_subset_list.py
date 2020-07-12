# Python Program to Print the sum of a subset against a target value  
# all subsets of given size of a set
# arr[] ---> Input Array or original set

import itertools
def findsubsets(S,m):
    return set(itertools.combinations(S, m))
  
  
# Driver Code 
arr = [18897109, 
       12828837, 
       9661105, 
       6371773, 
       5965343, 
       5926800, 
       5582170, 
       5564635, 
       5268860, 
       4552402, 
       4335391, 
       4296250, 
       4224851, 
       4192887, 
       3439809, 
       3279933, 
       3095213, 
       2812896, 
       2783243, 
       2710489, 
       2543482, 
       2356285, 
       2226009, 
       2149127, 
       2142508, 
       2134411
       ]

n = len(arr)
set_equal_target = []

target = 101000000
for i in range(len(arr)):
    for sets in findsubsets(arr, i):
        if sum(sets) == target:
            set_equal_target.append(sets)

for sets in set_equal_target:
    print(sets)
