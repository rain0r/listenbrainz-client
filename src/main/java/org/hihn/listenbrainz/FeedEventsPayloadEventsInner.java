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
import org.hihn.listenbrainz.Metadata;

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
 * FeedEventsPayloadEventsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class FeedEventsPayloadEventsInner {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Integer created;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  private Boolean hidden;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Metadata metadata;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public FeedEventsPayloadEventsInner() {
  }

  public FeedEventsPayloadEventsInner created(Integer created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @javax.annotation.Nullable
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }


  public FeedEventsPayloadEventsInner eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
   */
  @javax.annotation.Nullable
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public FeedEventsPayloadEventsInner hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * Get hidden
   * @return hidden
   */
  @javax.annotation.Nullable
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  public FeedEventsPayloadEventsInner id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public FeedEventsPayloadEventsInner message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public FeedEventsPayloadEventsInner metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @javax.annotation.Nullable
  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }


  public FeedEventsPayloadEventsInner userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
   */
  @javax.annotation.Nullable
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedEventsPayloadEventsInner feedEventsPayloadEventsInner = (FeedEventsPayloadEventsInner) o;
    return Objects.equals(this.created, feedEventsPayloadEventsInner.created) &&
        Objects.equals(this.eventType, feedEventsPayloadEventsInner.eventType) &&
        Objects.equals(this.hidden, feedEventsPayloadEventsInner.hidden) &&
        Objects.equals(this.id, feedEventsPayloadEventsInner.id) &&
        Objects.equals(this.message, feedEventsPayloadEventsInner.message) &&
        Objects.equals(this.metadata, feedEventsPayloadEventsInner.metadata) &&
        Objects.equals(this.userName, feedEventsPayloadEventsInner.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, eventType, hidden, id, message, metadata, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedEventsPayloadEventsInner {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
    openapiFields.add("created");
    openapiFields.add("event_type");
    openapiFields.add("hidden");
    openapiFields.add("id");
    openapiFields.add("message");
    openapiFields.add("metadata");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FeedEventsPayloadEventsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FeedEventsPayloadEventsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeedEventsPayloadEventsInner is not found in the empty JSON string", FeedEventsPayloadEventsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FeedEventsPayloadEventsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeedEventsPayloadEventsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("event_type") != null && !jsonObj.get("event_type").isJsonNull()) && !jsonObj.get("event_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_type").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("user_name") != null && !jsonObj.get("user_name").isJsonNull()) && !jsonObj.get("user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeedEventsPayloadEventsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeedEventsPayloadEventsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeedEventsPayloadEventsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeedEventsPayloadEventsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FeedEventsPayloadEventsInner>() {
           @Override
           public void write(JsonWriter out, FeedEventsPayloadEventsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeedEventsPayloadEventsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FeedEventsPayloadEventsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FeedEventsPayloadEventsInner
   * @throws IOException if the JSON string is invalid with respect to FeedEventsPayloadEventsInner
   */
  public static FeedEventsPayloadEventsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeedEventsPayloadEventsInner.class);
  }

  /**
   * Convert an instance of FeedEventsPayloadEventsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

