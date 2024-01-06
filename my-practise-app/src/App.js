import './App.css';
import Hello from './components/Hello';
import Byw from './components/Byw'
import Array from './components/Array'
import UseState from './components/UseState';
import UseState2 from './components/UseState2';
import Handler from './components/Handler';



function App() {

  let arr = [1,2,3]

  return (
    <div className="App">
      {/* <Hello name="kiran"/>
      <Hello name="usama"/> */}
      {/* <Array nums = {arr} /> */}
      {/* <UseState />
      <UseState2/> */}
      <Handler/>
      
      <Byw />
    </div>
  );
}

export default App;
