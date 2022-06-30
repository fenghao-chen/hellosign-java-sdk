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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hellosign.openapi.model.SubFormFieldsPerDocumentBase;
import org.hellosign.openapi.model.SubFormFieldsPerDocumentCheckbox;
import org.hellosign.openapi.model.SubFormFieldsPerDocumentCheckboxMerge;
import org.hellosign.openapi.model.SubFormFieldsPerDocumentDateSigned;
import org.hellosign.openapi.model.SubFormFieldsPerDocumentDropdown;
import org.hellosign.openapi.model.SubFormFieldsPerDocumentHyperlink;
import org.hellosign.openapi.model.SubFormFieldsPerDocumentInitials;
import org.hellosign.openapi.model.SubFormFieldsPerDocumentRadio;
import org.hellosign.openapi.model.SubFormFieldsPerDocumentSignature;
import org.hellosign.openapi.model.SubFormFieldsPerDocumentText;
import org.hellosign.openapi.model.SubFormFieldsPerDocumentTextMerge;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hellosign.openapi.JSON;


import org.hellosign.openapi.ApiException;
/**
 * This class extends &#x60;SubFormFieldsPerDocumentBase&#x60;.
 */
@ApiModel(description = "This class extends `SubFormFieldsPerDocumentBase`.")
@JsonPropertyOrder({
    SubFormFieldsPerDocumentTextMerge.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentCheckbox.class, name = "checkbox"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentCheckboxMerge.class, name = "checkbox-merge"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentDateSigned.class, name = "date_signed"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentDropdown.class, name = "dropdown"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentHyperlink.class, name = "hyperlink"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentInitials.class, name = "initials"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentRadio.class, name = "radio"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentSignature.class, name = "signature"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentText.class, name = "text"),
  @JsonSubTypes.Type(value = SubFormFieldsPerDocumentTextMerge.class, name = "text-merge"),
})

public class SubFormFieldsPerDocumentTextMerge extends SubFormFieldsPerDocumentBase {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "text-merge";

  public SubFormFieldsPerDocumentTextMerge() { 
  }

  public SubFormFieldsPerDocumentTextMerge type(String type) {
    this.type = type;
    return this;
  }

   /**
   * A text field that has default text set using pre-filled data. Use the &#x60;SubFormFieldsPerDocumentTextMerge&#x60; class.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A text field that has default text set using pre-filled data. Use the `SubFormFieldsPerDocumentTextMerge` class.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this SubFormFieldsPerDocumentTextMerge object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubFormFieldsPerDocumentTextMerge subFormFieldsPerDocumentTextMerge = (SubFormFieldsPerDocumentTextMerge) o;
    return Objects.equals(this.type, subFormFieldsPerDocumentTextMerge.type) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubFormFieldsPerDocumentTextMerge {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
     map.putAll(super.createFormData());
    try {
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

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("checkbox", SubFormFieldsPerDocumentCheckbox.class);
  mappings.put("checkbox-merge", SubFormFieldsPerDocumentCheckboxMerge.class);
  mappings.put("date_signed", SubFormFieldsPerDocumentDateSigned.class);
  mappings.put("dropdown", SubFormFieldsPerDocumentDropdown.class);
  mappings.put("hyperlink", SubFormFieldsPerDocumentHyperlink.class);
  mappings.put("initials", SubFormFieldsPerDocumentInitials.class);
  mappings.put("radio", SubFormFieldsPerDocumentRadio.class);
  mappings.put("signature", SubFormFieldsPerDocumentSignature.class);
  mappings.put("text", SubFormFieldsPerDocumentText.class);
  mappings.put("text-merge", SubFormFieldsPerDocumentTextMerge.class);
  mappings.put("SubFormFieldsPerDocumentTextMerge", SubFormFieldsPerDocumentTextMerge.class);
  JSON.registerDiscriminator(SubFormFieldsPerDocumentTextMerge.class, "type", mappings);
}
}
