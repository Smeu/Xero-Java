/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.2.10
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
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/** TaxDeclaration */
public class TaxDeclaration {
  StringUtil util = new StringUtil();

  @JsonProperty("EmployeeID")
  private UUID employeeID;

  @JsonProperty("EmploymentBasis")
  private EmploymentBasis employmentBasis;

  @JsonProperty("TFNExemptionType")
  private TFNExemptionType tfNExemptionType;

  @JsonProperty("TaxFileNumber")
  private String taxFileNumber;

  @JsonProperty("AustralianResidentForTaxPurposes")
  private Boolean australianResidentForTaxPurposes;

  @JsonProperty("ResidencyStatus")
  private ResidencyStatus residencyStatus;

  @JsonProperty("TaxFreeThresholdClaimed")
  private Boolean taxFreeThresholdClaimed;

  @JsonProperty("TaxOffsetEstimatedAmount")
  private BigDecimal taxOffsetEstimatedAmount;

  @JsonProperty("HasHELPDebt")
  private Boolean hasHELPDebt;

  @JsonProperty("HasSFSSDebt")
  private Boolean hasSFSSDebt;

  @JsonProperty("HasTradeSupportLoanDebt")
  private Boolean hasTradeSupportLoanDebt;

  @JsonProperty("UpwardVariationTaxWithholdingAmount")
  private BigDecimal upwardVariationTaxWithholdingAmount;

  @JsonProperty("EligibleToReceiveLeaveLoading")
  private Boolean eligibleToReceiveLeaveLoading;

  @JsonProperty("ApprovedWithholdingVariationPercentage")
  private BigDecimal approvedWithholdingVariationPercentage;

  @JsonProperty("HasStudentStartupLoan")
  private Boolean hasStudentStartupLoan;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  public TaxDeclaration employeeID(UUID employeeID) {
    this.employeeID = employeeID;
    return this;
  }

  /**
   * Address line 1 for employee home address
   *
   * @return employeeID
   */
  @ApiModelProperty(required = true, value = "Address line 1 for employee home address")
  public UUID getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(UUID employeeID) {
    this.employeeID = employeeID;
  }

  public TaxDeclaration employmentBasis(EmploymentBasis employmentBasis) {
    this.employmentBasis = employmentBasis;
    return this;
  }

  /**
   * Get employmentBasis
   *
   * @return employmentBasis
   */
  @ApiModelProperty(required = true, value = "")
  public EmploymentBasis getEmploymentBasis() {
    return employmentBasis;
  }

  public void setEmploymentBasis(EmploymentBasis employmentBasis) {
    this.employmentBasis = employmentBasis;
  }

  public TaxDeclaration tfNExemptionType(TFNExemptionType tfNExemptionType) {
    this.tfNExemptionType = tfNExemptionType;
    return this;
  }

  /**
   * Get tfNExemptionType
   *
   * @return tfNExemptionType
   */
  @ApiModelProperty(value = "")
  public TFNExemptionType getTfNExemptionType() {
    return tfNExemptionType;
  }

  public void setTfNExemptionType(TFNExemptionType tfNExemptionType) {
    this.tfNExemptionType = tfNExemptionType;
  }

  public TaxDeclaration taxFileNumber(String taxFileNumber) {
    this.taxFileNumber = taxFileNumber;
    return this;
  }

  /**
   * The tax file number e.g 123123123.
   *
   * @return taxFileNumber
   */
  @ApiModelProperty(example = "123123123", value = "The tax file number e.g 123123123.")
  public String getTaxFileNumber() {
    return taxFileNumber;
  }

  public void setTaxFileNumber(String taxFileNumber) {
    this.taxFileNumber = taxFileNumber;
  }

  public TaxDeclaration australianResidentForTaxPurposes(Boolean australianResidentForTaxPurposes) {
    this.australianResidentForTaxPurposes = australianResidentForTaxPurposes;
    return this;
  }

  /**
   * If the employee is Australian resident for tax purposes. e.g true or false
   *
   * @return australianResidentForTaxPurposes
   */
  @ApiModelProperty(
      example = "true",
      value = "If the employee is Australian resident for tax purposes. e.g true or false")
  public Boolean getAustralianResidentForTaxPurposes() {
    return australianResidentForTaxPurposes;
  }

