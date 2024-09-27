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
import org.hihn.listenbrainz.ListenType;
import org.hihn.listenbrainz.SubmitListensPayloadInner;

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
 * SubmitListens
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class SubmitListens {
  public static final String SERIALIZED_NAME_LISTEN_TYPE = "listen_type";
  @SerializedName(SERIALIZED_NAME_LISTEN_TYPE)
  private ListenType listenType;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private List<SubmitListensPayloadInner> payload = new ArrayList<>();

  public SubmitListens() {
  }

  public SubmitListens listenType(ListenType listenType) {
    this.listenType = listenType;
    return this;
  }

  /**
   * Get listenType
   * @return listenType
   */
  @javax.annotation.Nonnull
  public ListenType getListenType() {
    return listenType;
  }

  public void setListenType(ListenType listenType) {
    this.listenType = listenType;
  }


  public SubmitListens payload(List<SubmitListensPayloadInner> payload) {
    this.payload = payload;
    return this;
  }

  public SubmitListens addPayloadItem(SubmitListensPayloadInner payloadItem) {
    if (this.payload == null) {
      this.payload = new ArrayList<>();
    }
    this.payload.add(payloadItem);
    return this;
  }

  /**
   * Get payload
   * @return payload
   */
  @javax.annotation.Nonnull
  public List<SubmitListensPayloadInner> getPayload() {
    return payload;
  }

  public void setPayload(List<SubmitListensPayloadInner> payload) {
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
    SubmitListens submitListens = (SubmitListens) o;
    return Objects.equals(this.listenType, submitListens.listenType) &&
        Objects.equals(this.payload, submitListens.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listenType, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitListens {\n");
    sb.append("    listenType: ").append(toIndentedString(listenType)).append("\n");
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
    openapiFields.add("listen_type");
    openapiFields.add("payload");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("listen_type");
    openapiRequiredFields.add("payload");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SubmitListens
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubmitListens.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitListens is not found in the empty JSON string", SubmitListens.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubmitListens.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitListens` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubmitListens.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `listen_type`
      ListenType.validateJsonElement(jsonObj.get("listen_type"));
      // ensure the json data is an array
      if (!jsonObj.get("payload").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `payload` to be an array in the JSON string but got `%s`", jsonObj.get("payload").toString()));
      }

      JsonArray jsonArraypayload = jsonObj.getAsJsonArray("payload");
      // validate the required field `payload` (array)
      for (int i = 0; i < jsonArraypayload.size(); i++) {
        SubmitListensPayloadInner.validateJsonElement(jsonArraypayload.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitListens.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitListens' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitListens> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitListens.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitListens>() {
           @Override
           public void write(JsonWriter out, SubmitListens value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitListens read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SubmitListens given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubmitListens
   * @throws IOException if the JSON string is invalid with respect to SubmitListens
   */
  public static SubmitListens fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitListens.class);
  }

  /**
   * Convert an instance of SubmitListens to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

