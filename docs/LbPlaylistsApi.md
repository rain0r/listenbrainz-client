# LbPlaylistsApi

All URIs are relative to *https://api.listenbrainz.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appendRecordings**](LbPlaylistsApi.md#appendRecordings) | **POST** /1/playlist/{playlist_mbid}/item/add/{offset} | Append recordings to an existing playlist by posting a playlist with one of more recordings in it. The playlist must be in JSPF format with MusicBrainz extensions, which is defined here: https://musicbrainz.org/doc/jspf .  If the offset is provided in the URL, then the recordings will be added at that offset, otherwise they will be added at the end of the playlist. |
| [**copyPlaylist**](LbPlaylistsApi.md#copyPlaylist) | **POST** /1/playlist/{playlist_mbid}/copy | Copy a playlist - the new playlist will be given the name “Copy of &lt;playlist_name&gt;”. POST body data does not need to contain anything. |
| [**createPlaylist**](LbPlaylistsApi.md#createPlaylist) | **POST** /1/playlist/create | Create a playlist |
| [**deletePlaylist**](LbPlaylistsApi.md#deletePlaylist) | **POST** /1/playlist/{playlist_mbid}/delete | Delete a playlist. |
| [**editPlaylist**](LbPlaylistsApi.md#editPlaylist) | **POST** /1/playlist/edit/{playlist_mbid} | Create a playlist. The playlist must be in JSPF format with MusicBrainz extensions, which is defined here: https://musicbrainz.org/doc/jspf . To create an empty playlist, you can send an empty playlist with only the title field filled out. If you would like to create a playlist populated with recordings, each of the track items in the playlist must have an identifier element that contains the MusicBrainz recording that includes the recording MBID.  When creating a playlist, only the playlist title and the track identifier elements will be used - all other elements in the posted JSPF wil be ignored.  If a created_for field is found and the user is not an approved playlist bot, then a 403 forbidden will be raised. |
| [**fetchPlaylist**](LbPlaylistsApi.md#fetchPlaylist) | **GET** /1/playlist/{playlist_mbid} | Fetch the given playlist. |
| [**itemDelete**](LbPlaylistsApi.md#itemDelete) | **POST** /1/playlist/{playlist_mbid}/item/delete | Delete an item in a playlist. |
| [**moveItem**](LbPlaylistsApi.md#moveItem) | **POST** /1/playlist/{playlist_mbid}/item/move | To move an item in a playlist, the POST data needs to specify the recording MBID and current index of the track to move (from), where to move it to (to) and how many tracks from that position should be moved (count). |
| [**playlistsCreatedForUser**](LbPlaylistsApi.md#playlistsCreatedForUser) | **GET** /1/user/{playlist_user_name}/playlists/createdfor | Fetch playlist metadata in JSPF format without recordings that have been created for the user. |
| [**playlistsForUser**](LbPlaylistsApi.md#playlistsForUser) | **GET** /1/user/{playlist_user_name}/playlists | Fetch playlist metadata in JSPF format without recordings for the given user. |
| [**playlistsForUserCollaborator**](LbPlaylistsApi.md#playlistsForUserCollaborator) | **GET** /1/user/{playlist_user_name}/playlists/collaborator | Fetch playlist metadata in JSPF format without recordings for which a user is a collaborator. If a playlist is private, it will only be returned if the caller is authorized to edit that playlist. |
| [**searchPlaylists**](LbPlaylistsApi.md#searchPlaylists) | **GET** /1/playlist/search | Search for playlists by name or description. The search query must be at least 3 characters long. |


<a id="appendRecordings"></a>
# **appendRecordings**
> appendRecordings(playlistMbid, offset, playlist).execute();

Append recordings to an existing playlist by posting a playlist with one of more recordings in it. The playlist must be in JSPF format with MusicBrainz extensions, which is defined here: https://musicbrainz.org/doc/jspf .  If the offset is provided in the URL, then the recordings will be added at that offset, otherwise they will be added at the end of the playlist.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbPlaylistsApi apiInstance = new LbPlaylistsApi(defaultClient);
    UUID playlistMbid = UUID.randomUUID(); // UUID | The playlist mbid to append to.
    Integer offset = 56; // Integer | Offset.
    Playlist playlist = new Playlist(); // Playlist | 
    try {
      apiInstance.appendRecordings(playlistMbid, offset, playlist)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPlaylistsApi#appendRecordings");
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
| **playlistMbid** | **UUID**| The playlist mbid to append to. | |
| **offset** | **Integer**| Offset. | |
| **playlist** | [**Playlist**](Playlist.md)|  | |

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
| **200** | Playlist accepted. |  -  |
| **400** | Invalid JSON sent, see error message for details. |  -  |
| **401** | Invalid authorization. See error message for details. |  -  |
| **403** | Forbidden. The requesting user was not allowed to carry out this operation. |  -  |

<a id="copyPlaylist"></a>
# **copyPlaylist**
> copyPlaylist(playlistMbid).execute();

Copy a playlist - the new playlist will be given the name “Copy of &lt;playlist_name&gt;”. POST body data does not need to contain anything.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbPlaylistsApi apiInstance = new LbPlaylistsApi(defaultClient);
    UUID playlistMbid = UUID.randomUUID(); // UUID | The playlist mbid to append to.
    try {
      apiInstance.copyPlaylist(playlistMbid)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPlaylistsApi#copyPlaylist");
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
| **playlistMbid** | **UUID**| The playlist mbid to append to. | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Playlist copied. |  -  |
| **401** | Invalid authorization. See error message for details. |  -  |
| **403** | Forbidden. The requesting user was not allowed to carry out this operation. |  -  |
| **404** | Playlist not found. |  -  |

<a id="createPlaylist"></a>
# **createPlaylist**
> CreatePlaylist200Response createPlaylist(createPlaylistRequest).execute();

Create a playlist

Create a playlist. The playlist must be in JSPF format with MusicBrainz extensions, which is defined here: https://musicbrainz.org/doc/jspf . To create an empty playlist, you can send an empty playlist with only the title field filled out. If you would like to create a playlist populated with recordings, each of the track items in the playlist must have an identifier element that contains the MusicBrainz recording that includes the recording MBID.  When creating a playlist, only the playlist title and the track identifier elements will be used - all other elements in the posted JSPF wil be ignored.  If a created_for field is found and the user is not an approved playlist bot, then a 403 forbidden will be raised.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbPlaylistsApi apiInstance = new LbPlaylistsApi(defaultClient);
    CreatePlaylistRequest createPlaylistRequest = new CreatePlaylistRequest(); // CreatePlaylistRequest | 
    try {
      CreatePlaylist200Response result = apiInstance.createPlaylist(createPlaylistRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPlaylistsApi#createPlaylist");
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
| **createPlaylistRequest** | [**CreatePlaylistRequest**](CreatePlaylistRequest.md)|  | |

### Return type

[**CreatePlaylist200Response**](CreatePlaylist200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Playlist accepted. |  -  |
| **400** | Invalid JSON sent. |  -  |
| **401** | Invalid authorization. |  -  |
| **403** | The submitting user is not allowed to create playlists for other users. |  -  |

<a id="deletePlaylist"></a>
# **deletePlaylist**
> deletePlaylist(playlistMbid).execute();

Delete a playlist.

POST body data does not need to contain anything.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbPlaylistsApi apiInstance = new LbPlaylistsApi(defaultClient);
    UUID playlistMbid = UUID.randomUUID(); // UUID | The playlist mbid to fetch.
    try {
      apiInstance.deletePlaylist(playlistMbid)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPlaylistsApi#deletePlaylist");
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
| **playlistMbid** | **UUID**| The playlist mbid to fetch. | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Playlist deleted. |  -  |
| **401** | Invalid authorization. |  -  |
| **403** | The requesting user was not allowed to carry out this operation. |  -  |
| **404** | Playlist not found. |  -  |

<a id="editPlaylist"></a>
# **editPlaylist**
> editPlaylist(playlistMbid, createPlaylistRequest).execute();

Create a playlist. The playlist must be in JSPF format with MusicBrainz extensions, which is defined here: https://musicbrainz.org/doc/jspf . To create an empty playlist, you can send an empty playlist with only the title field filled out. If you would like to create a playlist populated with recordings, each of the track items in the playlist must have an identifier element that contains the MusicBrainz recording that includes the recording MBID.  When creating a playlist, only the playlist title and the track identifier elements will be used - all other elements in the posted JSPF wil be ignored.  If a created_for field is found and the user is not an approved playlist bot, then a 403 forbidden will be raised.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbPlaylistsApi apiInstance = new LbPlaylistsApi(defaultClient);
    UUID playlistMbid = UUID.randomUUID(); // UUID | The playlist mbid to edit.
    CreatePlaylistRequest createPlaylistRequest = new CreatePlaylistRequest(); // CreatePlaylistRequest | 
    try {
      apiInstance.editPlaylist(playlistMbid, createPlaylistRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPlaylistsApi#editPlaylist");
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
| **playlistMbid** | **UUID**| The playlist mbid to edit. | |
| **createPlaylistRequest** | [**CreatePlaylistRequest**](CreatePlaylistRequest.md)|  | |

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
| **200** | Playlist accepted. |  -  |
| **400** | Invalid JSON sent. |  -  |
| **401** | Invalid authorization. |  -  |
| **403** | The submitting user is not allowed to create playlists for other users. |  -  |

<a id="fetchPlaylist"></a>
# **fetchPlaylist**
> CreatePlaylistRequest fetchPlaylist(playlistMbid).fetchMetadata(fetchMetadata).execute();

Fetch the given playlist.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbPlaylistsApi apiInstance = new LbPlaylistsApi(defaultClient);
    UUID playlistMbid = UUID.randomUUID(); // UUID | The playlist mbid to fetch.
    Boolean fetchMetadata = true; // Boolean | Optional, pass value ‘false' to skip lookup up recording metadata.
    try {
      CreatePlaylistRequest result = apiInstance.fetchPlaylist(playlistMbid)
            .fetchMetadata(fetchMetadata)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPlaylistsApi#fetchPlaylist");
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
| **playlistMbid** | **UUID**| The playlist mbid to fetch. | |
| **fetchMetadata** | **Boolean**| Optional, pass value ‘false&#39; to skip lookup up recording metadata. | [optional] |

### Return type

[**CreatePlaylistRequest**](CreatePlaylistRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **401** | Invalid authorization. See error message for details. |  -  |
| **404** | Playlist not found. |  -  |

<a id="itemDelete"></a>
# **itemDelete**
> itemDelete(playlistMbid, itemDeleteRequest).execute();

Delete an item in a playlist.

To delete an item in a playlist, the POST data needs to specify the recording MBID and current index of the track to delete, and how many tracks from that position should be moved deleted.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbPlaylistsApi apiInstance = new LbPlaylistsApi(defaultClient);
    UUID playlistMbid = UUID.randomUUID(); // UUID | The playlist mbid to fetch.
    ItemDeleteRequest itemDeleteRequest = new ItemDeleteRequest(); // ItemDeleteRequest | 
    try {
      apiInstance.itemDelete(playlistMbid, itemDeleteRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPlaylistsApi#itemDelete");
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
| **playlistMbid** | **UUID**| The playlist mbid to fetch. | |
| **itemDeleteRequest** | [**ItemDeleteRequest**](ItemDeleteRequest.md)|  | |

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
| **200** | Playlist accepted. |  -  |
| **400** | Invalid JSON sent. |  -  |
| **401** | Invalid authorization. |  -  |
| **403** | The requesting user was not allowed to carry out this operation. |  -  |

<a id="moveItem"></a>
# **moveItem**
> moveItem(playlistMbid, moveItemRequest).execute();

To move an item in a playlist, the POST data needs to specify the recording MBID and current index of the track to move (from), where to move it to (to) and how many tracks from that position should be moved (count).

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbPlaylistsApi apiInstance = new LbPlaylistsApi(defaultClient);
    UUID playlistMbid = UUID.randomUUID(); // UUID | The playlist mbid to append to.
    MoveItemRequest moveItemRequest = new MoveItemRequest(); // MoveItemRequest | 
    try {
      apiInstance.moveItem(playlistMbid, moveItemRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPlaylistsApi#moveItem");
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
| **playlistMbid** | **UUID**| The playlist mbid to append to. | |
| **moveItemRequest** | [**MoveItemRequest**](MoveItemRequest.md)|  | |

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
| **200** | Move operation succeeded. |  -  |
| **400** | Invalid JSON sent, see error message for details. |  -  |
| **401** | Invalid authorization. See error message for details. |  -  |
| **403** | Forbidden. The requesting user was not allowed to carry out this operation. |  -  |

<a id="playlistsCreatedForUser"></a>
# **playlistsCreatedForUser**
> Playlists playlistsCreatedForUser(playlistUserName).count(count).offset(offset).execute();

Fetch playlist metadata in JSPF format without recordings that have been created for the user.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbPlaylistsApi apiInstance = new LbPlaylistsApi(defaultClient);
    String playlistUserName = "playlistUserName_example"; // String | 
    Integer count = 25; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      Playlists result = apiInstance.playlistsCreatedForUser(playlistUserName)
            .count(count)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPlaylistsApi#playlistsCreatedForUser");
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
| **count** | **Integer**|  | [optional] [default to 25] |
| **offset** | **Integer**|  | [optional] |

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

<a id="playlistsForUser"></a>
# **playlistsForUser**
> Playlists playlistsForUser(playlistUserName).count(count).offset(offset).execute();

Fetch playlist metadata in JSPF format without recordings for the given user.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbPlaylistsApi apiInstance = new LbPlaylistsApi(defaultClient);
    String playlistUserName = "playlistUserName_example"; // String | 
    Integer count = 25; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      Playlists result = apiInstance.playlistsForUser(playlistUserName)
            .count(count)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPlaylistsApi#playlistsForUser");
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
| **count** | **Integer**|  | [optional] [default to 25] |
| **offset** | **Integer**|  | [optional] |

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

<a id="playlistsForUserCollaborator"></a>
# **playlistsForUserCollaborator**
> Playlists playlistsForUserCollaborator(playlistUserName).count(count).offset(offset).execute();

Fetch playlist metadata in JSPF format without recordings for which a user is a collaborator. If a playlist is private, it will only be returned if the caller is authorized to edit that playlist.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbPlaylistsApi apiInstance = new LbPlaylistsApi(defaultClient);
    String playlistUserName = "playlistUserName_example"; // String | 
    Integer count = 25; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      Playlists result = apiInstance.playlistsForUserCollaborator(playlistUserName)
            .count(count)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPlaylistsApi#playlistsForUserCollaborator");
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
| **count** | **Integer**|  | [optional] [default to 25] |
| **offset** | **Integer**|  | [optional] |

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
| **404** | User not found. |  -  |

<a id="searchPlaylists"></a>
# **searchPlaylists**
> Playlists searchPlaylists(query).execute();

Search for playlists by name or description. The search query must be at least 3 characters long.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbPlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbPlaylistsApi apiInstance = new LbPlaylistsApi(defaultClient);
    String query = "query_example"; // String | 
    try {
      Playlists result = apiInstance.searchPlaylists(query)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbPlaylistsApi#searchPlaylists");
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
| **query** | **String**|  | |

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
| **400** | Invalid query string, see error message for details. |  -  |
| **401** | Invalid authorization. See error message for details. |  -  |

