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
import org.hihn.listenbrainz.TrackMetadata;

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
 * Metadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:00:27.345003+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class Metadata {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Integer created;

  public static final String SERIALIZED_NAME_RELATIONSHIP_TYPE = "relationship_type";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP_TYPE)
  private String relationshipType;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_BLURB_CONTENT = "blurb_content";
  @SerializedName(SERIALIZED_NAME_BLURB_CONTENT)
  private String blurbContent;

  public static final String SERIALIZED_NAME_INSERTED_AT = "inserted_at";
  @SerializedName(SERIALIZED_NAME_INSERTED_AT)
  private Integer insertedAt;

  public static final String SERIALIZED_NAME_LISTENED_AT = "listened_at";
  @SerializedName(SERIALIZED_NAME_LISTENED_AT)
  private Integer listenedAt;

  public static final String SERIALIZED_NAME_LISTENED_AT_ISO = "listened_at_iso";
  @SerializedName(SERIALIZED_NAME_LISTENED_AT_ISO)
  private String listenedAtIso;

  public static final String SERIALIZED_NAME_PLAYING_NOW = "playing_now";
  @SerializedName(SERIALIZED_NAME_PLAYING_NOW)
  private Boolean playingNow;

  public static final String SERIALIZED_NAME_TRACK_METADATA = "track_metadata";
  @SerializedName(SERIALIZED_NAME_TRACK_METADATA)
  private TrackMetadata trackMetadata;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public Metadata() {
  }

  public Metadata created(Integer created) {
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


  public Metadata relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Get relationshipType
   * @return relationshipType
   */
  @javax.annotation.Nullable
  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }


  public Metadata message(String message) {
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


  public Metadata blurbContent(String blurbContent) {
    this.blurbContent = blurbContent;
    return this;
  }

  /**
   * Get blurbContent
   * @return blurbContent
   */
  @javax.annotation.Nullable
  public String getBlurbContent() {
    return blurbContent;
  }

  public void setBlurbContent(String blurbContent) {
    this.blurbContent = blurbContent;
  }


  public Metadata insertedAt(Integer insertedAt) {
    this.insertedAt = insertedAt;
    return this;
  }

  /**
   * Get insertedAt
   * @return insertedAt
   */
  @javax.annotation.Nullable
  public Integer getInsertedAt() {
    return insertedAt;
  }

  public void setInsertedAt(Integer insertedAt) {
    this.insertedAt = insertedAt;
  }


  public Metadata listenedAt(Integer listenedAt) {
    this.listenedAt = listenedAt;
    return this;
  }

  /**
   * Get listenedAt
   * @return listenedAt
   */
  @javax.annotation.Nullable
  public Integer getListenedAt() {
    return listenedAt;
  }

  public void setListenedAt(Integer listenedAt) {
    this.listenedAt = listenedAt;
  }


  public Metadata listenedAtIso(String listenedAtIso) {
    this.listenedAtIso = listenedAtIso;
    return this;
  }

  /**
   * Get listenedAtIso
   * @return listenedAtIso
   */
  @javax.annotation.Nullable
  public String getListenedAtIso() {
    return listenedAtIso;
  }

  public void setListenedAtIso(String listenedAtIso) {
    this.listenedAtIso = listenedAtIso;
  }


  public Metadata playingNow(Boolean playingNow) {
    this.playingNow = playingNow;
    return this;
  }

  /**
   * Get playingNow
   * @return playingNow
   */
  @javax.annotation.Nullable
  public Boolean getPlayingNow() {
    return playingNow;
  }

  public void setPlayingNow(Boolean playingNow) {
    this.playingNow = playingNow;
  }


  public Metadata trackMetadata(TrackMetadata trackMetadata) {
    this.trackMetadata = trackMetadata;
    return this;
  }

  /**
   * Get trackMetadata
   * @return trackMetadata
   */
  @javax.annotation.Nullable
  public TrackMetadata getTrackMetadata() {
    return trackMetadata;
  }

  public void setTrackMetadata(TrackMetadata trackMetadata) {
    this.trackMetadata = trackMetadata;
  }


  public Metadata userName(String userName) {
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

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Metadata instance itself
   */
  public Metadata putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.created, metadata.created) &&
        Objects.equals(this.relationshipType, metadata.relationshipType) &&
        Objects.equals(this.message, metadata.message) &&
        Objects.equals(this.blurbContent, metadata.blurbContent) &&
        Objects.equals(this.insertedAt, metadata.insertedAt) &&
        Objects.equals(this.listenedAt, metadata.listenedAt) &&
        Objects.equals(this.listenedAtIso, metadata.listenedAtIso) &&
        Objects.equals(this.playingNow, metadata.playingNow) &&
        Objects.equals(this.trackMetadata, metadata.trackMetadata) &&
        Objects.equals(this.userName, metadata.userName)&&
        Objects.equals(this.additionalProperties, metadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, relationshipType, message, blurbContent, insertedAt, listenedAt, listenedAtIso, playingNow, trackMetadata, userName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    blurbContent: ").append(toIndentedString(blurbContent)).append("\n");
    sb.append("    insertedAt: ").append(toIndentedString(insertedAt)).append("\n");
    sb.append("    listenedAt: ").append(toIndentedString(listenedAt)).append("\n");
    sb.append("    listenedAtIso: ").append(toIndentedString(listenedAtIso)).append("\n");
    sb.append("    playingNow: ").append(toIndentedString(playingNow)).append("\n");
    sb.append("    trackMetadata: ").append(toIndentedString(trackMetadata)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("relationship_type");
    openapiFields.add("message");
    openapiFields.add("blurb_content");
    openapiFields.add("inserted_at");
    openapiFields.add("listened_at");
    openapiFields.add("listened_at_iso");
    openapiFields.add("playing_now");
    openapiFields.add("track_metadata");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Metadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Metadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Metadata is not found in the empty JSON string", Metadata.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("relationship_type") != null && !jsonObj.get("relationship_type").isJsonNull()) && !jsonObj.get("relationship_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relationship_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relationship_type").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("blurb_content") != null && !jsonObj.get("blurb_content").isJsonNull()) && !jsonObj.get("blurb_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blurb_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blurb_content").toString()));
      }
      if ((jsonObj.get("listened_at_iso") != null && !jsonObj.get("listened_at_iso").isJsonNull()) && !jsonObj.get("listened_at_iso").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `listened_at_iso` to be a primitive type in the JSON string but got `%s`", jsonObj.get("listened_at_iso").toString()));
      }
      // validate the optional field `track_metadata`
      if (jsonObj.get("track_metadata") != null && !jsonObj.get("track_metadata").isJsonNull()) {
        TrackMetadata.validateJsonElement(jsonObj.get("track_metadata"));
      }
      if ((jsonObj.get("user_name") != null && !jsonObj.get("user_name").isJsonNull()) && !jsonObj.get("user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Metadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Metadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Metadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Metadata.class));

       return (TypeAdapter<T>) new TypeAdapter<Metadata>() {
           @Override
           public void write(JsonWriter out, Metadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Metadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Metadata instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Metadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Metadata
   * @throws IOException if the JSON string is invalid with respect to Metadata
   */
  public static Metadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Metadata.class);
  }

  /**
   * Convert an instance of Metadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

