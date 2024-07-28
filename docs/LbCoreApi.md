# LbCoreApi

All URIs are relative to *https://api.listenbrainz.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteListen**](LbCoreApi.md#deleteListen) | **POST** /1/delete-listen | Delete a particular listen from a user&#39;s listen history. |
| [**latestImport**](LbCoreApi.md#latestImport) | **GET** /1/latest-import | Get the timestamp of the newest listen submitted by a user in previous imports to ListenBrainz. |
| [**lbRadioRecordingsForArtist**](LbCoreApi.md#lbRadioRecordingsForArtist) | **GET** /1/lb-radio/artist/{seed_artist_mbid} | Get recordings for use in LB radio with the given seed artist. The endpoint returns a dict of all the similar artists, including the seed artist. For each artists, there will be a list of dicts that contain recording_mbid, similar_artist_mbid and total_listen_count. |
| [**lbRadioTags**](LbCoreApi.md#lbRadioTags) | **GET** /1/lb-radio/tags | Get recordings for use in LB radio with the specified tags that match the requested criteria. |
| [**listenCountForUser**](LbCoreApi.md#listenCountForUser) | **GET** /1/user/{user_name}/listen-count | Get the number of listens for a user &#39;user_name&#39;. |
| [**listensForUser**](LbCoreApi.md#listensForUser) | **GET** /1/user/{user_name}/listens | Get listens for user &#39;user_name&#39;. |
| [**playingNowForUser**](LbCoreApi.md#playingNowForUser) | **GET** /1/user/{user_name}/playing-now | Get the listen being played right now for user &#39;user_name&#39; |
| [**recommendationPlaylistsForUser**](LbCoreApi.md#recommendationPlaylistsForUser) | **GET** /1/user/{playlist_user_name}/playlists/recommendations | Fetch recommendation playlist metadata in JSPF format without recordings for &#39;playlist_user_name&#39;. This endpoint only lists playlists that are to be shown on the listenbrainz.org recommendations pages. |
| [**searchPlaylistForUser**](LbCoreApi.md#searchPlaylistForUser) | **GET** /1/user/{playlist_user_name}/playlists/search | Search for a playlist by name for a user. |
| [**searchUsers**](LbCoreApi.md#searchUsers) | **GET** /1/search/users | Search a ListenBrainz-registered user. |
| [**servicesForUser**](LbCoreApi.md#servicesForUser) | **GET** /1/user/{user_name}/services | Get list of services which are connected to a given user&#39;s account. |
| [**similarUsersForUser**](LbCoreApi.md#similarUsersForUser) | **GET** /1/user/{user_name}/similar-users | Get the listen being played right now for user &#39;user_name&#39;. |
| [**similarityOfUserForUser**](LbCoreApi.md#similarityOfUserForUser) | **GET** /1/user/{user_name}/similar-to/{other_user_name} | Get the similarity of &#39;user_name&#39; and &#39;other_user_name&#39;, based on their listening history. |
| [**submitListens**](LbCoreApi.md#submitListens) | **POST** /1/submit-listens | Submit listens to the server. |
| [**validateToken**](LbCoreApi.md#validateToken) | **GET** /1/validate-token | Check whether a User Token is a valid entry in the database. |


<a id="deleteListen"></a>
# **deleteListen**
> deleteListen(deleteListen).execute();

Delete a particular listen from a user&#39;s listen history.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbCoreApi apiInstance = new LbCoreApi(defaultClient);
    DeleteListen deleteListen = new DeleteListen(); // DeleteListen | 
    try {
      apiInstance.deleteListen(deleteListen)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LbCoreApi#deleteListen");
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
| **deleteListen** | [**DeleteListen**](DeleteListen.md)|  | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Listen deleted. |  -  |
| **400** | Invalid JSON sent. |  -  |
| **401** | Invalid authorization. |  -  |

<a id="latestImport"></a>
# **latestImport**
> LatestImport latestImport(userName).execute();

Get the timestamp of the newest listen submitted by a user in previous imports to ListenBrainz.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbCoreApi apiInstance = new LbCoreApi(defaultClient);
    String userName = "userName_example"; // String | The MusicBrainz ID of the user whose data is needed.
    try {
      LatestImport result = apiInstance.latestImport(userName)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbCoreApi#latestImport");
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
| **userName** | **String**| The MusicBrainz ID of the user whose data is needed. | |

### Return type

[**LatestImport**](LatestImport.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |

<a id="lbRadioRecordingsForArtist"></a>
# **lbRadioRecordingsForArtist**
> Map&lt;String, List&lt;LbRadioRecordingsForArtistValueInner&gt;&gt; lbRadioRecordingsForArtist(seedArtistMbid, mode, maxSimilarArtists, maxRecordingsPerArtist, popBegin, popEnd).execute();

Get recordings for use in LB radio with the given seed artist. The endpoint returns a dict of all the similar artists, including the seed artist. For each artists, there will be a list of dicts that contain recording_mbid, similar_artist_mbid and total_listen_count.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbCoreApi apiInstance = new LbCoreApi(defaultClient);
    UUID seedArtistMbid = UUID.randomUUID(); // UUID | 
    Mode mode = Mode.fromValue("easy"); // Mode | The mode that LB radio should use. Must be easy, medium or hard.
    Integer maxSimilarArtists = 56; // Integer | The maximum number of similar artists to return recordings for.
    Integer maxRecordingsPerArtist = 56; // Integer | The maximum number of recordings to return for each artist. If there are aren’t enough recordings, all available recordings will be returned.
    Integer popBegin = 56; // Integer | Popularity range percentage lower bound. A popularity range is given to narrow down the recordings into a smaller target group. The most popular recording(s) on LB have a pop percent of 100. The least popular recordings have a score of 0. This range is not coupled to the specified mode, but the mode would often determine the popularity range, so that less popular recordings can be returned on the medium and harder modes.
    Integer popEnd = 56; // Integer | Popularity range percentage upper bound.
    try {
      Map<String, List<LbRadioRecordingsForArtistValueInner>> result = apiInstance.lbRadioRecordingsForArtist(seedArtistMbid, mode, maxSimilarArtists, maxRecordingsPerArtist, popBegin, popEnd)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbCoreApi#lbRadioRecordingsForArtist");
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
| **seedArtistMbid** | **UUID**|  | |
| **mode** | [**Mode**](.md)| The mode that LB radio should use. Must be easy, medium or hard. | [enum: easy, medium, hard] |
| **maxSimilarArtists** | **Integer**| The maximum number of similar artists to return recordings for. | |
| **maxRecordingsPerArtist** | **Integer**| The maximum number of recordings to return for each artist. If there are aren’t enough recordings, all available recordings will be returned. | |
| **popBegin** | **Integer**| Popularity range percentage lower bound. A popularity range is given to narrow down the recordings into a smaller target group. The most popular recording(s) on LB have a pop percent of 100. The least popular recordings have a score of 0. This range is not coupled to the specified mode, but the mode would often determine the popularity range, so that less popular recordings can be returned on the medium and harder modes. | |
| **popEnd** | **Integer**| Popularity range percentage upper bound. | |

### Return type

[**Map&lt;String, List&lt;LbRadioRecordingsForArtistValueInner&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **400** | Invalid or missing param in request. |  -  |

<a id="lbRadioTags"></a>
# **lbRadioTags**
> List&lt;LbRadioTagsInner&gt; lbRadioTags(tag, popBegin, popEnd, count).operator(operator).execute();

Get recordings for use in LB radio with the specified tags that match the requested criteria.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbCoreApi apiInstance = new LbCoreApi(defaultClient);
    String tag = "tag_example"; // String | The MusicBrainz tag to fetch recordings for, this parameter can be specified multiple times. if more than one tag is specified, the operator param should also be specified.
    Integer popBegin = 56; // Integer | Popularity range percentage lower bound. A popularity range is given to narrow down the recordings into a smaller target group. The most popular recording(s) on LB have a pop percent of 100. The least popular recordings have a score of 0. This range is not coupled to the specified mode, but the mode would often determine the popularity range, so that less popular recordings can be returned on the medium and harder modes.
    Integer popEnd = 56; // Integer | Popularity range percentage upper bound.
    Integer count = 25; // Integer | Optional, number of listens to return.
    Operator operator = Operator.fromValue("AND"); // Operator | Specify AND to retrieve recordings that have all the tags, otherwise specify OR to retrieve recordings that have any one of the tags.
    try {
      List<LbRadioTagsInner> result = apiInstance.lbRadioTags(tag, popBegin, popEnd, count)
            .operator(operator)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbCoreApi#lbRadioTags");
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
| **tag** | **String**| The MusicBrainz tag to fetch recordings for, this parameter can be specified multiple times. if more than one tag is specified, the operator param should also be specified. | |
| **popBegin** | **Integer**| Popularity range percentage lower bound. A popularity range is given to narrow down the recordings into a smaller target group. The most popular recording(s) on LB have a pop percent of 100. The least popular recordings have a score of 0. This range is not coupled to the specified mode, but the mode would often determine the popularity range, so that less popular recordings can be returned on the medium and harder modes. | |
| **popEnd** | **Integer**| Popularity range percentage upper bound. | |
| **count** | **Integer**| Optional, number of listens to return. | [default to 25] |
| **operator** | [**Operator**](.md)| Specify AND to retrieve recordings that have all the tags, otherwise specify OR to retrieve recordings that have any one of the tags. | [optional] [enum: AND, OR] |

### Return type

[**List&lt;LbRadioTagsInner&gt;**](LbRadioTagsInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **400** | Invalid or missing param in request. |  -  |

<a id="listenCountForUser"></a>
# **listenCountForUser**
> ListenCountForUser listenCountForUser(userName).execute();

Get the number of listens for a user &#39;user_name&#39;.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbCoreApi apiInstance = new LbCoreApi(defaultClient);
    String userName = "userName_example"; // String | 
    try {
      ListenCountForUser result = apiInstance.listenCountForUser(userName)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbCoreApi#listenCountForUser");
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
| **userName** | **String**|  | |

### Return type

[**ListenCountForUser**](ListenCountForUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have listen counts! |  -  |
| **404** | The requested user was not found. |  -  |

<a id="listensForUser"></a>
# **listensForUser**
> ListensForUser listensForUser(userName).maxTs(maxTs).minTs(minTs).count(count).execute();

Get listens for user &#39;user_name&#39;.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbCoreApi apiInstance = new LbCoreApi(defaultClient);
    String userName = "userName_example"; // String | 
    Integer maxTs = 56; // Integer | If you specify a 'max_ts' timestamp, listens with listened_at less than (but not including) this value will be returned.
    Integer minTs = 56; // Integer | If you specify a 'min_ts' timestamp, listens with listened_at greater than (but not including) this value will be returned.
    Integer count = 25; // Integer | Optional, number of listens to return.
    try {
      ListensForUser result = apiInstance.listensForUser(userName)
            .maxTs(maxTs)
            .minTs(minTs)
            .count(count)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbCoreApi#listensForUser");
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
| **userName** | **String**|  | |
| **maxTs** | **Integer**| If you specify a &#39;max_ts&#39; timestamp, listens with listened_at less than (but not including) this value will be returned. | [optional] |
| **minTs** | **Integer**| If you specify a &#39;min_ts&#39; timestamp, listens with listened_at greater than (but not including) this value will be returned. | [optional] |
| **count** | **Integer**| Optional, number of listens to return. | [optional] [default to 25] |

### Return type

[**ListensForUser**](ListensForUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **404** | The requested user was not found. |  -  |

<a id="playingNowForUser"></a>
# **playingNowForUser**
> PlayingNowForUser playingNowForUser(userName).execute();

Get the listen being played right now for user &#39;user_name&#39;

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbCoreApi apiInstance = new LbCoreApi(defaultClient);
    String userName = "userName_example"; // String | 
    try {
      PlayingNowForUser result = apiInstance.playingNowForUser(userName)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbCoreApi#playingNowForUser");
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
| **userName** | **String**|  | |

### Return type

[**PlayingNowForUser**](PlayingNowForUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **404** | The requested user was not found. |  -  |

<a id="recommendationPlaylistsForUser"></a>
# **recommendationPlaylistsForUser**
> Playlists recommendationPlaylistsForUser(playlistUserName).execute();

Fetch recommendation playlist metadata in JSPF format without recordings for &#39;playlist_user_name&#39;. This endpoint only lists playlists that are to be shown on the listenbrainz.org recommendations pages.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbCoreApi apiInstance = new LbCoreApi(defaultClient);
    String playlistUserName = "playlistUserName_example"; // String | 
    try {
      Playlists result = apiInstance.recommendationPlaylistsForUser(playlistUserName)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbCoreApi#recommendationPlaylistsForUser");
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
| **playlistUserName** | **String**|  | |

### Return type

[**Playlists**](Playlists.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **404** | User not found. |  -  |

<a id="searchPlaylistForUser"></a>
# **searchPlaylistForUser**
> Playlists searchPlaylistForUser(playlistUserName, query).count(count).offset(offset).execute();

Search for a playlist by name for a user.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbCoreApi apiInstance = new LbCoreApi(defaultClient);
    String playlistUserName = "playlistUserName_example"; // String | 
    String query = "query_example"; // String | 
    Integer count = 25; // Integer | The number of playlists to return (for pagination).
    Integer offset = 56; // Integer | The offset of into the list of playlists to return (for pagination).
    try {
      Playlists result = apiInstance.searchPlaylistForUser(playlistUserName, query)
            .count(count)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbCoreApi#searchPlaylistForUser");
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
| **playlistUserName** | **String**|  | |
| **query** | **String**|  | |
| **count** | **Integer**| The number of playlists to return (for pagination). | [optional] [default to 25] |
| **offset** | **Integer**| The offset of into the list of playlists to return (for pagination). | [optional] |

### Return type

[**Playlists**](Playlists.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **404** | The requested user was not found. |  -  |

<a id="searchUsers"></a>
# **searchUsers**
> SearchUsers searchUsers(searchTerm).execute();

Search a ListenBrainz-registered user.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbCoreApi apiInstance = new LbCoreApi(defaultClient);
    String searchTerm = "searchTerm_example"; // String | Input on which search operation is to be performed.
    try {
      SearchUsers result = apiInstance.searchUsers(searchTerm)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbCoreApi#searchUsers");
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
| **searchTerm** | **String**| Input on which search operation is to be performed. | |

### Return type

[**SearchUsers**](SearchUsers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a id="servicesForUser"></a>
# **servicesForUser**
> ServicesForUser servicesForUser(userName).execute();

Get list of services which are connected to a given user&#39;s account.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbCoreApi apiInstance = new LbCoreApi(defaultClient);
    String userName = "userName_example"; // String | 
    try {
      ServicesForUser result = apiInstance.servicesForUser(userName)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbCoreApi#servicesForUser");
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
| **userName** | **String**|  | |

### Return type

[**ServicesForUser**](ServicesForUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **401** | Invalid authorization. |  -  |
| **403** | Forbidden, you do not have permissions to view this user&#39;s information. |  -  |
| **404** | The requested user was not found. |  -  |

<a id="similarUsersForUser"></a>
# **similarUsersForUser**
> SimilarUsersForUser similarUsersForUser(userName).execute();

Get the listen being played right now for user &#39;user_name&#39;.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbCoreApi apiInstance = new LbCoreApi(defaultClient);
    String userName = "userName_example"; // String | 
    try {
      SimilarUsersForUser result = apiInstance.similarUsersForUser(userName)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbCoreApi#similarUsersForUser");
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
| **userName** | **String**|  | |

### Return type

[**SimilarUsersForUser**](SimilarUsersForUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **404** | The requested user was not found. |  -  |

<a id="similarityOfUserForUser"></a>
# **similarityOfUserForUser**
> SimilarityOfUserForUser similarityOfUserForUser(userName, otherUserName).execute();

Get the similarity of &#39;user_name&#39; and &#39;other_user_name&#39;, based on their listening history.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbCoreApi apiInstance = new LbCoreApi(defaultClient);
    String userName = "userName_example"; // String | 
    String otherUserName = "otherUserName_example"; // String | 
    try {
      SimilarityOfUserForUser result = apiInstance.similarityOfUserForUser(userName, otherUserName)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbCoreApi#similarityOfUserForUser");
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
| **userName** | **String**|  | |
| **otherUserName** | **String**|  | |

### Return type

[**SimilarityOfUserForUser**](SimilarityOfUserForUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **404** | The requested user was not found. |  -  |

<a id="submitListens"></a>
# **submitListens**
> submitListens(submitListens).execute();

Submit listens to the server.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbCoreApi apiInstance = new LbCoreApi(defaultClient);
    SubmitListens submitListens = new SubmitListens(); // SubmitListens | 
    try {
      apiInstance.submitListens(submitListens)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LbCoreApi#submitListens");
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
| **submitListens** | [**SubmitListens**](SubmitListens.md)|  | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Listen(s) accepted. |  -  |
| **400** | Invalid JSON sent. |  -  |
| **401** | Invalid authorization. |  -  |

<a id="validateToken"></a>
# **validateToken**
> ValidateToken validateToken().execute();

Check whether a User Token is a valid entry in the database.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbCoreApi apiInstance = new LbCoreApi(defaultClient);
    try {
      ValidateToken result = apiInstance.validateToken()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbCoreApi#validateToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ValidateToken**](ValidateToken.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The user token is valid/invalid. |  -  |
| **400** | No token was sent to the endpoint. |  -  |