  public void setAustralianResidentForTaxPurposes(Boolean australianResidentForTaxPurposes) {
    this.australianResidentForTaxPurposes = australianResidentForTaxPurposes;
  }

  public TaxDeclaration residencyStatus(ResidencyStatus residencyStatus) {
    this.residencyStatus = residencyStatus;
    return this;
  }

  /**
   * Get residencyStatus
   *
   * @return residencyStatus
   */
  @ApiModelProperty(value = "")
  public ResidencyStatus getResidencyStatus() {
    return residencyStatus;
  }

  public void setResidencyStatus(ResidencyStatus residencyStatus) {
    this.residencyStatus = residencyStatus;
  }

  public TaxDeclaration taxFreeThresholdClaimed(Boolean taxFreeThresholdClaimed) {
    this.taxFreeThresholdClaimed = taxFreeThresholdClaimed;
    return this;
  }

  /**
   * If tax free threshold claimed. e.g true or false
   *
   * @return taxFreeThresholdClaimed
   */
  @ApiModelProperty(example = "false", value = "If tax free threshold claimed. e.g true or false")
  public Boolean getTaxFreeThresholdClaimed() {
    return taxFreeThresholdClaimed;
  }

  public void setTaxFreeThresholdClaimed(Boolean taxFreeThresholdClaimed) {
    this.taxFreeThresholdClaimed = taxFreeThresholdClaimed;
  }

  public TaxDeclaration taxOffsetEstimatedAmount(BigDecimal taxOffsetEstimatedAmount) {
    this.taxOffsetEstimatedAmount = taxOffsetEstimatedAmount;
    return this;
  }

  /**
   * If has tax offset estimated then the tax offset estimated amount. e.g 100
   *
   * @return taxOffsetEstimatedAmount
   */
  @ApiModelProperty(
      example = "100",
      value = "If has tax offset estimated then the tax offset estimated amount. e.g 100")
  public BigDecimal getTaxOffsetEstimatedAmount() {
    return taxOffsetEstimatedAmount;
  }

  public void setTaxOffsetEstimatedAmount(BigDecimal taxOffsetEstimatedAmount) {
    this.taxOffsetEstimatedAmount = taxOffsetEstimatedAmount;
  }

  public TaxDeclaration hasHELPDebt(Boolean hasHELPDebt) {
    this.hasHELPDebt = hasHELPDebt;
    return this;
  }

  /**
   * If employee has HECS or HELP debt. e.g true or false
   *
   * @return hasHELPDebt
   */
  @ApiModelProperty(
      example = "false",
      value = "If employee has HECS or HELP debt. e.g true or false")
  public Boolean getHasHELPDebt() {
    return hasHELPDebt;
  }

  public void setHasHELPDebt(Boolean hasHELPDebt) {
    this.hasHELPDebt = hasHELPDebt;
  }

  public TaxDeclaration hasSFSSDebt(Boolean hasSFSSDebt) {
    this.hasSFSSDebt = hasSFSSDebt;
    return this;
  }

  /**
   * If employee has financial supplement debt. e.g true or false
   *
   * @return hasSFSSDebt
   */
  @ApiModelProperty(
      example = "false",
      value = "If employee has financial supplement debt. e.g true or false")
  public Boolean getHasSFSSDebt() {
    return hasSFSSDebt;
  }

  public void setHasSFSSDebt(Boolean hasSFSSDebt) {
    this.hasSFSSDebt = hasSFSSDebt;
  }

  public TaxDeclaration hasTradeSupportLoanDebt(Boolean hasTradeSupportLoanDebt) {
    this.hasTradeSupportLoanDebt = hasTradeSupportLoanDebt;
    return this;
  }

  /**
   * If employee has trade support loan. e.g true or false
   *
   * @return hasTradeSupportLoanDebt
   */
  @ApiModelProperty(
      example = "false",
      value = "If employee has trade support loan. e.g true or false")
  public Boolean getHasTradeSupportLoanDebt() {
    return hasTradeSupportLoanDebt;
  }

