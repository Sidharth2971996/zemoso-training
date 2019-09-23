def islovely(n):
    s=str(n)
    d={}
    for i in range(len(s)):
        try:
            d[s[i]]=d[s[i]]+ 1
        except:
            d[s[i]]=1 
    for i in d:
        if d[i]>=3:
            return 0
    return 1
    
a=int(input())
b=int(input())
count=0
for i in range(a,b+1):
    
    if(islovely(i)==1):
        count+=1
print(count)

