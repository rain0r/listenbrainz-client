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
 * LatestImport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:48:15.256271+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class LatestImport {
  public static final String SERIALIZED_NAME_MUSICBRAINZ_ID = "musicbrainz_id";
  @SerializedName(SERIALIZED_NAME_MUSICBRAINZ_ID)
  private String musicbrainzId;

  public static final String SERIALIZED_NAME_LATEST_IMPORT = "latest_import";
  @SerializedName(SERIALIZED_NAME_LATEST_IMPORT)
  private String latestImport;

  public LatestImport() {
  }

  public LatestImport musicbrainzId(String musicbrainzId) {
    this.musicbrainzId = musicbrainzId;
    return this;
  }

  /**
   * the MusicBrainz ID of the user
   * @return musicbrainzId
   */
  @javax.annotation.Nonnull
  public String getMusicbrainzId() {
    return musicbrainzId;
  }

  public void setMusicbrainzId(String musicbrainzId) {
    this.musicbrainzId = musicbrainzId;
  }


  public LatestImport latestImport(String latestImport) {
    this.latestImport = latestImport;
    return this;
  }

  /**
   * the timestamp of the newest listen submitted in previous imports. Defaults to 0
   * @return latestImport
   */
  @javax.annotation.Nonnull
  public String getLatestImport() {
    return latestImport;
  }

  public void setLatestImport(String latestImport) {
    this.latestImport = latestImport;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LatestImport latestImport = (LatestImport) o;
    return Objects.equals(this.musicbrainzId, latestImport.musicbrainzId) &&
        Objects.equals(this.latestImport, latestImport.latestImport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(musicbrainzId, latestImport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LatestImport {\n");
    sb.append("    musicbrainzId: ").append(toIndentedString(musicbrainzId)).append("\n");
    sb.append("    latestImport: ").append(toIndentedString(latestImport)).append("\n");
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
    openapiFields.add("musicbrainz_id");
    openapiFields.add("latest_import");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("musicbrainz_id");
    openapiRequiredFields.add("latest_import");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LatestImport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LatestImport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LatestImport is not found in the empty JSON string", LatestImport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LatestImport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LatestImport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LatestImport.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("musicbrainz_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `musicbrainz_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("musicbrainz_id").toString()));
      }
      if (!jsonObj.get("latest_import").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latest_import` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latest_import").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LatestImport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LatestImport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LatestImport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LatestImport.class));

       return (TypeAdapter<T>) new TypeAdapter<LatestImport>() {
           @Override
           public void write(JsonWriter out, LatestImport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LatestImport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LatestImport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LatestImport
   * @throws IOException if the JSON string is invalid with respect to LatestImport
   */
  public static LatestImport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LatestImport.class);
  }

  /**
   * Convert an instance of LatestImport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

