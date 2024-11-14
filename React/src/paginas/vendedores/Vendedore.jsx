import React from "react";
import Heade from "../../componenes/head/Heade";
import Footer from "../../componenes/footer/Footer";


import './vendedor.css'




function Vendedore() {
  return (
    <div className="produtos">
      <Heade />
      <div className="todos">
          <div>
            <div className="corp">
              <div className="imagenp">
                <img src="" alt="" />
              </div>
              <div className="informP"></div>
            </div>
            <div className="DescP"></div>
          </div>
      
        <div className="listaP"></div>
      </div>
      <Footer />
    </div>
  );
}

export default Vendedore;
