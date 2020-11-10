/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.4.2
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;

/** BankTransfer */
public class BankTransfer {
  StringUtil util = new StringUtil();

  @JsonProperty("FromBankAccount")
  private Account fromBankAccount;

  @JsonProperty("ToBankAccount")
  private Account toBankAccount;

  @JsonProperty("Amount")
  private Double amount;

  @JsonProperty("Date")
  private String date;

  @JsonProperty("BankTransferID")
  private UUID bankTransferID;

  @JsonProperty("CurrencyRate")
  private Double currencyRate;

  @JsonProperty("FromBankTransactionID")
  private UUID fromBankTransactionID;

  @JsonProperty("ToBankTransactionID")
  private UUID toBankTransactionID;

  @JsonProperty("HasAttachments")
  private Boolean hasAttachments = false;

  @JsonProperty("CreatedDateUTC")
  private String createdDateUTC;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();

  public BankTransfer fromBankAccount(Account fromBankAccount) {
    this.fromBankAccount = fromBankAccount;
    return this;
  }

  /**
   * Get fromBankAccount
   *
   * @return fromBankAccount
   */
  @ApiModelProperty(required = true, value = "")
  public Account getFromBankAccount() {
    return fromBankAccount;
  }

  public void setFromBankAccount(Account fromBankAccount) {
    this.fromBankAccount = fromBankAccount;
  }

  public BankTransfer toBankAccount(Account toBankAccount) {
    this.toBankAccount = toBankAccount;
    return this;
  }

  /**
   * Get toBankAccount
   *
   * @return toBankAccount
   */
  @ApiModelProperty(required = true, value = "")
  public Account getToBankAccount() {
    return toBankAccount;
  }

  public void setToBankAccount(Account toBankAccount) {
    this.toBankAccount = toBankAccount;
  }

  public BankTransfer amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * amount of the transaction
   *
   * @return amount
   */
  @ApiModelProperty(required = true, value = "amount of the transaction")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public BankTransfer date(String date) {
    this.date = date;
    return this;
  }

  /**
   * The date of the Transfer YYYY-MM-DD
   *
   * @return date
   */
  @ApiModelProperty(value = "The date of the Transfer YYYY-MM-DD")
  public String getDate() {
    return date;
  }

  public LocalDate getDateAsDate() {
    if (this.date != null) {
      try {
        return util.convertStringToDate(this.date);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public void setDate(LocalDate date) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = date.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.date = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  /**
   * The identifier of the Bank Transfer
   *
   * @return bankTransferID
   */
  @ApiModelProperty(value = "The identifier of the Bank Transfer")
  public UUID getBankTransferID() {
    return bankTransferID;
  }

  /**
   * The currency rate
   *
   * @return currencyRate
   */
  @ApiModelProperty(value = "The currency rate")
  public Double getCurrencyRate() {
    return currencyRate;
  }

  /**
   * The Bank Transaction ID for the source account
   *
   * @return fromBankTransactionID
   */
  @ApiModelProperty(value = "The Bank Transaction ID for the source account")
  public UUID getFromBankTransactionID() {
    return fromBankTransactionID;
  }

  /**
   * The Bank Transaction ID for the destination account
   *
   * @return toBankTransactionID
   */
  @ApiModelProperty(value = "The Bank Transaction ID for the destination account")
  public UUID getToBankTransactionID() {
    return toBankTransactionID;
  }

  /**
   * Boolean to indicate if a Bank Transfer has an attachment
   *
   * @return hasAttachments
   */
  @ApiModelProperty(
      example = "false",
      value = "Boolean to indicate if a Bank Transfer has an attachment")
  public Boolean getHasAttachments() {
    return hasAttachments;
  }

  /**
   * UTC timestamp of creation date of bank transfer
   *
   * @return createdDateUTC
   */
  @ApiModelProperty(
      example = "/Date(1573755038314)/",
      value = "UTC timestamp of creation date of bank transfer")
  public String getCreatedDateUTC() {
    return createdDateUTC;
  }

  public OffsetDateTime getCreatedDateUTCAsDate() {
    if (this.createdDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.createdDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public BankTransfer validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public BankTransfer addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @return validationErrors
   */
  @ApiModelProperty(value = "Displays array of validation error messages from the API")
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransfer bankTransfer = (BankTransfer) o;
    return Objects.equals(this.fromBankAccount, bankTransfer.fromBankAccount)
        && Objects.equals(this.toBankAccount, bankTransfer.toBankAccount)
        && Objects.equals(this.amount, bankTransfer.amount)
        && Objects.equals(this.date, bankTransfer.date)
        && Objects.equals(this.bankTransferID, bankTransfer.bankTransferID)
        && Objects.equals(this.currencyRate, bankTransfer.currencyRate)
        && Objects.equals(this.fromBankTransactionID, bankTransfer.fromBankTransactionID)
        && Objects.equals(this.toBankTransactionID, bankTransfer.toBankTransactionID)
        && Objects.equals(this.hasAttachments, bankTransfer.hasAttachments)
        && Objects.equals(this.createdDateUTC, bankTransfer.createdDateUTC)
        && Objects.equals(this.validationErrors, bankTransfer.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fromBankAccount,
        toBankAccount,
        amount,
        date,
        bankTransferID,
        currencyRate,
        fromBankTransactionID,
        toBankTransactionID,
        hasAttachments,
        createdDateUTC,
        validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransfer {\n");
    sb.append("    fromBankAccount: ").append(toIndentedString(fromBankAccount)).append("\n");
    sb.append("    toBankAccount: ").append(toIndentedString(toBankAccount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    bankTransferID: ").append(toIndentedString(bankTransferID)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
    sb.append("    fromBankTransactionID: ")
        .append(toIndentedString(fromBankTransactionID))
        .append("\n");
    sb.append("    toBankTransactionID: ")
        .append(toIndentedString(toBankTransactionID))
        .append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
    sb.append("    createdDateUTC: ").append(toIndentedString(createdDateUTC)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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
