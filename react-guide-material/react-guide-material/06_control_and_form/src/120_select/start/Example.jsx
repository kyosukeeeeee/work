import { useState } from "react";

const Example = () => {
  const [isSelected, setSelected] = new useState("Apple");
  const OPTIONS = ["Apple", "Banana", "Cherry"];
  return (
    <>
      <select value={isSelected} onChange={(e) => setSelected(e.target.value)}>
        {OPTIONS.map(opt => <option key={opt} value={opt}>{opt}</option>)}
      </select>
      <p>{isSelected}</p>
    </>
  );
};

export default Example;
