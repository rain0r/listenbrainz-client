/*
 * ListenBrainz Swagger - OpenAPI 3.0
 * OpenAPI client defintion.
 *
 * The version of the OpenAPI document: v-2024-07-17.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.hihn.listenbrainz;

import org.hihn.listenbrainz.ApiCallback;
import org.hihn.listenbrainz.ApiClient;
import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.ApiResponse;
import org.hihn.listenbrainz.Configuration;
import org.hihn.listenbrainz.Pair;
import org.hihn.listenbrainz.ProgressRequestBody;
import org.hihn.listenbrainz.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.hihn.listenbrainz.Color;
import org.hihn.listenbrainz.FreshReleases;
import org.hihn.listenbrainz.GetDumpInfo;
import org.hihn.listenbrainz.LbRadio;
import org.hihn.listenbrainz.Mode;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LbMiscApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LbMiscApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LbMiscApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call colorCall(String color, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/explore/color/{color}"
            .replace("{" + "color" + "}", localVarApiClient.escapeString(color.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call colorValidateBeforeCall(String color, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'color' is set
        if (color == null) {
            throw new ApiException("Missing the required parameter 'color' when calling color(Async)");
        }

        return colorCall(color, _callback);

    }


    private ApiResponse<Color> colorWithHttpInfo(String color) throws ApiException {
        okhttp3.Call localVarCall = colorValidateBeforeCall(color, null);
        Type localVarReturnType = new TypeToken<Color>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call colorAsync(String color, final ApiCallback<Color> _callback) throws ApiException {

        okhttp3.Call localVarCall = colorValidateBeforeCall(color, _callback);
        Type localVarReturnType = new TypeToken<Color>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIcolorRequest {
        private final String color;

        private APIcolorRequest(String color) {
            this.color = color;
        }

        /**
         * Build call for color
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return colorCall(color, _callback);
        }

        /**
         * Execute color request
         * @return Color
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
         </table>
         */
        public Color execute() throws ApiException {
            ApiResponse<Color> localVarResp = colorWithHttpInfo(color);
            return localVarResp.getData();
        }

        /**
         * Execute color request with HTTP info returned
         * @return ApiResponse&lt;Color&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Color> executeWithHttpInfo() throws ApiException {
            return colorWithHttpInfo(color);
        }

        /**
         * Execute color request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Color> _callback) throws ApiException {
            return colorAsync(color, _callback);
        }
    }

    /**
     * Fetch a list of releases that have cover art that has a predominant color that is close to the given color.
     * 
     * @param color Color must be a 6 digit hex color code. (required)
     * @return APIcolorRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
     </table>
     */
    public APIcolorRequest color(String color) {
        return new APIcolorRequest(color);
    }
    private okhttp3.Call freshReleasesCall(String releaseDate, Integer days, String sort, Boolean past, Boolean future, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/explore/fresh-releases/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (releaseDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("release_date", releaseDate));
        }

        if (days != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("days", days));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (past != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("past", past));
        }

        if (future != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("future", future));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call freshReleasesValidateBeforeCall(String releaseDate, Integer days, String sort, Boolean past, Boolean future, final ApiCallback _callback) throws ApiException {
        return freshReleasesCall(releaseDate, days, sort, past, future, _callback);

    }


    private ApiResponse<FreshReleases> freshReleasesWithHttpInfo(String releaseDate, Integer days, String sort, Boolean past, Boolean future) throws ApiException {
        okhttp3.Call localVarCall = freshReleasesValidateBeforeCall(releaseDate, days, sort, past, future, null);
        Type localVarReturnType = new TypeToken<FreshReleases>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call freshReleasesAsync(String releaseDate, Integer days, String sort, Boolean past, Boolean future, final ApiCallback<FreshReleases> _callback) throws ApiException {

        okhttp3.Call localVarCall = freshReleasesValidateBeforeCall(releaseDate, days, sort, past, future, _callback);
        Type localVarReturnType = new TypeToken<FreshReleases>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIfreshReleasesRequest {
        private String releaseDate;
        private Integer days;
        private String sort;
        private Boolean past;
        private Boolean future;

        private APIfreshReleasesRequest() {
        }

        /**
         * Set releaseDate
         * @param releaseDate Fresh releases will be shown around this pivot date. Must be in YYYY-MM-DD format. (optional)
         * @return APIfreshReleasesRequest
         */
        public APIfreshReleasesRequest releaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        /**
         * Set days
         * @param days The number of days of fresh releases to show. Max 90 days. (optional)
         * @return APIfreshReleasesRequest
         */
        public APIfreshReleasesRequest days(Integer days) {
            this.days = days;
            return this;
        }

        /**
         * Set sort
         * @param sort The sort order of the results. (optional, default to release_name)
         * @return APIfreshReleasesRequest
         */
        public APIfreshReleasesRequest sort(String sort) {
            this.sort = sort;
            return this;
        }

        /**
         * Set past
         * @param past Whether to show releases in the past. (optional, default to true)
         * @return APIfreshReleasesRequest
         */
        public APIfreshReleasesRequest past(Boolean past) {
            this.past = past;
            return this;
        }

        /**
         * Set future
         * @param future Whether to show releases in the future. (optional, default to true)
         * @return APIfreshReleasesRequest
         */
        public APIfreshReleasesRequest future(Boolean future) {
            this.future = future;
            return this;
        }

        /**
         * Build call for freshReleases
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Yay, you have data! </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Invalid date or number of days passed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return freshReleasesCall(releaseDate, days, sort, past, future, _callback);
        }

        /**
         * Execute freshReleases request
         * @return FreshReleases
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Yay, you have data! </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Invalid date or number of days passed. </td><td>  -  </td></tr>
         </table>
         */
        public FreshReleases execute() throws ApiException {
            ApiResponse<FreshReleases> localVarResp = freshReleasesWithHttpInfo(releaseDate, days, sort, past, future);
            return localVarResp.getData();
        }

        /**
         * Execute freshReleases request with HTTP info returned
         * @return ApiResponse&lt;FreshReleases&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Yay, you have data! </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Invalid date or number of days passed. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<FreshReleases> executeWithHttpInfo() throws ApiException {
            return freshReleasesWithHttpInfo(releaseDate, days, sort, past, future);
        }

        /**
         * Execute freshReleases request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Yay, you have data! </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Invalid date or number of days passed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<FreshReleases> _callback) throws ApiException {
            return freshReleasesAsync(releaseDate, days, sort, past, future, _callback);
        }
    }

    /**
     * This endpoint fetches upcoming and recently released (fresh) releases.
     * 
     * @return APIfreshReleasesRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Yay, you have data! </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid date or number of days passed. </td><td>  -  </td></tr>
     </table>
     */
    public APIfreshReleasesRequest freshReleases() {
        return new APIfreshReleasesRequest();
    }
    private okhttp3.Call getDumpInfoCall(Integer id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/status/get-dump-info";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (id != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id", id));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDumpInfoValidateBeforeCall(Integer id, final ApiCallback _callback) throws ApiException {
        return getDumpInfoCall(id, _callback);

    }


    private ApiResponse<GetDumpInfo> getDumpInfoWithHttpInfo(Integer id) throws ApiException {
        okhttp3.Call localVarCall = getDumpInfoValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<GetDumpInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDumpInfoAsync(Integer id, final ApiCallback<GetDumpInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDumpInfoValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<GetDumpInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetDumpInfoRequest {
        private Integer id;

        private APIgetDumpInfoRequest() {
        }

        /**
         * Set id
         * @param id Integer specifying the ID of the dump, if not provided, the endpoint returns information about the latest data dump. (optional)
         * @return APIgetDumpInfoRequest
         */
        public APIgetDumpInfoRequest id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Build call for getDumpInfo
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> You did not provide a valid dump ID. See error message for details. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Dump with given ID does not exist. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getDumpInfoCall(id, _callback);
        }

        /**
         * Execute getDumpInfo request
         * @return GetDumpInfo
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> You did not provide a valid dump ID. See error message for details. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Dump with given ID does not exist. </td><td>  -  </td></tr>
         </table>
         */
        public GetDumpInfo execute() throws ApiException {
            ApiResponse<GetDumpInfo> localVarResp = getDumpInfoWithHttpInfo(id);
            return localVarResp.getData();
        }

        /**
         * Execute getDumpInfo request with HTTP info returned
         * @return ApiResponse&lt;GetDumpInfo&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> You did not provide a valid dump ID. See error message for details. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Dump with given ID does not exist. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GetDumpInfo> executeWithHttpInfo() throws ApiException {
            return getDumpInfoWithHttpInfo(id);
        }

        /**
         * Execute getDumpInfo request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> You did not provide a valid dump ID. See error message for details. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Dump with given ID does not exist. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<GetDumpInfo> _callback) throws ApiException {
            return getDumpInfoAsync(id, _callback);
        }
    }

    /**
     * Get information about ListenBrainz data dumps. You need to pass the id parameter in a GET request to get data about that particular dump.
     * 
     * @return APIgetDumpInfoRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> You did not provide a valid dump ID. See error message for details. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Dump with given ID does not exist. </td><td>  -  </td></tr>
     </table>
     */
    public APIgetDumpInfoRequest getDumpInfo() {
        return new APIgetDumpInfoRequest();
    }
    private okhttp3.Call lbRadioCall(String prompt, Mode mode, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/1/explore/lb-radio";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (prompt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("prompt", prompt));
        }

        if (mode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("mode", mode));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call lbRadioValidateBeforeCall(String prompt, Mode mode, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'prompt' is set
        if (prompt == null) {
            throw new ApiException("Missing the required parameter 'prompt' when calling lbRadio(Async)");
        }

        // verify the required parameter 'mode' is set
        if (mode == null) {
            throw new ApiException("Missing the required parameter 'mode' when calling lbRadio(Async)");
        }

        return lbRadioCall(prompt, mode, _callback);

    }


    private ApiResponse<LbRadio> lbRadioWithHttpInfo(String prompt, Mode mode) throws ApiException {
        okhttp3.Call localVarCall = lbRadioValidateBeforeCall(prompt, mode, null);
        Type localVarReturnType = new TypeToken<LbRadio>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call lbRadioAsync(String prompt, Mode mode, final ApiCallback<LbRadio> _callback) throws ApiException {

        okhttp3.Call localVarCall = lbRadioValidateBeforeCall(prompt, mode, _callback);
        Type localVarReturnType = new TypeToken<LbRadio>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlbRadioRequest {
        private final String prompt;
        private final Mode mode;

        private APIlbRadioRequest(String prompt, Mode mode) {
            this.prompt = prompt;
            this.mode = mode;
        }

        /**
         * Build call for lbRadio
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return lbRadioCall(prompt, mode, _callback);
        }

        /**
         * Execute lbRadio request
         * @return LbRadio
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
         </table>
         */
        public LbRadio execute() throws ApiException {
            ApiResponse<LbRadio> localVarResp = lbRadioWithHttpInfo(prompt, mode);
            return localVarResp.getData();
        }

        /**
         * Execute lbRadio request with HTTP info returned
         * @return ApiResponse&lt;LbRadio&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<LbRadio> executeWithHttpInfo() throws ApiException {
            return lbRadioWithHttpInfo(prompt, mode);
        }

        /**
         * Execute lbRadio request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<LbRadio> _callback) throws ApiException {
            return lbRadioAsync(prompt, mode, _callback);
        }
    }

    /**
     * Generate a playlist with LB Radio.
     * 
     * @param prompt The LB Radio prompt from which to generate playlists. (required)
     * @param mode The mode that LB radio should use. Must be easy, medium or hard. (required)
     * @return APIlbRadioRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
     </table>
     */
    public APIlbRadioRequest lbRadio(String prompt, Mode mode) {
        return new APIlbRadioRequest(prompt, mode);
    }
}