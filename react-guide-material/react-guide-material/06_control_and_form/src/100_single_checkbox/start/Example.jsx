import { useState } from "react";

const Example = () => {
  const [flg, setFlg] = new useState(false);
  const toggleChecked = (e) => setFlg(prev => !prev);
  return (
    <>
      <div>
        <label htmlFor="my-check">チェック：</label>
        <input type="checkbox" id="my-check" checked={flg} onChange={() => toggleChecked()} />
      </div>
      <p>{flg ? "ON" : "OFF"}</p>
    </>
  );
};

export default Example;
