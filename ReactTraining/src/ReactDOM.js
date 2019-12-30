// const render = () => {
//   document.getElementById("mountnode").innerHTML;
// };
const timeUpdate = () => {
  ReactDOM.render(
    React.createElement(
      "div",
      null,
      "First Node",
      React.createElement("input", null),
      React.createElement("pre", null, new Date().toLocaleTimeString())
    ),
    document.getElementById("mountnode")
  );
  ReactDOM.render(
    React.createElement(
      "div",
      null,
      "Second Node",
      React.createElement("input", null),
      React.createElement("pre", null, new Date().toLocaleTimeString())
    ),
    document.getElementById("mountnode2")
  );
};

class App extends Component {
  render() {
    return <call />;
  }
}

setInterval(timeUpdate, 1000);

export default App;
