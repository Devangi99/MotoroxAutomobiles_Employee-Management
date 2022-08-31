import React, { Component } from 'react';
import styles from "../stockList/stockList.module.css";
import SearchIcon from "@material-ui/icons/Search";
import stockItemService from '../../../Services/stockItemService';
//import { TheatersRounded } from '@material-ui/icons';

class stockList extends Component {
  
  constructor(props){
      super(props)
    
      this.state = {
        stockItems:[]
    }
      this.stockListForm = this.stockListForm.bind(this);
      this.updateItems = this.updateItems.bind(this);
    }    
componentDidMount(){
  stockItemService.getstockItems().then((res) => {
    this.setState({stockItems: res.data});
  });
}

stockListForm(){
  this.props.history.push('/add-stock');
}

updateItems = (itemcode) =>{
  this.props.history.push(`/updateStock/${itemcode}`);
}


    render() {
        return (
          <>
            <h2>Stock Item List</h2>
            <div className={styles.topContainer}>
              <button className="btn btn-primary" onClick={this.stockListForm}>
                Add stock
              </button>
              <div className={styles.searchBar}>
                <input
                  type="text"
                  id="header-search"
                  placeholder="Search "
                  name="s"
                />
                <div className={styles.searchBarImage}>
                  <button onClick={this.search}>
                    <SearchIcon />
                  </button>
                </div>
              </div>
            </div>
            <div className={styles.table}>
              <div className="table  table-bordered">
                <thead>
                  <th>Item Code</th>
                  <th>Item Name</th>
                  <th>Quantity</th>
                  <th>Price</th>
                  <th>Action</th>
                </thead>
                <tbody>
                  {
                    this.state.stockItems.map(stockItems => 

                        <tr key={stockItems.itemcode}>
                        <td>{stockItems.itemcode}</td>
                        <td>{stockItems.itemname}</td>
                        <td>{stockItems.qty}</td>
                        <td>{stockItems.price}</td>
                        <td>
                          <button onClick ={() => this.updateItems(stockItems.itemcode)} className="btn btn-info" >Update</button>
                        </td>
                      </tr>
                )}
                </tbody>
              
              </div>
            </div>
          </>
        );
      }
    }
export default stockList;