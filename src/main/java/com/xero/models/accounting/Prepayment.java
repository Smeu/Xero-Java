/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.7.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
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

/** Prepayment */
public class Prepayment {
  StringUtil util = new StringUtil();
  /** See Prepayment Types */
  public enum TypeEnum {
    RECEIVE_PREPAYMENT("RECEIVE-PREPAYMENT"),

    SPEND_PREPAYMENT("SPEND-PREPAYMENT"),

    ARPREPAYMENT("ARPREPAYMENT"),

    APPREPAYMENT("APPREPAYMENT");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Type")
  private TypeEnum type;

  @JsonProperty("Contact")
  private Contact contact;

  @JsonProperty("Date")
  private String date;
  /** See Prepayment Status Codes */
  public enum StatusEnum {
    AUTHORISED("AUTHORISED"),

    PAID("PAID"),

    VOIDED("VOIDED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Status")
  private StatusEnum status;

  @JsonProperty("LineAmountTypes")
  private LineAmountTypes lineAmountTypes;

  @JsonProperty("LineItems")
  private List<LineItem> lineItems = new ArrayList<LineItem>();

  @JsonProperty("SubTotal")
  private Double subTotal;

  @JsonProperty("TotalTax")
  private Double totalTax;

  @JsonProperty("Total")
  private Double total;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("CurrencyCode")
  private CurrencyCode currencyCode;

  @JsonProperty("PrepaymentID")
  private UUID prepaymentID;

  @JsonProperty("CurrencyRate")
  private Double currencyRate;

  @JsonProperty("RemainingCredit")
  private Double remainingCredit;

  @JsonProperty("Allocations")
  private List<Allocation> allocations = new ArrayList<Allocation>();

  @JsonProperty("AppliedAmount")
  private Double appliedAmount;

  @JsonProperty("HasAttachments")
  private Boolean hasAttachments = false;

  @JsonProperty("Attachments")
  private List<Attachment> attachments = new ArrayList<Attachment>();

  public Prepayment type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * See Prepayment Types
   *
   * @return type
   */
  @ApiModelProperty(value = "See Prepayment Types")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Prepayment contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   *
   * @return contact
   */
  @ApiModelProperty(value = "")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Prepayment date(String date) {
    this.date = date;
    return this;
  }

  /**
   * The date the prepayment is created YYYY-MM-DD
   *
   * @return date
   */
  @ApiModelProperty(value = "The date the prepayment is created YYYY-MM-DD")
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

  public Prepayment status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * See Prepayment Status Codes
   *
   * @return status
   */
  @ApiModelProperty(value = "See Prepayment Status Codes")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Prepayment lineAmountTypes(LineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
    return this;
  }

  /**
   * Get lineAmountTypes
   *
   * @return lineAmountTypes
   */
  @ApiModelProperty(value = "")
  public LineAmountTypes getLineAmountTypes() {
    return lineAmountTypes;
  }

  public void setLineAmountTypes(LineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
  }

  public Prepayment lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Prepayment addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<LineItem>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * See Prepayment Line Items
   *
   * @return lineItems
   */
  @ApiModelProperty(value = "See Prepayment Line Items")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public Prepayment subTotal(Double subTotal) {
    this.subTotal = subTotal;
    return this;
  }

  /**
   * The subtotal of the prepayment excluding taxes
   *
   * @return subTotal
   */
  @ApiModelProperty(value = "The subtotal of the prepayment excluding taxes")
  public Double getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Double subTotal) {
    this.subTotal = subTotal;
  }

  public Prepayment totalTax(Double totalTax) {
    this.totalTax = totalTax;
    return this;
  }

  /**
   * The total tax on the prepayment
   *
   * @return totalTax
   */
  @ApiModelProperty(value = "The total tax on the prepayment")
  public Double getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }

  public Prepayment total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * The total of the prepayment(subtotal + total tax)
   *
   * @return total
   */
  @ApiModelProperty(value = "The total of the prepayment(subtotal + total tax)")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  /**
   * Returns Invoice number field. Reference field isn&#39;t available.
   *
   * @return reference
   */
  @ApiModelProperty(value = "Returns Invoice number field. Reference field isn't available.")
  public String getReference() {
    return reference;
  }

  /**
   * UTC timestamp of last update to the prepayment
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(
      example = "/Date(1573755038314)/",
      value = "UTC timestamp of last update to the prepayment")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public OffsetDateTime getUpdatedDateUTCAsDate() {
    if (this.updatedDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.updatedDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public Prepayment currencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   *
   * @return currencyCode
   */
  @ApiModelProperty(value = "")
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Prepayment prepaymentID(UUID prepaymentID) {
    this.prepaymentID = prepaymentID;
    return this;
  }

