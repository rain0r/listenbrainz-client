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
import org.hihn.listenbrainz.ListenersForArtistPayloadListenersInner;

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
 * ListenersForReleaseGroupPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class ListenersForReleaseGroupPayload {
  public static final String SERIALIZED_NAME_ARTIST_MBIDS = "artist_mbids";
  @SerializedName(SERIALIZED_NAME_ARTIST_MBIDS)
  private List<UUID> artistMbids = new ArrayList<>();

  public static final String SERIALIZED_NAME_ARTIST_NAME = "artist_name";
  @SerializedName(SERIALIZED_NAME_ARTIST_NAME)
  private String artistName;

  public static final String SERIALIZED_NAME_CAA_ID = "caa_id";
  @SerializedName(SERIALIZED_NAME_CAA_ID)
  private Integer caaId;

  public static final String SERIALIZED_NAME_CAA_RELEASE_MBID = "caa_release_mbid";
  @SerializedName(SERIALIZED_NAME_CAA_RELEASE_MBID)
  private UUID caaReleaseMbid;

  public static final String SERIALIZED_NAME_FROM_TS = "from_ts";
  @SerializedName(SERIALIZED_NAME_FROM_TS)
  private Integer fromTs;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private Integer lastUpdated;

  public static final String SERIALIZED_NAME_LISTENERS = "listeners";
  @SerializedName(SERIALIZED_NAME_LISTENERS)
  private List<ListenersForArtistPayloadListenersInner> listeners = new ArrayList<>();

  public static final String SERIALIZED_NAME_RELEASE_GROUP_MBID = "release_group_mbid";
  @SerializedName(SERIALIZED_NAME_RELEASE_GROUP_MBID)
  private UUID releaseGroupMbid;

  public static final String SERIALIZED_NAME_RELEASE_GROUP_NAME = "release_group_name";
  @SerializedName(SERIALIZED_NAME_RELEASE_GROUP_NAME)
  private String releaseGroupName;

  public static final String SERIALIZED_NAME_STATS_RANGE = "stats_range";
  @SerializedName(SERIALIZED_NAME_STATS_RANGE)
  private String statsRange;

  public static final String SERIALIZED_NAME_TO_TS = "to_ts";
  @SerializedName(SERIALIZED_NAME_TO_TS)
  private Integer toTs;

  public static final String SERIALIZED_NAME_TOTAL_LISTEN_COUNT = "total_listen_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_LISTEN_COUNT)
  private Integer totalListenCount;

  public static final String SERIALIZED_NAME_TOTAL_USER_COUNT = "total_user_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_USER_COUNT)
  private Integer totalUserCount;

  public ListenersForReleaseGroupPayload() {
  }

  public ListenersForReleaseGroupPayload artistMbids(List<UUID> artistMbids) {
    this.artistMbids = artistMbids;
    return this;
  }

  public ListenersForReleaseGroupPayload addArtistMbidsItem(UUID artistMbidsItem) {
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
  @javax.annotation.Nonnull
  public List<UUID> getArtistMbids() {
    return artistMbids;
  }

  public void setArtistMbids(List<UUID> artistMbids) {
    this.artistMbids = artistMbids;
  }


  public ListenersForReleaseGroupPayload artistName(String artistName) {
    this.artistName = artistName;
    return this;
  }

  /**
   * Get artistName
   * @return artistName
   */
  @javax.annotation.Nonnull
  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }


  public ListenersForReleaseGroupPayload caaId(Integer caaId) {
    this.caaId = caaId;
    return this;
  }

  /**
   * Get caaId
   * @return caaId
   */
  @javax.annotation.Nonnull
  public Integer getCaaId() {
    return caaId;
  }

  public void setCaaId(Integer caaId) {
    this.caaId = caaId;
  }


  public ListenersForReleaseGroupPayload caaReleaseMbid(UUID caaReleaseMbid) {
    this.caaReleaseMbid = caaReleaseMbid;
    return this;
  }

  /**
   * Get caaReleaseMbid
   * @return caaReleaseMbid
   */
  @javax.annotation.Nonnull
  public UUID getCaaReleaseMbid() {
    return caaReleaseMbid;
  }

  public void setCaaReleaseMbid(UUID caaReleaseMbid) {
    this.caaReleaseMbid = caaReleaseMbid;
  }


  public ListenersForReleaseGroupPayload fromTs(Integer fromTs) {
    this.fromTs = fromTs;
    return this;
  }

  /**
   * Get fromTs
   * @return fromTs
   */
  @javax.annotation.Nonnull
  public Integer getFromTs() {
    return fromTs;
  }

  public void setFromTs(Integer fromTs) {
    this.fromTs = fromTs;
  }


  public ListenersForReleaseGroupPayload lastUpdated(Integer lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Get lastUpdated
   * @return lastUpdated
   */
  @javax.annotation.Nonnull
  public Integer getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(Integer lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public ListenersForReleaseGroupPayload listeners(List<ListenersForArtistPayloadListenersInner> listeners) {
    this.listeners = listeners;
    return this;
  }

  public ListenersForReleaseGroupPayload addListenersItem(ListenersForArtistPayloadListenersInner listenersItem) {
    if (this.listeners == null) {
      this.listeners = new ArrayList<>();
    }
    this.listeners.add(listenersItem);
    return this;
  }

  /**
   * Get listeners
   * @return listeners
   */
  @javax.annotation.Nonnull
  public List<ListenersForArtistPayloadListenersInner> getListeners() {
    return listeners;
  }

  public void setListeners(List<ListenersForArtistPayloadListenersInner> listeners) {
    this.listeners = listeners;
  }


  public ListenersForReleaseGroupPayload releaseGroupMbid(UUID releaseGroupMbid) {
    this.releaseGroupMbid = releaseGroupMbid;
    return this;
  }

  /**
   * Get releaseGroupMbid
   * @return releaseGroupMbid
   */
  @javax.annotation.Nonnull
  public UUID getReleaseGroupMbid() {
    return releaseGroupMbid;
  }

  public void setReleaseGroupMbid(UUID releaseGroupMbid) {
    this.releaseGroupMbid = releaseGroupMbid;
  }


  public ListenersForReleaseGroupPayload releaseGroupName(String releaseGroupName) {
    this.releaseGroupName = releaseGroupName;
    return this;
  }

  /**
   * Get releaseGroupName
   * @return releaseGroupName
   */
  @javax.annotation.Nonnull
  public String getReleaseGroupName() {
    return releaseGroupName;
  }

  public void setReleaseGroupName(String releaseGroupName) {
    this.releaseGroupName = releaseGroupName;
  }


  public ListenersForReleaseGroupPayload statsRange(String statsRange) {
    this.statsRange = statsRange;
    return this;
  }

  /**
   * Get statsRange
   * @return statsRange
   */
  @javax.annotation.Nonnull
  public String getStatsRange() {
    return statsRange;
  }

  public void setStatsRange(String statsRange) {
    this.statsRange = statsRange;
  }


  public ListenersForReleaseGroupPayload toTs(Integer toTs) {
    this.toTs = toTs;
    return this;
  }

  /**
   * Get toTs
   * @return toTs
   */
  @javax.annotation.Nonnull
  public Integer getToTs() {
    return toTs;
  }

  public void setToTs(Integer toTs) {
    this.toTs = toTs;
  }


  public ListenersForReleaseGroupPayload totalListenCount(Integer totalListenCount) {
    this.totalListenCount = totalListenCount;
    return this;
  }

  /**
   * Get totalListenCount
   * @return totalListenCount
   */
  @javax.annotation.Nonnull
  public Integer getTotalListenCount() {
    return totalListenCount;
  }

  public void setTotalListenCount(Integer totalListenCount) {
    this.totalListenCount = totalListenCount;
  }


  public ListenersForReleaseGroupPayload totalUserCount(Integer totalUserCount) {
    this.totalUserCount = totalUserCount;
    return this;
  }

  /**
   * Get totalUserCount
   * @return totalUserCount
   */
  @javax.annotation.Nonnull
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
    ListenersForReleaseGroupPayload listenersForReleaseGroupPayload = (ListenersForReleaseGroupPayload) o;
    return Objects.equals(this.artistMbids, listenersForReleaseGroupPayload.artistMbids) &&
        Objects.equals(this.artistName, listenersForReleaseGroupPayload.artistName) &&
        Objects.equals(this.caaId, listenersForReleaseGroupPayload.caaId) &&
        Objects.equals(this.caaReleaseMbid, listenersForReleaseGroupPayload.caaReleaseMbid) &&
        Objects.equals(this.fromTs, listenersForReleaseGroupPayload.fromTs) &&
        Objects.equals(this.lastUpdated, listenersForReleaseGroupPayload.lastUpdated) &&
        Objects.equals(this.listeners, listenersForReleaseGroupPayload.listeners) &&
        Objects.equals(this.releaseGroupMbid, listenersForReleaseGroupPayload.releaseGroupMbid) &&
        Objects.equals(this.releaseGroupName, listenersForReleaseGroupPayload.releaseGroupName) &&
        Objects.equals(this.statsRange, listenersForReleaseGroupPayload.statsRange) &&
        Objects.equals(this.toTs, listenersForReleaseGroupPayload.toTs) &&
        Objects.equals(this.totalListenCount, listenersForReleaseGroupPayload.totalListenCount) &&
        Objects.equals(this.totalUserCount, listenersForReleaseGroupPayload.totalUserCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistMbids, artistName, caaId, caaReleaseMbid, fromTs, lastUpdated, listeners, releaseGroupMbid, releaseGroupName, statsRange, toTs, totalListenCount, totalUserCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListenersForReleaseGroupPayload {\n");
    sb.append("    artistMbids: ").append(toIndentedString(artistMbids)).append("\n");
    sb.append("    artistName: ").append(toIndentedString(artistName)).append("\n");
    sb.append("    caaId: ").append(toIndentedString(caaId)).append("\n");
    sb.append("    caaReleaseMbid: ").append(toIndentedString(caaReleaseMbid)).append("\n");
    sb.append("    fromTs: ").append(toIndentedString(fromTs)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
    sb.append("    releaseGroupMbid: ").append(toIndentedString(releaseGroupMbid)).append("\n");
    sb.append("    releaseGroupName: ").append(toIndentedString(releaseGroupName)).append("\n");
    sb.append("    statsRange: ").append(toIndentedString(statsRange)).append("\n");
    sb.append("    toTs: ").append(toIndentedString(toTs)).append("\n");
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
    openapiFields.add("artist_mbids");
    openapiFields.add("artist_name");
    openapiFields.add("caa_id");
    openapiFields.add("caa_release_mbid");
    openapiFields.add("from_ts");
    openapiFields.add("last_updated");
    openapiFields.add("listeners");
    openapiFields.add("release_group_mbid");
    openapiFields.add("release_group_name");
    openapiFields.add("stats_range");
    openapiFields.add("to_ts");
    openapiFields.add("total_listen_count");
    openapiFields.add("total_user_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("artist_mbids");
    openapiRequiredFields.add("artist_name");
    openapiRequiredFields.add("caa_id");
    openapiRequiredFields.add("caa_release_mbid");
    openapiRequiredFields.add("from_ts");
    openapiRequiredFields.add("last_updated");
    openapiRequiredFields.add("listeners");
    openapiRequiredFields.add("release_group_mbid");
    openapiRequiredFields.add("release_group_name");
    openapiRequiredFields.add("stats_range");
    openapiRequiredFields.add("to_ts");
    openapiRequiredFields.add("total_listen_count");
    openapiRequiredFields.add("total_user_count");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListenersForReleaseGroupPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListenersForReleaseGroupPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListenersForReleaseGroupPayload is not found in the empty JSON string", ListenersForReleaseGroupPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListenersForReleaseGroupPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListenersForReleaseGroupPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListenersForReleaseGroupPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("artist_mbids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("artist_mbids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_mbids` to be an array in the JSON string but got `%s`", jsonObj.get("artist_mbids").toString()));
      }
      if (!jsonObj.get("artist_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artist_name").toString()));
      }
      if (!jsonObj.get("caa_release_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caa_release_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caa_release_mbid").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("listeners").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `listeners` to be an array in the JSON string but got `%s`", jsonObj.get("listeners").toString()));
      }

      JsonArray jsonArraylisteners = jsonObj.getAsJsonArray("listeners");
      // validate the required field `listeners` (array)
      for (int i = 0; i < jsonArraylisteners.size(); i++) {
        ListenersForArtistPayloadListenersInner.validateJsonElement(jsonArraylisteners.get(i));
      };
      if (!jsonObj.get("release_group_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_group_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_group_mbid").toString()));
      }
      if (!jsonObj.get("release_group_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_group_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_group_name").toString()));
      }
      if (!jsonObj.get("stats_range").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stats_range` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stats_range").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListenersForReleaseGroupPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListenersForReleaseGroupPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListenersForReleaseGroupPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListenersForReleaseGroupPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<ListenersForReleaseGroupPayload>() {
           @Override
           public void write(JsonWriter out, ListenersForReleaseGroupPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListenersForReleaseGroupPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListenersForReleaseGroupPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListenersForReleaseGroupPayload
   * @throws IOException if the JSON string is invalid with respect to ListenersForReleaseGroupPayload
   */
  public static ListenersForReleaseGroupPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListenersForReleaseGroupPayload.class);
  }

  /**
   * Convert an instance of ListenersForReleaseGroupPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

