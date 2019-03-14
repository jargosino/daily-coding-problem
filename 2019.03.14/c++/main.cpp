// Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
// For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
// Bonus: Can you do this in one pass?

#include<iostream>
#include<vector>

bool doesItAddUp(std::vector<int> const &numList, int k);

int main() {
    static const int arr[] = {10, 15, 3, 7};
    std::vector<int> numList (arr, arr + sizeof(arr) / sizeof(arr[0]));
    int k = 17;
    
    std::cout << (doesItAddUp(numList, k) ? "TRUE" : "FALSE");
    return 1;
}

bool doesItAddUp(std::vector<int> const &numList, int k) {
    for (int i=0; i < numList.size()-1; i++) {
        for (int j=i+1; j < numList.size(); j++) {
            if(numList[i] + numList[j] == k) return true;
        }
    }
    return false;
}
