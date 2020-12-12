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

/** EarningsTemplateObject */
public class EarningsTemplateObject {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("earningTemplate")
  private EarningsTemplate earningTemplate;

  public EarningsTemplateObject pagination(Pagination pagination) {
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

  public EarningsTemplateObject problem(Problem problem) {
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

  public EarningsTemplateObject earningTemplate(EarningsTemplate earningTemplate) {
    this.earningTemplate = earningTemplate;
    return this;
  }

  /**
   * Get earningTemplate
   *
   * @return earningTemplate
   */
  @ApiModelProperty(value = "")
  public EarningsTemplate getEarningTemplate() {
    return earningTemplate;
  }

  public void setEarningTemplate(EarningsTemplate earningTemplate) {
    this.earningTemplate = earningTemplate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningsTemplateObject earningsTemplateObject = (EarningsTemplateObject) o;
    return Objects.equals(this.pagination, earningsTemplateObject.pagination)
        && Objects.equals(this.problem, earningsTemplateObject.problem)
        && Objects.equals(this.earningTemplate, earningsTemplateObject.earningTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, earningTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsTemplateObject {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    earningTemplate: ").append(toIndentedString(earningTemplate)).append("\n");
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
