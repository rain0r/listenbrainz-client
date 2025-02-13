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
import java.util.UUID;

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
 * Recording200ResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class Recording200ResponseInner {
  public static final String SERIALIZED_NAME_RECORDING_MBID = "recording_mbid";
  @SerializedName(SERIALIZED_NAME_RECORDING_MBID)
  private UUID recordingMbid;

  public static final String SERIALIZED_NAME_TOTAL_LISTEN_COUNT = "total_listen_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_LISTEN_COUNT)
  private Integer totalListenCount;

  public static final String SERIALIZED_NAME_TOTAL_USER_COUNT = "total_user_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_USER_COUNT)
  private Integer totalUserCount;

  public Recording200ResponseInner() {
  }

  public Recording200ResponseInner recordingMbid(UUID recordingMbid) {
    this.recordingMbid = recordingMbid;
    return this;
  }

  /**
   * Get recordingMbid
   * @return recordingMbid
   */
  @javax.annotation.Nullable
  public UUID getRecordingMbid() {
    return recordingMbid;
  }

  public void setRecordingMbid(UUID recordingMbid) {
    this.recordingMbid = recordingMbid;
  }


  public Recording200ResponseInner totalListenCount(Integer totalListenCount) {
    this.totalListenCount = totalListenCount;
    return this;
  }

  /**
   * Get totalListenCount
   * @return totalListenCount
   */
  @javax.annotation.Nullable
  public Integer getTotalListenCount() {
    return totalListenCount;
  }

  public void setTotalListenCount(Integer totalListenCount) {
    this.totalListenCount = totalListenCount;
  }


  public Recording200ResponseInner totalUserCount(Integer totalUserCount) {
    this.totalUserCount = totalUserCount;
    return this;
  }

  /**
   * Get totalUserCount
   * @return totalUserCount
   */
  @javax.annotation.Nullable
  public Integer getTotalUserCount() {
    return totalUserCount;
  }

  public void setTotalUserCount(Integer totalUserCount) {
    this.totalUserCount = totalUserCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recording200ResponseInner recording200ResponseInner = (Recording200ResponseInner) o;
    return Objects.equals(this.recordingMbid, recording200ResponseInner.recordingMbid) &&
        Objects.equals(this.totalListenCount, recording200ResponseInner.totalListenCount) &&
        Objects.equals(this.totalUserCount, recording200ResponseInner.totalUserCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordingMbid, totalListenCount, totalUserCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recording200ResponseInner {\n");
    sb.append("    recordingMbid: ").append(toIndentedString(recordingMbid)).append("\n");
    sb.append("    totalListenCount: ").append(toIndentedString(totalListenCount)).append("\n");
    sb.append("    totalUserCount: ").append(toIndentedString(totalUserCount)).append("\n");
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
    openapiFields.add("recording_mbid");
    openapiFields.add("total_listen_count");
    openapiFields.add("total_user_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Recording200ResponseInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Recording200ResponseInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Recording200ResponseInner is not found in the empty JSON string", Recording200ResponseInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Recording200ResponseInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Recording200ResponseInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("recording_mbid") != null && !jsonObj.get("recording_mbid").isJsonNull()) && !jsonObj.get("recording_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recording_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recording_mbid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Recording200ResponseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Recording200ResponseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Recording200ResponseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Recording200ResponseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<Recording200ResponseInner>() {
           @Override
           public void write(JsonWriter out, Recording200ResponseInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Recording200ResponseInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Recording200ResponseInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Recording200ResponseInner
   * @throws IOException if the JSON string is invalid with respect to Recording200ResponseInner
   */
  public static Recording200ResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Recording200ResponseInner.class);
  }

  /**
   * Convert an instance of Recording200ResponseInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

