# listenbrainz-client


---

This is generated code from the OpenAPI specification at [rain0r/listenbrainz-openapi](https://github.com/rain0r/listenbrainz-openapi).

---

[JavaDoc](https://rain0r.github.io/listenbrainz-client/index.html)

---


ListenBrainz Swagger - OpenAPI 3.0
- API version: v-2024-07-17.0
  - Generator version: 7.10.0

OpenAPI client defintion.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.hihn</groupId>
  <artifactId>listenbrainz-client</artifactId>
  <version>1.3.0-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'listenbrainz-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'listenbrainz-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.hihn:listenbrainz-client:1.3.0-SNAPSHOT"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/listenbrainz-client-1.3.0-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbArtApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbArtApi apiInstance = new LbArtApi(defaultClient);
    CreateCoverArtGrid createCoverArtGrid = new CreateCoverArtGrid(); // CreateCoverArtGrid | 
    try {
      File result = apiInstance.createCoverArtGrid(createCoverArtGrid)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbArtApi#createCoverArtGrid");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.listenbrainz.org*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*LbArtApi* | [**createCoverArtGrid**](docs/LbArtApi.md#createCoverArtGrid) | **POST** /1/art/grid/ | Create a cover art grid SVG file from the POSTed JSON data to this endpoint.
*LbArtApi* | [**createCoverArtGridForUser**](docs/LbArtApi.md#createCoverArtGridForUser) | **GET** /1/art/grid-stats/{user_name}/{time_range}/{dimension}/{layout}/{image_size} | Create a cover art grid SVG file from the stats of a given user.
*LbArtApi* | [**createCustomCoverArt**](docs/LbArtApi.md#createCustomCoverArt) | **GET** /1/art/{custom_name}/{user_name}/{time_range}/{image_size} | Create a custom cover art SVG file from the stats of a given user.
*LbArtApi* | [**yearInMusic**](docs/LbArtApi.md#yearInMusic) | **GET** /1/art/year-in-music/{year}/{user_name} | Create the shareable svg image using YIM stats.
*LbCoreApi* | [**deleteListen**](docs/LbCoreApi.md#deleteListen) | **POST** /1/delete-listen | Delete a particular listen from a user&#39;s listen history.
*LbCoreApi* | [**latestImport**](docs/LbCoreApi.md#latestImport) | **GET** /1/latest-import | Get the timestamp of the newest listen submitted by a user in previous imports to ListenBrainz.
*LbCoreApi* | [**lbRadioRecordingsForArtist**](docs/LbCoreApi.md#lbRadioRecordingsForArtist) | **GET** /1/lb-radio/artist/{seed_artist_mbid} | Get recordings for use in LB radio with the given seed artist. The endpoint returns a dict of all the similar artists, including the seed artist. For each artists, there will be a list of dicts that contain recording_mbid, similar_artist_mbid and total_listen_count.
*LbCoreApi* | [**lbRadioTags**](docs/LbCoreApi.md#lbRadioTags) | **GET** /1/lb-radio/tags | Get recordings for use in LB radio with the specified tags that match the requested criteria.
*LbCoreApi* | [**listenCountForUser**](docs/LbCoreApi.md#listenCountForUser) | **GET** /1/user/{user_name}/listen-count | Get the number of listens for a user &#39;user_name&#39;.
*LbCoreApi* | [**listensForUser**](docs/LbCoreApi.md#listensForUser) | **GET** /1/user/{user_name}/listens | Get listens for user &#39;user_name&#39;.
*LbCoreApi* | [**playingNowForUser**](docs/LbCoreApi.md#playingNowForUser) | **GET** /1/user/{user_name}/playing-now | Get the listen being played right now for user &#39;user_name&#39;
*LbCoreApi* | [**recommendationPlaylistsForUser**](docs/LbCoreApi.md#recommendationPlaylistsForUser) | **GET** /1/user/{playlist_user_name}/playlists/recommendations | Fetch recommendation playlist metadata in JSPF format without recordings for &#39;playlist_user_name&#39;. This endpoint only lists playlists that are to be shown on the listenbrainz.org recommendations pages.
*LbCoreApi* | [**searchPlaylistForUser**](docs/LbCoreApi.md#searchPlaylistForUser) | **GET** /1/user/{playlist_user_name}/playlists/search | Search for a playlist by name for a user.
*LbCoreApi* | [**searchUsers**](docs/LbCoreApi.md#searchUsers) | **GET** /1/search/users | Search a ListenBrainz-registered user.
*LbCoreApi* | [**servicesForUser**](docs/LbCoreApi.md#servicesForUser) | **GET** /1/user/{user_name}/services | Get list of services which are connected to a given user&#39;s account.
*LbCoreApi* | [**similarUsersForUser**](docs/LbCoreApi.md#similarUsersForUser) | **GET** /1/user/{user_name}/similar-users | Get the listen being played right now for user &#39;user_name&#39;.
*LbCoreApi* | [**similarityOfUserForUser**](docs/LbCoreApi.md#similarityOfUserForUser) | **GET** /1/user/{user_name}/similar-to/{other_user_name} | Get the similarity of &#39;user_name&#39; and &#39;other_user_name&#39;, based on their listening history.
*LbCoreApi* | [**submitListens**](docs/LbCoreApi.md#submitListens) | **POST** /1/submit-listens | Submit listens to the server.
*LbCoreApi* | [**validateToken**](docs/LbCoreApi.md#validateToken) | **GET** /1/validate-token | Check whether a User Token is a valid entry in the database.
*LbMetadataApi* | [**artistMetadata**](docs/LbMetadataApi.md#artistMetadata) | **GET** /1/metadata/artist/ | This endpoint takes in a list of artist_mbids and returns an array of dicts that contain recording metadata suitable for showing in a context that requires as much detail about a recording and the artist. Using the inc parameter, you can control which portions of metadata to fetch.
*LbMetadataApi* | [**getManualMapping**](docs/LbMetadataApi.md#getManualMapping) | **GET** /1/metadata/get_manual_mapping/ | Get the manual mapping of a recording messybrainz ID that a user added.
*LbMetadataApi* | [**lookup**](docs/LbMetadataApi.md#lookup) | **GET** /1/metadata/lookup/ | This endpoint looks up mbid metadata for the given artist, recording and optionally a release name. The total number of characters in the artist name, recording name and release name query arguments should be less than or equal to MAX_MAPPING_QUERY_LENGTH.
*LbMetadataApi* | [**recordingMetadata**](docs/LbMetadataApi.md#recordingMetadata) | **GET** /1/metadata/recording/ | This endpoint takes in a list of recording_mbids and returns an array of dicts that contain recording metadata suitable for showing in a context that requires as much detail about a recording and the artist. Using the inc parameter, you can control which portions of metadata to fetch.
*LbMetadataApi* | [**releaseGroupMetadata**](docs/LbMetadataApi.md#releaseGroupMetadata) | **GET** /1/metadata/release_group/ | This endpoint takes in a list of release_group_mbids and returns an array of dicts that contain release_group metadata suitable for showing in a context that requires as much detail about a release_group and the artist. Using the inc parameter, you can control which portions of metadata to fetch.
*LbMetadataApi* | [**submitManualMapping**](docs/LbMetadataApi.md#submitManualMapping) | **POST** /1/metadata/submit_manual_mapping/ | Submit a manual mapping of a recording messybrainz ID to a musicbrainz recording id.
*LbMiscApi* | [**color**](docs/LbMiscApi.md#color) | **GET** /1/explore/color/{color} | Fetch a list of releases that have cover art that has a predominant color that is close to the given color.
*LbMiscApi* | [**freshReleases**](docs/LbMiscApi.md#freshReleases) | **GET** /1/explore/fresh-releases/ | This endpoint fetches upcoming and recently released (fresh) releases.
*LbMiscApi* | [**getDumpInfo**](docs/LbMiscApi.md#getDumpInfo) | **GET** /1/status/get-dump-info | Get information about ListenBrainz data dumps. You need to pass the id parameter in a GET request to get data about that particular dump.
*LbMiscApi* | [**lbRadio**](docs/LbMiscApi.md#lbRadio) | **GET** /1/explore/lb-radio | Generate a playlist with LB Radio.
*LbPlaylistsApi* | [**appendRecordings**](docs/LbPlaylistsApi.md#appendRecordings) | **POST** /1/playlist/{playlist_mbid}/item/add/{offset} | Append recordings to an existing playlist by posting a playlist with one of more recordings in it. The playlist must be in JSPF format with MusicBrainz extensions, which is defined here: https://musicbrainz.org/doc/jspf .  If the offset is provided in the URL, then the recordings will be added at that offset, otherwise they will be added at the end of the playlist.
*LbPlaylistsApi* | [**copyPlaylist**](docs/LbPlaylistsApi.md#copyPlaylist) | **POST** /1/playlist/{playlist_mbid}/copy | Copy a playlist - the new playlist will be given the name “Copy of &lt;playlist_name&gt;”. POST body data does not need to contain anything.
*LbPlaylistsApi* | [**createPlaylist**](docs/LbPlaylistsApi.md#createPlaylist) | **POST** /1/playlist/create | Create a playlist
*LbPlaylistsApi* | [**deletePlaylist**](docs/LbPlaylistsApi.md#deletePlaylist) | **POST** /1/playlist/{playlist_mbid}/delete | Delete a playlist.
*LbPlaylistsApi* | [**editPlaylist**](docs/LbPlaylistsApi.md#editPlaylist) | **POST** /1/playlist/edit/{playlist_mbid} | Create a playlist. The playlist must be in JSPF format with MusicBrainz extensions, which is defined here: https://musicbrainz.org/doc/jspf . To create an empty playlist, you can send an empty playlist with only the title field filled out. If you would like to create a playlist populated with recordings, each of the track items in the playlist must have an identifier element that contains the MusicBrainz recording that includes the recording MBID.  When creating a playlist, only the playlist title and the track identifier elements will be used - all other elements in the posted JSPF wil be ignored.  If a created_for field is found and the user is not an approved playlist bot, then a 403 forbidden will be raised.
*LbPlaylistsApi* | [**fetchPlaylist**](docs/LbPlaylistsApi.md#fetchPlaylist) | **GET** /1/playlist/{playlist_mbid} | Fetch the given playlist.
*LbPlaylistsApi* | [**itemDelete**](docs/LbPlaylistsApi.md#itemDelete) | **POST** /1/playlist/{playlist_mbid}/item/delete | Delete an item in a playlist.
*LbPlaylistsApi* | [**moveItem**](docs/LbPlaylistsApi.md#moveItem) | **POST** /1/playlist/{playlist_mbid}/item/move | To move an item in a playlist, the POST data needs to specify the recording MBID and current index of the track to move (from), where to move it to (to) and how many tracks from that position should be moved (count).
*LbPlaylistsApi* | [**playlistsCreatedForUser**](docs/LbPlaylistsApi.md#playlistsCreatedForUser) | **GET** /1/user/{playlist_user_name}/playlists/createdfor | Fetch playlist metadata in JSPF format without recordings that have been created for the user.
*LbPlaylistsApi* | [**playlistsForUser**](docs/LbPlaylistsApi.md#playlistsForUser) | **GET** /1/user/{playlist_user_name}/playlists | Fetch playlist metadata in JSPF format without recordings for the given user.
*LbPlaylistsApi* | [**playlistsForUserCollaborator**](docs/LbPlaylistsApi.md#playlistsForUserCollaborator) | **GET** /1/user/{playlist_user_name}/playlists/collaborator | Fetch playlist metadata in JSPF format without recordings for which a user is a collaborator. If a playlist is private, it will only be returned if the caller is authorized to edit that playlist.
*LbPlaylistsApi* | [**searchPlaylists**](docs/LbPlaylistsApi.md#searchPlaylists) | **GET** /1/playlist/search | Search for playlists by name or description. The search query must be at least 3 characters long.
*LbPopularityApi* | [**artist**](docs/LbPopularityApi.md#artist) | **POST** /1/popularity/artist | Get the total listen count and total unique listeners count for a given artist.  A JSON document with a list of artists and inc string must be POSTed. Up to MAX_ITEMS_PER_GET items can be requested at once.
*LbPopularityApi* | [**recording**](docs/LbPopularityApi.md#recording) | **POST** /1/popularity/recording | Get the total listen count and total unique listeners count for a given recording.  A JSON document with a list of recording_mbids and inc string must be POSTed. Up to MAX_ITEMS_PER_GET items can be requested at once.
*LbPopularityApi* | [**release**](docs/LbPopularityApi.md#release) | **POST** /1/popularity/release | Get the total listen count and total unique listeners count for a given release.  A JSON document with a list of releases and inc string must be POSTed. Up to MAX_ITEMS_PER_GET items can be requested at once.
*LbPopularityApi* | [**releaseGroup**](docs/LbPopularityApi.md#releaseGroup) | **POST** /1/popularity/release-group | Get the total listen count and total unique listeners count for a given release group.  A JSON document with a list of release groups and inc string must be POSTed. Up to MAX_ITEMS_PER_GET items can be requested at once.
*LbPopularityApi* | [**topRecordingsForArtist**](docs/LbPopularityApi.md#topRecordingsForArtist) | **GET** /1/popularity/top-recordings-for-artist/{artist_mbid} | Get a list of all recordings ever pinned by a user with given user_name in descending order of the time they were originally pinned.
*LbPopularityApi* | [**topReleaseGroupForArtist**](docs/LbPopularityApi.md#topReleaseGroupForArtist) | **GET** /1/popularity/top-release-groups-for-artist/{artist_mbid} | Get the top release groups by listen count for a given artist.
*LbRecommendationsApi* | [**deleteFeedback**](docs/LbRecommendationsApi.md#deleteFeedback) | **POST** /1/recommendations/feedback/delete | Delete feedback for a user. A user token (found on https://listenbrainz.org/settings/ ) must be provided in the Authorization header! Each request should contain only one recording mbid in the payload.
*LbRecommendationsApi* | [**feedbackGivenBy**](docs/LbRecommendationsApi.md#feedbackGivenBy) | **GET** /1/recommendations/feedback/user/{user_name} | Get feedback given by user &#39;user_name&#39;.
*LbRecommendationsApi* | [**recordingRecommendations**](docs/LbRecommendationsApi.md#recordingRecommendations) | **GET** /1/cf/recommendation/user/{user_name}/recording | Get recommendations sorted on rating and ratings for user &#39;user_name&#39;.
*LbRecommendationsApi* | [**recordingsFeedbackGivenBy**](docs/LbRecommendationsApi.md#recordingsFeedbackGivenBy) | **GET** /1/recommendations/feedback/user/{user_name}/recordings | Get feedback given by user &#39;user_name&#39; for the list of recordings supplied.
*LbRecommendationsApi* | [**submitFeedback**](docs/LbRecommendationsApi.md#submitFeedback) | **POST** /1/recommendation/feedback/submit | Submit recommendation feedback. A user token (found on https://listenbrainz.org/settings/ ) must be provided in the Authorization header! Each request should contain only one feedback in the payload.
*LbRecordingsApi* | [**getFeedback**](docs/LbRecordingsApi.md#getFeedback) | **GET** /1/feedback/user/{user_name}/get-feedback | Get feedback given by user &#39;user_name&#39;. The format for the JSON returned is defined in our Feedback JSON Documentation.  If the optional argument score is not given, this endpoint will return all the feedback submitted by the user. Otherwise filters the feedback to be returned by score.
*LbRecordingsApi* | [**getFeedbackForRecordings**](docs/LbRecordingsApi.md#getFeedbackForRecordings) | **GET** /1/feedback/user/{user_name}/get-feedback-for-recordings | Get feedback given by user user_name for the list of recordings supplied.
*LbRecordingsApi* | [**getFeedbackMbid**](docs/LbRecordingsApi.md#getFeedbackMbid) | **GET** /1/feedback/recording/{recording_mbid}/get-feedback-mbid | Get feedback for recording with given recording_mbid.
*LbRecordingsApi* | [**getFeedbackMsid**](docs/LbRecordingsApi.md#getFeedbackMsid) | **GET** /1/feedback/user/{recording_msid}/get-feedback | Get feedback for recording with given recording_msid.
*LbRecordingsApi* | [**getPins**](docs/LbRecordingsApi.md#getPins) | **GET** /1/{user_name}/pins | Get a list of all recordings ever pinned by a user with given user_name in descending order of the time they were originally pinned.
*LbRecordingsApi* | [**getPinsCurrent**](docs/LbRecordingsApi.md#getPinsCurrent) | **GET** /1/{user_name}/pins/current | Get the currently pinned recording by a user with given user_name.
*LbRecordingsApi* | [**getPinsFollowing**](docs/LbRecordingsApi.md#getPinsFollowing) | **GET** /1/{user_name}/pins/following | Get a list containing the active pinned recordings for all users in a user&#39;s user_name following list. The returned pinned recordings are sorted in descending order of the time they were pinned.
*LbRecordingsApi* | [**pin**](docs/LbRecordingsApi.md#pin) | **POST** /1/pin | Pin a recording for user. A user token (found on https://listenbrainz.org/settings/) must be provided in the Authorization header! Each request should contain only one pinned recording item in the payload.
*LbRecordingsApi* | [**pinDelete**](docs/LbRecordingsApi.md#pinDelete) | **POST** /1/pin/delete/{row_id} | Deletes the pinned recording with given row_id from the server. A user token (found on https://listenbrainz.org/settings/) must be provided in the Authorization header!
*LbRecordingsApi* | [**recordingFeedback**](docs/LbRecordingsApi.md#recordingFeedback) | **POST** /1/feedback/recording-feedback | Submit recording feedback (love/hate) to the server. A user token (found on https://listenbrainz.org/settings/ ) must be provided in the Authorization header! Each request should contain only one feedback in the payload.
*LbRecordingsApi* | [**unpin**](docs/LbRecordingsApi.md#unpin) | **POST** /1/unpin | Unpins the currently active pinned recording for the user. A user token (found on https://listenbrainz.org/settings/) must be provided in the Authorization header!
*LbRecordingsApi* | [**updatePin**](docs/LbRecordingsApi.md#updatePin) | **POST** /1/pin/update/{row_id} | Updates the blurb content of a pinned recording for the user. A user token (found on https://listenbrainz.org/settings/) must be provided in the Authorization header! Each request should contain only one pinned recording item in the payload.
*LbSocialApi* | [**createNotification**](docs/LbSocialApi.md#createNotification) | **POST** /1/user/{user_name}/timeline-event/create/notification | Post a message with a link on a user&#39;s timeline. Only approved users are allowed to perform this action.
*LbSocialApi* | [**createReview**](docs/LbSocialApi.md#createReview) | **POST** /1/user/{user_name}/timeline-event/create/review | Creates a CritiqueBrainz review event for the user. This also creates a corresponding review in CritiqueBrainz. Users need to have linked their ListenBrainz account with CritiqueBrainz first to use this endpoint successfully.
*LbSocialApi* | [**feedEvents**](docs/LbSocialApi.md#feedEvents) | **GET** /1/user/{user_name}/feed/events | CreatGet feed events for a user&#39;s timeline.
*LbSocialApi* | [**feedEventsDelete**](docs/LbSocialApi.md#feedEventsDelete) | **POST** /1/user/{user_name}/feed/events/delete | Delete those events from user&#39;s feed that belong to them. Supports deletion of recommendation and notification. Along with the authorization token, post the event type and event id.
*LbSocialApi* | [**feedEventsHide**](docs/LbSocialApi.md#feedEventsHide) | **POST** /1/user/{user_name}/feed/events/hide | Hide events from the user feed, only recording_recommendation and recording_pin events that have been generated by the people one is following can be deleted via this endpoint.
*LbSocialApi* | [**feedEventsListensFollowing**](docs/LbSocialApi.md#feedEventsListensFollowing) | **GET** /1/user/{user_name}/feed/events/listens/following | Get feed&#39;s listen events for followed users.
*LbSocialApi* | [**feedEventsListensSimilar**](docs/LbSocialApi.md#feedEventsListensSimilar) | **GET** /1/user/{user_name}/feed/events/listens/similar | Get feed&#39;s listen events for similar users.
*LbSocialApi* | [**feedEventsUnhide**](docs/LbSocialApi.md#feedEventsUnhide) | **POST** /1/user/{user_name}/feed/events/unhide | Delete hidden events from the user feed, aka unhide events.
*LbSocialApi* | [**follow**](docs/LbSocialApi.md#follow) | **POST** /1/user/{user_name}/follow | Follow the user &#39;user_name&#39;. A user token (found on https://listenbrainz.org/settings/ ) must be provided in the Authorization header!
*LbSocialApi* | [**followers**](docs/LbSocialApi.md#followers) | **GET** /1/user/{user_name}/followers | Fetch the list of followers of the user &#39;user_name&#39;.
*LbSocialApi* | [**following**](docs/LbSocialApi.md#following) | **GET** /1/user/{user_name}/following | Fetch the list of users followed by the user &#39;user_name&#39;.
*LbSocialApi* | [**recommendPersonalRecording**](docs/LbSocialApi.md#recommendPersonalRecording) | **POST** /1/user/{user_name}/timeline-event/create/recommend-personal | Make the user recommend a recording to their followers. The request should post the following data about the recording being recommended (either one of recording_msid or recording_mbid is sufficient), and also the list of followers getting recommended.
*LbSocialApi* | [**recommendRecording**](docs/LbSocialApi.md#recommendRecording) | **POST** /1/user/{user_name}/timeline-event/create/recording | Make the user recommend a recording to their followers.
*LbSocialApi* | [**unfollow**](docs/LbSocialApi.md#unfollow) | **POST** /1/user/{user_name}/unfollow | Unfollow the user &#39;user_name&#39;. A user token (found on https://listenbrainz.org/settings/ ) must be provided in the Authorization header!
*LbStatsApi* | [**artistMapForUser**](docs/LbStatsApi.md#artistMapForUser) | **GET** /1/stats/user/{user_name}/artist-map | Get the artist map for user &#39;user_name&#39;.
*LbStatsApi* | [**dailyActivityForUser**](docs/LbStatsApi.md#dailyActivityForUser) | **GET** /1/stats/user/{user_name}/daily-activity | Get the daily activity for user &#39;user_name&#39;.
*LbStatsApi* | [**listenersForArtist**](docs/LbStatsApi.md#listenersForArtist) | **GET** /1/stats/artist/{artist_mbid}/listeners | Get top listeners for artist &#39;artist_mbid&#39;.
*LbStatsApi* | [**listenersForReleaseGroup**](docs/LbStatsApi.md#listenersForReleaseGroup) | **GET** /1/stats/release-group/{release_group_mbid}/listeners | Get top listeners for release group &#39;release_group_mbid&#39;.
*LbStatsApi* | [**listeningActivityForUser**](docs/LbStatsApi.md#listeningActivityForUser) | **GET** /1/stats/user/{user_name}/listening-activity | Get the listening activity for user &#39;user_name&#39;.
*LbStatsApi* | [**sitewideArtistMap**](docs/LbStatsApi.md#sitewideArtistMap) | **GET** /1/stats/sitewide/artist-map | Get sitewide top recordings.
*LbStatsApi* | [**sitewideListeningActivity**](docs/LbStatsApi.md#sitewideListeningActivity) | **GET** /1/stats/sitewide/listening-activity | Get sitewide top recordings.
*LbStatsApi* | [**sitewideTopArtists**](docs/LbStatsApi.md#sitewideTopArtists) | **GET** /1/stats/sitewide/artists | Get sitewide top artists.
*LbStatsApi* | [**sitewideTopRecordings**](docs/LbStatsApi.md#sitewideTopRecordings) | **GET** /1/stats/sitewide/recordings | Get sitewide top recordings.
*LbStatsApi* | [**sitewideTopReleaseGroups**](docs/LbStatsApi.md#sitewideTopReleaseGroups) | **GET** /1/stats/sitewide/release-groups | Get sitewide top release groups.
*LbStatsApi* | [**sitewideTopReleases**](docs/LbStatsApi.md#sitewideTopReleases) | **GET** /1/stats/sitewide/releases | Get sitewide top releases.
*LbStatsApi* | [**topArtistsForUser**](docs/LbStatsApi.md#topArtistsForUser) | **GET** /1/stats/user/{user_name}/artists | Get top artists for user &#39;user_name&#39;.
*LbStatsApi* | [**topRecordingsForUser**](docs/LbStatsApi.md#topRecordingsForUser) | **GET** /1/stats/user/{user_name}/recordings | Get top recordings for user &#39;user_name&#39;.
*LbStatsApi* | [**topReleaseGroupsForUser**](docs/LbStatsApi.md#topReleaseGroupsForUser) | **GET** /1/stats/user/{user_name}/release-groups | Get top release groups for user &#39;user_name&#39;.
*LbStatsApi* | [**topReleasesForUser**](docs/LbStatsApi.md#topReleasesForUser) | **GET** /1/stats/user/{user_name}/releases | Get top releases for user &#39;user_name&#39;.
*LbStatsApi* | [**yearInMusicForUser**](docs/LbStatsApi.md#yearInMusicForUser) | **GET** /1/stats/user/{user_name}/year-in-music/{year} | Get sitewide top recordings.


## Documentation for Models

 - [AdditionalInfo](docs/AdditionalInfo.md)
 - [AllowedRatings](docs/AllowedRatings.md)
 - [AllowedStatisticsRange](docs/AllowedStatisticsRange.md)
 - [Artist200ResponseInner](docs/Artist200ResponseInner.md)
 - [ArtistMapForUser](docs/ArtistMapForUser.md)
 - [ArtistMapForUserPayload](docs/ArtistMapForUserPayload.md)
 - [ArtistMapForUserPayloadArtistMapInner](docs/ArtistMapForUserPayloadArtistMapInner.md)
 - [ArtistMetadata](docs/ArtistMetadata.md)
 - [ArtistMetadataTag](docs/ArtistMetadataTag.md)
 - [ArtistRequest](docs/ArtistRequest.md)
 - [Color](docs/Color.md)
 - [ColorPayload](docs/ColorPayload.md)
 - [ColorPayloadReleasesInner](docs/ColorPayloadReleasesInner.md)
 - [ColorPayloadReleasesInnerRecordingsInner](docs/ColorPayloadReleasesInnerRecordingsInner.md)
 - [ColorPayloadReleasesInnerRecordingsInnerTrackMetadata](docs/ColorPayloadReleasesInnerRecordingsInnerTrackMetadata.md)
 - [ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo](docs/ColorPayloadReleasesInnerRecordingsInnerTrackMetadataAdditionalInfo.md)
 - [CoverTypes](docs/CoverTypes.md)
 - [CreateCoverArtGrid](docs/CreateCoverArtGrid.md)
 - [CreateNotificationRequest](docs/CreateNotificationRequest.md)
 - [CreateNotificationRequestMetadata](docs/CreateNotificationRequestMetadata.md)
 - [CreatePlaylist200Response](docs/CreatePlaylist200Response.md)
 - [CreatePlaylistRequest](docs/CreatePlaylistRequest.md)
 - [CreateReviewRequest](docs/CreateReviewRequest.md)
 - [CreateReviewRequestMetadata](docs/CreateReviewRequestMetadata.md)
 - [DailyActivityForUser](docs/DailyActivityForUser.md)
 - [DailyActivityForUserPayload](docs/DailyActivityForUserPayload.md)
 - [DailyActivityForUserPayloadDailyActivity](docs/DailyActivityForUserPayloadDailyActivity.md)
 - [DailyActivityForUserPayloadDailyActivityFridayInner](docs/DailyActivityForUserPayloadDailyActivityFridayInner.md)
 - [DeleteFeedbackRequest](docs/DeleteFeedbackRequest.md)
 - [DeleteListen](docs/DeleteListen.md)
 - [FeedEvents](docs/FeedEvents.md)
 - [FeedEventsDeleteRequest](docs/FeedEventsDeleteRequest.md)
 - [FeedEventsListensSimilar](docs/FeedEventsListensSimilar.md)
 - [FeedEventsListensSimilarPayload](docs/FeedEventsListensSimilarPayload.md)
 - [FeedEventsListensSimilarPayloadEventsInner](docs/FeedEventsListensSimilarPayloadEventsInner.md)
 - [FeedEventsPayload](docs/FeedEventsPayload.md)
 - [FeedEventsPayloadEventsInner](docs/FeedEventsPayloadEventsInner.md)
 - [Feedback](docs/Feedback.md)
 - [FeedbackGivenBy](docs/FeedbackGivenBy.md)
 - [FeedbackGivenByFeedbackInner](docs/FeedbackGivenByFeedbackInner.md)
 - [FeedbackResponse](docs/FeedbackResponse.md)
 - [Followers](docs/Followers.md)
 - [Following](docs/Following.md)
 - [FreshReleases](docs/FreshReleases.md)
 - [FreshReleasesPayload](docs/FreshReleasesPayload.md)
 - [FreshReleasesPayloadReleasesInner](docs/FreshReleasesPayloadReleasesInner.md)
 - [GetDumpInfo](docs/GetDumpInfo.md)
 - [GetManualMapping](docs/GetManualMapping.md)
 - [GetManualMappingMapping](docs/GetManualMappingMapping.md)
 - [GetPins](docs/GetPins.md)
 - [GetPinsCurrent200Response](docs/GetPinsCurrent200Response.md)
 - [GetPinsCurrent200ResponsePinnedRecording](docs/GetPinsCurrent200ResponsePinnedRecording.md)
 - [GetPinsPinnedRecordingsInner](docs/GetPinsPinnedRecordingsInner.md)
 - [ItemDeleteRequest](docs/ItemDeleteRequest.md)
 - [LatestImport](docs/LatestImport.md)
 - [LbRadio](docs/LbRadio.md)
 - [LbRadioPayload](docs/LbRadioPayload.md)
 - [LbRadioRecordingsForArtistValueInner](docs/LbRadioRecordingsForArtistValueInner.md)
 - [LbRadioTagsInner](docs/LbRadioTagsInner.md)
 - [ListenCountForUser](docs/ListenCountForUser.md)
 - [ListenCountForUserPayload](docs/ListenCountForUserPayload.md)
 - [ListenType](docs/ListenType.md)
 - [ListenersForArtist](docs/ListenersForArtist.md)
 - [ListenersForArtistPayload](docs/ListenersForArtistPayload.md)
 - [ListenersForArtistPayloadListenersInner](docs/ListenersForArtistPayloadListenersInner.md)
 - [ListenersForReleaseGroup](docs/ListenersForReleaseGroup.md)
 - [ListenersForReleaseGroupPayload](docs/ListenersForReleaseGroupPayload.md)
 - [ListeningActivityForUser](docs/ListeningActivityForUser.md)
 - [ListeningActivityForUserPayload](docs/ListeningActivityForUserPayload.md)
 - [ListeningActivityForUserPayloadListeningActivityInner](docs/ListeningActivityForUserPayloadListeningActivityInner.md)
 - [ListensForUser](docs/ListensForUser.md)
 - [ListensForUserPayload](docs/ListensForUserPayload.md)
 - [ListensForUserPayloadListensInner](docs/ListensForUserPayloadListensInner.md)
 - [Lookup](docs/Lookup.md)
 - [LookupMetadata](docs/LookupMetadata.md)
 - [LookupMetadataRecording](docs/LookupMetadataRecording.md)
 - [LookupMetadataRecordingRelsInner](docs/LookupMetadataRecordingRelsInner.md)
 - [LookupMetadataRelease](docs/LookupMetadataRelease.md)
 - [LookupMetadataTag](docs/LookupMetadataTag.md)
 - [LookupMetadataTagRecordingInner](docs/LookupMetadataTagRecordingInner.md)
 - [MbidMapping](docs/MbidMapping.md)
 - [Metadata](docs/Metadata.md)
 - [Mode](docs/Mode.md)
 - [MoveItemRequest](docs/MoveItemRequest.md)
 - [MusicBrainzArtist](docs/MusicBrainzArtist.md)
 - [Operator](docs/Operator.md)
 - [Pin200Response](docs/Pin200Response.md)
 - [Pin200ResponsePinnedRecording](docs/Pin200ResponsePinnedRecording.md)
 - [PinRequest](docs/PinRequest.md)
 - [PlayingNowForUser](docs/PlayingNowForUser.md)
 - [PlayingNowForUserPayload](docs/PlayingNowForUserPayload.md)
 - [PlayingNowForUserPayloadListensInner](docs/PlayingNowForUserPayloadListensInner.md)
 - [Playlist](docs/Playlist.md)
 - [PlaylistExtension](docs/PlaylistExtension.md)
 - [PlaylistExtensionPayload](docs/PlaylistExtensionPayload.md)
 - [PlaylistExtensionPayloadAdditionalMetadata](docs/PlaylistExtensionPayloadAdditionalMetadata.md)
 - [PlaylistExtensionPayloadAdditionalMetadataAlgorithmMetadata](docs/PlaylistExtensionPayloadAdditionalMetadataAlgorithmMetadata.md)
 - [PlaylistTrackInner](docs/PlaylistTrackInner.md)
 - [PlaylistTrackInnerExtension](docs/PlaylistTrackInnerExtension.md)
 - [PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrack](docs/PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrack.md)
 - [PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata](docs/PlaylistTrackInnerExtensionHttpsMusicbrainzOrgDocJspfTrackAdditionalMetadata.md)
 - [Playlists](docs/Playlists.md)
 - [RecommendPersonalRecordingRequest](docs/RecommendPersonalRecordingRequest.md)
 - [RecommendPersonalRecordingRequestMetadata](docs/RecommendPersonalRecordingRequestMetadata.md)
 - [RecommendRecordingRequest](docs/RecommendRecordingRequest.md)
 - [RecommendRecordingRequestMetadata](docs/RecommendRecordingRequestMetadata.md)
 - [Recording200ResponseInner](docs/Recording200ResponseInner.md)
 - [RecordingFeedbackRequest](docs/RecordingFeedbackRequest.md)
 - [RecordingMetadata](docs/RecordingMetadata.md)
 - [RecordingMetadataArtist](docs/RecordingMetadataArtist.md)
 - [RecordingMetadataArtistArtistsInner](docs/RecordingMetadataArtistArtistsInner.md)
 - [RecordingMetadataRecording](docs/RecordingMetadataRecording.md)
 - [RecordingMetadataTag](docs/RecordingMetadataTag.md)
 - [RecordingRecommendations](docs/RecordingRecommendations.md)
 - [RecordingRecommendationsPayload](docs/RecordingRecommendationsPayload.md)
 - [RecordingRecommendationsPayloadMbidsInner](docs/RecordingRecommendationsPayloadMbidsInner.md)
 - [RecordingRequest](docs/RecordingRequest.md)
 - [RecordingsFeedbackGivenBy](docs/RecordingsFeedbackGivenBy.md)
 - [Release200ResponseInner](docs/Release200ResponseInner.md)
 - [ReleaseGroup200ResponseInner](docs/ReleaseGroup200ResponseInner.md)
 - [ReleaseGroupMetadata](docs/ReleaseGroupMetadata.md)
 - [ReleaseGroupMetadataArtist](docs/ReleaseGroupMetadataArtist.md)
 - [ReleaseGroupMetadataArtistArtistsInner](docs/ReleaseGroupMetadataArtistArtistsInner.md)
 - [ReleaseGroupMetadataReleaseGroup](docs/ReleaseGroupMetadataReleaseGroup.md)
 - [ReleaseGroupRequest](docs/ReleaseGroupRequest.md)
 - [ReleaseGroupsInner](docs/ReleaseGroupsInner.md)
 - [ReleaseGroupsInnerArtistsInner](docs/ReleaseGroupsInnerArtistsInner.md)
 - [ReleaseRequest](docs/ReleaseRequest.md)
 - [Rels](docs/Rels.md)
 - [Rels1](docs/Rels1.md)
 - [SearchUsers](docs/SearchUsers.md)
 - [SearchUsersUsersInner](docs/SearchUsersUsersInner.md)
 - [ServicesForUser](docs/ServicesForUser.md)
 - [SimilarUsersForUser](docs/SimilarUsersForUser.md)
 - [SimilarUsersForUserPayloadInner](docs/SimilarUsersForUserPayloadInner.md)
 - [SimilarityOfUserForUser](docs/SimilarityOfUserForUser.md)
 - [SimilarityOfUserForUserPayload](docs/SimilarityOfUserForUserPayload.md)
 - [SitewideArtistMap](docs/SitewideArtistMap.md)
 - [SitewideArtistMapPayload](docs/SitewideArtistMapPayload.md)
 - [SitewideListeningActivity](docs/SitewideListeningActivity.md)
 - [SitewideListeningActivityPayload](docs/SitewideListeningActivityPayload.md)
 - [SitewideTopArtists](docs/SitewideTopArtists.md)
 - [SitewideTopArtistsPayload](docs/SitewideTopArtistsPayload.md)
 - [SitewideTopRecordings](docs/SitewideTopRecordings.md)
 - [SitewideTopRecordingsPayload](docs/SitewideTopRecordingsPayload.md)
 - [SitewideTopRecordingsPayloadRecordingsInner](docs/SitewideTopRecordingsPayloadRecordingsInner.md)
 - [SitewideTopReleaseGroups](docs/SitewideTopReleaseGroups.md)
 - [SitewideTopReleaseGroupsPayload](docs/SitewideTopReleaseGroupsPayload.md)
 - [SitewideTopReleases](docs/SitewideTopReleases.md)
 - [SitewideTopReleasesPayload](docs/SitewideTopReleasesPayload.md)
 - [SitewideTopReleasesPayloadReleasesInner](docs/SitewideTopReleasesPayloadReleasesInner.md)
 - [SubmitFeedbackRequest](docs/SubmitFeedbackRequest.md)
 - [SubmitListens](docs/SubmitListens.md)
 - [SubmitListensPayloadInner](docs/SubmitListensPayloadInner.md)
 - [SubmitManualMapping](docs/SubmitManualMapping.md)
 - [TopArtistsForUser](docs/TopArtistsForUser.md)
 - [TopArtistsForUserPayload](docs/TopArtistsForUserPayload.md)
 - [TopArtistsForUserPayloadArtistsInner](docs/TopArtistsForUserPayloadArtistsInner.md)
 - [TopRecordingsForArtistInner](docs/TopRecordingsForArtistInner.md)
 - [TopRecordingsForArtistInnerReleaseColor](docs/TopRecordingsForArtistInnerReleaseColor.md)
 - [TopRecordingsForUser](docs/TopRecordingsForUser.md)
 - [TopRecordingsForUserPayload](docs/TopRecordingsForUserPayload.md)
 - [TopRecordingsForUserPayloadRecordingsInner](docs/TopRecordingsForUserPayloadRecordingsInner.md)
 - [TopReleaseGroupsForArtistInner](docs/TopReleaseGroupsForArtistInner.md)
 - [TopReleaseGroupsForArtistInnerArtist](docs/TopReleaseGroupsForArtistInnerArtist.md)
 - [TopReleaseGroupsForArtistInnerRelease](docs/TopReleaseGroupsForArtistInnerRelease.md)
 - [TopReleaseGroupsForArtistInnerReleaseGroup](docs/TopReleaseGroupsForArtistInnerReleaseGroup.md)
 - [TopReleaseGroupsForArtistInnerTag](docs/TopReleaseGroupsForArtistInnerTag.md)
 - [TopReleaseGroupsForArtistInnerTagArtistInner](docs/TopReleaseGroupsForArtistInnerTagArtistInner.md)
 - [TopReleaseGroupsForArtistInnerTagReleaseGroupInner](docs/TopReleaseGroupsForArtistInnerTagReleaseGroupInner.md)
 - [TopReleaseGroupsForUser](docs/TopReleaseGroupsForUser.md)
 - [TopReleaseGroupsForUserPayload](docs/TopReleaseGroupsForUserPayload.md)
 - [TopReleasesForUser](docs/TopReleasesForUser.md)
 - [TopReleasesForUserPayload](docs/TopReleasesForUserPayload.md)
 - [TopReleasesForUserPayloadReleasesInner](docs/TopReleasesForUserPayloadReleasesInner.md)
 - [TopReleasesForUserPayloadReleasesInnerArtistsInner](docs/TopReleasesForUserPayloadReleasesInnerArtistsInner.md)
 - [TrackMetadata](docs/TrackMetadata.md)
 - [UpdatePinRequest](docs/UpdatePinRequest.md)
 - [ValidateToken](docs/ValidateToken.md)
 - [YearInMusicForUser](docs/YearInMusicForUser.md)
 - [YearInMusicForUserPayload](docs/YearInMusicForUserPayload.md)
 - [YearInMusicForUserPayloadData](docs/YearInMusicForUserPayloadData.md)
 - [YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner](docs/YearInMusicForUserPayloadDataNewReleasesOfTopArtistsInner.md)
 - [YearInMusicForUserPayloadDataTopGenresInner](docs/YearInMusicForUserPayloadDataTopGenresInner.md)
 - [YearInMusicImage](docs/YearInMusicImage.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



