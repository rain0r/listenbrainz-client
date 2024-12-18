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
 * YearInMusicForUserPayloadDataTopGenresInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class YearInMusicForUserPayloadDataTopGenresInner {
  public static final String SERIALIZED_NAME_GENRE = "genre";
  @SerializedName(SERIALIZED_NAME_GENRE)
  private String genre;

  public static final String SERIALIZED_NAME_GENRE_COUNT = "genre_count";
  @SerializedName(SERIALIZED_NAME_GENRE_COUNT)
  private Integer genreCount;

  public static final String SERIALIZED_NAME_GENRE_COUNT_PERCENT = "genre_count_percent";
  @SerializedName(SERIALIZED_NAME_GENRE_COUNT_PERCENT)
  private Integer genreCountPercent;

  public YearInMusicForUserPayloadDataTopGenresInner() {
  }

  public YearInMusicForUserPayloadDataTopGenresInner genre(String genre) {
    this.genre = genre;
    return this;
  }

  /**
   * Get genre
   * @return genre
   */
  @javax.annotation.Nullable
  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }


  public YearInMusicForUserPayloadDataTopGenresInner genreCount(Integer genreCount) {
    this.genreCount = genreCount;
    return this;
  }

  /**
   * Get genreCount
   * @return genreCount
   */
  @javax.annotation.Nullable
  public Integer getGenreCount() {
    return genreCount;
  }

  public void setGenreCount(Integer genreCount) {
    this.genreCount = genreCount;
  }


  public YearInMusicForUserPayloadDataTopGenresInner genreCountPercent(Integer genreCountPercent) {
    this.genreCountPercent = genreCountPercent;
    return this;
  }

  /**
   * Get genreCountPercent
   * @return genreCountPercent
   */
  @javax.annotation.Nullable
  public Integer getGenreCountPercent() {
    return genreCountPercent;
  }

  public void setGenreCountPercent(Integer genreCountPercent) {
    this.genreCountPercent = genreCountPercent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YearInMusicForUserPayloadDataTopGenresInner yearInMusicForUserPayloadDataTopGenresInner = (YearInMusicForUserPayloadDataTopGenresInner) o;
    return Objects.equals(this.genre, yearInMusicForUserPayloadDataTopGenresInner.genre) &&
        Objects.equals(this.genreCount, yearInMusicForUserPayloadDataTopGenresInner.genreCount) &&
        Objects.equals(this.genreCountPercent, yearInMusicForUserPayloadDataTopGenresInner.genreCountPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genre, genreCount, genreCountPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YearInMusicForUserPayloadDataTopGenresInner {\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
    sb.append("    genreCount: ").append(toIndentedString(genreCount)).append("\n");
    sb.append("    genreCountPercent: ").append(toIndentedString(genreCountPercent)).append("\n");
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
    openapiFields.add("genre");
    openapiFields.add("genre_count");
    openapiFields.add("genre_count_percent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to YearInMusicForUserPayloadDataTopGenresInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!YearInMusicForUserPayloadDataTopGenresInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in YearInMusicForUserPayloadDataTopGenresInner is not found in the empty JSON string", YearInMusicForUserPayloadDataTopGenresInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!YearInMusicForUserPayloadDataTopGenresInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `YearInMusicForUserPayloadDataTopGenresInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("genre") != null && !jsonObj.get("genre").isJsonNull()) && !jsonObj.get("genre").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `genre` to be a primitive type in the JSON string but got `%s`", jsonObj.get("genre").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!YearInMusicForUserPayloadDataTopGenresInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'YearInMusicForUserPayloadDataTopGenresInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<YearInMusicForUserPayloadDataTopGenresInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(YearInMusicForUserPayloadDataTopGenresInner.class));

       return (TypeAdapter<T>) new TypeAdapter<YearInMusicForUserPayloadDataTopGenresInner>() {
           @Override
           public void write(JsonWriter out, YearInMusicForUserPayloadDataTopGenresInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public YearInMusicForUserPayloadDataTopGenresInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of YearInMusicForUserPayloadDataTopGenresInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of YearInMusicForUserPayloadDataTopGenresInner
   * @throws IOException if the JSON string is invalid with respect to YearInMusicForUserPayloadDataTopGenresInner
   */
  public static YearInMusicForUserPayloadDataTopGenresInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, YearInMusicForUserPayloadDataTopGenresInner.class);
  }

  /**
   * Convert an instance of YearInMusicForUserPayloadDataTopGenresInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

