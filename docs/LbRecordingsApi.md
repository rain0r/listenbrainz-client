# LbRecordingsApi

All URIs are relative to *https://api.listenbrainz.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFeedback**](LbRecordingsApi.md#getFeedback) | **GET** /1/feedback/user/{user_name}/get-feedback | Get feedback given by user &#39;user_name&#39;. The format for the JSON returned is defined in our Feedback JSON Documentation.  If the optional argument score is not given, this endpoint will return all the feedback submitted by the user. Otherwise filters the feedback to be returned by score. |
| [**getFeedbackForRecordings**](LbRecordingsApi.md#getFeedbackForRecordings) | **GET** /1/feedback/user/{user_name}/get-feedback-for-recordings | Get feedback given by user user_name for the list of recordings supplied. |
| [**getFeedbackMbid**](LbRecordingsApi.md#getFeedbackMbid) | **GET** /1/feedback/recording/{recording_mbid}/get-feedback-mbid | Get feedback for recording with given recording_mbid. |
| [**getFeedbackMsid**](LbRecordingsApi.md#getFeedbackMsid) | **GET** /1/feedback/user/{recording_msid}/get-feedback | Get feedback for recording with given recording_msid. |
| [**getPins**](LbRecordingsApi.md#getPins) | **GET** /1/{user_name}/pins | Get a list of all recordings ever pinned by a user with given user_name in descending order of the time they were originally pinned. |
| [**getPinsCurrent**](LbRecordingsApi.md#getPinsCurrent) | **GET** /1/{user_name}/pins/current | Get the currently pinned recording by a user with given user_name. |
| [**getPinsFollowing**](LbRecordingsApi.md#getPinsFollowing) | **GET** /1/{user_name}/pins/following | Get a list containing the active pinned recordings for all users in a user&#39;s user_name following list. The returned pinned recordings are sorted in descending order of the time they were pinned. |
| [**pin**](LbRecordingsApi.md#pin) | **POST** /1/pin | Pin a recording for user. A user token (found on https://listenbrainz.org/settings/) must be provided in the Authorization header! Each request should contain only one pinned recording item in the payload. |
| [**pinDelete**](LbRecordingsApi.md#pinDelete) | **POST** /1/pin/delete/{row_id} | Deletes the pinned recording with given row_id from the server. A user token (found on https://listenbrainz.org/settings/) must be provided in the Authorization header! |
| [**recordingFeedback**](LbRecordingsApi.md#recordingFeedback) | **POST** /1/feedback/recording-feedback | Submit recording feedback (love/hate) to the server. A user token (found on https://listenbrainz.org/settings/ ) must be provided in the Authorization header! Each request should contain only one feedback in the payload. |
| [**unpin**](LbRecordingsApi.md#unpin) | **POST** /1/unpin | Unpins the currently active pinned recording for the user. A user token (found on https://listenbrainz.org/settings/) must be provided in the Authorization header! |
| [**updatePin**](LbRecordingsApi.md#updatePin) | **POST** /1/pin/update/{row_id} | Updates the blurb content of a pinned recording for the user. A user token (found on https://listenbrainz.org/settings/) must be provided in the Authorization header! Each request should contain only one pinned recording item in the payload. |


<a id="getFeedback"></a>
# **getFeedback**
> FeedbackResponse getFeedback(userName).score(score).count(count).offset(offset).metadata(metadata).execute();

Get feedback given by user &#39;user_name&#39;. The format for the JSON returned is defined in our Feedback JSON Documentation.  If the optional argument score is not given, this endpoint will return all the feedback submitted by the user. Otherwise filters the feedback to be returned by score.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbRecordingsApi apiInstance = new LbRecordingsApi(defaultClient);
    String userName = "userName_example"; // String | 
    Integer score = 56; // Integer | 
    Integer count = 25; // Integer | 
    Integer offset = 0; // Integer | 
    String metadata = "metadata_example"; // String | 
    try {
      FeedbackResponse result = apiInstance.getFeedback(userName)
            .score(score)
            .count(count)
            .offset(offset)
            .metadata(metadata)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecordingsApi#getFeedback");
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
| **score** | **Integer**|  | [optional] |
| **count** | **Integer**|  | [optional] [default to 25] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **metadata** | **String**|  | [optional] |

### Return type

[**FeedbackResponse**](FeedbackResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |

<a id="getFeedbackForRecordings"></a>
# **getFeedbackForRecordings**
> FeedbackResponse getFeedbackForRecordings(userName).recordingMsids(recordingMsids).recordingMbids(recordingMbids).execute();

Get feedback given by user user_name for the list of recordings supplied.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbRecordingsApi apiInstance = new LbRecordingsApi(defaultClient);
    String userName = "userName_example"; // String | 
    List<UUID> recordingMsids = Arrays.asList(); // List<UUID> | Comma separated list of recording_msids for which feedback records are to be fetched.
    List<UUID> recordingMbids = Arrays.asList(); // List<UUID> | Comma separated list of recording_mbids for which feedback records are to be fetched.
    try {
      FeedbackResponse result = apiInstance.getFeedbackForRecordings(userName)
            .recordingMsids(recordingMsids)
            .recordingMbids(recordingMbids)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecordingsApi#getFeedbackForRecordings");
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
| **recordingMsids** | [**List&lt;UUID&gt;**](UUID.md)| Comma separated list of recording_msids for which feedback records are to be fetched. | [optional] |
| **recordingMbids** | [**List&lt;UUID&gt;**](UUID.md)| Comma separated list of recording_mbids for which feedback records are to be fetched. | [optional] |

### Return type

[**FeedbackResponse**](FeedbackResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |

<a id="getFeedbackMbid"></a>
# **getFeedbackMbid**
> FeedbackResponse getFeedbackMbid(recordingMbid).score(score).count(count).offset(offset).execute();

Get feedback for recording with given recording_mbid.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbRecordingsApi apiInstance = new LbRecordingsApi(defaultClient);
    UUID recordingMbid = UUID.randomUUID(); // UUID | 
    Integer score = 56; // Integer | 
    Integer count = 25; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      FeedbackResponse result = apiInstance.getFeedbackMbid(recordingMbid)
            .score(score)
            .count(count)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecordingsApi#getFeedbackMbid");
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
| **recordingMbid** | **UUID**|  | |
| **score** | **Integer**|  | [optional] |
| **count** | **Integer**|  | [optional] [default to 25] |
| **offset** | **Integer**|  | [optional] [default to 0] |

### Return type

[**FeedbackResponse**](FeedbackResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |

<a id="getFeedbackMsid"></a>
# **getFeedbackMsid**
> FeedbackResponse getFeedbackMsid(recordingMsid).score(score).count(count).offset(offset).execute();

Get feedback for recording with given recording_msid.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbRecordingsApi apiInstance = new LbRecordingsApi(defaultClient);
    String recordingMsid = "recordingMsid_example"; // String | 
    Integer score = 56; // Integer | 
    Integer count = 25; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      FeedbackResponse result = apiInstance.getFeedbackMsid(recordingMsid)
            .score(score)
            .count(count)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecordingsApi#getFeedbackMsid");
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
| **recordingMsid** | **String**|  | |
| **score** | **Integer**|  | [optional] |
| **count** | **Integer**|  | [optional] [default to 25] |
| **offset** | **Integer**|  | [optional] [default to 0] |

### Return type

[**FeedbackResponse**](FeedbackResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |

<a id="getPins"></a>
# **getPins**
> GetPins getPins(userName).count(count).offset(offset).execute();

Get a list of all recordings ever pinned by a user with given user_name in descending order of the time they were originally pinned.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbRecordingsApi apiInstance = new LbRecordingsApi(defaultClient);
    String userName = "userName_example"; // String | 
    Integer count = 25; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      GetPins result = apiInstance.getPins(userName)
            .count(count)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecordingsApi#getPins");
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
| **count** | **Integer**|  | [optional] [default to 25] |
| **offset** | **Integer**|  | [optional] [default to 0] |

### Return type

[**GetPins**](GetPins.md)

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

<a id="getPinsCurrent"></a>
# **getPinsCurrent**
> GetPinsCurrent200Response getPinsCurrent(userName).execute();

Get the currently pinned recording by a user with given user_name.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbRecordingsApi apiInstance = new LbRecordingsApi(defaultClient);
    String userName = "userName_example"; // String | 
    try {
      GetPinsCurrent200Response result = apiInstance.getPinsCurrent(userName)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecordingsApi#getPinsCurrent");
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

[**GetPinsCurrent200Response**](GetPinsCurrent200Response.md)

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

<a id="getPinsFollowing"></a>
# **getPinsFollowing**
> GetPins getPinsFollowing(userName).count(count).offset(offset).execute();

Get a list containing the active pinned recordings for all users in a user&#39;s user_name following list. The returned pinned recordings are sorted in descending order of the time they were pinned.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbRecordingsApi apiInstance = new LbRecordingsApi(defaultClient);
    String userName = "userName_example"; // String | 
    Integer count = 25; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      GetPins result = apiInstance.getPinsFollowing(userName)
            .count(count)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecordingsApi#getPinsFollowing");
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
| **count** | **Integer**|  | [optional] [default to 25] |
| **offset** | **Integer**|  | [optional] [default to 0] |

### Return type

[**GetPins**](GetPins.md)

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

<a id="pin"></a>
# **pin**
> Pin200Response pin(pinRequest).execute();

Pin a recording for user. A user token (found on https://listenbrainz.org/settings/) must be provided in the Authorization header! Each request should contain only one pinned recording item in the payload.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbRecordingsApi apiInstance = new LbRecordingsApi(defaultClient);
    PinRequest pinRequest = new PinRequest(); // PinRequest | 
    try {
      Pin200Response result = apiInstance.pin(pinRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecordingsApi#pin");
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
| **pinRequest** | [**PinRequest**](PinRequest.md)|  | |

### Return type

[**Pin200Response**](Pin200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Feedback accepted. |  -  |
| **400** | Invalid JSON sent. |  -  |
| **401** | Invalid authorization. |  -  |

<a id="pinDelete"></a>
# **pinDelete**
> pinDelete(rowId).execute();

Deletes the pinned recording with given row_id from the server. A user token (found on https://listenbrainz.org/settings/) must be provided in the Authorization header!

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbRecordingsApi apiInstance = new LbRecordingsApi(defaultClient);
    Integer rowId = 56; // Integer | 
    try {
      apiInstance.pinDelete(rowId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecordingsApi#pinDelete");
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
| **rowId** | **Integer**|  | |

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
| **200** | Recording unpinned. |  -  |
| **401** | Invalid authorization. |  -  |
| **404** | The requested row_id for the user was not found. |  -  |

<a id="recordingFeedback"></a>
# **recordingFeedback**
> recordingFeedback(recordingFeedbackRequest).execute();

Submit recording feedback (love/hate) to the server. A user token (found on https://listenbrainz.org/settings/ ) must be provided in the Authorization header! Each request should contain only one feedback in the payload.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbRecordingsApi apiInstance = new LbRecordingsApi(defaultClient);
    RecordingFeedbackRequest recordingFeedbackRequest = new RecordingFeedbackRequest(); // RecordingFeedbackRequest | 
    try {
      apiInstance.recordingFeedback(recordingFeedbackRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecordingsApi#recordingFeedback");
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
| **recordingFeedbackRequest** | [**RecordingFeedbackRequest**](RecordingFeedbackRequest.md)|  | |

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
| **200** | Feedback accepted. |  -  |
| **400** | Invalid JSON sent. |  -  |
| **401** | Invalid authorization. |  -  |

<a id="unpin"></a>
# **unpin**
> unpin().execute();

Unpins the currently active pinned recording for the user. A user token (found on https://listenbrainz.org/settings/) must be provided in the Authorization header!

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbRecordingsApi apiInstance = new LbRecordingsApi(defaultClient);
    try {
      apiInstance.unpin()
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecordingsApi#unpin");
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

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Recording unpinned. |  -  |
| **401** | Invalid authorization. |  -  |
| **404** | Could not find the active recording to unpin for the user. |  -  |

<a id="updatePin"></a>
# **updatePin**
> updatePin(rowId, updatePinRequest).execute();

Updates the blurb content of a pinned recording for the user. A user token (found on https://listenbrainz.org/settings/) must be provided in the Authorization header! Each request should contain only one pinned recording item in the payload.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbRecordingsApi apiInstance = new LbRecordingsApi(defaultClient);
    Integer rowId = 56; // Integer | 
    UpdatePinRequest updatePinRequest = new UpdatePinRequest(); // UpdatePinRequest | 
    try {
      apiInstance.updatePin(rowId, updatePinRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecordingsApi#updatePin");
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
| **rowId** | **Integer**|  | |
| **updatePinRequest** | [**UpdatePinRequest**](UpdatePinRequest.md)|  | |

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
| **200** | Feedback accepted. |  -  |
| **400** | Invalid JSON sent. |  -  |
| **401** | Invalid authorization. |  -  |

