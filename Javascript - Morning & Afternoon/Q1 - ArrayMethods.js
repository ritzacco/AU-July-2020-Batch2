var arr = [7, 6, 5, 4, 3];
var brr = [1, 2, 3];

// *******************************************************

var concatedArr = arr.concat(brr);
console.log(concatedArr); // [7, 6, 5, 4, 3, 1, 2, 3]

// ******************************************************

function isPositive(num){
    return num > 0;
}
var checkPositivity = arr.every(isPositive); // true
console.log(checkPositivity);

// *******************************************************

function isEven(num){
    return num % 2 == 0;
}
var evenArr = arr.filter(isEven); // [6, 4]
console.log(evenArr);

// *******************************************************

function multiplyBy10(num){
    num = num * 10;
    console.log(num);
}
arr.forEach(multiplyBy10);  // 70
                            // 60
                            // 50
                            // 40
                            // 30

// *******************************************************

var index = arr.indexOf(5); // 2
console.log(index);
index = arr.indexOf(100); // -1
console.log(index);

// *******************************************************

var alljoined = arr.join('xxx'); // 7xxx6xxx5xxx4xxx3
console.log(alljoined);

// *******************************************************

var lastindex = arr.lastIndexOf(6);
console.log(lastindex); // 1

// *******************************************************

function mapFunc(num){
    num = num + "wow";
    return num;
}
var mappedArr = arr.map(mapFunc);
console.log(mappedArr); // [ '7wow', '6wow', '5wow', '4wow', '3wow' ]

// *******************************************************

var popped = arr.pop(); // 3
console.log(popped); 

// *******************************************************

arr.push(90);
console.log(arr); // [ 7, 6, 5, 4, 90 ]

// *******************************************************

function sum(total, num){
    return total + num;
}
var resLeft2Right = arr.reduce(sum); // 112
console.log(resLeft2Right);

// *******************************************************

var resRight2Left = arr.reduceRight(sum); // 112
console.log(resRight2Left)

// *******************************************************

var revArr = arr.reverse(); // [ 90, 4, 5, 6, 7 ]
console.log(revArr);

// *******************************************************

var first = arr.shift(); // 90
console.log(first);

// *******************************************************

var temp = arr.slice(2, 4); // [ 6, 7 ]
console.log(temp);

// *******************************************************

function evenExists(num){
    return num % 2 == 0;
}
console.log(arr.some(evenExists)); // true

// *******************************************************

// console.log(arr.toSource()); // Doesn't work on VS Code
                             // According to official documentation
                             // This feature is obsolete. Although it may still work in some browsers,
                             // its use is discouraged since it could be removed at any time. Try to avoid using it.
                             // https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/toSource

// *******************************************************

var sorted = arr.sort(); // [ 4, 5, 6, 7 ]
console.log(sorted);

// *******************************************************

arr.splice(3, 0, 101); // [ 4, 5, 6, 101, 7 ]
console.log(arr);

// *******************************************************

var str1 = arr.toString(); // 4,5,6,101,7
console.log(str1);

// *******************************************************

arr.unshift(200); // [ 200, 4, 5, 6, 101, 7 ]
console.log(arr);

// *******************************************************

