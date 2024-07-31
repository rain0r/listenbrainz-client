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
import org.hihn.listenbrainz.ArtistMetadataTag;
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
 * ArtistMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class ArtistMetadata {
  public static final String SERIALIZED_NAME_AREA = "area";
  @SerializedName(SERIALIZED_NAME_AREA)
  private String area;

  public static final String SERIALIZED_NAME_ARTIST_MBID = "artist_mbid";
  @SerializedName(SERIALIZED_NAME_ARTIST_MBID)
  private UUID artistMbid;

  public static final String SERIALIZED_NAME_BEGIN_YEAR = "begin_year";
  @SerializedName(SERIALIZED_NAME_BEGIN_YEAR)
  private Integer beginYear;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_MBID = "mbid";
  @SerializedName(SERIALIZED_NAME_MBID)
  private String mbid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RELS = "rels";
  @SerializedName(SERIALIZED_NAME_RELS)
  private Rels1 rels;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private ArtistMetadataTag tag;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ArtistMetadata() {
  }

  public ArtistMetadata area(String area) {
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


  public ArtistMetadata artistMbid(UUID artistMbid) {
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


  public ArtistMetadata beginYear(Integer beginYear) {
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


  public ArtistMetadata gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  @javax.annotation.Nullable
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public ArtistMetadata mbid(String mbid) {
    this.mbid = mbid;
    return this;
  }

  /**
   * Get mbid
   * @return mbid
   */
  @javax.annotation.Nullable
  public String getMbid() {
    return mbid;
  }

  public void setMbid(String mbid) {
    this.mbid = mbid;
  }


  public ArtistMetadata name(String name) {
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


  public ArtistMetadata rels(Rels1 rels) {
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


  public ArtistMetadata tag(ArtistMetadataTag tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
   */
  @javax.annotation.Nullable
  public ArtistMetadataTag getTag() {
    return tag;
  }

  public void setTag(ArtistMetadataTag tag) {
    this.tag = tag;
  }


  public ArtistMetadata type(String type) {
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
    ArtistMetadata artistMetadata = (ArtistMetadata) o;
    return Objects.equals(this.area, artistMetadata.area) &&
        Objects.equals(this.artistMbid, artistMetadata.artistMbid) &&
        Objects.equals(this.beginYear, artistMetadata.beginYear) &&
        Objects.equals(this.gender, artistMetadata.gender) &&
        Objects.equals(this.mbid, artistMetadata.mbid) &&
        Objects.equals(this.name, artistMetadata.name) &&
        Objects.equals(this.rels, artistMetadata.rels) &&
        Objects.equals(this.tag, artistMetadata.tag) &&
        Objects.equals(this.type, artistMetadata.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, artistMbid, beginYear, gender, mbid, name, rels, tag, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtistMetadata {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    artistMbid: ").append(toIndentedString(artistMbid)).append("\n");
    sb.append("    beginYear: ").append(toIndentedString(beginYear)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    mbid: ").append(toIndentedString(mbid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rels: ").append(toIndentedString(rels)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("gender");
    openapiFields.add("mbid");
    openapiFields.add("name");
    openapiFields.add("rels");
    openapiFields.add("tag");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ArtistMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ArtistMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArtistMetadata is not found in the empty JSON string", ArtistMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ArtistMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ArtistMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("area") != null && !jsonObj.get("area").isJsonNull()) && !jsonObj.get("area").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `area` to be a primitive type in the JSON string but got `%s`", jsonObj.get("area").toString()));
      }
      if ((jsonObj.get("artist_mbid") != null && !jsonObj.get("artist_mbid").isJsonNull()) && !jsonObj.get("artist_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artist_mbid").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("mbid") != null && !jsonObj.get("mbid").isJsonNull()) && !jsonObj.get("mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mbid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `rels`
      if (jsonObj.get("rels") != null && !jsonObj.get("rels").isJsonNull()) {
        Rels1.validateJsonElement(jsonObj.get("rels"));
      }
      // validate the optional field `tag`
      if (jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) {
        ArtistMetadataTag.validateJsonElement(jsonObj.get("tag"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArtistMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArtistMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArtistMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArtistMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<ArtistMetadata>() {
           @Override
           public void write(JsonWriter out, ArtistMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ArtistMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ArtistMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ArtistMetadata
   * @throws IOException if the JSON string is invalid with respect to ArtistMetadata
   */
  public static ArtistMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArtistMetadata.class);
  }

  /**
   * Convert an instance of ArtistMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
