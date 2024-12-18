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
 * CreateCoverArtGrid
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CreateCoverArtGrid {
  /**
   * The background for the cover art.
   */
  @JsonAdapter(BackgroundEnum.Adapter.class)
  public enum BackgroundEnum {
    TRANSPARENT("transparent"),
    
    WHITE("white"),
    
    BLACK("black");

    private String value;

    BackgroundEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BackgroundEnum fromValue(String value) {
      for (BackgroundEnum b : BackgroundEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BackgroundEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BackgroundEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BackgroundEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BackgroundEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      BackgroundEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_BACKGROUND = "background";
  @SerializedName(SERIALIZED_NAME_BACKGROUND)
  private BackgroundEnum background;

  public static final String SERIALIZED_NAME_IMAGE_SIZE = "image_size";
  @SerializedName(SERIALIZED_NAME_IMAGE_SIZE)
  private Integer imageSize;

  public static final String SERIALIZED_NAME_DIMENSION = "dimension";
  @SerializedName(SERIALIZED_NAME_DIMENSION)
  private Integer dimension;

  public static final String SERIALIZED_NAME_SKIP_MISSING = "skip-missing";
  @SerializedName(SERIALIZED_NAME_SKIP_MISSING)
  private Boolean skipMissing;

  public static final String SERIALIZED_NAME_SHOW_CAA = "show-caa";
  @SerializedName(SERIALIZED_NAME_SHOW_CAA)
  private Boolean showCaa;

  public static final String SERIALIZED_NAME_TILES = "tiles";
  @SerializedName(SERIALIZED_NAME_TILES)
  private List<String> tiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_RELEASE_MBIDS = "release_mbids";
  @SerializedName(SERIALIZED_NAME_RELEASE_MBIDS)
  private List<UUID> releaseMbids = new ArrayList<>();

  public CreateCoverArtGrid() {
  }

  public CreateCoverArtGrid background(BackgroundEnum background) {
    this.background = background;
    return this;
  }

  /**
   * The background for the cover art.
   * @return background
   */
  @javax.annotation.Nonnull
  public BackgroundEnum getBackground() {
    return background;
  }

  public void setBackground(BackgroundEnum background) {
    this.background = background;
  }


  public CreateCoverArtGrid imageSize(Integer imageSize) {
    this.imageSize = imageSize;
    return this;
  }

  /**
   * The size of the cover art image.
   * @return imageSize
   */
  @javax.annotation.Nonnull
  public Integer getImageSize() {
    return imageSize;
  }

  public void setImageSize(Integer imageSize) {
    this.imageSize = imageSize;
  }


  public CreateCoverArtGrid dimension(Integer dimension) {
    this.dimension = dimension;
    return this;
  }

  /**
   * The dimension to use for this grid. A grid of dimension 3 has 3 images across and 3 images down, for a total of 9 images.
   * @return dimension
   */
  @javax.annotation.Nonnull
  public Integer getDimension() {
    return dimension;
  }

  public void setDimension(Integer dimension) {
    this.dimension = dimension;
  }


  public CreateCoverArtGrid skipMissing(Boolean skipMissing) {
    this.skipMissing = skipMissing;
    return this;
  }

  /**
   * If cover art is missing for a given release_mbid, skip it and move on to the next one, if true is passed. If false, the show-caa option will decide what happens.
   * @return skipMissing
   */
  @javax.annotation.Nonnull
  public Boolean getSkipMissing() {
    return skipMissing;
  }

  public void setSkipMissing(Boolean skipMissing) {
    this.skipMissing = skipMissing;
  }


  public CreateCoverArtGrid showCaa(Boolean showCaa) {
    this.showCaa = showCaa;
    return this;
  }

  /**
   * If cover art is missing and skip-missing is false, then show-caa will determine if a blank square is shown or if the Cover Art Archive missing image is shown.
   * @return showCaa
   */
  @javax.annotation.Nonnull
  public Boolean getShowCaa() {
    return showCaa;
  }

  public void setShowCaa(Boolean showCaa) {
    this.showCaa = showCaa;
  }


  public CreateCoverArtGrid tiles(List<String> tiles) {
    this.tiles = tiles;
    return this;
  }

  public CreateCoverArtGrid addTilesItem(String tilesItem) {
    if (this.tiles == null) {
      this.tiles = new ArrayList<>();
    }
    this.tiles.add(tilesItem);
    return this;
  }

  /**
   * The tiles paramater is a list of strings that determines the location where cover art images should be placed. Each string is a comma separated list of image cells. A grid of dimension 3 has 9 cells, from 0 in the upper left hand corner, 2 in the upper right hand corner, 6 in the lower left corner and 8 in the lower right corner. Specifying only a single cell will have the image cover that cell exactly. If more than one cell is specified, the image will cover the area defined by the bounding box of all the given cells. These tiles only define bounding box areas - no clipping of images that may fall outside of these tiles will be performed.
   * @return tiles
   */
  @javax.annotation.Nonnull
  public List<String> getTiles() {
    return tiles;
  }

  public void setTiles(List<String> tiles) {
    this.tiles = tiles;
  }


  public CreateCoverArtGrid releaseMbids(List<UUID> releaseMbids) {
    this.releaseMbids = releaseMbids;
    return this;
  }

  public CreateCoverArtGrid addReleaseMbidsItem(UUID releaseMbidsItem) {
    if (this.releaseMbids == null) {
      this.releaseMbids = new ArrayList<>();
    }
    this.releaseMbids.add(releaseMbidsItem);
    return this;
  }

  /**
   * An ordered list of release_mbids. The images will be loaded and processed in the order that this list is in. The cover art for the release_mbids will be placed on the tiles defined by the tiles parameter.
   * @return releaseMbids
   */
  @javax.annotation.Nonnull
  public List<UUID> getReleaseMbids() {
    return releaseMbids;
  }

  public void setReleaseMbids(List<UUID> releaseMbids) {
    this.releaseMbids = releaseMbids;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCoverArtGrid createCoverArtGrid = (CreateCoverArtGrid) o;
    return Objects.equals(this.background, createCoverArtGrid.background) &&
        Objects.equals(this.imageSize, createCoverArtGrid.imageSize) &&
        Objects.equals(this.dimension, createCoverArtGrid.dimension) &&
        Objects.equals(this.skipMissing, createCoverArtGrid.skipMissing) &&
        Objects.equals(this.showCaa, createCoverArtGrid.showCaa) &&
        Objects.equals(this.tiles, createCoverArtGrid.tiles) &&
        Objects.equals(this.releaseMbids, createCoverArtGrid.releaseMbids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(background, imageSize, dimension, skipMissing, showCaa, tiles, releaseMbids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCoverArtGrid {\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    skipMissing: ").append(toIndentedString(skipMissing)).append("\n");
    sb.append("    showCaa: ").append(toIndentedString(showCaa)).append("\n");
    sb.append("    tiles: ").append(toIndentedString(tiles)).append("\n");
    sb.append("    releaseMbids: ").append(toIndentedString(releaseMbids)).append("\n");
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
    openapiFields.add("background");
    openapiFields.add("image_size");
    openapiFields.add("dimension");
    openapiFields.add("skip-missing");
    openapiFields.add("show-caa");
    openapiFields.add("tiles");
    openapiFields.add("release_mbids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("background");
    openapiRequiredFields.add("image_size");
    openapiRequiredFields.add("dimension");
    openapiRequiredFields.add("skip-missing");
    openapiRequiredFields.add("show-caa");
    openapiRequiredFields.add("tiles");
    openapiRequiredFields.add("release_mbids");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateCoverArtGrid
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateCoverArtGrid.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCoverArtGrid is not found in the empty JSON string", CreateCoverArtGrid.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateCoverArtGrid.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCoverArtGrid` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCoverArtGrid.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("background").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `background` to be a primitive type in the JSON string but got `%s`", jsonObj.get("background").toString()));
      }
      // validate the required field `background`
      BackgroundEnum.validateJsonElement(jsonObj.get("background"));
      // ensure the required json array is present
      if (jsonObj.get("tiles") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tiles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tiles` to be an array in the JSON string but got `%s`", jsonObj.get("tiles").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("release_mbids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("release_mbids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_mbids` to be an array in the JSON string but got `%s`", jsonObj.get("release_mbids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCoverArtGrid.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCoverArtGrid' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCoverArtGrid> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCoverArtGrid.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCoverArtGrid>() {
           @Override
           public void write(JsonWriter out, CreateCoverArtGrid value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCoverArtGrid read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateCoverArtGrid given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateCoverArtGrid
   * @throws IOException if the JSON string is invalid with respect to CreateCoverArtGrid
   */
  public static CreateCoverArtGrid fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCoverArtGrid.class);
  }

  /**
   * Convert an instance of CreateCoverArtGrid to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

