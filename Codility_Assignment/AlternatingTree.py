from itertools import combinations
# check if the given array is satisfying the condition
def isPleasing(arr):
	for i in range(1,len(arr)-1):
		if((arr[i]>arr[i-1] and arr[i]>arr[i+1]) or (arr[i]<arr[i-1] and arr[i]<arr[i+1])):
		
			continue
 
		else:
			return 0
 
	return 1

def getCountofCuts(arr):
    #check if the array is already pleasing 
    if(isPleasing(arr)==1):
        return 2
    
    count=0
    #generate all the combinations of length n-1 and iterate through them to check if the combination is Pleasing
    arr=list(combinations(arr,len(arr)-1))
    for i in arr:
        
        if isPleasing(list(i))==1:
            count+=1
        
    return count
#input the number of elements in array
n=int(input())    
#input the array elements
arr=list(map(int,input().split()))
if(getCountofCuts(arr)==2):
    print("0")
elif(getCountofCuts(arr)==0):
    print("-1")
else:
    print(getCountofCuts(arr))



