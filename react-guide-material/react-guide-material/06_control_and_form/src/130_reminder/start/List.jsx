const List = ({todos,deleteTodo}) => {
    const complate = (id) => {
        deleteTodo(id);
    }
    return (
        <>
            {todos.map(todo => {
                return (
                    <div key={todo.id}>
                        <button onClick={() => complate(todo.id)}>完了</button><span>{todo.content}</span>
                    </div>
                )
            })}
        </>
    );
}

export default List;