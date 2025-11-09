import './App.css'
import { RouterProvider } from 'react-router-dom'
import { route } from './provider/route'

function App() {
  return <>
  <RouterProvider router={route} />
  </>
}

export default App
