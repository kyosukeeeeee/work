import { useState } from "react";

const Form = ({createTodo}) => {
    const [content, setContent] = new useState("");
    
    const addTodo = (e) => {
        e.preventDefault();

        const newTodo = {
            id: Math.floor(Math.random() * 1e5),
            content: content,
        };

        createTodo(newTodo);

        setContent("");
    }

    return (
        <form onSubmit={addTodo}>
            <input 
                type="text"
                value={content}
                onChange={(e) => setContent(e.target.value)} />
            <button type="submit">追加</button>
        </form>
    );
};

export default Form;