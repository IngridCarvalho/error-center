import React from 'react';
import Logon from './pages/Logon';

function App() {
	return (
		<div>
			<header>
				<h1>Central de Erros</h1>
				<nav>
					<ul>
						<li>Usuários</li>
						<li>Log de Erros</li>
						<li>Aplicações</li>
					</ul>
				</nav>
				<div>logout</div>
			</header>
			<main>
				<Logon />
			</main>
			<footer>
				<p>Project Development for AceleraDev Java - Codenation</p>
			</footer>
		</div>
	);
}

export default App;
