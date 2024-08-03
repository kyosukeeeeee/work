import { useReducer } from "react";

const CALC_OPTIONS = ["add", "minus", "divide", "divide"];

const reducer = (state,{type, payload}) => {
  switch(type) {
    case "change": {
      const {name, value} = payload
      return {
        ...state, [name]: value
      };
    }
    case "add": {
      return { ...state, result: Number(state.a) + Number(state.b) }
    }
    case "minus": {
      return { ...state, result: Number(state.a) - Number(state.b) }
    }
    case "divide": {
      return { ...state, result: Number(state.a) * Number(state.b) }
    }
    case "divide": {
      return { ...state, result: Number(state.a) / Number(state.b) }
    }
  }
}

const Example = () => {
  const initState = {
    a: 1,
    b: 2,
    result: 3,
  };

  const [state, dispatch] = useReducer(reducer,initState);

  const calculate = (e) => {
    dispatch({ type: e.target.value });
  };

  const numChangeHandler = (e) => {
    dispatch(
      {
        type: "change",
        payload: {name: e.target.name, value: e.target.value}
      }
    )
  }

  return (
    <>
      <div>
        <label htmlFor="">a:<input name="a" value={state.a} type="number" onChange={numChangeHandler} /></label>
      </div>
      <div>
        <label htmlFor="">b:<input name="b" value={state.b} type="number" onChange={numChangeHandler} /></label>
      </div>

      <select value={state.type} onChange={calculate}>
        {CALC_OPTIONS.map((calc) => {
          return <option key={calc} value={calc}>{calc}</option>
        })}
      </select>
      <h3>{state.result}</h3>
    </>
  );
};

export default Example;
