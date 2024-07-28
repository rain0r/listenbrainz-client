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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * mode is the LB radio mode to be used for this query
 */
@JsonAdapter(Mode.Adapter.class)
public enum Mode {
  
  EASY("easy"),
  
  MEDIUM("medium"),
  
  HARD("hard");

  private String value;

  Mode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Mode fromValue(String value) {
    for (Mode b : Mode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Mode> {
    @Override
    public void write(final JsonWriter jsonWriter, final Mode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Mode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Mode.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Mode.fromValue(value);
  }
}

