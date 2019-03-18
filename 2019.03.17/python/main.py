def findLowestPositive(numList): 
    # get min and max num
    min_num = min(numList)
    max_num = max(numList)

    # iterate from min_num to max_num incrementing by 1
    for num in range(min_num, max_num+1):
        if not num in numList and num > 0:
            return num
        elif num == max_num:
            return num+1

numList1 = [3, 4, -1, 1]
numList2 = [1, 2, 0]

result1 = findLowestPositive(numList1)
result2 = findLowestPositive(numList2)

print(numList1, " ->", result1)
print(numList2, " ->", result2)