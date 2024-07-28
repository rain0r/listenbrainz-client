# LbRecommendationsApi

All URIs are relative to *https://api.listenbrainz.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteFeedback**](LbRecommendationsApi.md#deleteFeedback) | **POST** /1/recommendations/feedback/delete | Delete feedback for a user. A user token (found on https://listenbrainz.org/settings/ ) must be provided in the Authorization header! Each request should contain only one recording mbid in the payload. |
| [**feedbackGivenBy**](LbRecommendationsApi.md#feedbackGivenBy) | **GET** /1/recommendations/feedback/user/{user_name} | Get feedback given by user &#39;user_name&#39;. |
| [**recordingRecommendations**](LbRecommendationsApi.md#recordingRecommendations) | **GET** /1/cf/recommendation/user/{user_name}/recording | Get recommendations sorted on rating and ratings for user &#39;user_name&#39;. |
| [**recordingsFeedbackGivenBy**](LbRecommendationsApi.md#recordingsFeedbackGivenBy) | **GET** /1/recommendations/feedback/user/{user_name}/recordings | Get feedback given by user &#39;user_name&#39; for the list of recordings supplied. |
| [**submitFeedback**](LbRecommendationsApi.md#submitFeedback) | **POST** /1/recommendations/feedback/submit | Submit recommendation feedback. A user token (found on https://listenbrainz.org/settings/ ) must be provided in the Authorization header! Each request should contain only one feedback in the payload. |


<a id="deleteFeedback"></a>
# **deleteFeedback**
> deleteFeedback(deleteFeedbackRequest).execute();

Delete feedback for a user. A user token (found on https://listenbrainz.org/settings/ ) must be provided in the Authorization header! Each request should contain only one recording mbid in the payload.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecommendationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbRecommendationsApi apiInstance = new LbRecommendationsApi(defaultClient);
    DeleteFeedbackRequest deleteFeedbackRequest = new DeleteFeedbackRequest(); // DeleteFeedbackRequest | 
    try {
      apiInstance.deleteFeedback(deleteFeedbackRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecommendationsApi#deleteFeedback");
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
| **deleteFeedbackRequest** | [**DeleteFeedbackRequest**](DeleteFeedbackRequest.md)|  | |

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

<a id="feedbackGivenBy"></a>
# **feedbackGivenBy**
> FeedbackGivenBy feedbackGivenBy(userName).rating(rating).count(count).offset(offset).execute();

Get feedback given by user &#39;user_name&#39;.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecommendationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbRecommendationsApi apiInstance = new LbRecommendationsApi(defaultClient);
    String userName = "userName_example"; // String | The MusicBrainz ID of the user whose timeline is being requested.
    String rating = "rating_example"; // String | Optional, refer to db/model/recommendation_feedback.py for allowed rating values.
    Integer count = 25; // Integer | Optional, number of recording mbids to return.
    Integer offset = 25; // Integer | Optional, number of mbids to skip from the beginning, for pagination. Ex. An offset of 5 means the 5 mbids will be skipped.
    try {
      FeedbackGivenBy result = apiInstance.feedbackGivenBy(userName)
            .rating(rating)
            .count(count)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecommendationsApi#feedbackGivenBy");
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
| **userName** | **String**| The MusicBrainz ID of the user whose timeline is being requested. | |
| **rating** | **String**| Optional, refer to db/model/recommendation_feedback.py for allowed rating values. | [optional] |
| **count** | **Integer**| Optional, number of recording mbids to return. | [optional] [default to 25] |
| **offset** | **Integer**| Optional, number of mbids to skip from the beginning, for pagination. Ex. An offset of 5 means the 5 mbids will be skipped. | [optional] [default to 25] |

### Return type

[**FeedbackGivenBy**](FeedbackGivenBy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **204** | Recommendations for the user haven&#39;t been generated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | User not found. |  -  |

<a id="recordingRecommendations"></a>
# **recordingRecommendations**
> RecordingRecommendations recordingRecommendations(userName).count(count).offset(offset).execute();

Get recommendations sorted on rating and ratings for user &#39;user_name&#39;.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecommendationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbRecommendationsApi apiInstance = new LbRecommendationsApi(defaultClient);
    String userName = "userName_example"; // String | The MusicBrainz ID of the user whose timeline is being requested.
    Integer count = 25; // Integer | Optional, number of recording mbids to return.
    Integer offset = 25; // Integer | Optional, number of mbids to skip from the beginning, for pagination. Ex. An offset of 5 means the 5 mbids will be skipped.
    try {
      RecordingRecommendations result = apiInstance.recordingRecommendations(userName)
            .count(count)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecommendationsApi#recordingRecommendations");
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
| **userName** | **String**| The MusicBrainz ID of the user whose timeline is being requested. | |
| **count** | **Integer**| Optional, number of recording mbids to return. | [optional] [default to 25] |
| **offset** | **Integer**| Optional, number of mbids to skip from the beginning, for pagination. Ex. An offset of 5 means the 5 mbids will be skipped. | [optional] [default to 25] |

### Return type

[**RecordingRecommendations**](RecordingRecommendations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful query, you have data! |  -  |
| **204** | Recommendations for the user haven&#39;t been generated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | User not found. |  -  |

<a id="recordingsFeedbackGivenBy"></a>
# **recordingsFeedbackGivenBy**
> RecordingsFeedbackGivenBy recordingsFeedbackGivenBy(userName, mbids).execute();

Get feedback given by user &#39;user_name&#39; for the list of recordings supplied.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecommendationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbRecommendationsApi apiInstance = new LbRecommendationsApi(defaultClient);
    String userName = "userName_example"; // String | The MusicBrainz ID of the user whose timeline is being requested.
    List<UUID> mbids = Arrays.asList(); // List<UUID> | Comma separated list of recording_mbids for which feedback records are to be fetched.
    try {
      RecordingsFeedbackGivenBy result = apiInstance.recordingsFeedbackGivenBy(userName, mbids)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecommendationsApi#recordingsFeedbackGivenBy");
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
| **userName** | **String**| The MusicBrainz ID of the user whose timeline is being requested. | |
| **mbids** | [**List&lt;UUID&gt;**](UUID.md)| Comma separated list of recording_mbids for which feedback records are to be fetched. | |

### Return type

[**RecordingsFeedbackGivenBy**](RecordingsFeedbackGivenBy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **400** | Bad request. |  -  |
| **404** | User not found. |  -  |

<a id="submitFeedback"></a>
# **submitFeedback**
> submitFeedback(submitFeedbackRequest).execute();

Submit recommendation feedback. A user token (found on https://listenbrainz.org/settings/ ) must be provided in the Authorization header! Each request should contain only one feedback in the payload.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.auth.*;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbRecommendationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LbRecommendationsApi apiInstance = new LbRecommendationsApi(defaultClient);
    SubmitFeedbackRequest submitFeedbackRequest = new SubmitFeedbackRequest(); // SubmitFeedbackRequest | 
    try {
      apiInstance.submitFeedback(submitFeedbackRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LbRecommendationsApi#submitFeedback");
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
| **submitFeedbackRequest** | [**SubmitFeedbackRequest**](SubmitFeedbackRequest.md)|  | |

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

