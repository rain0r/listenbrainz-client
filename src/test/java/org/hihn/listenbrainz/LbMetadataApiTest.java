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
import org.hihn.listenbrainz.ArtistMetadata;
import org.hihn.listenbrainz.GetManualMapping;
import org.hihn.listenbrainz.Lookup;
import org.hihn.listenbrainz.RecordingMetadata;
import org.hihn.listenbrainz.ReleaseGroupMetadata;
import org.hihn.listenbrainz.SubmitManualMapping;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LbMetadataApi
 */
@Disabled
public class LbMetadataApiTest {

    private final LbMetadataApi api = new LbMetadataApi();

    /**
     * This endpoint takes in a list of artist_mbids and returns an array of dicts that contain recording metadata suitable for showing in a context that requires as much detail about a recording and the artist. Using the inc parameter, you can control which portions of metadata to fetch.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void artistMetadataTest() throws ApiException {
        List<UUID> artistMbids = null;
        String inc = null;
        List<ArtistMetadata> response = api.artistMetadata(artistMbids, inc)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the manual mapping of a recording messybrainz ID that a user added.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getManualMappingTest() throws ApiException {
        UUID recordingMsid = null;
        GetManualMapping response = api.getManualMapping(recordingMsid)
                .execute();
        // TODO: test validations
    }

    /**
     * This endpoint looks up mbid metadata for the given artist, recording and optionally a release name. The total number of characters in the artist name, recording name and release name query arguments should be less than or equal to MAX_MAPPING_QUERY_LENGTH.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lookupTest() throws ApiException {
        String artistName = null;
        String recordingName = null;
        Boolean metadata = null;
        String inc = null;
        String releaseName = null;
        Lookup response = api.lookup(artistName, recordingName, metadata, inc)
                .releaseName(releaseName)
                .execute();
        // TODO: test validations
    }

    /**
     * This endpoint takes in a list of recording_mbids and returns an array of dicts that contain recording metadata suitable for showing in a context that requires as much detail about a recording and the artist. Using the inc parameter, you can control which portions of metadata to fetch.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recordingMetadataTest() throws ApiException {
        List<UUID> recordingMbids = null;
        String inc = null;
        Map<String, RecordingMetadata> response = api.recordingMetadata(recordingMbids, inc)
                .execute();
        // TODO: test validations
    }

    /**
     * This endpoint takes in a list of release_group_mbids and returns an array of dicts that contain release_group metadata suitable for showing in a context that requires as much detail about a release_group and the artist. Using the inc parameter, you can control which portions of metadata to fetch.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void releaseGroupMetadataTest() throws ApiException {
        List<UUID> releaseGroupMbids = null;
        String inc = null;
        Map<String, ReleaseGroupMetadata> response = api.releaseGroupMetadata(releaseGroupMbids, inc)
                .execute();
        // TODO: test validations
    }

    /**
     * Submit a manual mapping of a recording messybrainz ID to a musicbrainz recording id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitManualMappingTest() throws ApiException {
        SubmitManualMapping submitManualMapping = null;
        api.submitManualMapping(submitManualMapping)
                .execute();
        // TODO: test validations
    }

}
