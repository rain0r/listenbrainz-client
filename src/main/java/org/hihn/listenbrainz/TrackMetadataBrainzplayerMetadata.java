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
 * TrackMetadataBrainzplayerMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class TrackMetadataBrainzplayerMetadata {
  public static final String SERIALIZED_NAME_ARTIST_NAME = "artist_name";
  @SerializedName(SERIALIZED_NAME_ARTIST_NAME)
  private String artistName;

  public static final String SERIALIZED_NAME_RELEASE_NAME = "release_name";
  @SerializedName(SERIALIZED_NAME_RELEASE_NAME)
  private String releaseName;

  public static final String SERIALIZED_NAME_TRACK_NAME = "track_name";
  @SerializedName(SERIALIZED_NAME_TRACK_NAME)
  private String trackName;

  public TrackMetadataBrainzplayerMetadata() {
  }

  public TrackMetadataBrainzplayerMetadata artistName(String artistName) {
    this.artistName = artistName;
    return this;
  }

  /**
   * Get artistName
   * @return artistName
   */
  @javax.annotation.Nullable
  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }


  public TrackMetadataBrainzplayerMetadata releaseName(String releaseName) {
    this.releaseName = releaseName;
    return this;
  }

  /**
   * Get releaseName
   * @return releaseName
   */
  @javax.annotation.Nullable
  public String getReleaseName() {
    return releaseName;
  }

  public void setReleaseName(String releaseName) {
    this.releaseName = releaseName;
  }


  public TrackMetadataBrainzplayerMetadata trackName(String trackName) {
    this.trackName = trackName;
    return this;
  }

  /**
   * Get trackName
   * @return trackName
   */
  @javax.annotation.Nullable
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
    TrackMetadataBrainzplayerMetadata trackMetadataBrainzplayerMetadata = (TrackMetadataBrainzplayerMetadata) o;
    return Objects.equals(this.artistName, trackMetadataBrainzplayerMetadata.artistName) &&
        Objects.equals(this.releaseName, trackMetadataBrainzplayerMetadata.releaseName) &&
        Objects.equals(this.trackName, trackMetadataBrainzplayerMetadata.trackName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistName, releaseName, trackName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackMetadataBrainzplayerMetadata {\n");
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
    openapiFields.add("artist_name");
    openapiFields.add("release_name");
    openapiFields.add("track_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TrackMetadataBrainzplayerMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TrackMetadataBrainzplayerMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrackMetadataBrainzplayerMetadata is not found in the empty JSON string", TrackMetadataBrainzplayerMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TrackMetadataBrainzplayerMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrackMetadataBrainzplayerMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("artist_name") != null && !jsonObj.get("artist_name").isJsonNull()) && !jsonObj.get("artist_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artist_name").toString()));
      }
      if ((jsonObj.get("release_name") != null && !jsonObj.get("release_name").isJsonNull()) && !jsonObj.get("release_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_name").toString()));
      }
      if ((jsonObj.get("track_name") != null && !jsonObj.get("track_name").isJsonNull()) && !jsonObj.get("track_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `track_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("track_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrackMetadataBrainzplayerMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrackMetadataBrainzplayerMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrackMetadataBrainzplayerMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrackMetadataBrainzplayerMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<TrackMetadataBrainzplayerMetadata>() {
           @Override
           public void write(JsonWriter out, TrackMetadataBrainzplayerMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrackMetadataBrainzplayerMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TrackMetadataBrainzplayerMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TrackMetadataBrainzplayerMetadata
   * @throws IOException if the JSON string is invalid with respect to TrackMetadataBrainzplayerMetadata
   */
  public static TrackMetadataBrainzplayerMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrackMetadataBrainzplayerMetadata.class);
  }

  /**
   * Convert an instance of TrackMetadataBrainzplayerMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

