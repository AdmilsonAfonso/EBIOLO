import React from 'react'
import './Head.css'
import Biolo from '../img/biolo.png'
import { useState } from 'react'

function Heade() {

  const [mostarLogin, setMostrarLogin] = useState()

  const handleLoginClick = () => {
    setMostrarLogin(true);
  };
  const handleCloseClick = () => {
    setMostrarLogin(false);
  };


  return (
    <div className='menu'>
        <img src={Biolo} alt="" className='fto'/>
        <p >AS RUAS AGORA ESTÃO NA NET VEM BIOLAR</p>
        <div className="pesquisa">
            <input type="text" placeholder='     pesquisar o biolo ...' name="" id="" />
            <button>pesquisar</button>
        </div>
        <ul className='links'>
            <li onClick={handleLoginClick}>BIOLAR</li>
            <li>SOBRE</li>
            <li>img</li>
        </ul>  
        {mostarLogin && (
        <div className="login-modal">
          <div className="modal-content">
            <div className="letras">
              <h2>Login</h2>
              <p className='fechar' onClick={handleCloseClick}>X</p>
            </div>
            
            <input type="text" placeholder="Username" />
            <input type="password" placeholder="Password" />
            <button onClick={handleCloseClick}>Biolar</button>
          </div>
        </div>
      )}
        
    </div>
  )
}

export default Heade