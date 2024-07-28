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
import org.hihn.listenbrainz.Pin200ResponsePinnedRecording;

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
 * Pin200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:54:13.371331+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class Pin200Response {
  public static final String SERIALIZED_NAME_PINNED_RECORDING = "pinned_recording";
  @SerializedName(SERIALIZED_NAME_PINNED_RECORDING)
  private Pin200ResponsePinnedRecording pinnedRecording;

  public Pin200Response() {
  }

  public Pin200Response pinnedRecording(Pin200ResponsePinnedRecording pinnedRecording) {
    this.pinnedRecording = pinnedRecording;
    return this;
  }

  /**
   * Get pinnedRecording
   * @return pinnedRecording
   */
  @javax.annotation.Nullable
  public Pin200ResponsePinnedRecording getPinnedRecording() {
    return pinnedRecording;
  }

  public void setPinnedRecording(Pin200ResponsePinnedRecording pinnedRecording) {
    this.pinnedRecording = pinnedRecording;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pin200Response pin200Response = (Pin200Response) o;
    return Objects.equals(this.pinnedRecording, pin200Response.pinnedRecording);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinnedRecording);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pin200Response {\n");
    sb.append("    pinnedRecording: ").append(toIndentedString(pinnedRecording)).append("\n");
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
    openapiFields.add("pinned_recording");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Pin200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Pin200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Pin200Response is not found in the empty JSON string", Pin200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Pin200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Pin200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `pinned_recording`
      if (jsonObj.get("pinned_recording") != null && !jsonObj.get("pinned_recording").isJsonNull()) {
        Pin200ResponsePinnedRecording.validateJsonElement(jsonObj.get("pinned_recording"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Pin200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Pin200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Pin200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Pin200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<Pin200Response>() {
           @Override
           public void write(JsonWriter out, Pin200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Pin200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Pin200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Pin200Response
   * @throws IOException if the JSON string is invalid with respect to Pin200Response
   */
  public static Pin200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Pin200Response.class);
  }

  /**
   * Convert an instance of Pin200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

