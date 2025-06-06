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
import org.hihn.listenbrainz.FreshReleasesPayloadReleasesInner;

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
 * FreshReleasesPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class FreshReleasesPayload {
  public static final String SERIALIZED_NAME_RELEASES = "releases";
  @SerializedName(SERIALIZED_NAME_RELEASES)
  private List<FreshReleasesPayloadReleasesInner> releases = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public FreshReleasesPayload() {
  }

  public FreshReleasesPayload releases(List<FreshReleasesPayloadReleasesInner> releases) {
    this.releases = releases;
    return this;
  }

  public FreshReleasesPayload addReleasesItem(FreshReleasesPayloadReleasesInner releasesItem) {
    if (this.releases == null) {
      this.releases = new ArrayList<>();
    }
    this.releases.add(releasesItem);
    return this;
  }

  /**
   * Get releases
   * @return releases
   */
  @javax.annotation.Nonnull
  public List<FreshReleasesPayloadReleasesInner> getReleases() {
    return releases;
  }

  public void setReleases(List<FreshReleasesPayloadReleasesInner> releases) {
    this.releases = releases;
  }


  public FreshReleasesPayload totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount
   * @return totalCount
   */
  @javax.annotation.Nonnull
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreshReleasesPayload freshReleasesPayload = (FreshReleasesPayload) o;
    return Objects.equals(this.releases, freshReleasesPayload.releases) &&
        Objects.equals(this.totalCount, freshReleasesPayload.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(releases, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreshReleasesPayload {\n");
    sb.append("    releases: ").append(toIndentedString(releases)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
    openapiFields.add("releases");
    openapiFields.add("total_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("releases");
    openapiRequiredFields.add("total_count");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FreshReleasesPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FreshReleasesPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FreshReleasesPayload is not found in the empty JSON string", FreshReleasesPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FreshReleasesPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FreshReleasesPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FreshReleasesPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("releases").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `releases` to be an array in the JSON string but got `%s`", jsonObj.get("releases").toString()));
      }

      JsonArray jsonArrayreleases = jsonObj.getAsJsonArray("releases");
      // validate the required field `releases` (array)
      for (int i = 0; i < jsonArrayreleases.size(); i++) {
        FreshReleasesPayloadReleasesInner.validateJsonElement(jsonArrayreleases.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FreshReleasesPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FreshReleasesPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FreshReleasesPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FreshReleasesPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<FreshReleasesPayload>() {
           @Override
           public void write(JsonWriter out, FreshReleasesPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FreshReleasesPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FreshReleasesPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FreshReleasesPayload
   * @throws IOException if the JSON string is invalid with respect to FreshReleasesPayload
   */
  public static FreshReleasesPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FreshReleasesPayload.class);
  }

  /**
   * Convert an instance of FreshReleasesPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

