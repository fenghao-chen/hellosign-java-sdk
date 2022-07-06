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
import org.hellosign.openapi.model.ListInfoResponse;
import org.hellosign.openapi.model.TemplateResponse;
import org.hellosign.openapi.model.WarningResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hellosign.openapi.JSON;


import org.hellosign.openapi.ApiException;
/**
 * TemplateListResponse
 */
@JsonPropertyOrder({
    TemplateListResponse.JSON_PROPERTY_TEMPLATES,
    TemplateListResponse.JSON_PROPERTY_LIST_INFO,
    TemplateListResponse.JSON_PROPERTY_WARNINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateListResponse {
  public static final String JSON_PROPERTY_TEMPLATES = "templates";
  private List<TemplateResponse> templates = null;

  public static final String JSON_PROPERTY_LIST_INFO = "list_info";
  private ListInfoResponse listInfo;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<WarningResponse> warnings = null;

  public TemplateListResponse() { 
  }

  public TemplateListResponse templates(List<TemplateResponse> templates) {
    this.templates = templates;
    return this;
  }

  public TemplateListResponse addTemplatesItem(TemplateResponse templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * List of templates that the API caller has access to.
   * @return templates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of templates that the API caller has access to.")
  @JsonProperty(JSON_PROPERTY_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TemplateResponse> getTemplates() {
    return templates;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplates(List<TemplateResponse> templates) {
    this.templates = templates;
  }


  public TemplateListResponse listInfo(ListInfoResponse listInfo) {
    this.listInfo = listInfo;
    return this;
  }

   /**
   * Get listInfo
   * @return listInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIST_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ListInfoResponse getListInfo() {
    return listInfo;
  }


  @JsonProperty(JSON_PROPERTY_LIST_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListInfo(ListInfoResponse listInfo) {
    this.listInfo = listInfo;
  }


  public TemplateListResponse warnings(List<WarningResponse> warnings) {
    this.warnings = warnings;
    return this;
  }

  public TemplateListResponse addWarningsItem(WarningResponse warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * A list of warnings.
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of warnings.")
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WarningResponse> getWarnings() {
    return warnings;
  }


  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarnings(List<WarningResponse> warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this TemplateListResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateListResponse templateListResponse = (TemplateListResponse) o;
    return Objects.equals(this.templates, templateListResponse.templates) &&
        Objects.equals(this.listInfo, templateListResponse.listInfo) &&
        Objects.equals(this.warnings, templateListResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templates, listInfo, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateListResponse {\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    listInfo: ").append(toIndentedString(listInfo)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (templates != null) {
        if (isFileTypeOrListOfFiles(templates)) {
            fileTypeFound = true;
        }

        if (templates.getClass().equals(java.io.File.class) ||
            templates.getClass().equals(Integer.class) ||
            templates.getClass().equals(String.class) ) {
            map.put("templates", templates);
        } else if (isListOfFile(templates)) {
            for(int i = 0; i< getListSize(templates); i++) {
                map.put("templates[" + i + "]", getFromList(templates, i));
            }
        }
        else {
            map.put("templates", JSON.getDefault().getMapper().writeValueAsString(templates));
        }
    }
    if (listInfo != null) {
        if (isFileTypeOrListOfFiles(listInfo)) {
            fileTypeFound = true;
        }

        if (listInfo.getClass().equals(java.io.File.class) ||
            listInfo.getClass().equals(Integer.class) ||
            listInfo.getClass().equals(String.class) ) {
            map.put("list_info", listInfo);
        } else if (isListOfFile(listInfo)) {
            for(int i = 0; i< getListSize(listInfo); i++) {
                map.put("list_info[" + i + "]", getFromList(listInfo, i));
            }
        }
        else {
            map.put("list_info", JSON.getDefault().getMapper().writeValueAsString(listInfo));
        }
    }
    if (warnings != null) {
        if (isFileTypeOrListOfFiles(warnings)) {
            fileTypeFound = true;
        }

        if (warnings.getClass().equals(java.io.File.class) ||
            warnings.getClass().equals(Integer.class) ||
            warnings.getClass().equals(String.class) ) {
            map.put("warnings", warnings);
        } else if (isListOfFile(warnings)) {
            for(int i = 0; i< getListSize(warnings); i++) {
                map.put("warnings[" + i + "]", getFromList(warnings, i));
            }
        }
        else {
            map.put("warnings", JSON.getDefault().getMapper().writeValueAsString(warnings));
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

