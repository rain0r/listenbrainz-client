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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hihn.listenbrainz.ArtistMapForUserPayloadArtistMapInner;
import org.hihn.listenbrainz.ListeningActivityForUserPayloadListeningActivityInner;
import org.hihn.listenbrainz.Playlist;
import org.hihn.listenbrainz.ReleaseGroupsInner;
import org.hihn.listenbrainz.TopArtistsForUserPayloadArtistsInner;
import org.hihn.listenbrainz.TopRecordingsForUserPayloadRecordingsInner;
import org.hihn.listenbrainz.YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner;
import org.hihn.listenbrainz.YearInMusicForUserPayloadDataTopGenresInner;

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
 * YearInMusicForUserPayloadData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T20:56:43.728532+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class YearInMusicForUserPayloadData {
  public static final String SERIALIZED_NAME_ARTIST_MAP = "artist_map";
  @SerializedName(SERIALIZED_NAME_ARTIST_MAP)
  private List<ArtistMapForUserPayloadArtistMapInner> artistMap = new ArrayList<>();

  public static final String SERIALIZED_NAME_DAY_OF_WEEK = "day_of_week";
  @SerializedName(SERIALIZED_NAME_DAY_OF_WEEK)
  private String dayOfWeek;

  public static final String SERIALIZED_NAME_LISTENS_PER_DAY = "listens_per_day";
  @SerializedName(SERIALIZED_NAME_LISTENS_PER_DAY)
  private List<ListeningActivityForUserPayloadListeningActivityInner> listensPerDay = new ArrayList<>();

  public static final String SERIALIZED_NAME_MOST_LISTENED_YEAR = "most_listened_year";
  @SerializedName(SERIALIZED_NAME_MOST_LISTENED_YEAR)
  private Map<String, Integer> mostListenedYear = new HashMap<>();

  public static final String SERIALIZED_NAME_NEW_RELEASES_OF_TOP_ARTISTS = "new_releases_of_top_artists";
  @SerializedName(SERIALIZED_NAME_NEW_RELEASES_OF_TOP_ARTISTS)
  private List<YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner> newReleasesOfTopArtists = new ArrayList<>();

  public static final String SERIALIZED_NAME_PLAYLIST_TOP_DISCOVERIES_FOR_YEAR = "playlist-top-discoveries-for-year";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_TOP_DISCOVERIES_FOR_YEAR)
  private Playlist playlistTopDiscoveriesForYear;

  public static final String SERIALIZED_NAME_PLAYLIST_TOP_MISSED_RECORDINGS_FOR_YEAR = "playlist-top-missed-recordings-for-year";
  @SerializedName(SERIALIZED_NAME_PLAYLIST_TOP_MISSED_RECORDINGS_FOR_YEAR)
  private Playlist playlistTopMissedRecordingsForYear;

  public static final String SERIALIZED_NAME_SIMILAR_USERS = "similar_users";
  @SerializedName(SERIALIZED_NAME_SIMILAR_USERS)
  private Map<String, Integer> similarUsers = new HashMap<>();

  public static final String SERIALIZED_NAME_TOP_ARTISTS = "top_artists";
  @SerializedName(SERIALIZED_NAME_TOP_ARTISTS)
  private List<TopArtistsForUserPayloadArtistsInner> topArtists = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOP_GENRES = "top_genres";
  @SerializedName(SERIALIZED_NAME_TOP_GENRES)
  private List<YearInMusicForUserPayloadDataTopGenresInner> topGenres = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOP_RECORDINGS = "top_recordings";
  @SerializedName(SERIALIZED_NAME_TOP_RECORDINGS)
  private List<TopRecordingsForUserPayloadRecordingsInner> topRecordings = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOP_RELEASE_GROUPS = "top_release_groups";
  @SerializedName(SERIALIZED_NAME_TOP_RELEASE_GROUPS)
  private List<ReleaseGroupsInner> topReleaseGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_ARTISTS_COUNT = "total_artists_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_ARTISTS_COUNT)
  private Integer totalArtistsCount;

  public static final String SERIALIZED_NAME_TOTAL_LISTEN_COUNT = "total_listen_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_LISTEN_COUNT)
  private Integer totalListenCount;

  public static final String SERIALIZED_NAME_TOTAL_LISTENING_TIME = "total_listening_time";
  @SerializedName(SERIALIZED_NAME_TOTAL_LISTENING_TIME)
  private Integer totalListeningTime;

  public static final String SERIALIZED_NAME_TOTAL_NEW_ARTISTS_DISCOVERED = "total_new_artists_discovered";
  @SerializedName(SERIALIZED_NAME_TOTAL_NEW_ARTISTS_DISCOVERED)
  private Integer totalNewArtistsDiscovered;

  public static final String SERIALIZED_NAME_TOTAL_RECORDINGS_COUNT = "total_recordings_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_RECORDINGS_COUNT)
  private Integer totalRecordingsCount;

  public static final String SERIALIZED_NAME_TOTAL_RELEASE_GROUPS_COUNT = "total_release_groups_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_RELEASE_GROUPS_COUNT)
  private Integer totalReleaseGroupsCount;

  public YearInMusicForUserPayloadData() {
  }

  public YearInMusicForUserPayloadData artistMap(List<ArtistMapForUserPayloadArtistMapInner> artistMap) {
    this.artistMap = artistMap;
    return this;
  }

  public YearInMusicForUserPayloadData addArtistMapItem(ArtistMapForUserPayloadArtistMapInner artistMapItem) {
    if (this.artistMap == null) {
      this.artistMap = new ArrayList<>();
    }
    this.artistMap.add(artistMapItem);
    return this;
  }

  /**
   * Get artistMap
   * @return artistMap
   */
  @javax.annotation.Nonnull
  public List<ArtistMapForUserPayloadArtistMapInner> getArtistMap() {
    return artistMap;
  }

  public void setArtistMap(List<ArtistMapForUserPayloadArtistMapInner> artistMap) {
    this.artistMap = artistMap;
  }


  public YearInMusicForUserPayloadData dayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Get dayOfWeek
   * @return dayOfWeek
   */
  @javax.annotation.Nonnull
  public String getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  public YearInMusicForUserPayloadData listensPerDay(List<ListeningActivityForUserPayloadListeningActivityInner> listensPerDay) {
    this.listensPerDay = listensPerDay;
    return this;
  }

  public YearInMusicForUserPayloadData addListensPerDayItem(ListeningActivityForUserPayloadListeningActivityInner listensPerDayItem) {
    if (this.listensPerDay == null) {
      this.listensPerDay = new ArrayList<>();
    }
    this.listensPerDay.add(listensPerDayItem);
    return this;
  }

  /**
   * Get listensPerDay
   * @return listensPerDay
   */
  @javax.annotation.Nonnull
  public List<ListeningActivityForUserPayloadListeningActivityInner> getListensPerDay() {
    return listensPerDay;
  }

  public void setListensPerDay(List<ListeningActivityForUserPayloadListeningActivityInner> listensPerDay) {
    this.listensPerDay = listensPerDay;
  }


  public YearInMusicForUserPayloadData mostListenedYear(Map<String, Integer> mostListenedYear) {
    this.mostListenedYear = mostListenedYear;
    return this;
  }

  public YearInMusicForUserPayloadData putMostListenedYearItem(String key, Integer mostListenedYearItem) {
    if (this.mostListenedYear == null) {
      this.mostListenedYear = new HashMap<>();
    }
    this.mostListenedYear.put(key, mostListenedYearItem);
    return this;
  }

  /**
   * Get mostListenedYear
   * @return mostListenedYear
   */
  @javax.annotation.Nonnull
  public Map<String, Integer> getMostListenedYear() {
    return mostListenedYear;
  }

  public void setMostListenedYear(Map<String, Integer> mostListenedYear) {
    this.mostListenedYear = mostListenedYear;
  }


  public YearInMusicForUserPayloadData newReleasesOfTopArtists(List<YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner> newReleasesOfTopArtists) {
    this.newReleasesOfTopArtists = newReleasesOfTopArtists;
    return this;
  }

  public YearInMusicForUserPayloadData addNewReleasesOfTopArtistsItem(YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner newReleasesOfTopArtistsItem) {
    if (this.newReleasesOfTopArtists == null) {
      this.newReleasesOfTopArtists = new ArrayList<>();
    }
    this.newReleasesOfTopArtists.add(newReleasesOfTopArtistsItem);
    return this;
  }

  /**
   * Get newReleasesOfTopArtists
   * @return newReleasesOfTopArtists
   */
  @javax.annotation.Nonnull
  public List<YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner> getNewReleasesOfTopArtists() {
    return newReleasesOfTopArtists;
  }

  public void setNewReleasesOfTopArtists(List<YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner> newReleasesOfTopArtists) {
    this.newReleasesOfTopArtists = newReleasesOfTopArtists;
  }


  public YearInMusicForUserPayloadData playlistTopDiscoveriesForYear(Playlist playlistTopDiscoveriesForYear) {
    this.playlistTopDiscoveriesForYear = playlistTopDiscoveriesForYear;
    return this;
  }

  /**
   * Get playlistTopDiscoveriesForYear
   * @return playlistTopDiscoveriesForYear
   */
  @javax.annotation.Nonnull
  public Playlist getPlaylistTopDiscoveriesForYear() {
    return playlistTopDiscoveriesForYear;
  }

  public void setPlaylistTopDiscoveriesForYear(Playlist playlistTopDiscoveriesForYear) {
    this.playlistTopDiscoveriesForYear = playlistTopDiscoveriesForYear;
  }


  public YearInMusicForUserPayloadData playlistTopMissedRecordingsForYear(Playlist playlistTopMissedRecordingsForYear) {
    this.playlistTopMissedRecordingsForYear = playlistTopMissedRecordingsForYear;
    return this;
  }

  /**
   * Get playlistTopMissedRecordingsForYear
   * @return playlistTopMissedRecordingsForYear
   */
  @javax.annotation.Nonnull
  public Playlist getPlaylistTopMissedRecordingsForYear() {
    return playlistTopMissedRecordingsForYear;
  }

  public void setPlaylistTopMissedRecordingsForYear(Playlist playlistTopMissedRecordingsForYear) {
    this.playlistTopMissedRecordingsForYear = playlistTopMissedRecordingsForYear;
  }


  public YearInMusicForUserPayloadData similarUsers(Map<String, Integer> similarUsers) {
    this.similarUsers = similarUsers;
    return this;
  }

  public YearInMusicForUserPayloadData putSimilarUsersItem(String key, Integer similarUsersItem) {
    if (this.similarUsers == null) {
      this.similarUsers = new HashMap<>();
    }
    this.similarUsers.put(key, similarUsersItem);
    return this;
  }

  /**
   * Get similarUsers
   * @return similarUsers
   */
  @javax.annotation.Nonnull
  public Map<String, Integer> getSimilarUsers() {
    return similarUsers;
  }

  public void setSimilarUsers(Map<String, Integer> similarUsers) {
    this.similarUsers = similarUsers;
  }


  public YearInMusicForUserPayloadData topArtists(List<TopArtistsForUserPayloadArtistsInner> topArtists) {
    this.topArtists = topArtists;
    return this;
  }

  public YearInMusicForUserPayloadData addTopArtistsItem(TopArtistsForUserPayloadArtistsInner topArtistsItem) {
    if (this.topArtists == null) {
      this.topArtists = new ArrayList<>();
    }
    this.topArtists.add(topArtistsItem);
    return this;
  }

  /**
   * Get topArtists
   * @return topArtists
   */
  @javax.annotation.Nonnull
  public List<TopArtistsForUserPayloadArtistsInner> getTopArtists() {
    return topArtists;
  }

  public void setTopArtists(List<TopArtistsForUserPayloadArtistsInner> topArtists) {
    this.topArtists = topArtists;
  }


  public YearInMusicForUserPayloadData topGenres(List<YearInMusicForUserPayloadDataTopGenresInner> topGenres) {
    this.topGenres = topGenres;
    return this;
  }

  public YearInMusicForUserPayloadData addTopGenresItem(YearInMusicForUserPayloadDataTopGenresInner topGenresItem) {
    if (this.topGenres == null) {
      this.topGenres = new ArrayList<>();
    }
    this.topGenres.add(topGenresItem);
    return this;
  }

  /**
   * Get topGenres
   * @return topGenres
   */
  @javax.annotation.Nonnull
  public List<YearInMusicForUserPayloadDataTopGenresInner> getTopGenres() {
    return topGenres;
  }

  public void setTopGenres(List<YearInMusicForUserPayloadDataTopGenresInner> topGenres) {
    this.topGenres = topGenres;
  }


  public YearInMusicForUserPayloadData topRecordings(List<TopRecordingsForUserPayloadRecordingsInner> topRecordings) {
    this.topRecordings = topRecordings;
    return this;
  }

  public YearInMusicForUserPayloadData addTopRecordingsItem(TopRecordingsForUserPayloadRecordingsInner topRecordingsItem) {
    if (this.topRecordings == null) {
      this.topRecordings = new ArrayList<>();
    }
    this.topRecordings.add(topRecordingsItem);
    return this;
  }

  /**
   * Get topRecordings
   * @return topRecordings
   */
  @javax.annotation.Nonnull
  public List<TopRecordingsForUserPayloadRecordingsInner> getTopRecordings() {
    return topRecordings;
  }

  public void setTopRecordings(List<TopRecordingsForUserPayloadRecordingsInner> topRecordings) {
    this.topRecordings = topRecordings;
  }


  public YearInMusicForUserPayloadData topReleaseGroups(List<ReleaseGroupsInner> topReleaseGroups) {
    this.topReleaseGroups = topReleaseGroups;
    return this;
  }

  public YearInMusicForUserPayloadData addTopReleaseGroupsItem(ReleaseGroupsInner topReleaseGroupsItem) {
    if (this.topReleaseGroups == null) {
      this.topReleaseGroups = new ArrayList<>();
    }
    this.topReleaseGroups.add(topReleaseGroupsItem);
    return this;
  }

  /**
   * Get topReleaseGroups
   * @return topReleaseGroups
   */
  @javax.annotation.Nonnull
  public List<ReleaseGroupsInner> getTopReleaseGroups() {
    return topReleaseGroups;
  }

  public void setTopReleaseGroups(List<ReleaseGroupsInner> topReleaseGroups) {
    this.topReleaseGroups = topReleaseGroups;
  }


  public YearInMusicForUserPayloadData totalArtistsCount(Integer totalArtistsCount) {
    this.totalArtistsCount = totalArtistsCount;
    return this;
  }

  /**
   * Get totalArtistsCount
   * @return totalArtistsCount
   */
  @javax.annotation.Nonnull
  public Integer getTotalArtistsCount() {
    return totalArtistsCount;
  }

  public void setTotalArtistsCount(Integer totalArtistsCount) {
    this.totalArtistsCount = totalArtistsCount;
  }


  public YearInMusicForUserPayloadData totalListenCount(Integer totalListenCount) {
    this.totalListenCount = totalListenCount;
    return this;
  }

  /**
   * Get totalListenCount
   * @return totalListenCount
   */
  @javax.annotation.Nonnull
  public Integer getTotalListenCount() {
    return totalListenCount;
  }

  public void setTotalListenCount(Integer totalListenCount) {
    this.totalListenCount = totalListenCount;
  }


  public YearInMusicForUserPayloadData totalListeningTime(Integer totalListeningTime) {
    this.totalListeningTime = totalListeningTime;
    return this;
  }

  /**
   * Get totalListeningTime
   * @return totalListeningTime
   */
  @javax.annotation.Nonnull
  public Integer getTotalListeningTime() {
    return totalListeningTime;
  }

  public void setTotalListeningTime(Integer totalListeningTime) {
    this.totalListeningTime = totalListeningTime;
  }


  public YearInMusicForUserPayloadData totalNewArtistsDiscovered(Integer totalNewArtistsDiscovered) {
    this.totalNewArtistsDiscovered = totalNewArtistsDiscovered;
    return this;
  }

  /**
   * Get totalNewArtistsDiscovered
   * @return totalNewArtistsDiscovered
   */
  @javax.annotation.Nonnull
  public Integer getTotalNewArtistsDiscovered() {
    return totalNewArtistsDiscovered;
  }

  public void setTotalNewArtistsDiscovered(Integer totalNewArtistsDiscovered) {
    this.totalNewArtistsDiscovered = totalNewArtistsDiscovered;
  }


  public YearInMusicForUserPayloadData totalRecordingsCount(Integer totalRecordingsCount) {
    this.totalRecordingsCount = totalRecordingsCount;
    return this;
  }

  /**
   * Get totalRecordingsCount
   * @return totalRecordingsCount
   */
  @javax.annotation.Nonnull
  public Integer getTotalRecordingsCount() {
    return totalRecordingsCount;
  }

  public void setTotalRecordingsCount(Integer totalRecordingsCount) {
    this.totalRecordingsCount = totalRecordingsCount;
  }


  public YearInMusicForUserPayloadData totalReleaseGroupsCount(Integer totalReleaseGroupsCount) {
    this.totalReleaseGroupsCount = totalReleaseGroupsCount;
    return this;
  }

  /**
   * Get totalReleaseGroupsCount
   * @return totalReleaseGroupsCount
   */
  @javax.annotation.Nonnull
  public Integer getTotalReleaseGroupsCount() {
    return totalReleaseGroupsCount;
  }

  public void setTotalReleaseGroupsCount(Integer totalReleaseGroupsCount) {
    this.totalReleaseGroupsCount = totalReleaseGroupsCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YearInMusicForUserPayloadData yearInMusicForUserPayloadData = (YearInMusicForUserPayloadData) o;
    return Objects.equals(this.artistMap, yearInMusicForUserPayloadData.artistMap) &&
        Objects.equals(this.dayOfWeek, yearInMusicForUserPayloadData.dayOfWeek) &&
        Objects.equals(this.listensPerDay, yearInMusicForUserPayloadData.listensPerDay) &&
        Objects.equals(this.mostListenedYear, yearInMusicForUserPayloadData.mostListenedYear) &&
        Objects.equals(this.newReleasesOfTopArtists, yearInMusicForUserPayloadData.newReleasesOfTopArtists) &&
        Objects.equals(this.playlistTopDiscoveriesForYear, yearInMusicForUserPayloadData.playlistTopDiscoveriesForYear) &&
        Objects.equals(this.playlistTopMissedRecordingsForYear, yearInMusicForUserPayloadData.playlistTopMissedRecordingsForYear) &&
        Objects.equals(this.similarUsers, yearInMusicForUserPayloadData.similarUsers) &&
        Objects.equals(this.topArtists, yearInMusicForUserPayloadData.topArtists) &&
        Objects.equals(this.topGenres, yearInMusicForUserPayloadData.topGenres) &&
        Objects.equals(this.topRecordings, yearInMusicForUserPayloadData.topRecordings) &&
        Objects.equals(this.topReleaseGroups, yearInMusicForUserPayloadData.topReleaseGroups) &&
        Objects.equals(this.totalArtistsCount, yearInMusicForUserPayloadData.totalArtistsCount) &&
        Objects.equals(this.totalListenCount, yearInMusicForUserPayloadData.totalListenCount) &&
        Objects.equals(this.totalListeningTime, yearInMusicForUserPayloadData.totalListeningTime) &&
        Objects.equals(this.totalNewArtistsDiscovered, yearInMusicForUserPayloadData.totalNewArtistsDiscovered) &&
        Objects.equals(this.totalRecordingsCount, yearInMusicForUserPayloadData.totalRecordingsCount) &&
        Objects.equals(this.totalReleaseGroupsCount, yearInMusicForUserPayloadData.totalReleaseGroupsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artistMap, dayOfWeek, listensPerDay, mostListenedYear, newReleasesOfTopArtists, playlistTopDiscoveriesForYear, playlistTopMissedRecordingsForYear, similarUsers, topArtists, topGenres, topRecordings, topReleaseGroups, totalArtistsCount, totalListenCount, totalListeningTime, totalNewArtistsDiscovered, totalRecordingsCount, totalReleaseGroupsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YearInMusicForUserPayloadData {\n");
    sb.append("    artistMap: ").append(toIndentedString(artistMap)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    listensPerDay: ").append(toIndentedString(listensPerDay)).append("\n");
    sb.append("    mostListenedYear: ").append(toIndentedString(mostListenedYear)).append("\n");
    sb.append("    newReleasesOfTopArtists: ").append(toIndentedString(newReleasesOfTopArtists)).append("\n");
    sb.append("    playlistTopDiscoveriesForYear: ").append(toIndentedString(playlistTopDiscoveriesForYear)).append("\n");
    sb.append("    playlistTopMissedRecordingsForYear: ").append(toIndentedString(playlistTopMissedRecordingsForYear)).append("\n");
    sb.append("    similarUsers: ").append(toIndentedString(similarUsers)).append("\n");
    sb.append("    topArtists: ").append(toIndentedString(topArtists)).append("\n");
    sb.append("    topGenres: ").append(toIndentedString(topGenres)).append("\n");
    sb.append("    topRecordings: ").append(toIndentedString(topRecordings)).append("\n");
    sb.append("    topReleaseGroups: ").append(toIndentedString(topReleaseGroups)).append("\n");
    sb.append("    totalArtistsCount: ").append(toIndentedString(totalArtistsCount)).append("\n");
    sb.append("    totalListenCount: ").append(toIndentedString(totalListenCount)).append("\n");
    sb.append("    totalListeningTime: ").append(toIndentedString(totalListeningTime)).append("\n");
    sb.append("    totalNewArtistsDiscovered: ").append(toIndentedString(totalNewArtistsDiscovered)).append("\n");
    sb.append("    totalRecordingsCount: ").append(toIndentedString(totalRecordingsCount)).append("\n");
    sb.append("    totalReleaseGroupsCount: ").append(toIndentedString(totalReleaseGroupsCount)).append("\n");
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
    openapiFields.add("artist_map");
    openapiFields.add("day_of_week");
    openapiFields.add("listens_per_day");
    openapiFields.add("most_listened_year");
    openapiFields.add("new_releases_of_top_artists");
    openapiFields.add("playlist-top-discoveries-for-year");
    openapiFields.add("playlist-top-missed-recordings-for-year");
    openapiFields.add("similar_users");
    openapiFields.add("top_artists");
    openapiFields.add("top_genres");
    openapiFields.add("top_recordings");
    openapiFields.add("top_release_groups");
    openapiFields.add("total_artists_count");
    openapiFields.add("total_listen_count");
    openapiFields.add("total_listening_time");
    openapiFields.add("total_new_artists_discovered");
    openapiFields.add("total_recordings_count");
    openapiFields.add("total_release_groups_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("artist_map");
    openapiRequiredFields.add("day_of_week");
    openapiRequiredFields.add("listens_per_day");
    openapiRequiredFields.add("most_listened_year");
    openapiRequiredFields.add("new_releases_of_top_artists");
    openapiRequiredFields.add("playlist-top-discoveries-for-year");
    openapiRequiredFields.add("playlist-top-missed-recordings-for-year");
    openapiRequiredFields.add("similar_users");
    openapiRequiredFields.add("top_artists");
    openapiRequiredFields.add("top_genres");
    openapiRequiredFields.add("top_recordings");
    openapiRequiredFields.add("top_release_groups");
    openapiRequiredFields.add("total_artists_count");
    openapiRequiredFields.add("total_listen_count");
    openapiRequiredFields.add("total_listening_time");
    openapiRequiredFields.add("total_new_artists_discovered");
    openapiRequiredFields.add("total_recordings_count");
    openapiRequiredFields.add("total_release_groups_count");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to YearInMusicForUserPayloadData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!YearInMusicForUserPayloadData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in YearInMusicForUserPayloadData is not found in the empty JSON string", YearInMusicForUserPayloadData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!YearInMusicForUserPayloadData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `YearInMusicForUserPayloadData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : YearInMusicForUserPayloadData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("artist_map").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `artist_map` to be an array in the JSON string but got `%s`", jsonObj.get("artist_map").toString()));
      }

      JsonArray jsonArrayartistMap = jsonObj.getAsJsonArray("artist_map");
      // validate the required field `artist_map` (array)
      for (int i = 0; i < jsonArrayartistMap.size(); i++) {
        ArtistMapForUserPayloadArtistMapInner.validateJsonElement(jsonArrayartistMap.get(i));
      };
      if (!jsonObj.get("day_of_week").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `day_of_week` to be a primitive type in the JSON string but got `%s`", jsonObj.get("day_of_week").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("listens_per_day").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `listens_per_day` to be an array in the JSON string but got `%s`", jsonObj.get("listens_per_day").toString()));
      }

      JsonArray jsonArraylistensPerDay = jsonObj.getAsJsonArray("listens_per_day");
      // validate the required field `listens_per_day` (array)
      for (int i = 0; i < jsonArraylistensPerDay.size(); i++) {
        ListeningActivityForUserPayloadListeningActivityInner.validateJsonElement(jsonArraylistensPerDay.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("new_releases_of_top_artists").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_releases_of_top_artists` to be an array in the JSON string but got `%s`", jsonObj.get("new_releases_of_top_artists").toString()));
      }

      JsonArray jsonArraynewReleasesOfTopArtists = jsonObj.getAsJsonArray("new_releases_of_top_artists");
      // validate the required field `new_releases_of_top_artists` (array)
      for (int i = 0; i < jsonArraynewReleasesOfTopArtists.size(); i++) {
        YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner.validateJsonElement(jsonArraynewReleasesOfTopArtists.get(i));
      };
      // validate the required field `playlist-top-discoveries-for-year`
      Playlist.validateJsonElement(jsonObj.get("playlist-top-discoveries-for-year"));
      // validate the required field `playlist-top-missed-recordings-for-year`
      Playlist.validateJsonElement(jsonObj.get("playlist-top-missed-recordings-for-year"));
      // ensure the json data is an array
      if (!jsonObj.get("top_artists").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `top_artists` to be an array in the JSON string but got `%s`", jsonObj.get("top_artists").toString()));
      }

      JsonArray jsonArraytopArtists = jsonObj.getAsJsonArray("top_artists");
      // validate the required field `top_artists` (array)
      for (int i = 0; i < jsonArraytopArtists.size(); i++) {
        TopArtistsForUserPayloadArtistsInner.validateJsonElement(jsonArraytopArtists.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("top_genres").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `top_genres` to be an array in the JSON string but got `%s`", jsonObj.get("top_genres").toString()));
      }

      JsonArray jsonArraytopGenres = jsonObj.getAsJsonArray("top_genres");
      // validate the required field `top_genres` (array)
      for (int i = 0; i < jsonArraytopGenres.size(); i++) {
        YearInMusicForUserPayloadDataTopGenresInner.validateJsonElement(jsonArraytopGenres.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("top_recordings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `top_recordings` to be an array in the JSON string but got `%s`", jsonObj.get("top_recordings").toString()));
      }

      JsonArray jsonArraytopRecordings = jsonObj.getAsJsonArray("top_recordings");
      // validate the required field `top_recordings` (array)
      for (int i = 0; i < jsonArraytopRecordings.size(); i++) {
        TopRecordingsForUserPayloadRecordingsInner.validateJsonElement(jsonArraytopRecordings.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("top_release_groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `top_release_groups` to be an array in the JSON string but got `%s`", jsonObj.get("top_release_groups").toString()));
      }

      JsonArray jsonArraytopReleaseGroups = jsonObj.getAsJsonArray("top_release_groups");
      // validate the required field `top_release_groups` (array)
      for (int i = 0; i < jsonArraytopReleaseGroups.size(); i++) {
        ReleaseGroupsInner.validateJsonElement(jsonArraytopReleaseGroups.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!YearInMusicForUserPayloadData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'YearInMusicForUserPayloadData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<YearInMusicForUserPayloadData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(YearInMusicForUserPayloadData.class));

       return (TypeAdapter<T>) new TypeAdapter<YearInMusicForUserPayloadData>() {
           @Override
           public void write(JsonWriter out, YearInMusicForUserPayloadData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public YearInMusicForUserPayloadData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of YearInMusicForUserPayloadData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of YearInMusicForUserPayloadData
   * @throws IOException if the JSON string is invalid with respect to YearInMusicForUserPayloadData
   */
  public static YearInMusicForUserPayloadData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, YearInMusicForUserPayloadData.class);
  }

  /**
   * Convert an instance of YearInMusicForUserPayloadData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

