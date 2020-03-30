const givenNums = [3, 2, 4, 5, 51];
const target = 6;

function findTwoSum(givenNums,target) {
  let givenNumsMap = new Map();

  for(let i = 0; i < givenNums.length; i++) {
    let tmp = target - givenNums[i];
    if(givenNumsMap.has(tmp)) {
      return [givenNumsMap.get(tmp), i];
    }
    givenNumsMap.set(givenNums[i], i);
  }
}

console.log(findTwoSum(givenNums,target));
