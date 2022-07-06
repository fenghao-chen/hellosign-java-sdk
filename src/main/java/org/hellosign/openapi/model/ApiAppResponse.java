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
import java.util.ArrayList;
import java.util.List;
import org.hellosign.openapi.model.ApiAppResponseOAuth;
import org.hellosign.openapi.model.ApiAppResponseOptions;
import org.hellosign.openapi.model.ApiAppResponseOwnerAccount;
import org.hellosign.openapi.model.ApiAppResponseWhiteLabelingOptions;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hellosign.openapi.JSON;


import org.hellosign.openapi.ApiException;
/**
 * Contains information about an API App.
 */
@ApiModel(description = "Contains information about an API App.")
@JsonPropertyOrder({
    ApiAppResponse.JSON_PROPERTY_CALLBACK_URL,
    ApiAppResponse.JSON_PROPERTY_CLIENT_ID,
    ApiAppResponse.JSON_PROPERTY_CREATED_AT,
    ApiAppResponse.JSON_PROPERTY_DOMAINS,
    ApiAppResponse.JSON_PROPERTY_NAME,
    ApiAppResponse.JSON_PROPERTY_IS_APPROVED,
    ApiAppResponse.JSON_PROPERTY_OAUTH,
    ApiAppResponse.JSON_PROPERTY_OPTIONS,
    ApiAppResponse.JSON_PROPERTY_OWNER_ACCOUNT,
    ApiAppResponse.JSON_PROPERTY_WHITE_LABELING_OPTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiAppResponse {
  public static final String JSON_PROPERTY_CALLBACK_URL = "callback_url";
  private String callbackUrl;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Integer createdAt;

  public static final String JSON_PROPERTY_DOMAINS = "domains";
  private List<String> domains = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_IS_APPROVED = "is_approved";
  private Boolean isApproved;

  public static final String JSON_PROPERTY_OAUTH = "oauth";
  private ApiAppResponseOAuth oauth;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private ApiAppResponseOptions options;

  public static final String JSON_PROPERTY_OWNER_ACCOUNT = "owner_account";
  private ApiAppResponseOwnerAccount ownerAccount;

  public static final String JSON_PROPERTY_WHITE_LABELING_OPTIONS = "white_labeling_options";
  private ApiAppResponseWhiteLabelingOptions whiteLabelingOptions;

  public ApiAppResponse() { 
  }

  public ApiAppResponse callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * The app&#39;s callback URL (for events)
   * @return callbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The app's callback URL (for events)")
  @JsonProperty(JSON_PROPERTY_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallbackUrl() {
    return callbackUrl;
  }


  @JsonProperty(JSON_PROPERTY_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public ApiAppResponse clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The app&#39;s client id
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The app's client id")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public ApiAppResponse createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time that the app was created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time that the app was created")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public ApiAppResponse domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public ApiAppResponse addDomainsItem(String domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<>();
    }
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * The domain name(s) associated with the app
   * @return domains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The domain name(s) associated with the app")
  @JsonProperty(JSON_PROPERTY_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDomains() {
    return domains;
  }


  @JsonProperty(JSON_PROPERTY_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomains(List<String> domains) {
    this.domains = domains;
  }


  public ApiAppResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the app
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the app")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ApiAppResponse isApproved(Boolean isApproved) {
    this.isApproved = isApproved;
    return this;
  }

   /**
   * Boolean to indicate if the app has been approved
   * @return isApproved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean to indicate if the app has been approved")
  @JsonProperty(JSON_PROPERTY_IS_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsApproved() {
    return isApproved;
  }


  @JsonProperty(JSON_PROPERTY_IS_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsApproved(Boolean isApproved) {
    this.isApproved = isApproved;
  }


  public ApiAppResponse oauth(ApiAppResponseOAuth oauth) {
    this.oauth = oauth;
    return this;
  }

   /**
   * Get oauth
   * @return oauth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OAUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiAppResponseOAuth getOauth() {
    return oauth;
  }


  @JsonProperty(JSON_PROPERTY_OAUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauth(ApiAppResponseOAuth oauth) {
    this.oauth = oauth;
  }


  public ApiAppResponse options(ApiAppResponseOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiAppResponseOptions getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(ApiAppResponseOptions options) {
    this.options = options;
  }


  public ApiAppResponse ownerAccount(ApiAppResponseOwnerAccount ownerAccount) {
    this.ownerAccount = ownerAccount;
    return this;
  }

   /**
   * Get ownerAccount
   * @return ownerAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OWNER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiAppResponseOwnerAccount getOwnerAccount() {
    return ownerAccount;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerAccount(ApiAppResponseOwnerAccount ownerAccount) {
    this.ownerAccount = ownerAccount;
  }


  public ApiAppResponse whiteLabelingOptions(ApiAppResponseWhiteLabelingOptions whiteLabelingOptions) {
    this.whiteLabelingOptions = whiteLabelingOptions;
    return this;
  }

   /**
   * Get whiteLabelingOptions
   * @return whiteLabelingOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WHITE_LABELING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiAppResponseWhiteLabelingOptions getWhiteLabelingOptions() {
    return whiteLabelingOptions;
  }


  @JsonProperty(JSON_PROPERTY_WHITE_LABELING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhiteLabelingOptions(ApiAppResponseWhiteLabelingOptions whiteLabelingOptions) {
    this.whiteLabelingOptions = whiteLabelingOptions;
  }


  /**
   * Return true if this ApiAppResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAppResponse apiAppResponse = (ApiAppResponse) o;
    return Objects.equals(this.callbackUrl, apiAppResponse.callbackUrl) &&
        Objects.equals(this.clientId, apiAppResponse.clientId) &&
        Objects.equals(this.createdAt, apiAppResponse.createdAt) &&
        Objects.equals(this.domains, apiAppResponse.domains) &&
        Objects.equals(this.name, apiAppResponse.name) &&
        Objects.equals(this.isApproved, apiAppResponse.isApproved) &&
        Objects.equals(this.oauth, apiAppResponse.oauth) &&
        Objects.equals(this.options, apiAppResponse.options) &&
        Objects.equals(this.ownerAccount, apiAppResponse.ownerAccount) &&
        Objects.equals(this.whiteLabelingOptions, apiAppResponse.whiteLabelingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl, clientId, createdAt, domains, name, isApproved, oauth, options, ownerAccount, whiteLabelingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAppResponse {\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isApproved: ").append(toIndentedString(isApproved)).append("\n");
    sb.append("    oauth: ").append(toIndentedString(oauth)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    ownerAccount: ").append(toIndentedString(ownerAccount)).append("\n");
    sb.append("    whiteLabelingOptions: ").append(toIndentedString(whiteLabelingOptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (callbackUrl != null) {
        if (isFileTypeOrListOfFiles(callbackUrl)) {
            fileTypeFound = true;
        }

        if (callbackUrl.getClass().equals(java.io.File.class) ||
            callbackUrl.getClass().equals(Integer.class) ||
            callbackUrl.getClass().equals(String.class) ) {
            map.put("callback_url", callbackUrl);
        } else if (isListOfFile(callbackUrl)) {
            for(int i = 0; i< getListSize(callbackUrl); i++) {
                map.put("callback_url[" + i + "]", getFromList(callbackUrl, i));
            }
        }
        else {
            map.put("callback_url", JSON.getDefault().getMapper().writeValueAsString(callbackUrl));
        }
    }
    if (clientId != null) {
        if (isFileTypeOrListOfFiles(clientId)) {
            fileTypeFound = true;
        }

        if (clientId.getClass().equals(java.io.File.class) ||
            clientId.getClass().equals(Integer.class) ||
            clientId.getClass().equals(String.class) ) {
            map.put("client_id", clientId);
        } else if (isListOfFile(clientId)) {
            for(int i = 0; i< getListSize(clientId); i++) {
                map.put("client_id[" + i + "]", getFromList(clientId, i));
            }
        }
        else {
            map.put("client_id", JSON.getDefault().getMapper().writeValueAsString(clientId));
        }
    }
    if (createdAt != null) {
        if (isFileTypeOrListOfFiles(createdAt)) {
            fileTypeFound = true;
        }

        if (createdAt.getClass().equals(java.io.File.class) ||
            createdAt.getClass().equals(Integer.class) ||
            createdAt.getClass().equals(String.class) ) {
            map.put("created_at", createdAt);
        } else if (isListOfFile(createdAt)) {
            for(int i = 0; i< getListSize(createdAt); i++) {
                map.put("created_at[" + i + "]", getFromList(createdAt, i));
            }
        }
        else {
            map.put("created_at", JSON.getDefault().getMapper().writeValueAsString(createdAt));
        }
    }
    if (domains != null) {
        if (isFileTypeOrListOfFiles(domains)) {
            fileTypeFound = true;
        }

        if (domains.getClass().equals(java.io.File.class) ||
            domains.getClass().equals(Integer.class) ||
            domains.getClass().equals(String.class) ) {
            map.put("domains", domains);
        } else if (isListOfFile(domains)) {
            for(int i = 0; i< getListSize(domains); i++) {
                map.put("domains[" + i + "]", getFromList(domains, i));
            }
        }
        else {
            map.put("domains", JSON.getDefault().getMapper().writeValueAsString(domains));
        }
    }
    if (name != null) {
        if (isFileTypeOrListOfFiles(name)) {
            fileTypeFound = true;
        }

        if (name.getClass().equals(java.io.File.class) ||
            name.getClass().equals(Integer.class) ||
            name.getClass().equals(String.class) ) {
            map.put("name", name);
        } else if (isListOfFile(name)) {
            for(int i = 0; i< getListSize(name); i++) {
                map.put("name[" + i + "]", getFromList(name, i));
            }
        }
        else {
            map.put("name", JSON.getDefault().getMapper().writeValueAsString(name));
        }
    }
    if (isApproved != null) {
        if (isFileTypeOrListOfFiles(isApproved)) {
            fileTypeFound = true;
        }

        if (isApproved.getClass().equals(java.io.File.class) ||
            isApproved.getClass().equals(Integer.class) ||
            isApproved.getClass().equals(String.class) ) {
            map.put("is_approved", isApproved);
        } else if (isListOfFile(isApproved)) {
            for(int i = 0; i< getListSize(isApproved); i++) {
                map.put("is_approved[" + i + "]", getFromList(isApproved, i));
            }
        }
        else {
            map.put("is_approved", JSON.getDefault().getMapper().writeValueAsString(isApproved));
        }
    }
    if (oauth != null) {
        if (isFileTypeOrListOfFiles(oauth)) {
            fileTypeFound = true;
        }

        if (oauth.getClass().equals(java.io.File.class) ||
            oauth.getClass().equals(Integer.class) ||
            oauth.getClass().equals(String.class) ) {
            map.put("oauth", oauth);
        } else if (isListOfFile(oauth)) {
            for(int i = 0; i< getListSize(oauth); i++) {
                map.put("oauth[" + i + "]", getFromList(oauth, i));
            }
        }
        else {
            map.put("oauth", JSON.getDefault().getMapper().writeValueAsString(oauth));
        }
    }
    if (options != null) {
        if (isFileTypeOrListOfFiles(options)) {
            fileTypeFound = true;
        }

        if (options.getClass().equals(java.io.File.class) ||
            options.getClass().equals(Integer.class) ||
            options.getClass().equals(String.class) ) {
            map.put("options", options);
        } else if (isListOfFile(options)) {
            for(int i = 0; i< getListSize(options); i++) {
                map.put("options[" + i + "]", getFromList(options, i));
            }
        }
        else {
            map.put("options", JSON.getDefault().getMapper().writeValueAsString(options));
        }
    }
    if (ownerAccount != null) {
        if (isFileTypeOrListOfFiles(ownerAccount)) {
            fileTypeFound = true;
        }

        if (ownerAccount.getClass().equals(java.io.File.class) ||
            ownerAccount.getClass().equals(Integer.class) ||
            ownerAccount.getClass().equals(String.class) ) {
            map.put("owner_account", ownerAccount);
        } else if (isListOfFile(ownerAccount)) {
            for(int i = 0; i< getListSize(ownerAccount); i++) {
                map.put("owner_account[" + i + "]", getFromList(ownerAccount, i));
            }
        }
        else {
            map.put("owner_account", JSON.getDefault().getMapper().writeValueAsString(ownerAccount));
        }
    }
    if (whiteLabelingOptions != null) {
        if (isFileTypeOrListOfFiles(whiteLabelingOptions)) {
            fileTypeFound = true;
        }

        if (whiteLabelingOptions.getClass().equals(java.io.File.class) ||
            whiteLabelingOptions.getClass().equals(Integer.class) ||
            whiteLabelingOptions.getClass().equals(String.class) ) {
            map.put("white_labeling_options", whiteLabelingOptions);
        } else if (isListOfFile(whiteLabelingOptions)) {
            for(int i = 0; i< getListSize(whiteLabelingOptions); i++) {
                map.put("white_labeling_options[" + i + "]", getFromList(whiteLabelingOptions, i));
            }
        }
        else {
            map.put("white_labeling_options", JSON.getDefault().getMapper().writeValueAsString(whiteLabelingOptions));
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

