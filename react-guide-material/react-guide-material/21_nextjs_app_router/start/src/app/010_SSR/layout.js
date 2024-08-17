import { useDebugValue } from "react";

export default function SubLayout({children}) {
    return (
        <div style={{ background: 'red' }}>
            {children}
        </div>
    )
}