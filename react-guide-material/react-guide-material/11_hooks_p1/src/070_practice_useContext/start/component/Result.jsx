import { useCalcContext } from "../context/CalcContext"

const Result = () => {
    const state = useCalcContext();

    return (
        <h3>結果：{state.result}</h3>
    )
}

export default Result;