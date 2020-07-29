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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Prepayments */
public class Prepayments {
  StringUtil util = new StringUtil();

  @JsonProperty("Prepayments")
  private List<Prepayment> prepayments = new ArrayList<Prepayment>();

  public Prepayments prepayments(List<Prepayment> prepayments) {
    this.prepayments = prepayments;
    return this;
  }

  public Prepayments addPrepaymentsItem(Prepayment prepaymentsItem) {
    if (this.prepayments == null) {
      this.prepayments = new ArrayList<Prepayment>();
    }
    this.prepayments.add(prepaymentsItem);
    return this;
  }

  /**
   * Get prepayments
   *
   * @return prepayments
   */
  @ApiModelProperty(value = "")
  public List<Prepayment> getPrepayments() {
    return prepayments;
  }

  public void setPrepayments(List<Prepayment> prepayments) {
    this.prepayments = prepayments;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Prepayments prepayments = (Prepayments) o;
    return Objects.equals(this.prepayments, prepayments.prepayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prepayments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prepayments {\n");
    sb.append("    prepayments: ").append(toIndentedString(prepayments)).append("\n");
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
