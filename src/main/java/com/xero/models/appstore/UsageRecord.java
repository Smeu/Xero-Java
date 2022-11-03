/*
 * Xero AppStore API
 * These endpoints are for Xero Partners to interact with the App Store Billing platform
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.appstore;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/** UsageRecord */
public class UsageRecord {
  StringUtil util = new StringUtil();

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("subscriptionId")
  private String subscriptionId;

  @JsonProperty("subscriptionItemId")
  private String subscriptionItemId;

  @JsonProperty("testMode")
  private Boolean testMode;

  @JsonProperty("recordedAt")
  private OffsetDateTime recordedAt;

  @JsonProperty("usageRecordId")
  private String usageRecordId;

  @JsonProperty("pricePerUnit")
  private BigDecimal pricePerUnit;

  @JsonProperty("productId")
  private String productId;
  /**
   * The quantity recorded
   *
   * @param quantity Integer
   * @return UsageRecord
   */
  public UsageRecord quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity recorded
   *
   * @return quantity
   */
  @ApiModelProperty(required = true, value = "The quantity recorded")
  /**
   * The quantity recorded
   *
   * @return quantity Integer
   */
  public Integer getQuantity() {
    return quantity;
  }

  /**
   * The quantity recorded
   *
   * @param quantity Integer
   */
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * The unique identifier of the Subscription.
   *
   * @param subscriptionId String
   * @return UsageRecord
   */
  public UsageRecord subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * The unique identifier of the Subscription.
   *
   * @return subscriptionId
   */
  @ApiModelProperty(required = true, value = "The unique identifier of the Subscription.")
  /**
   * The unique identifier of the Subscription.
   *
   * @return subscriptionId String
   */
  public String getSubscriptionId() {
    return subscriptionId;
  }

  /**
   * The unique identifier of the Subscription.
   *
   * @param subscriptionId String
   */
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /**
   * The unique identifier of the SubscriptionItem.
   *
   * @param subscriptionItemId String
   * @return UsageRecord
   */
  public UsageRecord subscriptionItemId(String subscriptionItemId) {
    this.subscriptionItemId = subscriptionItemId;
    return this;
  }

  /**
   * The unique identifier of the SubscriptionItem.
   *
   * @return subscriptionItemId
   */
  @ApiModelProperty(required = true, value = "The unique identifier of the SubscriptionItem.")
  /**
   * The unique identifier of the SubscriptionItem.
   *
   * @return subscriptionItemId String
   */
  public String getSubscriptionItemId() {
    return subscriptionItemId;
  }

  /**
   * The unique identifier of the SubscriptionItem.
   *
   * @param subscriptionItemId String
   */
  public void setSubscriptionItemId(String subscriptionItemId) {
    this.subscriptionItemId = subscriptionItemId;
  }

  /**
   * If the subscription is a test subscription
   *
   * @param testMode Boolean
   * @return UsageRecord
   */
  public UsageRecord testMode(Boolean testMode) {
    this.testMode = testMode;
    return this;
  }

  /**
   * If the subscription is a test subscription
   *
   * @return testMode
   */
  @ApiModelProperty(required = true, value = "If the subscription is a test subscription")
  /**
   * If the subscription is a test subscription
   *
   * @return testMode Boolean
   */
  public Boolean getTestMode() {
    return testMode;
  }

  /**
   * If the subscription is a test subscription
   *
   * @param testMode Boolean
   */
  public void setTestMode(Boolean testMode) {
    this.testMode = testMode;
  }

  /**
   * The time when this usage was recorded in UTC
   *
   * @param recordedAt OffsetDateTime
   * @return UsageRecord
   */
  public UsageRecord recordedAt(OffsetDateTime recordedAt) {
    this.recordedAt = recordedAt;
    return this;
  }

  /**
   * The time when this usage was recorded in UTC
   *
   * @return recordedAt
   */
  @ApiModelProperty(required = true, value = "The time when this usage was recorded in UTC")
  /**
   * The time when this usage was recorded in UTC
   *
   * @return recordedAt OffsetDateTime
   */
  public OffsetDateTime getRecordedAt() {
    return recordedAt;
  }

  /**
   * The time when this usage was recorded in UTC
   *
   * @param recordedAt OffsetDateTime
   */
  public void setRecordedAt(OffsetDateTime recordedAt) {
    this.recordedAt = recordedAt;
  }

  /**
   * The unique identifier of the usageRecord.
   *
   * @param usageRecordId String
   * @return UsageRecord
   */
  public UsageRecord usageRecordId(String usageRecordId) {
    this.usageRecordId = usageRecordId;
    return this;
  }

  /**
   * The unique identifier of the usageRecord.
   *
   * @return usageRecordId
   */
  @ApiModelProperty(required = true, value = "The unique identifier of the usageRecord.")
  /**
   * The unique identifier of the usageRecord.
   *
   * @return usageRecordId String
   */
  public String getUsageRecordId() {
    return usageRecordId;
  }

  /**
   * The unique identifier of the usageRecord.
   *
   * @param usageRecordId String
   */
  public void setUsageRecordId(String usageRecordId) {
    this.usageRecordId = usageRecordId;
  }

  /**
   * The price per unit
   *
   * @param pricePerUnit BigDecimal
   * @return UsageRecord
   */
  public UsageRecord pricePerUnit(BigDecimal pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
    return this;
  }

  /**
   * The price per unit
   *
   * @return pricePerUnit
   */
  @ApiModelProperty(required = true, value = "The price per unit")
  /**
   * The price per unit
   *
   * @return pricePerUnit BigDecimal
   */
  public BigDecimal getPricePerUnit() {
    return pricePerUnit;
  }

  /**
   * The price per unit
   *
   * @param pricePerUnit BigDecimal
   */
  public void setPricePerUnit(BigDecimal pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
  }

  /**
   * The unique identifier of the linked Product
   *
   * @param productId String
   * @return UsageRecord
   */
  public UsageRecord productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The unique identifier of the linked Product
   *
   * @return productId
   */
  @ApiModelProperty(required = true, value = "The unique identifier of the linked Product")
  /**
   * The unique identifier of the linked Product
   *
   * @return productId String
   */
  public String getProductId() {
    return productId;
  }

  /**
   * The unique identifier of the linked Product
   *
   * @param productId String
   */
  public void setProductId(String productId) {
    this.productId = productId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageRecord usageRecord = (UsageRecord) o;
    return Objects.equals(this.quantity, usageRecord.quantity)
        && Objects.equals(this.subscriptionId, usageRecord.subscriptionId)
        && Objects.equals(this.subscriptionItemId, usageRecord.subscriptionItemId)
        && Objects.equals(this.testMode, usageRecord.testMode)
        && Objects.equals(this.recordedAt, usageRecord.recordedAt)
        && Objects.equals(this.usageRecordId, usageRecord.usageRecordId)
        && Objects.equals(this.pricePerUnit, usageRecord.pricePerUnit)
        && Objects.equals(this.productId, usageRecord.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        quantity,
        subscriptionId,
        subscriptionItemId,
        testMode,
        recordedAt,
        usageRecordId,
        pricePerUnit,
        productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageRecord {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    subscriptionItemId: ").append(toIndentedString(subscriptionItemId)).append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
    sb.append("    recordedAt: ").append(toIndentedString(recordedAt)).append("\n");
    sb.append("    usageRecordId: ").append(toIndentedString(usageRecordId)).append("\n");
    sb.append("    pricePerUnit: ").append(toIndentedString(pricePerUnit)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
