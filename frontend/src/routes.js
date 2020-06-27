import React from 'react';
import { Switch, Route } from 'react-router-dom';
import Logon from './pages/Logon';
import Home from './pages/Home';
import Users from './pages/Users';
import Applications from './pages/Applications';
import ErrorsLog from './pages/ErrorsLog';

function Routes() {
    return(
            <Switch>
                <Route path="/" exact component={Home} />
                <Route path="/login" component={Logon} />
                <Route path="/users" component={Users} />
                <Route path="/applications" component={Applications} />
                <Route path="/errors-log" component={ErrorsLog} />
            </Switch>
    )
}

export default Routes;