/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.2.10
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AccountsReceivable */
public class AccountsReceivable {
  StringUtil util = new StringUtil();

  @JsonProperty("Outstanding")
  private Double outstanding;

  @JsonProperty("Overdue")
  private Double overdue;

  public AccountsReceivable outstanding(Double outstanding) {
    this.outstanding = outstanding;
    return this;
  }

  /**
   * Get outstanding
   *
   * @return outstanding
   */
  @ApiModelProperty(value = "")
  public Double getOutstanding() {
    return outstanding;
  }

  public void setOutstanding(Double outstanding) {
    this.outstanding = outstanding;
  }

  public AccountsReceivable overdue(Double overdue) {
    this.overdue = overdue;
    return this;
  }

  /**
   * Get overdue
   *
   * @return overdue
   */
  @ApiModelProperty(value = "")
  public Double getOverdue() {
    return overdue;
  }

  public void setOverdue(Double overdue) {
    this.overdue = overdue;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsReceivable accountsReceivable = (AccountsReceivable) o;
    return Objects.equals(this.outstanding, accountsReceivable.outstanding)
        && Objects.equals(this.overdue, accountsReceivable.overdue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outstanding, overdue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsReceivable {\n");
    sb.append("    outstanding: ").append(toIndentedString(outstanding)).append("\n");
    sb.append("    overdue: ").append(toIndentedString(overdue)).append("\n");
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
