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
 * ListenersForArtistPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:48:15.256271+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class ListenersForArtistPayload {
  public static final String SERIALIZED_NAME_ARTIST_MBID = "artist_mbid";
  @SerializedName(SERIALIZED_NAME_ARTIST_MBID)
  private UUID artistMbid;

  public static final String SERIALIZED_NAME_ARTIST_NAME = "artist_name";
  @SerializedName(SERIALIZED_NAME_ARTIST_NAME)
  private String artistName;

  public static final String SERIALIZED_NAME_FROM_TS = "from_ts";
  @SerializedName(SERIALIZED_NAME_FROM_TS)
  private Integer fromTs;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private Integer lastUpdated;

  public static final String SERIALIZED_NAME_LISTENERS = "listeners";
  @SerializedName(SERIALIZED_NAME_LISTENERS)
  private List<ListenersForArtistPayloadListenersInner> listeners = new ArrayList<>();

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

  public ListenersForArtistPayload() {
  }

  public ListenersForArtistPayload artistMbid(UUID artistMbid) {
    this.artistMbid = artistMbid;
    return this;
  }

  /**
   * Get artistMbid
   * @return artistMbid
   */
  @javax.annotation.Nonnull
  public UUID getArtistMbid() {
    return artistMbid;
  }

  public void setArtistMbid(UUID artistMbid) {
    this.artistMbid = artistMbid;
  }


  public ListenersForArtistPayload artistName(String artistName) {
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


  public ListenersForArtistPayload fromTs(Integer fromTs) {
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


  public ListenersForArtistPayload lastUpdated(Integer lastUpdated) {
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


  public ListenersForArtistPayload listeners(List<ListenersForArtistPayloadListenersInner> listeners) {
    this.listeners = listeners;
    return this;
  }

  public ListenersForArtistPayload addListenersItem(ListenersForArtistPayloadListenersInner listenersItem) {
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


  public ListenersForArtistPayload statsRange(String statsRange) {
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


  public ListenersForArtistPayload toTs(Integer toTs) {
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


  public ListenersForArtistPayload totalListenCount(Integer totalListenCount) {
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


  public ListenersForArtistPayload totalUserCount(Integer totalUserCount) {
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
    ListenersForArtistPayload listenersForArtistPayload = (ListenersForArtistPayload) o;
    return Objects.equals(this.artistMbid, listenersForArtistPayload.artistMbid) &&
        Objects.equals(this.artistName, listenersForArtistPayload.artistName) &&
        Objects.equals(this.fromTs, listenersForArtistPayload.fromTs) &&
        Objects.equals(this.lastUpdated, listenersForArtistPayload.lastUpdated) &&
        Objects.equals(this.listeners, listenersForArtistPayload.listeners) &&
        Objects.equals(this.statsRange, listenersForArtistPayload.statsRange) &&
        Objects.equals(this.toTs, listenersForArtistPayload.toTs) &&
        Objects.equals(this.totalListenCount, listenersForArtistPayload.totalListenCount) &&
        Objects.equals(this.totalUserCount, listenersForArtistPayload.totalUserCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistMbid, artistName, fromTs, lastUpdated, listeners, statsRange, toTs, totalListenCount, totalUserCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListenersForArtistPayload {\n");
    sb.append("    artistMbid: ").append(toIndentedString(artistMbid)).append("\n");
    sb.append("    artistName: ").append(toIndentedString(artistName)).append("\n");
    sb.append("    fromTs: ").append(toIndentedString(fromTs)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
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
    openapiFields.add("artist_mbid");
    openapiFields.add("artist_name");
    openapiFields.add("from_ts");
    openapiFields.add("last_updated");
    openapiFields.add("listeners");
    openapiFields.add("stats_range");
    openapiFields.add("to_ts");
    openapiFields.add("total_listen_count");
    openapiFields.add("total_user_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("artist_mbid");
    openapiRequiredFields.add("artist_name");
    openapiRequiredFields.add("from_ts");
    openapiRequiredFields.add("last_updated");
    openapiRequiredFields.add("listeners");
    openapiRequiredFields.add("stats_range");
    openapiRequiredFields.add("to_ts");
    openapiRequiredFields.add("total_listen_count");
    openapiRequiredFields.add("total_user_count");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListenersForArtistPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListenersForArtistPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListenersForArtistPayload is not found in the empty JSON string", ListenersForArtistPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListenersForArtistPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListenersForArtistPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListenersForArtistPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("artist_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artist_mbid").toString()));
      }
      if (!jsonObj.get("artist_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artist_name").toString()));
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
      if (!jsonObj.get("stats_range").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stats_range` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stats_range").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListenersForArtistPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListenersForArtistPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListenersForArtistPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListenersForArtistPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<ListenersForArtistPayload>() {
           @Override
           public void write(JsonWriter out, ListenersForArtistPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListenersForArtistPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListenersForArtistPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListenersForArtistPayload
   * @throws IOException if the JSON string is invalid with respect to ListenersForArtistPayload
   */
  public static ListenersForArtistPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListenersForArtistPayload.class);
  }

  /**
   * Convert an instance of ListenersForArtistPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

