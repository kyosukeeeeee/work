import {useState} from "react"

const Example = () => {
  const [val, setFun] = useState();
  return (
    <>
      <input type="text"
      onChange = {(e) => {
        setFun(e.target.value)
      }} /> = {val}
    </>
  );
};

export default Example;
