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
import org.hihn.listenbrainz.ReleaseGroupsInner;

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
 * SitewideTopReleaseGroupsPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class SitewideTopReleaseGroupsPayload {
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

  public static final String SERIALIZED_NAME_RELEASE_GROUPS = "release_groups";
  @SerializedName(SERIALIZED_NAME_RELEASE_GROUPS)
  private List<ReleaseGroupsInner> releaseGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_TO_TS = "to_ts";
  @SerializedName(SERIALIZED_NAME_TO_TS)
  private Integer toTs;

  public static final String SERIALIZED_NAME_TOTAL_RELEASE_GROUP_COUNT = "total_release_group_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_RELEASE_GROUP_COUNT)
  private Integer totalReleaseGroupCount;

  public SitewideTopReleaseGroupsPayload() {
  }

  public SitewideTopReleaseGroupsPayload count(Integer count) {
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


  public SitewideTopReleaseGroupsPayload fromTs(Integer fromTs) {
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


  public SitewideTopReleaseGroupsPayload lastUpdated(Integer lastUpdated) {
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


  public SitewideTopReleaseGroupsPayload offset(Integer offset) {
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


  public SitewideTopReleaseGroupsPayload range(String range) {
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


  public SitewideTopReleaseGroupsPayload releaseGroups(List<ReleaseGroupsInner> releaseGroups) {
    this.releaseGroups = releaseGroups;
    return this;
  }

  public SitewideTopReleaseGroupsPayload addReleaseGroupsItem(ReleaseGroupsInner releaseGroupsItem) {
    if (this.releaseGroups == null) {
      this.releaseGroups = new ArrayList<>();
    }
    this.releaseGroups.add(releaseGroupsItem);
    return this;
  }

  /**
   * Get releaseGroups
   * @return releaseGroups
   */
  @javax.annotation.Nonnull
  public List<ReleaseGroupsInner> getReleaseGroups() {
    return releaseGroups;
  }

  public void setReleaseGroups(List<ReleaseGroupsInner> releaseGroups) {
    this.releaseGroups = releaseGroups;
  }


  public SitewideTopReleaseGroupsPayload toTs(Integer toTs) {
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


  public SitewideTopReleaseGroupsPayload totalReleaseGroupCount(Integer totalReleaseGroupCount) {
    this.totalReleaseGroupCount = totalReleaseGroupCount;
    return this;
  }

  /**
   * Get totalReleaseGroupCount
   * @return totalReleaseGroupCount
   */
  @javax.annotation.Nonnull
  public Integer getTotalReleaseGroupCount() {
    return totalReleaseGroupCount;
  }

  public void setTotalReleaseGroupCount(Integer totalReleaseGroupCount) {
    this.totalReleaseGroupCount = totalReleaseGroupCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SitewideTopReleaseGroupsPayload sitewideTopReleaseGroupsPayload = (SitewideTopReleaseGroupsPayload) o;
    return Objects.equals(this.count, sitewideTopReleaseGroupsPayload.count) &&
        Objects.equals(this.fromTs, sitewideTopReleaseGroupsPayload.fromTs) &&
        Objects.equals(this.lastUpdated, sitewideTopReleaseGroupsPayload.lastUpdated) &&
        Objects.equals(this.offset, sitewideTopReleaseGroupsPayload.offset) &&
        Objects.equals(this.range, sitewideTopReleaseGroupsPayload.range) &&
        Objects.equals(this.releaseGroups, sitewideTopReleaseGroupsPayload.releaseGroups) &&
        Objects.equals(this.toTs, sitewideTopReleaseGroupsPayload.toTs) &&
        Objects.equals(this.totalReleaseGroupCount, sitewideTopReleaseGroupsPayload.totalReleaseGroupCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, fromTs, lastUpdated, offset, range, releaseGroups, toTs, totalReleaseGroupCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SitewideTopReleaseGroupsPayload {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    fromTs: ").append(toIndentedString(fromTs)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    releaseGroups: ").append(toIndentedString(releaseGroups)).append("\n");
    sb.append("    toTs: ").append(toIndentedString(toTs)).append("\n");
    sb.append("    totalReleaseGroupCount: ").append(toIndentedString(totalReleaseGroupCount)).append("\n");
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
    openapiFields.add("from_ts");
    openapiFields.add("last_updated");
    openapiFields.add("offset");
    openapiFields.add("range");
    openapiFields.add("release_groups");
    openapiFields.add("to_ts");
    openapiFields.add("total_release_group_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("count");
    openapiRequiredFields.add("from_ts");
    openapiRequiredFields.add("last_updated");
    openapiRequiredFields.add("offset");
    openapiRequiredFields.add("range");
    openapiRequiredFields.add("release_groups");
    openapiRequiredFields.add("to_ts");
    openapiRequiredFields.add("total_release_group_count");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SitewideTopReleaseGroupsPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SitewideTopReleaseGroupsPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SitewideTopReleaseGroupsPayload is not found in the empty JSON string", SitewideTopReleaseGroupsPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SitewideTopReleaseGroupsPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SitewideTopReleaseGroupsPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SitewideTopReleaseGroupsPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("range").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `range` to be a primitive type in the JSON string but got `%s`", jsonObj.get("range").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("release_groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_groups` to be an array in the JSON string but got `%s`", jsonObj.get("release_groups").toString()));
      }

      JsonArray jsonArrayreleaseGroups = jsonObj.getAsJsonArray("release_groups");
      // validate the required field `release_groups` (array)
      for (int i = 0; i < jsonArrayreleaseGroups.size(); i++) {
        ReleaseGroupsInner.validateJsonElement(jsonArrayreleaseGroups.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SitewideTopReleaseGroupsPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SitewideTopReleaseGroupsPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SitewideTopReleaseGroupsPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SitewideTopReleaseGroupsPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<SitewideTopReleaseGroupsPayload>() {
           @Override
           public void write(JsonWriter out, SitewideTopReleaseGroupsPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SitewideTopReleaseGroupsPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SitewideTopReleaseGroupsPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SitewideTopReleaseGroupsPayload
   * @throws IOException if the JSON string is invalid with respect to SitewideTopReleaseGroupsPayload
   */
  public static SitewideTopReleaseGroupsPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SitewideTopReleaseGroupsPayload.class);
  }

  /**
   * Convert an instance of SitewideTopReleaseGroupsPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

