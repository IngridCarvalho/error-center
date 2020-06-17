import React from 'react';
import Routes from './routes';
import Header from './elements/Header';
import Footer from './elements/Footer';


function App() {
	return (
		<>
			<Header />
				<main>
					<Routes />
				</main>
			<Footer />
		</>
	);
}

export default App;
