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
import org.hihn.listenbrainz.TopReleasesForUserPayloadReleasesInnerArtistsInner;

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
 * TopRecordingsForUserPayloadRecordingsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class TopRecordingsForUserPayloadRecordingsInner {
  public static final String SERIALIZED_NAME_ARTIST_MBIDS = "artist_mbids";
  @SerializedName(SERIALIZED_NAME_ARTIST_MBIDS)
  private List<UUID> artistMbids = new ArrayList<>();

  public static final String SERIALIZED_NAME_ARTIST_NAME = "artist_name";
  @SerializedName(SERIALIZED_NAME_ARTIST_NAME)
  private String artistName;

  public static final String SERIALIZED_NAME_ARTISTS = "artists";
  @SerializedName(SERIALIZED_NAME_ARTISTS)
  private List<TopReleasesForUserPayloadReleasesInnerArtistsInner> artists = new ArrayList<>();

  public static final String SERIALIZED_NAME_CAA_ID = "caa_id";
  @SerializedName(SERIALIZED_NAME_CAA_ID)
  private Integer caaId;

  public static final String SERIALIZED_NAME_CAA_RELEASE_MBID = "caa_release_mbid";
  @SerializedName(SERIALIZED_NAME_CAA_RELEASE_MBID)
  private UUID caaReleaseMbid;

  public static final String SERIALIZED_NAME_LISTEN_COUNT = "listen_count";
  @SerializedName(SERIALIZED_NAME_LISTEN_COUNT)
  private Integer listenCount;

  public static final String SERIALIZED_NAME_RECORDING_MBID = "recording_mbid";
  @SerializedName(SERIALIZED_NAME_RECORDING_MBID)
  private UUID recordingMbid;

  public static final String SERIALIZED_NAME_RELEASE_MBID = "release_mbid";
  @SerializedName(SERIALIZED_NAME_RELEASE_MBID)
  private UUID releaseMbid;

  public static final String SERIALIZED_NAME_RELEASE_NAME = "release_name";
  @SerializedName(SERIALIZED_NAME_RELEASE_NAME)
  private String releaseName;

  public static final String SERIALIZED_NAME_TRACK_NAME = "track_name";
  @SerializedName(SERIALIZED_NAME_TRACK_NAME)
  private String trackName;

  public TopRecordingsForUserPayloadRecordingsInner() {
  }

  public TopRecordingsForUserPayloadRecordingsInner artistMbids(List<UUID> artistMbids) {
    this.artistMbids = artistMbids;
    return this;
  }

  public TopRecordingsForUserPayloadRecordingsInner addArtistMbidsItem(UUID artistMbidsItem) {
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
  @javax.annotation.Nullable
  public List<UUID> getArtistMbids() {
    return artistMbids;
  }

  public void setArtistMbids(List<UUID> artistMbids) {
    this.artistMbids = artistMbids;
  }


  public TopRecordingsForUserPayloadRecordingsInner artistName(String artistName) {
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


  public TopRecordingsForUserPayloadRecordingsInner artists(List<TopReleasesForUserPayloadReleasesInnerArtistsInner> artists) {
    this.artists = artists;
    return this;
  }

  public TopRecordingsForUserPayloadRecordingsInner addArtistsItem(TopReleasesForUserPayloadReleasesInnerArtistsInner artistsItem) {
    if (this.artists == null) {
      this.artists = new ArrayList<>();
    }
    this.artists.add(artistsItem);
    return this;
  }

  /**
   * Get artists
   * @return artists
   */
  @javax.annotation.Nullable
  public List<TopReleasesForUserPayloadReleasesInnerArtistsInner> getArtists() {
    return artists;
  }

  public void setArtists(List<TopReleasesForUserPayloadReleasesInnerArtistsInner> artists) {
    this.artists = artists;
  }


  public TopRecordingsForUserPayloadRecordingsInner caaId(Integer caaId) {
    this.caaId = caaId;
    return this;
  }

  /**
   * Get caaId
   * @return caaId
   */
  @javax.annotation.Nullable
  public Integer getCaaId() {
    return caaId;
  }

  public void setCaaId(Integer caaId) {
    this.caaId = caaId;
  }


  public TopRecordingsForUserPayloadRecordingsInner caaReleaseMbid(UUID caaReleaseMbid) {
    this.caaReleaseMbid = caaReleaseMbid;
    return this;
  }

  /**
   * Get caaReleaseMbid
   * @return caaReleaseMbid
   */
  @javax.annotation.Nullable
  public UUID getCaaReleaseMbid() {
    return caaReleaseMbid;
  }

  public void setCaaReleaseMbid(UUID caaReleaseMbid) {
    this.caaReleaseMbid = caaReleaseMbid;
  }


  public TopRecordingsForUserPayloadRecordingsInner listenCount(Integer listenCount) {
    this.listenCount = listenCount;
    return this;
  }

  /**
   * Get listenCount
   * @return listenCount
   */
  @javax.annotation.Nullable
  public Integer getListenCount() {
    return listenCount;
  }

  public void setListenCount(Integer listenCount) {
    this.listenCount = listenCount;
  }


  public TopRecordingsForUserPayloadRecordingsInner recordingMbid(UUID recordingMbid) {
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


  public TopRecordingsForUserPayloadRecordingsInner releaseMbid(UUID releaseMbid) {
    this.releaseMbid = releaseMbid;
    return this;
  }

  /**
   * Get releaseMbid
   * @return releaseMbid
   */
  @javax.annotation.Nullable
  public UUID getReleaseMbid() {
    return releaseMbid;
  }

  public void setReleaseMbid(UUID releaseMbid) {
    this.releaseMbid = releaseMbid;
  }


  public TopRecordingsForUserPayloadRecordingsInner releaseName(String releaseName) {
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


  public TopRecordingsForUserPayloadRecordingsInner trackName(String trackName) {
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
    TopRecordingsForUserPayloadRecordingsInner topRecordingsForUserPayloadRecordingsInner = (TopRecordingsForUserPayloadRecordingsInner) o;
    return Objects.equals(this.artistMbids, topRecordingsForUserPayloadRecordingsInner.artistMbids) &&
        Objects.equals(this.artistName, topRecordingsForUserPayloadRecordingsInner.artistName) &&
        Objects.equals(this.artists, topRecordingsForUserPayloadRecordingsInner.artists) &&
        Objects.equals(this.caaId, topRecordingsForUserPayloadRecordingsInner.caaId) &&
        Objects.equals(this.caaReleaseMbid, topRecordingsForUserPayloadRecordingsInner.caaReleaseMbid) &&
        Objects.equals(this.listenCount, topRecordingsForUserPayloadRecordingsInner.listenCount) &&
        Objects.equals(this.recordingMbid, topRecordingsForUserPayloadRecordingsInner.recordingMbid) &&
        Objects.equals(this.releaseMbid, topRecordingsForUserPayloadRecordingsInner.releaseMbid) &&
        Objects.equals(this.releaseName, topRecordingsForUserPayloadRecordingsInner.releaseName) &&
        Objects.equals(this.trackName, topRecordingsForUserPayloadRecordingsInner.trackName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistMbids, artistName, artists, caaId, caaReleaseMbid, listenCount, recordingMbid, releaseMbid, releaseName, trackName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopRecordingsForUserPayloadRecordingsInner {\n");
    sb.append("    artistMbids: ").append(toIndentedString(artistMbids)).append("\n");
    sb.append("    artistName: ").append(toIndentedString(artistName)).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("    caaId: ").append(toIndentedString(caaId)).append("\n");
    sb.append("    caaReleaseMbid: ").append(toIndentedString(caaReleaseMbid)).append("\n");
    sb.append("    listenCount: ").append(toIndentedString(listenCount)).append("\n");
    sb.append("    recordingMbid: ").append(toIndentedString(recordingMbid)).append("\n");
    sb.append("    releaseMbid: ").append(toIndentedString(releaseMbid)).append("\n");
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
    openapiFields.add("artist_mbids");
    openapiFields.add("artist_name");
    openapiFields.add("artists");
    openapiFields.add("caa_id");
    openapiFields.add("caa_release_mbid");
    openapiFields.add("listen_count");
    openapiFields.add("recording_mbid");
    openapiFields.add("release_mbid");
    openapiFields.add("release_name");
    openapiFields.add("track_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TopRecordingsForUserPayloadRecordingsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TopRecordingsForUserPayloadRecordingsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TopRecordingsForUserPayloadRecordingsInner is not found in the empty JSON string", TopRecordingsForUserPayloadRecordingsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TopRecordingsForUserPayloadRecordingsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TopRecordingsForUserPayloadRecordingsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("artist_mbids") != null && !jsonObj.get("artist_mbids").isJsonNull() && !jsonObj.get("artist_mbids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_mbids` to be an array in the JSON string but got `%s`", jsonObj.get("artist_mbids").toString()));
      }
      if ((jsonObj.get("artist_name") != null && !jsonObj.get("artist_name").isJsonNull()) && !jsonObj.get("artist_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artist_name").toString()));
      }
      if (jsonObj.get("artists") != null && !jsonObj.get("artists").isJsonNull()) {
        JsonArray jsonArrayartists = jsonObj.getAsJsonArray("artists");
        if (jsonArrayartists != null) {
          // ensure the json data is an array
          if (!jsonObj.get("artists").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `artists` to be an array in the JSON string but got `%s`", jsonObj.get("artists").toString()));
          }

          // validate the optional field `artists` (array)
          for (int i = 0; i < jsonArrayartists.size(); i++) {
            TopReleasesForUserPayloadReleasesInnerArtistsInner.validateJsonElement(jsonArrayartists.get(i));
          };
        }
      }
      if ((jsonObj.get("caa_release_mbid") != null && !jsonObj.get("caa_release_mbid").isJsonNull()) && !jsonObj.get("caa_release_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caa_release_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caa_release_mbid").toString()));
      }
      if ((jsonObj.get("recording_mbid") != null && !jsonObj.get("recording_mbid").isJsonNull()) && !jsonObj.get("recording_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recording_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recording_mbid").toString()));
      }
      if ((jsonObj.get("release_mbid") != null && !jsonObj.get("release_mbid").isJsonNull()) && !jsonObj.get("release_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_mbid").toString()));
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
       if (!TopRecordingsForUserPayloadRecordingsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TopRecordingsForUserPayloadRecordingsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TopRecordingsForUserPayloadRecordingsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TopRecordingsForUserPayloadRecordingsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TopRecordingsForUserPayloadRecordingsInner>() {
           @Override
           public void write(JsonWriter out, TopRecordingsForUserPayloadRecordingsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TopRecordingsForUserPayloadRecordingsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TopRecordingsForUserPayloadRecordingsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TopRecordingsForUserPayloadRecordingsInner
   * @throws IOException if the JSON string is invalid with respect to TopRecordingsForUserPayloadRecordingsInner
   */
  public static TopRecordingsForUserPayloadRecordingsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TopRecordingsForUserPayloadRecordingsInner.class);
  }

  /**
   * Convert an instance of TopRecordingsForUserPayloadRecordingsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

