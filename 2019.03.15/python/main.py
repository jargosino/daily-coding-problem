def productOfAllButOne(numList):
    result = []
    for i in range(len(numList)):
        result.append(1)
        for j in range(len(numList)):
            if i != j:
                result[i] *= numList[j]
    return result

if __name__ == "__main__":
    numList1 = [1, 2, 3, 4, 5]
    numList2 = [3, 2, 1]

    print(numList1, "->", productOfAllButOne(numList1))
    print(numList2, "->", productOfAllButOne(numList2))