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
import org.hihn.listenbrainz.RecordingMetadataArtist;
import org.hihn.listenbrainz.RecordingMetadataRecording;
import org.hihn.listenbrainz.RecordingMetadataTag;

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
 * RecordingMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:48:15.256271+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class RecordingMetadata {
  public static final String SERIALIZED_NAME_ARTIST = "artist";
  @SerializedName(SERIALIZED_NAME_ARTIST)
  private RecordingMetadataArtist artist;

  public static final String SERIALIZED_NAME_RECORDING = "recording";
  @SerializedName(SERIALIZED_NAME_RECORDING)
  private RecordingMetadataRecording recording;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private RecordingMetadataTag tag;

  public RecordingMetadata() {
  }

  public RecordingMetadata artist(RecordingMetadataArtist artist) {
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


  public RecordingMetadata recording(RecordingMetadataRecording recording) {
    this.recording = recording;
    return this;
  }

  /**
   * Get recording
   * @return recording
   */
  @javax.annotation.Nullable
  public RecordingMetadataRecording getRecording() {
    return recording;
  }

  public void setRecording(RecordingMetadataRecording recording) {
    this.recording = recording;
  }


  public RecordingMetadata tag(RecordingMetadataTag tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
   */
  @javax.annotation.Nullable
  public RecordingMetadataTag getTag() {
    return tag;
  }

  public void setTag(RecordingMetadataTag tag) {
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
    RecordingMetadata recordingMetadata = (RecordingMetadata) o;
    return Objects.equals(this.artist, recordingMetadata.artist) &&
        Objects.equals(this.recording, recordingMetadata.recording) &&
        Objects.equals(this.tag, recordingMetadata.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artist, recording, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingMetadata {\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
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
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecordingMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecordingMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordingMetadata is not found in the empty JSON string", RecordingMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecordingMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordingMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `artist`
      if (jsonObj.get("artist") != null && !jsonObj.get("artist").isJsonNull()) {
        RecordingMetadataArtist.validateJsonElement(jsonObj.get("artist"));
      }
      // validate the optional field `recording`
      if (jsonObj.get("recording") != null && !jsonObj.get("recording").isJsonNull()) {
        RecordingMetadataRecording.validateJsonElement(jsonObj.get("recording"));
      }
      // validate the optional field `tag`
      if (jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) {
        RecordingMetadataTag.validateJsonElement(jsonObj.get("tag"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordingMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordingMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordingMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordingMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordingMetadata>() {
           @Override
           public void write(JsonWriter out, RecordingMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordingMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecordingMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecordingMetadata
   * @throws IOException if the JSON string is invalid with respect to RecordingMetadata
   */
  public static RecordingMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordingMetadata.class);
  }

  /**
   * Convert an instance of RecordingMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

