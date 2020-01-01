/////////////// Difference between constant and let  : arrow and regular ///////////////////////////////////////////

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

/////////////// Difference between two functions : arrow and regular ///////////////////////////////////////////

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
//////////////////////////////////////////////  external calls /////////////////////////
/// external calls
const square1 = function(a) {
  return a * a;
};

const square = a => {
  return a * a;
};

[1, 2, 3, 4].map(a => a * a);

//////////////////////////////ASSIGNING PROPERTIES To OBJECT /////////////////////////////////

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

// console.log(mystery);

//we call reference of mystery
// console.log(obj.answer);

// we call Inverse here

// console.log(obj.Inverse);
///////////////////STRUCTURING AND DESTRUCTURING /////////////////////////

const { Component, Fragment, useState } = require("react");

// destructuring syntax

// standard declaration
// const PI = Math.PI;
// const E = Math.E;
// const SQRT2 = Math.SQRT2;

const { PI, E, SQRT2 } = Math;

const circle = {
  label: "circleX",
  radius: 2
};

// circle are function that accept object as an argument
const circleArea = ({ radius }, { precision = 2 }) =>
  (PI * radius * radius).toFixed(precision);

// console.log(
//   circleArea(circle)
// );)

// console.log(circleArea(circle, { precision: 5 }));

///////////// REST OPERATOR ////////////////////////////////////

///this is equivalent of tail in some languages
// main differebce between these two:

const [first, ...restItems] = [10, 20, 30, 40]; // this is an array

const { first2, ...restItems2 } = [10, 20, 30, 40]; // this is hashmap

const data = {
  temp1: "001",
  temp2: "002",
  name1: "name1",
  name2: "name2"
};

const { temp1, temp2, ...person } = data;

const newArray = [...restItems];

// console.log(restItems[0]);

console.log(data.person);
// console.log(data.temp2);

///////////////////////TEMPLATE STRINGS ////////////////////////////////

// normal string init
const object1 = "Hello";

const html = `
<div>
${Math.random()}
</div>`;

console.log(html);
