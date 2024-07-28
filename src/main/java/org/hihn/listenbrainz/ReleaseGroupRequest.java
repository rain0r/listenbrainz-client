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
 * ReleaseGroupRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:54:13.371331+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class ReleaseGroupRequest {
  public static final String SERIALIZED_NAME_RELEASE_GROUP_MBIDS = "release_group_mbids";
  @SerializedName(SERIALIZED_NAME_RELEASE_GROUP_MBIDS)
  private List<UUID> releaseGroupMbids = new ArrayList<>();

  public ReleaseGroupRequest() {
  }

  public ReleaseGroupRequest releaseGroupMbids(List<UUID> releaseGroupMbids) {
    this.releaseGroupMbids = releaseGroupMbids;
    return this;
  }

  public ReleaseGroupRequest addReleaseGroupMbidsItem(UUID releaseGroupMbidsItem) {
    if (this.releaseGroupMbids == null) {
      this.releaseGroupMbids = new ArrayList<>();
    }
    this.releaseGroupMbids.add(releaseGroupMbidsItem);
    return this;
  }

  /**
   * Get releaseGroupMbids
   * @return releaseGroupMbids
   */
  @javax.annotation.Nonnull
  public List<UUID> getReleaseGroupMbids() {
    return releaseGroupMbids;
  }

  public void setReleaseGroupMbids(List<UUID> releaseGroupMbids) {
    this.releaseGroupMbids = releaseGroupMbids;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseGroupRequest releaseGroupRequest = (ReleaseGroupRequest) o;
    return Objects.equals(this.releaseGroupMbids, releaseGroupRequest.releaseGroupMbids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(releaseGroupMbids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseGroupRequest {\n");
    sb.append("    releaseGroupMbids: ").append(toIndentedString(releaseGroupMbids)).append("\n");
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
    openapiFields.add("release_group_mbids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("release_group_mbids");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReleaseGroupRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReleaseGroupRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReleaseGroupRequest is not found in the empty JSON string", ReleaseGroupRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReleaseGroupRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReleaseGroupRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReleaseGroupRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("release_group_mbids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("release_group_mbids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_group_mbids` to be an array in the JSON string but got `%s`", jsonObj.get("release_group_mbids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReleaseGroupRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReleaseGroupRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReleaseGroupRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReleaseGroupRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReleaseGroupRequest>() {
           @Override
           public void write(JsonWriter out, ReleaseGroupRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReleaseGroupRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReleaseGroupRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReleaseGroupRequest
   * @throws IOException if the JSON string is invalid with respect to ReleaseGroupRequest
   */
  public static ReleaseGroupRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReleaseGroupRequest.class);
  }

  /**
   * Convert an instance of ReleaseGroupRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