  /**
   * Xero generated unique identifier
   *
   * @return prepaymentID
   */
  @ApiModelProperty(value = "Xero generated unique identifier")
  public UUID getPrepaymentID() {
    return prepaymentID;
  }

  public void setPrepaymentID(UUID prepaymentID) {
    this.prepaymentID = prepaymentID;
  }

  public Prepayment currencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
    return this;
  }

  /**
   * The currency rate for a multicurrency prepayment. If no rate is specified, the XE.com day rate
   * is used
   *
   * @return currencyRate
   */
  @ApiModelProperty(
      value =
          "The currency rate for a multicurrency prepayment. If no rate is specified, the XE.com"
              + " day rate is used")
  public Double getCurrencyRate() {
    return currencyRate;
  }

  public void setCurrencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
  }

  public Prepayment remainingCredit(Double remainingCredit) {
    this.remainingCredit = remainingCredit;
    return this;
  }

  /**
   * The remaining credit balance on the prepayment
   *
   * @return remainingCredit
   */
  @ApiModelProperty(value = "The remaining credit balance on the prepayment")
  public Double getRemainingCredit() {
    return remainingCredit;
  }

  public void setRemainingCredit(Double remainingCredit) {
    this.remainingCredit = remainingCredit;
  }

  public Prepayment allocations(List<Allocation> allocations) {
    this.allocations = allocations;
    return this;
  }

  public Prepayment addAllocationsItem(Allocation allocationsItem) {
    if (this.allocations == null) {
      this.allocations = new ArrayList<Allocation>();
    }
    this.allocations.add(allocationsItem);
    return this;
  }

  /**
   * See Allocations
   *
   * @return allocations
   */
  @ApiModelProperty(value = "See Allocations")
  public List<Allocation> getAllocations() {
    return allocations;
  }

  public void setAllocations(List<Allocation> allocations) {
    this.allocations = allocations;
  }

  public Prepayment appliedAmount(Double appliedAmount) {
    this.appliedAmount = appliedAmount;
    return this;
  }

  /**
   * The amount of applied to an invoice
   *
   * @return appliedAmount
   */
  @ApiModelProperty(example = "2.0", value = "The amount of applied to an invoice")
  public Double getAppliedAmount() {
    return appliedAmount;
  }

  public void setAppliedAmount(Double appliedAmount) {
    this.appliedAmount = appliedAmount;
  }

  /**
   * boolean to indicate if a prepayment has an attachment
   *
   * @return hasAttachments
   */
  @ApiModelProperty(
      example = "false",
      value = "boolean to indicate if a prepayment has an attachment")
  public Boolean getHasAttachments() {
    return hasAttachments;
  }

  public Prepayment attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public Prepayment addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * See Attachments
   *
   * @return attachments
   */
  @ApiModelProperty(value = "See Attachments")
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Prepayment prepayment = (Prepayment) o;
    return Objects.equals(this.type, prepayment.type)
        && Objects.equals(this.contact, prepayment.contact)
        && Objects.equals(this.date, prepayment.date)
        && Objects.equals(this.status, prepayment.status)
        && Objects.equals(this.lineAmountTypes, prepayment.lineAmountTypes)
        && Objects.equals(this.lineItems, prepayment.lineItems)
        && Objects.equals(this.subTotal, prepayment.subTotal)
        && Objects.equals(this.totalTax, prepayment.totalTax)
        && Objects.equals(this.total, prepayment.total)
        && Objects.equals(this.reference, prepayment.reference)
        && Objects.equals(this.updatedDateUTC, prepayment.updatedDateUTC)
        && Objects.equals(this.currencyCode, prepayment.currencyCode)
        && Objects.equals(this.prepaymentID, prepayment.prepaymentID)
        && Objects.equals(this.currencyRate, prepayment.currencyRate)
        && Objects.equals(this.remainingCredit, prepayment.remainingCredit)
        && Objects.equals(this.allocations, prepayment.allocations)
        && Objects.equals(this.appliedAmount, prepayment.appliedAmount)
        && Objects.equals(this.hasAttachments, prepayment.hasAttachments)
        && Objects.equals(this.attachments, prepayment.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        type,
        contact,
        date,
        status,
        lineAmountTypes,
        lineItems,
        subTotal,
        totalTax,
        total,
        reference,
        updatedDateUTC,
        currencyCode,
        prepaymentID,
        currencyRate,
        remainingCredit,
        allocations,
        appliedAmount,
        hasAttachments,
        attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prepayment {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lineAmountTypes: ").append(toIndentedString(lineAmountTypes)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    prepaymentID: ").append(toIndentedString(prepaymentID)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
    sb.append("    remainingCredit: ").append(toIndentedString(remainingCredit)).append("\n");
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
    sb.append("    appliedAmount: ").append(toIndentedString(appliedAmount)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
