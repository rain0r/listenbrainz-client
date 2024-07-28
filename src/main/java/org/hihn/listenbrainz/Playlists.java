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
import org.hihn.listenbrainz.CreatePlaylistRequest;

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
 * Playlists
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:00:27.345003+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class Playlists {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_PLAYLIST_COUNT = "playlist_count";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_COUNT)
  private Integer playlistCount;

  public static final String SERIALIZED_NAME_PLAYLISTS = "playlists";
  @SerializedName(SERIALIZED_NAME_PLAYLISTS)
  private List<CreatePlaylistRequest> playlists = new ArrayList<>();

  public Playlists() {
  }

  public Playlists count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  @javax.annotation.Nullable
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  public Playlists offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
   */
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public Playlists playlistCount(Integer playlistCount) {
    this.playlistCount = playlistCount;
    return this;
  }

  /**
   * Get playlistCount
   * @return playlistCount
   */
  @javax.annotation.Nullable
  public Integer getPlaylistCount() {
    return playlistCount;
  }

  public void setPlaylistCount(Integer playlistCount) {
    this.playlistCount = playlistCount;
  }


  public Playlists playlists(List<CreatePlaylistRequest> playlists) {
    this.playlists = playlists;
    return this;
  }

  public Playlists addPlaylistsItem(CreatePlaylistRequest playlistsItem) {
    if (this.playlists == null) {
      this.playlists = new ArrayList<>();
    }
    this.playlists.add(playlistsItem);
    return this;
  }

  /**
   * Get playlists
   * @return playlists
   */
  @javax.annotation.Nullable
  public List<CreatePlaylistRequest> getPlaylists() {
    return playlists;
  }

  public void setPlaylists(List<CreatePlaylistRequest> playlists) {
    this.playlists = playlists;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Playlists playlists = (Playlists) o;
    return Objects.equals(this.count, playlists.count) &&
        Objects.equals(this.offset, playlists.offset) &&
        Objects.equals(this.playlistCount, playlists.playlistCount) &&
        Objects.equals(this.playlists, playlists.playlists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, offset, playlistCount, playlists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Playlists {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    playlistCount: ").append(toIndentedString(playlistCount)).append("\n");
    sb.append("    playlists: ").append(toIndentedString(playlists)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("offset");
    openapiFields.add("playlist_count");
    openapiFields.add("playlists");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Playlists
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Playlists.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Playlists is not found in the empty JSON string", Playlists.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Playlists.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Playlists` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("playlists") != null && !jsonObj.get("playlists").isJsonNull()) {
        JsonArray jsonArrayplaylists = jsonObj.getAsJsonArray("playlists");
        if (jsonArrayplaylists != null) {
          // ensure the json data is an array
          if (!jsonObj.get("playlists").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `playlists` to be an array in the JSON string but got `%s`", jsonObj.get("playlists").toString()));
          }

          // validate the optional field `playlists` (array)
          for (int i = 0; i < jsonArrayplaylists.size(); i++) {
            CreatePlaylistRequest.validateJsonElement(jsonArrayplaylists.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Playlists.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Playlists' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Playlists> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Playlists.class));

       return (TypeAdapter<T>) new TypeAdapter<Playlists>() {
           @Override
           public void write(JsonWriter out, Playlists value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Playlists read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Playlists given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Playlists
   * @throws IOException if the JSON string is invalid with respect to Playlists
   */
  public static Playlists fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Playlists.class);
  }

  /**
   * Convert an instance of Playlists to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

