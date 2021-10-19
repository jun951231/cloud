import React, { useState } from 'react';
import axios from 'axios'

export default function UserLogin() {
  const SERVER = 'http://localhost:8080'
  const [login, setLogin] = useState({})
  const {username, password} = login
  
  const handleChange = e => {
    const {value, name} = e.target
    setLogin({
      ...login,
      [name] : value
    })
  }

  const header = {
    'Content-Type' : 'application/json',
    'Authorization': 'JWT fefege..'
  }

  const handleClick = e => {
    e.preventDefault()
    const loginRequest = {username, password}
    alert('로그인 정보: '+JSON.stringify(loginRequest))
    userLogin(loginRequest)
    .then(res => {
      alert('로그인 성공, '+res)
    })
    .catch(err => {
      alert('로그인 실패')
    })

  }
  const userLogin = loginRequest => 
    axios.post(`${SERVER}/users/login`, loginRequest)  
  return (
    <form method="POST">
        <ul>
            <li><label for="id">아이디</label>
            <input type="text" id="username" 
                name='username' value={username} onChange={handleChange}/></li>
            <li><label for="pw">비밀번호</label>
            <input type="password" id="pw" name="password" onChange={handleChange}/></li>
            <li><input type="submit" title="로그인" value="로그인" onClick={handleClick}/></li>
        </ul>
    </form>
  );
}
