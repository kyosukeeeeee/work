const Example = () => {
  // 練習用
  function sum1(x: number,y: number) {
    return x + y
  }

  const result1 = sum1(1,2);
  console.log(result1);

  const sum2 = (x: number,y: number): number => x + y

  const result2 = sum2(10,20);

  console.log(result2);

  type Sum = (x: number,y: number) => number;
  const sum3: Sum = (x, y) => x + y;
  const result3 = sum3(50,60);
  console.log(result3);
};

export default Example;
