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
 * PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:00:27.345003+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata {
  public static final String SERIALIZED_NAME_CAA_RELEASE_MBID = "caa_release_mbid";
  @SerializedName(SERIALIZED_NAME_CAA_RELEASE_MBID)
  private UUID caaReleaseMbid;

  public static final String SERIALIZED_NAME_CAA_ID = "caa_id";
  @SerializedName(SERIALIZED_NAME_CAA_ID)
  private Integer caaId;

  public static final String SERIALIZED_NAME_ARTISTS = "artists";
  @SerializedName(SERIALIZED_NAME_ARTISTS)
  private List<TopReleasesForUserPayloadReleasesInnerArtistsInner> artists = new ArrayList<>();

  public PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata() {
  }

  public PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata caaReleaseMbid(UUID caaReleaseMbid) {
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


  public PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata caaId(Integer caaId) {
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


  public PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata artists(List<TopReleasesForUserPayloadReleasesInnerArtistsInner> artists) {
    this.artists = artists;
    return this;
  }

  public PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata addArtistsItem(TopReleasesForUserPayloadReleasesInnerArtistsInner artistsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata playlistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata = (PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata) o;
    return Objects.equals(this.caaReleaseMbid, playlistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata.caaReleaseMbid) &&
        Objects.equals(this.caaId, playlistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata.caaId) &&
        Objects.equals(this.artists, playlistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata.artists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caaReleaseMbid, caaId, artists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata {\n");
    sb.append("    caaReleaseMbid: ").append(toIndentedString(caaReleaseMbid)).append("\n");
    sb.append("    caaId: ").append(toIndentedString(caaId)).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
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
    openapiFields.add("caa_release_mbid");
    openapiFields.add("caa_id");
    openapiFields.add("artists");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata is not found in the empty JSON string", PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("caa_release_mbid") != null && !jsonObj.get("caa_release_mbid").isJsonNull()) && !jsonObj.get("caa_release_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caa_release_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caa_release_mbid").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata>() {
           @Override
           public void write(JsonWriter out, PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata
   * @throws IOException if the JSON string is invalid with respect to PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata
   */
  public static PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata.class);
  }

  /**
   * Convert an instance of PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

