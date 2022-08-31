import React, { Component } from "react";
import styles from "../updateJobSheet/updateJobSheet.module.css";
import JobSheetService from "../../../Services/JobSheetService";
import { toast } from "react-toastify";

class UpdateJobSheet extends Component {
  state = {
    jobSheetId: this.props.match.params.jobSheetId,
    customerName: "",
    customerNIC: "",
    vehicelId: "",
    contactNumber: "",
    date: "",
    time: "",
    frontUsable: "",
    frontReplace: "",
    rearUsable: "",
    rearReplace: "",
    lRUsable: "",
    lRReplace: "",
    topUsable: "",
    topReplace: "",
    engineRUsable: "",
    engineRReplace: "",
    bottomUsable: "",
    bottomReplace: "",
  };

  componentDidMount() {
    JobSheetService.getJobSheetById(this.state.jobSheetId).then((res) => {
      let jobSheet = res.data;
      this.setState({
        customerName: jobSheet.customerName,
        customerNIC: jobSheet.customerNIC,
        vehicelId: jobSheet.vehicelId,
        contactNumber: jobSheet.contactNumber,
        date: jobSheet.date,
        time: jobSheet.time,
        frontUsable: jobSheet.frontUsable,
        frontReplace: jobSheet.frontReplace,
        rearUsable: jobSheet.rearUsable,
        rearReplace: jobSheet.rearReplace,
        lRUsable: jobSheet.lRUsable,
        lRReplace: jobSheet.lRReplace,
        topUsable: jobSheet.topUsable,
        topReplace: jobSheet.topReplace,
        engineRUsable: jobSheet.engineRUsable,
        engineRReplace: jobSheet.engineRReplace,
        bottomUsable: jobSheet.bottomUsable,
        bottomReplace: jobSheet.bottomReplace,
      });
    });
  }

  jobParts = () => {
    window.open("/jobParts");
  };

  updateJobSheet = (e) => {
    e.preventDefault();
    let jobSheet = {
      customerName: this.state.customerName,
      customerNIC: this.state.customerNIC,
      vehicelId: this.state.vehicelId,
      contactNumber: this.state.contactNumber,
      date: this.state.date,
      time: this.state.time,
      frontUsable: this.state.frontUsable,
      frontReplace: this.state.frontReplace,
      rearUsable: this.state.rearUsable,
      rearReplace: this.state.rearReplace,
      lRUsable: this.state.lRUsable,
      lRReplace: this.state.lRReplace,
      topUsable: this.state.topUsable,
      topReplace: this.state.topReplace,
      engineRUsable: this.state.engineRUsable,
      engineRReplace: this.state.engineRReplace,
      bottomUsable: this.state.bottomUsable,
      bottomReplace: this.state.bottomReplace,
    };
    console.log(`jobSheet => ` + JSON.stringify(jobSheet));
    JobSheetService.updateJobSheet(jobSheet, this.state.jobSheetId).then(
      (res) => {
        this.props.history.push("/jobSheet");
        toast.success("Job Sheet Updated");
      }
    );
  };

  cancel() {}

  changeCustomerNameHandler = (event) => {
    this.setState({ customerName: event.target.value });
  };

  changeCustomerNICHandler = (event) => {
    this.setState({ customerNIC: event.target.value });
  };

  changeVehicleIdHandler = (event) => {
    this.setState({ vehicelId: event.target.value });
  };

  changeContactNumberHandler = (event) => {
    this.setState({ contactNumber: event.target.value });
  };

  changeDateHandler = (event) => {
    this.setState({ date: event.target.value });
  };

  changeTimeHandler = (event) => {
    this.setState({ time: event.target.value });
  };

  changeFrontUsableHandler = (event) => {
    this.setState({ frontUsable: event.target.value });
  };

  changeFrontReplaceHandler = (event) => {
    this.setState({ frontReplace: event.target.value });
  };

  changeRearUsableHandler = (event) => {
    this.setState({ rearUsable: event.target.value });
  };

  changeRearReplaceHandler = (event) => {
    this.setState({ rearReplace: event.target.value });
  };

  changelRUsableHandler = (event) => {
    this.setState({ lRUsable: event.target.value });
  };

  changelRReplaceHandle = (event) => {
    this.setState({ lRReplace: event.target.value });
  };

  changeTopUsableHandler = (event) => {
    this.setState({ topUsable: event.target.value });
  };

  changeTopReplaceHandler = (event) => {
    this.setState({ topReplace: event.target.value });
  };

  changeEngineRUsableHandler = (event) => {
    this.setState({ engineRUsable: event.target.value });
  };

  changeEngineRReplaceHandler = (event) => {
    this.setState({ engineRReplace: event.target.value });
  };

  changeBottomUsableHandler = (event) => {
    this.setState({ bottomUsable: event.target.value });
  };

  changeBottomReplaceHandler = (event) => {
    this.setState({ bottomReplace: event.target.value });
  };

