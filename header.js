import * as React from "react";
  
// importing material UI components
import AppBar from "@mui/material/AppBar";
import Toolbar from "@mui/material/Toolbar";
import Typography from "@mui/material/Typography";
import Button from "@mui/material/Button";
import IconButton from "@mui/material/IconButton";
import target1 from "./../../images/target1.jpeg";
import { makeStyles } from "@material-ui/core/styles";

  
const useStyles = makeStyles({
  root: {
    width:"40px",
    height:"40px"
  },

 });
 
export default function Header() {
  const classes=useStyles();
  return (
      <AppBar position="static">
        <Toolbar>
          <IconButton
            size="large"
            edge="start"
            color="inherit"
            aria-label="menu"
            sx={{ mr: 2 }}
          >
            <img src={target1} className={classes.root}/>
          </IconButton> <table> 
            <tr>
              <td><div className='abc'align="centre">
                                                                     RECRUIT+
             </div> </td>
            </tr>
            <tr>
              <td><div className='abc'align="centre">
                one day to day one
              </div></td>
            </tr>
           </table>
        <Typography variant="h6" 
            component="div" sx={{ flexGrow: 1 }}>
          </Typography>
          <Button color="inherit">Login</Button>
        </Toolbar>
      </AppBar>
  );
}