/*
 * Xero Projects API
 * This is the Xero Projects API
 *
 * The version of the OpenAPI document: 2.2.10
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Amount */
public class Amount {
  StringUtil util = new StringUtil();

  @JsonProperty("currency")
  private CurrencyCode currency;

  @JsonProperty("value")
  private Double value;

  public Amount currency(CurrencyCode currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   *
   * @return currency
   */
  @ApiModelProperty(value = "")
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  public Amount value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   *
   * @return value
   */
  @ApiModelProperty(example = "1.0", value = "")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount amount = (Amount) o;
    return Objects.equals(this.currency, amount.currency)
        && Objects.equals(this.value, amount.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
