var str = "Hello this is me";
var pat1 = new RegExp("this");
console.log(pat1.exec(str)); // [ 'this', index: 6, input: 'Hello this is me', groups: undefined ]
var pat2 = new RegExp("apple");
console.log(pat2.exec(str)); // null

// *******************************************************

str = "I am now working here";
pat1 = new RegExp("now working");
console.log(pat1.test(str)); // true
pat2 = new RegExp("house");
console.log(pat2.test(str)); // false

// *******************************************************

str = "I will play at the World cup";
console.log(str.match(/lay/g));  // [
                                //'lay',
                                // index: 8,
                                // input: 'I will play at the World cup',
                                // groups: undefined
                                // ]

console.log(str.match(/number/g)); // null

// *******************************************************

str = "Wow today is a holiday";
console.log(str.search("a holi")); // 13
console.log(str.search("apple")); // -1

// *******************************************************

str = "I think PSG will win tonight!";
console.log(str.replace("PSG", "Bayern Munich")); // I think Bayern Munich will win tonight!

// *******************************************************

str = "Hello my friends how are you hope you are well";
var arrStr = str.split(" ");
console.log(arrStr); // ['Hello', 'my', 'friends', 'how', 'are', 'you', 'hope', 'you', 'are', 'well']
str = "There*are*two*cars";
console.log(str.split("*")); // [ 'There', 'are', 'two', 'cars' ]

// *******************************************************
