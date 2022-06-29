/*
* REMEMBER THAT async FUNCTION ALWAYS RERTURNS A PROMISE.
* WE CAN NOT USE AWAIT WITHOUT A ASYNC ENVIRONMENT
* AWAIT ALWAYS EXPECTS A PROMISE TO RETURN, ALTHOUGH WE DO NOT RETURN PROMISE EXPLICITELY 
* THE JS ENGINE WILL WRAP THE RETURN THE DATA WITH A PROMISE
*/
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
    }); 
}
async function start(){
    await createData();
    getDatas();
}
start();