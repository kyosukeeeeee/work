import { useContext } from "react";
import { Mycontext } from "../Example";

const GrandChild = ({ value }) => {
  const contextValue = useContext(Mycontext)
  return (
      <div style={{ border: "1px solid black" }}>
        <h3>孫コンポーネント</h3>
        {contextValue}
      </div>
  );
};
export default GrandChild;
