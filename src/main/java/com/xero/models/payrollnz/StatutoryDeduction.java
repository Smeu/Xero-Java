/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * The version of the OpenAPI document: 2.7.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollnz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** StatutoryDeduction */
public class StatutoryDeduction {
  StringUtil util = new StringUtil();

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("statutoryDeductionCategory")
  private StatutoryDeductionCategory statutoryDeductionCategory;

  @JsonProperty("liabilityAccountId")
  private UUID liabilityAccountId;

  @JsonProperty("currentRecord")
  private Boolean currentRecord;

  public StatutoryDeduction id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The Xero identifier for earnings order
   *
   * @return id
   */
  @ApiModelProperty(value = "The Xero identifier for earnings order")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public StatutoryDeduction name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the earnings order
   *
   * @return name
   */
  @ApiModelProperty(value = "Name of the earnings order")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StatutoryDeduction statutoryDeductionCategory(
      StatutoryDeductionCategory statutoryDeductionCategory) {
    this.statutoryDeductionCategory = statutoryDeductionCategory;
    return this;
  }

  /**
   * Get statutoryDeductionCategory
   *
   * @return statutoryDeductionCategory
   */
  @ApiModelProperty(value = "")
  public StatutoryDeductionCategory getStatutoryDeductionCategory() {
    return statutoryDeductionCategory;
  }

  public void setStatutoryDeductionCategory(StatutoryDeductionCategory statutoryDeductionCategory) {
    this.statutoryDeductionCategory = statutoryDeductionCategory;
  }

  public StatutoryDeduction liabilityAccountId(UUID liabilityAccountId) {
    this.liabilityAccountId = liabilityAccountId;
    return this;
  }

  /**
   * Xero identifier for Liability Account
   *
   * @return liabilityAccountId
   */
  @ApiModelProperty(value = "Xero identifier for Liability Account")
  public UUID getLiabilityAccountId() {
    return liabilityAccountId;
  }

  public void setLiabilityAccountId(UUID liabilityAccountId) {
    this.liabilityAccountId = liabilityAccountId;
  }

  public StatutoryDeduction currentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
    return this;
  }

  /**
   * Identifier of a record is active or not.
   *
   * @return currentRecord
   */
  @ApiModelProperty(value = "Identifier of a record is active or not.")
  public Boolean getCurrentRecord() {
    return currentRecord;
  }

  public void setCurrentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatutoryDeduction statutoryDeduction = (StatutoryDeduction) o;
    return Objects.equals(this.id, statutoryDeduction.id)
        && Objects.equals(this.name, statutoryDeduction.name)
        && Objects.equals(
            this.statutoryDeductionCategory, statutoryDeduction.statutoryDeductionCategory)
        && Objects.equals(this.liabilityAccountId, statutoryDeduction.liabilityAccountId)
        && Objects.equals(this.currentRecord, statutoryDeduction.currentRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, statutoryDeductionCategory, liabilityAccountId, currentRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatutoryDeduction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statutoryDeductionCategory: ")
        .append(toIndentedString(statutoryDeductionCategory))
        .append("\n");
    sb.append("    liabilityAccountId: ").append(toIndentedString(liabilityAccountId)).append("\n");
    sb.append("    currentRecord: ").append(toIndentedString(currentRecord)).append("\n");
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
