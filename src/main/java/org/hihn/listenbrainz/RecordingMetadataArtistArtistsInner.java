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
import org.hihn.listenbrainz.Rels1;

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
 * RecordingMetadataArtistArtistsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class RecordingMetadataArtistArtistsInner {
  public static final String SERIALIZED_NAME_AREA = "area";
  @SerializedName(SERIALIZED_NAME_AREA)
  private String area;

  public static final String SERIALIZED_NAME_ARTIST_MBID = "artist_mbid";
  @SerializedName(SERIALIZED_NAME_ARTIST_MBID)
  private UUID artistMbid;

  public static final String SERIALIZED_NAME_BEGIN_YEAR = "begin_year";
  @SerializedName(SERIALIZED_NAME_BEGIN_YEAR)
  private Integer beginYear;

  public static final String SERIALIZED_NAME_JOIN_PHRASE = "join_phrase";
  @SerializedName(SERIALIZED_NAME_JOIN_PHRASE)
  private String joinPhrase;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RELS = "rels";
  @SerializedName(SERIALIZED_NAME_RELS)
  private Rels1 rels;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public RecordingMetadataArtistArtistsInner() {
  }

  public RecordingMetadataArtistArtistsInner area(String area) {
    this.area = area;
    return this;
  }

  /**
   * Get area
   * @return area
   */
  @javax.annotation.Nullable
  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }


  public RecordingMetadataArtistArtistsInner artistMbid(UUID artistMbid) {
    this.artistMbid = artistMbid;
    return this;
  }

  /**
   * Get artistMbid
   * @return artistMbid
   */
  @javax.annotation.Nullable
  public UUID getArtistMbid() {
    return artistMbid;
  }

  public void setArtistMbid(UUID artistMbid) {
    this.artistMbid = artistMbid;
  }


  public RecordingMetadataArtistArtistsInner beginYear(Integer beginYear) {
    this.beginYear = beginYear;
    return this;
  }

  /**
   * Get beginYear
   * @return beginYear
   */
  @javax.annotation.Nullable
  public Integer getBeginYear() {
    return beginYear;
  }

  public void setBeginYear(Integer beginYear) {
    this.beginYear = beginYear;
  }


  public RecordingMetadataArtistArtistsInner joinPhrase(String joinPhrase) {
    this.joinPhrase = joinPhrase;
    return this;
  }

  /**
   * Get joinPhrase
   * @return joinPhrase
   */
  @javax.annotation.Nullable
  public String getJoinPhrase() {
    return joinPhrase;
  }

  public void setJoinPhrase(String joinPhrase) {
    this.joinPhrase = joinPhrase;
  }


  public RecordingMetadataArtistArtistsInner name(String name) {
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


  public RecordingMetadataArtistArtistsInner rels(Rels1 rels) {
    this.rels = rels;
    return this;
  }

  /**
   * Get rels
   * @return rels
   */
  @javax.annotation.Nullable
  public Rels1 getRels() {
    return rels;
  }

  public void setRels(Rels1 rels) {
    this.rels = rels;
  }


  public RecordingMetadataArtistArtistsInner type(String type) {
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
    RecordingMetadataArtistArtistsInner recordingMetadataArtistArtistsInner = (RecordingMetadataArtistArtistsInner) o;
    return Objects.equals(this.area, recordingMetadataArtistArtistsInner.area) &&
        Objects.equals(this.artistMbid, recordingMetadataArtistArtistsInner.artistMbid) &&
        Objects.equals(this.beginYear, recordingMetadataArtistArtistsInner.beginYear) &&
        Objects.equals(this.joinPhrase, recordingMetadataArtistArtistsInner.joinPhrase) &&
        Objects.equals(this.name, recordingMetadataArtistArtistsInner.name) &&
        Objects.equals(this.rels, recordingMetadataArtistArtistsInner.rels) &&
        Objects.equals(this.type, recordingMetadataArtistArtistsInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, artistMbid, beginYear, joinPhrase, name, rels, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingMetadataArtistArtistsInner {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    artistMbid: ").append(toIndentedString(artistMbid)).append("\n");
    sb.append("    beginYear: ").append(toIndentedString(beginYear)).append("\n");
    sb.append("    joinPhrase: ").append(toIndentedString(joinPhrase)).append("\n");
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
    openapiFields.add("area");
    openapiFields.add("artist_mbid");
    openapiFields.add("begin_year");
    openapiFields.add("join_phrase");
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
   * @throws IOException if the JSON Element is invalid with respect to RecordingMetadataArtistArtistsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecordingMetadataArtistArtistsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordingMetadataArtistArtistsInner is not found in the empty JSON string", RecordingMetadataArtistArtistsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecordingMetadataArtistArtistsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordingMetadataArtistArtistsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("area") != null && !jsonObj.get("area").isJsonNull()) && !jsonObj.get("area").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `area` to be a primitive type in the JSON string but got `%s`", jsonObj.get("area").toString()));
      }
      if ((jsonObj.get("artist_mbid") != null && !jsonObj.get("artist_mbid").isJsonNull()) && !jsonObj.get("artist_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artist_mbid").toString()));
      }
      if ((jsonObj.get("join_phrase") != null && !jsonObj.get("join_phrase").isJsonNull()) && !jsonObj.get("join_phrase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `join_phrase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("join_phrase").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `rels`
      if (jsonObj.get("rels") != null && !jsonObj.get("rels").isJsonNull()) {
        Rels1.validateJsonElement(jsonObj.get("rels"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordingMetadataArtistArtistsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordingMetadataArtistArtistsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordingMetadataArtistArtistsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordingMetadataArtistArtistsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordingMetadataArtistArtistsInner>() {
           @Override
           public void write(JsonWriter out, RecordingMetadataArtistArtistsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordingMetadataArtistArtistsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecordingMetadataArtistArtistsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecordingMetadataArtistArtistsInner
   * @throws IOException if the JSON string is invalid with respect to RecordingMetadataArtistArtistsInner
   */
  public static RecordingMetadataArtistArtistsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordingMetadataArtistArtistsInner.class);
  }

  /**
   * Convert an instance of RecordingMetadataArtistArtistsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

