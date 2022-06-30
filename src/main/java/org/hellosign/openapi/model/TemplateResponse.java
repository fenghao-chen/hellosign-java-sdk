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
import org.hellosign.openapi.model.TemplateResponseAccount;
import org.hellosign.openapi.model.TemplateResponseCCRole;
import org.hellosign.openapi.model.TemplateResponseCustomField;
import org.hellosign.openapi.model.TemplateResponseDocument;
import org.hellosign.openapi.model.TemplateResponseNamedFormField;
import org.hellosign.openapi.model.TemplateResponseSignerRole;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hellosign.openapi.JSON;


import org.hellosign.openapi.ApiException;
/**
 * Contains information about the templates you and your team have created.
 */
@ApiModel(description = "Contains information about the templates you and your team have created.")
@JsonPropertyOrder({
    TemplateResponse.JSON_PROPERTY_TEMPLATE_ID,
    TemplateResponse.JSON_PROPERTY_TITLE,
    TemplateResponse.JSON_PROPERTY_MESSAGE,
    TemplateResponse.JSON_PROPERTY_UPDATED_AT,
    TemplateResponse.JSON_PROPERTY_IS_EMBEDDED,
    TemplateResponse.JSON_PROPERTY_IS_CREATOR,
    TemplateResponse.JSON_PROPERTY_CAN_EDIT,
    TemplateResponse.JSON_PROPERTY_IS_LOCKED,
    TemplateResponse.JSON_PROPERTY_METADATA,
    TemplateResponse.JSON_PROPERTY_SIGNER_ROLES,
    TemplateResponse.JSON_PROPERTY_CC_ROLES,
    TemplateResponse.JSON_PROPERTY_DOCUMENTS,
    TemplateResponse.JSON_PROPERTY_CUSTOM_FIELDS,
    TemplateResponse.JSON_PROPERTY_NAMED_FORM_FIELDS,
    TemplateResponse.JSON_PROPERTY_ACCOUNTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateResponse {
  public static final String JSON_PROPERTY_TEMPLATE_ID = "template_id";
  private String templateId;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Integer updatedAt;

  public static final String JSON_PROPERTY_IS_EMBEDDED = "is_embedded";
  private Boolean isEmbedded;

  public static final String JSON_PROPERTY_IS_CREATOR = "is_creator";
  private Boolean isCreator;

  public static final String JSON_PROPERTY_CAN_EDIT = "can_edit";
  private Boolean canEdit;

  public static final String JSON_PROPERTY_IS_LOCKED = "is_locked";
  private Boolean isLocked;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata;

  public static final String JSON_PROPERTY_SIGNER_ROLES = "signer_roles";
  private List<TemplateResponseSignerRole> signerRoles = null;

  public static final String JSON_PROPERTY_CC_ROLES = "cc_roles";
  private List<TemplateResponseCCRole> ccRoles = null;

  public static final String JSON_PROPERTY_DOCUMENTS = "documents";
  private List<TemplateResponseDocument> documents = null;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "custom_fields";
  private List<TemplateResponseCustomField> customFields = null;

  public static final String JSON_PROPERTY_NAMED_FORM_FIELDS = "named_form_fields";
  private List<TemplateResponseNamedFormField> namedFormFields = null;

  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private List<TemplateResponseAccount> accounts = null;

  public TemplateResponse() { 
  }

  public TemplateResponse templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The id of the Template.
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the Template.")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTemplateId() {
    return templateId;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public TemplateResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the Template. This will also be the default subject of the message sent to signers when using this Template to send a SignatureRequest. This can be overridden when sending the SignatureRequest.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the Template. This will also be the default subject of the message sent to signers when using this Template to send a SignatureRequest. This can be overridden when sending the SignatureRequest.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public TemplateResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The default message that will be sent to signers when using this Template to send a SignatureRequest. This can be overridden when sending the SignatureRequest.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The default message that will be sent to signers when using this Template to send a SignatureRequest. This can be overridden when sending the SignatureRequest.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public TemplateResponse updatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Time the template was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time the template was last updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }


  public TemplateResponse isEmbedded(Boolean isEmbedded) {
    this.isEmbedded = isEmbedded;
    return this;
  }

   /**
   * &#x60;true&#x60; if this template was created using an embedded flow, &#x60;false&#x60; if it was created on our website.
   * @return isEmbedded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`true` if this template was created using an embedded flow, `false` if it was created on our website.")
  @JsonProperty(JSON_PROPERTY_IS_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEmbedded() {
    return isEmbedded;
  }


  @JsonProperty(JSON_PROPERTY_IS_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEmbedded(Boolean isEmbedded) {
    this.isEmbedded = isEmbedded;
  }


  public TemplateResponse isCreator(Boolean isCreator) {
    this.isCreator = isCreator;
    return this;
  }

   /**
   * &#x60;true&#x60; if you are the owner of this template, &#x60;false&#x60; if it&#39;s been shared with you by a team member.
   * @return isCreator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`true` if you are the owner of this template, `false` if it's been shared with you by a team member.")
  @JsonProperty(JSON_PROPERTY_IS_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCreator() {
    return isCreator;
  }


  @JsonProperty(JSON_PROPERTY_IS_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCreator(Boolean isCreator) {
    this.isCreator = isCreator;
  }


  public TemplateResponse canEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

   /**
   * Indicates whether edit rights have been granted to you by the owner (always &#x60;true&#x60; if that&#39;s you).
   * @return canEdit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether edit rights have been granted to you by the owner (always `true` if that's you).")
  @JsonProperty(JSON_PROPERTY_CAN_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanEdit() {
    return canEdit;
  }


  @JsonProperty(JSON_PROPERTY_CAN_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }


  public TemplateResponse isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Indicates whether the template is locked.  If &#x60;true&#x60;, then the template was created outside your quota and can only be used in &#x60;test_mode&#x60;.  If &#x60;false&#x60;, then the template is within your quota and can be used to create signature requests.
   * @return isLocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the template is locked.  If `true`, then the template was created outside your quota and can only be used in `test_mode`.  If `false`, then the template is within your quota and can be used to create signature requests.")
  @JsonProperty(JSON_PROPERTY_IS_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsLocked() {
    return isLocked;
  }


  @JsonProperty(JSON_PROPERTY_IS_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }


  public TemplateResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata attached to the template.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The metadata attached to the template.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public TemplateResponse signerRoles(List<TemplateResponseSignerRole> signerRoles) {
    this.signerRoles = signerRoles;
    return this;
  }

  public TemplateResponse addSignerRolesItem(TemplateResponseSignerRole signerRolesItem) {
    if (this.signerRoles == null) {
      this.signerRoles = new ArrayList<>();
    }
    this.signerRoles.add(signerRolesItem);
    return this;
  }

   /**
   * An array of the designated signer roles that must be specified when sending a SignatureRequest using this Template.
   * @return signerRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of the designated signer roles that must be specified when sending a SignatureRequest using this Template.")
  @JsonProperty(JSON_PROPERTY_SIGNER_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TemplateResponseSignerRole> getSignerRoles() {
    return signerRoles;
  }


  @JsonProperty(JSON_PROPERTY_SIGNER_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignerRoles(List<TemplateResponseSignerRole> signerRoles) {
    this.signerRoles = signerRoles;
  }


  public TemplateResponse ccRoles(List<TemplateResponseCCRole> ccRoles) {
    this.ccRoles = ccRoles;
    return this;
  }

  public TemplateResponse addCcRolesItem(TemplateResponseCCRole ccRolesItem) {
    if (this.ccRoles == null) {
      this.ccRoles = new ArrayList<>();
    }
    this.ccRoles.add(ccRolesItem);
    return this;
  }

   /**
   * An array of the designated CC roles that must be specified when sending a SignatureRequest using this Template.
   * @return ccRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of the designated CC roles that must be specified when sending a SignatureRequest using this Template.")
  @JsonProperty(JSON_PROPERTY_CC_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TemplateResponseCCRole> getCcRoles() {
    return ccRoles;
  }


  @JsonProperty(JSON_PROPERTY_CC_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCcRoles(List<TemplateResponseCCRole> ccRoles) {
    this.ccRoles = ccRoles;
  }


  public TemplateResponse documents(List<TemplateResponseDocument> documents) {
    this.documents = documents;
    return this;
  }

  public TemplateResponse addDocumentsItem(TemplateResponseDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * An array describing each document associated with this Template. Includes form field data for each document.
   * @return documents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array describing each document associated with this Template. Includes form field data for each document.")
  @JsonProperty(JSON_PROPERTY_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TemplateResponseDocument> getDocuments() {
    return documents;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocuments(List<TemplateResponseDocument> documents) {
    this.documents = documents;
  }


  public TemplateResponse customFields(List<TemplateResponseCustomField> customFields) {
    this.customFields = customFields;
    return this;
  }

  public TemplateResponse addCustomFieldsItem(TemplateResponseCustomField customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * An array of Custom Field objects.
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of Custom Field objects.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TemplateResponseCustomField> getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(List<TemplateResponseCustomField> customFields) {
    this.customFields = customFields;
  }


  public TemplateResponse namedFormFields(List<TemplateResponseNamedFormField> namedFormFields) {
    this.namedFormFields = namedFormFields;
    return this;
  }

  public TemplateResponse addNamedFormFieldsItem(TemplateResponseNamedFormField namedFormFieldsItem) {
    if (this.namedFormFields == null) {
      this.namedFormFields = new ArrayList<>();
    }
    this.namedFormFields.add(namedFormFieldsItem);
    return this;
  }

   /**
   * Use \&quot;form_fields\&quot; under the \&quot;documents\&quot; array instead.
   * @return namedFormFields
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use \"form_fields\" under the \"documents\" array instead.")
  @JsonProperty(JSON_PROPERTY_NAMED_FORM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TemplateResponseNamedFormField> getNamedFormFields() {
    return namedFormFields;
  }


  @JsonProperty(JSON_PROPERTY_NAMED_FORM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNamedFormFields(List<TemplateResponseNamedFormField> namedFormFields) {
    this.namedFormFields = namedFormFields;
  }


  public TemplateResponse accounts(List<TemplateResponseAccount> accounts) {
    this.accounts = accounts;
    return this;
  }

  public TemplateResponse addAccountsItem(TemplateResponseAccount accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * An array of the Accounts that can use this Template.
   * @return accounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of the Accounts that can use this Template.")
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TemplateResponseAccount> getAccounts() {
    return accounts;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccounts(List<TemplateResponseAccount> accounts) {
    this.accounts = accounts;
  }


  /**
   * Return true if this TemplateResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateResponse templateResponse = (TemplateResponse) o;
    return Objects.equals(this.templateId, templateResponse.templateId) &&
        Objects.equals(this.title, templateResponse.title) &&
        Objects.equals(this.message, templateResponse.message) &&
        Objects.equals(this.updatedAt, templateResponse.updatedAt) &&
        Objects.equals(this.isEmbedded, templateResponse.isEmbedded) &&
        Objects.equals(this.isCreator, templateResponse.isCreator) &&
        Objects.equals(this.canEdit, templateResponse.canEdit) &&
        Objects.equals(this.isLocked, templateResponse.isLocked) &&
        Objects.equals(this.metadata, templateResponse.metadata) &&
        Objects.equals(this.signerRoles, templateResponse.signerRoles) &&
        Objects.equals(this.ccRoles, templateResponse.ccRoles) &&
        Objects.equals(this.documents, templateResponse.documents) &&
        Objects.equals(this.customFields, templateResponse.customFields) &&
        Objects.equals(this.namedFormFields, templateResponse.namedFormFields) &&
        Objects.equals(this.accounts, templateResponse.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, title, message, updatedAt, isEmbedded, isCreator, canEdit, isLocked, metadata, signerRoles, ccRoles, documents, customFields, namedFormFields, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponse {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    isEmbedded: ").append(toIndentedString(isEmbedded)).append("\n");
    sb.append("    isCreator: ").append(toIndentedString(isCreator)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    signerRoles: ").append(toIndentedString(signerRoles)).append("\n");
    sb.append("    ccRoles: ").append(toIndentedString(ccRoles)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    namedFormFields: ").append(toIndentedString(namedFormFields)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (templateId != null) {
        if (isFileTypeOrListOfFiles(templateId)) {
            fileTypeFound = true;
        }

        if (templateId.getClass().equals(java.io.File.class) ||
            templateId.getClass().equals(Integer.class) ||
            templateId.getClass().equals(String.class) ) {
            map.put("template_id", templateId);
        } else if (isListOfFile(templateId)) {
            for(int i = 0; i< getListSize(templateId); i++) {
                map.put("template_id[" + i + "]", getFromList(templateId, i));
            }
        }
        else {
            map.put("template_id", JSON.getDefault().getMapper().writeValueAsString(templateId));
        }
    }
    if (title != null) {
        if (isFileTypeOrListOfFiles(title)) {
            fileTypeFound = true;
        }

        if (title.getClass().equals(java.io.File.class) ||
            title.getClass().equals(Integer.class) ||
            title.getClass().equals(String.class) ) {
            map.put("title", title);
        } else if (isListOfFile(title)) {
            for(int i = 0; i< getListSize(title); i++) {
                map.put("title[" + i + "]", getFromList(title, i));
            }
        }
        else {
            map.put("title", JSON.getDefault().getMapper().writeValueAsString(title));
        }
    }
    if (message != null) {
        if (isFileTypeOrListOfFiles(message)) {
            fileTypeFound = true;
        }

        if (message.getClass().equals(java.io.File.class) ||
            message.getClass().equals(Integer.class) ||
            message.getClass().equals(String.class) ) {
            map.put("message", message);
        } else if (isListOfFile(message)) {
            for(int i = 0; i< getListSize(message); i++) {
                map.put("message[" + i + "]", getFromList(message, i));
            }
        }
        else {
            map.put("message", JSON.getDefault().getMapper().writeValueAsString(message));
        }
    }
    if (updatedAt != null) {
        if (isFileTypeOrListOfFiles(updatedAt)) {
            fileTypeFound = true;
        }

        if (updatedAt.getClass().equals(java.io.File.class) ||
            updatedAt.getClass().equals(Integer.class) ||
            updatedAt.getClass().equals(String.class) ) {
            map.put("updated_at", updatedAt);
        } else if (isListOfFile(updatedAt)) {
            for(int i = 0; i< getListSize(updatedAt); i++) {
                map.put("updated_at[" + i + "]", getFromList(updatedAt, i));
            }
        }
        else {
            map.put("updated_at", JSON.getDefault().getMapper().writeValueAsString(updatedAt));
        }
    }
    if (isEmbedded != null) {
        if (isFileTypeOrListOfFiles(isEmbedded)) {
            fileTypeFound = true;
        }

        if (isEmbedded.getClass().equals(java.io.File.class) ||
            isEmbedded.getClass().equals(Integer.class) ||
            isEmbedded.getClass().equals(String.class) ) {
            map.put("is_embedded", isEmbedded);
        } else if (isListOfFile(isEmbedded)) {
            for(int i = 0; i< getListSize(isEmbedded); i++) {
                map.put("is_embedded[" + i + "]", getFromList(isEmbedded, i));
            }
        }
        else {
            map.put("is_embedded", JSON.getDefault().getMapper().writeValueAsString(isEmbedded));
        }
    }
    if (isCreator != null) {
        if (isFileTypeOrListOfFiles(isCreator)) {
            fileTypeFound = true;
        }

        if (isCreator.getClass().equals(java.io.File.class) ||
            isCreator.getClass().equals(Integer.class) ||
            isCreator.getClass().equals(String.class) ) {
            map.put("is_creator", isCreator);
        } else if (isListOfFile(isCreator)) {
            for(int i = 0; i< getListSize(isCreator); i++) {
                map.put("is_creator[" + i + "]", getFromList(isCreator, i));
            }
        }
        else {
            map.put("is_creator", JSON.getDefault().getMapper().writeValueAsString(isCreator));
        }
    }
    if (canEdit != null) {
        if (isFileTypeOrListOfFiles(canEdit)) {
            fileTypeFound = true;
        }

        if (canEdit.getClass().equals(java.io.File.class) ||
            canEdit.getClass().equals(Integer.class) ||
            canEdit.getClass().equals(String.class) ) {
            map.put("can_edit", canEdit);
        } else if (isListOfFile(canEdit)) {
            for(int i = 0; i< getListSize(canEdit); i++) {
                map.put("can_edit[" + i + "]", getFromList(canEdit, i));
            }
        }
        else {
            map.put("can_edit", JSON.getDefault().getMapper().writeValueAsString(canEdit));
        }
    }
    if (isLocked != null) {
        if (isFileTypeOrListOfFiles(isLocked)) {
            fileTypeFound = true;
        }

        if (isLocked.getClass().equals(java.io.File.class) ||
            isLocked.getClass().equals(Integer.class) ||
            isLocked.getClass().equals(String.class) ) {
            map.put("is_locked", isLocked);
        } else if (isListOfFile(isLocked)) {
            for(int i = 0; i< getListSize(isLocked); i++) {
                map.put("is_locked[" + i + "]", getFromList(isLocked, i));
            }
        }
        else {
            map.put("is_locked", JSON.getDefault().getMapper().writeValueAsString(isLocked));
        }
    }
    if (metadata != null) {
        if (isFileTypeOrListOfFiles(metadata)) {
            fileTypeFound = true;
        }

        if (metadata.getClass().equals(java.io.File.class) ||
            metadata.getClass().equals(Integer.class) ||
            metadata.getClass().equals(String.class) ) {
            map.put("metadata", metadata);
        } else if (isListOfFile(metadata)) {
            for(int i = 0; i< getListSize(metadata); i++) {
                map.put("metadata[" + i + "]", getFromList(metadata, i));
            }
        }
        else {
            map.put("metadata", JSON.getDefault().getMapper().writeValueAsString(metadata));
        }
    }
    if (signerRoles != null) {
        if (isFileTypeOrListOfFiles(signerRoles)) {
            fileTypeFound = true;
        }

        if (signerRoles.getClass().equals(java.io.File.class) ||
            signerRoles.getClass().equals(Integer.class) ||
            signerRoles.getClass().equals(String.class) ) {
            map.put("signer_roles", signerRoles);
        } else if (isListOfFile(signerRoles)) {
            for(int i = 0; i< getListSize(signerRoles); i++) {
                map.put("signer_roles[" + i + "]", getFromList(signerRoles, i));
            }
        }
        else {
            map.put("signer_roles", JSON.getDefault().getMapper().writeValueAsString(signerRoles));
        }
    }
    if (ccRoles != null) {
        if (isFileTypeOrListOfFiles(ccRoles)) {
            fileTypeFound = true;
        }

        if (ccRoles.getClass().equals(java.io.File.class) ||
            ccRoles.getClass().equals(Integer.class) ||
            ccRoles.getClass().equals(String.class) ) {
            map.put("cc_roles", ccRoles);
        } else if (isListOfFile(ccRoles)) {
            for(int i = 0; i< getListSize(ccRoles); i++) {
                map.put("cc_roles[" + i + "]", getFromList(ccRoles, i));
            }
        }
        else {
            map.put("cc_roles", JSON.getDefault().getMapper().writeValueAsString(ccRoles));
        }
    }
    if (documents != null) {
        if (isFileTypeOrListOfFiles(documents)) {
            fileTypeFound = true;
        }

        if (documents.getClass().equals(java.io.File.class) ||
            documents.getClass().equals(Integer.class) ||
            documents.getClass().equals(String.class) ) {
            map.put("documents", documents);
        } else if (isListOfFile(documents)) {
            for(int i = 0; i< getListSize(documents); i++) {
                map.put("documents[" + i + "]", getFromList(documents, i));
            }
        }
        else {
            map.put("documents", JSON.getDefault().getMapper().writeValueAsString(documents));
        }
    }
    if (customFields != null) {
        if (isFileTypeOrListOfFiles(customFields)) {
            fileTypeFound = true;
        }

        if (customFields.getClass().equals(java.io.File.class) ||
            customFields.getClass().equals(Integer.class) ||
            customFields.getClass().equals(String.class) ) {
            map.put("custom_fields", customFields);
        } else if (isListOfFile(customFields)) {
            for(int i = 0; i< getListSize(customFields); i++) {
                map.put("custom_fields[" + i + "]", getFromList(customFields, i));
            }
        }
        else {
            map.put("custom_fields", JSON.getDefault().getMapper().writeValueAsString(customFields));
        }
    }
    if (namedFormFields != null) {
        if (isFileTypeOrListOfFiles(namedFormFields)) {
            fileTypeFound = true;
        }

        if (namedFormFields.getClass().equals(java.io.File.class) ||
            namedFormFields.getClass().equals(Integer.class) ||
            namedFormFields.getClass().equals(String.class) ) {
            map.put("named_form_fields", namedFormFields);
        } else if (isListOfFile(namedFormFields)) {
            for(int i = 0; i< getListSize(namedFormFields); i++) {
                map.put("named_form_fields[" + i + "]", getFromList(namedFormFields, i));
            }
        }
        else {
            map.put("named_form_fields", JSON.getDefault().getMapper().writeValueAsString(namedFormFields));
        }
    }
    if (accounts != null) {
        if (isFileTypeOrListOfFiles(accounts)) {
            fileTypeFound = true;
        }

        if (accounts.getClass().equals(java.io.File.class) ||
            accounts.getClass().equals(Integer.class) ||
            accounts.getClass().equals(String.class) ) {
            map.put("accounts", accounts);
        } else if (isListOfFile(accounts)) {
            for(int i = 0; i< getListSize(accounts); i++) {
                map.put("accounts[" + i + "]", getFromList(accounts, i));
            }
        }
        else {
            map.put("accounts", JSON.getDefault().getMapper().writeValueAsString(accounts));
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

