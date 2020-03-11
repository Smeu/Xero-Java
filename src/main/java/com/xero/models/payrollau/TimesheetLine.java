/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.0.4
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * TimesheetLine
 */

public class TimesheetLine {

  
  @JsonProperty("EarningsRateID")
  private UUID earningsRateID;

  
  @JsonProperty("TrackingItemID")
  private UUID trackingItemID;

  
  @JsonProperty("NumberOfUnits")
  private List<Float> numberOfUnits = new ArrayList<Float>();

  
  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;
  public TimesheetLine earningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
    return this;
  }

   /**
   * The Xero identifier for an Earnings Rate
   * @return earningsRateID
  **/
  @ApiModelProperty(example = "966c5c77-2ef0-4320-b6a9-6c27b080ecc5", value = "The Xero identifier for an Earnings Rate")
  public UUID getEarningsRateID() {
    return earningsRateID;
  }

  public void setEarningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
  }

  public TimesheetLine trackingItemID(UUID trackingItemID) {
    this.trackingItemID = trackingItemID;
    return this;
  }

   /**
   * The Xero identifier for a Tracking Category. The TrackingOptionID must belong to the TrackingCategory selected as TimesheetCategories under Payroll Settings.
   * @return trackingItemID
  **/
  @ApiModelProperty(example = "ae777a87-5ef3-4fa0-a4f0-d10e1f13073a", value = "The Xero identifier for a Tracking Category. The TrackingOptionID must belong to the TrackingCategory selected as TimesheetCategories under Payroll Settings.")
  public UUID getTrackingItemID() {
    return trackingItemID;
  }

  public void setTrackingItemID(UUID trackingItemID) {
    this.trackingItemID = trackingItemID;
  }

  public TimesheetLine numberOfUnits(List<Float> numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

  public TimesheetLine addNumberOfUnitsItem(Float numberOfUnitsItem) {
    if (this.numberOfUnits == null) {
      this.numberOfUnits = new ArrayList<Float>();
    }
    this.numberOfUnits.add(numberOfUnitsItem);
    return this;
  }

   /**
   * The number of units on a timesheet line
   * @return numberOfUnits
  **/
  @ApiModelProperty(value = "The number of units on a timesheet line")
  public List<Float> getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(List<Float> numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  public TimesheetLine updatedDateUTC(String updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }

   /**
   * Last modified timestamp
   * @return updatedDateUTC
  **/
  @ApiModelProperty(example = "2018-04-01T23:02:36", value = "Last modified timestamp")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public void setUpdatedDateUTC(String updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimesheetLine timesheetLine = (TimesheetLine) o;
    return Objects.equals(this.earningsRateID, timesheetLine.earningsRateID) &&
        Objects.equals(this.trackingItemID, timesheetLine.trackingItemID) &&
        Objects.equals(this.numberOfUnits, timesheetLine.numberOfUnits) &&
        Objects.equals(this.updatedDateUTC, timesheetLine.updatedDateUTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earningsRateID, trackingItemID, numberOfUnits, updatedDateUTC);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimesheetLine {\n");
    sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
    sb.append("    trackingItemID: ").append(toIndentedString(trackingItemID)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

