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
 * LbRadioTagsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:00:27.345003+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class LbRadioTagsInner {
  public static final String SERIALIZED_NAME_PERCENT = "percent";
  @SerializedName(SERIALIZED_NAME_PERCENT)
  private Integer percent;

  public static final String SERIALIZED_NAME_RECORDING_MBID = "recording_mbid";
  @SerializedName(SERIALIZED_NAME_RECORDING_MBID)
  private UUID recordingMbid;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TAG_COUNT = "tag_count";
  @SerializedName(SERIALIZED_NAME_TAG_COUNT)
  private Integer tagCount;

  public LbRadioTagsInner() {
  }

  public LbRadioTagsInner percent(Integer percent) {
    this.percent = percent;
    return this;
  }

  /**
   * Get percent
   * @return percent
   */
  @javax.annotation.Nullable
  public Integer getPercent() {
    return percent;
  }

  public void setPercent(Integer percent) {
    this.percent = percent;
  }


  public LbRadioTagsInner recordingMbid(UUID recordingMbid) {
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


  public LbRadioTagsInner source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  public LbRadioTagsInner tagCount(Integer tagCount) {
    this.tagCount = tagCount;
    return this;
  }

  /**
   * Get tagCount
   * @return tagCount
   */
  @javax.annotation.Nullable
  public Integer getTagCount() {
    return tagCount;
  }

  public void setTagCount(Integer tagCount) {
    this.tagCount = tagCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LbRadioTagsInner lbRadioTagsInner = (LbRadioTagsInner) o;
    return Objects.equals(this.percent, lbRadioTagsInner.percent) &&
        Objects.equals(this.recordingMbid, lbRadioTagsInner.recordingMbid) &&
        Objects.equals(this.source, lbRadioTagsInner.source) &&
        Objects.equals(this.tagCount, lbRadioTagsInner.tagCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percent, recordingMbid, source, tagCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbRadioTagsInner {\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    recordingMbid: ").append(toIndentedString(recordingMbid)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tagCount: ").append(toIndentedString(tagCount)).append("\n");
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
    openapiFields.add("percent");
    openapiFields.add("recording_mbid");
    openapiFields.add("source");
    openapiFields.add("tag_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LbRadioTagsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LbRadioTagsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LbRadioTagsInner is not found in the empty JSON string", LbRadioTagsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LbRadioTagsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LbRadioTagsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("recording_mbid") != null && !jsonObj.get("recording_mbid").isJsonNull()) && !jsonObj.get("recording_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recording_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recording_mbid").toString()));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LbRadioTagsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LbRadioTagsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LbRadioTagsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LbRadioTagsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LbRadioTagsInner>() {
           @Override
           public void write(JsonWriter out, LbRadioTagsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LbRadioTagsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LbRadioTagsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LbRadioTagsInner
   * @throws IOException if the JSON string is invalid with respect to LbRadioTagsInner
   */
  public static LbRadioTagsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LbRadioTagsInner.class);
  }

  /**
   * Convert an instance of LbRadioTagsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

