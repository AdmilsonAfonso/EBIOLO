import React from 'react'
import {BrowserRouter,Route,Routes} from 'react-router-dom'
import PaginaI from '../paginas/inicial/PaginaI'
import Produtos from '../paginas/DescrPro/Produtos'
import Vendedore from '../paginas/vendedores/Vendedore'
function Rout() {
  return (
   <BrowserRouter>
        <Routes>
          <Route path='/' element={<PaginaI/>}></Route>
          <Route path='/produtos' element={<Produtos/>}></Route>
          <Route path='/vendedor' element={<Vendedore/>}></Route>
          
        </Routes>
   
   </BrowserRouter>
  )
}

export default Rout