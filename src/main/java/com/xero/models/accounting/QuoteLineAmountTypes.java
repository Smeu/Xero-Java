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


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Line amounts are exclusive of tax by default if you don’t specify this element. See Line Amount
 * Types
 */
public enum QuoteLineAmountTypes {
  EXCLUSIVE("EXCLUSIVE"),

  INCLUSIVE("INCLUSIVE"),

  NOTAX("NOTAX");

  private String value;

  QuoteLineAmountTypes(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QuoteLineAmountTypes fromValue(String value) {
    for (QuoteLineAmountTypes b : QuoteLineAmountTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
