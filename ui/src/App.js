import React, {Component, useState, useEffect} from 'react';
import logo from './logo.svg';
import './App.css';

function App() {
    const [message, setMessage] = useState("");
    const [items, setItems] = useState([]);

    useEffect(() => {
        fetch('/api/hello')
            .then(response => response.text())
            .then(message => {
                setMessage(message);
            });
        fetch('/api/map')
            .then(response => response.json())
            .then((guys) => {
                setItems(guys);
            });
    }, [])

    return (
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo"/>
                <h1 className="App-title">{message}</h1>
            </header>
            <p className="App-intro">
                To get started, edit <code>src/App.js</code> and save to reload.
            </p>
            <table>
                <th>Name</th>
                <th>Last name</th>
                {items.map(guys => (
                    <tr key={guys.id}>
                        <td>{guys.name}</td>
                        <td>{guys.lastName}</td>
                    </tr>
                ))}
            </table>
        </div>
    )
}

export default App;
