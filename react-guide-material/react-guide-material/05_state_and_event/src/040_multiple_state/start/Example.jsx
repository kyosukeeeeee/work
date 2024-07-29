import { useState } from "react";

const Example = () => {
    let [valA, setFunA] = useState(0);
    let [valB, setFunB] = useState(0);
    let [valC, setFunC] = useState(0);
    return (
        <>
            <p>ボタンAを{valA}回押しました！</p>
            <button onClick = {() => {
                setFunA(++valA);
            }}>ボタンA</button>
            <p>ボタンBを{valB}回押しました！</p>
            <button onClick = {() => {
                setFunB(++valB);
            }}>ボタンB</button>
            <p>ボタンCを{valC}回押しました！</p>
            <button onClick = {() => {
                setFunC(++valC);
            }}>ボタンC</button>
        </>
    )
};

export default Example;
