/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-04-15 19:10:39 UTC)
 * on 2014-04-28 at 17:35:26 UTC 
 * Modify at your own risk.
 */

package com.cloudid.useridinfoendpoint.model;

/**
 * Model definition for UserIdInfo.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the useridinfoendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserIdInfo extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dob;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expiryDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String idhash;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageURL;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastAccessedBy;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastLocation;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rewardPoints;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long timeStampCreated;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long timeStampLastAccessed;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userName;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDob() {
    return dob;
  }

  /**
   * @param dob dob or {@code null} for none
   */
  public UserIdInfo setDob(java.lang.String dob) {
    this.dob = dob;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getExpiryDate() {
    return expiryDate;
  }

  /**
   * @param expiryDate expiryDate or {@code null} for none
   */
  public UserIdInfo setExpiryDate(java.lang.String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFName() {
    return fName;
  }

  /**
   * @param fName fName or {@code null} for none
   */
  public UserIdInfo setFName(java.lang.String fName) {
    this.fName = fName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public UserIdInfo setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIdhash() {
    return idhash;
  }

  /**
   * @param idhash idhash or {@code null} for none
   */
  public UserIdInfo setIdhash(java.lang.String idhash) {
    this.idhash = idhash;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getImageURL() {
    return imageURL;
  }

  /**
   * @param imageURL imageURL or {@code null} for none
   */
  public UserIdInfo setImageURL(java.lang.String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLName() {
    return lName;
  }

  /**
   * @param lName lName or {@code null} for none
   */
  public UserIdInfo setLName(java.lang.String lName) {
    this.lName = lName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLastAccessedBy() {
    return lastAccessedBy;
  }

  /**
   * @param lastAccessedBy lastAccessedBy or {@code null} for none
   */
  public UserIdInfo setLastAccessedBy(java.lang.String lastAccessedBy) {
    this.lastAccessedBy = lastAccessedBy;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLastLocation() {
    return lastLocation;
  }

  /**
   * @param lastLocation lastLocation or {@code null} for none
   */
  public UserIdInfo setLastLocation(java.lang.String lastLocation) {
    this.lastLocation = lastLocation;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRewardPoints() {
    return rewardPoints;
  }

  /**
   * @param rewardPoints rewardPoints or {@code null} for none
   */
  public UserIdInfo setRewardPoints(java.lang.String rewardPoints) {
    this.rewardPoints = rewardPoints;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getTimeStampCreated() {
    return timeStampCreated;
  }

  /**
   * @param timeStampCreated timeStampCreated or {@code null} for none
   */
  public UserIdInfo setTimeStampCreated(java.lang.Long timeStampCreated) {
    this.timeStampCreated = timeStampCreated;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getTimeStampLastAccessed() {
    return timeStampLastAccessed;
  }

  /**
   * @param timeStampLastAccessed timeStampLastAccessed or {@code null} for none
   */
  public UserIdInfo setTimeStampLastAccessed(java.lang.Long timeStampLastAccessed) {
    this.timeStampLastAccessed = timeStampLastAccessed;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public UserIdInfo setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUserName() {
    return userName;
  }

  /**
   * @param userName userName or {@code null} for none
   */
  public UserIdInfo setUserName(java.lang.String userName) {
    this.userName = userName;
    return this;
  }

  @Override
  public UserIdInfo set(String fieldName, Object value) {
    return (UserIdInfo) super.set(fieldName, value);
  }

  @Override
  public UserIdInfo clone() {
    return (UserIdInfo) super.clone();
  }

}
