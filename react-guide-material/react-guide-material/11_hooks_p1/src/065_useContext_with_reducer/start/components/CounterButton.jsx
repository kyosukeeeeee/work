import { useCounterDispatch } from "../context/CounterContext";

const CounterButton = ({calcType, step}) => {

    const dispatch = useCounterDispatch();

    const ClickHandler = () => {
        dispatch({ type: calcType, step });
    }
    
    return <button onClick={ClickHandler}>{calcType}{step}</button>
}
export default CounterButton;