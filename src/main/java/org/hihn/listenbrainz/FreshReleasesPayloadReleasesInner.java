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
import java.util.Map;
import java.util.UUID;

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
 * FreshReleasesPayloadReleasesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class FreshReleasesPayloadReleasesInner {
  public static final String SERIALIZED_NAME_ARTIST_CREDIT_NAME = "artist_credit_name";
  @SerializedName(SERIALIZED_NAME_ARTIST_CREDIT_NAME)
  private String artistCreditName;

  public static final String SERIALIZED_NAME_ARTIST_MBIDS = "artist_mbids";
  @SerializedName(SERIALIZED_NAME_ARTIST_MBIDS)
  private List<UUID> artistMbids = new ArrayList<>();

  public static final String SERIALIZED_NAME_LISTEN_COUNT = "listen_count";
  @SerializedName(SERIALIZED_NAME_LISTEN_COUNT)
  private Integer listenCount;

  public static final String SERIALIZED_NAME_RELEASE_DATE = "release_date";
  @SerializedName(SERIALIZED_NAME_RELEASE_DATE)
  private String releaseDate;

  public static final String SERIALIZED_NAME_RELEASE_GROUP_MBID = "release_group_mbid";
  @SerializedName(SERIALIZED_NAME_RELEASE_GROUP_MBID)
  private UUID releaseGroupMbid;

  public static final String SERIALIZED_NAME_RELEASE_GROUP_PRIMARY_TYPE = "release_group_primary_type";
  @SerializedName(SERIALIZED_NAME_RELEASE_GROUP_PRIMARY_TYPE)
  private String releaseGroupPrimaryType;

  public static final String SERIALIZED_NAME_RELEASE_MBID = "release_mbid";
  @SerializedName(SERIALIZED_NAME_RELEASE_MBID)
  private UUID releaseMbid;

  public static final String SERIALIZED_NAME_RELEASE_NAME = "release_name";
  @SerializedName(SERIALIZED_NAME_RELEASE_NAME)
  private String releaseName;

  public static final String SERIALIZED_NAME_RELEASE_TAGS = "release_tags";
  @SerializedName(SERIALIZED_NAME_RELEASE_TAGS)
  private List<Map<String, String>> releaseTags = new ArrayList<>();

  public FreshReleasesPayloadReleasesInner() {
  }

  public FreshReleasesPayloadReleasesInner artistCreditName(String artistCreditName) {
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


  public FreshReleasesPayloadReleasesInner artistMbids(List<UUID> artistMbids) {
    this.artistMbids = artistMbids;
    return this;
  }

  public FreshReleasesPayloadReleasesInner addArtistMbidsItem(UUID artistMbidsItem) {
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


  public FreshReleasesPayloadReleasesInner listenCount(Integer listenCount) {
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


  public FreshReleasesPayloadReleasesInner releaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Get releaseDate
   * @return releaseDate
   */
  @javax.annotation.Nullable
  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }


  public FreshReleasesPayloadReleasesInner releaseGroupMbid(UUID releaseGroupMbid) {
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


  public FreshReleasesPayloadReleasesInner releaseGroupPrimaryType(String releaseGroupPrimaryType) {
    this.releaseGroupPrimaryType = releaseGroupPrimaryType;
    return this;
  }

  /**
   * Get releaseGroupPrimaryType
   * @return releaseGroupPrimaryType
   */
  @javax.annotation.Nullable
  public String getReleaseGroupPrimaryType() {
    return releaseGroupPrimaryType;
  }

  public void setReleaseGroupPrimaryType(String releaseGroupPrimaryType) {
    this.releaseGroupPrimaryType = releaseGroupPrimaryType;
  }


  public FreshReleasesPayloadReleasesInner releaseMbid(UUID releaseMbid) {
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


  public FreshReleasesPayloadReleasesInner releaseName(String releaseName) {
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


  public FreshReleasesPayloadReleasesInner releaseTags(List<Map<String, String>> releaseTags) {
    this.releaseTags = releaseTags;
    return this;
  }

  public FreshReleasesPayloadReleasesInner addReleaseTagsItem(Map<String, String> releaseTagsItem) {
    if (this.releaseTags == null) {
      this.releaseTags = new ArrayList<>();
    }
    this.releaseTags.add(releaseTagsItem);
    return this;
  }

  /**
   * Get releaseTags
   * @return releaseTags
   */
  @javax.annotation.Nullable
  public List<Map<String, String>> getReleaseTags() {
    return releaseTags;
  }

  public void setReleaseTags(List<Map<String, String>> releaseTags) {
    this.releaseTags = releaseTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreshReleasesPayloadReleasesInner freshReleasesPayloadReleasesInner = (FreshReleasesPayloadReleasesInner) o;
    return Objects.equals(this.artistCreditName, freshReleasesPayloadReleasesInner.artistCreditName) &&
        Objects.equals(this.artistMbids, freshReleasesPayloadReleasesInner.artistMbids) &&
        Objects.equals(this.listenCount, freshReleasesPayloadReleasesInner.listenCount) &&
        Objects.equals(this.releaseDate, freshReleasesPayloadReleasesInner.releaseDate) &&
        Objects.equals(this.releaseGroupMbid, freshReleasesPayloadReleasesInner.releaseGroupMbid) &&
        Objects.equals(this.releaseGroupPrimaryType, freshReleasesPayloadReleasesInner.releaseGroupPrimaryType) &&
        Objects.equals(this.releaseMbid, freshReleasesPayloadReleasesInner.releaseMbid) &&
        Objects.equals(this.releaseName, freshReleasesPayloadReleasesInner.releaseName) &&
        Objects.equals(this.releaseTags, freshReleasesPayloadReleasesInner.releaseTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistCreditName, artistMbids, listenCount, releaseDate, releaseGroupMbid, releaseGroupPrimaryType, releaseMbid, releaseName, releaseTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreshReleasesPayloadReleasesInner {\n");
    sb.append("    artistCreditName: ").append(toIndentedString(artistCreditName)).append("\n");
    sb.append("    artistMbids: ").append(toIndentedString(artistMbids)).append("\n");
    sb.append("    listenCount: ").append(toIndentedString(listenCount)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    releaseGroupMbid: ").append(toIndentedString(releaseGroupMbid)).append("\n");
    sb.append("    releaseGroupPrimaryType: ").append(toIndentedString(releaseGroupPrimaryType)).append("\n");
    sb.append("    releaseMbid: ").append(toIndentedString(releaseMbid)).append("\n");
    sb.append("    releaseName: ").append(toIndentedString(releaseName)).append("\n");
    sb.append("    releaseTags: ").append(toIndentedString(releaseTags)).append("\n");
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
    openapiFields.add("artist_credit_name");
    openapiFields.add("artist_mbids");
    openapiFields.add("listen_count");
    openapiFields.add("release_date");
    openapiFields.add("release_group_mbid");
    openapiFields.add("release_group_primary_type");
    openapiFields.add("release_mbid");
    openapiFields.add("release_name");
    openapiFields.add("release_tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FreshReleasesPayloadReleasesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FreshReleasesPayloadReleasesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FreshReleasesPayloadReleasesInner is not found in the empty JSON string", FreshReleasesPayloadReleasesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FreshReleasesPayloadReleasesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FreshReleasesPayloadReleasesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("artist_credit_name") != null && !jsonObj.get("artist_credit_name").isJsonNull()) && !jsonObj.get("artist_credit_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_credit_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artist_credit_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("artist_mbids") != null && !jsonObj.get("artist_mbids").isJsonNull() && !jsonObj.get("artist_mbids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_mbids` to be an array in the JSON string but got `%s`", jsonObj.get("artist_mbids").toString()));
      }
      if ((jsonObj.get("release_date") != null && !jsonObj.get("release_date").isJsonNull()) && !jsonObj.get("release_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_date").toString()));
      }
      if ((jsonObj.get("release_group_mbid") != null && !jsonObj.get("release_group_mbid").isJsonNull()) && !jsonObj.get("release_group_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_group_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_group_mbid").toString()));
      }
      if ((jsonObj.get("release_group_primary_type") != null && !jsonObj.get("release_group_primary_type").isJsonNull()) && !jsonObj.get("release_group_primary_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_group_primary_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_group_primary_type").toString()));
      }
      if ((jsonObj.get("release_mbid") != null && !jsonObj.get("release_mbid").isJsonNull()) && !jsonObj.get("release_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_mbid").toString()));
      }
      if ((jsonObj.get("release_name") != null && !jsonObj.get("release_name").isJsonNull()) && !jsonObj.get("release_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("release_tags") != null && !jsonObj.get("release_tags").isJsonNull() && !jsonObj.get("release_tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_tags` to be an array in the JSON string but got `%s`", jsonObj.get("release_tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FreshReleasesPayloadReleasesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FreshReleasesPayloadReleasesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FreshReleasesPayloadReleasesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FreshReleasesPayloadReleasesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FreshReleasesPayloadReleasesInner>() {
           @Override
           public void write(JsonWriter out, FreshReleasesPayloadReleasesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FreshReleasesPayloadReleasesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FreshReleasesPayloadReleasesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FreshReleasesPayloadReleasesInner
   * @throws IOException if the JSON string is invalid with respect to FreshReleasesPayloadReleasesInner
   */
  public static FreshReleasesPayloadReleasesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FreshReleasesPayloadReleasesInner.class);
  }

  /**
   * Convert an instance of FreshReleasesPayloadReleasesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

