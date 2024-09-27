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
 * GetPinsCurrent200ResponsePinnedRecording
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class GetPinsCurrent200ResponsePinnedRecording {
  public static final String SERIALIZED_NAME_BLURB_CONTENT = "blurb_content";
  @SerializedName(SERIALIZED_NAME_BLURB_CONTENT)
  private String blurbContent;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Integer created;

  public static final String SERIALIZED_NAME_PINNED_UNTIL = "pinned_until";
  @SerializedName(SERIALIZED_NAME_PINNED_UNTIL)
  private Integer pinnedUntil;

  public static final String SERIALIZED_NAME_RECORDING_MBID = "recording_mbid";
  @SerializedName(SERIALIZED_NAME_RECORDING_MBID)
  private UUID recordingMbid;

  public static final String SERIALIZED_NAME_RECORDING_MSID = "recording_msid";
  @SerializedName(SERIALIZED_NAME_RECORDING_MSID)
  private UUID recordingMsid;

  public static final String SERIALIZED_NAME_ROW_ID = "row_id";
  @SerializedName(SERIALIZED_NAME_ROW_ID)
  private Integer rowId;

  public static final String SERIALIZED_NAME_TRACK_METADATA = "track_metadata";
  @SerializedName(SERIALIZED_NAME_TRACK_METADATA)
  private TrackMetadata trackMetadata;

  public GetPinsCurrent200ResponsePinnedRecording() {
  }

  public GetPinsCurrent200ResponsePinnedRecording blurbContent(String blurbContent) {
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


  public GetPinsCurrent200ResponsePinnedRecording created(Integer created) {
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


  public GetPinsCurrent200ResponsePinnedRecording pinnedUntil(Integer pinnedUntil) {
    this.pinnedUntil = pinnedUntil;
    return this;
  }

  /**
   * Get pinnedUntil
   * @return pinnedUntil
   */
  @javax.annotation.Nullable
  public Integer getPinnedUntil() {
    return pinnedUntil;
  }

  public void setPinnedUntil(Integer pinnedUntil) {
    this.pinnedUntil = pinnedUntil;
  }


  public GetPinsCurrent200ResponsePinnedRecording recordingMbid(UUID recordingMbid) {
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


  public GetPinsCurrent200ResponsePinnedRecording recordingMsid(UUID recordingMsid) {
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


  public GetPinsCurrent200ResponsePinnedRecording rowId(Integer rowId) {
    this.rowId = rowId;
    return this;
  }

  /**
   * Get rowId
   * @return rowId
   */
  @javax.annotation.Nullable
  public Integer getRowId() {
    return rowId;
  }

  public void setRowId(Integer rowId) {
    this.rowId = rowId;
  }


  public GetPinsCurrent200ResponsePinnedRecording trackMetadata(TrackMetadata trackMetadata) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPinsCurrent200ResponsePinnedRecording getPinsCurrent200ResponsePinnedRecording = (GetPinsCurrent200ResponsePinnedRecording) o;
    return Objects.equals(this.blurbContent, getPinsCurrent200ResponsePinnedRecording.blurbContent) &&
        Objects.equals(this.created, getPinsCurrent200ResponsePinnedRecording.created) &&
        Objects.equals(this.pinnedUntil, getPinsCurrent200ResponsePinnedRecording.pinnedUntil) &&
        Objects.equals(this.recordingMbid, getPinsCurrent200ResponsePinnedRecording.recordingMbid) &&
        Objects.equals(this.recordingMsid, getPinsCurrent200ResponsePinnedRecording.recordingMsid) &&
        Objects.equals(this.rowId, getPinsCurrent200ResponsePinnedRecording.rowId) &&
        Objects.equals(this.trackMetadata, getPinsCurrent200ResponsePinnedRecording.trackMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blurbContent, created, pinnedUntil, recordingMbid, recordingMsid, rowId, trackMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPinsCurrent200ResponsePinnedRecording {\n");
    sb.append("    blurbContent: ").append(toIndentedString(blurbContent)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    pinnedUntil: ").append(toIndentedString(pinnedUntil)).append("\n");
    sb.append("    recordingMbid: ").append(toIndentedString(recordingMbid)).append("\n");
    sb.append("    recordingMsid: ").append(toIndentedString(recordingMsid)).append("\n");
    sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
    sb.append("    trackMetadata: ").append(toIndentedString(trackMetadata)).append("\n");
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
    openapiFields.add("blurb_content");
    openapiFields.add("created");
    openapiFields.add("pinned_until");
    openapiFields.add("recording_mbid");
    openapiFields.add("recording_msid");
    openapiFields.add("row_id");
    openapiFields.add("track_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPinsCurrent200ResponsePinnedRecording
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPinsCurrent200ResponsePinnedRecording.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPinsCurrent200ResponsePinnedRecording is not found in the empty JSON string", GetPinsCurrent200ResponsePinnedRecording.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPinsCurrent200ResponsePinnedRecording.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPinsCurrent200ResponsePinnedRecording` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("blurb_content") != null && !jsonObj.get("blurb_content").isJsonNull()) && !jsonObj.get("blurb_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blurb_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blurb_content").toString()));
      }
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPinsCurrent200ResponsePinnedRecording.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPinsCurrent200ResponsePinnedRecording' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPinsCurrent200ResponsePinnedRecording> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPinsCurrent200ResponsePinnedRecording.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPinsCurrent200ResponsePinnedRecording>() {
           @Override
           public void write(JsonWriter out, GetPinsCurrent200ResponsePinnedRecording value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPinsCurrent200ResponsePinnedRecording read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPinsCurrent200ResponsePinnedRecording given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPinsCurrent200ResponsePinnedRecording
   * @throws IOException if the JSON string is invalid with respect to GetPinsCurrent200ResponsePinnedRecording
   */
  public static GetPinsCurrent200ResponsePinnedRecording fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPinsCurrent200ResponsePinnedRecording.class);
  }

  /**
   * Convert an instance of GetPinsCurrent200ResponsePinnedRecording to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

