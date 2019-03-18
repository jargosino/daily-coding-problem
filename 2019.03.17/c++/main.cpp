#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int findLowestPositive(vector<int> const &numList) {
    // find min and max value
    int min = *min_element(numList.begin(), numList.end());
    int max = *max_element(numList.begin(), numList.end());

    // iterate from min to max by an increment of 1
    int num;
    for (num = min; num <= max; num++) {
        // check if num is not on numList
        for(auto i = numList.begin(); i != numList.end(); i++) {
            if (num == *i) {
                goto continue_out; 
            }
        }
        // check if num is a positive
        if (num > 0) return num;
        continue_out:;
    }
    return num;
}


int main() {
    vector<int> numList1 {3, 4, -1, 1};
    vector<int> numList2 {1, 2, 0};

    int result1 = findLowestPositive(numList1);
    int result2 = findLowestPositive(numList2);

    cout << "result1: " << result1 << endl;
    cout << "result2: " << result2 << endl;

    return 0;
}