  public void setHasTradeSupportLoanDebt(Boolean hasTradeSupportLoanDebt) {
    this.hasTradeSupportLoanDebt = hasTradeSupportLoanDebt;
  }

  public TaxDeclaration upwardVariationTaxWithholdingAmount(
      BigDecimal upwardVariationTaxWithholdingAmount) {
    this.upwardVariationTaxWithholdingAmount = upwardVariationTaxWithholdingAmount;
    return this;
  }

  /**
   * If the employee has requested that additional tax be withheld each pay run. e.g 50
   *
   * @return upwardVariationTaxWithholdingAmount
   */
  @ApiModelProperty(
      example = "50",
      value = "If the employee has requested that additional tax be withheld each pay run. e.g 50")
  public BigDecimal getUpwardVariationTaxWithholdingAmount() {
    return upwardVariationTaxWithholdingAmount;
  }

  public void setUpwardVariationTaxWithholdingAmount(
      BigDecimal upwardVariationTaxWithholdingAmount) {
    this.upwardVariationTaxWithholdingAmount = upwardVariationTaxWithholdingAmount;
  }

  public TaxDeclaration eligibleToReceiveLeaveLoading(Boolean eligibleToReceiveLeaveLoading) {
    this.eligibleToReceiveLeaveLoading = eligibleToReceiveLeaveLoading;
    return this;
  }

  /**
   * If the employee is eligible to receive an additional percentage on top of ordinary earnings
   * when they take leave (typically 17.5%). e.g true or false
   *
   * @return eligibleToReceiveLeaveLoading
   */
  @ApiModelProperty(
      example = "false",
      value =
          "If the employee is eligible to receive an additional percentage on top of ordinary"
              + " earnings when they take leave (typically 17.5%). e.g true or false")
  public Boolean getEligibleToReceiveLeaveLoading() {
    return eligibleToReceiveLeaveLoading;
  }

  public void setEligibleToReceiveLeaveLoading(Boolean eligibleToReceiveLeaveLoading) {
    this.eligibleToReceiveLeaveLoading = eligibleToReceiveLeaveLoading;
  }

  public TaxDeclaration approvedWithholdingVariationPercentage(
      BigDecimal approvedWithholdingVariationPercentage) {
    this.approvedWithholdingVariationPercentage = approvedWithholdingVariationPercentage;
    return this;
  }

  /**
   * If the employee has approved withholding variation. e.g (0 - 100)
   *
   * @return approvedWithholdingVariationPercentage
   */
  @ApiModelProperty(
      example = "75",
      value = "If the employee has approved withholding variation. e.g (0 - 100)")
  public BigDecimal getApprovedWithholdingVariationPercentage() {
    return approvedWithholdingVariationPercentage;
  }

  public void setApprovedWithholdingVariationPercentage(
      BigDecimal approvedWithholdingVariationPercentage) {
    this.approvedWithholdingVariationPercentage = approvedWithholdingVariationPercentage;
  }

  public TaxDeclaration hasStudentStartupLoan(Boolean hasStudentStartupLoan) {
    this.hasStudentStartupLoan = hasStudentStartupLoan;
    return this;
  }

  /**
   * If the employee is eligible for student startup loan rules
   *
   * @return hasStudentStartupLoan
   */
  @ApiModelProperty(
      example = "true",
      value = "If the employee is eligible for student startup loan rules")
  public Boolean getHasStudentStartupLoan() {
    return hasStudentStartupLoan;
  }

  public void setHasStudentStartupLoan(Boolean hasStudentStartupLoan) {
    this.hasStudentStartupLoan = hasStudentStartupLoan;
  }

