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
 * Rels1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class Rels1 {
  public static final String SERIALIZED_NAME_FREE_STREAMING = "free streaming";
  @SerializedName(SERIALIZED_NAME_FREE_STREAMING)
  private String freeStreaming;

  public static final String SERIALIZED_NAME_LYRICS = "lyrics";
  @SerializedName(SERIALIZED_NAME_LYRICS)
  private String lyrics;

  public static final String SERIALIZED_NAME_OFFICIAL_HOMEPAGE = "official homepage";
  @SerializedName(SERIALIZED_NAME_OFFICIAL_HOMEPAGE)
  private String officialHomepage;

  public static final String SERIALIZED_NAME_PURCHASE_FOR_DOWNLOAD = "purchase for download";
  @SerializedName(SERIALIZED_NAME_PURCHASE_FOR_DOWNLOAD)
  private String purchaseForDownload;

  public static final String SERIALIZED_NAME_DOWNLOAD_FOR_FREE = "download for free";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_FOR_FREE)
  private String downloadForFree;

  public static final String SERIALIZED_NAME_PURCHASE_FOR_MAIL_ORDER = "purchase for mail-order";
  @SerializedName(SERIALIZED_NAME_PURCHASE_FOR_MAIL_ORDER)
  private String purchaseForMailOrder;

  public static final String SERIALIZED_NAME_SOCIAL_NETWORK = "social network";
  @SerializedName(SERIALIZED_NAME_SOCIAL_NETWORK)
  private String socialNetwork;

  public static final String SERIALIZED_NAME_STREAMING = "streaming";
  @SerializedName(SERIALIZED_NAME_STREAMING)
  private String streaming;

  public static final String SERIALIZED_NAME_WIKIDATA = "wikidata";
  @SerializedName(SERIALIZED_NAME_WIKIDATA)
  private String wikidata;

  public static final String SERIALIZED_NAME_YOUTUBE = "youtube";
  @SerializedName(SERIALIZED_NAME_YOUTUBE)
  private String youtube;

  public static final String SERIALIZED_NAME_PATRONAGE = "patronage";
  @SerializedName(SERIALIZED_NAME_PATRONAGE)
  private String patronage;

  public static final String SERIALIZED_NAME_CROWDFUNDING = "crowdfunding";
  @SerializedName(SERIALIZED_NAME_CROWDFUNDING)
  private String crowdfunding;

  public static final String SERIALIZED_NAME_BLOG = "blog";
  @SerializedName(SERIALIZED_NAME_BLOG)
  private String blog;

  public Rels1() {
  }

  public Rels1 freeStreaming(String freeStreaming) {
    this.freeStreaming = freeStreaming;
    return this;
  }

  /**
   * Get freeStreaming
   * @return freeStreaming
   */
  @javax.annotation.Nullable
  public String getFreeStreaming() {
    return freeStreaming;
  }

  public void setFreeStreaming(String freeStreaming) {
    this.freeStreaming = freeStreaming;
  }


  public Rels1 lyrics(String lyrics) {
    this.lyrics = lyrics;
    return this;
  }

  /**
   * Get lyrics
   * @return lyrics
   */
  @javax.annotation.Nullable
  public String getLyrics() {
    return lyrics;
  }

  public void setLyrics(String lyrics) {
    this.lyrics = lyrics;
  }


  public Rels1 officialHomepage(String officialHomepage) {
    this.officialHomepage = officialHomepage;
    return this;
  }

  /**
   * Get officialHomepage
   * @return officialHomepage
   */
  @javax.annotation.Nullable
  public String getOfficialHomepage() {
    return officialHomepage;
  }

  public void setOfficialHomepage(String officialHomepage) {
    this.officialHomepage = officialHomepage;
  }


  public Rels1 purchaseForDownload(String purchaseForDownload) {
    this.purchaseForDownload = purchaseForDownload;
    return this;
  }

  /**
   * Get purchaseForDownload
   * @return purchaseForDownload
   */
  @javax.annotation.Nullable
  public String getPurchaseForDownload() {
    return purchaseForDownload;
  }

  public void setPurchaseForDownload(String purchaseForDownload) {
    this.purchaseForDownload = purchaseForDownload;
  }


  public Rels1 downloadForFree(String downloadForFree) {
    this.downloadForFree = downloadForFree;
    return this;
  }

  /**
   * Get downloadForFree
   * @return downloadForFree
   */
  @javax.annotation.Nullable
  public String getDownloadForFree() {
    return downloadForFree;
  }

  public void setDownloadForFree(String downloadForFree) {
    this.downloadForFree = downloadForFree;
  }


  public Rels1 purchaseForMailOrder(String purchaseForMailOrder) {
    this.purchaseForMailOrder = purchaseForMailOrder;
    return this;
  }

  /**
   * Get purchaseForMailOrder
   * @return purchaseForMailOrder
   */
  @javax.annotation.Nullable
  public String getPurchaseForMailOrder() {
    return purchaseForMailOrder;
  }

  public void setPurchaseForMailOrder(String purchaseForMailOrder) {
    this.purchaseForMailOrder = purchaseForMailOrder;
  }


  public Rels1 socialNetwork(String socialNetwork) {
    this.socialNetwork = socialNetwork;
    return this;
  }

  /**
   * Get socialNetwork
   * @return socialNetwork
   */
  @javax.annotation.Nullable
  public String getSocialNetwork() {
    return socialNetwork;
  }

  public void setSocialNetwork(String socialNetwork) {
    this.socialNetwork = socialNetwork;
  }


  public Rels1 streaming(String streaming) {
    this.streaming = streaming;
    return this;
  }

  /**
   * Get streaming
   * @return streaming
   */
  @javax.annotation.Nullable
  public String getStreaming() {
    return streaming;
  }

  public void setStreaming(String streaming) {
    this.streaming = streaming;
  }


  public Rels1 wikidata(String wikidata) {
    this.wikidata = wikidata;
    return this;
  }

  /**
   * Get wikidata
   * @return wikidata
   */
  @javax.annotation.Nullable
  public String getWikidata() {
    return wikidata;
  }

  public void setWikidata(String wikidata) {
    this.wikidata = wikidata;
  }


  public Rels1 youtube(String youtube) {
    this.youtube = youtube;
    return this;
  }

  /**
   * Get youtube
   * @return youtube
   */
  @javax.annotation.Nullable
  public String getYoutube() {
    return youtube;
  }

  public void setYoutube(String youtube) {
    this.youtube = youtube;
  }


  public Rels1 patronage(String patronage) {
    this.patronage = patronage;
    return this;
  }

  /**
   * Get patronage
   * @return patronage
   */
  @javax.annotation.Nullable
  public String getPatronage() {
    return patronage;
  }

  public void setPatronage(String patronage) {
    this.patronage = patronage;
  }


  public Rels1 crowdfunding(String crowdfunding) {
    this.crowdfunding = crowdfunding;
    return this;
  }

  /**
   * Get crowdfunding
   * @return crowdfunding
   */
  @javax.annotation.Nullable
  public String getCrowdfunding() {
    return crowdfunding;
  }

  public void setCrowdfunding(String crowdfunding) {
    this.crowdfunding = crowdfunding;
  }


  public Rels1 blog(String blog) {
    this.blog = blog;
    return this;
  }

  /**
   * Get blog
   * @return blog
   */
  @javax.annotation.Nullable
  public String getBlog() {
    return blog;
  }

  public void setBlog(String blog) {
    this.blog = blog;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rels1 rels1 = (Rels1) o;
    return Objects.equals(this.freeStreaming, rels1.freeStreaming) &&
        Objects.equals(this.lyrics, rels1.lyrics) &&
        Objects.equals(this.officialHomepage, rels1.officialHomepage) &&
        Objects.equals(this.purchaseForDownload, rels1.purchaseForDownload) &&
        Objects.equals(this.downloadForFree, rels1.downloadForFree) &&
        Objects.equals(this.purchaseForMailOrder, rels1.purchaseForMailOrder) &&
        Objects.equals(this.socialNetwork, rels1.socialNetwork) &&
        Objects.equals(this.streaming, rels1.streaming) &&
        Objects.equals(this.wikidata, rels1.wikidata) &&
        Objects.equals(this.youtube, rels1.youtube) &&
        Objects.equals(this.patronage, rels1.patronage) &&
        Objects.equals(this.crowdfunding, rels1.crowdfunding) &&
        Objects.equals(this.blog, rels1.blog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeStreaming, lyrics, officialHomepage, purchaseForDownload, downloadForFree, purchaseForMailOrder, socialNetwork, streaming, wikidata, youtube, patronage, crowdfunding, blog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rels1 {\n");
    sb.append("    freeStreaming: ").append(toIndentedString(freeStreaming)).append("\n");
    sb.append("    lyrics: ").append(toIndentedString(lyrics)).append("\n");
    sb.append("    officialHomepage: ").append(toIndentedString(officialHomepage)).append("\n");
    sb.append("    purchaseForDownload: ").append(toIndentedString(purchaseForDownload)).append("\n");
    sb.append("    downloadForFree: ").append(toIndentedString(downloadForFree)).append("\n");
    sb.append("    purchaseForMailOrder: ").append(toIndentedString(purchaseForMailOrder)).append("\n");
    sb.append("    socialNetwork: ").append(toIndentedString(socialNetwork)).append("\n");
    sb.append("    streaming: ").append(toIndentedString(streaming)).append("\n");
    sb.append("    wikidata: ").append(toIndentedString(wikidata)).append("\n");
    sb.append("    youtube: ").append(toIndentedString(youtube)).append("\n");
    sb.append("    patronage: ").append(toIndentedString(patronage)).append("\n");
    sb.append("    crowdfunding: ").append(toIndentedString(crowdfunding)).append("\n");
    sb.append("    blog: ").append(toIndentedString(blog)).append("\n");
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
    openapiFields.add("free streaming");
    openapiFields.add("lyrics");
    openapiFields.add("official homepage");
    openapiFields.add("purchase for download");
    openapiFields.add("download for free");
    openapiFields.add("purchase for mail-order");
    openapiFields.add("social network");
    openapiFields.add("streaming");
    openapiFields.add("wikidata");
    openapiFields.add("youtube");
    openapiFields.add("patronage");
    openapiFields.add("crowdfunding");
    openapiFields.add("blog");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Rels1
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Rels1.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Rels1 is not found in the empty JSON string", Rels1.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Rels1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Rels1` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("free streaming") != null && !jsonObj.get("free streaming").isJsonNull()) && !jsonObj.get("free streaming").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `free streaming` to be a primitive type in the JSON string but got `%s`", jsonObj.get("free streaming").toString()));
      }
      if ((jsonObj.get("lyrics") != null && !jsonObj.get("lyrics").isJsonNull()) && !jsonObj.get("lyrics").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lyrics` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lyrics").toString()));
      }
      if ((jsonObj.get("official homepage") != null && !jsonObj.get("official homepage").isJsonNull()) && !jsonObj.get("official homepage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `official homepage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("official homepage").toString()));
      }
      if ((jsonObj.get("purchase for download") != null && !jsonObj.get("purchase for download").isJsonNull()) && !jsonObj.get("purchase for download").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purchase for download` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purchase for download").toString()));
      }
      if ((jsonObj.get("download for free") != null && !jsonObj.get("download for free").isJsonNull()) && !jsonObj.get("download for free").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `download for free` to be a primitive type in the JSON string but got `%s`", jsonObj.get("download for free").toString()));
      }
      if ((jsonObj.get("purchase for mail-order") != null && !jsonObj.get("purchase for mail-order").isJsonNull()) && !jsonObj.get("purchase for mail-order").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purchase for mail-order` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purchase for mail-order").toString()));
      }
      if ((jsonObj.get("social network") != null && !jsonObj.get("social network").isJsonNull()) && !jsonObj.get("social network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `social network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("social network").toString()));
      }
      if ((jsonObj.get("streaming") != null && !jsonObj.get("streaming").isJsonNull()) && !jsonObj.get("streaming").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `streaming` to be a primitive type in the JSON string but got `%s`", jsonObj.get("streaming").toString()));
      }
      if ((jsonObj.get("wikidata") != null && !jsonObj.get("wikidata").isJsonNull()) && !jsonObj.get("wikidata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wikidata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wikidata").toString()));
      }
      if ((jsonObj.get("youtube") != null && !jsonObj.get("youtube").isJsonNull()) && !jsonObj.get("youtube").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `youtube` to be a primitive type in the JSON string but got `%s`", jsonObj.get("youtube").toString()));
      }
      if ((jsonObj.get("patronage") != null && !jsonObj.get("patronage").isJsonNull()) && !jsonObj.get("patronage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `patronage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("patronage").toString()));
      }
      if ((jsonObj.get("crowdfunding") != null && !jsonObj.get("crowdfunding").isJsonNull()) && !jsonObj.get("crowdfunding").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crowdfunding` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crowdfunding").toString()));
      }
      if ((jsonObj.get("blog") != null && !jsonObj.get("blog").isJsonNull()) && !jsonObj.get("blog").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blog` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blog").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Rels1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Rels1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Rels1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Rels1.class));

       return (TypeAdapter<T>) new TypeAdapter<Rels1>() {
           @Override
           public void write(JsonWriter out, Rels1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Rels1 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Rels1 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Rels1
   * @throws IOException if the JSON string is invalid with respect to Rels1
   */
  public static Rels1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Rels1.class);
  }

  /**
   * Convert an instance of Rels1 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

