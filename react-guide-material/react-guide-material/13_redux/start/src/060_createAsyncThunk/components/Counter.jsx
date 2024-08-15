import { useSelector } from "react-redux"
import { add, minus, addAsync, addAsyncWithstatus } from "../store/modules/counter"

import CounterResult from "./CounterResult"
import CounterButton from "./CounterButton"

const Counter = () => {
    const status = useSelector(state => state.Counter.status);
    return (
        <>
            <CounterResult />
            <CounterButton step={2} calcType="+" actionCreator={add}/>
            <CounterButton step={2} calcType="-" actionCreator={minus}/>
            <CounterButton step={2} calcType="非同期(+)" actionCreator={addAsyncWithstatus}/>
            <h3>{status}</h3>
        </>
    )
}
export default Counter;