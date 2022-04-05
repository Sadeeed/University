import React, { Component } from 'react';
import { Button, Badge} from 'react-bootstrap';

class Productt extends Component {
    state = {  } 


    render() { 
        return (
          <tr>
            <td>{this.props.id}</td>
            <td>{this.props.name}</td>
            <td>{this.props.Qty}</td>
            <td>{this.props.Price}</td>
            <td>
              <Button variant="primary" onClick={() => this.props.onIncrement(this.props.id)}>+</Button>{" "}
              <Badge bg={this.props.Count === 0 ? 'warning' : 'success'} text="dark">
                {this.props.Count}
              </Badge>{" "}
              <Button variant="danger" onClick={() => this.props.onDecrement(this.props.id)}>-</Button>
            </td>
            <td>
              <Button variant="danger" onClick={() => this.props.onDelete(this.props.id)}>
                Delete
              </Button>
            </td>
          </tr>
        );
    }
}
 
export default Productt;