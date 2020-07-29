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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ContactGroups */
public class ContactGroups {
  StringUtil util = new StringUtil();

  @JsonProperty("ContactGroups")
  private List<ContactGroup> contactGroups = new ArrayList<ContactGroup>();

  public ContactGroups contactGroups(List<ContactGroup> contactGroups) {
    this.contactGroups = contactGroups;
    return this;
  }

  public ContactGroups addContactGroupsItem(ContactGroup contactGroupsItem) {
    if (this.contactGroups == null) {
      this.contactGroups = new ArrayList<ContactGroup>();
    }
    this.contactGroups.add(contactGroupsItem);
    return this;
  }

  /**
   * Get contactGroups
   *
   * @return contactGroups
   */
  @ApiModelProperty(value = "")
  public List<ContactGroup> getContactGroups() {
    return contactGroups;
  }

  public void setContactGroups(List<ContactGroup> contactGroups) {
    this.contactGroups = contactGroups;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactGroups contactGroups = (ContactGroups) o;
    return Objects.equals(this.contactGroups, contactGroups.contactGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactGroups {\n");
    sb.append("    contactGroups: ").append(toIndentedString(contactGroups)).append("\n");
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
