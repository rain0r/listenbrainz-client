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
import java.util.UUID;
import org.hihn.listenbrainz.LookupMetadata;

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
 * Lookup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T20:56:43.728532+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class Lookup {
  public static final String SERIALIZED_NAME_ARTIST_CREDIT_NAME = "artist_credit_name";
  @SerializedName(SERIALIZED_NAME_ARTIST_CREDIT_NAME)
  private String artistCreditName;

  public static final String SERIALIZED_NAME_ARTIST_MBIDS = "artist_mbids";
  @SerializedName(SERIALIZED_NAME_ARTIST_MBIDS)
  private List<UUID> artistMbids = new ArrayList<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private LookupMetadata metadata;

  public static final String SERIALIZED_NAME_RECORDING_MBID = "recording_mbid";
  @SerializedName(SERIALIZED_NAME_RECORDING_MBID)
  private UUID recordingMbid;

  public static final String SERIALIZED_NAME_RECORDING_NAME = "recording_name";
  @SerializedName(SERIALIZED_NAME_RECORDING_NAME)
  private String recordingName;

  public static final String SERIALIZED_NAME_RELEASE_MBID = "release_mbid";
  @SerializedName(SERIALIZED_NAME_RELEASE_MBID)
  private UUID releaseMbid;

  public static final String SERIALIZED_NAME_RELEASE_NAME = "release_name";
  @SerializedName(SERIALIZED_NAME_RELEASE_NAME)
  private String releaseName;

  public Lookup() {
  }

  public Lookup artistCreditName(String artistCreditName) {
    this.artistCreditName = artistCreditName;
    return this;
  }

  /**
   * Get artistCreditName
   * @return artistCreditName
   */
  @javax.annotation.Nullable
  public String getArtistCreditName() {
    return artistCreditName;
  }

  public void setArtistCreditName(String artistCreditName) {
    this.artistCreditName = artistCreditName;
  }


  public Lookup artistMbids(List<UUID> artistMbids) {
    this.artistMbids = artistMbids;
    return this;
  }

  public Lookup addArtistMbidsItem(UUID artistMbidsItem) {
    if (this.artistMbids == null) {
      this.artistMbids = new ArrayList<>();
    }
    this.artistMbids.add(artistMbidsItem);
    return this;
  }

  /**
   * Get artistMbids
   * @return artistMbids
   */
  @javax.annotation.Nullable
  public List<UUID> getArtistMbids() {
    return artistMbids;
  }

  public void setArtistMbids(List<UUID> artistMbids) {
    this.artistMbids = artistMbids;
  }


  public Lookup metadata(LookupMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @javax.annotation.Nullable
  public LookupMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(LookupMetadata metadata) {
    this.metadata = metadata;
  }


  public Lookup recordingMbid(UUID recordingMbid) {
    this.recordingMbid = recordingMbid;
    return this;
  }

  /**
   * Get recordingMbid
   * @return recordingMbid
   */
  @javax.annotation.Nullable
  public UUID getRecordingMbid() {
    return recordingMbid;
  }

  public void setRecordingMbid(UUID recordingMbid) {
    this.recordingMbid = recordingMbid;
  }


  public Lookup recordingName(String recordingName) {
    this.recordingName = recordingName;
    return this;
  }

  /**
   * Get recordingName
   * @return recordingName
   */
  @javax.annotation.Nullable
  public String getRecordingName() {
    return recordingName;
  }

  public void setRecordingName(String recordingName) {
    this.recordingName = recordingName;
  }


  public Lookup releaseMbid(UUID releaseMbid) {
    this.releaseMbid = releaseMbid;
    return this;
  }

  /**
   * Get releaseMbid
   * @return releaseMbid
   */
  @javax.annotation.Nullable
  public UUID getReleaseMbid() {
    return releaseMbid;
  }

  public void setReleaseMbid(UUID releaseMbid) {
    this.releaseMbid = releaseMbid;
  }


  public Lookup releaseName(String releaseName) {
    this.releaseName = releaseName;
    return this;
  }

  /**
   * Get releaseName
   * @return releaseName
   */
  @javax.annotation.Nullable
  public String getReleaseName() {
    return releaseName;
  }

  public void setReleaseName(String releaseName) {
    this.releaseName = releaseName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lookup lookup = (Lookup) o;
    return Objects.equals(this.artistCreditName, lookup.artistCreditName) &&
        Objects.equals(this.artistMbids, lookup.artistMbids) &&
        Objects.equals(this.metadata, lookup.metadata) &&
        Objects.equals(this.recordingMbid, lookup.recordingMbid) &&
        Objects.equals(this.recordingName, lookup.recordingName) &&
        Objects.equals(this.releaseMbid, lookup.releaseMbid) &&
        Objects.equals(this.releaseName, lookup.releaseName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistCreditName, artistMbids, metadata, recordingMbid, recordingName, releaseMbid, releaseName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lookup {\n");
    sb.append("    artistCreditName: ").append(toIndentedString(artistCreditName)).append("\n");
    sb.append("    artistMbids: ").append(toIndentedString(artistMbids)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    recordingMbid: ").append(toIndentedString(recordingMbid)).append("\n");
    sb.append("    recordingName: ").append(toIndentedString(recordingName)).append("\n");
    sb.append("    releaseMbid: ").append(toIndentedString(releaseMbid)).append("\n");
    sb.append("    releaseName: ").append(toIndentedString(releaseName)).append("\n");
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
    openapiFields.add("artist_credit_name");
    openapiFields.add("artist_mbids");
    openapiFields.add("metadata");
    openapiFields.add("recording_mbid");
    openapiFields.add("recording_name");
    openapiFields.add("release_mbid");
    openapiFields.add("release_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Lookup
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Lookup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Lookup is not found in the empty JSON string", Lookup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Lookup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Lookup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("artist_credit_name") != null && !jsonObj.get("artist_credit_name").isJsonNull()) && !jsonObj.get("artist_credit_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_credit_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("artist_credit_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("artist_mbids") != null && !jsonObj.get("artist_mbids").isJsonNull() && !jsonObj.get("artist_mbids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_mbids` to be an array in the JSON string but got `%s`", jsonObj.get("artist_mbids").toString()));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        LookupMetadata.validateJsonElement(jsonObj.get("metadata"));
      }
      if ((jsonObj.get("recording_mbid") != null && !jsonObj.get("recording_mbid").isJsonNull()) && !jsonObj.get("recording_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recording_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recording_mbid").toString()));
      }
      if ((jsonObj.get("recording_name") != null && !jsonObj.get("recording_name").isJsonNull()) && !jsonObj.get("recording_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recording_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recording_name").toString()));
      }
      if ((jsonObj.get("release_mbid") != null && !jsonObj.get("release_mbid").isJsonNull()) && !jsonObj.get("release_mbid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_mbid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_mbid").toString()));
      }
      if ((jsonObj.get("release_name") != null && !jsonObj.get("release_name").isJsonNull()) && !jsonObj.get("release_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Lookup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Lookup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Lookup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Lookup.class));

       return (TypeAdapter<T>) new TypeAdapter<Lookup>() {
           @Override
           public void write(JsonWriter out, Lookup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Lookup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Lookup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Lookup
   * @throws IOException if the JSON string is invalid with respect to Lookup
   */
  public static Lookup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Lookup.class);
  }

  /**
   * Convert an instance of Lookup to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

