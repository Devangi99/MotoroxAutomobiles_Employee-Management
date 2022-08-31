import React, { Component } from "react";
import logo from "../../assets/images/motrox.jpeg";

class Header extends Component {
  state = {};
  render() {
    return (
      <>
        <img className="header-image" src={logo} alt="Image is Not found" />
        <button className="header-logout-button">Logout</button>
      </>
    );
  }
}

export default Header;
