/*
 * ListenBrainz Swagger - OpenAPI 3.0
 * OpenAPI client defintion.
 *
 * The version of the OpenAPI document: v-2024-07-17.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.hihn.listenbrainz;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.hihn.listenbrainz.GetPinsCurrent200ResponsePinnedRecording;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hihn.listenbrainz.JSON;

/**
 * GetPinsCurrent200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:54:13.371331+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class GetPinsCurrent200Response {
  public static final String SERIALIZED_NAME_PINNED_RECORDING = "pinned_recording";
  @SerializedName(SERIALIZED_NAME_PINNED_RECORDING)
  private GetPinsCurrent200ResponsePinnedRecording pinnedRecording;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public GetPinsCurrent200Response() {
  }

  public GetPinsCurrent200Response pinnedRecording(GetPinsCurrent200ResponsePinnedRecording pinnedRecording) {
    this.pinnedRecording = pinnedRecording;
    return this;
  }

  /**
   * Get pinnedRecording
   * @return pinnedRecording
   */
  @javax.annotation.Nullable
  public GetPinsCurrent200ResponsePinnedRecording getPinnedRecording() {
    return pinnedRecording;
  }

  public void setPinnedRecording(GetPinsCurrent200ResponsePinnedRecording pinnedRecording) {
    this.pinnedRecording = pinnedRecording;
  }


  public GetPinsCurrent200Response userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
   */
  @javax.annotation.Nullable
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPinsCurrent200Response getPinsCurrent200Response = (GetPinsCurrent200Response) o;
    return Objects.equals(this.pinnedRecording, getPinsCurrent200Response.pinnedRecording) &&
        Objects.equals(this.userName, getPinsCurrent200Response.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinnedRecording, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPinsCurrent200Response {\n");
    sb.append("    pinnedRecording: ").append(toIndentedString(pinnedRecording)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("}");
    return sb.toString();
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("pinned_recording");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPinsCurrent200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPinsCurrent200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPinsCurrent200Response is not found in the empty JSON string", GetPinsCurrent200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPinsCurrent200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPinsCurrent200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `pinned_recording`
      if (jsonObj.get("pinned_recording") != null && !jsonObj.get("pinned_recording").isJsonNull()) {
        GetPinsCurrent200ResponsePinnedRecording.validateJsonElement(jsonObj.get("pinned_recording"));
      }
      if ((jsonObj.get("user_name") != null && !jsonObj.get("user_name").isJsonNull()) && !jsonObj.get("user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPinsCurrent200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPinsCurrent200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPinsCurrent200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPinsCurrent200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPinsCurrent200Response>() {
           @Override
           public void write(JsonWriter out, GetPinsCurrent200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPinsCurrent200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPinsCurrent200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPinsCurrent200Response
   * @throws IOException if the JSON string is invalid with respect to GetPinsCurrent200Response
   */
  public static GetPinsCurrent200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPinsCurrent200Response.class);
  }

  /**
   * Convert an instance of GetPinsCurrent200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

