# LbStatsApi

All URIs are relative to *https://api.listenbrainz.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**artistMapForUser**](LbStatsApi.md#artistMapForUser) | **GET** /1/stats/user/{user_name}/artist-map | Get the artist map for user &#39;user_name&#39;. |
| [**dailyActivityForUser**](LbStatsApi.md#dailyActivityForUser) | **GET** /1/stats/user/{user_name}/daily-activity | Get the daily activity for user &#39;user_name&#39;. |
| [**listenersForArtist**](LbStatsApi.md#listenersForArtist) | **GET** /1/stats/artist/{artist_mbid}/listeners | Get top listeners for artist &#39;artist_mbid&#39;. |
| [**listenersForReleaseGroup**](LbStatsApi.md#listenersForReleaseGroup) | **GET** /1/stats/release-group/{release_group_mbid}/listeners | Get top listeners for release group &#39;release_group_mbid&#39;. |
| [**listeningActivityForUser**](LbStatsApi.md#listeningActivityForUser) | **GET** /1/stats/user/{user_name}/listening-activity | Get the listening activity for user &#39;user_name&#39;. |
| [**sitewideArtistMap**](LbStatsApi.md#sitewideArtistMap) | **GET** /1/stats/sitewide/artist-map | Get sitewide top recordings. |
| [**sitewideListeningActivity**](LbStatsApi.md#sitewideListeningActivity) | **GET** /1/stats/sitewide/listening-activity | Get sitewide top recordings. |
| [**sitewideTopArtists**](LbStatsApi.md#sitewideTopArtists) | **GET** /1/stats/sitewide/artists | Get sitewide top artists. |
| [**sitewideTopRecordings**](LbStatsApi.md#sitewideTopRecordings) | **GET** /1/stats/sitewide/recordings | Get sitewide top recordings. |
| [**sitewideTopReleaseGroups**](LbStatsApi.md#sitewideTopReleaseGroups) | **GET** /1/stats/sitewide/release-groups | Get sitewide top release groups. |
| [**sitewideTopReleases**](LbStatsApi.md#sitewideTopReleases) | **GET** /1/stats/sitewide/releases | Get sitewide top releases. |
| [**topArtistsForUser**](LbStatsApi.md#topArtistsForUser) | **GET** /1/stats/user/{user_name}/artists | Get top artists for user &#39;user_name&#39;. |
| [**topRecordingsForUser**](LbStatsApi.md#topRecordingsForUser) | **GET** /1/stats/user/{user_name}/recordings | Get top recordings for user &#39;user_name&#39;. |
| [**topReleaseGroupsForUser**](LbStatsApi.md#topReleaseGroupsForUser) | **GET** /1/stats/user/{user_name}/release-groups | Get top release groups for user &#39;user_name&#39;. |
| [**topReleasesForUser**](LbStatsApi.md#topReleasesForUser) | **GET** /1/stats/user/{user_name}/releases | Get top releases for user &#39;user_name&#39;. |
| [**yearInMusicForUser**](LbStatsApi.md#yearInMusicForUser) | **GET** /1/stats/user/{user_name}/year-in-music/{year} | Get sitewide top recordings. |


<a id="artistMapForUser"></a>
# **artistMapForUser**
> ArtistMapForUser artistMapForUser(userName).range(range).forceRecalculate(forceRecalculate).execute();

Get the artist map for user &#39;user_name&#39;.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbStatsApi apiInstance = new LbStatsApi(defaultClient);
    String userName = "userName_example"; // String | 
    AllowedStatisticsRange range = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | 
    Boolean forceRecalculate = false; // Boolean | Optional, recalculate the data instead of returning the cached result.
    try {
      ArtistMapForUser result = apiInstance.artistMapForUser(userName)
            .range(range)
            .forceRecalculate(forceRecalculate)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbStatsApi#artistMapForUser");
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
| **range** | [**AllowedStatisticsRange**](.md)|  | [optional] [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |
| **forceRecalculate** | **Boolean**| Optional, recalculate the data instead of returning the cached result. | [optional] [default to false] |

### Return type

[**ArtistMapForUser**](ArtistMapForUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **204** | Statistics for the user haven&#39;t been calculated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | User not found. |  -  |

<a id="dailyActivityForUser"></a>
# **dailyActivityForUser**
> DailyActivityForUser dailyActivityForUser(userName).range(range).execute();

Get the daily activity for user &#39;user_name&#39;.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbStatsApi apiInstance = new LbStatsApi(defaultClient);
    String userName = "userName_example"; // String | 
    AllowedStatisticsRange range = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | 
    try {
      DailyActivityForUser result = apiInstance.dailyActivityForUser(userName)
            .range(range)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbStatsApi#dailyActivityForUser");
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
| **range** | [**AllowedStatisticsRange**](.md)|  | [optional] [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |

### Return type

[**DailyActivityForUser**](DailyActivityForUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **204** | Statistics for the user haven&#39;t been calculated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | User not found. |  -  |

<a id="listenersForArtist"></a>
# **listenersForArtist**
> ListenersForArtist listenersForArtist(artistMbid).range(range).execute();

Get top listeners for artist &#39;artist_mbid&#39;.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbStatsApi apiInstance = new LbStatsApi(defaultClient);
    UUID artistMbid = UUID.randomUUID(); // UUID | 
    AllowedStatisticsRange range = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | 
    try {
      ListenersForArtist result = apiInstance.listenersForArtist(artistMbid)
            .range(range)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbStatsApi#listenersForArtist");
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
| **range** | [**AllowedStatisticsRange**](.md)|  | [optional] [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |

### Return type

[**ListenersForArtist**](ListenersForArtist.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **204** | Statistics for the artist haven&#39;t been calculated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Entity not found. |  -  |

<a id="listenersForReleaseGroup"></a>
# **listenersForReleaseGroup**
> ListenersForReleaseGroup listenersForReleaseGroup(releaseGroupMbid).range(range).execute();

Get top listeners for release group &#39;release_group_mbid&#39;.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbStatsApi apiInstance = new LbStatsApi(defaultClient);
    UUID releaseGroupMbid = UUID.randomUUID(); // UUID | 
    AllowedStatisticsRange range = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | 
    try {
      ListenersForReleaseGroup result = apiInstance.listenersForReleaseGroup(releaseGroupMbid)
            .range(range)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbStatsApi#listenersForReleaseGroup");
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
| **releaseGroupMbid** | **UUID**|  | |
| **range** | [**AllowedStatisticsRange**](.md)|  | [optional] [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |

### Return type

[**ListenersForReleaseGroup**](ListenersForReleaseGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **204** | Statistics for the artist haven&#39;t been calculated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Entity not found. |  -  |

<a id="listeningActivityForUser"></a>
# **listeningActivityForUser**
> ListeningActivityForUser listeningActivityForUser(userName).range(range).execute();

Get the listening activity for user &#39;user_name&#39;.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbStatsApi apiInstance = new LbStatsApi(defaultClient);
    String userName = "userName_example"; // String | 
    AllowedStatisticsRange range = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | 
    try {
      ListeningActivityForUser result = apiInstance.listeningActivityForUser(userName)
            .range(range)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbStatsApi#listeningActivityForUser");
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
| **range** | [**AllowedStatisticsRange**](.md)|  | [optional] [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |

### Return type

[**ListeningActivityForUser**](ListeningActivityForUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **204** | Statistics for the user haven&#39;t been calculated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | User not found. |  -  |

<a id="sitewideArtistMap"></a>
# **sitewideArtistMap**
> SitewideArtistMap sitewideArtistMap().range(range).forceRecalculate(forceRecalculate).execute();

Get sitewide top recordings.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbStatsApi apiInstance = new LbStatsApi(defaultClient);
    AllowedStatisticsRange range = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | 
    Boolean forceRecalculate = false; // Boolean | Optional, recalculate the data instead of returning the cached result.
    try {
      SitewideArtistMap result = apiInstance.sitewideArtistMap()
            .range(range)
            .forceRecalculate(forceRecalculate)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbStatsApi#sitewideArtistMap");
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
| **range** | [**AllowedStatisticsRange**](.md)|  | [optional] [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |
| **forceRecalculate** | **Boolean**| Optional, recalculate the data instead of returning the cached result. | [optional] [default to false] |

### Return type

[**SitewideArtistMap**](SitewideArtistMap.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **204** | Statistics haven&#39;t been calculated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |

<a id="sitewideListeningActivity"></a>
# **sitewideListeningActivity**
> SitewideListeningActivity sitewideListeningActivity().range(range).execute();

Get sitewide top recordings.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbStatsApi apiInstance = new LbStatsApi(defaultClient);
    AllowedStatisticsRange range = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | 
    try {
      SitewideListeningActivity result = apiInstance.sitewideListeningActivity()
            .range(range)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbStatsApi#sitewideListeningActivity");
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
| **range** | [**AllowedStatisticsRange**](.md)|  | [optional] [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |

### Return type

[**SitewideListeningActivity**](SitewideListeningActivity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **204** | Statistics haven&#39;t been calculated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |

<a id="sitewideTopArtists"></a>
# **sitewideTopArtists**
> SitewideTopArtists sitewideTopArtists().count(count).offset(offset).range(range).execute();

Get sitewide top artists.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbStatsApi apiInstance = new LbStatsApi(defaultClient);
    Integer count = 25; // Integer | 
    Integer offset = 0; // Integer | 
    AllowedStatisticsRange range = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | 
    try {
      SitewideTopArtists result = apiInstance.sitewideTopArtists()
            .count(count)
            .offset(offset)
            .range(range)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbStatsApi#sitewideTopArtists");
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
| **count** | **Integer**|  | [optional] [default to 25] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **range** | [**AllowedStatisticsRange**](.md)|  | [optional] [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |

### Return type

[**SitewideTopArtists**](SitewideTopArtists.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **204** | Statistics for the artist haven&#39;t been calculated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Entity not found. |  -  |

<a id="sitewideTopRecordings"></a>
# **sitewideTopRecordings**
> SitewideTopRecordings sitewideTopRecordings().count(count).offset(offset).range(range).execute();

Get sitewide top recordings.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbStatsApi apiInstance = new LbStatsApi(defaultClient);
    Integer count = 25; // Integer | 
    Integer offset = 0; // Integer | 
    AllowedStatisticsRange range = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | 
    try {
      SitewideTopRecordings result = apiInstance.sitewideTopRecordings()
            .count(count)
            .offset(offset)
            .range(range)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbStatsApi#sitewideTopRecordings");
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
| **count** | **Integer**|  | [optional] [default to 25] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **range** | [**AllowedStatisticsRange**](.md)|  | [optional] [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |

### Return type

[**SitewideTopRecordings**](SitewideTopRecordings.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **204** | Statistics haven&#39;t been calculated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |

<a id="sitewideTopReleaseGroups"></a>
# **sitewideTopReleaseGroups**
> SitewideTopReleaseGroups sitewideTopReleaseGroups().count(count).offset(offset).range(range).execute();

Get sitewide top release groups.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbStatsApi apiInstance = new LbStatsApi(defaultClient);
    Integer count = 25; // Integer | 
    Integer offset = 0; // Integer | 
    AllowedStatisticsRange range = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | 
    try {
      SitewideTopReleaseGroups result = apiInstance.sitewideTopReleaseGroups()
            .count(count)
            .offset(offset)
            .range(range)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbStatsApi#sitewideTopReleaseGroups");
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
| **count** | **Integer**|  | [optional] [default to 25] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **range** | [**AllowedStatisticsRange**](.md)|  | [optional] [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |

### Return type

[**SitewideTopReleaseGroups**](SitewideTopReleaseGroups.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **204** | Statistics haven&#39;t been calculated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |

<a id="sitewideTopReleases"></a>
# **sitewideTopReleases**
> SitewideTopReleases sitewideTopReleases().count(count).offset(offset).range(range).execute();

Get sitewide top releases.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbStatsApi apiInstance = new LbStatsApi(defaultClient);
    Integer count = 25; // Integer | 
    Integer offset = 0; // Integer | 
    AllowedStatisticsRange range = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | 
    try {
      SitewideTopReleases result = apiInstance.sitewideTopReleases()
            .count(count)
            .offset(offset)
            .range(range)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbStatsApi#sitewideTopReleases");
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
| **count** | **Integer**|  | [optional] [default to 25] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **range** | [**AllowedStatisticsRange**](.md)|  | [optional] [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |

### Return type

[**SitewideTopReleases**](SitewideTopReleases.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **204** | Statistics for the artist haven&#39;t been calculated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | Entity not found. |  -  |

<a id="topArtistsForUser"></a>
# **topArtistsForUser**
> TopArtistsForUser topArtistsForUser(userName).count(count).offset(offset).range(range).execute();

Get top artists for user &#39;user_name&#39;.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbStatsApi apiInstance = new LbStatsApi(defaultClient);
    String userName = "userName_example"; // String | 
    Integer count = 25; // Integer | 
    Integer offset = 0; // Integer | 
    AllowedStatisticsRange range = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | 
    try {
      TopArtistsForUser result = apiInstance.topArtistsForUser(userName)
            .count(count)
            .offset(offset)
            .range(range)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbStatsApi#topArtistsForUser");
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
| **range** | [**AllowedStatisticsRange**](.md)|  | [optional] [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |

### Return type

[**TopArtistsForUser**](TopArtistsForUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **204** | Statistics for the user haven&#39;t been calculated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | User not found. |  -  |

<a id="topRecordingsForUser"></a>
# **topRecordingsForUser**
> TopRecordingsForUser topRecordingsForUser(userName).count(count).offset(offset).range(range).execute();

Get top recordings for user &#39;user_name&#39;.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbStatsApi apiInstance = new LbStatsApi(defaultClient);
    String userName = "userName_example"; // String | 
    Integer count = 25; // Integer | 
    Integer offset = 0; // Integer | 
    AllowedStatisticsRange range = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | 
    try {
      TopRecordingsForUser result = apiInstance.topRecordingsForUser(userName)
            .count(count)
            .offset(offset)
            .range(range)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbStatsApi#topRecordingsForUser");
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
| **range** | [**AllowedStatisticsRange**](.md)|  | [optional] [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |

### Return type

[**TopRecordingsForUser**](TopRecordingsForUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **204** | Statistics for the user haven&#39;t been calculated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | User not found. |  -  |

<a id="topReleaseGroupsForUser"></a>
# **topReleaseGroupsForUser**
> TopReleaseGroupsForUser topReleaseGroupsForUser(userName).count(count).offset(offset).range(range).execute();

Get top release groups for user &#39;user_name&#39;.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbStatsApi apiInstance = new LbStatsApi(defaultClient);
    String userName = "userName_example"; // String | 
    Integer count = 25; // Integer | 
    Integer offset = 0; // Integer | 
    AllowedStatisticsRange range = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | 
    try {
      TopReleaseGroupsForUser result = apiInstance.topReleaseGroupsForUser(userName)
            .count(count)
            .offset(offset)
            .range(range)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbStatsApi#topReleaseGroupsForUser");
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
| **range** | [**AllowedStatisticsRange**](.md)|  | [optional] [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |

### Return type

[**TopReleaseGroupsForUser**](TopReleaseGroupsForUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **204** | Statistics for the user haven&#39;t been calculated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | User not found |  -  |

<a id="topReleasesForUser"></a>
# **topReleasesForUser**
> TopReleasesForUser topReleasesForUser(userName).count(count).offset(offset).range(range).execute();

Get top releases for user &#39;user_name&#39;.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbStatsApi apiInstance = new LbStatsApi(defaultClient);
    String userName = "userName_example"; // String | 
    Integer count = 25; // Integer | 
    Integer offset = 0; // Integer | 
    AllowedStatisticsRange range = AllowedStatisticsRange.fromValue("all_time"); // AllowedStatisticsRange | 
    try {
      TopReleasesForUser result = apiInstance.topReleasesForUser(userName)
            .count(count)
            .offset(offset)
            .range(range)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbStatsApi#topReleasesForUser");
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
| **range** | [**AllowedStatisticsRange**](.md)|  | [optional] [enum: all_time, month, week, year, quarter, half_yearly, this_week, this_month, this_year] |

### Return type

[**TopReleasesForUser**](TopReleasesForUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful query, you have data! |  -  |
| **204** | Statistics for the user haven&#39;t been calculated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |
| **404** | User not found. |  -  |

<a id="yearInMusicForUser"></a>
# **yearInMusicForUser**
> YearInMusicForUser yearInMusicForUser(userName, year).execute();

Get sitewide top recordings.

### Example
```java
// Import classes:
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.models.*;
import org.hihn.listenbrainz.LbStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.listenbrainz.org");

    LbStatsApi apiInstance = new LbStatsApi(defaultClient);
    String userName = "userName_example"; // String | 
    Integer year = 56; // Integer | 
    try {
      YearInMusicForUser result = apiInstance.yearInMusicForUser(userName, year)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LbStatsApi#yearInMusicForUser");
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
| **year** | **Integer**|  | |

### Return type

[**YearInMusicForUser**](YearInMusicForUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful query, you have data! |  -  |
| **204** | Statistics haven&#39;t been calculated, empty response will be returned. |  -  |
| **400** | Bad request. |  -  |

