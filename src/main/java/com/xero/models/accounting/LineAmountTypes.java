/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.4
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Line amounts are exclusive of tax by default if you don’t specify this element. See Line Amount Types
 */
public enum LineAmountTypes {
  
  EXCLUSIVE("Exclusive"),
  
  INCLUSIVE("Inclusive"),
  
  NOTAX("NoTax");

  private String value;

  LineAmountTypes(String value) {
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
  public static LineAmountTypes fromValue(String value) {
    for (LineAmountTypes b : LineAmountTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

