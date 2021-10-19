import React, { useState } from 'react';


export default function UserDetail() {

  return (
    <div>
      <figure>
        <img  alt=""/>
        <figcaption>오늘은 남은 인생이 첫째되는 시작날</figcaption>
    </figure>
    <h1>jun il</h1>
    <p>이메일 : jun951321@gmail.com</p>
    <h2>Who I am?</h2>
    <p></p>
    <hr/>
    <h2>Github</h2>
    <ul>
        <li>GitHub</li>
    </ul>
    <hr/>
    <h2>Skills</h2>
    <ul>
        <li>사용 언어
            <ul>                
                <li>JAVA</li>
                <li>Python</li>
                <li>MySQL</li>
            </ul>
        </li><br/>
        <li>사용 툴
            <ul>               
                <li>PyCharm</li>
                <li>Docker</li>
                <li>GitHub</li>
                <li>Visual Studio</li>
                <li>Spring Boot</li>
            </ul>
        </li>
    </ul>
    <br/><hr/>
    <h2>Academic</h2>
    <table border="5">
        <caption>학력 사항</caption>
        <thead>
            <tr>
                <th>출신 학교</th>
                <th>전공</th>
                <th>기간</th>
                <th>졸업구분</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>강원애니고등학교</td>
                <td>(해당사항 없음)</td>
                <td>2012.2 ~ 2014.2</td>
                <td>졸업</td>
            </tr>
            <tr>
                <td>대진대대학교</td>
                <td>문예창작학과</td>
                <td>2014.2 ~ 2021.8</td>
                <td>졸업</td>
            </tr>
        </tbody>
    </table>
    </div>
  );
}
