const Example = () => {
  // 練習用
  const arry1: number[] = [1,2,3];
  const arry2: str[] = ['hello', 'bye'];
  const arry3: Array<number> = [1,2,3];
  const arry4: (string | number)[] = [1, 'hello'];

  const obj1: { name: string, age: number} = { name: 'Kyosuke', age: 28};
  // obj1.age = 'hello';
  type Person = { name: string, age?: number};
  const obj2: Person = {name: 'aaa', age: 30};

  const users: Person[] = [
    { name: 'miyu' },
    { name: 'Hanako', age: 90 }
  ]
};

export default Example;
