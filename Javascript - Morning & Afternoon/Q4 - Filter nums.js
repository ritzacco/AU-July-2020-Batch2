var arr = [10, 17, 18, 14, 15];

// Filter out nums less than 15
var brr = arr.filter(num => num >= 15);
console.log(brr); // [ 17, 18, 15 ]


// Print nums and indexes
brr.forEach((num, index) => {
    console.log(num, index);
});               
    // 17 0
    // 18 1
    // 15 2


// map and multiply by 10
var brr2 = brr.map((num) => num * 10);
console.log(brr2); // [ 170, 180, 150 ]

