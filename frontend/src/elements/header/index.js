import React from 'react';
import './header.scss';
import logoImg from '../../assets/imgs/logo.png';

import { Link } from 'react-router-dom';


function Header() {
    return (
        <header>
            <div className="title">
                <div className="title__main">
                    <h1>Central de Erros</h1>
                    <img src={logoImg} alt="Imagem de exclamação, alerta" />
                </div>

                <div className="title__btn">logout</div>
            </div>
            <nav>
                <ul className="menu">
                    <li className="menu__item"><Link to="/users">Usuários</Link></li>
                    <li className="menu__item"><Link to="/errors-log">Log de Erros</Link></li>
                    <li className="menu__item"><Link to="/applications">Aplicações</Link></li>
                </ul>
            </nav>
        </header>
    );
}

export default Header;