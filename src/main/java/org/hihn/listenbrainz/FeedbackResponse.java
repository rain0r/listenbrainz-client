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
import org.hihn.listenbrainz.Feedback;

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
 * FeedbackResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class FeedbackResponse {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_FEEDBACK = "feedback";
  @SerializedName(SERIALIZED_NAME_FEEDBACK)
  private List<Feedback> feedback = new ArrayList<>();

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public FeedbackResponse() {
  }

  public FeedbackResponse count(Integer count) {
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


  public FeedbackResponse feedback(List<Feedback> feedback) {
    this.feedback = feedback;
    return this;
  }

  public FeedbackResponse addFeedbackItem(Feedback feedbackItem) {
    if (this.feedback == null) {
      this.feedback = new ArrayList<>();
    }
    this.feedback.add(feedbackItem);
    return this;
  }

  /**
   * Get feedback
   * @return feedback
   */
  @javax.annotation.Nullable
  public List<Feedback> getFeedback() {
    return feedback;
  }

  public void setFeedback(List<Feedback> feedback) {
    this.feedback = feedback;
  }


  public FeedbackResponse offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public FeedbackResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount
   * @return totalCount
   */
  @javax.annotation.Nullable
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackResponse feedbackResponse = (FeedbackResponse) o;
    return Objects.equals(this.count, feedbackResponse.count) &&
        Objects.equals(this.feedback, feedbackResponse.feedback) &&
        Objects.equals(this.offset, feedbackResponse.offset) &&
        Objects.equals(this.totalCount, feedbackResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, feedback, offset, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackResponse {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
    openapiFields.add("feedback");
    openapiFields.add("offset");
    openapiFields.add("total_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FeedbackResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FeedbackResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeedbackResponse is not found in the empty JSON string", FeedbackResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FeedbackResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeedbackResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("feedback") != null && !jsonObj.get("feedback").isJsonNull()) {
        JsonArray jsonArrayfeedback = jsonObj.getAsJsonArray("feedback");
        if (jsonArrayfeedback != null) {
          // ensure the json data is an array
          if (!jsonObj.get("feedback").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `feedback` to be an array in the JSON string but got `%s`", jsonObj.get("feedback").toString()));
          }

          // validate the optional field `feedback` (array)
          for (int i = 0; i < jsonArrayfeedback.size(); i++) {
            Feedback.validateJsonElement(jsonArrayfeedback.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeedbackResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeedbackResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeedbackResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeedbackResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<FeedbackResponse>() {
           @Override
           public void write(JsonWriter out, FeedbackResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeedbackResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FeedbackResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FeedbackResponse
   * @throws IOException if the JSON string is invalid with respect to FeedbackResponse
   */
  public static FeedbackResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeedbackResponse.class);
  }

  /**
   * Convert an instance of FeedbackResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

