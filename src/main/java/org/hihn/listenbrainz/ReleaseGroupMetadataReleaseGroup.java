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
import java.util.Map;
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
 * ReleaseGroupMetadataReleaseGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ReleaseGroupMetadataReleaseGroup {
  public static final String SERIALIZED_NAME_CAA_ID = "caa_id";
  @SerializedName(SERIALIZED_NAME_CAA_ID)
  private Integer caaId;

  public static final String SERIALIZED_NAME_CAA_RELEASE_MBID = "caa_release_mbid";
  @SerializedName(SERIALIZED_NAME_CAA_RELEASE_MBID)
  private UUID caaReleaseMbid;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RELS = "rels";
  @SerializedName(SERIALIZED_NAME_RELS)
  private List<Map<String, String>> rels = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ReleaseGroupMetadataReleaseGroup() {
  }

  public ReleaseGroupMetadataReleaseGroup caaId(Integer caaId) {
    this.caaId = caaId;
    return this;
  }

  /**
   * Get caaId
   * @return caaId
   */
  @javax.annotation.Nullable
  public Integer getCaaId() {
    return caaId;
  }

  public void setCaaId(Integer caaId) {
    this.caaId = caaId;
  }


  public ReleaseGroupMetadataReleaseGroup caaReleaseMbid(UUID caaReleaseMbid) {
    this.caaReleaseMbid = caaReleaseMbid;
    return this;
  }

  /**
   * Get caaReleaseMbid
   * @return caaReleaseMbid
   */
  @javax.annotation.Nullable
  public UUID getCaaReleaseMbid() {
    return caaReleaseMbid;
  }

  public void setCaaReleaseMbid(UUID caaReleaseMbid) {
    this.caaReleaseMbid = caaReleaseMbid;
  }


  public ReleaseGroupMetadataReleaseGroup date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  public ReleaseGroupMetadataReleaseGroup name(String name) {
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


  public ReleaseGroupMetadataReleaseGroup rels(List<Map<String, String>> rels) {
    this.rels = rels;
    return this;
  }

  public ReleaseGroupMetadataReleaseGroup addRelsItem(Map<String, String> relsItem) {
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
  public List<Map<String, String>> getRels() {
    return rels;
  }

  public void setRels(List<Map<String, String>> rels) {
    this.rels = rels;
  }


  public ReleaseGroupMetadataReleaseGroup type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseGroupMetadataReleaseGroup releaseGroupMetadataReleaseGroup = (ReleaseGroupMetadataReleaseGroup) o;
    return Objects.equals(this.caaId, releaseGroupMetadataReleaseGroup.caaId) &&
        Objects.equals(this.caaReleaseMbid, releaseGroupMetadataReleaseGroup.caaReleaseMbid) &&
        Objects.equals(this.date, releaseGroupMetadataReleaseGroup.date) &&
        Objects.equals(this.name, releaseGroupMetadataReleaseGroup.name) &&
        Objects.equals(this.rels, releaseGroupMetadataReleaseGroup.rels) &&
        Objects.equals(this.type, releaseGroupMetadataReleaseGroup.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caaId, caaReleaseMbid, date, name, rels, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseGroupMetadataReleaseGroup {\n");
    sb.append("    caaId: ").append(toIndentedString(caaId)).append("\n");
    sb.append("    caaReleaseMbid: ").append(toIndentedString(caaReleaseMbid)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rels: ").append(toIndentedString(rels)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("caa_id");
    openapiFields.add("caa_release_mbid");
    openapiFields.add("date");
    openapiFields.add("name");
    openapiFields.add("rels");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReleaseGroupMetadataReleaseGroup
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReleaseGroupMetadataReleaseGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReleaseGroupMetadataReleaseGroup is not found in the empty JSON string", ReleaseGroupMetadataReleaseGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReleaseGroupMetadataReleaseGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReleaseGroupMetadataReleaseGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("caa_release_mbid") != null && !jsonObj.get("caa_release_mbid").isJsonNull()) && !jsonObj.get("caa_release_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caa_release_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caa_release_mbid").toString()));
      }
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rels") != null && !jsonObj.get("rels").isJsonNull() && !jsonObj.get("rels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rels` to be an array in the JSON string but got `%s`", jsonObj.get("rels").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReleaseGroupMetadataReleaseGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReleaseGroupMetadataReleaseGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReleaseGroupMetadataReleaseGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReleaseGroupMetadataReleaseGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<ReleaseGroupMetadataReleaseGroup>() {
           @Override
           public void write(JsonWriter out, ReleaseGroupMetadataReleaseGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReleaseGroupMetadataReleaseGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReleaseGroupMetadataReleaseGroup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReleaseGroupMetadataReleaseGroup
   * @throws IOException if the JSON string is invalid with respect to ReleaseGroupMetadataReleaseGroup
   */
  public static ReleaseGroupMetadataReleaseGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReleaseGroupMetadataReleaseGroup.class);
  }

  /**
   * Convert an instance of ReleaseGroupMetadataReleaseGroup to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

