import React, { Component } from 'react'
import {Grid, Paper, TextField, Typography,Button} from '@mui/material'
import { Link } from 'react-router-dom';
export default class Login extends Component {

  render() {
    return (
      <div style={{backgroundImage:'url(../sbg.jpg)',height:'100vh',
      marginTop:'0px',
      padding:'0px',
      fontSize:'50px',
      backgroundSize: 'cover',
      backgroundRepeat: 'no-repeat',
      opacity:'1'}}>
        <Grid align="center" padding={"100px"}>
           <Paper variant='outlined' style={{width:'400px',height:'500px', borderRadius:'20px' ,opacity:'0.75'}}>
            <Typography>
                <h1 align="center" padding={"5px"}>SIGNUP</h1>
              </Typography> 
           <TextField  label="Name" type="text" placeholder='Enter your name' variant='outlined' required></TextField>
           <br/>
           <TextField  label="Email" type="email" placeholder='Enter your email' variant='outlined' required></TextField>
           <br/>
           
           <TextField  label="Mobile Number" type="number" placeholder='Enter your mobile number' variant='outlined' required></TextField>
           <br/>
           <TextField  label="PassWord" type="Password" placeholder='Enter your password' variant='outlined' required ></TextField>
           <br/>
           <TextField  label="Re-enter PassWord" type=" Password" placeholder='Re-enter your password' variant='outlined' required ></TextField>
        </Paper>
        <Link to ="/">
          <Button><h2 style={{color:'#3C4D5B'}}>Signup</h2></Button>
        </Link>
        </Grid>
        </div>
    )
  }
}