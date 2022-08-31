import React from "react";
import { useHistory } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.css";
import { NavbarData } from "./NavabarData";
import "../navbar/Navbar.css";

const Navbar = () => {
  const history = useHistory();

  return (
    <div className="Navbar">
      <ul className="NavbarList">
        {NavbarData.map((value, key) => {
          return (
            <li
              key={key}
              id={window.location.pathname === value.link ? "active" : ""}
              className="Row"
              onClick={() => {
                history.push(value.link);
              }}
            >
              <div id="icon">{value.icon}</div>
              <div id="title">{value.title}</div>
            </li>
          );
        })}
      </ul>
    </div>
  );
};

export default Navbar;
