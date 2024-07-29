import { useState } from "react";

const Example = () => {

    const [count, setCount] = useState(0);
    
    const countup = () => setCount(count + 1);
    const countdown = () => setCount(count - 1);

    return (
        <>
            <p>現在のカウント数: {count}</p> 
            <button onClick={countup}>+</button>
            <button onClick={countdown}>-</button>
        </>
    )
};

export default Example;
