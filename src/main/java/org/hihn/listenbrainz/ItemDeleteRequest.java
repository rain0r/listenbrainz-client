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
 * ItemDeleteRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class ItemDeleteRequest {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public ItemDeleteRequest() {
  }

  public ItemDeleteRequest index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
   */
  @javax.annotation.Nullable
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }


  public ItemDeleteRequest count(Integer count) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDeleteRequest itemDeleteRequest = (ItemDeleteRequest) o;
    return Objects.equals(this.index, itemDeleteRequest.index) &&
        Objects.equals(this.count, itemDeleteRequest.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDeleteRequest {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
    openapiFields.add("index");
    openapiFields.add("count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ItemDeleteRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ItemDeleteRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemDeleteRequest is not found in the empty JSON string", ItemDeleteRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ItemDeleteRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemDeleteRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemDeleteRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemDeleteRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemDeleteRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemDeleteRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemDeleteRequest>() {
           @Override
           public void write(JsonWriter out, ItemDeleteRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemDeleteRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ItemDeleteRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ItemDeleteRequest
   * @throws IOException if the JSON string is invalid with respect to ItemDeleteRequest
   */
  public static ItemDeleteRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemDeleteRequest.class);
  }

  /**
   * Convert an instance of ItemDeleteRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

