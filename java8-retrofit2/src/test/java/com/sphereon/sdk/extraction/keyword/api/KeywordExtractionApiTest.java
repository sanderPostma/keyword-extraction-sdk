package com.sphereon.sdk.extraction.keyword.api;

import com.sphereon.sdk.extraction.keyword.handler.ApiClient;
import com.sphereon.sdk.extraction.keyword.model.ErrorResponse;
import com.sphereon.sdk.extraction.keyword.model.Job;
import com.sphereon.sdk.extraction.keyword.model.JobSettings;
import com.sphereon.sdk.extraction.keyword.model.KeywordExtractionResponse;
import com.sphereon.sdk.extraction.keyword.model.TextInput;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KeywordExtractionApi
 */
public class KeywordExtractionApiTest {

    private KeywordExtractionApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(KeywordExtractionApi.class);
    }

    
    /**
     * Upload text
     *
     * Upload text for keyword extraction. Keyword extraction will start after submitting the job.
     */
    @Test
    public void addInputTextTest() {
        String jobid = null;
        TextInput textInput = null;
        // Job response = api.addInputText(jobid, textInput);

        // TODO: test validations
    }
    
    /**
     * Create a keyword extraction job
     *
     * Create a keyword extraction job with settings. For optional settings defaults will be used
     */
    @Test
    public void createJobTest() {
        JobSettings jobSettings = null;
        // Job response = api.createJob(jobSettings);

        // TODO: test validations
    }
    
    /**
     * Delete a job manually
     *
     * Delete the job and all related files.
     */
    @Test
    public void deleteJobTest() {
        String jobid = null;
        // Job response = api.deleteJob(jobid);

        // TODO: test validations
    }
    
    /**
     * Job definition and state
     *
     * Get the keyword extraction job definition and current state. Please note that you can differentiate based on http response status.
     */
    @Test
    public void getJobTest() {
        String jobid = null;
        // Job response = api.getJob(jobid);

        // TODO: test validations
    }
    
    /**
     * Get the extraction results
     *
     * Get the keywords that are extracted from the text. The keyword extraction response contains a list of keywords for each text. For each keyword the weight is given with other text statistics.
     */
    @Test
    public void getResultTest() {
        String jobid = null;
        // KeywordExtractionResponse response = api.getResult(jobid);

        // TODO: test validations
    }
    
    /**
     * Submit keyword extraction job for processing
     *
     * Start keyword extraction. The extraction is done on the previously texts. The settings supplied with the job in the request body are used for the keyword extraction. You can only submit the job after a new Job is created with status INPUTS_UPLOADED or resubmit an existing Job with status ERROR. In all cases the job Id in the path must match the jobId in the request.
     */
    @Test
    public void submitJobTest() {
        String jobid = null;
        JobSettings settings = null;
        // Job response = api.submitJob(jobid, settings);

        // TODO: test validations
    }
    
}
