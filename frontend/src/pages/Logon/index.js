import React, { useState } from 'react';
import ApiHelper from '../../helpers/ApiHelper';

function Logon() {

    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    const handleLogin = async (e) => {
        e.preventDefault();

        const data = {
            username,
            password
        };

        try {
            const response = await ApiHelper.post('login', data);

            localStorage.setItem("TokenAutenticação", response.headers.authorization);
        } catch (error) {
            alert('falha no login');
        }
    }

    return (
        <section>
            <form onSubmit={handleLogin}>
                <input type="text" placeholder="Informe seu username" 
                    value={username} onChange={e => setUsername(e.target.value)}/>
                <input type="password" placeholder="Informe sua senha" 
                    value={password} onChange={e => setPassword(e.target.value)}/>

                <button type="submit">Acessar</button>
            </form>
        </section>
    );
}

export default Logon;