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
import org.hihn.listenbrainz.FeedbackGivenByFeedbackInner;

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
 * RecordingsFeedbackGivenBy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class RecordingsFeedbackGivenBy {
  public static final String SERIALIZED_NAME_FEEDBACK = "feedback";
  @SerializedName(SERIALIZED_NAME_FEEDBACK)
  private List<FeedbackGivenByFeedbackInner> feedback = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public RecordingsFeedbackGivenBy() {
  }

  public RecordingsFeedbackGivenBy feedback(List<FeedbackGivenByFeedbackInner> feedback) {
    this.feedback = feedback;
    return this;
  }

  public RecordingsFeedbackGivenBy addFeedbackItem(FeedbackGivenByFeedbackInner feedbackItem) {
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
  @javax.annotation.Nonnull
  public List<FeedbackGivenByFeedbackInner> getFeedback() {
    return feedback;
  }

  public void setFeedback(List<FeedbackGivenByFeedbackInner> feedback) {
    this.feedback = feedback;
  }


  public RecordingsFeedbackGivenBy userName(String userName) {
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
    RecordingsFeedbackGivenBy recordingsFeedbackGivenBy = (RecordingsFeedbackGivenBy) o;
    return Objects.equals(this.feedback, recordingsFeedbackGivenBy.feedback) &&
        Objects.equals(this.userName, recordingsFeedbackGivenBy.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedback, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingsFeedbackGivenBy {\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
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
    openapiFields.add("feedback");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("feedback");
    openapiRequiredFields.add("user_name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecordingsFeedbackGivenBy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecordingsFeedbackGivenBy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordingsFeedbackGivenBy is not found in the empty JSON string", RecordingsFeedbackGivenBy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecordingsFeedbackGivenBy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordingsFeedbackGivenBy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RecordingsFeedbackGivenBy.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("feedback").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedback` to be an array in the JSON string but got `%s`", jsonObj.get("feedback").toString()));
      }

      JsonArray jsonArrayfeedback = jsonObj.getAsJsonArray("feedback");
      // validate the required field `feedback` (array)
      for (int i = 0; i < jsonArrayfeedback.size(); i++) {
        FeedbackGivenByFeedbackInner.validateJsonElement(jsonArrayfeedback.get(i));
      };
      if (!jsonObj.get("user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordingsFeedbackGivenBy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordingsFeedbackGivenBy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordingsFeedbackGivenBy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordingsFeedbackGivenBy.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordingsFeedbackGivenBy>() {
           @Override
           public void write(JsonWriter out, RecordingsFeedbackGivenBy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordingsFeedbackGivenBy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecordingsFeedbackGivenBy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecordingsFeedbackGivenBy
   * @throws IOException if the JSON string is invalid with respect to RecordingsFeedbackGivenBy
   */
  public static RecordingsFeedbackGivenBy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordingsFeedbackGivenBy.class);
  }

  /**
   * Convert an instance of RecordingsFeedbackGivenBy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

