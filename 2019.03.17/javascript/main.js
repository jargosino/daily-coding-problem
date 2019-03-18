function findLowestPositive(numList) {
    // find the min and max num
    const min = Math.min(...numList);
    const max = Math.max(...numList);

    // loop from min to max by an increment of 1
    let num;
    for(num=min; num <= max; num++) {
        // check if num is not in the array and a positive 
        if (!numList.includes(num) && num > 0) {
            return num;
        }
    }
    return num;
}

let numList1 = [3, 4, -1, 1];
let result1 = findLowestPositive(numList1);

let numList2 = [1, 2, 0];
let result2 = findLowestPositive(numList2);

console.log(numList1, " ->", result1)
console.log(numList2, " ->", result2)
