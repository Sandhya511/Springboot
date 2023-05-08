import React from 'react';
import { BrowserRouter,Route,Routes } from 'react-router-dom';
import Login from './Login';
import SignIn from './SignIn' ;

export default function Router() {
  return (
    <BrowserRouter>
        <Routes>
            <Route path='login' element={<Login/>}>Login</Route>
            <Route path='signin' element={<SignIn/>}>SignIn</Route>
        </Routes>
    </BrowserRouter>

  )
}
