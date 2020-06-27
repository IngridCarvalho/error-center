import React from 'react';
import Routes from './routes';
import Header from './elements/Header';
import Footer from './elements/Footer';
import { BrowserRouter } from 'react-router-dom';


function App() {
	return (
		<BrowserRouter>
			<>
				<Header />
					<main>
						<Routes />
					</main>
				<Footer />
			</>
		</BrowserRouter>
	);
}

export default App;
