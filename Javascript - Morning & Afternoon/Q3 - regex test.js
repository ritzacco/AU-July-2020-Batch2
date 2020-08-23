var str = prompt("Enter string : ");

// Begins with "The" or "the" and ends with "hello"
const reg1 = RegExp(/^([T]|[t])he.*hello$/);
console.log(reg1.test(str)); 
// "The quick brown fox hello" returns true;
// "the quick hello" returns true;
// "the quick" returns false
// "hello quick hello" returns false
// "the hello" returns true


// h --one or zero vowel--one character--t
const reg2 = RegExp(/[h][aeiou]?.t/);
console.log(reg2.test(str));

// "homt" returns true
// "hot" returns true
// "help " returns false

