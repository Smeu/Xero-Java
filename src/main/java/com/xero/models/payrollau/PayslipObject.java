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
import com.xero.models.payrollau.Payslip;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * PayslipObject
 */

public class PayslipObject {

  
  @JsonProperty("Payslip")
  private Payslip payslip = null;
  public PayslipObject payslip(Payslip payslip) {
    this.payslip = payslip;
    return this;
  }

   /**
   * Get payslip
   * @return payslip
  **/
  @ApiModelProperty(value = "")
  public Payslip getPayslip() {
    return payslip;
  }

  public void setPayslip(Payslip payslip) {
    this.payslip = payslip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayslipObject payslipObject = (PayslipObject) o;
    return Objects.equals(this.payslip, payslipObject.payslip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payslip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayslipObject {\n");
    sb.append("    payslip: ").append(toIndentedString(payslip)).append("\n");
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

