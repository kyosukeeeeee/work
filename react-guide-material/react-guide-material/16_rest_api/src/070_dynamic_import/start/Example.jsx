import { add } from "./add"

const Example = () => {
    import("./add").then(module => {
        
    })
    console.log(add(1,2));
};

export default Example;
