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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo {
  public static final String SERIALIZED_NAME_ARTIST_MBIDS = "artist_mbids";
  @SerializedName(SERIALIZED_NAME_ARTIST_MBIDS)
  private List<UUID> artistMbids = new ArrayList<>();

  public static final String SERIALIZED_NAME_RECORDING_MBID = "recording_mbid";
  @SerializedName(SERIALIZED_NAME_RECORDING_MBID)
  private UUID recordingMbid;

  public static final String SERIALIZED_NAME_RELEASE_MBID = "release_mbid";
  @SerializedName(SERIALIZED_NAME_RELEASE_MBID)
  private UUID releaseMbid;

  public ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo() {
  }

  public ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo artistMbids(List<UUID> artistMbids) {
    this.artistMbids = artistMbids;
    return this;
  }

  public ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo addArtistMbidsItem(UUID artistMbidsItem) {
    if (this.artistMbids == null) {
      this.artistMbids = new ArrayList<>();
    }
    this.artistMbids.add(artistMbidsItem);
    return this;
  }

  /**
   * Get artistMbids
   * @return artistMbids
   */
  @javax.annotation.Nonnull
  public List<UUID> getArtistMbids() {
    return artistMbids;
  }

  public void setArtistMbids(List<UUID> artistMbids) {
    this.artistMbids = artistMbids;
  }


  public ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo recordingMbid(UUID recordingMbid) {
    this.recordingMbid = recordingMbid;
    return this;
  }

  /**
   * Get recordingMbid
   * @return recordingMbid
   */
  @javax.annotation.Nonnull
  public UUID getRecordingMbid() {
    return recordingMbid;
  }

  public void setRecordingMbid(UUID recordingMbid) {
    this.recordingMbid = recordingMbid;
  }


  public ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo releaseMbid(UUID releaseMbid) {
    this.releaseMbid = releaseMbid;
    return this;
  }

  /**
   * Get releaseMbid
   * @return releaseMbid
   */
  @javax.annotation.Nonnull
  public UUID getReleaseMbid() {
    return releaseMbid;
  }

  public void setReleaseMbid(UUID releaseMbid) {
    this.releaseMbid = releaseMbid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo colorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo = (ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo) o;
    return Objects.equals(this.artistMbids, colorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo.artistMbids) &&
        Objects.equals(this.recordingMbid, colorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo.recordingMbid) &&
        Objects.equals(this.releaseMbid, colorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo.releaseMbid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistMbids, recordingMbid, releaseMbid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo {\n");
    sb.append("    artistMbids: ").append(toIndentedString(artistMbids)).append("\n");
    sb.append("    recordingMbid: ").append(toIndentedString(recordingMbid)).append("\n");
    sb.append("    releaseMbid: ").append(toIndentedString(releaseMbid)).append("\n");
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
    openapiFields.add("artist_mbids");
    openapiFields.add("recording_mbid");
    openapiFields.add("release_mbid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("artist_mbids");
    openapiRequiredFields.add("recording_mbid");
    openapiRequiredFields.add("release_mbid");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo is not found in the empty JSON string", ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("artist_mbids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("artist_mbids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_mbids` to be an array in the JSON string but got `%s`", jsonObj.get("artist_mbids").toString()));
      }
      if (!jsonObj.get("recording_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recording_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recording_mbid").toString()));
      }
      if (!jsonObj.get("release_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_mbid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo>() {
           @Override
           public void write(JsonWriter out, ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo
   * @throws IOException if the JSON string is invalid with respect to ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo
   */
  public static ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo.class);
  }

  /**
   * Convert an instance of ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
