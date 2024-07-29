import { useState } from "react";

const Example = () => {
  let [count, countFn] = useState(0);
  return (
    <>
      <h3>練習問題</h3>
      <p>カウントの更新（CountUpdate）と表示（CountResult）を別のコンポーネントに分離してください。Exampleコンポーネント内で現在のカウントの値を管理するstateを一つ定義してこれまでのレクチャーで実装したようなカウンターを作成してください。</p>

        <CountResult title="カウント" count={count} />
        <CountUpdate countFn={countFn} /> 
     
    </>
  );
};
const CountResult = ({title, count}) => <h3>{title}: {count}</h3>

const CountUpdate = ({countFn}) => {

  const countUp = () => {
    countFn(p => p + 1);
  };
  const countDown = () => {
    countFn(p => p - 1);
  };
  return (
    <>
      <button onClick={countUp}>+</button>
      <button onClick={countDown}>-</button>
    </>
  );
};

export default Example;
