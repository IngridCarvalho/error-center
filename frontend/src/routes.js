import React from 'react';
import { BrowserRouter, Switch } from 'react-router-dom';
import Logon from './pages/Logon';
import Home from './pages/Home';

function Routes() {
    return(
        <BrowserRouter>
            <Switch>
                <Route path="/" exact component={Home} />
                <Route path="/login" component={Logon} />
            </Switch>
        </BrowserRouter>
    )
}

export default Routes;