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
import org.hihn.listenbrainz.ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo;

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
 * ColorPayloadReleasesInnerRecordingsInnerTrackMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:48:15.256271+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class ColorPayloadReleasesInnerRecordingsInnerTrackMetadata {
  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additional_info";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo additionalInfo;

  public static final String SERIALIZED_NAME_ARTIST_NAME = "artist_name";
  @SerializedName(SERIALIZED_NAME_ARTIST_NAME)
  private String artistName;

  public static final String SERIALIZED_NAME_RELEASE_NAME = "release_name";
  @SerializedName(SERIALIZED_NAME_RELEASE_NAME)
  private String releaseName;

  public static final String SERIALIZED_NAME_TRACK_NAME = "track_name";
  @SerializedName(SERIALIZED_NAME_TRACK_NAME)
  private String trackName;

  public ColorPayloadReleasesInnerRecordingsInnerTrackMetadata() {
  }

  public ColorPayloadReleasesInnerRecordingsInnerTrackMetadata additionalInfo(ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
   */
  @javax.annotation.Nonnull
  public ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public ColorPayloadReleasesInnerRecordingsInnerTrackMetadata artistName(String artistName) {
    this.artistName = artistName;
    return this;
  }

  /**
   * Get artistName
   * @return artistName
   */
  @javax.annotation.Nonnull
  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }


  public ColorPayloadReleasesInnerRecordingsInnerTrackMetadata releaseName(String releaseName) {
    this.releaseName = releaseName;
    return this;
  }

  /**
   * Get releaseName
   * @return releaseName
   */
  @javax.annotation.Nonnull
  public String getReleaseName() {
    return releaseName;
  }

  public void setReleaseName(String releaseName) {
    this.releaseName = releaseName;
  }


  public ColorPayloadReleasesInnerRecordingsInnerTrackMetadata trackName(String trackName) {
    this.trackName = trackName;
    return this;
  }

  /**
   * Get trackName
   * @return trackName
   */
  @javax.annotation.Nonnull
  public String getTrackName() {
    return trackName;
  }

  public void setTrackName(String trackName) {
    this.trackName = trackName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColorPayloadReleasesInnerRecordingsInnerTrackMetadata colorPayloadReleasesInnerRecordingsInnerTrackMetadata = (ColorPayloadReleasesInnerRecordingsInnerTrackMetadata) o;
    return Objects.equals(this.additionalInfo, colorPayloadReleasesInnerRecordingsInnerTrackMetadata.additionalInfo) &&
        Objects.equals(this.artistName, colorPayloadReleasesInnerRecordingsInnerTrackMetadata.artistName) &&
        Objects.equals(this.releaseName, colorPayloadReleasesInnerRecordingsInnerTrackMetadata.releaseName) &&
        Objects.equals(this.trackName, colorPayloadReleasesInnerRecordingsInnerTrackMetadata.trackName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, artistName, releaseName, trackName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColorPayloadReleasesInnerRecordingsInnerTrackMetadata {\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    artistName: ").append(toIndentedString(artistName)).append("\n");
    sb.append("    releaseName: ").append(toIndentedString(releaseName)).append("\n");
    sb.append("    trackName: ").append(toIndentedString(trackName)).append("\n");
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
    openapiFields.add("additional_info");
    openapiFields.add("artist_name");
    openapiFields.add("release_name");
    openapiFields.add("track_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("additional_info");
    openapiRequiredFields.add("artist_name");
    openapiRequiredFields.add("release_name");
    openapiRequiredFields.add("track_name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ColorPayloadReleasesInnerRecordingsInnerTrackMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ColorPayloadReleasesInnerRecordingsInnerTrackMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ColorPayloadReleasesInnerRecordingsInnerTrackMetadata is not found in the empty JSON string", ColorPayloadReleasesInnerRecordingsInnerTrackMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ColorPayloadReleasesInnerRecordingsInnerTrackMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ColorPayloadReleasesInnerRecordingsInnerTrackMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ColorPayloadReleasesInnerRecordingsInnerTrackMetadata.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `additional_info`
      ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo.validateJsonElement(jsonObj.get("additional_info"));
      if (!jsonObj.get("artist_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artist_name").toString()));
      }
      if (!jsonObj.get("release_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_name").toString()));
      }
      if (!jsonObj.get("track_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `track_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("track_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ColorPayloadReleasesInnerRecordingsInnerTrackMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ColorPayloadReleasesInnerRecordingsInnerTrackMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ColorPayloadReleasesInnerRecordingsInnerTrackMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ColorPayloadReleasesInnerRecordingsInnerTrackMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<ColorPayloadReleasesInnerRecordingsInnerTrackMetadata>() {
           @Override
           public void write(JsonWriter out, ColorPayloadReleasesInnerRecordingsInnerTrackMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ColorPayloadReleasesInnerRecordingsInnerTrackMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ColorPayloadReleasesInnerRecordingsInnerTrackMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ColorPayloadReleasesInnerRecordingsInnerTrackMetadata
   * @throws IOException if the JSON string is invalid with respect to ColorPayloadReleasesInnerRecordingsInnerTrackMetadata
   */
  public static ColorPayloadReleasesInnerRecordingsInnerTrackMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ColorPayloadReleasesInnerRecordingsInnerTrackMetadata.class);
  }

  /**
   * Convert an instance of ColorPayloadReleasesInnerRecordingsInnerTrackMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

