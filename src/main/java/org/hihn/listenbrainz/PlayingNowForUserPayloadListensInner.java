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
 * PlayingNowForUserPayloadListensInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PlayingNowForUserPayloadListensInner {
  public static final String SERIALIZED_NAME_PLAYING_NOW = "playing_now";
  @SerializedName(SERIALIZED_NAME_PLAYING_NOW)
  private Boolean playingNow;

  public static final String SERIALIZED_NAME_TRACK_METADATA = "track_metadata";
  @SerializedName(SERIALIZED_NAME_TRACK_METADATA)
  private TrackMetadata trackMetadata;

  public PlayingNowForUserPayloadListensInner() {
  }

  public PlayingNowForUserPayloadListensInner playingNow(Boolean playingNow) {
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


  public PlayingNowForUserPayloadListensInner trackMetadata(TrackMetadata trackMetadata) {
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
    PlayingNowForUserPayloadListensInner playingNowForUserPayloadListensInner = (PlayingNowForUserPayloadListensInner) o;
    return Objects.equals(this.playingNow, playingNowForUserPayloadListensInner.playingNow) &&
        Objects.equals(this.trackMetadata, playingNowForUserPayloadListensInner.trackMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playingNow, trackMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayingNowForUserPayloadListensInner {\n");
    sb.append("    playingNow: ").append(toIndentedString(playingNow)).append("\n");
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
    openapiFields.add("playing_now");
    openapiFields.add("track_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PlayingNowForUserPayloadListensInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PlayingNowForUserPayloadListensInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlayingNowForUserPayloadListensInner is not found in the empty JSON string", PlayingNowForUserPayloadListensInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PlayingNowForUserPayloadListensInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlayingNowForUserPayloadListensInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!PlayingNowForUserPayloadListensInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlayingNowForUserPayloadListensInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlayingNowForUserPayloadListensInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlayingNowForUserPayloadListensInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PlayingNowForUserPayloadListensInner>() {
           @Override
           public void write(JsonWriter out, PlayingNowForUserPayloadListensInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlayingNowForUserPayloadListensInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PlayingNowForUserPayloadListensInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PlayingNowForUserPayloadListensInner
   * @throws IOException if the JSON string is invalid with respect to PlayingNowForUserPayloadListensInner
   */
  public static PlayingNowForUserPayloadListensInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlayingNowForUserPayloadListensInner.class);
  }

  /**
   * Convert an instance of PlayingNowForUserPayloadListensInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

