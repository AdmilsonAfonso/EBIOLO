import { useState } from 'react'
import './App.css'
import PaginaI from './paginas/inicial/PaginaI'
import Produto from './componenes/body/produto'
import Produtos from './paginas/DescrPro/Produtos'
import Rout from './router/Rout'

function App() {

  return (
    <div>
      <Rout/>
    </div>
  )
}

export default App
