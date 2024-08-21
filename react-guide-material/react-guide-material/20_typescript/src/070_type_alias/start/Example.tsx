const Example = () => {
  // 練習用
  type User = {
    name: string, 
    age: number
  };

  const user: User = {name: 'Taro', age: 5};

  type UserName = string;
  type UserAge = number;
  type UserGender = 'man' | 'woman' | 'others';

  type UserProfile = {
    name: UserName,
    age: UserAge,
    gender: UserGender
  }

  const userProfile: UserProfile = {
    name: 'Taro',
    age: 20,
    gender: 'man'
  }
};

export default Example;
