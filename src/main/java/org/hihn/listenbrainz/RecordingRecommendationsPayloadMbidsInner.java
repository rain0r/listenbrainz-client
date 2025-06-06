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
 * RecordingRecommendationsPayloadMbidsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class RecordingRecommendationsPayloadMbidsInner {
  public static final String SERIALIZED_NAME_LATEST_LISTENED_AT = "latest_listened_at";
  @SerializedName(SERIALIZED_NAME_LATEST_LISTENED_AT)
  private String latestListenedAt;

  public static final String SERIALIZED_NAME_RECORDING_MBID = "recording_mbid";
  @SerializedName(SERIALIZED_NAME_RECORDING_MBID)
  private UUID recordingMbid;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;

  public RecordingRecommendationsPayloadMbidsInner() {
  }

  public RecordingRecommendationsPayloadMbidsInner latestListenedAt(String latestListenedAt) {
    this.latestListenedAt = latestListenedAt;
    return this;
  }

  /**
   * Get latestListenedAt
   * @return latestListenedAt
   */
  @javax.annotation.Nullable
  public String getLatestListenedAt() {
    return latestListenedAt;
  }

  public void setLatestListenedAt(String latestListenedAt) {
    this.latestListenedAt = latestListenedAt;
  }


  public RecordingRecommendationsPayloadMbidsInner recordingMbid(UUID recordingMbid) {
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


  public RecordingRecommendationsPayloadMbidsInner score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
   */
  @javax.annotation.Nullable
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingRecommendationsPayloadMbidsInner recordingRecommendationsPayloadMbidsInner = (RecordingRecommendationsPayloadMbidsInner) o;
    return Objects.equals(this.latestListenedAt, recordingRecommendationsPayloadMbidsInner.latestListenedAt) &&
        Objects.equals(this.recordingMbid, recordingRecommendationsPayloadMbidsInner.recordingMbid) &&
        Objects.equals(this.score, recordingRecommendationsPayloadMbidsInner.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latestListenedAt, recordingMbid, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingRecommendationsPayloadMbidsInner {\n");
    sb.append("    latestListenedAt: ").append(toIndentedString(latestListenedAt)).append("\n");
    sb.append("    recordingMbid: ").append(toIndentedString(recordingMbid)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
    openapiFields.add("latest_listened_at");
    openapiFields.add("recording_mbid");
    openapiFields.add("score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecordingRecommendationsPayloadMbidsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecordingRecommendationsPayloadMbidsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordingRecommendationsPayloadMbidsInner is not found in the empty JSON string", RecordingRecommendationsPayloadMbidsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecordingRecommendationsPayloadMbidsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordingRecommendationsPayloadMbidsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("latest_listened_at") != null && !jsonObj.get("latest_listened_at").isJsonNull()) && !jsonObj.get("latest_listened_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latest_listened_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latest_listened_at").toString()));
      }
      if ((jsonObj.get("recording_mbid") != null && !jsonObj.get("recording_mbid").isJsonNull()) && !jsonObj.get("recording_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recording_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recording_mbid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordingRecommendationsPayloadMbidsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordingRecommendationsPayloadMbidsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordingRecommendationsPayloadMbidsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordingRecommendationsPayloadMbidsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordingRecommendationsPayloadMbidsInner>() {
           @Override
           public void write(JsonWriter out, RecordingRecommendationsPayloadMbidsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordingRecommendationsPayloadMbidsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecordingRecommendationsPayloadMbidsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecordingRecommendationsPayloadMbidsInner
   * @throws IOException if the JSON string is invalid with respect to RecordingRecommendationsPayloadMbidsInner
   */
  public static RecordingRecommendationsPayloadMbidsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordingRecommendationsPayloadMbidsInner.class);
  }

  /**
   * Convert an instance of RecordingRecommendationsPayloadMbidsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

