list = [1,2,3,4,5]
start=0
end = len(list)-1
while(start<=end):
    print(list)
    list[start],list[end] = list[end],list[start]
    start+=1
    end -=1
    print(list)