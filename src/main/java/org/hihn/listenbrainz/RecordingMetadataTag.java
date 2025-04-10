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
import org.hihn.listenbrainz.TopReleaseGroupsForArtistInnerTagArtistInner;
import org.hihn.listenbrainz.TopReleaseGroupsForArtistInnerTagReleaseGroupInner;

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
 * RecordingMetadataTag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class RecordingMetadataTag {
  public static final String SERIALIZED_NAME_ARTIST = "artist";
  @SerializedName(SERIALIZED_NAME_ARTIST)
  private List<TopReleaseGroupsForArtistInnerTagArtistInner> artist = new ArrayList<>();

  public static final String SERIALIZED_NAME_RECORDING = "recording";
  @SerializedName(SERIALIZED_NAME_RECORDING)
  private List<TopReleaseGroupsForArtistInnerTagReleaseGroupInner> recording = new ArrayList<>();

  public static final String SERIALIZED_NAME_RELEASE_GROUP = "release_group";
  @SerializedName(SERIALIZED_NAME_RELEASE_GROUP)
  private List<TopReleaseGroupsForArtistInnerTagReleaseGroupInner> releaseGroup = new ArrayList<>();

  public RecordingMetadataTag() {
  }

  public RecordingMetadataTag artist(List<TopReleaseGroupsForArtistInnerTagArtistInner> artist) {
    this.artist = artist;
    return this;
  }

  public RecordingMetadataTag addArtistItem(TopReleaseGroupsForArtistInnerTagArtistInner artistItem) {
    if (this.artist == null) {
      this.artist = new ArrayList<>();
    }
    this.artist.add(artistItem);
    return this;
  }

  /**
   * Get artist
   * @return artist
   */
  @javax.annotation.Nullable
  public List<TopReleaseGroupsForArtistInnerTagArtistInner> getArtist() {
    return artist;
  }

  public void setArtist(List<TopReleaseGroupsForArtistInnerTagArtistInner> artist) {
    this.artist = artist;
  }


  public RecordingMetadataTag recording(List<TopReleaseGroupsForArtistInnerTagReleaseGroupInner> recording) {
    this.recording = recording;
    return this;
  }

  public RecordingMetadataTag addRecordingItem(TopReleaseGroupsForArtistInnerTagReleaseGroupInner recordingItem) {
    if (this.recording == null) {
      this.recording = new ArrayList<>();
    }
    this.recording.add(recordingItem);
    return this;
  }

  /**
   * Get recording
   * @return recording
   */
  @javax.annotation.Nullable
  public List<TopReleaseGroupsForArtistInnerTagReleaseGroupInner> getRecording() {
    return recording;
  }

  public void setRecording(List<TopReleaseGroupsForArtistInnerTagReleaseGroupInner> recording) {
    this.recording = recording;
  }


  public RecordingMetadataTag releaseGroup(List<TopReleaseGroupsForArtistInnerTagReleaseGroupInner> releaseGroup) {
    this.releaseGroup = releaseGroup;
    return this;
  }

  public RecordingMetadataTag addReleaseGroupItem(TopReleaseGroupsForArtistInnerTagReleaseGroupInner releaseGroupItem) {
    if (this.releaseGroup == null) {
      this.releaseGroup = new ArrayList<>();
    }
    this.releaseGroup.add(releaseGroupItem);
    return this;
  }

  /**
   * Get releaseGroup
   * @return releaseGroup
   */
  @javax.annotation.Nullable
  public List<TopReleaseGroupsForArtistInnerTagReleaseGroupInner> getReleaseGroup() {
    return releaseGroup;
  }

  public void setReleaseGroup(List<TopReleaseGroupsForArtistInnerTagReleaseGroupInner> releaseGroup) {
    this.releaseGroup = releaseGroup;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingMetadataTag recordingMetadataTag = (RecordingMetadataTag) o;
    return Objects.equals(this.artist, recordingMetadataTag.artist) &&
        Objects.equals(this.recording, recordingMetadataTag.recording) &&
        Objects.equals(this.releaseGroup, recordingMetadataTag.releaseGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artist, recording, releaseGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingMetadataTag {\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    releaseGroup: ").append(toIndentedString(releaseGroup)).append("\n");
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
    openapiFields.add("release_group");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecordingMetadataTag
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecordingMetadataTag.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordingMetadataTag is not found in the empty JSON string", RecordingMetadataTag.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecordingMetadataTag.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordingMetadataTag` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("artist") != null && !jsonObj.get("artist").isJsonNull()) {
        JsonArray jsonArrayartist = jsonObj.getAsJsonArray("artist");
        if (jsonArrayartist != null) {
          // ensure the json data is an array
          if (!jsonObj.get("artist").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `artist` to be an array in the JSON string but got `%s`", jsonObj.get("artist").toString()));
          }

          // validate the optional field `artist` (array)
          for (int i = 0; i < jsonArrayartist.size(); i++) {
            TopReleaseGroupsForArtistInnerTagArtistInner.validateJsonElement(jsonArrayartist.get(i));
          };
        }
      }
      if (jsonObj.get("recording") != null && !jsonObj.get("recording").isJsonNull()) {
        JsonArray jsonArrayrecording = jsonObj.getAsJsonArray("recording");
        if (jsonArrayrecording != null) {
          // ensure the json data is an array
          if (!jsonObj.get("recording").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `recording` to be an array in the JSON string but got `%s`", jsonObj.get("recording").toString()));
          }

          // validate the optional field `recording` (array)
          for (int i = 0; i < jsonArrayrecording.size(); i++) {
            TopReleaseGroupsForArtistInnerTagReleaseGroupInner.validateJsonElement(jsonArrayrecording.get(i));
          };
        }
      }
      if (jsonObj.get("release_group") != null && !jsonObj.get("release_group").isJsonNull()) {
        JsonArray jsonArrayreleaseGroup = jsonObj.getAsJsonArray("release_group");
        if (jsonArrayreleaseGroup != null) {
          // ensure the json data is an array
          if (!jsonObj.get("release_group").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `release_group` to be an array in the JSON string but got `%s`", jsonObj.get("release_group").toString()));
          }

          // validate the optional field `release_group` (array)
          for (int i = 0; i < jsonArrayreleaseGroup.size(); i++) {
            TopReleaseGroupsForArtistInnerTagReleaseGroupInner.validateJsonElement(jsonArrayreleaseGroup.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordingMetadataTag.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordingMetadataTag' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordingMetadataTag> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordingMetadataTag.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordingMetadataTag>() {
           @Override
           public void write(JsonWriter out, RecordingMetadataTag value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordingMetadataTag read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecordingMetadataTag given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecordingMetadataTag
   * @throws IOException if the JSON string is invalid with respect to RecordingMetadataTag
   */
  public static RecordingMetadataTag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordingMetadataTag.class);
  }

  /**
   * Convert an instance of RecordingMetadataTag to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

