
import Dashboar from 'pages/Dashboard';
import Home from 'pages/home';
import { BrowserRouter, Route, Switch } from 'react-router-dom';

function Routes() {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/" exact>
                    <Home />
                </Route>
                <Route path="/dashboard" exact>
                    <Dashboar />
                </Route>
            </Switch>


        </BrowserRouter>
    );
  }
  
  export default Routes;
  