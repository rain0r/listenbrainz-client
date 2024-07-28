# LbMetadataApi

All URIs are relative to *https://api.listenbrainz.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**artistMetadata**](LbMetadataApi.md#artistMetadata) | **GET** /1/metadata/artist/ | This endpoint takes in a list of artist_mbids and returns an array of dicts that contain recording metadata suitable for showing in a context that requires as much detail about a recording and the artist. Using the inc parameter, you can control which portions of metadata to fetch. |
| [**getManualMapping**](LbMetadataApi.md#getManualMapping) | **GET** /1/metadata/get_manual_mapping/ | Get the manual mapping of a recording messybrainz ID that a user added. |
| [**lookup**](LbMetadataApi.md#lookup) | **GET** /1/metadata/lookup/ | This endpoint looks up mbid metadata for the given artist, recording and optionally a release name. The total number of characters in the artist name, recording name and release name query arguments should be less than or equal to MAX_MAPPING_QUERY_LENGTH. |
| [**recordingMetadata**](LbMetadataApi.md#recordingMetadata) | **GET** /1/metadata/recording/ | This endpoint takes in a list of recording_mbids and returns an array of dicts that contain recording metadata suitable for showing in a context that requires as much detail about a recording and the artist. Using the inc parameter, you can control which portions of metadata to fetch. |
| [**releaseGroupMetadata**](LbMetadataApi.md#releaseGroupMetadata) | **GET** /1/metadata/release_group/ | This endpoint takes in a list of release_group_mbids and returns an array of dicts that contain release_group metadata suitable for showing in a context that requires as much detail about a release_group and the artist. Using the inc parameter, you can control which portions of metadata to fetch. |
| [**submitManualMapping**](LbMetadataApi.md#submitManualMapping) | **POST** /1/metadata/submit_manual_mapping/ | Submit a manual mapping of a recording messybrainz ID to a musicbrainz recording id. |


<a id="artistMetadata"></a>
# **artistMetadata**
> List&lt;ArtistMetadata&gt; artistMetadata(artistMbids, inc).execute();

This endpoint takes in a list of artist_mbids and returns an array of dicts that contain recording metadata suitable for showing in a context that requires as much detail about a recording and the artist. Using the inc parameter, you can control which portions of metadata to fetch.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbMetadataApi apiInstance = new LbMetadataApi(defaultClient);
    List<UUID> artistMbids = Arrays.asList(); // List<UUID> | A comma separated list of recording_mbids.
    String inc = "inc_example"; // String | A space separated list of “artist”, “tag” and/or “release” to indicate which portions of metadata you're interested in fetching. We encourage users to only fetch the data they plan to consume.
    try {
      List<ArtistMetadata> result = apiInstance.artistMetadata(artistMbids, inc)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbMetadataApi#artistMetadata");
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
| **artistMbids** | [**List&lt;UUID&gt;**](UUID.md)| A comma separated list of recording_mbids. | |
| **inc** | **String**| A space separated list of “artist”, “tag” and/or “release” to indicate which portions of metadata you&#39;re interested in fetching. We encourage users to only fetch the data they plan to consume. | |

### Return type

[**List&lt;ArtistMetadata&gt;**](ArtistMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **400** | Invalid arguments. |  -  |

<a id="getManualMapping"></a>
# **getManualMapping**
> GetManualMapping getManualMapping(recordingMsid).execute();

Get the manual mapping of a recording messybrainz ID that a user added.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbMetadataApi apiInstance = new LbMetadataApi(defaultClient);
    UUID recordingMsid = UUID.randomUUID(); // UUID | 
    try {
      GetManualMapping result = apiInstance.getManualMapping(recordingMsid)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbMetadataApi#getManualMapping");
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
| **recordingMsid** | **UUID**|  | |

### Return type

[**GetManualMapping**](GetManualMapping.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **404** | No such mapping for this user/recording msid. |  -  |

<a id="lookup"></a>
# **lookup**
> Lookup lookup(artistName, recordingName, metadata, inc).releaseName(releaseName).execute();

This endpoint looks up mbid metadata for the given artist, recording and optionally a release name. The total number of characters in the artist name, recording name and release name query arguments should be less than or equal to MAX_MAPPING_QUERY_LENGTH.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbMetadataApi apiInstance = new LbMetadataApi(defaultClient);
    String artistName = "artistName_example"; // String | Artist name of the listen.
    String recordingName = "recordingName_example"; // String | Track name of the listen.
    Boolean metadata = true; // Boolean | Should extra metadata be also returned if a match is found, see /metadata/recording for details.
    String inc = "inc_example"; // String | A space separated list of “artist”, “tag” and/or “release” to indicate which portions of metadata you're interested in fetching. We encourage users to only fetch the data they plan to consume.
    String releaseName = "releaseName_example"; // String | Release name of the listen.
    try {
      Lookup result = apiInstance.lookup(artistName, recordingName, metadata, inc)
            .releaseName(releaseName)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbMetadataApi#lookup");
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
| **artistName** | **String**| Artist name of the listen. | |
| **recordingName** | **String**| Track name of the listen. | |
| **metadata** | **Boolean**| Should extra metadata be also returned if a match is found, see /metadata/recording for details. | |
| **inc** | **String**| A space separated list of “artist”, “tag” and/or “release” to indicate which portions of metadata you&#39;re interested in fetching. We encourage users to only fetch the data they plan to consume. | |
| **releaseName** | **String**| Release name of the listen. | [optional] |

### Return type

[**Lookup**](Lookup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **400** | Invalid arguments. |  -  |

<a id="recordingMetadata"></a>
# **recordingMetadata**
> Map&lt;String, RecordingMetadata&gt; recordingMetadata(recordingMbids, inc).execute();

This endpoint takes in a list of recording_mbids and returns an array of dicts that contain recording metadata suitable for showing in a context that requires as much detail about a recording and the artist. Using the inc parameter, you can control which portions of metadata to fetch.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbMetadataApi apiInstance = new LbMetadataApi(defaultClient);
    List<UUID> recordingMbids = Arrays.asList(); // List<UUID> | A comma separated list of recording_mbids.
    String inc = "inc_example"; // String | A space separated list of “artist”, “tag” and/or “release” to indicate which portions of metadata you're interested in fetching. We encourage users to only fetch the data they plan to consume.
    try {
      Map<String, RecordingMetadata> result = apiInstance.recordingMetadata(recordingMbids, inc)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbMetadataApi#recordingMetadata");
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
| **recordingMbids** | [**List&lt;UUID&gt;**](UUID.md)| A comma separated list of recording_mbids. | |
| **inc** | **String**| A space separated list of “artist”, “tag” and/or “release” to indicate which portions of metadata you&#39;re interested in fetching. We encourage users to only fetch the data they plan to consume. | |

### Return type

[**Map&lt;String, RecordingMetadata&gt;**](RecordingMetadata.md)

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

<a id="releaseGroupMetadata"></a>
# **releaseGroupMetadata**
> Map&lt;String, ReleaseGroupMetadata&gt; releaseGroupMetadata(releaseGroupMbids, inc).execute();

This endpoint takes in a list of release_group_mbids and returns an array of dicts that contain release_group metadata suitable for showing in a context that requires as much detail about a release_group and the artist. Using the inc parameter, you can control which portions of metadata to fetch.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbMetadataApi apiInstance = new LbMetadataApi(defaultClient);
    List<UUID> releaseGroupMbids = Arrays.asList(); // List<UUID> | A comma separated list of release_group_mbids.
    String inc = "inc_example"; // String | A space separated list of “artist”, “tag” and/or “release” to indicate which portions of metadata you're interested in fetching. We encourage users to only fetch the data they plan to consume.
    try {
      Map<String, ReleaseGroupMetadata> result = apiInstance.releaseGroupMetadata(releaseGroupMbids, inc)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbMetadataApi#releaseGroupMetadata");
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
| **releaseGroupMbids** | [**List&lt;UUID&gt;**](UUID.md)| A comma separated list of release_group_mbids. | |
| **inc** | **String**| A space separated list of “artist”, “tag” and/or “release” to indicate which portions of metadata you&#39;re interested in fetching. We encourage users to only fetch the data they plan to consume. | |

### Return type

[**Map&lt;String, ReleaseGroupMetadata&gt;**](ReleaseGroupMetadata.md)

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

<a id="submitManualMapping"></a>
# **submitManualMapping**
> submitManualMapping(submitManualMapping).execute();

Submit a manual mapping of a recording messybrainz ID to a musicbrainz recording id.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbMetadataApi apiInstance = new LbMetadataApi(defaultClient);
    SubmitManualMapping submitManualMapping = new SubmitManualMapping(); // SubmitManualMapping | 
    try {
      apiInstance.submitManualMapping(submitManualMapping)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LbMetadataApi#submitManualMapping");
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
| **submitManualMapping** | [**SubmitManualMapping**](SubmitManualMapping.md)|  | |

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

