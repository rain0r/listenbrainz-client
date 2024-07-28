# LbPopularityApi

All URIs are relative to *https://api.listenbrainz.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**artist**](LbPopularityApi.md#artist) | **POST** /1/popularity/artist | Get the total listen count and total unique listeners count for a given artist.  A JSON document with a list of artists and inc string must be POSTed. Up to MAX_ITEMS_PER_GET items can be requested at once. |
| [**recording**](LbPopularityApi.md#recording) | **POST** /1/popularity/recording | Get the total listen count and total unique listeners count for a given recording.  A JSON document with a list of recording_mbids and inc string must be POSTed. Up to MAX_ITEMS_PER_GET items can be requested at once. |
| [**release**](LbPopularityApi.md#release) | **POST** /1/popularity/release | Get the total listen count and total unique listeners count for a given release.  A JSON document with a list of releases and inc string must be POSTed. Up to MAX_ITEMS_PER_GET items can be requested at once. |
| [**releaseGroup**](LbPopularityApi.md#releaseGroup) | **POST** /1/popularity/release-group | Get the total listen count and total unique listeners count for a given release group.  A JSON document with a list of release groups and inc string must be POSTed. Up to MAX_ITEMS_PER_GET items can be requested at once. |
| [**topRecordingsForArtist**](LbPopularityApi.md#topRecordingsForArtist) | **GET** /1/popularity/top-recordings-for-artist/{artist_mbid} | Get a list of all recordings ever pinned by a user with given user_name in descending order of the time they were originally pinned. |
| [**topReleaseGroupForArtist**](LbPopularityApi.md#topReleaseGroupForArtist) | **GET** /1/popularity/top-release-groups-for-artist/{artist_mbid} | Get the top release groups by listen count for a given artist. |


<a id="artist"></a>
# **artist**
> List&lt;Artist200ResponseInner&gt; artist(artistRequest).execute();

Get the total listen count and total unique listeners count for a given artist.  A JSON document with a list of artists and inc string must be POSTed. Up to MAX_ITEMS_PER_GET items can be requested at once.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPopularityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbPopularityApi apiInstance = new LbPopularityApi(defaultClient);
    ArtistRequest artistRequest = new ArtistRequest(); // ArtistRequest | 
    try {
      List<Artist200ResponseInner> result = apiInstance.artist(artistRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPopularityApi#artist");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **artistRequest** | [**ArtistRequest**](ArtistRequest.md)|  | |

### Return type

[**List&lt;Artist200ResponseInner&gt;**](Artist200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Feedback accepted. |  -  |
| **400** | Invalid JSON sent. |  -  |
| **401** | Invalid authorization. |  -  |

<a id="recording"></a>
# **recording**
> List&lt;Recording200ResponseInner&gt; recording(recordingRequest).execute();

Get the total listen count and total unique listeners count for a given recording.  A JSON document with a list of recording_mbids and inc string must be POSTed. Up to MAX_ITEMS_PER_GET items can be requested at once.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPopularityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbPopularityApi apiInstance = new LbPopularityApi(defaultClient);
    RecordingRequest recordingRequest = new RecordingRequest(); // RecordingRequest | 
    try {
      List<Recording200ResponseInner> result = apiInstance.recording(recordingRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPopularityApi#recording");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recordingRequest** | [**RecordingRequest**](RecordingRequest.md)|  | |

### Return type

[**List&lt;Recording200ResponseInner&gt;**](Recording200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Feedback accepted. |  -  |
| **400** | Invalid JSON sent. |  -  |
| **401** | Invalid authorization. |  -  |

<a id="release"></a>
# **release**
> List&lt;Release200ResponseInner&gt; release(releaseRequest).execute();

Get the total listen count and total unique listeners count for a given release.  A JSON document with a list of releases and inc string must be POSTed. Up to MAX_ITEMS_PER_GET items can be requested at once.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPopularityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbPopularityApi apiInstance = new LbPopularityApi(defaultClient);
    ReleaseRequest releaseRequest = new ReleaseRequest(); // ReleaseRequest | 
    try {
      List<Release200ResponseInner> result = apiInstance.release(releaseRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPopularityApi#release");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **releaseRequest** | [**ReleaseRequest**](ReleaseRequest.md)|  | |

### Return type

[**List&lt;Release200ResponseInner&gt;**](Release200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Feedback accepted. |  -  |
| **400** | Invalid JSON sent. |  -  |
| **401** | Invalid authorization. |  -  |

<a id="releaseGroup"></a>
# **releaseGroup**
> List&lt;ReleaseGroup200ResponseInner&gt; releaseGroup(releaseGroupRequest).execute();

Get the total listen count and total unique listeners count for a given release group.  A JSON document with a list of release groups and inc string must be POSTed. Up to MAX_ITEMS_PER_GET items can be requested at once.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPopularityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbPopularityApi apiInstance = new LbPopularityApi(defaultClient);
    ReleaseGroupRequest releaseGroupRequest = new ReleaseGroupRequest(); // ReleaseGroupRequest | 
    try {
      List<ReleaseGroup200ResponseInner> result = apiInstance.releaseGroup(releaseGroupRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPopularityApi#releaseGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **releaseGroupRequest** | [**ReleaseGroupRequest**](ReleaseGroupRequest.md)|  | |

### Return type

[**List&lt;ReleaseGroup200ResponseInner&gt;**](ReleaseGroup200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Feedback accepted. |  -  |
| **400** | Invalid JSON sent. |  -  |
| **401** | Invalid authorization. |  -  |

<a id="topRecordingsForArtist"></a>
# **topRecordingsForArtist**
> List&lt;TopRecordingsForArtistInner&gt; topRecordingsForArtist(artistMbid).execute();

Get a list of all recordings ever pinned by a user with given user_name in descending order of the time they were originally pinned.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPopularityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbPopularityApi apiInstance = new LbPopularityApi(defaultClient);
    UUID artistMbid = UUID.randomUUID(); // UUID | 
    try {
      List<TopRecordingsForArtistInner> result = apiInstance.topRecordingsForArtist(artistMbid)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPopularityApi#topRecordingsForArtist");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **artistMbid** | **UUID**|  | |

### Return type

[**List&lt;TopRecordingsForArtistInner&gt;**](TopRecordingsForArtistInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **400** | Invalid query parameters, see error message for details. |  -  |
| **404** | The requested user was not found. |  -  |

<a id="topReleaseGroupForArtist"></a>
# **topReleaseGroupForArtist**
> List&lt;TopReleaseGroupsForArtistInner&gt; topReleaseGroupForArtist(artistMbid).execute();

Get the top release groups by listen count for a given artist.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPopularityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbPopularityApi apiInstance = new LbPopularityApi(defaultClient);
    UUID artistMbid = UUID.randomUUID(); // UUID | 
    try {
      List<TopReleaseGroupsForArtistInner> result = apiInstance.topReleaseGroupForArtist(artistMbid)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPopularityApi#topReleaseGroupForArtist");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **artistMbid** | **UUID**|  | |

### Return type

[**List&lt;TopReleaseGroupsForArtistInner&gt;**](TopReleaseGroupsForArtistInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **400** | Invalid query parameters, see error message for details. |  -  |
| **404** | The requested user was not found. |  -  |

