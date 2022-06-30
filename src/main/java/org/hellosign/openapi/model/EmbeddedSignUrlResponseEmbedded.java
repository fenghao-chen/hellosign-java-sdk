/*
 * HelloSign API
 * HelloSign v3 API
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: apisupport@hellosign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.hellosign.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hellosign.openapi.JSON;


import org.hellosign.openapi.ApiException;
/**
 * An object that contains necessary information to set up embedded signing.
 */
@ApiModel(description = "An object that contains necessary information to set up embedded signing.")
@JsonPropertyOrder({
    EmbeddedSignUrlResponseEmbedded.JSON_PROPERTY_SIGN_URL,
    EmbeddedSignUrlResponseEmbedded.JSON_PROPERTY_EXPIRES_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EmbeddedSignUrlResponseEmbedded {
  public static final String JSON_PROPERTY_SIGN_URL = "sign_url";
  private String signUrl;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private Integer expiresAt;

  public EmbeddedSignUrlResponseEmbedded() { 
  }

  public EmbeddedSignUrlResponseEmbedded signUrl(String signUrl) {
    this.signUrl = signUrl;
    return this;
  }

   /**
   * A signature url that can be opened in an iFrame.
   * @return signUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A signature url that can be opened in an iFrame.")
  @JsonProperty(JSON_PROPERTY_SIGN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignUrl() {
    return signUrl;
  }


  @JsonProperty(JSON_PROPERTY_SIGN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignUrl(String signUrl) {
    this.signUrl = signUrl;
  }


  public EmbeddedSignUrlResponseEmbedded expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The specific time that the the &#x60;sign_url&#x60; link expires, in epoch.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The specific time that the the `sign_url` link expires, in epoch.")
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExpiresAt() {
    return expiresAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }


  /**
   * Return true if this EmbeddedSignUrlResponseEmbedded object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddedSignUrlResponseEmbedded embeddedSignUrlResponseEmbedded = (EmbeddedSignUrlResponseEmbedded) o;
    return Objects.equals(this.signUrl, embeddedSignUrlResponseEmbedded.signUrl) &&
        Objects.equals(this.expiresAt, embeddedSignUrlResponseEmbedded.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signUrl, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddedSignUrlResponseEmbedded {\n");
    sb.append("    signUrl: ").append(toIndentedString(signUrl)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (signUrl != null) {
        if (isFileTypeOrListOfFiles(signUrl)) {
            fileTypeFound = true;
        }

        if (signUrl.getClass().equals(java.io.File.class) ||
            signUrl.getClass().equals(Integer.class) ||
            signUrl.getClass().equals(String.class) ) {
            map.put("sign_url", signUrl);
        } else if (isListOfFile(signUrl)) {
            for(int i = 0; i< getListSize(signUrl); i++) {
                map.put("sign_url[" + i + "]", getFromList(signUrl, i));
            }
        }
        else {
            map.put("sign_url", JSON.getDefault().getMapper().writeValueAsString(signUrl));
        }
    }
    if (expiresAt != null) {
        if (isFileTypeOrListOfFiles(expiresAt)) {
            fileTypeFound = true;
        }

        if (expiresAt.getClass().equals(java.io.File.class) ||
            expiresAt.getClass().equals(Integer.class) ||
            expiresAt.getClass().equals(String.class) ) {
            map.put("expires_at", expiresAt);
        } else if (isListOfFile(expiresAt)) {
            for(int i = 0; i< getListSize(expiresAt); i++) {
                map.put("expires_at[" + i + "]", getFromList(expiresAt, i));
            }
        }
        else {
            map.put("expires_at", JSON.getDefault().getMapper().writeValueAsString(expiresAt));
        }
    }
    } catch (Exception e) {
        throw new ApiException(e);
    }

    return fileTypeFound ? map : new HashMap<>();
  }

  private boolean isFileTypeOrListOfFiles(Object obj) throws Exception {
    return obj.getClass().equals(java.io.File.class) || isListOfFile(obj);
  }

  private boolean isListOfFile(Object obj) throws Exception {
      return obj instanceof java.util.List && !isListEmpty(obj) && getFromList(obj, 0) instanceof java.io.File;
  }

  private boolean isListEmpty(Object obj) throws Exception {
    return (boolean) Class.forName(java.util.List.class.getName()).getMethod("isEmpty").invoke(obj);
  }

  private Object getFromList(Object obj, int index) throws Exception {
    return Class.forName(java.util.List.class.getName()).getMethod("get", int.class).invoke(obj, index);
  }

  private int getListSize(Object obj) throws Exception {
    return (int) Class.forName(java.util.List.class.getName()).getMethod("size").invoke(obj);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
