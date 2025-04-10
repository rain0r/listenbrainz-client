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
import org.hihn.listenbrainz.RecordingRecommendationsPayloadMbidsInner;

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
 * RecordingRecommendationsPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class RecordingRecommendationsPayload {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private String entity;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private Integer lastUpdated;

  public static final String SERIALIZED_NAME_MBIDS = "mbids";
  @SerializedName(SERIALIZED_NAME_MBIDS)
  private List<RecordingRecommendationsPayloadMbidsInner> mbids = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODEL_ID = "model_id";
  @SerializedName(SERIALIZED_NAME_MODEL_ID)
  private String modelId;

  public static final String SERIALIZED_NAME_MODEL_URL = "model_url";
  @SerializedName(SERIALIZED_NAME_MODEL_URL)
  private String modelUrl;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_TOTAL_MBID_COUNT = "total_mbid_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_MBID_COUNT)
  private Integer totalMbidCount;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public RecordingRecommendationsPayload() {
  }

  public RecordingRecommendationsPayload count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  @javax.annotation.Nonnull
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  public RecordingRecommendationsPayload entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Get entity
   * @return entity
   */
  @javax.annotation.Nonnull
  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }


  public RecordingRecommendationsPayload lastUpdated(Integer lastUpdated) {
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


  public RecordingRecommendationsPayload mbids(List<RecordingRecommendationsPayloadMbidsInner> mbids) {
    this.mbids = mbids;
    return this;
  }

  public RecordingRecommendationsPayload addMbidsItem(RecordingRecommendationsPayloadMbidsInner mbidsItem) {
    if (this.mbids == null) {
      this.mbids = new ArrayList<>();
    }
    this.mbids.add(mbidsItem);
    return this;
  }

  /**
   * Get mbids
   * @return mbids
   */
  @javax.annotation.Nonnull
  public List<RecordingRecommendationsPayloadMbidsInner> getMbids() {
    return mbids;
  }

  public void setMbids(List<RecordingRecommendationsPayloadMbidsInner> mbids) {
    this.mbids = mbids;
  }


  public RecordingRecommendationsPayload modelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * Get modelId
   * @return modelId
   */
  @javax.annotation.Nonnull
  public String getModelId() {
    return modelId;
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }


  public RecordingRecommendationsPayload modelUrl(String modelUrl) {
    this.modelUrl = modelUrl;
    return this;
  }

  /**
   * Get modelUrl
   * @return modelUrl
   */
  @javax.annotation.Nonnull
  public String getModelUrl() {
    return modelUrl;
  }

  public void setModelUrl(String modelUrl) {
    this.modelUrl = modelUrl;
  }


  public RecordingRecommendationsPayload offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
   */
  @javax.annotation.Nonnull
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public RecordingRecommendationsPayload totalMbidCount(Integer totalMbidCount) {
    this.totalMbidCount = totalMbidCount;
    return this;
  }

  /**
   * Get totalMbidCount
   * @return totalMbidCount
   */
  @javax.annotation.Nonnull
  public Integer getTotalMbidCount() {
    return totalMbidCount;
  }

  public void setTotalMbidCount(Integer totalMbidCount) {
    this.totalMbidCount = totalMbidCount;
  }


  public RecordingRecommendationsPayload userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
   */
  @javax.annotation.Nonnull
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
    RecordingRecommendationsPayload recordingRecommendationsPayload = (RecordingRecommendationsPayload) o;
    return Objects.equals(this.count, recordingRecommendationsPayload.count) &&
        Objects.equals(this.entity, recordingRecommendationsPayload.entity) &&
        Objects.equals(this.lastUpdated, recordingRecommendationsPayload.lastUpdated) &&
        Objects.equals(this.mbids, recordingRecommendationsPayload.mbids) &&
        Objects.equals(this.modelId, recordingRecommendationsPayload.modelId) &&
        Objects.equals(this.modelUrl, recordingRecommendationsPayload.modelUrl) &&
        Objects.equals(this.offset, recordingRecommendationsPayload.offset) &&
        Objects.equals(this.totalMbidCount, recordingRecommendationsPayload.totalMbidCount) &&
        Objects.equals(this.userName, recordingRecommendationsPayload.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, entity, lastUpdated, mbids, modelId, modelUrl, offset, totalMbidCount, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingRecommendationsPayload {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    mbids: ").append(toIndentedString(mbids)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    modelUrl: ").append(toIndentedString(modelUrl)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    totalMbidCount: ").append(toIndentedString(totalMbidCount)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("entity");
    openapiFields.add("last_updated");
    openapiFields.add("mbids");
    openapiFields.add("model_id");
    openapiFields.add("model_url");
    openapiFields.add("offset");
    openapiFields.add("total_mbid_count");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("count");
    openapiRequiredFields.add("entity");
    openapiRequiredFields.add("last_updated");
    openapiRequiredFields.add("mbids");
    openapiRequiredFields.add("model_id");
    openapiRequiredFields.add("model_url");
    openapiRequiredFields.add("offset");
    openapiRequiredFields.add("total_mbid_count");
    openapiRequiredFields.add("user_name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecordingRecommendationsPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecordingRecommendationsPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordingRecommendationsPayload is not found in the empty JSON string", RecordingRecommendationsPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecordingRecommendationsPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordingRecommendationsPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RecordingRecommendationsPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("mbids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mbids` to be an array in the JSON string but got `%s`", jsonObj.get("mbids").toString()));
      }

      JsonArray jsonArraymbids = jsonObj.getAsJsonArray("mbids");
      // validate the required field `mbids` (array)
      for (int i = 0; i < jsonArraymbids.size(); i++) {
        RecordingRecommendationsPayloadMbidsInner.validateJsonElement(jsonArraymbids.get(i));
      };
      if (!jsonObj.get("model_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model_id").toString()));
      }
      if (!jsonObj.get("model_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model_url").toString()));
      }
      if (!jsonObj.get("user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordingRecommendationsPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordingRecommendationsPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordingRecommendationsPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordingRecommendationsPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordingRecommendationsPayload>() {
           @Override
           public void write(JsonWriter out, RecordingRecommendationsPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordingRecommendationsPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecordingRecommendationsPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecordingRecommendationsPayload
   * @throws IOException if the JSON string is invalid with respect to RecordingRecommendationsPayload
   */
  public static RecordingRecommendationsPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordingRecommendationsPayload.class);
  }

  /**
   * Convert an instance of RecordingRecommendationsPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

