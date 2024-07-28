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
import org.hihn.listenbrainz.LookupMetadataRecording;
import org.hihn.listenbrainz.LookupMetadataRelease;
import org.hihn.listenbrainz.LookupMetadataTag;
import org.hihn.listenbrainz.RecordingMetadataArtist;

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
 * LookupMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T20:56:43.728532+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class LookupMetadata {
  public static final String SERIALIZED_NAME_ARTIST = "artist";
  @SerializedName(SERIALIZED_NAME_ARTIST)
  private RecordingMetadataArtist artist;

  public static final String SERIALIZED_NAME_RECORDING = "recording";
  @SerializedName(SERIALIZED_NAME_RECORDING)
  private LookupMetadataRecording recording;

  public static final String SERIALIZED_NAME_RELEASE = "release";
  @SerializedName(SERIALIZED_NAME_RELEASE)
  private LookupMetadataRelease release;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private LookupMetadataTag tag;

  public LookupMetadata() {
  }

  public LookupMetadata artist(RecordingMetadataArtist artist) {
    this.artist = artist;
    return this;
  }

  /**
   * Get artist
   * @return artist
   */
  @javax.annotation.Nullable
  public RecordingMetadataArtist getArtist() {
    return artist;
  }

  public void setArtist(RecordingMetadataArtist artist) {
    this.artist = artist;
  }


  public LookupMetadata recording(LookupMetadataRecording recording) {
    this.recording = recording;
    return this;
  }

  /**
   * Get recording
   * @return recording
   */
  @javax.annotation.Nullable
  public LookupMetadataRecording getRecording() {
    return recording;
  }

  public void setRecording(LookupMetadataRecording recording) {
    this.recording = recording;
  }


  public LookupMetadata release(LookupMetadataRelease release) {
    this.release = release;
    return this;
  }

  /**
   * Get release
   * @return release
   */
  @javax.annotation.Nullable
  public LookupMetadataRelease getRelease() {
    return release;
  }

  public void setRelease(LookupMetadataRelease release) {
    this.release = release;
  }


  public LookupMetadata tag(LookupMetadataTag tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
   */
  @javax.annotation.Nullable
  public LookupMetadataTag getTag() {
    return tag;
  }

  public void setTag(LookupMetadataTag tag) {
    this.tag = tag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookupMetadata lookupMetadata = (LookupMetadata) o;
    return Objects.equals(this.artist, lookupMetadata.artist) &&
        Objects.equals(this.recording, lookupMetadata.recording) &&
        Objects.equals(this.release, lookupMetadata.release) &&
        Objects.equals(this.tag, lookupMetadata.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artist, recording, release, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupMetadata {\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("artist");
    openapiFields.add("recording");
    openapiFields.add("release");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LookupMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LookupMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LookupMetadata is not found in the empty JSON string", LookupMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LookupMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LookupMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `artist`
      if (jsonObj.get("artist") != null && !jsonObj.get("artist").isJsonNull()) {
        RecordingMetadataArtist.validateJsonElement(jsonObj.get("artist"));
      }
      // validate the optional field `recording`
      if (jsonObj.get("recording") != null && !jsonObj.get("recording").isJsonNull()) {
        LookupMetadataRecording.validateJsonElement(jsonObj.get("recording"));
      }
      // validate the optional field `release`
      if (jsonObj.get("release") != null && !jsonObj.get("release").isJsonNull()) {
        LookupMetadataRelease.validateJsonElement(jsonObj.get("release"));
      }
      // validate the optional field `tag`
      if (jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) {
        LookupMetadataTag.validateJsonElement(jsonObj.get("tag"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LookupMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LookupMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LookupMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LookupMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<LookupMetadata>() {
           @Override
           public void write(JsonWriter out, LookupMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LookupMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LookupMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LookupMetadata
   * @throws IOException if the JSON string is invalid with respect to LookupMetadata
   */
  public static LookupMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LookupMetadata.class);
  }

  /**
   * Convert an instance of LookupMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

