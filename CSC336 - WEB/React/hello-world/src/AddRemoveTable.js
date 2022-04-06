import React, { Component } from "react";
import { Table } from "react-bootstrap";
import Productt from "./Productt";

class AddRemoveTable extends Component {
  state = {
    products: [
      { id: 0, name: "Potato", Qty: 5, Price: 150, count: 0 },
      { id: 1, name: "Trousers", Qty: 15, Price: 145, count: 0 },
      { id: 2, name: "T-Shirts", Qty: 34, Price: 190, count: 0 },
      { id: 3, name: "Shoes", Qty: 54, Price: 200, count: 0 },
      { id: 4, name: "Earphones", Qty: 32, Price: 115, count: 0 },
      { id: 5, name: "Sandals", Qty: 21, Price: 120, count: 0 },
    ],
  };

  handleDelete = (id) => {
    const products = this.state.products.filter((p) => p.id !== id);
    this.setState({ products });
  };

  handleIncrement = (id) => {
    var products = this.state.products;
    products[id].count += 1;
    products[id].Qty += 1;
    this.setState({ products });
  };

  handleDecrement = (id) => {
    var products = this.state.products;
    if (products[id].count > 0) {
      products[id].count -= 1;
      products[id].Qty -= 1;
      this.setState({ products });
    }
  };

  render() {
    return (
      <div className="bg-dark text-light">
        <p>Showing {this.state.products.length} products</p>
        <Table striped bordered hover variant="dark">
          <thead>
            <tr>
              <th>#</th>
              <th>Name</th>
              <th>Quantity</th>
              <th>Price</th>
              <th>Update Quantity</th>
              <th>Operations</th>
            </tr>
          </thead>
          <tbody>
            {this.state.products.map((product) => (
              <Productt
                id={product.id}
                name={product.name}
                Qty={product.Qty}
                Price={product.Price}
                Count={product.count}
                onDelete={this.handleDelete}
                onIncrement={this.handleIncrement}
                onDecrement={this.handleDecrement}
              />
            ))}
          </tbody>
        </Table>
      </div>
    );
  }
}

export default AddRemoveTable;
