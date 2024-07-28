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
import org.hihn.listenbrainz.TopArtistsForUserPayloadArtistsInner;

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
 * SitewideTopArtistsPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T20:56:43.728532+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class SitewideTopArtistsPayload {
  public static final String SERIALIZED_NAME_ARTISTS = "artists";
  @SerializedName(SERIALIZED_NAME_ARTISTS)
  private List<TopArtistsForUserPayloadArtistsInner> artists = new ArrayList<>();

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_FROM_TS = "from_ts";
  @SerializedName(SERIALIZED_NAME_FROM_TS)
  private Integer fromTs;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private Integer lastUpdated;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private String range;

  public static final String SERIALIZED_NAME_TO_TS = "to_ts";
  @SerializedName(SERIALIZED_NAME_TO_TS)
  private Integer toTs;

  public SitewideTopArtistsPayload() {
  }

  public SitewideTopArtistsPayload artists(List<TopArtistsForUserPayloadArtistsInner> artists) {
    this.artists = artists;
    return this;
  }

  public SitewideTopArtistsPayload addArtistsItem(TopArtistsForUserPayloadArtistsInner artistsItem) {
    if (this.artists == null) {
      this.artists = new ArrayList<>();
    }
    this.artists.add(artistsItem);
    return this;
  }

  /**
   * Get artists
   * @return artists
   */
  @javax.annotation.Nonnull
  public List<TopArtistsForUserPayloadArtistsInner> getArtists() {
    return artists;
  }

  public void setArtists(List<TopArtistsForUserPayloadArtistsInner> artists) {
    this.artists = artists;
  }


  public SitewideTopArtistsPayload count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  @javax.annotation.Nonnull
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  public SitewideTopArtistsPayload fromTs(Integer fromTs) {
    this.fromTs = fromTs;
    return this;
  }

  /**
   * Get fromTs
   * @return fromTs
   */
  @javax.annotation.Nonnull
  public Integer getFromTs() {
    return fromTs;
  }

  public void setFromTs(Integer fromTs) {
    this.fromTs = fromTs;
  }


  public SitewideTopArtistsPayload lastUpdated(Integer lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Get lastUpdated
   * @return lastUpdated
   */
  @javax.annotation.Nonnull
  public Integer getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(Integer lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public SitewideTopArtistsPayload offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
   */
  @javax.annotation.Nonnull
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public SitewideTopArtistsPayload range(String range) {
    this.range = range;
    return this;
  }

  /**
   * Get range
   * @return range
   */
  @javax.annotation.Nonnull
  public String getRange() {
    return range;
  }

  public void setRange(String range) {
    this.range = range;
  }


  public SitewideTopArtistsPayload toTs(Integer toTs) {
    this.toTs = toTs;
    return this;
  }

  /**
   * Get toTs
   * @return toTs
   */
  @javax.annotation.Nonnull
  public Integer getToTs() {
    return toTs;
  }

  public void setToTs(Integer toTs) {
    this.toTs = toTs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SitewideTopArtistsPayload sitewideTopArtistsPayload = (SitewideTopArtistsPayload) o;
    return Objects.equals(this.artists, sitewideTopArtistsPayload.artists) &&
        Objects.equals(this.count, sitewideTopArtistsPayload.count) &&
        Objects.equals(this.fromTs, sitewideTopArtistsPayload.fromTs) &&
        Objects.equals(this.lastUpdated, sitewideTopArtistsPayload.lastUpdated) &&
        Objects.equals(this.offset, sitewideTopArtistsPayload.offset) &&
        Objects.equals(this.range, sitewideTopArtistsPayload.range) &&
        Objects.equals(this.toTs, sitewideTopArtistsPayload.toTs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artists, count, fromTs, lastUpdated, offset, range, toTs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SitewideTopArtistsPayload {\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    fromTs: ").append(toIndentedString(fromTs)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    toTs: ").append(toIndentedString(toTs)).append("\n");
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
    openapiFields.add("artists");
    openapiFields.add("count");
    openapiFields.add("from_ts");
    openapiFields.add("last_updated");
    openapiFields.add("offset");
    openapiFields.add("range");
    openapiFields.add("to_ts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("artists");
    openapiRequiredFields.add("count");
    openapiRequiredFields.add("from_ts");
    openapiRequiredFields.add("last_updated");
    openapiRequiredFields.add("offset");
    openapiRequiredFields.add("range");
    openapiRequiredFields.add("to_ts");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SitewideTopArtistsPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SitewideTopArtistsPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SitewideTopArtistsPayload is not found in the empty JSON string", SitewideTopArtistsPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SitewideTopArtistsPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SitewideTopArtistsPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SitewideTopArtistsPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("artists").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `artists` to be an array in the JSON string but got `%s`", jsonObj.get("artists").toString()));
      }

      JsonArray jsonArrayartists = jsonObj.getAsJsonArray("artists");
      // validate the required field `artists` (array)
      for (int i = 0; i < jsonArrayartists.size(); i++) {
        TopArtistsForUserPayloadArtistsInner.validateJsonElement(jsonArrayartists.get(i));
      };
      if (!jsonObj.get("range").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `range` to be a primitive type in the JSON string but got `%s`", jsonObj.get("range").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SitewideTopArtistsPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SitewideTopArtistsPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SitewideTopArtistsPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SitewideTopArtistsPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<SitewideTopArtistsPayload>() {
           @Override
           public void write(JsonWriter out, SitewideTopArtistsPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SitewideTopArtistsPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SitewideTopArtistsPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SitewideTopArtistsPayload
   * @throws IOException if the JSON string is invalid with respect to SitewideTopArtistsPayload
   */
  public static SitewideTopArtistsPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SitewideTopArtistsPayload.class);
  }

  /**
   * Convert an instance of SitewideTopArtistsPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

