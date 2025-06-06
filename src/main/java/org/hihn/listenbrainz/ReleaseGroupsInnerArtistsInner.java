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
 * ReleaseGroupsInnerArtistsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class ReleaseGroupsInnerArtistsInner {
  public static final String SERIALIZED_NAME_ARTIST_MBID = "artist_mbid";
  @SerializedName(SERIALIZED_NAME_ARTIST_MBID)
  private UUID artistMbid;

  public static final String SERIALIZED_NAME_ARTIST_NAME = "artist_name";
  @SerializedName(SERIALIZED_NAME_ARTIST_NAME)
  private String artistName;

  public static final String SERIALIZED_NAME_ARTIST_CREDIT_NAME = "artist_credit_name";
  @SerializedName(SERIALIZED_NAME_ARTIST_CREDIT_NAME)
  private String artistCreditName;

  public static final String SERIALIZED_NAME_LISTEN_COUNT = "listen_count";
  @SerializedName(SERIALIZED_NAME_LISTEN_COUNT)
  private Integer listenCount;

  public static final String SERIALIZED_NAME_JOIN_PHRASE = "join_phrase";
  @SerializedName(SERIALIZED_NAME_JOIN_PHRASE)
  private String joinPhrase;

  public ReleaseGroupsInnerArtistsInner() {
  }

  public ReleaseGroupsInnerArtistsInner artistMbid(UUID artistMbid) {
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


  public ReleaseGroupsInnerArtistsInner artistName(String artistName) {
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


  public ReleaseGroupsInnerArtistsInner artistCreditName(String artistCreditName) {
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


  public ReleaseGroupsInnerArtistsInner listenCount(Integer listenCount) {
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


  public ReleaseGroupsInnerArtistsInner joinPhrase(String joinPhrase) {
    this.joinPhrase = joinPhrase;
    return this;
  }

  /**
   * Get joinPhrase
   * @return joinPhrase
   */
  @javax.annotation.Nullable
  public String getJoinPhrase() {
    return joinPhrase;
  }

  public void setJoinPhrase(String joinPhrase) {
    this.joinPhrase = joinPhrase;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseGroupsInnerArtistsInner releaseGroupsInnerArtistsInner = (ReleaseGroupsInnerArtistsInner) o;
    return Objects.equals(this.artistMbid, releaseGroupsInnerArtistsInner.artistMbid) &&
        Objects.equals(this.artistName, releaseGroupsInnerArtistsInner.artistName) &&
        Objects.equals(this.artistCreditName, releaseGroupsInnerArtistsInner.artistCreditName) &&
        Objects.equals(this.listenCount, releaseGroupsInnerArtistsInner.listenCount) &&
        Objects.equals(this.joinPhrase, releaseGroupsInnerArtistsInner.joinPhrase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistMbid, artistName, artistCreditName, listenCount, joinPhrase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseGroupsInnerArtistsInner {\n");
    sb.append("    artistMbid: ").append(toIndentedString(artistMbid)).append("\n");
    sb.append("    artistName: ").append(toIndentedString(artistName)).append("\n");
    sb.append("    artistCreditName: ").append(toIndentedString(artistCreditName)).append("\n");
    sb.append("    listenCount: ").append(toIndentedString(listenCount)).append("\n");
    sb.append("    joinPhrase: ").append(toIndentedString(joinPhrase)).append("\n");
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
    openapiFields.add("artist_credit_name");
    openapiFields.add("listen_count");
    openapiFields.add("join_phrase");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReleaseGroupsInnerArtistsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReleaseGroupsInnerArtistsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReleaseGroupsInnerArtistsInner is not found in the empty JSON string", ReleaseGroupsInnerArtistsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReleaseGroupsInnerArtistsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReleaseGroupsInnerArtistsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("artist_mbid") != null && !jsonObj.get("artist_mbid").isJsonNull()) && !jsonObj.get("artist_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artist_mbid").toString()));
      }
      if ((jsonObj.get("artist_name") != null && !jsonObj.get("artist_name").isJsonNull()) && !jsonObj.get("artist_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artist_name").toString()));
      }
      if ((jsonObj.get("artist_credit_name") != null && !jsonObj.get("artist_credit_name").isJsonNull()) && !jsonObj.get("artist_credit_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_credit_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artist_credit_name").toString()));
      }
      if ((jsonObj.get("join_phrase") != null && !jsonObj.get("join_phrase").isJsonNull()) && !jsonObj.get("join_phrase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `join_phrase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("join_phrase").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReleaseGroupsInnerArtistsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReleaseGroupsInnerArtistsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReleaseGroupsInnerArtistsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReleaseGroupsInnerArtistsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReleaseGroupsInnerArtistsInner>() {
           @Override
           public void write(JsonWriter out, ReleaseGroupsInnerArtistsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReleaseGroupsInnerArtistsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReleaseGroupsInnerArtistsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReleaseGroupsInnerArtistsInner
   * @throws IOException if the JSON string is invalid with respect to ReleaseGroupsInnerArtistsInner
   */
  public static ReleaseGroupsInnerArtistsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReleaseGroupsInnerArtistsInner.class);
  }

  /**
   * Convert an instance of ReleaseGroupsInnerArtistsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

