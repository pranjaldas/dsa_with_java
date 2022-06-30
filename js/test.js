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
    return 123;
}
getDatas().then((data)=>{
    console.log(data)
});

