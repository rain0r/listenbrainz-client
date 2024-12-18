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
import org.hihn.listenbrainz.ArtistMapForUserPayloadArtistMapInner;

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
 * ArtistMapForUserPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class ArtistMapForUserPayload {
  public static final String SERIALIZED_NAME_ARTIST_MAP = "artist_map";
  @SerializedName(SERIALIZED_NAME_ARTIST_MAP)
  private List<ArtistMapForUserPayloadArtistMapInner> artistMap = new ArrayList<>();

  public static final String SERIALIZED_NAME_FROM_TS = "from_ts";
  @SerializedName(SERIALIZED_NAME_FROM_TS)
  private Integer fromTs;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private Integer lastUpdated;

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private String range;

  public static final String SERIALIZED_NAME_TO_TS = "to_ts";
  @SerializedName(SERIALIZED_NAME_TO_TS)
  private Integer toTs;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public ArtistMapForUserPayload() {
  }

  public ArtistMapForUserPayload artistMap(List<ArtistMapForUserPayloadArtistMapInner> artistMap) {
    this.artistMap = artistMap;
    return this;
  }

  public ArtistMapForUserPayload addArtistMapItem(ArtistMapForUserPayloadArtistMapInner artistMapItem) {
    if (this.artistMap == null) {
      this.artistMap = new ArrayList<>();
    }
    this.artistMap.add(artistMapItem);
    return this;
  }

  /**
   * Get artistMap
   * @return artistMap
   */
  @javax.annotation.Nonnull
  public List<ArtistMapForUserPayloadArtistMapInner> getArtistMap() {
    return artistMap;
  }

  public void setArtistMap(List<ArtistMapForUserPayloadArtistMapInner> artistMap) {
    this.artistMap = artistMap;
  }


  public ArtistMapForUserPayload fromTs(Integer fromTs) {
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


  public ArtistMapForUserPayload lastUpdated(Integer lastUpdated) {
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


  public ArtistMapForUserPayload range(String range) {
    this.range = range;
    return this;
  }

  /**
   * Get range
   * @return range
   */
  @javax.annotation.Nonnull
  public String getRange() {
    return range;
  }

  public void setRange(String range) {
    this.range = range;
  }


  public ArtistMapForUserPayload toTs(Integer toTs) {
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


  public ArtistMapForUserPayload userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nonnull
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtistMapForUserPayload artistMapForUserPayload = (ArtistMapForUserPayload) o;
    return Objects.equals(this.artistMap, artistMapForUserPayload.artistMap) &&
        Objects.equals(this.fromTs, artistMapForUserPayload.fromTs) &&
        Objects.equals(this.lastUpdated, artistMapForUserPayload.lastUpdated) &&
        Objects.equals(this.range, artistMapForUserPayload.range) &&
        Objects.equals(this.toTs, artistMapForUserPayload.toTs) &&
        Objects.equals(this.userId, artistMapForUserPayload.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistMap, fromTs, lastUpdated, range, toTs, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtistMapForUserPayload {\n");
    sb.append("    artistMap: ").append(toIndentedString(artistMap)).append("\n");
    sb.append("    fromTs: ").append(toIndentedString(fromTs)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    toTs: ").append(toIndentedString(toTs)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("artist_map");
    openapiFields.add("from_ts");
    openapiFields.add("last_updated");
    openapiFields.add("range");
    openapiFields.add("to_ts");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("artist_map");
    openapiRequiredFields.add("from_ts");
    openapiRequiredFields.add("last_updated");
    openapiRequiredFields.add("range");
    openapiRequiredFields.add("to_ts");
    openapiRequiredFields.add("user_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ArtistMapForUserPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ArtistMapForUserPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArtistMapForUserPayload is not found in the empty JSON string", ArtistMapForUserPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ArtistMapForUserPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ArtistMapForUserPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ArtistMapForUserPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("artist_map").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_map` to be an array in the JSON string but got `%s`", jsonObj.get("artist_map").toString()));
      }

      JsonArray jsonArrayartistMap = jsonObj.getAsJsonArray("artist_map");
      // validate the required field `artist_map` (array)
      for (int i = 0; i < jsonArrayartistMap.size(); i++) {
        ArtistMapForUserPayloadArtistMapInner.validateJsonElement(jsonArrayartistMap.get(i));
      };
      if (!jsonObj.get("range").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `range` to be a primitive type in the JSON string but got `%s`", jsonObj.get("range").toString()));
      }
      if (!jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArtistMapForUserPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArtistMapForUserPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArtistMapForUserPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArtistMapForUserPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<ArtistMapForUserPayload>() {
           @Override
           public void write(JsonWriter out, ArtistMapForUserPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ArtistMapForUserPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ArtistMapForUserPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ArtistMapForUserPayload
   * @throws IOException if the JSON string is invalid with respect to ArtistMapForUserPayload
   */
  public static ArtistMapForUserPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArtistMapForUserPayload.class);
  }

  /**
   * Convert an instance of ArtistMapForUserPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

