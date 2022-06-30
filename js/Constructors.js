// let user={
//     name:"Pranjal",
//     sayName(){
//         this.age= "24";
//         console.log(`The name is :${this.name}`);
//     }
// }
// user.sayName();
// for(let key in user){
//     console.log(`${key} : ${user[key]}`);
// }

// let user1 = {
//     street:"kek",
//     address:"address"

// };
// console.log(user1?.street?.address);

function makeUser() {
    return {
      name: "John",
      ref: this
    };
  }
  
let user = makeUser();

console.log( user.ref );