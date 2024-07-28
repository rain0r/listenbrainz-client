# LbArtApi

All URIs are relative to *https://api.listenbrainz.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCoverArtGrid**](LbArtApi.md#createCoverArtGrid) | **POST** /1/art/grid/ | Create a cover art grid SVG file from the POSTed JSON data to this endpoint. |
| [**createCoverArtGridForUser**](LbArtApi.md#createCoverArtGridForUser) | **GET** /1/art/grid-stats/{user_name}/{time_range}/{dimension}/{layout}/{image_size} | Create a cover art grid SVG file from the stats of a given user. |
| [**createCustomCoverArt**](LbArtApi.md#createCustomCoverArt) | **GET** /1/art/{custom_name}/{user_name}/{time_range}/{image_size} | Create a custom cover art SVG file from the stats of a given user. |
| [**yearInMusic**](LbArtApi.md#yearInMusic) | **GET** /1/art/year-in-music/{year}/{user_name} | Create the shareable svg image using YIM stats. |


<a id="createCoverArtGrid"></a>
# **createCoverArtGrid**
> File createCoverArtGrid(createCoverArtGrid).execute();

Create a cover art grid SVG file from the POSTed JSON data to this endpoint.

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createCoverArtGrid** | [**CreateCoverArtGrid**](CreateCoverArtGrid.md)|  | |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/svg+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cover art created successfully. |  -  |
| **400** | Invalid JSON or invalid options in JSON passed. |  -  |

<a id="createCoverArtGridForUser"></a>
# **createCoverArtGridForUser**
> File createCoverArtGridForUser(userName, timeRange, dimension, layout, imageSize).execute();

Create a cover art grid SVG file from the stats of a given user.

### Example
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
    String userName = "userName_example"; // String | The name of the user for whom to create the cover art.
    AllowedStatisticsRange timeRange = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | Must be a statistics time range.
    Integer dimension = 56; // Integer | The dimension to use for this grid. A grid of dimension 3 has 3 images across and 3 images down, for a total of 9 images.
    Integer layout = 56; // Integer | The layout to be used for this grid. Layout 0 is always a simple grid, but other layouts may have image images be of different sizes. See https://art.listenbrainz.org for examples of the available layouts.
    Integer imageSize = 56; // Integer | The size of the cover art image.
    try {
      File result = apiInstance.createCoverArtGridForUser(userName, timeRange, dimension, layout, imageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbArtApi#createCoverArtGridForUser");
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
| **userName** | **String**| The name of the user for whom to create the cover art. | |
| **timeRange** | [**AllowedStatisticsRange**](.md)| Must be a statistics time range. | [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |
| **dimension** | **Integer**| The dimension to use for this grid. A grid of dimension 3 has 3 images across and 3 images down, for a total of 9 images. | |
| **layout** | **Integer**| The layout to be used for this grid. Layout 0 is always a simple grid, but other layouts may have image images be of different sizes. See https://art.listenbrainz.org for examples of the available layouts. | |
| **imageSize** | **Integer**| The size of the cover art image. | |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/svg+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cover art created successfully. |  -  |
| **400** | Invalid JSON or invalid options in JSON passed. |  -  |

<a id="createCustomCoverArt"></a>
# **createCustomCoverArt**
> File createCustomCoverArt(customName, userName, timeRange, imageSize).execute();

Create a custom cover art SVG file from the stats of a given user.

### Example
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
    CoverTypes customName = CoverTypes.fromValue("designer-top-5"); // CoverTypes | The name of cover art to be generated.
    String userName = "userName_example"; // String | The name of the user for whom to create the cover art.
    AllowedStatisticsRange timeRange = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | Must be a statistics time range.
    Integer imageSize = 56; // Integer | The size of the cover art image.
    try {
      File result = apiInstance.createCustomCoverArt(customName, userName, timeRange, imageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbArtApi#createCustomCoverArt");
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
| **customName** | [**CoverTypes**](.md)| The name of cover art to be generated. | [enum: designer-top-5, designer-top-10, lps-on-the-floor, grid-stats, grid-stats-special] |
| **userName** | **String**| The name of the user for whom to create the cover art. | |
| **timeRange** | [**AllowedStatisticsRange**](.md)| Must be a statistics time range. | [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |
| **imageSize** | **Integer**| The size of the cover art image. | |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/svg+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cover art created successfully. |  -  |
| **400** | Invalid JSON or invalid options in JSON passed. |  -  |

<a id="yearInMusic"></a>
# **yearInMusic**
> File yearInMusic(year, userName, image).execute();

Create the shareable svg image using YIM stats.

### Example
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
    Integer year = 56; // Integer | 
    String userName = "userName_example"; // String | The name of the user for whom to create the cover art.
    YearInMusicImage image = YearInMusicImage.fromValue("overview"); // YearInMusicImage | 
    try {
      File result = apiInstance.yearInMusic(year, userName, image)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbArtApi#yearInMusic");
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
| **year** | **Integer**|  | |
| **userName** | **String**| The name of the user for whom to create the cover art. | |
| **image** | [**YearInMusicImage**](.md)|  | [enum: overview, stats, artists, albums, tracks, discovery-playlist, missed-playlist] |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/svg+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cover art created successfully. |  -  |
| **400** | Invalid JSON or invalid options in JSON passed. |  -  |

