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
import org.hihn.listenbrainz.MusicBrainzArtist;

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
 * TopReleaseGroupsForArtistInnerArtist
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class TopReleaseGroupsForArtistInnerArtist {
  public static final String SERIALIZED_NAME_ARTIST_CREDIT_ID = "artist_credit_id";
  @SerializedName(SERIALIZED_NAME_ARTIST_CREDIT_ID)
  private Integer artistCreditId;

  public static final String SERIALIZED_NAME_ARTISTS = "artists";
  @SerializedName(SERIALIZED_NAME_ARTISTS)
  private List<MusicBrainzArtist> artists = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public TopReleaseGroupsForArtistInnerArtist() {
  }

  public TopReleaseGroupsForArtistInnerArtist artistCreditId(Integer artistCreditId) {
    this.artistCreditId = artistCreditId;
    return this;
  }

  /**
   * Get artistCreditId
   * @return artistCreditId
   */
  @javax.annotation.Nullable
  public Integer getArtistCreditId() {
    return artistCreditId;
  }

  public void setArtistCreditId(Integer artistCreditId) {
    this.artistCreditId = artistCreditId;
  }


  public TopReleaseGroupsForArtistInnerArtist artists(List<MusicBrainzArtist> artists) {
    this.artists = artists;
    return this;
  }

  public TopReleaseGroupsForArtistInnerArtist addArtistsItem(MusicBrainzArtist artistsItem) {
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
  @javax.annotation.Nullable
  public List<MusicBrainzArtist> getArtists() {
    return artists;
  }

  public void setArtists(List<MusicBrainzArtist> artists) {
    this.artists = artists;
  }


  public TopReleaseGroupsForArtistInnerArtist name(String name) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopReleaseGroupsForArtistInnerArtist topReleaseGroupsForArtistInnerArtist = (TopReleaseGroupsForArtistInnerArtist) o;
    return Objects.equals(this.artistCreditId, topReleaseGroupsForArtistInnerArtist.artistCreditId) &&
        Objects.equals(this.artists, topReleaseGroupsForArtistInnerArtist.artists) &&
        Objects.equals(this.name, topReleaseGroupsForArtistInnerArtist.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistCreditId, artists, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopReleaseGroupsForArtistInnerArtist {\n");
    sb.append("    artistCreditId: ").append(toIndentedString(artistCreditId)).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("artist_credit_id");
    openapiFields.add("artists");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TopReleaseGroupsForArtistInnerArtist
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TopReleaseGroupsForArtistInnerArtist.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TopReleaseGroupsForArtistInnerArtist is not found in the empty JSON string", TopReleaseGroupsForArtistInnerArtist.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TopReleaseGroupsForArtistInnerArtist.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TopReleaseGroupsForArtistInnerArtist` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("artists") != null && !jsonObj.get("artists").isJsonNull()) {
        JsonArray jsonArrayartists = jsonObj.getAsJsonArray("artists");
        if (jsonArrayartists != null) {
          // ensure the json data is an array
          if (!jsonObj.get("artists").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `artists` to be an array in the JSON string but got `%s`", jsonObj.get("artists").toString()));
          }

          // validate the optional field `artists` (array)
          for (int i = 0; i < jsonArrayartists.size(); i++) {
            MusicBrainzArtist.validateJsonElement(jsonArrayartists.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TopReleaseGroupsForArtistInnerArtist.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TopReleaseGroupsForArtistInnerArtist' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TopReleaseGroupsForArtistInnerArtist> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TopReleaseGroupsForArtistInnerArtist.class));

       return (TypeAdapter<T>) new TypeAdapter<TopReleaseGroupsForArtistInnerArtist>() {
           @Override
           public void write(JsonWriter out, TopReleaseGroupsForArtistInnerArtist value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TopReleaseGroupsForArtistInnerArtist read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TopReleaseGroupsForArtistInnerArtist given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TopReleaseGroupsForArtistInnerArtist
   * @throws IOException if the JSON string is invalid with respect to TopReleaseGroupsForArtistInnerArtist
   */
  public static TopReleaseGroupsForArtistInnerArtist fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TopReleaseGroupsForArtistInnerArtist.class);
  }

  /**
   * Convert an instance of TopReleaseGroupsForArtistInnerArtist to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

