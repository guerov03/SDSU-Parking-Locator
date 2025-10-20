import { Link } from 'react-router-dom';

export const Navy = () => {
  return (
    <nav className="navbar">
      <div className="title">SDSU Parking Locator</div>
      <div>
        <Link to="/">Home</Link>
        <Link to="/map">Map</Link>
        <Link to="/about">About</Link>
        <Link to="/profile">Profile</Link>
      </div>
    </nav>
  );
};
