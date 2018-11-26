import React, {Component} from 'react';
import './App.css';
import Container from "semantic-ui-react/dist/commonjs/elements/Container/Container";
import Menu from "semantic-ui-react/dist/commonjs/collections/Menu/Menu";
import Search from "semantic-ui-react/dist/commonjs/modules/Search/Search";
import Input from "semantic-ui-react/dist/commonjs/elements/Input/Input";

class App extends Component {
    render() {
        return (
            <div className="App">
                {/*<header className="App-header">*/}
                {/*</header>*/}
                <Container>
                    <Menu stackable inverted>
                        <Menu.Item>
                            <img src='images/league-logo.png'/>
                        </Menu.Item>
                        <Menu.Item>Champions</Menu.Item>
                        <Menu.Item>Statistics</Menu.Item>
                        <Menu.Item>About Us</Menu.Item>
                    </Menu>
                </Container>

                <Menu inverted secondary>
                    <Menu.Item name='home' active onClick={() => {}} />
                    <Menu.Item
                        name='messages'
                        active
                        onClick={() => {}}
                    />
                    <Menu.Item
                        name='friends'
                        active
                        onClick={() => {}}
                    />
                    <Menu.Menu position='right'>
                        <Menu.Item>
                            <Input icon='search' placeholder='Search...' />
                        </Menu.Item>
                        <Menu.Item
                            name='logout'
                            active
                            onClick={() => {}}
                        />
                    </Menu.Menu>
                </Menu>
            </div>
        );
    }
}

let getSummoner = async (summonerName) => {
    const response = await fetch('localhost:8080/summoner/' + summonerName);
    const myJson = await response.json();
};

export default App;
