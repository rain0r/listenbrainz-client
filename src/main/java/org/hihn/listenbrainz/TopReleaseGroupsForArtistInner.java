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
import java.util.UUID;
import org.hihn.listenbrainz.TopRecordingsForArtistInnerReleaseColor;
import org.hihn.listenbrainz.TopReleaseGroupsForArtistInnerArtist;
import org.hihn.listenbrainz.TopReleaseGroupsForArtistInnerRelease;
import org.hihn.listenbrainz.TopReleaseGroupsForArtistInnerReleaseGroup;
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
 * TopReleaseGroupsForArtistInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class TopReleaseGroupsForArtistInner {
  public static final String SERIALIZED_NAME_ARTIST = "artist";
  @SerializedName(SERIALIZED_NAME_ARTIST)
  private TopReleaseGroupsForArtistInnerArtist artist;

  public static final String SERIALIZED_NAME_RELEASE = "release";
  @SerializedName(SERIALIZED_NAME_RELEASE)
  private TopReleaseGroupsForArtistInnerRelease release;

  public static final String SERIALIZED_NAME_RELEASE_COLOR = "release_color";
  @SerializedName(SERIALIZED_NAME_RELEASE_COLOR)
  private TopRecordingsForArtistInnerReleaseColor releaseColor;

  public static final String SERIALIZED_NAME_RELEASE_GROUP = "release_group";
  @SerializedName(SERIALIZED_NAME_RELEASE_GROUP)
  private TopReleaseGroupsForArtistInnerReleaseGroup releaseGroup;

  public static final String SERIALIZED_NAME_RELEASE_GROUP_MBID = "release_group_mbid";
  @SerializedName(SERIALIZED_NAME_RELEASE_GROUP_MBID)
  private UUID releaseGroupMbid;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private TopReleaseGroupsForArtistInnerTag tag;

  public static final String SERIALIZED_NAME_TOTAL_LISTEN_COUNT = "total_listen_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_LISTEN_COUNT)
  private Integer totalListenCount;

  public static final String SERIALIZED_NAME_TOTAL_USER_COUNT = "total_user_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_USER_COUNT)
  private Integer totalUserCount;

  public TopReleaseGroupsForArtistInner() {
  }

  public TopReleaseGroupsForArtistInner artist(TopReleaseGroupsForArtistInnerArtist artist) {
    this.artist = artist;
    return this;
  }

  /**
   * Get artist
   * @return artist
   */
  @javax.annotation.Nullable
  public TopReleaseGroupsForArtistInnerArtist getArtist() {
    return artist;
  }

  public void setArtist(TopReleaseGroupsForArtistInnerArtist artist) {
    this.artist = artist;
  }


  public TopReleaseGroupsForArtistInner release(TopReleaseGroupsForArtistInnerRelease release) {
    this.release = release;
    return this;
  }

  /**
   * Get release
   * @return release
   */
  @javax.annotation.Nullable
  public TopReleaseGroupsForArtistInnerRelease getRelease() {
    return release;
  }

  public void setRelease(TopReleaseGroupsForArtistInnerRelease release) {
    this.release = release;
  }


  public TopReleaseGroupsForArtistInner releaseColor(TopRecordingsForArtistInnerReleaseColor releaseColor) {
    this.releaseColor = releaseColor;
    return this;
  }

  /**
   * Get releaseColor
   * @return releaseColor
   */
  @javax.annotation.Nullable
  public TopRecordingsForArtistInnerReleaseColor getReleaseColor() {
    return releaseColor;
  }

  public void setReleaseColor(TopRecordingsForArtistInnerReleaseColor releaseColor) {
    this.releaseColor = releaseColor;
  }


  public TopReleaseGroupsForArtistInner releaseGroup(TopReleaseGroupsForArtistInnerReleaseGroup releaseGroup) {
    this.releaseGroup = releaseGroup;
    return this;
  }

  /**
   * Get releaseGroup
   * @return releaseGroup
   */
  @javax.annotation.Nullable
  public TopReleaseGroupsForArtistInnerReleaseGroup getReleaseGroup() {
    return releaseGroup;
  }

  public void setReleaseGroup(TopReleaseGroupsForArtistInnerReleaseGroup releaseGroup) {
    this.releaseGroup = releaseGroup;
  }


  public TopReleaseGroupsForArtistInner releaseGroupMbid(UUID releaseGroupMbid) {
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


  public TopReleaseGroupsForArtistInner tag(TopReleaseGroupsForArtistInnerTag tag) {
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


  public TopReleaseGroupsForArtistInner totalListenCount(Integer totalListenCount) {
    this.totalListenCount = totalListenCount;
    return this;
  }

  /**
   * Get totalListenCount
   * @return totalListenCount
   */
  @javax.annotation.Nullable
  public Integer getTotalListenCount() {
    return totalListenCount;
  }

  public void setTotalListenCount(Integer totalListenCount) {
    this.totalListenCount = totalListenCount;
  }


  public TopReleaseGroupsForArtistInner totalUserCount(Integer totalUserCount) {
    this.totalUserCount = totalUserCount;
    return this;
  }

  /**
   * Get totalUserCount
   * @return totalUserCount
   */
  @javax.annotation.Nullable
  public Integer getTotalUserCount() {
    return totalUserCount;
  }

  public void setTotalUserCount(Integer totalUserCount) {
    this.totalUserCount = totalUserCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopReleaseGroupsForArtistInner topReleaseGroupsForArtistInner = (TopReleaseGroupsForArtistInner) o;
    return Objects.equals(this.artist, topReleaseGroupsForArtistInner.artist) &&
        Objects.equals(this.release, topReleaseGroupsForArtistInner.release) &&
        Objects.equals(this.releaseColor, topReleaseGroupsForArtistInner.releaseColor) &&
        Objects.equals(this.releaseGroup, topReleaseGroupsForArtistInner.releaseGroup) &&
        Objects.equals(this.releaseGroupMbid, topReleaseGroupsForArtistInner.releaseGroupMbid) &&
        Objects.equals(this.tag, topReleaseGroupsForArtistInner.tag) &&
        Objects.equals(this.totalListenCount, topReleaseGroupsForArtistInner.totalListenCount) &&
        Objects.equals(this.totalUserCount, topReleaseGroupsForArtistInner.totalUserCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artist, release, releaseColor, releaseGroup, releaseGroupMbid, tag, totalListenCount, totalUserCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopReleaseGroupsForArtistInner {\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    releaseColor: ").append(toIndentedString(releaseColor)).append("\n");
    sb.append("    releaseGroup: ").append(toIndentedString(releaseGroup)).append("\n");
    sb.append("    releaseGroupMbid: ").append(toIndentedString(releaseGroupMbid)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    totalListenCount: ").append(toIndentedString(totalListenCount)).append("\n");
    sb.append("    totalUserCount: ").append(toIndentedString(totalUserCount)).append("\n");
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
    openapiFields.add("release");
    openapiFields.add("release_color");
    openapiFields.add("release_group");
    openapiFields.add("release_group_mbid");
    openapiFields.add("tag");
    openapiFields.add("total_listen_count");
    openapiFields.add("total_user_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TopReleaseGroupsForArtistInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TopReleaseGroupsForArtistInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TopReleaseGroupsForArtistInner is not found in the empty JSON string", TopReleaseGroupsForArtistInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TopReleaseGroupsForArtistInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TopReleaseGroupsForArtistInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `artist`
      if (jsonObj.get("artist") != null && !jsonObj.get("artist").isJsonNull()) {
        TopReleaseGroupsForArtistInnerArtist.validateJsonElement(jsonObj.get("artist"));
      }
      // validate the optional field `release`
      if (jsonObj.get("release") != null && !jsonObj.get("release").isJsonNull()) {
        TopReleaseGroupsForArtistInnerRelease.validateJsonElement(jsonObj.get("release"));
      }
      // validate the optional field `release_color`
      if (jsonObj.get("release_color") != null && !jsonObj.get("release_color").isJsonNull()) {
        TopRecordingsForArtistInnerReleaseColor.validateJsonElement(jsonObj.get("release_color"));
      }
      // validate the optional field `release_group`
      if (jsonObj.get("release_group") != null && !jsonObj.get("release_group").isJsonNull()) {
        TopReleaseGroupsForArtistInnerReleaseGroup.validateJsonElement(jsonObj.get("release_group"));
      }
      if ((jsonObj.get("release_group_mbid") != null && !jsonObj.get("release_group_mbid").isJsonNull()) && !jsonObj.get("release_group_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_group_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_group_mbid").toString()));
      }
      // validate the optional field `tag`
      if (jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) {
        TopReleaseGroupsForArtistInnerTag.validateJsonElement(jsonObj.get("tag"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TopReleaseGroupsForArtistInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TopReleaseGroupsForArtistInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TopReleaseGroupsForArtistInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TopReleaseGroupsForArtistInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TopReleaseGroupsForArtistInner>() {
           @Override
           public void write(JsonWriter out, TopReleaseGroupsForArtistInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TopReleaseGroupsForArtistInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TopReleaseGroupsForArtistInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TopReleaseGroupsForArtistInner
   * @throws IOException if the JSON string is invalid with respect to TopReleaseGroupsForArtistInner
   */
  public static TopReleaseGroupsForArtistInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TopReleaseGroupsForArtistInner.class);
  }

  /**
   * Convert an instance of TopReleaseGroupsForArtistInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