  render() {
    return (
      <div>
        <h2>Job Sheet</h2>
        <button
          id={styles.jobSheetPartButton}
          className="btn btn-primary"
          onClick={this.jobParts}
        >
          CLICK HERE TO GET THE ITEM CODE
        </button>
        <div className="container p-3 my-3 bg-light border border-dark ">
          <form className={styles.form}>
            <div className={styles.input_group}>
              <label>Customer Name:</label>
              <input
                placeholder="Customer Name"
                name="customerName"
                value={this.state.customerName}
                onChange={this.changeCustomerNameHandler}
              />
            </div>
            <div className={styles.input_group}>
              <label>Customer NIC:</label>
              <input
                placeholder="Customer NIC"
                name="customerNIC"
                value={this.state.customerNIC}
                onChange={this.changeCustomerNICHandler}
              />
            </div>
            <div className={styles.input_group}>
              <label>Vehicle Id:</label>
              <input
                placeholder="Vehicle Id"
                name="vehicelId"
                value={this.state.vehicelId}
                onChange={this.changeVehicleIdHandler}
              />
            </div>
            <div className={styles.input_group}>
              <label>Contact Number:</label>
              <input
                placeholder="Contact Number"
                name="contactNumber"
                value={this.state.contactNumber}
                onChange={this.changeContactNumberHandler}
              />
            </div>
            <div className={styles.input_group}>
              <label>Date:</label>
              <input
                type="Date"
                placeholder="Date"
                name="date"
                value={this.state.date}
                onChange={this.changeDateHandler}
              />
            </div>
            <div className={styles.input_group}>
              <label>Time:</label>
              <input
                placeholder="Time"
                name="time"
                value={this.state.time}
                onChange={this.changeTimeHandler}
              />
            </div>
            <div className={styles.frontSide}>
              <h4>
                <u>FRONT SIDE</u>
              </h4>
              <label>Front(Usable):</label>
              <input
                placeholder="Eg:#----/#----"
                name="frontUsable"
                value={this.state.frontUsable}
                onChange={this.changeFrontUsableHandler}
              />
              <div>
                <label>Front(Replace):</label>
                <input
                  placeholder="Eg:#----/#----"
                  name="frontReplace"
                  value={this.state.frontReplace}
                  onChange={this.changeFrontReplaceHandler}
                />
              </div>
            </div>
            <div className={styles.rearSide}>
              <h4>
                <u>REAR SIDE</u>
              </h4>
              <label>Rear(Usable):</label>
              <input
                placeholder="Eg:#----/#----"
                name="rearUsable"
                value={this.state.rearUsable}
                onChange={this.changeRearUsableHandler}
              />
              <div>
                <label>Rear(Replace):</label>
                <input
                  placeholder="Eg:#----/#----"
                  name="rearReplace"
                  value={this.state.rearReplace}
                  onChange={this.changeRearReplaceHandler}
                />
              </div>
            </div>
            <div className={styles.leftrightSide}>
              <h4>
                <u>LEFT/RIGHT SIDE</u>
              </h4>
              <label>Left/Right(Usable):</label>
              <input
                placeholder="Eg:#----/#----"
                name="lRUsable"
                value={this.state.lRUsable}
                onChange={this.changelRUsableHandler}
              />
              <div>
                <label>Left/Right(Replace):</label>
                <input
                  placeholder="Eg:#----/#----"
                  name="lRReplace"
                  value={this.state.lRReplace}
                  onChange={this.changelRReplaceHandle}
                />
              </div>
            </div>
            <div className={styles.topSide}>
              <h4>
                <u>TOP SIDE</u>
              </h4>
              <label>Top(Usable):</label>
              <input
                placeholder="Eg:#----/#----"
                name="topUsable"
                value={this.state.topUsable}
                onChange={this.changeTopUsableHandler}
              />
              <div>
                <label>Top(Replace):</label>
                <input
                  placeholder="Eg:#----/#----"
                  name="topReplace"
                  value={this.state.topReplace}
                  onChange={this.changeTopReplaceHandler}
                />
              </div>
            </div>
            <div className={styles.engineRoom}>
              <h4>
                <u>ENGINE ROOM</u>
              </h4>
              <label>Engine Room(Usable):</label>
              <input
                placeholder="Eg:#----/#----"
                name="engineRUsable"
                value={this.state.engineRUsable}
                onChange={this.changeEngineRUsableHandler}
              />
              <div>
                <label>Engine Room(Replace):</label>
                <input
                  placeholder="Eg:#----/#----"
                  name="engineRReplace"
                  value={this.state.engineRReplace}
                  onChange={this.changeEngineRReplaceHandler}
                />
              </div>
            </div>
            <div className={styles.bottomSide}>
              <h4>
                <u>BOTTOM SIDE</u>
              </h4>
              <label>Bottom(Usable):</label>
              <input
                placeholder="Eg:#----/#----"
                name="bottomUsable"
                value={this.state.bottomUsable}
                onChange={this.changeBottomUsableHandler}
              />
              <div>
                <label>Bottom(Replace):</label>
                <input
                  placeholder="Eg:#----/#----"
                  name="bottomReplace"
                  value={this.state.bottomReplace}
                  onChange={this.changeBottomReplaceHandler}
                />
              </div>
            </div>
            <div className={styles.updateButton}>
              <button
                className="btn btn-secondary"
                onClick={this.updateJobSheet}
              >
                Save
              </button>
            </div>
            <div className={styles.cancelButton}>
              <button className="btn btn-secondary" onClick={this.cancel}>
                Cancel
              </button>
            </div>
          </form>
        </div>
      </div>
    );
  }
}

export default UpdateJobSheet;
