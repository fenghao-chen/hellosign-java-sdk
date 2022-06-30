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
 * An array of form field objects containing the name, value, and type of each textbox or checkmark field filled in by the signers.
 */
@ApiModel(description = "An array of form field objects containing the name, value, and type of each textbox or checkmark field filled in by the signers.")
@JsonPropertyOrder({
    SignatureRequestResponseData.JSON_PROPERTY_API_ID,
    SignatureRequestResponseData.JSON_PROPERTY_SIGNATURE_ID,
    SignatureRequestResponseData.JSON_PROPERTY_NAME,
    SignatureRequestResponseData.JSON_PROPERTY_VALUE,
    SignatureRequestResponseData.JSON_PROPERTY_REQUIRED,
    SignatureRequestResponseData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SignatureRequestResponseData {
  public static final String JSON_PROPERTY_API_ID = "api_id";
  private String apiId;

  public static final String JSON_PROPERTY_SIGNATURE_ID = "signature_id";
  private String signatureId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  /**
   * - &#x60;text&#x60;: A text input field - &#x60;checkbox&#x60;: A yes/no checkbox - &#x60;date_signed&#x60;: A date - &#x60;dropdown&#x60;: An input field for dropdowns - &#x60;initials&#x60;: An input field for initials - &#x60;radio&#x60;: An input field for radios - &#x60;signature&#x60;: A signature input field - &#x60;text-merge&#x60;: A text field that has default text set by the api - &#x60;checkbox-merge&#x60;: A checkbox field that has default value set by the api
   */
  public enum TypeEnum {
    TEXT("text"),
    
    CHECKBOX("checkbox"),
    
    DATE_SIGNED("date_signed"),
    
    DROPDOWN("dropdown"),
    
    INITIALS("initials"),
    
    RADIO("radio"),
    
    SIGNATURE("signature"),
    
    TEXT_MERGE("text-merge"),
    
    CHECKBOX_MERGE("checkbox-merge");

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

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public SignatureRequestResponseData() { 
  }

  public SignatureRequestResponseData apiId(String apiId) {
    this.apiId = apiId;
    return this;
  }

   /**
   * The unique ID for this field.
   * @return apiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID for this field.")
  @JsonProperty(JSON_PROPERTY_API_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApiId() {
    return apiId;
  }


  @JsonProperty(JSON_PROPERTY_API_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiId(String apiId) {
    this.apiId = apiId;
  }


  public SignatureRequestResponseData signatureId(String signatureId) {
    this.signatureId = signatureId;
    return this;
  }

   /**
   * The ID of the signature to which this response is linked.
   * @return signatureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the signature to which this response is linked.")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignatureId() {
    return signatureId;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignatureId(String signatureId) {
    this.signatureId = signatureId;
  }


  public SignatureRequestResponseData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the form field.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the form field.")
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


  public SignatureRequestResponseData value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the form field.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the form field.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public SignatureRequestResponseData required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * A boolean value denoting if this field is required.
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean value denoting if this field is required.")
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequired() {
    return required;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequired(Boolean required) {
    this.required = required;
  }


  public SignatureRequestResponseData type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * - &#x60;text&#x60;: A text input field - &#x60;checkbox&#x60;: A yes/no checkbox - &#x60;date_signed&#x60;: A date - &#x60;dropdown&#x60;: An input field for dropdowns - &#x60;initials&#x60;: An input field for initials - &#x60;radio&#x60;: An input field for radios - &#x60;signature&#x60;: A signature input field - &#x60;text-merge&#x60;: A text field that has default text set by the api - &#x60;checkbox-merge&#x60;: A checkbox field that has default value set by the api
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "- `text`: A text input field - `checkbox`: A yes/no checkbox - `date_signed`: A date - `dropdown`: An input field for dropdowns - `initials`: An input field for initials - `radio`: An input field for radios - `signature`: A signature input field - `text-merge`: A text field that has default text set by the api - `checkbox-merge`: A checkbox field that has default value set by the api")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this SignatureRequestResponseData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureRequestResponseData signatureRequestResponseData = (SignatureRequestResponseData) o;
    return Objects.equals(this.apiId, signatureRequestResponseData.apiId) &&
        Objects.equals(this.signatureId, signatureRequestResponseData.signatureId) &&
        Objects.equals(this.name, signatureRequestResponseData.name) &&
        Objects.equals(this.value, signatureRequestResponseData.value) &&
        Objects.equals(this.required, signatureRequestResponseData.required) &&
        Objects.equals(this.type, signatureRequestResponseData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiId, signatureId, name, value, required, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureRequestResponseData {\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (apiId != null) {
        if (isFileTypeOrListOfFiles(apiId)) {
            fileTypeFound = true;
        }

        if (apiId.getClass().equals(java.io.File.class) ||
            apiId.getClass().equals(Integer.class) ||
            apiId.getClass().equals(String.class) ) {
            map.put("api_id", apiId);
        } else if (isListOfFile(apiId)) {
            for(int i = 0; i< getListSize(apiId); i++) {
                map.put("api_id[" + i + "]", getFromList(apiId, i));
            }
        }
        else {
            map.put("api_id", JSON.getDefault().getMapper().writeValueAsString(apiId));
        }
    }
    if (signatureId != null) {
        if (isFileTypeOrListOfFiles(signatureId)) {
            fileTypeFound = true;
        }

        if (signatureId.getClass().equals(java.io.File.class) ||
            signatureId.getClass().equals(Integer.class) ||
            signatureId.getClass().equals(String.class) ) {
            map.put("signature_id", signatureId);
        } else if (isListOfFile(signatureId)) {
            for(int i = 0; i< getListSize(signatureId); i++) {
                map.put("signature_id[" + i + "]", getFromList(signatureId, i));
            }
        }
        else {
            map.put("signature_id", JSON.getDefault().getMapper().writeValueAsString(signatureId));
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
    if (value != null) {
        if (isFileTypeOrListOfFiles(value)) {
            fileTypeFound = true;
        }

        if (value.getClass().equals(java.io.File.class) ||
            value.getClass().equals(Integer.class) ||
            value.getClass().equals(String.class) ) {
            map.put("value", value);
        } else if (isListOfFile(value)) {
            for(int i = 0; i< getListSize(value); i++) {
                map.put("value[" + i + "]", getFromList(value, i));
            }
        }
        else {
            map.put("value", JSON.getDefault().getMapper().writeValueAsString(value));
        }
    }
    if (required != null) {
        if (isFileTypeOrListOfFiles(required)) {
            fileTypeFound = true;
        }

        if (required.getClass().equals(java.io.File.class) ||
            required.getClass().equals(Integer.class) ||
            required.getClass().equals(String.class) ) {
            map.put("required", required);
        } else if (isListOfFile(required)) {
            for(int i = 0; i< getListSize(required); i++) {
                map.put("required[" + i + "]", getFromList(required, i));
            }
        }
        else {
            map.put("required", JSON.getDefault().getMapper().writeValueAsString(required));
        }
    }
    if (type != null) {
        if (isFileTypeOrListOfFiles(type)) {
            fileTypeFound = true;
        }

        if (type.getClass().equals(java.io.File.class) ||
            type.getClass().equals(Integer.class) ||
            type.getClass().equals(String.class) ) {
            map.put("type", type);
        } else if (isListOfFile(type)) {
            for(int i = 0; i< getListSize(type); i++) {
                map.put("type[" + i + "]", getFromList(type, i));
            }
        }
        else {
            map.put("type", JSON.getDefault().getMapper().writeValueAsString(type));
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
