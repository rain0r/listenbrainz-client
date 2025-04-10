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
 * SubmitListensPayloadInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SubmitListensPayloadInner {
  public static final String SERIALIZED_NAME_LISTENED_AT = "listened_at";
  @SerializedName(SERIALIZED_NAME_LISTENED_AT)
  private Integer listenedAt;

  public static final String SERIALIZED_NAME_TRACK_METADATA = "track_metadata";
  @SerializedName(SERIALIZED_NAME_TRACK_METADATA)
  private TrackMetadata trackMetadata;

  public SubmitListensPayloadInner() {
  }

  public SubmitListensPayloadInner listenedAt(Integer listenedAt) {
    this.listenedAt = listenedAt;
    return this;
  }

  /**
   * Get listenedAt
   * minimum: 0
   * @return listenedAt
   */
  @javax.annotation.Nullable
  public Integer getListenedAt() {
    return listenedAt;
  }

  public void setListenedAt(Integer listenedAt) {
    this.listenedAt = listenedAt;
  }


  public SubmitListensPayloadInner trackMetadata(TrackMetadata trackMetadata) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitListensPayloadInner submitListensPayloadInner = (SubmitListensPayloadInner) o;
    return Objects.equals(this.listenedAt, submitListensPayloadInner.listenedAt) &&
        Objects.equals(this.trackMetadata, submitListensPayloadInner.trackMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listenedAt, trackMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitListensPayloadInner {\n");
    sb.append("    listenedAt: ").append(toIndentedString(listenedAt)).append("\n");
    sb.append("    trackMetadata: ").append(toIndentedString(trackMetadata)).append("\n");
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
    openapiFields.add("listened_at");
    openapiFields.add("track_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SubmitListensPayloadInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubmitListensPayloadInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitListensPayloadInner is not found in the empty JSON string", SubmitListensPayloadInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubmitListensPayloadInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitListensPayloadInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `track_metadata`
      if (jsonObj.get("track_metadata") != null && !jsonObj.get("track_metadata").isJsonNull()) {
        TrackMetadata.validateJsonElement(jsonObj.get("track_metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitListensPayloadInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitListensPayloadInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitListensPayloadInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitListensPayloadInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitListensPayloadInner>() {
           @Override
           public void write(JsonWriter out, SubmitListensPayloadInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitListensPayloadInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SubmitListensPayloadInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubmitListensPayloadInner
   * @throws IOException if the JSON string is invalid with respect to SubmitListensPayloadInner
   */
  public static SubmitListensPayloadInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitListensPayloadInner.class);
  }

  /**
   * Convert an instance of SubmitListensPayloadInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

