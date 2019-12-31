////Introduced let and const

const val1 = 1;

let val2 = 1;

val2 = 2;

//different kind of calling functions

//standard call
const X = function() {};

// arrow function call
const Y = () => {
  console.log();
};

//difference between two functions

const testerObj = {
  // standart function
  // this create seperate context inside
  func1: function() {
    console.log("func1", this);
  },
  //arrow key function
  // this is equal to global execution thats why it is useful for listener and events
  func2: () => {
    console.log("func2", this);
  }
  //
};
//////////////////////////////////////////////
/// external calls
const square1 = function(a) {
  return a * a;
};

const square = a => {
  return a * a;
};

[1, 2, 3, 4].map(a => a * a);

//////////////////////////////////////////////

// getting reference of object
const mystery = "answer";
const Inverse = 1 / Math.PI;

const obj = {
  p1: 10, // property
  p2: 20, // property that holds a function
  f1() {}, //property that holds regular function
  f2: () => {},
  [mystery]: 42,
  Inverse // property that holds array function
};

//we call reference of mystery
// console.log(obj.answer);

// console.log(obj.Inverse);
/////////////////////////////////////

// destructuring syntax
