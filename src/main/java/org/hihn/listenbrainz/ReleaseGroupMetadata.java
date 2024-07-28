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
import org.hihn.listenbrainz.ReleaseGroupMetadataArtist;
import org.hihn.listenbrainz.ReleaseGroupMetadataReleaseGroup;
import org.hihn.listenbrainz.TopReleaseGroupsForArtistInnerTag;

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
 * ReleaseGroupMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T20:56:43.728532+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class ReleaseGroupMetadata {
  public static final String SERIALIZED_NAME_RELEASE_GROUP = "release_group";
  @SerializedName(SERIALIZED_NAME_RELEASE_GROUP)
  private ReleaseGroupMetadataReleaseGroup releaseGroup;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private TopReleaseGroupsForArtistInnerTag tag;

  public static final String SERIALIZED_NAME_ARTIST = "artist";
  @SerializedName(SERIALIZED_NAME_ARTIST)
  private ReleaseGroupMetadataArtist artist;

  public static final String SERIALIZED_NAME_RELEASE = "release";
  @SerializedName(SERIALIZED_NAME_RELEASE)
  private ReleaseGroupMetadataReleaseGroup release;

  public ReleaseGroupMetadata() {
  }

  public ReleaseGroupMetadata releaseGroup(ReleaseGroupMetadataReleaseGroup releaseGroup) {
    this.releaseGroup = releaseGroup;
    return this;
  }

  /**
   * Get releaseGroup
   * @return releaseGroup
   */
  @javax.annotation.Nullable
  public ReleaseGroupMetadataReleaseGroup getReleaseGroup() {
    return releaseGroup;
  }

  public void setReleaseGroup(ReleaseGroupMetadataReleaseGroup releaseGroup) {
    this.releaseGroup = releaseGroup;
  }


  public ReleaseGroupMetadata tag(TopReleaseGroupsForArtistInnerTag tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
   */
  @javax.annotation.Nullable
  public TopReleaseGroupsForArtistInnerTag getTag() {
    return tag;
  }

  public void setTag(TopReleaseGroupsForArtistInnerTag tag) {
    this.tag = tag;
  }


  public ReleaseGroupMetadata artist(ReleaseGroupMetadataArtist artist) {
    this.artist = artist;
    return this;
  }

  /**
   * Get artist
   * @return artist
   */
  @javax.annotation.Nullable
  public ReleaseGroupMetadataArtist getArtist() {
    return artist;
  }

  public void setArtist(ReleaseGroupMetadataArtist artist) {
    this.artist = artist;
  }


  public ReleaseGroupMetadata release(ReleaseGroupMetadataReleaseGroup release) {
    this.release = release;
    return this;
  }

  /**
   * Get release
   * @return release
   */
  @javax.annotation.Nullable
  public ReleaseGroupMetadataReleaseGroup getRelease() {
    return release;
  }

  public void setRelease(ReleaseGroupMetadataReleaseGroup release) {
    this.release = release;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseGroupMetadata releaseGroupMetadata = (ReleaseGroupMetadata) o;
    return Objects.equals(this.releaseGroup, releaseGroupMetadata.releaseGroup) &&
        Objects.equals(this.tag, releaseGroupMetadata.tag) &&
        Objects.equals(this.artist, releaseGroupMetadata.artist) &&
        Objects.equals(this.release, releaseGroupMetadata.release);
  }

  @Override
  public int hashCode() {
    return Objects.hash(releaseGroup, tag, artist, release);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseGroupMetadata {\n");
    sb.append("    releaseGroup: ").append(toIndentedString(releaseGroup)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
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
    openapiFields.add("release_group");
    openapiFields.add("tag");
    openapiFields.add("artist");
    openapiFields.add("release");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReleaseGroupMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReleaseGroupMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReleaseGroupMetadata is not found in the empty JSON string", ReleaseGroupMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReleaseGroupMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReleaseGroupMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `release_group`
      if (jsonObj.get("release_group") != null && !jsonObj.get("release_group").isJsonNull()) {
        ReleaseGroupMetadataReleaseGroup.validateJsonElement(jsonObj.get("release_group"));
      }
      // validate the optional field `tag`
      if (jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) {
        TopReleaseGroupsForArtistInnerTag.validateJsonElement(jsonObj.get("tag"));
      }
      // validate the optional field `artist`
      if (jsonObj.get("artist") != null && !jsonObj.get("artist").isJsonNull()) {
        ReleaseGroupMetadataArtist.validateJsonElement(jsonObj.get("artist"));
      }
      // validate the optional field `release`
      if (jsonObj.get("release") != null && !jsonObj.get("release").isJsonNull()) {
        ReleaseGroupMetadataReleaseGroup.validateJsonElement(jsonObj.get("release"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReleaseGroupMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReleaseGroupMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReleaseGroupMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReleaseGroupMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<ReleaseGroupMetadata>() {
           @Override
           public void write(JsonWriter out, ReleaseGroupMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReleaseGroupMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReleaseGroupMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReleaseGroupMetadata
   * @throws IOException if the JSON string is invalid with respect to ReleaseGroupMetadata
   */
  public static ReleaseGroupMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReleaseGroupMetadata.class);
  }

  /**
   * Convert an instance of ReleaseGroupMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

