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
import org.hihn.listenbrainz.TrackMetadata;

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
 * Feedback
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T20:56:43.728532+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class Feedback {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Integer created;

  public static final String SERIALIZED_NAME_RECORDING_MBID = "recording_mbid";
  @SerializedName(SERIALIZED_NAME_RECORDING_MBID)
  private UUID recordingMbid;

  public static final String SERIALIZED_NAME_RECORDING_MSID = "recording_msid";
  @SerializedName(SERIALIZED_NAME_RECORDING_MSID)
  private UUID recordingMsid;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;

  public static final String SERIALIZED_NAME_TRACK_METADATA = "track_metadata";
  @SerializedName(SERIALIZED_NAME_TRACK_METADATA)
  private TrackMetadata trackMetadata;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public Feedback() {
  }

  public Feedback created(Integer created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @javax.annotation.Nullable
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }


  public Feedback recordingMbid(UUID recordingMbid) {
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


  public Feedback recordingMsid(UUID recordingMsid) {
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


  public Feedback score(Integer score) {
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


  public Feedback trackMetadata(TrackMetadata trackMetadata) {
    this.trackMetadata = trackMetadata;
    return this;
  }

  /**
   * Get trackMetadata
   * @return trackMetadata
   */
  @javax.annotation.Nullable
  public TrackMetadata getTrackMetadata() {
    return trackMetadata;
  }

  public void setTrackMetadata(TrackMetadata trackMetadata) {
    this.trackMetadata = trackMetadata;
  }


  public Feedback userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feedback feedback = (Feedback) o;
    return Objects.equals(this.created, feedback.created) &&
        Objects.equals(this.recordingMbid, feedback.recordingMbid) &&
        Objects.equals(this.recordingMsid, feedback.recordingMsid) &&
        Objects.equals(this.score, feedback.score) &&
        Objects.equals(this.trackMetadata, feedback.trackMetadata) &&
        Objects.equals(this.userId, feedback.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, recordingMbid, recordingMsid, score, trackMetadata, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feedback {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    recordingMbid: ").append(toIndentedString(recordingMbid)).append("\n");
    sb.append("    recordingMsid: ").append(toIndentedString(recordingMsid)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    trackMetadata: ").append(toIndentedString(trackMetadata)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("created");
    openapiFields.add("recording_mbid");
    openapiFields.add("recording_msid");
    openapiFields.add("score");
    openapiFields.add("track_metadata");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Feedback
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Feedback.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Feedback is not found in the empty JSON string", Feedback.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Feedback.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Feedback` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("recording_mbid") != null && !jsonObj.get("recording_mbid").isJsonNull()) && !jsonObj.get("recording_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recording_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recording_mbid").toString()));
      }
      if ((jsonObj.get("recording_msid") != null && !jsonObj.get("recording_msid").isJsonNull()) && !jsonObj.get("recording_msid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recording_msid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recording_msid").toString()));
      }
      // validate the optional field `track_metadata`
      if (jsonObj.get("track_metadata") != null && !jsonObj.get("track_metadata").isJsonNull()) {
        TrackMetadata.validateJsonElement(jsonObj.get("track_metadata"));
      }
      if ((jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonNull()) && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Feedback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Feedback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Feedback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Feedback.class));

       return (TypeAdapter<T>) new TypeAdapter<Feedback>() {
           @Override
           public void write(JsonWriter out, Feedback value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Feedback read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Feedback given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Feedback
   * @throws IOException if the JSON string is invalid with respect to Feedback
   */
  public static Feedback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Feedback.class);
  }

  /**
   * Convert an instance of Feedback to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

