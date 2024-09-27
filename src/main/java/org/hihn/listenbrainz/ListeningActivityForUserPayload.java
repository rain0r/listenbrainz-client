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
import org.hihn.listenbrainz.ListeningActivityForUserPayloadListeningActivityInner;

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
 * ListeningActivityForUserPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class ListeningActivityForUserPayload {
  public static final String SERIALIZED_NAME_FROM_TS = "from_ts";
  @SerializedName(SERIALIZED_NAME_FROM_TS)
  private Integer fromTs;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private Integer lastUpdated;

  public static final String SERIALIZED_NAME_LISTENING_ACTIVITY = "listening_activity";
  @SerializedName(SERIALIZED_NAME_LISTENING_ACTIVITY)
  private List<ListeningActivityForUserPayloadListeningActivityInner> listeningActivity = new ArrayList<>();

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private String range;

  public static final String SERIALIZED_NAME_TO_TS = "to_ts";
  @SerializedName(SERIALIZED_NAME_TO_TS)
  private Integer toTs;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public ListeningActivityForUserPayload() {
  }

  public ListeningActivityForUserPayload fromTs(Integer fromTs) {
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


  public ListeningActivityForUserPayload lastUpdated(Integer lastUpdated) {
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


  public ListeningActivityForUserPayload listeningActivity(List<ListeningActivityForUserPayloadListeningActivityInner> listeningActivity) {
    this.listeningActivity = listeningActivity;
    return this;
  }

  public ListeningActivityForUserPayload addListeningActivityItem(ListeningActivityForUserPayloadListeningActivityInner listeningActivityItem) {
    if (this.listeningActivity == null) {
      this.listeningActivity = new ArrayList<>();
    }
    this.listeningActivity.add(listeningActivityItem);
    return this;
  }

  /**
   * Get listeningActivity
   * @return listeningActivity
   */
  @javax.annotation.Nonnull
  public List<ListeningActivityForUserPayloadListeningActivityInner> getListeningActivity() {
    return listeningActivity;
  }

  public void setListeningActivity(List<ListeningActivityForUserPayloadListeningActivityInner> listeningActivity) {
    this.listeningActivity = listeningActivity;
  }


  public ListeningActivityForUserPayload range(String range) {
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


  public ListeningActivityForUserPayload toTs(Integer toTs) {
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


  public ListeningActivityForUserPayload userId(String userId) {
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
    ListeningActivityForUserPayload listeningActivityForUserPayload = (ListeningActivityForUserPayload) o;
    return Objects.equals(this.fromTs, listeningActivityForUserPayload.fromTs) &&
        Objects.equals(this.lastUpdated, listeningActivityForUserPayload.lastUpdated) &&
        Objects.equals(this.listeningActivity, listeningActivityForUserPayload.listeningActivity) &&
        Objects.equals(this.range, listeningActivityForUserPayload.range) &&
        Objects.equals(this.toTs, listeningActivityForUserPayload.toTs) &&
        Objects.equals(this.userId, listeningActivityForUserPayload.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromTs, lastUpdated, listeningActivity, range, toTs, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListeningActivityForUserPayload {\n");
    sb.append("    fromTs: ").append(toIndentedString(fromTs)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    listeningActivity: ").append(toIndentedString(listeningActivity)).append("\n");
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
    openapiFields.add("from_ts");
    openapiFields.add("last_updated");
    openapiFields.add("listening_activity");
    openapiFields.add("range");
    openapiFields.add("to_ts");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("from_ts");
    openapiRequiredFields.add("last_updated");
    openapiRequiredFields.add("listening_activity");
    openapiRequiredFields.add("range");
    openapiRequiredFields.add("to_ts");
    openapiRequiredFields.add("user_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListeningActivityForUserPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListeningActivityForUserPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListeningActivityForUserPayload is not found in the empty JSON string", ListeningActivityForUserPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListeningActivityForUserPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListeningActivityForUserPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListeningActivityForUserPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("listening_activity").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `listening_activity` to be an array in the JSON string but got `%s`", jsonObj.get("listening_activity").toString()));
      }

      JsonArray jsonArraylisteningActivity = jsonObj.getAsJsonArray("listening_activity");
      // validate the required field `listening_activity` (array)
      for (int i = 0; i < jsonArraylisteningActivity.size(); i++) {
        ListeningActivityForUserPayloadListeningActivityInner.validateJsonElement(jsonArraylisteningActivity.get(i));
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
       if (!ListeningActivityForUserPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListeningActivityForUserPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListeningActivityForUserPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListeningActivityForUserPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<ListeningActivityForUserPayload>() {
           @Override
           public void write(JsonWriter out, ListeningActivityForUserPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListeningActivityForUserPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListeningActivityForUserPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListeningActivityForUserPayload
   * @throws IOException if the JSON string is invalid with respect to ListeningActivityForUserPayload
   */
  public static ListeningActivityForUserPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListeningActivityForUserPayload.class);
  }

  /**
   * Convert an instance of ListeningActivityForUserPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

