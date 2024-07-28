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
 * TopReleaseGroupsForArtistInnerTagReleaseGroupInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T20:56:43.728532+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class TopReleaseGroupsForArtistInnerTagReleaseGroupInner {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_GENRE_MBID = "genre_mbid";
  @SerializedName(SERIALIZED_NAME_GENRE_MBID)
  private UUID genreMbid;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public TopReleaseGroupsForArtistInnerTagReleaseGroupInner() {
  }

  public TopReleaseGroupsForArtistInnerTagReleaseGroupInner count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  @javax.annotation.Nullable
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  public TopReleaseGroupsForArtistInnerTagReleaseGroupInner genreMbid(UUID genreMbid) {
    this.genreMbid = genreMbid;
    return this;
  }

  /**
   * Get genreMbid
   * @return genreMbid
   */
  @javax.annotation.Nullable
  public UUID getGenreMbid() {
    return genreMbid;
  }

  public void setGenreMbid(UUID genreMbid) {
    this.genreMbid = genreMbid;
  }


  public TopReleaseGroupsForArtistInnerTagReleaseGroupInner tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopReleaseGroupsForArtistInnerTagReleaseGroupInner topReleaseGroupsForArtistInnerTagReleaseGroupInner = (TopReleaseGroupsForArtistInnerTagReleaseGroupInner) o;
    return Objects.equals(this.count, topReleaseGroupsForArtistInnerTagReleaseGroupInner.count) &&
        Objects.equals(this.genreMbid, topReleaseGroupsForArtistInnerTagReleaseGroupInner.genreMbid) &&
        Objects.equals(this.tag, topReleaseGroupsForArtistInnerTagReleaseGroupInner.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, genreMbid, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopReleaseGroupsForArtistInnerTagReleaseGroupInner {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    genreMbid: ").append(toIndentedString(genreMbid)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("genre_mbid");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TopReleaseGroupsForArtistInnerTagReleaseGroupInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TopReleaseGroupsForArtistInnerTagReleaseGroupInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TopReleaseGroupsForArtistInnerTagReleaseGroupInner is not found in the empty JSON string", TopReleaseGroupsForArtistInnerTagReleaseGroupInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TopReleaseGroupsForArtistInnerTagReleaseGroupInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TopReleaseGroupsForArtistInnerTagReleaseGroupInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("genre_mbid") != null && !jsonObj.get("genre_mbid").isJsonNull()) && !jsonObj.get("genre_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `genre_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("genre_mbid").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TopReleaseGroupsForArtistInnerTagReleaseGroupInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TopReleaseGroupsForArtistInnerTagReleaseGroupInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TopReleaseGroupsForArtistInnerTagReleaseGroupInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TopReleaseGroupsForArtistInnerTagReleaseGroupInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TopReleaseGroupsForArtistInnerTagReleaseGroupInner>() {
           @Override
           public void write(JsonWriter out, TopReleaseGroupsForArtistInnerTagReleaseGroupInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TopReleaseGroupsForArtistInnerTagReleaseGroupInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TopReleaseGroupsForArtistInnerTagReleaseGroupInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TopReleaseGroupsForArtistInnerTagReleaseGroupInner
   * @throws IOException if the JSON string is invalid with respect to TopReleaseGroupsForArtistInnerTagReleaseGroupInner
   */
  public static TopReleaseGroupsForArtistInnerTagReleaseGroupInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TopReleaseGroupsForArtistInnerTagReleaseGroupInner.class);
  }

  /**
   * Convert an instance of TopReleaseGroupsForArtistInnerTagReleaseGroupInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