  /**
   * Last modified timestamp
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(example = "/Date(1583967733054+0000)/", value = "Last modified timestamp")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public OffsetDateTime getUpdatedDateUTCAsDate() {
    if (this.updatedDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.updatedDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxDeclaration taxDeclaration = (TaxDeclaration) o;
    return Objects.equals(this.employeeID, taxDeclaration.employeeID)
        && Objects.equals(this.employmentBasis, taxDeclaration.employmentBasis)
        && Objects.equals(this.tfNExemptionType, taxDeclaration.tfNExemptionType)
        && Objects.equals(this.taxFileNumber, taxDeclaration.taxFileNumber)
        && Objects.equals(
            this.australianResidentForTaxPurposes, taxDeclaration.australianResidentForTaxPurposes)
        && Objects.equals(this.residencyStatus, taxDeclaration.residencyStatus)
        && Objects.equals(this.taxFreeThresholdClaimed, taxDeclaration.taxFreeThresholdClaimed)
        && Objects.equals(this.taxOffsetEstimatedAmount, taxDeclaration.taxOffsetEstimatedAmount)
        && Objects.equals(this.hasHELPDebt, taxDeclaration.hasHELPDebt)
        && Objects.equals(this.hasSFSSDebt, taxDeclaration.hasSFSSDebt)
        && Objects.equals(this.hasTradeSupportLoanDebt, taxDeclaration.hasTradeSupportLoanDebt)
        && Objects.equals(
            this.upwardVariationTaxWithholdingAmount,
            taxDeclaration.upwardVariationTaxWithholdingAmount)
        && Objects.equals(
            this.eligibleToReceiveLeaveLoading, taxDeclaration.eligibleToReceiveLeaveLoading)
        && Objects.equals(
            this.approvedWithholdingVariationPercentage,
            taxDeclaration.approvedWithholdingVariationPercentage)
        && Objects.equals(this.hasStudentStartupLoan, taxDeclaration.hasStudentStartupLoan)
        && Objects.equals(this.updatedDateUTC, taxDeclaration.updatedDateUTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        employeeID,
        employmentBasis,
        tfNExemptionType,
        taxFileNumber,
        australianResidentForTaxPurposes,
        residencyStatus,
        taxFreeThresholdClaimed,
        taxOffsetEstimatedAmount,
        hasHELPDebt,
        hasSFSSDebt,
        hasTradeSupportLoanDebt,
        upwardVariationTaxWithholdingAmount,
        eligibleToReceiveLeaveLoading,
        approvedWithholdingVariationPercentage,
        hasStudentStartupLoan,
        updatedDateUTC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDeclaration {\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    employmentBasis: ").append(toIndentedString(employmentBasis)).append("\n");
    sb.append("    tfNExemptionType: ").append(toIndentedString(tfNExemptionType)).append("\n");
    sb.append("    taxFileNumber: ").append(toIndentedString(taxFileNumber)).append("\n");
    sb.append("    australianResidentForTaxPurposes: ")
        .append(toIndentedString(australianResidentForTaxPurposes))
        .append("\n");
    sb.append("    residencyStatus: ").append(toIndentedString(residencyStatus)).append("\n");
    sb.append("    taxFreeThresholdClaimed: ")
        .append(toIndentedString(taxFreeThresholdClaimed))
        .append("\n");
    sb.append("    taxOffsetEstimatedAmount: ")
        .append(toIndentedString(taxOffsetEstimatedAmount))
        .append("\n");
    sb.append("    hasHELPDebt: ").append(toIndentedString(hasHELPDebt)).append("\n");
    sb.append("    hasSFSSDebt: ").append(toIndentedString(hasSFSSDebt)).append("\n");
    sb.append("    hasTradeSupportLoanDebt: ")
        .append(toIndentedString(hasTradeSupportLoanDebt))
        .append("\n");
    sb.append("    upwardVariationTaxWithholdingAmount: ")
        .append(toIndentedString(upwardVariationTaxWithholdingAmount))
        .append("\n");
    sb.append("    eligibleToReceiveLeaveLoading: ")
        .append(toIndentedString(eligibleToReceiveLeaveLoading))
        .append("\n");
    sb.append("    approvedWithholdingVariationPercentage: ")
        .append(toIndentedString(approvedWithholdingVariationPercentage))
        .append("\n");
    sb.append("    hasStudentStartupLoan: ")
        .append(toIndentedString(hasStudentStartupLoan))
        .append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
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
