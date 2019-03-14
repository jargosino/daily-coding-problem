"""
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?

"""

def doesItAddUp(numList, k):
    for i in range(len(numList)-1):
        for j in range(i+1, len(numList)):
            sum = numList[i] + numList[j]
            if sum == k:
                return True
    return False

if __name__ == "__main__":
    numList = [10, 15, 3, 7]
    k = 25
    print(doesItAddUp(numList, k))