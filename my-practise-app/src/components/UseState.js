import React, { useState } from "react";

export default function UseState()
{
    const [incr, setIncr] = useState(0);
    // const [decr,setDecr]= useState(0)
    function increment()
    {
        // console.log("Button clicked")
        setIncr(incr + 1)
    }
    const decrement = (()=>{
        setIncr(incr-1)
    })
    return( 
        <>
            <input type="button" value="incr" onClick={increment} />
            <input type="button" value="decr" onClick={decrement}/>
            <p>{incr}</p>
            {/* <p>{decr}</p> */}
        </>
    )
}