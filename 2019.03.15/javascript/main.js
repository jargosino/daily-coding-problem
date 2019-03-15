
function productOfAllButOne(numList) {
    let result = []
    for (let i=0; i < numList.length; i++) {
        result[i] = 1;
        for (let j=0; j < numList.length; j++) {
            if (i != j) result[i] *= numList[j];
        }
    }
    return result;
}

const numList1 = [1, 2, 3, 4, 5];
const numList2 = [3, 2, 1];

console.log("Input:", numList1);
console.log("Output:", productOfAllButOne(numList1));
console.log("Input:", numList2);
console.log("Output:", productOfAllButOne(numList2));