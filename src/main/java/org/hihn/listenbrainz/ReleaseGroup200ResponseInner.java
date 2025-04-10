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
 * ReleaseGroup200ResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ReleaseGroup200ResponseInner {
  public static final String SERIALIZED_NAME_RELEASE_GROUP_MBID = "release_group_mbid";
  @SerializedName(SERIALIZED_NAME_RELEASE_GROUP_MBID)
  private UUID releaseGroupMbid;

  public static final String SERIALIZED_NAME_TOTAL_LISTEN_COUNT = "total_listen_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_LISTEN_COUNT)
  private Integer totalListenCount;

  public static final String SERIALIZED_NAME_TOTAL_USER_COUNT = "total_user_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_USER_COUNT)
  private Integer totalUserCount;

  public ReleaseGroup200ResponseInner() {
  }

  public ReleaseGroup200ResponseInner releaseGroupMbid(UUID releaseGroupMbid) {
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


  public ReleaseGroup200ResponseInner totalListenCount(Integer totalListenCount) {
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


  public ReleaseGroup200ResponseInner totalUserCount(Integer totalUserCount) {
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
    ReleaseGroup200ResponseInner releaseGroup200ResponseInner = (ReleaseGroup200ResponseInner) o;
    return Objects.equals(this.releaseGroupMbid, releaseGroup200ResponseInner.releaseGroupMbid) &&
        Objects.equals(this.totalListenCount, releaseGroup200ResponseInner.totalListenCount) &&
        Objects.equals(this.totalUserCount, releaseGroup200ResponseInner.totalUserCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(releaseGroupMbid, totalListenCount, totalUserCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseGroup200ResponseInner {\n");
    sb.append("    releaseGroupMbid: ").append(toIndentedString(releaseGroupMbid)).append("\n");
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
    openapiFields.add("release_group_mbid");
    openapiFields.add("total_listen_count");
    openapiFields.add("total_user_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReleaseGroup200ResponseInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReleaseGroup200ResponseInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReleaseGroup200ResponseInner is not found in the empty JSON string", ReleaseGroup200ResponseInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReleaseGroup200ResponseInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReleaseGroup200ResponseInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("release_group_mbid") != null && !jsonObj.get("release_group_mbid").isJsonNull()) && !jsonObj.get("release_group_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_group_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_group_mbid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReleaseGroup200ResponseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReleaseGroup200ResponseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReleaseGroup200ResponseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReleaseGroup200ResponseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReleaseGroup200ResponseInner>() {
           @Override
           public void write(JsonWriter out, ReleaseGroup200ResponseInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReleaseGroup200ResponseInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReleaseGroup200ResponseInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReleaseGroup200ResponseInner
   * @throws IOException if the JSON string is invalid with respect to ReleaseGroup200ResponseInner
   */
  public static ReleaseGroup200ResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReleaseGroup200ResponseInner.class);
  }

  /**
   * Convert an instance of ReleaseGroup200ResponseInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

