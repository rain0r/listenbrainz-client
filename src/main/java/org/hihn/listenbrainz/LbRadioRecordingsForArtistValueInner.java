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
 * LbRadioRecordingsForArtistValueInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class LbRadioRecordingsForArtistValueInner {
  public static final String SERIALIZED_NAME_RECORDING_MBID = "recording_mbid";
  @SerializedName(SERIALIZED_NAME_RECORDING_MBID)
  private UUID recordingMbid;

  public static final String SERIALIZED_NAME_SIMILAR_ARTIST_MBID = "similar_artist_mbid";
  @SerializedName(SERIALIZED_NAME_SIMILAR_ARTIST_MBID)
  private UUID similarArtistMbid;

  public static final String SERIALIZED_NAME_SIMILAR_ARTIST_NAME = "similar_artist_name";
  @SerializedName(SERIALIZED_NAME_SIMILAR_ARTIST_NAME)
  private String similarArtistName;

  public static final String SERIALIZED_NAME_TOTAL_LISTEN_COUNT = "total_listen_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_LISTEN_COUNT)
  private Integer totalListenCount;

  public LbRadioRecordingsForArtistValueInner() {
  }

  public LbRadioRecordingsForArtistValueInner recordingMbid(UUID recordingMbid) {
    this.recordingMbid = recordingMbid;
    return this;
  }

  /**
   * Get recordingMbid
   * @return recordingMbid
   */
  @javax.annotation.Nullable
  public UUID getRecordingMbid() {
    return recordingMbid;
  }

  public void setRecordingMbid(UUID recordingMbid) {
    this.recordingMbid = recordingMbid;
  }


  public LbRadioRecordingsForArtistValueInner similarArtistMbid(UUID similarArtistMbid) {
    this.similarArtistMbid = similarArtistMbid;
    return this;
  }

  /**
   * Get similarArtistMbid
   * @return similarArtistMbid
   */
  @javax.annotation.Nullable
  public UUID getSimilarArtistMbid() {
    return similarArtistMbid;
  }

  public void setSimilarArtistMbid(UUID similarArtistMbid) {
    this.similarArtistMbid = similarArtistMbid;
  }


  public LbRadioRecordingsForArtistValueInner similarArtistName(String similarArtistName) {
    this.similarArtistName = similarArtistName;
    return this;
  }

  /**
   * Get similarArtistName
   * @return similarArtistName
   */
  @javax.annotation.Nullable
  public String getSimilarArtistName() {
    return similarArtistName;
  }

  public void setSimilarArtistName(String similarArtistName) {
    this.similarArtistName = similarArtistName;
  }


  public LbRadioRecordingsForArtistValueInner totalListenCount(Integer totalListenCount) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LbRadioRecordingsForArtistValueInner lbRadioRecordingsForArtistValueInner = (LbRadioRecordingsForArtistValueInner) o;
    return Objects.equals(this.recordingMbid, lbRadioRecordingsForArtistValueInner.recordingMbid) &&
        Objects.equals(this.similarArtistMbid, lbRadioRecordingsForArtistValueInner.similarArtistMbid) &&
        Objects.equals(this.similarArtistName, lbRadioRecordingsForArtistValueInner.similarArtistName) &&
        Objects.equals(this.totalListenCount, lbRadioRecordingsForArtistValueInner.totalListenCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordingMbid, similarArtistMbid, similarArtistName, totalListenCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbRadioRecordingsForArtistValueInner {\n");
    sb.append("    recordingMbid: ").append(toIndentedString(recordingMbid)).append("\n");
    sb.append("    similarArtistMbid: ").append(toIndentedString(similarArtistMbid)).append("\n");
    sb.append("    similarArtistName: ").append(toIndentedString(similarArtistName)).append("\n");
    sb.append("    totalListenCount: ").append(toIndentedString(totalListenCount)).append("\n");
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
    openapiFields.add("recording_mbid");
    openapiFields.add("similar_artist_mbid");
    openapiFields.add("similar_artist_name");
    openapiFields.add("total_listen_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LbRadioRecordingsForArtistValueInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LbRadioRecordingsForArtistValueInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LbRadioRecordingsForArtistValueInner is not found in the empty JSON string", LbRadioRecordingsForArtistValueInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LbRadioRecordingsForArtistValueInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LbRadioRecordingsForArtistValueInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("recording_mbid") != null && !jsonObj.get("recording_mbid").isJsonNull()) && !jsonObj.get("recording_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recording_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recording_mbid").toString()));
      }
      if ((jsonObj.get("similar_artist_mbid") != null && !jsonObj.get("similar_artist_mbid").isJsonNull()) && !jsonObj.get("similar_artist_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `similar_artist_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("similar_artist_mbid").toString()));
      }
      if ((jsonObj.get("similar_artist_name") != null && !jsonObj.get("similar_artist_name").isJsonNull()) && !jsonObj.get("similar_artist_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `similar_artist_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("similar_artist_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LbRadioRecordingsForArtistValueInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LbRadioRecordingsForArtistValueInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LbRadioRecordingsForArtistValueInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LbRadioRecordingsForArtistValueInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LbRadioRecordingsForArtistValueInner>() {
           @Override
           public void write(JsonWriter out, LbRadioRecordingsForArtistValueInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LbRadioRecordingsForArtistValueInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LbRadioRecordingsForArtistValueInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LbRadioRecordingsForArtistValueInner
   * @throws IOException if the JSON string is invalid with respect to LbRadioRecordingsForArtistValueInner
   */
  public static LbRadioRecordingsForArtistValueInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LbRadioRecordingsForArtistValueInner.class);
  }

  /**
   * Convert an instance of LbRadioRecordingsForArtistValueInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

