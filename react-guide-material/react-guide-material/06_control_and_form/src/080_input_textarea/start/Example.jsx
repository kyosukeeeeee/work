import { useState } from "react";

const Example = () => {

  const [val, setVal] = new useState();

  const clearVal = () => setVal("");

  return (
    <>
      <p style={{ textAlign: "center" }}>{val}</p>
      <div>
        <input type="text" value={val} onChange={(e) => setVal(e.target.value)} />
        <textarea value={val} onChange={(e) => setVal(e.target.value)} />
      </div>
      <button onClick={clearVal}>クリア</button>
    </>
  );
};

export default Example;
