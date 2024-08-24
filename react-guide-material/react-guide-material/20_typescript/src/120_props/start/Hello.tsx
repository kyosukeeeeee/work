type HelloProps = {
    text: string
    children: React.ReactNode
}
type FnProps = {
    fn: (text: string) => void
}

const Hello: React.FC<HelloProps> = (props) => {
    return <h1>{props.text} ! {props.children}</h1>
}

export const Btn: React.FC<FnProps> = (props) => {
    return <button onClickCapture={() => props.fn('TypeScript')}>ボタン</button>
}

export default Hello;