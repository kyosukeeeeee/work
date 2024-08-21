const Example = () => {
  // 練習用
  let strOrNum: string | number = 'Hello';
  strOrNum = 123;

  let strOrNumOrBool: string | number | boolean = 'Hello';
  strOrNumOrBool = true;

  let helloOrNumOrBool: 'Hello' | number | boolean = 'Hello';

  type HelloOrNum = 'Hello' | number;
  const hello: HelloOrNum = 'Hello';

  
};

export default Example;
