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
 * TopArtistsForUserPayloadArtistsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class TopArtistsForUserPayloadArtistsInner {
  public static final String SERIALIZED_NAME_ARTIST_MBID = "artist_mbid";
  @SerializedName(SERIALIZED_NAME_ARTIST_MBID)
  private UUID artistMbid;

  public static final String SERIALIZED_NAME_ARTIST_NAME = "artist_name";
  @SerializedName(SERIALIZED_NAME_ARTIST_NAME)
  private String artistName;

  public static final String SERIALIZED_NAME_LISTEN_COUNT = "listen_count";
  @SerializedName(SERIALIZED_NAME_LISTEN_COUNT)
  private Integer listenCount;

  public TopArtistsForUserPayloadArtistsInner() {
  }

  public TopArtistsForUserPayloadArtistsInner artistMbid(UUID artistMbid) {
    this.artistMbid = artistMbid;
    return this;
  }

  /**
   * Get artistMbid
   * @return artistMbid
   */
  @javax.annotation.Nullable
  public UUID getArtistMbid() {
    return artistMbid;
  }

  public void setArtistMbid(UUID artistMbid) {
    this.artistMbid = artistMbid;
  }


  public TopArtistsForUserPayloadArtistsInner artistName(String artistName) {
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


  public TopArtistsForUserPayloadArtistsInner listenCount(Integer listenCount) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopArtistsForUserPayloadArtistsInner topArtistsForUserPayloadArtistsInner = (TopArtistsForUserPayloadArtistsInner) o;
    return Objects.equals(this.artistMbid, topArtistsForUserPayloadArtistsInner.artistMbid) &&
        Objects.equals(this.artistName, topArtistsForUserPayloadArtistsInner.artistName) &&
        Objects.equals(this.listenCount, topArtistsForUserPayloadArtistsInner.listenCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistMbid, artistName, listenCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopArtistsForUserPayloadArtistsInner {\n");
    sb.append("    artistMbid: ").append(toIndentedString(artistMbid)).append("\n");
    sb.append("    artistName: ").append(toIndentedString(artistName)).append("\n");
    sb.append("    listenCount: ").append(toIndentedString(listenCount)).append("\n");
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
    openapiFields.add("listen_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TopArtistsForUserPayloadArtistsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TopArtistsForUserPayloadArtistsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TopArtistsForUserPayloadArtistsInner is not found in the empty JSON string", TopArtistsForUserPayloadArtistsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TopArtistsForUserPayloadArtistsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TopArtistsForUserPayloadArtistsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("artist_mbid") != null && !jsonObj.get("artist_mbid").isJsonNull()) && !jsonObj.get("artist_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artist_mbid").toString()));
      }
      if ((jsonObj.get("artist_name") != null && !jsonObj.get("artist_name").isJsonNull()) && !jsonObj.get("artist_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artist_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TopArtistsForUserPayloadArtistsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TopArtistsForUserPayloadArtistsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TopArtistsForUserPayloadArtistsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TopArtistsForUserPayloadArtistsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TopArtistsForUserPayloadArtistsInner>() {
           @Override
           public void write(JsonWriter out, TopArtistsForUserPayloadArtistsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TopArtistsForUserPayloadArtistsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TopArtistsForUserPayloadArtistsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TopArtistsForUserPayloadArtistsInner
   * @throws IOException if the JSON string is invalid with respect to TopArtistsForUserPayloadArtistsInner
   */
  public static TopArtistsForUserPayloadArtistsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TopArtistsForUserPayloadArtistsInner.class);
  }

  /**
   * Convert an instance of TopArtistsForUserPayloadArtistsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

