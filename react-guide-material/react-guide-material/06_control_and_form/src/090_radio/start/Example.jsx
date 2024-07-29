import { useState } from "react";

const Example = () => {

  const [fruit, setFruit] = new useState("Apple");
  const onChange = (e) => setFruit(e.target.value);

  const RADIO_COLLECTION = ["Apple", "Banana", "Cherry"];

  return (
    <>
      {RADIO_COLLECTION.map(value => {
        return (
          <label htmlFor="" key={value}>
            <input type="radio" value={value} checked={fruit == value} onChange={onChange} />
            {value}
          </label>
        );
      })}
      <p>{fruit}</p>
    </>
  );
};

export default Example;
