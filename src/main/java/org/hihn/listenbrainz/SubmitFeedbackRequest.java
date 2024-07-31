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
import org.hihn.listenbrainz.AllowedRatings;

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
 * SubmitFeedbackRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class SubmitFeedbackRequest {
  public static final String SERIALIZED_NAME_RECORDING_MBID = "recording_mbid";
  @SerializedName(SERIALIZED_NAME_RECORDING_MBID)
  private UUID recordingMbid;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private AllowedRatings rating;

  public SubmitFeedbackRequest() {
  }

  public SubmitFeedbackRequest recordingMbid(UUID recordingMbid) {
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


  public SubmitFeedbackRequest rating(AllowedRatings rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
   */
  @javax.annotation.Nullable
  public AllowedRatings getRating() {
    return rating;
  }

  public void setRating(AllowedRatings rating) {
    this.rating = rating;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitFeedbackRequest submitFeedbackRequest = (SubmitFeedbackRequest) o;
    return Objects.equals(this.recordingMbid, submitFeedbackRequest.recordingMbid) &&
        Objects.equals(this.rating, submitFeedbackRequest.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordingMbid, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitFeedbackRequest {\n");
    sb.append("    recordingMbid: ").append(toIndentedString(recordingMbid)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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
    openapiFields.add("rating");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SubmitFeedbackRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubmitFeedbackRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitFeedbackRequest is not found in the empty JSON string", SubmitFeedbackRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubmitFeedbackRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitFeedbackRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("recording_mbid") != null && !jsonObj.get("recording_mbid").isJsonNull()) && !jsonObj.get("recording_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recording_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recording_mbid").toString()));
      }
      // validate the optional field `rating`
      if (jsonObj.get("rating") != null && !jsonObj.get("rating").isJsonNull()) {
        AllowedRatings.validateJsonElement(jsonObj.get("rating"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitFeedbackRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitFeedbackRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitFeedbackRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitFeedbackRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitFeedbackRequest>() {
           @Override
           public void write(JsonWriter out, SubmitFeedbackRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitFeedbackRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SubmitFeedbackRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubmitFeedbackRequest
   * @throws IOException if the JSON string is invalid with respect to SubmitFeedbackRequest
   */
  public static SubmitFeedbackRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitFeedbackRequest.class);
  }

  /**
   * Convert an instance of SubmitFeedbackRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
