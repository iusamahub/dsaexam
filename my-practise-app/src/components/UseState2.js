import React,{useState} from "react";

export default function UseState2()
{
    let [greet,setGreet]=useState("hello")
    const Print=(()=>{
        setGreet(
            greet= "Adios Amigos!!!"
        )
    })

    return(
        <>
        <input type="button" value="greetings" onClick={Print} />
        <p><h3>{greet}</h3></p>
        </>
    )
}