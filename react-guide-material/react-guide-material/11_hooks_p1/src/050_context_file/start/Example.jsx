import "./Example.css";
import Header from "./components/Header";
import Main from "./components/Main";
import { ThemeProveider } from "./context/ThemeContext";

const Example = () => {

  return (
    <ThemeProveider>
      <Header></Header>
      <Main></Main>
    </ThemeProveider>
  );

};

export default Example;
