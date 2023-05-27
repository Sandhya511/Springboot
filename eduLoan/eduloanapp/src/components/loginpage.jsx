import React, { Component } from 'react'

export default class loginpage extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         email:"",
         password:"",
      };

      this.handleInputChange = this.handleInputChange.bind(this);
      this.handleSubmit = this.handleSubmit.bind(this) ;
    }

    handleInputChange(event)
    {
        event.preventDefault() ;
        const target = event.target;
        this.setState({
            [target.name]: target.value,
        }) ;
    }

    handleSubmit(event)
    {
        event.preventDefault();
        Userfront.login({
            method:"password",
            email: this.state.email,
            password:this.state.password,
        });
    }
  render() {
    return (
      <div>
        <form onSubmit={this.handleSubmit}>
          <label>
            Email or username
            <input
              name="email"
              type="text"
              value={this.state.email}
              onChange={this.handleInputChange}
            />
          </label>
          <label>
            Password
            <input
              name="password"
              type="password"
              value={this.state.password}
              onChange={this.handleInputChange}
            />
          </label>
          <button type="submit">Log in</button>
        </form>
      </div>
    )
  }
}
