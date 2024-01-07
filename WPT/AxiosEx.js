import React from "react";
import axios from "axios";
import { useState } from "react";

export default function AxiosEx(){

    let [firstname,setfname]=useState("")

    function handler(){
        let promise = axios.get("https://reqres.in/api/users/2")
        promise.then((response) => {
            console.log(response.data.data.firs_tname)
            setfname(response.data.data.first_name)
        }, (reject) =>{
            console.log("something went wrong", reject)
        })
    }


    return(
        <>
            <input type="button" value="Axios" onClick={handler}/>
            <p> {firstname} </p>
        </>
    )
}