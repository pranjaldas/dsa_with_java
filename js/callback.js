
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
const createData =(callback)=>{
    setTimeout(()=>{
        data.push({
            name: "Utpal Da",
            age:24
        });
        callback();
    },1000);
    
}

createData(getDatas);