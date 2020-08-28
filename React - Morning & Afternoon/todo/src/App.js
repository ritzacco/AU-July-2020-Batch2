import React, { Component } from "react";
import "./style.css";

class App extends Component {

  state = {
    todoList:[]
  }



  render() {
  return (
      <div class="containermain">
        <div className="jumbotron jumbotron-fluid py-2">
          <div className="container">
            <h1 className="display-2">To-Do App</h1>
          </div>
        </div>
        <form className="mb-3" onSubmit={this.handleSubmit}>
        <div className="input-group">
          <input type="text" name="todoTask" className="form-control" placeholder="Please enter your task" autoComplete="off" />
          <div className="input-group-append">
          <button type="submit" className="btn btn-outline-success">Add</button>
          </div>
          </div>
        </form>
        <ul className="list-group">
          {
            this.state.todoList.map(
              (item, index) => {
                return <li className="list-group-item" key={index}>
                  {item}
                  <button className="btn btn-sm btn-outline-danger float-right" onClick={(event) => {this.deleteTodoTask(event, index)}}>Done</button>
                  <button className="btn btn-sm btn-outline-primary float-right" onClick={(event) => {}}>Edit</button>
                </li>
              }
            )
          }
        </ul>
        <button type="button" className="btn btn-danger btn-block text-capitalize mt-5" onClick={(event) => {this.clearList(event)}}>Clear List</button>
      </div>
    );
  }

  handleSubmit = (event) => {
    var taskDesc = event.target.elements.todoTask.value;
    if (taskDesc.length > 0){
        this.setState({
          todoList:[...this.state.todoList, taskDesc]
        })
        event.target.reset();
    }
    event.preventDefault();
  }

  deleteTodoTask = (event, index) => {
    var taskArray = [...this.state.todoList]
    taskArray.splice(index, 1)
    this.setState({todoList:taskArray})
  }

  updateTask = (event, index) => {
    var filtered = [...this.state.todoList]
    filtered.splice(index, 1)
    this.setState({todoList:filtered})
    var editedTask = event.target.elements.editedTask.value;
    if (editedTask.length > 0){
        this.setState({
          todoList:[...this.state.todoList, editedTask]
        })
        event.target.reset();
    }
    event.preventDefault();
  }

  clearList = (event) => {
    this.setState({todoList:[]})
  }

}

export default App;