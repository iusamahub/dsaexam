import React, { useState } from "react";

export default function CaseExample(){

    let [changed, setChanged] = useState("");

    function handler(e){
        let ch = e.target.id
        switch(ch){
            case "uc":{
                let s = changed
                setChanged(s.toUpperCase())
                break;
            }
        }
    }

    function change(){
        let a = document.getElementById("text").value
        // console.log(a);
        setChanged(changed = a)
    }

    return(
        <>
        Enter text: <input type="text" name="text" id="text" onChange={change}/> <br /> <br />
        <p> {changed} </p>    <br /> <br />
    
        UC: <input type="radio" name="case" id="uc" onClick={handler}/> <br /> <br />
        LC: <input type="radio" name="case" id="lc" onClick={handler}/> <br /> <br />
        TC: <input type="radio" name="case" id="tc" onClick={handler}/> <br /> <br />

        </>
    )
}