function Display(props) {
  return <div>{props.message} </div>;
}

function Button(props) {
  return <button onClick={props.onClickFunction}>+{props.increment}</button>;
}
function ButtonHookers() {
  const [state, setState] = React.useState(0);
  const incrementStateTen = () => setState(state + 10);
  const incrementStateTwenty = () => setState(state + 20);
  return (
    <div>
      <Button onClickFunction={incrementStateTen} increment={10} />
      <Button onClickFunction={incrementStateTwenty} increment={20} />
      <Display message={state} />
    </div>
  );
}

export default ButtonHookers;
