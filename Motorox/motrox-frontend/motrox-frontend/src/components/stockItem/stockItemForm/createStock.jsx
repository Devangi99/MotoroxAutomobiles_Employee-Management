import React, { Component } from 'react';
import styles from "./createStock.module.css";
import { useHistory } from "react-router-dom";
import stockItemService from "../../../Services/stockItemService";

class createStock extends Component {
    state ={
        itemcode: '',
        itemname:'',
        qty:'',
        receivedqty:'',
        soldqty:'',
        damageqty:'',
        returnqty:'',
        price:'',
    };
    saveitem = (e) =>{
        e.preventDefault();
        let stockItem = {
            itemcode:this.state.itemcode,
            itemname:this.state.itemname,
            qty:this.state.qty,
            receivedqty:this.state.receivedqty,
            soldqty:this.state.soldqty,
            damageqty:this.state.damageqty,
            returnqty:this.state.returnqty,
            price:this.state.price,

        };
            stockItemService.createStockItem(stockItem).then((res)=>{
                this.props.history.push("/itemMask");
            });
        };
        
        cancel() {}

        changeitemcodeHandler= (event) => {
            this.setState({itemcode: event.target.value});
        };
        changeitemnameHandler= (event) => {
            this.setState({itemname: event.target.value});
        };
        changeqtyHandler= (event) => {
            this.setState({qty: event.target.value});
        };
        changereceivedqtyHandler= (event) => {
            this.setState({receivedqty: event.target.value});
        };
        changesoldqtyHandler= (event) => {
            this.setState({soldqty: event.target.value});
        };
        changedamageqtyHandler= (event) => {
            this.setState({damageqty: event.target.value});
        };
        changereturnqtyHandler= (event) => {
            this.setState({returnqty: event.target.value});
        };
        changepriceHandler= (event) => {
            this.setState({price: event.target.value});
        };
    
    render() {
        return (
            <div>
                <div>
                    <h4>ADD ITEM</h4>
                    
                    <div className="container p-3 my-3 bg-light border border-dark">
                        <form className={styles.form}>
                         <div className={styles.textbox}>
                                <label>Item Code:</label>
                                     <input
                                        placeholder="Item Code"
                                        name="itemcode"
                                        value={this.state.itemcode}
                                        onChange={this.changeitemcodeHandler}
                                    />
                            </div>
                    <div className={styles.textbox}>
                        <label>Item Name:</label>
                            <input
                                placeholder="Item Name"
                                name="itemname"
                                value={this.state.itemname}
                                onChange={this.changeitemnameHandler}
                            />
                    </div>
                    <div className={styles.textbox}>
                        <label>Quantity:</label>
                            <input
                                placeholder="Quantity"
                                name="qty"
                                value={this.state.qty}
                                onChange={this.changeqtyHandler}
                            />
                    </div>
                    <div className={styles.textbox}>
                        <label>Recieved Qty:</label>
                            <input
                                placeholder="Recieved Quantity"
                                name="receivedqty"
                                value={this.state.receivedqty}
                                onChange={this.changereceivedqtyHandler}
                            />
                    </div>
                    <div className={styles.textbox}>
                        <label>Sold Qty:</label>
                            <input
                                placeholder="Sold Quantity"
                                name="soldqty"
                                value={this.state.soldqty}
                                onChange={this.changesoldqtyHandler}
                            />
                    </div>
                    <div className={styles.textbox}>
                        <label>Damaged Qty:</label>
                            <input
                                placeholder="Damaged Quantity"
                                name="damageqty"
                                value={this.state.damageqty}
                                onChange={this.changedamageqtyHandler}
                            />
                    </div>
                    <div className={styles.textbox}>
                        <label>Return Qty:</label>
                            <input
                                placeholder="Return Quantity"
                                name="returnqty"
                                value={this.state.returnqty}
                                onChange={this.changereturnqtyHandler}
                            />
                    </div>
                    <div className={styles.textbox}>
                        <label>Price:</label>
                            <input
                                placeholder="Price"
                                name="price"
                                value={this.state.price}
                                onChange={this.changepriceHandler}
                             />
                    </div>
                    <div className={styles.savebutton}>
                        <button className="btn btn-secondary" onClick={this.saveitem}>Save</button>
                    </div>
                    <div className={styles.cancelbutton}>
                <button className="btn btn-secondary" onClick={this.cancel}>
                Cancel
                 </button>
                </div>
               </form>
            </div>
           </div>    
            </div>
        );
    }
}

export default createStock;