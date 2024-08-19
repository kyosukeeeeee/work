import ClientComp from "./components/ClientComp"
import { ENDPOINT } from "@/constants"
import ArticleList from "@/components/articleList"

//http://localhost:4020/010_SSR/1
export default async function SSR() {

    const article = await fetch(ENDPOINT).then(res => res.json());

    return (
        <>
            <div>SSR Page.</div>
            <ClientComp />
            <ArticleList list={article} basePath="/010_SSR" />
        </>
    )
}