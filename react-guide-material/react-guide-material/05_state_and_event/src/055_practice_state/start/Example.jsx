import { useState } from "react";
 
const Example = () => {
  let [count, setCount] = useState(0);

  const up = () => setCount(++count);
  const down = () => setCount(--count);

  return (
    <>
      <h3>練習問題</h3>
      <p>
        記述を変更し、完成コードのように+と-ボタンをクリックすると現在のカウント数が1ずつ増減する機能を実装してください。*useStateを用いてcountとsetCountを定義してください。
      </p>
      <p>現在のカウント数: {count}</p>
      <button onClick={up}>+</button>
      <button onClick={down}>-</button>
    </>
  );
};

export default Example;
