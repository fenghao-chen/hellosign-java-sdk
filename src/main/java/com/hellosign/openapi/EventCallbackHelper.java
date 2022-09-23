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


package com.hellosign.openapi;

import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;
import com.hellosign.openapi.model.EventCallbackRequestEvent;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventCallbackHelper {
    private EventCallbackHelper() {}

    /**
    * Verify that a callback came from HelloSign.com
    *
    * @param apiKey
    * @param event
    * @return a boolean value indicating whether the callback event is valid
    */
    public static boolean isValid(String apiKey, EventCallbackRequestEvent event) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_256, apiKey)
                .hmacHex(event.getEventTime() + event.getEventType()).equals(event.getEventHash());
    }
}