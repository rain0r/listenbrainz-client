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
 * ListeningActivityForUserPayloadListeningActivityInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:54:13.371331+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class ListeningActivityForUserPayloadListeningActivityInner {
  public static final String SERIALIZED_NAME_FROM_TS = "from_ts";
  @SerializedName(SERIALIZED_NAME_FROM_TS)
  private Integer fromTs;

  public static final String SERIALIZED_NAME_LISTEN_COUNT = "listen_count";
  @SerializedName(SERIALIZED_NAME_LISTEN_COUNT)
  private Integer listenCount;

  public static final String SERIALIZED_NAME_TIME_RANGE = "time_range";
  @SerializedName(SERIALIZED_NAME_TIME_RANGE)
  private String timeRange;

  public static final String SERIALIZED_NAME_TO_TS = "to_ts";
  @SerializedName(SERIALIZED_NAME_TO_TS)
  private Integer toTs;

  public ListeningActivityForUserPayloadListeningActivityInner() {
  }

  public ListeningActivityForUserPayloadListeningActivityInner fromTs(Integer fromTs) {
    this.fromTs = fromTs;
    return this;
  }

  /**
   * Get fromTs
   * @return fromTs
   */
  @javax.annotation.Nullable
  public Integer getFromTs() {
    return fromTs;
  }

  public void setFromTs(Integer fromTs) {
    this.fromTs = fromTs;
  }


  public ListeningActivityForUserPayloadListeningActivityInner listenCount(Integer listenCount) {
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


  public ListeningActivityForUserPayloadListeningActivityInner timeRange(String timeRange) {
    this.timeRange = timeRange;
    return this;
  }

  /**
   * Get timeRange
   * @return timeRange
   */
  @javax.annotation.Nullable
  public String getTimeRange() {
    return timeRange;
  }

  public void setTimeRange(String timeRange) {
    this.timeRange = timeRange;
  }


  public ListeningActivityForUserPayloadListeningActivityInner toTs(Integer toTs) {
    this.toTs = toTs;
    return this;
  }

  /**
   * Get toTs
   * @return toTs
   */
  @javax.annotation.Nullable
  public Integer getToTs() {
    return toTs;
  }

  public void setToTs(Integer toTs) {
    this.toTs = toTs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListeningActivityForUserPayloadListeningActivityInner listeningActivityForUserPayloadListeningActivityInner = (ListeningActivityForUserPayloadListeningActivityInner) o;
    return Objects.equals(this.fromTs, listeningActivityForUserPayloadListeningActivityInner.fromTs) &&
        Objects.equals(this.listenCount, listeningActivityForUserPayloadListeningActivityInner.listenCount) &&
        Objects.equals(this.timeRange, listeningActivityForUserPayloadListeningActivityInner.timeRange) &&
        Objects.equals(this.toTs, listeningActivityForUserPayloadListeningActivityInner.toTs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromTs, listenCount, timeRange, toTs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListeningActivityForUserPayloadListeningActivityInner {\n");
    sb.append("    fromTs: ").append(toIndentedString(fromTs)).append("\n");
    sb.append("    listenCount: ").append(toIndentedString(listenCount)).append("\n");
    sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
    sb.append("    toTs: ").append(toIndentedString(toTs)).append("\n");
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
    openapiFields.add("from_ts");
    openapiFields.add("listen_count");
    openapiFields.add("time_range");
    openapiFields.add("to_ts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListeningActivityForUserPayloadListeningActivityInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListeningActivityForUserPayloadListeningActivityInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListeningActivityForUserPayloadListeningActivityInner is not found in the empty JSON string", ListeningActivityForUserPayloadListeningActivityInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListeningActivityForUserPayloadListeningActivityInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListeningActivityForUserPayloadListeningActivityInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("time_range") != null && !jsonObj.get("time_range").isJsonNull()) && !jsonObj.get("time_range").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_range` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_range").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListeningActivityForUserPayloadListeningActivityInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListeningActivityForUserPayloadListeningActivityInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListeningActivityForUserPayloadListeningActivityInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListeningActivityForUserPayloadListeningActivityInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListeningActivityForUserPayloadListeningActivityInner>() {
           @Override
           public void write(JsonWriter out, ListeningActivityForUserPayloadListeningActivityInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListeningActivityForUserPayloadListeningActivityInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListeningActivityForUserPayloadListeningActivityInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListeningActivityForUserPayloadListeningActivityInner
   * @throws IOException if the JSON string is invalid with respect to ListeningActivityForUserPayloadListeningActivityInner
   */
  public static ListeningActivityForUserPayloadListeningActivityInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListeningActivityForUserPayloadListeningActivityInner.class);
  }

  /**
   * Convert an instance of ListeningActivityForUserPayloadListeningActivityInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

