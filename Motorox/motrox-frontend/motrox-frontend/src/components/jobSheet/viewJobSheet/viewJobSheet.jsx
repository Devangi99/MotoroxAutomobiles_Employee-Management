import { StylesContext } from "@material-ui/styles";
import React, { Component } from "react";
import JobSheetService from "../../../Services/JobSheetService";
import styles from "../viewJobSheet/viewJobSheet.module.css";

class ViewJobSheet extends Component {
  state = {
    jobSheetId: this.props.match.params.jobSheetId,
    jobSheet: {},
  };

  componentDidMount() {
    JobSheetService.getJobSheetById(this.state.jobSheetId).then((res) => {
      this.setState({ jobSheet: res.data });
    });
  }

  render() {
    return (
      <div>
        <h2 style={{ marginTop: "1rem" }}>View Details</h2>
        <div className={styles.mainCard}>
          <div className="container p-3 my-3 bg-dark text-white">
            <div className={styles.nameNumber}>
              <lable>Customer Name: {this.state.jobSheet.customerName}</lable>
              <br />
              <lable>Contact Number: {this.state.jobSheet.contactNumber}</lable>
            </div>
            <div className={styles.detailsGroup}>
              <div>
                Front(Usable) Parts: {this.state.jobSheet.frontUsable}
                <br />
                Front(Replace) Parts:{this.state.jobSheet.frontReplace}
              </div>
              <div>
                Rear(Usable) Parts: {this.state.jobSheet.rearUsable}
                <br />
                Rear(Replace) Parts:{this.state.jobSheet.rearReplace}
              </div>
              <div>
                Left/Right(Usable) Parts: {this.state.jobSheet.lRUsable}
                <br />
                Left/Right(Usable) Parts:{this.state.jobSheet.lRReplace}
              </div>
              <div>
                Engine Room(Usable) Parts: {this.state.jobSheet.rearUsable}
                <br />
                Engine Room(Replace) Parts:{this.state.jobSheet.rearReplace}
              </div>
              <div>
                Front(Usable) Parts: {this.state.jobSheet.frontUsable}
                <br />
                Front(Replace) Parts:{this.state.jobSheet.frontReplace}
              </div>
              <div>
                Rear(Usable) Parts: {this.state.jobSheet.rearUsable}
                <br />
                Rear(Replace) Parts:{this.state.jobSheet.rearReplace}
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default ViewJobSheet;
