// Initializing a constructor function
// function Hero(name, level) {
//   this.name = name;
//   this.level = level;
// }
// this is both the same
////// java script OOP
class Hero {
  constructor(name) {
    this.name = name;
  }
  hi() {
    console.log(`Hello Hero ${this.name}`);
  }
}

class SubHero extends Hero {
  constructor(name, subName) {
    super(name);
    this.subName = subName;
  }
  hi() {
    console.log(`Hello SubHero ${this.name}`);
  }
}

const object = new Hero("hero");
const object2 = new SubHero("hero", "subhero");

console.log(object.hi);

////////////////////// promise objects usage /////
