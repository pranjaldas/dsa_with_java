
const data=[
    {
        name: "Pranjal Das",
        age:27
    },

    {
        name: "Druna Baruah",
        age:22
    }
]
function getDatas() {
    console.log(data);
}
const createData =()=>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            data.push({
                name: "Utpal Da",
                age:24
            });
            let error= false;
            if(!error)
                resolve("data");
            else
                reject("Error occured");
        },1000);
    })
    
    
}

createData().then((data)=>{
    getDatas();
    console.log(data)}
).catch((error)=>{
    console.log(error)
});