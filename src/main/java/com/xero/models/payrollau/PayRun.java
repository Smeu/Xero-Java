/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.0.4
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.payrollau.PayRunStatus;
import com.xero.models.payrollau.PayslipSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * PayRun
 */

public class PayRun {

  
  @JsonProperty("PayrollCalendarID")
  private UUID payrollCalendarID;

  
  @JsonProperty("PayRunID")
  private UUID payRunID;

  
  @JsonProperty("PayRunPeriodStartDate")
  private String payRunPeriodStartDate;

  
  @JsonProperty("PayRunPeriodEndDate")
  private String payRunPeriodEndDate;

  
  @JsonProperty("PayRunStatus")
  private PayRunStatus payRunStatus;

  
  @JsonProperty("PaymentDate")
  private String paymentDate;

  
  @JsonProperty("PayslipMessage")
  private String payslipMessage;

  
  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  
  @JsonProperty("Payslips")
  private List<PayslipSummary> payslips = new ArrayList<PayslipSummary>();

  
  @JsonProperty("Wages")
  private Float wages;

  
  @JsonProperty("Deductions")
  private Float deductions;

  
  @JsonProperty("Tax")
  private Float tax;

  
  @JsonProperty("Super")
  private Float _super;

  
  @JsonProperty("Reimbursements")
  private Float reimbursements;

  
  @JsonProperty("NetPay")
  private Float netPay;
  public PayRun payrollCalendarID(UUID payrollCalendarID) {
    this.payrollCalendarID = payrollCalendarID;
    return this;
  }

   /**
   * Xero identifier for pay run
   * @return payrollCalendarID
  **/
  @ApiModelProperty(example = "bfac31bd-ea62-4fc8-a5e7-7965d9504b15", required = true, value = "Xero identifier for pay run")
  public UUID getPayrollCalendarID() {
    return payrollCalendarID;
  }

  public void setPayrollCalendarID(UUID payrollCalendarID) {
    this.payrollCalendarID = payrollCalendarID;
  }

  public PayRun payRunID(UUID payRunID) {
    this.payRunID = payRunID;
    return this;
  }

   /**
   * Xero identifier for pay run
   * @return payRunID
  **/
  @ApiModelProperty(example = "bba1d10f-63b1-4692-b5c5-a99f869523a4", value = "Xero identifier for pay run")
  public UUID getPayRunID() {
    return payRunID;
  }

  public void setPayRunID(UUID payRunID) {
    this.payRunID = payRunID;
  }

  public PayRun payRunPeriodStartDate(String payRunPeriodStartDate) {
    this.payRunPeriodStartDate = payRunPeriodStartDate;
    return this;
  }

   /**
   * Period Start Date for the PayRun (YYYY-MM-DD)
   * @return payRunPeriodStartDate
  **/
  @ApiModelProperty(example = "2013-02-01T00:00:00Z", value = "Period Start Date for the PayRun (YYYY-MM-DD)")
  public String getPayRunPeriodStartDate() {
    return payRunPeriodStartDate;
  }

  public void setPayRunPeriodStartDate(String payRunPeriodStartDate) {
    this.payRunPeriodStartDate = payRunPeriodStartDate;
  }

  public PayRun payRunPeriodEndDate(String payRunPeriodEndDate) {
    this.payRunPeriodEndDate = payRunPeriodEndDate;
    return this;
  }

   /**
   * Period End Date for the PayRun (YYYY-MM-DD)
   * @return payRunPeriodEndDate
  **/
  @ApiModelProperty(example = "2013-02-07T00:00:00Z", value = "Period End Date for the PayRun (YYYY-MM-DD)")
  public String getPayRunPeriodEndDate() {
    return payRunPeriodEndDate;
  }

  public void setPayRunPeriodEndDate(String payRunPeriodEndDate) {
    this.payRunPeriodEndDate = payRunPeriodEndDate;
  }

  public PayRun payRunStatus(PayRunStatus payRunStatus) {
    this.payRunStatus = payRunStatus;
    return this;
  }

   /**
   * Get payRunStatus
   * @return payRunStatus
  **/
  @ApiModelProperty(value = "")
  public PayRunStatus getPayRunStatus() {
    return payRunStatus;
  }

  public void setPayRunStatus(PayRunStatus payRunStatus) {
    this.payRunStatus = payRunStatus;
  }

  public PayRun paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * Payment Date for the PayRun (YYYY-MM-DD)
   * @return paymentDate
  **/
  @ApiModelProperty(example = "2013-02-07T00:00:00Z", value = "Payment Date for the PayRun (YYYY-MM-DD)")
  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public PayRun payslipMessage(String payslipMessage) {
    this.payslipMessage = payslipMessage;
    return this;
  }

   /**
   * Payslip message for the PayRun
   * @return payslipMessage
  **/
  @ApiModelProperty(example = "Thanks for being awesome", value = "Payslip message for the PayRun")
  public String getPayslipMessage() {
    return payslipMessage;
  }

  public void setPayslipMessage(String payslipMessage) {
    this.payslipMessage = payslipMessage;
  }

  public PayRun updatedDateUTC(String updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }

   /**
   * Last modified timestamp
   * @return updatedDateUTC
  **/
  @ApiModelProperty(example = "2018-04-01T23:02:36", value = "Last modified timestamp")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public void setUpdatedDateUTC(String updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }

