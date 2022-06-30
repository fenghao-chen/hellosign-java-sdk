

# TemplateUpdateFilesRequest



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
| `clientId` | ```String``` |  Client id of the app you&#39;re using to update this template.  |  |
| `file` | ```List<File>``` |  Use `file[]` to indicate the uploaded file(s) to use for the template.<br><br>This endpoint requires either **file** or **file_url[]**, but not both.  |  |
| `fileUrl` | ```List<String>``` |  Use `file_url[]` to have HelloSign download the file(s) to use for the template.<br><br>This endpoint requires either **file** or **file_url[]**, but not both.  |  |
| `message` | ```String``` |  The new default template email message.  |  |
| `subject` | ```String``` |  The new default template email subject.  |  |
| `testMode` | ```Boolean``` |  Whether this is a test, the signature request created from this draft will not be legally binding if set to `true`. Defaults to `false`.  |  |


