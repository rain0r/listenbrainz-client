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
 * YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner {
  public static final String SERIALIZED_NAME_ARTIST_CREDIT_MBIDS = "artist_credit_mbids";
  @SerializedName(SERIALIZED_NAME_ARTIST_CREDIT_MBIDS)
  private List<UUID> artistCreditMbids = new ArrayList<>();

  public static final String SERIALIZED_NAME_ARTIST_CREDIT_NAME = "artist_credit_name";
  @SerializedName(SERIALIZED_NAME_ARTIST_CREDIT_NAME)
  private String artistCreditName;

  public static final String SERIALIZED_NAME_ARTISTS = "artists";
  @SerializedName(SERIALIZED_NAME_ARTISTS)
  private List<TopReleasesForUserPayloadReleasesInnerArtistsInner> artists = new ArrayList<>();

  public static final String SERIALIZED_NAME_CAA_ID = "caa_id";
  @SerializedName(SERIALIZED_NAME_CAA_ID)
  private Integer caaId;

  public static final String SERIALIZED_NAME_CAA_RELEASE_MBID = "caa_release_mbid";
  @SerializedName(SERIALIZED_NAME_CAA_RELEASE_MBID)
  private UUID caaReleaseMbid;

  public static final String SERIALIZED_NAME_RELEASE_GROUP_MBID = "release_group_mbid";
  @SerializedName(SERIALIZED_NAME_RELEASE_GROUP_MBID)
  private UUID releaseGroupMbid;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner() {
  }

  public YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner artistCreditMbids(List<UUID> artistCreditMbids) {
    this.artistCreditMbids = artistCreditMbids;
    return this;
  }

  public YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner addArtistCreditMbidsItem(UUID artistCreditMbidsItem) {
    if (this.artistCreditMbids == null) {
      this.artistCreditMbids = new ArrayList<>();
    }
    this.artistCreditMbids.add(artistCreditMbidsItem);
    return this;
  }

  /**
   * Get artistCreditMbids
   * @return artistCreditMbids
   */
  @javax.annotation.Nullable
  public List<UUID> getArtistCreditMbids() {
    return artistCreditMbids;
  }

  public void setArtistCreditMbids(List<UUID> artistCreditMbids) {
    this.artistCreditMbids = artistCreditMbids;
  }


  public YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner artistCreditName(String artistCreditName) {
    this.artistCreditName = artistCreditName;
    return this;
  }

  /**
   * Get artistCreditName
   * @return artistCreditName
   */
  @javax.annotation.Nullable
  public String getArtistCreditName() {
    return artistCreditName;
  }

  public void setArtistCreditName(String artistCreditName) {
    this.artistCreditName = artistCreditName;
  }


  public YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner artists(List<TopReleasesForUserPayloadReleasesInnerArtistsInner> artists) {
    this.artists = artists;
    return this;
  }

  public YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner addArtistsItem(TopReleasesForUserPayloadReleasesInnerArtistsInner artistsItem) {
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


  public YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner caaId(Integer caaId) {
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


  public YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner caaReleaseMbid(UUID caaReleaseMbid) {
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


  public YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner releaseGroupMbid(UUID releaseGroupMbid) {
    this.releaseGroupMbid = releaseGroupMbid;
    return this;
  }

  /**
   * Get releaseGroupMbid
   * @return releaseGroupMbid
   */
  @javax.annotation.Nullable
  public UUID getReleaseGroupMbid() {
    return releaseGroupMbid;
  }

  public void setReleaseGroupMbid(UUID releaseGroupMbid) {
    this.releaseGroupMbid = releaseGroupMbid;
  }


  public YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner yearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner = (YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner) o;
    return Objects.equals(this.artistCreditMbids, yearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner.artistCreditMbids) &&
        Objects.equals(this.artistCreditName, yearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner.artistCreditName) &&
        Objects.equals(this.artists, yearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner.artists) &&
        Objects.equals(this.caaId, yearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner.caaId) &&
        Objects.equals(this.caaReleaseMbid, yearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner.caaReleaseMbid) &&
        Objects.equals(this.releaseGroupMbid, yearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner.releaseGroupMbid) &&
        Objects.equals(this.title, yearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistCreditMbids, artistCreditName, artists, caaId, caaReleaseMbid, releaseGroupMbid, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner {\n");
    sb.append("    artistCreditMbids: ").append(toIndentedString(artistCreditMbids)).append("\n");
    sb.append("    artistCreditName: ").append(toIndentedString(artistCreditName)).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("    caaId: ").append(toIndentedString(caaId)).append("\n");
    sb.append("    caaReleaseMbid: ").append(toIndentedString(caaReleaseMbid)).append("\n");
    sb.append("    releaseGroupMbid: ").append(toIndentedString(releaseGroupMbid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("artist_credit_mbids");
    openapiFields.add("artist_credit_name");
    openapiFields.add("artists");
    openapiFields.add("caa_id");
    openapiFields.add("caa_release_mbid");
    openapiFields.add("release_group_mbid");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner is not found in the empty JSON string", YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("artist_credit_mbids") != null && !jsonObj.get("artist_credit_mbids").isJsonNull() && !jsonObj.get("artist_credit_mbids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_credit_mbids` to be an array in the JSON string but got `%s`", jsonObj.get("artist_credit_mbids").toString()));
      }
      if ((jsonObj.get("artist_credit_name") != null && !jsonObj.get("artist_credit_name").isJsonNull()) && !jsonObj.get("artist_credit_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_credit_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artist_credit_name").toString()));
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
      if ((jsonObj.get("release_group_mbid") != null && !jsonObj.get("release_group_mbid").isJsonNull()) && !jsonObj.get("release_group_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_group_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_group_mbid").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner>() {
           @Override
           public void write(JsonWriter out, YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner
   * @throws IOException if the JSON string is invalid with respect to YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner
   */
  public static YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner.class);
  }

  /**
   * Convert an instance of YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

