import Hello from "./Hello";
import {Btn} from "./Hello";

const Example = () => {
  // 練習用
  return (
    <>
    <Btn fn={(text) => console.log(`Hello ${text}`)} />
      <Hello text="Type Script">children</Hello>
    </>
  )
};

export default Example;
