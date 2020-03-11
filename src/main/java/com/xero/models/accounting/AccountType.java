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
 * See Account Types
 */
public enum AccountType {
  
  BANK("BANK"),
  
  CURRENT("CURRENT"),
  
  CURRLIAB("CURRLIAB"),
  
  DEPRECIATN("DEPRECIATN"),
  
  DIRECTCOSTS("DIRECTCOSTS"),
  
  EQUITY("EQUITY"),
  
  EXPENSE("EXPENSE"),
  
  FIXED("FIXED"),
  
  INVENTORY("INVENTORY"),
  
  LIABILITY("LIABILITY"),
  
  NONCURRENT("NONCURRENT"),
  
  OTHERINCOME("OTHERINCOME"),
  
  OVERHEADS("OVERHEADS"),
  
  PREPAYMENT("PREPAYMENT"),
  
  REVENUE("REVENUE"),
  
  SALES("SALES"),
  
  TERMLIAB("TERMLIAB"),
  
  PAYGLIABILITY("PAYGLIABILITY"),
  
  PAYG("PAYG"),
  
  SUPERANNUATIONEXPENSE("SUPERANNUATIONEXPENSE"),
  
  SUPERANNUATIONLIABILITY("SUPERANNUATIONLIABILITY"),
  
  WAGESEXPENSE("WAGESEXPENSE");

  private String value;

  AccountType(String value) {
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
  public static AccountType fromValue(String value) {
    for (AccountType b : AccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

