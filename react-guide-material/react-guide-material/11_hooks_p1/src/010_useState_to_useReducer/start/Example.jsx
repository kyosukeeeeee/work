import { useState, useReducer } from "react";

const Example = () => {
  const [state, setState] = useState(0);
  const [rstate, dispatch] = useReducer((prev, {type, step}) => {
    if(type === '+') {
      return prev + step;
    } else if(type === '-') {
      return prev - step;
    }
  }, 0)

  const countUp = () => {
    setState(prev => ++prev);
  }
  const rcountUp = () => {
    dispatch({ type: '+', step: 2 });
  }
  const rcountDown = () => {
    dispatch({ type: '-', step: 3 });
  }
  return (
    <>
      <h3>{state}</h3>
      <button onClick={countUp}>+</button>
      <h3>{rstate}</h3>
      <button onClick={rcountUp}>+</button>
      <button onClick={rcountDown}>-</button>
    </>
  );
};

export default Example;
