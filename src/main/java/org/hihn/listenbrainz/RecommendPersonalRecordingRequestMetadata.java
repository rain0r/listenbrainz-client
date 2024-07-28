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
 * RecommendPersonalRecordingRequestMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:48:15.256271+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class RecommendPersonalRecordingRequestMetadata {
  public static final String SERIALIZED_NAME_RECORDING_MSID = "recording_msid";
  @SerializedName(SERIALIZED_NAME_RECORDING_MSID)
  private UUID recordingMsid;

  public static final String SERIALIZED_NAME_RECORDING_MBID = "recording_mbid";
  @SerializedName(SERIALIZED_NAME_RECORDING_MBID)
  private UUID recordingMbid;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private String users;

  public static final String SERIALIZED_NAME_BLURB_CONTENT = "blurb_content";
  @SerializedName(SERIALIZED_NAME_BLURB_CONTENT)
  private String blurbContent;

  public RecommendPersonalRecordingRequestMetadata() {
  }

  public RecommendPersonalRecordingRequestMetadata recordingMsid(UUID recordingMsid) {
    this.recordingMsid = recordingMsid;
    return this;
  }

  /**
   * Get recordingMsid
   * @return recordingMsid
   */
  @javax.annotation.Nullable
  public UUID getRecordingMsid() {
    return recordingMsid;
  }

  public void setRecordingMsid(UUID recordingMsid) {
    this.recordingMsid = recordingMsid;
  }


  public RecommendPersonalRecordingRequestMetadata recordingMbid(UUID recordingMbid) {
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


  public RecommendPersonalRecordingRequestMetadata users(String users) {
    this.users = users;
    return this;
  }

  /**
   * Get users
   * @return users
   */
  @javax.annotation.Nullable
  public String getUsers() {
    return users;
  }

  public void setUsers(String users) {
    this.users = users;
  }


  public RecommendPersonalRecordingRequestMetadata blurbContent(String blurbContent) {
    this.blurbContent = blurbContent;
    return this;
  }

  /**
   * Get blurbContent
   * @return blurbContent
   */
  @javax.annotation.Nullable
  public String getBlurbContent() {
    return blurbContent;
  }

  public void setBlurbContent(String blurbContent) {
    this.blurbContent = blurbContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendPersonalRecordingRequestMetadata recommendPersonalRecordingRequestMetadata = (RecommendPersonalRecordingRequestMetadata) o;
    return Objects.equals(this.recordingMsid, recommendPersonalRecordingRequestMetadata.recordingMsid) &&
        Objects.equals(this.recordingMbid, recommendPersonalRecordingRequestMetadata.recordingMbid) &&
        Objects.equals(this.users, recommendPersonalRecordingRequestMetadata.users) &&
        Objects.equals(this.blurbContent, recommendPersonalRecordingRequestMetadata.blurbContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordingMsid, recordingMbid, users, blurbContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendPersonalRecordingRequestMetadata {\n");
    sb.append("    recordingMsid: ").append(toIndentedString(recordingMsid)).append("\n");
    sb.append("    recordingMbid: ").append(toIndentedString(recordingMbid)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    blurbContent: ").append(toIndentedString(blurbContent)).append("\n");
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
    openapiFields.add("recording_msid");
    openapiFields.add("recording_mbid");
    openapiFields.add("users");
    openapiFields.add("blurb_content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecommendPersonalRecordingRequestMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecommendPersonalRecordingRequestMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecommendPersonalRecordingRequestMetadata is not found in the empty JSON string", RecommendPersonalRecordingRequestMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecommendPersonalRecordingRequestMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecommendPersonalRecordingRequestMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("recording_msid") != null && !jsonObj.get("recording_msid").isJsonNull()) && !jsonObj.get("recording_msid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recording_msid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recording_msid").toString()));
      }
      if ((jsonObj.get("recording_mbid") != null && !jsonObj.get("recording_mbid").isJsonNull()) && !jsonObj.get("recording_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recording_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recording_mbid").toString()));
      }
      if ((jsonObj.get("users") != null && !jsonObj.get("users").isJsonNull()) && !jsonObj.get("users").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `users` to be a primitive type in the JSON string but got `%s`", jsonObj.get("users").toString()));
      }
      if ((jsonObj.get("blurb_content") != null && !jsonObj.get("blurb_content").isJsonNull()) && !jsonObj.get("blurb_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blurb_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blurb_content").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecommendPersonalRecordingRequestMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecommendPersonalRecordingRequestMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecommendPersonalRecordingRequestMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecommendPersonalRecordingRequestMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<RecommendPersonalRecordingRequestMetadata>() {
           @Override
           public void write(JsonWriter out, RecommendPersonalRecordingRequestMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecommendPersonalRecordingRequestMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecommendPersonalRecordingRequestMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecommendPersonalRecordingRequestMetadata
   * @throws IOException if the JSON string is invalid with respect to RecommendPersonalRecordingRequestMetadata
   */
  public static RecommendPersonalRecordingRequestMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecommendPersonalRecordingRequestMetadata.class);
  }

  /**
   * Convert an instance of RecommendPersonalRecordingRequestMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

