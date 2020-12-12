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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;

/** Employee */
public class Employee {
  StringUtil util = new StringUtil();

  @JsonProperty("employeeID")
  private UUID employeeID;

  @JsonProperty("title")
  private String title;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("dateOfBirth")
  private LocalDate dateOfBirth;

  @JsonProperty("address")
  private Address address;

  @JsonProperty("email")
  private String email;
  /** The employee’s gender */
  public enum GenderEnum {
    M("M"),

    F("F");

    private String value;

    GenderEnum(String value) {
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
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  @JsonProperty("startDate")
  private LocalDate startDate;

  @JsonProperty("endDate")
  private LocalDate endDate;

  @JsonProperty("payrollCalendarID")
  private UUID payrollCalendarID;

  @JsonProperty("updatedDateUTC")
  private LocalDateTime updatedDateUTC;

  @JsonProperty("createdDateUTC")
  private LocalDateTime createdDateUTC;

  public Employee employeeID(UUID employeeID) {
    this.employeeID = employeeID;
    return this;
  }

  /**
   * Xero unique identifier for the employee
   *
   * @return employeeID
   */
  @ApiModelProperty(
      example = "d90457c4-f1be-4f2e-b4e3-f766390a7e30",
      value = "Xero unique identifier for the employee")
  public UUID getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(UUID employeeID) {
    this.employeeID = employeeID;
  }

  public Employee title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the employee
   *
   * @return title
   */
  @ApiModelProperty(example = "Mrs", value = "Title of the employee")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Employee firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of employee
   *
   * @return firstName
   */
  @ApiModelProperty(example = "Karen", value = "First name of employee")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Employee lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of employee
   *
   * @return lastName
   */
  @ApiModelProperty(example = "Jones", value = "Last name of employee")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Employee dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Date of birth of the employee (YYYY-MM-DD)
   *
   * @return dateOfBirth
   */
  @ApiModelProperty(
      example = "Wed Jan 02 00:00:00 GMT 2019",
      value = "Date of birth of the employee (YYYY-MM-DD)")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Employee address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   *
   * @return address
   */
  @ApiModelProperty(value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Employee email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address for the employee
   *
   * @return email
   */
  @ApiModelProperty(example = "developer@me.com", value = "The email address for the employee")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Employee gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * The employee’s gender
   *
   * @return gender
   */
  @ApiModelProperty(example = "F", value = "The employee’s gender")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public Employee phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Employee phone number
   *
   * @return phoneNumber
   */
  @ApiModelProperty(example = "415-555-1212", value = "Employee phone number")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Employee startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Employment start date of the employee at the time it was requested
   *
   * @return startDate
   */
  @ApiModelProperty(
      example = "Sun Jan 19 00:00:00 GMT 2020",
      value = "Employment start date of the employee at the time it was requested")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Employee endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Employment end date of the employee at the time it was requested
   *
   * @return endDate
   */
  @ApiModelProperty(
      example = "Sun Jan 19 00:00:00 GMT 2020",
      value = "Employment end date of the employee at the time it was requested")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Employee payrollCalendarID(UUID payrollCalendarID) {
    this.payrollCalendarID = payrollCalendarID;
    return this;
  }

  /**
   * Xero unique identifier for the payroll calendar of the employee
   *
   * @return payrollCalendarID
   */
  @ApiModelProperty(value = "Xero unique identifier for the payroll calendar of the employee")
  public UUID getPayrollCalendarID() {
    return payrollCalendarID;
  }

  public void setPayrollCalendarID(UUID payrollCalendarID) {
    this.payrollCalendarID = payrollCalendarID;
  }

  public Employee updatedDateUTC(LocalDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }

  /**
   * UTC timestamp of last update to the employee
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(value = "UTC timestamp of last update to the employee")
  public LocalDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public void setUpdatedDateUTC(LocalDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }

  public Employee createdDateUTC(LocalDateTime createdDateUTC) {
    this.createdDateUTC = createdDateUTC;
    return this;
  }

  /**
   * UTC timestamp when the employee was created in Xero
   *
   * @return createdDateUTC
   */
  @ApiModelProperty(value = "UTC timestamp when the employee was created in Xero")
  public LocalDateTime getCreatedDateUTC() {
    return createdDateUTC;
  }

  public void setCreatedDateUTC(LocalDateTime createdDateUTC) {
    this.createdDateUTC = createdDateUTC;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.employeeID, employee.employeeID)
        && Objects.equals(this.title, employee.title)
        && Objects.equals(this.firstName, employee.firstName)
        && Objects.equals(this.lastName, employee.lastName)
        && Objects.equals(this.dateOfBirth, employee.dateOfBirth)
        && Objects.equals(this.address, employee.address)
        && Objects.equals(this.email, employee.email)
        && Objects.equals(this.gender, employee.gender)
        && Objects.equals(this.phoneNumber, employee.phoneNumber)
        && Objects.equals(this.startDate, employee.startDate)
        && Objects.equals(this.endDate, employee.endDate)
        && Objects.equals(this.payrollCalendarID, employee.payrollCalendarID)
        && Objects.equals(this.updatedDateUTC, employee.updatedDateUTC)
        && Objects.equals(this.createdDateUTC, employee.createdDateUTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        employeeID,
        title,
        firstName,
        lastName,
        dateOfBirth,
        address,
        email,
        gender,
        phoneNumber,
        startDate,
        endDate,
        payrollCalendarID,
        updatedDateUTC,
        createdDateUTC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    payrollCalendarID: ").append(toIndentedString(payrollCalendarID)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    createdDateUTC: ").append(toIndentedString(createdDateUTC)).append("\n");
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
