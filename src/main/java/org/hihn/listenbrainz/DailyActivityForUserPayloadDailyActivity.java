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
import org.hihn.listenbrainz.DailyActivityForUserPayloadDailyActivityFridayInner;

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
 * DailyActivityForUserPayloadDailyActivity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class DailyActivityForUserPayloadDailyActivity {
  public static final String SERIALIZED_NAME_FRIDAY = "Friday";
  @SerializedName(SERIALIZED_NAME_FRIDAY)
  private List<DailyActivityForUserPayloadDailyActivityFridayInner> friday = new ArrayList<>();

  public static final String SERIALIZED_NAME_MONDAY = "Monday";
  @SerializedName(SERIALIZED_NAME_MONDAY)
  private List<DailyActivityForUserPayloadDailyActivityFridayInner> monday = new ArrayList<>();

  public static final String SERIALIZED_NAME_SATURDAY = "Saturday";
  @SerializedName(SERIALIZED_NAME_SATURDAY)
  private List<DailyActivityForUserPayloadDailyActivityFridayInner> saturday = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUNDAY = "Sunday";
  @SerializedName(SERIALIZED_NAME_SUNDAY)
  private List<DailyActivityForUserPayloadDailyActivityFridayInner> sunday = new ArrayList<>();

  public static final String SERIALIZED_NAME_THURSDAY = "Thursday";
  @SerializedName(SERIALIZED_NAME_THURSDAY)
  private List<DailyActivityForUserPayloadDailyActivityFridayInner> thursday = new ArrayList<>();

  public static final String SERIALIZED_NAME_TUESDAY = "Tuesday";
  @SerializedName(SERIALIZED_NAME_TUESDAY)
  private List<DailyActivityForUserPayloadDailyActivityFridayInner> tuesday = new ArrayList<>();

  public static final String SERIALIZED_NAME_WEDNESDAY = "Wednesday";
  @SerializedName(SERIALIZED_NAME_WEDNESDAY)
  private List<DailyActivityForUserPayloadDailyActivityFridayInner> wednesday = new ArrayList<>();

  public DailyActivityForUserPayloadDailyActivity() {
  }

  public DailyActivityForUserPayloadDailyActivity friday(List<DailyActivityForUserPayloadDailyActivityFridayInner> friday) {
    this.friday = friday;
    return this;
  }

  public DailyActivityForUserPayloadDailyActivity addFridayItem(DailyActivityForUserPayloadDailyActivityFridayInner fridayItem) {
    if (this.friday == null) {
      this.friday = new ArrayList<>();
    }
    this.friday.add(fridayItem);
    return this;
  }

  /**
   * Get friday
   * @return friday
   */
  @javax.annotation.Nonnull
  public List<DailyActivityForUserPayloadDailyActivityFridayInner> getFriday() {
    return friday;
  }

  public void setFriday(List<DailyActivityForUserPayloadDailyActivityFridayInner> friday) {
    this.friday = friday;
  }


  public DailyActivityForUserPayloadDailyActivity monday(List<DailyActivityForUserPayloadDailyActivityFridayInner> monday) {
    this.monday = monday;
    return this;
  }

  public DailyActivityForUserPayloadDailyActivity addMondayItem(DailyActivityForUserPayloadDailyActivityFridayInner mondayItem) {
    if (this.monday == null) {
      this.monday = new ArrayList<>();
    }
    this.monday.add(mondayItem);
    return this;
  }

  /**
   * Get monday
   * @return monday
   */
  @javax.annotation.Nonnull
  public List<DailyActivityForUserPayloadDailyActivityFridayInner> getMonday() {
    return monday;
  }

  public void setMonday(List<DailyActivityForUserPayloadDailyActivityFridayInner> monday) {
    this.monday = monday;
  }


  public DailyActivityForUserPayloadDailyActivity saturday(List<DailyActivityForUserPayloadDailyActivityFridayInner> saturday) {
    this.saturday = saturday;
    return this;
  }

  public DailyActivityForUserPayloadDailyActivity addSaturdayItem(DailyActivityForUserPayloadDailyActivityFridayInner saturdayItem) {
    if (this.saturday == null) {
      this.saturday = new ArrayList<>();
    }
    this.saturday.add(saturdayItem);
    return this;
  }

  /**
   * Get saturday
   * @return saturday
   */
  @javax.annotation.Nonnull
  public List<DailyActivityForUserPayloadDailyActivityFridayInner> getSaturday() {
    return saturday;
  }

  public void setSaturday(List<DailyActivityForUserPayloadDailyActivityFridayInner> saturday) {
    this.saturday = saturday;
  }


  public DailyActivityForUserPayloadDailyActivity sunday(List<DailyActivityForUserPayloadDailyActivityFridayInner> sunday) {
    this.sunday = sunday;
    return this;
  }

  public DailyActivityForUserPayloadDailyActivity addSundayItem(DailyActivityForUserPayloadDailyActivityFridayInner sundayItem) {
    if (this.sunday == null) {
      this.sunday = new ArrayList<>();
    }
    this.sunday.add(sundayItem);
    return this;
  }

  /**
   * Get sunday
   * @return sunday
   */
  @javax.annotation.Nonnull
  public List<DailyActivityForUserPayloadDailyActivityFridayInner> getSunday() {
    return sunday;
  }

  public void setSunday(List<DailyActivityForUserPayloadDailyActivityFridayInner> sunday) {
    this.sunday = sunday;
  }


  public DailyActivityForUserPayloadDailyActivity thursday(List<DailyActivityForUserPayloadDailyActivityFridayInner> thursday) {
    this.thursday = thursday;
    return this;
  }

  public DailyActivityForUserPayloadDailyActivity addThursdayItem(DailyActivityForUserPayloadDailyActivityFridayInner thursdayItem) {
    if (this.thursday == null) {
      this.thursday = new ArrayList<>();
    }
    this.thursday.add(thursdayItem);
    return this;
  }

  /**
   * Get thursday
   * @return thursday
   */
  @javax.annotation.Nonnull
  public List<DailyActivityForUserPayloadDailyActivityFridayInner> getThursday() {
    return thursday;
  }

  public void setThursday(List<DailyActivityForUserPayloadDailyActivityFridayInner> thursday) {
    this.thursday = thursday;
  }


  public DailyActivityForUserPayloadDailyActivity tuesday(List<DailyActivityForUserPayloadDailyActivityFridayInner> tuesday) {
    this.tuesday = tuesday;
    return this;
  }

  public DailyActivityForUserPayloadDailyActivity addTuesdayItem(DailyActivityForUserPayloadDailyActivityFridayInner tuesdayItem) {
    if (this.tuesday == null) {
      this.tuesday = new ArrayList<>();
    }
    this.tuesday.add(tuesdayItem);
    return this;
  }

  /**
   * Get tuesday
   * @return tuesday
   */
  @javax.annotation.Nonnull
  public List<DailyActivityForUserPayloadDailyActivityFridayInner> getTuesday() {
    return tuesday;
  }

  public void setTuesday(List<DailyActivityForUserPayloadDailyActivityFridayInner> tuesday) {
    this.tuesday = tuesday;
  }


  public DailyActivityForUserPayloadDailyActivity wednesday(List<DailyActivityForUserPayloadDailyActivityFridayInner> wednesday) {
    this.wednesday = wednesday;
    return this;
  }

  public DailyActivityForUserPayloadDailyActivity addWednesdayItem(DailyActivityForUserPayloadDailyActivityFridayInner wednesdayItem) {
    if (this.wednesday == null) {
      this.wednesday = new ArrayList<>();
    }
    this.wednesday.add(wednesdayItem);
    return this;
  }

  /**
   * Get wednesday
   * @return wednesday
   */
  @javax.annotation.Nonnull
  public List<DailyActivityForUserPayloadDailyActivityFridayInner> getWednesday() {
    return wednesday;
  }

  public void setWednesday(List<DailyActivityForUserPayloadDailyActivityFridayInner> wednesday) {
    this.wednesday = wednesday;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailyActivityForUserPayloadDailyActivity dailyActivityForUserPayloadDailyActivity = (DailyActivityForUserPayloadDailyActivity) o;
    return Objects.equals(this.friday, dailyActivityForUserPayloadDailyActivity.friday) &&
        Objects.equals(this.monday, dailyActivityForUserPayloadDailyActivity.monday) &&
        Objects.equals(this.saturday, dailyActivityForUserPayloadDailyActivity.saturday) &&
        Objects.equals(this.sunday, dailyActivityForUserPayloadDailyActivity.sunday) &&
        Objects.equals(this.thursday, dailyActivityForUserPayloadDailyActivity.thursday) &&
        Objects.equals(this.tuesday, dailyActivityForUserPayloadDailyActivity.tuesday) &&
        Objects.equals(this.wednesday, dailyActivityForUserPayloadDailyActivity.wednesday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(friday, monday, saturday, sunday, thursday, tuesday, wednesday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyActivityForUserPayloadDailyActivity {\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    monday: ").append(toIndentedString(monday)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
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
    openapiFields.add("Friday");
    openapiFields.add("Monday");
    openapiFields.add("Saturday");
    openapiFields.add("Sunday");
    openapiFields.add("Thursday");
    openapiFields.add("Tuesday");
    openapiFields.add("Wednesday");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Friday");
    openapiRequiredFields.add("Monday");
    openapiRequiredFields.add("Saturday");
    openapiRequiredFields.add("Sunday");
    openapiRequiredFields.add("Thursday");
    openapiRequiredFields.add("Tuesday");
    openapiRequiredFields.add("Wednesday");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DailyActivityForUserPayloadDailyActivity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DailyActivityForUserPayloadDailyActivity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DailyActivityForUserPayloadDailyActivity is not found in the empty JSON string", DailyActivityForUserPayloadDailyActivity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DailyActivityForUserPayloadDailyActivity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DailyActivityForUserPayloadDailyActivity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DailyActivityForUserPayloadDailyActivity.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("Friday").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Friday` to be an array in the JSON string but got `%s`", jsonObj.get("Friday").toString()));
      }

      JsonArray jsonArrayfriday = jsonObj.getAsJsonArray("Friday");
      // validate the required field `Friday` (array)
      for (int i = 0; i < jsonArrayfriday.size(); i++) {
        DailyActivityForUserPayloadDailyActivityFridayInner.validateJsonElement(jsonArrayfriday.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Monday").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Monday` to be an array in the JSON string but got `%s`", jsonObj.get("Monday").toString()));
      }

      JsonArray jsonArraymonday = jsonObj.getAsJsonArray("Monday");
      // validate the required field `Monday` (array)
      for (int i = 0; i < jsonArraymonday.size(); i++) {
        DailyActivityForUserPayloadDailyActivityFridayInner.validateJsonElement(jsonArraymonday.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Saturday").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Saturday` to be an array in the JSON string but got `%s`", jsonObj.get("Saturday").toString()));
      }

      JsonArray jsonArraysaturday = jsonObj.getAsJsonArray("Saturday");
      // validate the required field `Saturday` (array)
      for (int i = 0; i < jsonArraysaturday.size(); i++) {
        DailyActivityForUserPayloadDailyActivityFridayInner.validateJsonElement(jsonArraysaturday.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Sunday").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Sunday` to be an array in the JSON string but got `%s`", jsonObj.get("Sunday").toString()));
      }

      JsonArray jsonArraysunday = jsonObj.getAsJsonArray("Sunday");
      // validate the required field `Sunday` (array)
      for (int i = 0; i < jsonArraysunday.size(); i++) {
        DailyActivityForUserPayloadDailyActivityFridayInner.validateJsonElement(jsonArraysunday.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Thursday").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Thursday` to be an array in the JSON string but got `%s`", jsonObj.get("Thursday").toString()));
      }

      JsonArray jsonArraythursday = jsonObj.getAsJsonArray("Thursday");
      // validate the required field `Thursday` (array)
      for (int i = 0; i < jsonArraythursday.size(); i++) {
        DailyActivityForUserPayloadDailyActivityFridayInner.validateJsonElement(jsonArraythursday.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Tuesday").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Tuesday` to be an array in the JSON string but got `%s`", jsonObj.get("Tuesday").toString()));
      }

      JsonArray jsonArraytuesday = jsonObj.getAsJsonArray("Tuesday");
      // validate the required field `Tuesday` (array)
      for (int i = 0; i < jsonArraytuesday.size(); i++) {
        DailyActivityForUserPayloadDailyActivityFridayInner.validateJsonElement(jsonArraytuesday.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("Wednesday").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Wednesday` to be an array in the JSON string but got `%s`", jsonObj.get("Wednesday").toString()));
      }

      JsonArray jsonArraywednesday = jsonObj.getAsJsonArray("Wednesday");
      // validate the required field `Wednesday` (array)
      for (int i = 0; i < jsonArraywednesday.size(); i++) {
        DailyActivityForUserPayloadDailyActivityFridayInner.validateJsonElement(jsonArraywednesday.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DailyActivityForUserPayloadDailyActivity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DailyActivityForUserPayloadDailyActivity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DailyActivityForUserPayloadDailyActivity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DailyActivityForUserPayloadDailyActivity.class));

       return (TypeAdapter<T>) new TypeAdapter<DailyActivityForUserPayloadDailyActivity>() {
           @Override
           public void write(JsonWriter out, DailyActivityForUserPayloadDailyActivity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DailyActivityForUserPayloadDailyActivity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DailyActivityForUserPayloadDailyActivity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DailyActivityForUserPayloadDailyActivity
   * @throws IOException if the JSON string is invalid with respect to DailyActivityForUserPayloadDailyActivity
   */
  public static DailyActivityForUserPayloadDailyActivity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DailyActivityForUserPayloadDailyActivity.class);
  }

  /**
   * Convert an instance of DailyActivityForUserPayloadDailyActivity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
