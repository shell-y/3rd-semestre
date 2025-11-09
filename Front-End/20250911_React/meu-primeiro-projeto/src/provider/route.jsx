import { createBrowserRouter } from "react-router-dom";
import { ContadorPage } from "../pages/ContadorPage";
import { CardNarutoPage } from "../pages/CardNarutoPage";
import { ListaTelefonicaPage } from "../pages/ListaTelefonicaPage";
import { PilhaPage } from "../pages/PilhaPage";

export const route = createBrowserRouter([
    {
        path: "/",
        element: <PilhaPage/>
    },
    {
        path: "/contador",
        element: <ContadorPage/>
    },
    {
        path: "/card-naruto",
        element: <CardNarutoPage/>
    },
    {
        path: "/lista-telefonica/:id",
        element: <ListaTelefonicaPage/>
    },
    {
        path: "/pilha",
        element: <PilhaPage/>
    }
])