  public PayRun payslips(List<PayslipSummary> payslips) {
    this.payslips = payslips;
    return this;
  }

  public PayRun addPayslipsItem(PayslipSummary payslipsItem) {
    if (this.payslips == null) {
      this.payslips = new ArrayList<PayslipSummary>();
    }
    this.payslips.add(payslipsItem);
    return this;
  }

   /**
   * The payslips in the payrun
   * @return payslips
  **/
  @ApiModelProperty(value = "The payslips in the payrun")
  public List<PayslipSummary> getPayslips() {
    return payslips;
  }

  public void setPayslips(List<PayslipSummary> payslips) {
    this.payslips = payslips;
  }

  public PayRun wages(Float wages) {
    this.wages = wages;
    return this;
  }

   /**
   * The total Wages for the Payrun
   * @return wages
  **/
  @ApiModelProperty(example = "1060.5", value = "The total Wages for the Payrun")
  public Float getWages() {
    return wages;
  }

  public void setWages(Float wages) {
    this.wages = wages;
  }

  public PayRun deductions(Float deductions) {
    this.deductions = deductions;
    return this;
  }

   /**
   * The total Deductions for the Payrun
   * @return deductions
  **/
  @ApiModelProperty(example = "0.0", value = "The total Deductions for the Payrun")
  public Float getDeductions() {
    return deductions;
  }

  public void setDeductions(Float deductions) {
    this.deductions = deductions;
  }

  public PayRun tax(Float tax) {
    this.tax = tax;
    return this;
  }

   /**
   * The total Tax for the Payrun
   * @return tax
  **/
  @ApiModelProperty(example = "198.0", value = "The total Tax for the Payrun")
  public Float getTax() {
    return tax;
  }

  public void setTax(Float tax) {
    this.tax = tax;
  }

  public PayRun _super(Float _super) {
    this._super = _super;
    return this;
  }

   /**
   * The total Super for the Payrun
   * @return _super
  **/
  @ApiModelProperty(example = "75.6", value = "The total Super for the Payrun")
  public Float getSuper() {
    return _super;
  }

  public void setSuper(Float _super) {
    this._super = _super;
  }

  public PayRun reimbursements(Float reimbursements) {
    this.reimbursements = reimbursements;
    return this;
  }

   /**
   * The total Reimbursements for the Payrun
   * @return reimbursements
  **/
  @ApiModelProperty(example = "0.0", value = "The total Reimbursements for the Payrun")
  public Float getReimbursements() {
    return reimbursements;
  }

  public void setReimbursements(Float reimbursements) {
    this.reimbursements = reimbursements;
  }

  public PayRun netPay(Float netPay) {
    this.netPay = netPay;
    return this;
  }

   /**
   * The total NetPay for the Payrun
   * @return netPay
  **/
  @ApiModelProperty(example = "862.5", value = "The total NetPay for the Payrun")
  public Float getNetPay() {
    return netPay;
  }

  public void setNetPay(Float netPay) {
    this.netPay = netPay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayRun payRun = (PayRun) o;
    return Objects.equals(this.payrollCalendarID, payRun.payrollCalendarID) &&
        Objects.equals(this.payRunID, payRun.payRunID) &&
        Objects.equals(this.payRunPeriodStartDate, payRun.payRunPeriodStartDate) &&
        Objects.equals(this.payRunPeriodEndDate, payRun.payRunPeriodEndDate) &&
        Objects.equals(this.payRunStatus, payRun.payRunStatus) &&
        Objects.equals(this.paymentDate, payRun.paymentDate) &&
        Objects.equals(this.payslipMessage, payRun.payslipMessage) &&
        Objects.equals(this.updatedDateUTC, payRun.updatedDateUTC) &&
        Objects.equals(this.payslips, payRun.payslips) &&
        Objects.equals(this.wages, payRun.wages) &&
        Objects.equals(this.deductions, payRun.deductions) &&
        Objects.equals(this.tax, payRun.tax) &&
        Objects.equals(this._super, payRun._super) &&
        Objects.equals(this.reimbursements, payRun.reimbursements) &&
        Objects.equals(this.netPay, payRun.netPay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payrollCalendarID, payRunID, payRunPeriodStartDate, payRunPeriodEndDate, payRunStatus, paymentDate, payslipMessage, updatedDateUTC, payslips, wages, deductions, tax, _super, reimbursements, netPay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayRun {\n");
    sb.append("    payrollCalendarID: ").append(toIndentedString(payrollCalendarID)).append("\n");
    sb.append("    payRunID: ").append(toIndentedString(payRunID)).append("\n");
    sb.append("    payRunPeriodStartDate: ").append(toIndentedString(payRunPeriodStartDate)).append("\n");
    sb.append("    payRunPeriodEndDate: ").append(toIndentedString(payRunPeriodEndDate)).append("\n");
    sb.append("    payRunStatus: ").append(toIndentedString(payRunStatus)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    payslipMessage: ").append(toIndentedString(payslipMessage)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    payslips: ").append(toIndentedString(payslips)).append("\n");
    sb.append("    wages: ").append(toIndentedString(wages)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    _super: ").append(toIndentedString(_super)).append("\n");
    sb.append("    reimbursements: ").append(toIndentedString(reimbursements)).append("\n");
    sb.append("    netPay: ").append(toIndentedString(netPay)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

