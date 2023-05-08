import React, { Component } from 'react'

export default class Login extends Component {
  constructor(props){
    super(props) ;
    this.state = {
      email:'',
      password:'',
    };
  }
  render() {
    return (
      <div  style={{backgroundImage:'url(../dbg.jpg)',height:'100vh',
      marginTop:'0px',
      padding:'0px',
      fontSize:'50px',
      backgroundSize: 'cover',
      backgroundRepeat: 'no-repeat',
      opacity:'1'}}>
        <form onSubmit={this.handleSubmit} className='login-form'>

        </form>
      
      </div>
    )
  }
}
