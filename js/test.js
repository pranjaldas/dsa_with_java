const getJSON = async () => {
    const request = () => new Promise((resolve, reject) => (
      setTimeout(() => resolve({ foo: 'bar'}), 2000)
    ));
  
    const json = await request();
    return json;
}
// getJSON().then((data)=>{
//  console.log(data);
// }).catch((error)=>{
//     console.log(error);
// })
const getDatas = async() =>{
    return [{name: "Pranjal Das",age:27},{name: "Druna Baruah",age:22}];
}
getDatas().then((data)=>{
    console.table(data);
    data.forEach((each)=>{
        console.table(each);
    });
}).catch((error)=>{
    console.log(error);
});

