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
import org.hihn.listenbrainz.PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrack;

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
 * PlaylistTrackInnerExtension
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:48:15.256271+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class PlaylistTrackInnerExtension {
  public static final String SERIALIZED_NAME_HTTPS_COLON_MUSICBRAINZ_ORG_DOC_JSPF_HASH_TRACK = "https://musicbrainz.org/doc/jspf#track";
  @SerializedName(SERIALIZED_NAME_HTTPS_COLON_MUSICBRAINZ_ORG_DOC_JSPF_HASH_TRACK)
  private PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrack httpsColonMusicbrainzOrgDocJspfHashTrack;

  public PlaylistTrackInnerExtension() {
  }

  public PlaylistTrackInnerExtension httpsColonMusicbrainzOrgDocJspfHashTrack(PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrack httpsColonMusicbrainzOrgDocJspfHashTrack) {
    this.httpsColonMusicbrainzOrgDocJspfHashTrack = httpsColonMusicbrainzOrgDocJspfHashTrack;
    return this;
  }

  /**
   * Get httpsColonMusicbrainzOrgDocJspfHashTrack
   * @return httpsColonMusicbrainzOrgDocJspfHashTrack
   */
  @javax.annotation.Nonnull
  public PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrack getHttpsColonMusicbrainzOrgDocJspfHashTrack() {
    return httpsColonMusicbrainzOrgDocJspfHashTrack;
  }

  public void setHttpsColonMusicbrainzOrgDocJspfHashTrack(PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrack httpsColonMusicbrainzOrgDocJspfHashTrack) {
    this.httpsColonMusicbrainzOrgDocJspfHashTrack = httpsColonMusicbrainzOrgDocJspfHashTrack;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistTrackInnerExtension playlistTrackInnerExtension = (PlaylistTrackInnerExtension) o;
    return Objects.equals(this.httpsColonMusicbrainzOrgDocJspfHashTrack, playlistTrackInnerExtension.httpsColonMusicbrainzOrgDocJspfHashTrack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpsColonMusicbrainzOrgDocJspfHashTrack);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistTrackInnerExtension {\n");
    sb.append("    httpsColonMusicbrainzOrgDocJspfHashTrack: ").append(toIndentedString(httpsColonMusicbrainzOrgDocJspfHashTrack)).append("\n");
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
    openapiFields.add("https://musicbrainz.org/doc/jspf#track");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("https://musicbrainz.org/doc/jspf#track");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PlaylistTrackInnerExtension
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PlaylistTrackInnerExtension.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlaylistTrackInnerExtension is not found in the empty JSON string", PlaylistTrackInnerExtension.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PlaylistTrackInnerExtension.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlaylistTrackInnerExtension` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PlaylistTrackInnerExtension.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `https://musicbrainz.org/doc/jspf#track`
      PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrack.validateJsonElement(jsonObj.get("https://musicbrainz.org/doc/jspf#track"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlaylistTrackInnerExtension.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlaylistTrackInnerExtension' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlaylistTrackInnerExtension> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlaylistTrackInnerExtension.class));

       return (TypeAdapter<T>) new TypeAdapter<PlaylistTrackInnerExtension>() {
           @Override
           public void write(JsonWriter out, PlaylistTrackInnerExtension value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlaylistTrackInnerExtension read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PlaylistTrackInnerExtension given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PlaylistTrackInnerExtension
   * @throws IOException if the JSON string is invalid with respect to PlaylistTrackInnerExtension
   */
  public static PlaylistTrackInnerExtension fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlaylistTrackInnerExtension.class);
  }

  /**
   * Convert an instance of PlaylistTrackInnerExtension to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

