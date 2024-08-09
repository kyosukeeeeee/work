import { useEffect, useState, useLayoutEffect } from "react";

const Example = () => {
  const [isDisp, setIsDisp] = useState(true);

  return (
    <>
      {isDisp && <Timer/>}
      <button onClick={() => setIsDisp(prev => !prev)}>非表示</button>
    </>
  )
}

const Timer = () => {
  const [time, setTime] = useState(0);
  const [isRunning, setRunning] = useState(false);

  useEffect(() => {
    let intervalId = null;
    if(isRunning) {
      intervalId = window.setInterval(() => {
        setTime(prev => prev + 1);
      }, 1000);
    }
    return () => {
      window.clearInterval(intervalId)
    }
  }, [isRunning])

  const toggle = () => {
    setRunning(prev => !prev);
  }

  const reset = () => {
    setRunning(false);
    setTime(0);
  }

  return (
    <>
      <h3>
        <time>{time}</time>
        <span>秒経過</span>
      </h3>
      <div>
        <button onClick={toggle}>{isRunning ? "スタート" : "一時停止"}</button>
        <button onClick={reset} >リセット</button>
      </div>
    </>
    );
};

export default Example;
