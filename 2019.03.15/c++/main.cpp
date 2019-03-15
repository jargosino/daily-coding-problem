#include<iostream>
#include<vector>

std::vector<int> productOfAllButOne(std::vector<int> const &numList){
    std::vector<int> result;
    for (int i=0; i<numList.size(); i++) {
        result.push_back(1);
        for (int j=0; j<numList.size(); j++) {
            if (i != j) result[i] *= numList[j];
        }
    }
    return result;
}

int main() {

    static const int numList1_arr[] = {1, 2, 3, 4, 5};
    static const int numList2_arr[] = {3, 2, 1};

    std::vector<int> numList1(numList1_arr, numList1_arr + sizeof(numList1_arr) / sizeof(numList1_arr[0]));
    std::vector<int> numList2(numList2_arr, numList2_arr + sizeof(numList2_arr) / sizeof(numList2_arr[0]));

    std::vector<int> result1 = productOfAllButOne(numList1);
    std::vector<int> result2 = productOfAllButOne(numList2);

    for(int i=0; i<result1.size(); i++) {
        std::cout << result1[i] << " ";
    }
    std::cout << std::endl;

    for(int i=0; i<result2.size(); i++) {
        std::cout << result2[i] << " ";
    }
    std::cout << std::endl;

    return 0;
}