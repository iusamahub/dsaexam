import React,{useState} from "react";

export default function Handler()
{   
    let [week,setWeek]=useState("")
    let weekDay=((event)=>{
         let ch=event.target.value;
         console.log(typeof(ch));
         switch(ch){
            case '1':
            setWeek(week="Monday");
            break;
            case '2':
            setWeek(week="Tuesday");
            break; 
            case '3':
                setWeek(week="Wednesday");
                break;
                case '4':
                setWeek(week="Thursday");
                break;     

         }

    })
    return(
        <>
        <select onChange={weekDay}>
          <option value="Select">Select</option> 
          <option >1</option> 
          <option >2</option> 
          <option >3</option> 
          <option >4</option>  
        </select>
        <p>{week}</p>
        </>
    )
}