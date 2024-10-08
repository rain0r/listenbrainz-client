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

import org.hihn.listenbrainz.ApiException;
import org.hihn.listenbrainz.CreateNotificationRequest;
import org.hihn.listenbrainz.CreateReviewRequest;
import org.hihn.listenbrainz.FeedEvents;
import org.hihn.listenbrainz.FeedEventsDeleteRequest;
import org.hihn.listenbrainz.FeedEventsListensSimilar;
import org.hihn.listenbrainz.Followers;
import org.hihn.listenbrainz.Following;
import org.hihn.listenbrainz.RecommendPersonalRecordingRequest;
import org.hihn.listenbrainz.RecommendRecordingRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LbSocialApi
 */
@Disabled
public class LbSocialApiTest {

    private final LbSocialApi api = new LbSocialApi();

    /**
     * Post a message with a link on a user&#39;s timeline. Only approved users are allowed to perform this action.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNotificationTest() throws ApiException {
        String userName = null;
        CreateNotificationRequest createNotificationRequest = null;
        api.createNotification(userName, createNotificationRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Creates a CritiqueBrainz review event for the user. This also creates a corresponding review in CritiqueBrainz. Users need to have linked their ListenBrainz account with CritiqueBrainz first to use this endpoint successfully.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createReviewTest() throws ApiException {
        String userName = null;
        CreateReviewRequest createReviewRequest = null;
        api.createReview(userName, createReviewRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * CreatGet feed events for a user&#39;s timeline.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void feedEventsTest() throws ApiException {
        String userName = null;
        Integer maxTs = null;
        Integer minTs = null;
        Integer count = null;
        FeedEvents response = api.feedEvents(userName)
                .maxTs(maxTs)
                .minTs(minTs)
                .count(count)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete those events from user&#39;s feed that belong to them. Supports deletion of recommendation and notification. Along with the authorization token, post the event type and event id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void feedEventsDeleteTest() throws ApiException {
        String userName = null;
        FeedEventsDeleteRequest feedEventsDeleteRequest = null;
        api.feedEventsDelete(userName, feedEventsDeleteRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Hide events from the user feed, only recording_recommendation and recording_pin events that have been generated by the people one is following can be deleted via this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void feedEventsHideTest() throws ApiException {
        String userName = null;
        FeedEventsDeleteRequest feedEventsDeleteRequest = null;
        api.feedEventsHide(userName, feedEventsDeleteRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Get feed&#39;s listen events for followed users.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void feedEventsListensFollowingTest() throws ApiException {
        String userName = null;
        Integer maxTs = null;
        Integer minTs = null;
        Integer count = null;
        FeedEvents response = api.feedEventsListensFollowing(userName)
                .maxTs(maxTs)
                .minTs(minTs)
                .count(count)
                .execute();
        // TODO: test validations
    }

    /**
     * Get feed&#39;s listen events for similar users.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void feedEventsListensSimilarTest() throws ApiException {
        String userName = null;
        Integer maxTs = null;
        Integer minTs = null;
        Integer count = null;
        FeedEventsListensSimilar response = api.feedEventsListensSimilar(userName)
                .maxTs(maxTs)
                .minTs(minTs)
                .count(count)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete hidden events from the user feed, aka unhide events.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void feedEventsUnhideTest() throws ApiException {
        String userName = null;
        FeedEventsDeleteRequest feedEventsDeleteRequest = null;
        api.feedEventsUnhide(userName, feedEventsDeleteRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Follow the user &#39;user_name&#39;. A user token (found on https://listenbrainz.org/settings/ ) must be provided in the Authorization header!
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void followTest() throws ApiException {
        String userName = null;
        api.follow(userName)
                .execute();
        // TODO: test validations
    }

    /**
     * Fetch the list of followers of the user &#39;user_name&#39;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void followersTest() throws ApiException {
        String userName = null;
        Followers response = api.followers(userName)
                .execute();
        // TODO: test validations
    }

    /**
     * Fetch the list of users followed by the user &#39;user_name&#39;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void followingTest() throws ApiException {
        String userName = null;
        Following response = api.following(userName)
                .execute();
        // TODO: test validations
    }

    /**
     * Make the user recommend a recording to their followers. The request should post the following data about the recording being recommended (either one of recording_msid or recording_mbid is sufficient), and also the list of followers getting recommended.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recommendPersonalRecordingTest() throws ApiException {
        String userName = null;
        RecommendPersonalRecordingRequest recommendPersonalRecordingRequest = null;
        api.recommendPersonalRecording(userName, recommendPersonalRecordingRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Make the user recommend a recording to their followers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recommendRecordingTest() throws ApiException {
        String userName = null;
        RecommendRecordingRequest recommendRecordingRequest = null;
        api.recommendRecording(userName, recommendRecordingRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Unfollow the user &#39;user_name&#39;. A user token (found on https://listenbrainz.org/settings/ ) must be provided in the Authorization header!
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unfollowTest() throws ApiException {
        String userName = null;
        api.unfollow(userName)
                .execute();
        // TODO: test validations
    }

}
