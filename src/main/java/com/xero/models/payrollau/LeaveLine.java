/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.4.2
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollau;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** LeaveLine */
public class LeaveLine {
  StringUtil util = new StringUtil();

  @JsonProperty("LeaveTypeID")
  private UUID leaveTypeID;

  @JsonProperty("CalculationType")
  private LeaveLineCalculationType calculationType;

  @JsonProperty("EntitlementFinalPayPayoutType")
  private EntitlementFinalPayPayoutType entitlementFinalPayPayoutType;

  @JsonProperty("EmploymentTerminationPaymentType")
  private EmploymentTerminationPaymentType employmentTerminationPaymentType;

  @JsonProperty("IncludeSuperannuationGuaranteeContribution")
  private Boolean includeSuperannuationGuaranteeContribution;

  @JsonProperty("NumberOfUnits")
  private Double numberOfUnits;

  @JsonProperty("AnnualNumberOfUnits")
  private Double annualNumberOfUnits;

  @JsonProperty("FullTimeNumberOfUnitsPerPeriod")
  private Double fullTimeNumberOfUnitsPerPeriod;

  public LeaveLine leaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
    return this;
  }

  /**
   * Xero leave type identifier
   *
   * @return leaveTypeID
   */
  @ApiModelProperty(
      example = "742998cb-7584-4ecf-aa88-d694f59c50f9",
      value = "Xero leave type identifier")
  public UUID getLeaveTypeID() {
    return leaveTypeID;
  }

  public void setLeaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
  }

  public LeaveLine calculationType(LeaveLineCalculationType calculationType) {
    this.calculationType = calculationType;
    return this;
  }

  /**
   * Get calculationType
   *
   * @return calculationType
   */
  @ApiModelProperty(value = "")
  public LeaveLineCalculationType getCalculationType() {
    return calculationType;
  }

  public void setCalculationType(LeaveLineCalculationType calculationType) {
    this.calculationType = calculationType;
  }

  public LeaveLine entitlementFinalPayPayoutType(
      EntitlementFinalPayPayoutType entitlementFinalPayPayoutType) {
    this.entitlementFinalPayPayoutType = entitlementFinalPayPayoutType;
    return this;
  }

  /**
   * Get entitlementFinalPayPayoutType
   *
   * @return entitlementFinalPayPayoutType
   */
  @ApiModelProperty(value = "")
  public EntitlementFinalPayPayoutType getEntitlementFinalPayPayoutType() {
    return entitlementFinalPayPayoutType;
  }

  public void setEntitlementFinalPayPayoutType(
      EntitlementFinalPayPayoutType entitlementFinalPayPayoutType) {
    this.entitlementFinalPayPayoutType = entitlementFinalPayPayoutType;
  }

  public LeaveLine employmentTerminationPaymentType(
      EmploymentTerminationPaymentType employmentTerminationPaymentType) {
    this.employmentTerminationPaymentType = employmentTerminationPaymentType;
    return this;
  }

  /**
   * Get employmentTerminationPaymentType
   *
   * @return employmentTerminationPaymentType
   */
  @ApiModelProperty(value = "")
  public EmploymentTerminationPaymentType getEmploymentTerminationPaymentType() {
    return employmentTerminationPaymentType;
  }

  public void setEmploymentTerminationPaymentType(
      EmploymentTerminationPaymentType employmentTerminationPaymentType) {
    this.employmentTerminationPaymentType = employmentTerminationPaymentType;
  }

  public LeaveLine includeSuperannuationGuaranteeContribution(
      Boolean includeSuperannuationGuaranteeContribution) {
    this.includeSuperannuationGuaranteeContribution = includeSuperannuationGuaranteeContribution;
    return this;
  }

  /**
   * amount of leave line
   *
   * @return includeSuperannuationGuaranteeContribution
   */
  @ApiModelProperty(example = "true", value = "amount of leave line")
  public Boolean getIncludeSuperannuationGuaranteeContribution() {
    return includeSuperannuationGuaranteeContribution;
  }

  public void setIncludeSuperannuationGuaranteeContribution(
      Boolean includeSuperannuationGuaranteeContribution) {
    this.includeSuperannuationGuaranteeContribution = includeSuperannuationGuaranteeContribution;
  }

  public LeaveLine numberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

  /**
   * Number of units for leave line.
   *
   * @return numberOfUnits
   */
  @ApiModelProperty(example = "2.5", value = "Number of units for leave line.")
  public Double getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  public LeaveLine annualNumberOfUnits(Double annualNumberOfUnits) {
    this.annualNumberOfUnits = annualNumberOfUnits;
    return this;
  }

  /**
   * Hours of leave accrued each year
   *
   * @return annualNumberOfUnits
   */
  @ApiModelProperty(example = "2.5", value = "Hours of leave accrued each year")
  public Double getAnnualNumberOfUnits() {
    return annualNumberOfUnits;
  }

  public void setAnnualNumberOfUnits(Double annualNumberOfUnits) {
    this.annualNumberOfUnits = annualNumberOfUnits;
  }

  public LeaveLine fullTimeNumberOfUnitsPerPeriod(Double fullTimeNumberOfUnitsPerPeriod) {
    this.fullTimeNumberOfUnitsPerPeriod = fullTimeNumberOfUnitsPerPeriod;
    return this;
  }

  /**
   * Normal ordinary earnings number of units for leave line.
   *
   * @return fullTimeNumberOfUnitsPerPeriod
   */
  @ApiModelProperty(
      example = "2.5",
      value = "Normal ordinary earnings number of units for leave line.")
  public Double getFullTimeNumberOfUnitsPerPeriod() {
    return fullTimeNumberOfUnitsPerPeriod;
  }

  public void setFullTimeNumberOfUnitsPerPeriod(Double fullTimeNumberOfUnitsPerPeriod) {
    this.fullTimeNumberOfUnitsPerPeriod = fullTimeNumberOfUnitsPerPeriod;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveLine leaveLine = (LeaveLine) o;
    return Objects.equals(this.leaveTypeID, leaveLine.leaveTypeID)
        && Objects.equals(this.calculationType, leaveLine.calculationType)
        && Objects.equals(
            this.entitlementFinalPayPayoutType, leaveLine.entitlementFinalPayPayoutType)
        && Objects.equals(
            this.employmentTerminationPaymentType, leaveLine.employmentTerminationPaymentType)
        && Objects.equals(
            this.includeSuperannuationGuaranteeContribution,
            leaveLine.includeSuperannuationGuaranteeContribution)
        && Objects.equals(this.numberOfUnits, leaveLine.numberOfUnits)
        && Objects.equals(this.annualNumberOfUnits, leaveLine.annualNumberOfUnits)
        && Objects.equals(
            this.fullTimeNumberOfUnitsPerPeriod, leaveLine.fullTimeNumberOfUnitsPerPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        leaveTypeID,
        calculationType,
        entitlementFinalPayPayoutType,
        employmentTerminationPaymentType,
        includeSuperannuationGuaranteeContribution,
        numberOfUnits,
        annualNumberOfUnits,
        fullTimeNumberOfUnitsPerPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveLine {\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    entitlementFinalPayPayoutType: ")
        .append(toIndentedString(entitlementFinalPayPayoutType))
        .append("\n");
    sb.append("    employmentTerminationPaymentType: ")
        .append(toIndentedString(employmentTerminationPaymentType))
        .append("\n");
    sb.append("    includeSuperannuationGuaranteeContribution: ")
        .append(toIndentedString(includeSuperannuationGuaranteeContribution))
        .append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    annualNumberOfUnits: ")
        .append(toIndentedString(annualNumberOfUnits))
        .append("\n");
    sb.append("    fullTimeNumberOfUnitsPerPeriod: ")
        .append(toIndentedString(fullTimeNumberOfUnitsPerPeriod))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
