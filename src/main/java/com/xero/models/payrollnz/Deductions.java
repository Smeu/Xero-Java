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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Deductions */
public class Deductions {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("deductions")
  private List<Deduction> deductions = new ArrayList<Deduction>();

  public Deductions pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   *
   * @return pagination
   */
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public Deductions problem(Problem problem) {
    this.problem = problem;
    return this;
  }

  /**
   * Get problem
   *
   * @return problem
   */
  @ApiModelProperty(value = "")
  public Problem getProblem() {
    return problem;
  }

  public void setProblem(Problem problem) {
    this.problem = problem;
  }

  public Deductions deductions(List<Deduction> deductions) {
    this.deductions = deductions;
    return this;
  }

  public Deductions addDeductionsItem(Deduction deductionsItem) {
    if (this.deductions == null) {
      this.deductions = new ArrayList<Deduction>();
    }
    this.deductions.add(deductionsItem);
    return this;
  }

  /**
   * Get deductions
   *
   * @return deductions
   */
  @ApiModelProperty(value = "")
  public List<Deduction> getDeductions() {
    return deductions;
  }

  public void setDeductions(List<Deduction> deductions) {
    this.deductions = deductions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deductions deductions = (Deductions) o;
    return Objects.equals(this.pagination, deductions.pagination)
        && Objects.equals(this.problem, deductions.problem)
        && Objects.equals(this.deductions, deductions.deductions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, deductions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deductions {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
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
