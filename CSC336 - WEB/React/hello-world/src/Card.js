import React, { Component } from 'react';

class Card extends Component {
    state = { 
        name: 'Potato',
        location:'1 Kg',
        Price:'$ 100',
        img: require('./media/potato_web.jpg'),
        imgPublic: <img src="Images/logo192.png"/>,
        imgUrl: 'https://theprovidentprepper.org/wp-content/uploads/2014/01/potato_web.jpg'
     } 
    render() { 
        return (
            <div className="card text-center" style={{maxWidth: "240px"}}>

                {/* Using image inside src */}
                <img src={this.state.img} class="card-img-top" alt="potato" />
                {/* Using url */}
                <img src={this.state.imgUrl} class="card-img-top" alt="potato-url" />
                {/* from public folder */}
                <span>{this.state.imgPublic}</span>

                <div className="card-body">
                    <h5 className="card-title">{this.state.name}</h5> 
                    <p className="card-text">{this.state.location}</p>
                    <a  className="btn btn-primary">{this.state.Price}</a>
                </div>
            </div>
        );
    }
}
 
export default Card;