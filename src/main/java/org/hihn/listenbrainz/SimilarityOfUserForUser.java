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
import org.hihn.listenbrainz.SimilarityOfUserForUserPayload;

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
 * SimilarityOfUserForUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:54:13.371331+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class SimilarityOfUserForUser {
  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private SimilarityOfUserForUserPayload payload;

  public SimilarityOfUserForUser() {
  }

  public SimilarityOfUserForUser payload(SimilarityOfUserForUserPayload payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
   */
  @javax.annotation.Nonnull
  public SimilarityOfUserForUserPayload getPayload() {
    return payload;
  }

  public void setPayload(SimilarityOfUserForUserPayload payload) {
    this.payload = payload;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilarityOfUserForUser similarityOfUserForUser = (SimilarityOfUserForUser) o;
    return Objects.equals(this.payload, similarityOfUserForUser.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarityOfUserForUser {\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
    openapiFields.add("payload");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("payload");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SimilarityOfUserForUser
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SimilarityOfUserForUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimilarityOfUserForUser is not found in the empty JSON string", SimilarityOfUserForUser.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SimilarityOfUserForUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimilarityOfUserForUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SimilarityOfUserForUser.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `payload`
      SimilarityOfUserForUserPayload.validateJsonElement(jsonObj.get("payload"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimilarityOfUserForUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimilarityOfUserForUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimilarityOfUserForUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimilarityOfUserForUser.class));

       return (TypeAdapter<T>) new TypeAdapter<SimilarityOfUserForUser>() {
           @Override
           public void write(JsonWriter out, SimilarityOfUserForUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimilarityOfUserForUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SimilarityOfUserForUser given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SimilarityOfUserForUser
   * @throws IOException if the JSON string is invalid with respect to SimilarityOfUserForUser
   */
  public static SimilarityOfUserForUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimilarityOfUserForUser.class);
  }

  /**
   * Convert an instance of SimilarityOfUserForUser to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

