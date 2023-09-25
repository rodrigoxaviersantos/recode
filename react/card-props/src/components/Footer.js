import React from "react";

const Footer = () => {
  return (
    <div className="bg-light text-center py-3">
      &copy; {new Date().getFullYear()} Seu Nome
    </div>
  );
};

export default Footer;
