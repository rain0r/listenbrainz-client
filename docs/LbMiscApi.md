# LbMiscApi

All URIs are relative to *https://api.listenbrainz.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**color**](LbMiscApi.md#color) | **GET** /1/explore/color/{color} | Fetch a list of releases that have cover art that has a predominant color that is close to the given color. |
| [**freshReleases**](LbMiscApi.md#freshReleases) | **GET** /1/explore/fresh-releases/ | This endpoint fetches upcoming and recently released (fresh) releases. |
| [**getDumpInfo**](LbMiscApi.md#getDumpInfo) | **GET** /1/status/get-dump-info | Get information about ListenBrainz data dumps. You need to pass the id parameter in a GET request to get data about that particular dump. |
| [**lbRadio**](LbMiscApi.md#lbRadio) | **GET** /1/explore/lb-radio | Generate a playlist with LB Radio. |


<a id="color"></a>
# **color**
> Color color(color).execute();

Fetch a list of releases that have cover art that has a predominant color that is close to the given color.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbMiscApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbMiscApi apiInstance = new LbMiscApi(defaultClient);
    String color = "color_example"; // String | Color must be a 6 digit hex color code.
    try {
      Color result = apiInstance.color(color)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbMiscApi#color");
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
| **color** | **String**| Color must be a 6 digit hex color code. | |

### Return type

[**Color**](Color.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

<a id="freshReleases"></a>
# **freshReleases**
> FreshReleases freshReleases().releaseDate(releaseDate).days(days).sort(sort).past(past).future(future).execute();

This endpoint fetches upcoming and recently released (fresh) releases.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbMiscApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbMiscApi apiInstance = new LbMiscApi(defaultClient);
    String releaseDate = "releaseDate_example"; // String | Fresh releases will be shown around this pivot date. Must be in YYYY-MM-DD format.
    Integer days = 56; // Integer | The number of days of fresh releases to show. Max 90 days.
    String sort = "release_date"; // String | The sort order of the results.
    Boolean past = true; // Boolean | Whether to show releases in the past.
    Boolean future = true; // Boolean | Whether to show releases in the future.
    try {
      FreshReleases result = apiInstance.freshReleases()
            .releaseDate(releaseDate)
            .days(days)
            .sort(sort)
            .past(past)
            .future(future)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbMiscApi#freshReleases");
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
| **releaseDate** | **String**| Fresh releases will be shown around this pivot date. Must be in YYYY-MM-DD format. | [optional] |
| **days** | **Integer**| The number of days of fresh releases to show. Max 90 days. | [optional] |
| **sort** | **String**| The sort order of the results. | [optional] [default to release_name] [enum: release_date, artist_credit_name, release_name] |
| **past** | **Boolean**| Whether to show releases in the past. | [optional] [default to true] |
| **future** | **Boolean**| Whether to show releases in the future. | [optional] [default to true] |

### Return type

[**FreshReleases**](FreshReleases.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yay, you have data! |  -  |
| **400** | Invalid date or number of days passed. |  -  |

<a id="getDumpInfo"></a>
# **getDumpInfo**
> GetDumpInfo getDumpInfo().id(id).execute();

Get information about ListenBrainz data dumps. You need to pass the id parameter in a GET request to get data about that particular dump.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbMiscApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbMiscApi apiInstance = new LbMiscApi(defaultClient);
    Integer id = 56; // Integer | Integer specifying the ID of the dump, if not provided, the endpoint returns information about the latest data dump.
    try {
      GetDumpInfo result = apiInstance.getDumpInfo()
            .id(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbMiscApi#getDumpInfo");
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
| **id** | **Integer**| Integer specifying the ID of the dump, if not provided, the endpoint returns information about the latest data dump. | [optional] |

### Return type

[**GetDumpInfo**](GetDumpInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | You did not provide a valid dump ID. See error message for details. |  -  |
| **404** | Dump with given ID does not exist. |  -  |

<a id="lbRadio"></a>
# **lbRadio**
> LbRadio lbRadio(prompt, mode).execute();

Generate a playlist with LB Radio.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbMiscApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbMiscApi apiInstance = new LbMiscApi(defaultClient);
    String prompt = "prompt_example"; // String | The LB Radio prompt from which to generate playlists.
    Mode mode = Mode.fromValue("easy"); // Mode | The mode that LB radio should use. Must be easy, medium or hard.
    try {
      LbRadio result = apiInstance.lbRadio(prompt, mode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbMiscApi#lbRadio");
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
| **prompt** | **String**| The LB Radio prompt from which to generate playlists. | |
| **mode** | [**Mode**](.md)| The mode that LB radio should use. Must be easy, medium or hard. | [enum: easy, medium, hard] |

### Return type

[**LbRadio**](LbRadio.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

