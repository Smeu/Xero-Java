/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * The version of the OpenAPI document: 2.2.15
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

/** EmployeeStatutorySickLeaves */
public class EmployeeStatutorySickLeaves {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("statutorySickLeave")
  private List<EmployeeStatutorySickLeave> statutorySickLeave =
      new ArrayList<EmployeeStatutorySickLeave>();

  public EmployeeStatutorySickLeaves pagination(Pagination pagination) {
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

  public EmployeeStatutorySickLeaves problem(Problem problem) {
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

  public EmployeeStatutorySickLeaves statutorySickLeave(
      List<EmployeeStatutorySickLeave> statutorySickLeave) {
    this.statutorySickLeave = statutorySickLeave;
    return this;
  }

  public EmployeeStatutorySickLeaves addStatutorySickLeaveItem(
      EmployeeStatutorySickLeave statutorySickLeaveItem) {
    if (this.statutorySickLeave == null) {
      this.statutorySickLeave = new ArrayList<EmployeeStatutorySickLeave>();
    }
    this.statutorySickLeave.add(statutorySickLeaveItem);
    return this;
  }

  /**
   * Get statutorySickLeave
   *
   * @return statutorySickLeave
   */
  @ApiModelProperty(value = "")
  public List<EmployeeStatutorySickLeave> getStatutorySickLeave() {
    return statutorySickLeave;
  }

  public void setStatutorySickLeave(List<EmployeeStatutorySickLeave> statutorySickLeave) {
    this.statutorySickLeave = statutorySickLeave;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeStatutorySickLeaves employeeStatutorySickLeaves = (EmployeeStatutorySickLeaves) o;
    return Objects.equals(this.pagination, employeeStatutorySickLeaves.pagination)
        && Objects.equals(this.problem, employeeStatutorySickLeaves.problem)
        && Objects.equals(this.statutorySickLeave, employeeStatutorySickLeaves.statutorySickLeave);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, statutorySickLeave);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeStatutorySickLeaves {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    statutorySickLeave: ").append(toIndentedString(statutorySickLeave)).append("\n");
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
