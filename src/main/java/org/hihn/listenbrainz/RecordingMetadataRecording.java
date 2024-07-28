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
import org.hihn.listenbrainz.Rels;

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
 * RecordingMetadataRecording
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T20:56:43.728532+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class RecordingMetadataRecording {
  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private Integer length;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RELS = "rels";
  @SerializedName(SERIALIZED_NAME_RELS)
  private List<Rels> rels = new ArrayList<>();

  public RecordingMetadataRecording() {
  }

  public RecordingMetadataRecording length(Integer length) {
    this.length = length;
    return this;
  }

  /**
   * Get length
   * @return length
   */
  @javax.annotation.Nullable
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }


  public RecordingMetadataRecording name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public RecordingMetadataRecording rels(List<Rels> rels) {
    this.rels = rels;
    return this;
  }

  public RecordingMetadataRecording addRelsItem(Rels relsItem) {
    if (this.rels == null) {
      this.rels = new ArrayList<>();
    }
    this.rels.add(relsItem);
    return this;
  }

  /**
   * Get rels
   * @return rels
   */
  @javax.annotation.Nullable
  public List<Rels> getRels() {
    return rels;
  }

  public void setRels(List<Rels> rels) {
    this.rels = rels;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingMetadataRecording recordingMetadataRecording = (RecordingMetadataRecording) o;
    return Objects.equals(this.length, recordingMetadataRecording.length) &&
        Objects.equals(this.name, recordingMetadataRecording.name) &&
        Objects.equals(this.rels, recordingMetadataRecording.rels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, name, rels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingMetadataRecording {\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rels: ").append(toIndentedString(rels)).append("\n");
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
    openapiFields.add("length");
    openapiFields.add("name");
    openapiFields.add("rels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecordingMetadataRecording
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecordingMetadataRecording.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordingMetadataRecording is not found in the empty JSON string", RecordingMetadataRecording.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecordingMetadataRecording.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordingMetadataRecording` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("rels") != null && !jsonObj.get("rels").isJsonNull()) {
        JsonArray jsonArrayrels = jsonObj.getAsJsonArray("rels");
        if (jsonArrayrels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rels` to be an array in the JSON string but got `%s`", jsonObj.get("rels").toString()));
          }

          // validate the optional field `rels` (array)
          for (int i = 0; i < jsonArrayrels.size(); i++) {
            Rels.validateJsonElement(jsonArrayrels.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordingMetadataRecording.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordingMetadataRecording' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordingMetadataRecording> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordingMetadataRecording.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordingMetadataRecording>() {
           @Override
           public void write(JsonWriter out, RecordingMetadataRecording value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordingMetadataRecording read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecordingMetadataRecording given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecordingMetadataRecording
   * @throws IOException if the JSON string is invalid with respect to RecordingMetadataRecording
   */
  public static RecordingMetadataRecording fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordingMetadataRecording.class);
  }

  /**
   * Convert an instance of RecordingMetadataRecording to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

