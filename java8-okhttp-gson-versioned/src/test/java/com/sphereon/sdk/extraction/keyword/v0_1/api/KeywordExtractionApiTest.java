/*
 * Keyword Extraction
 * The Keyword Extraction API allows you to extract keywords from text. Keywords can be extracted from text, file or stream location. With each extracted keyword a weight will be given.    The flow is generally as follows:  1. Create an extraction job. If no settings are provided, default settings are used.  2. Upload content for extraction.  3. Start the extraction job.  3. Get the result when the extraction is completed.    Full API Documentation: https://docs.sphereon.com/api/extraction/keyword/0.0/html  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 0.0
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.extraction.keyword.v0_1.api;

import com.sphereon.sdk.extraction.keyword.v0_1.handler.ApiException;
import com.sphereon.sdk.extraction.keyword.v0_1.model.ErrorResponse;
import com.sphereon.sdk.extraction.keyword.v0_1.model.Job;
import com.sphereon.sdk.extraction.keyword.v0_1.model.JobSettings;
import com.sphereon.sdk.extraction.keyword.v0_1.model.KeywordExtractionResponse;
import com.sphereon.sdk.extraction.keyword.v0_1.model.TextInput;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KeywordExtractionApi
 */
@Ignore
public class KeywordExtractionApiTest {

    private final KeywordExtractionApi api = new KeywordExtractionApi();

    
    /**
     * Upload text
     *
     * Upload text for keyword extraction. Keyword extraction will start after submitting the job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addInputTextTest() throws ApiException {
        String jobid = null;
        TextInput textInput = null;
        Job response = api.addInputText(jobid, textInput);

        // TODO: test validations
    }
    
    /**
     * Create a keyword extraction job
     *
     * Create a keyword extraction job with settings. For optional settings defaults will be used
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createJobTest() throws ApiException {
        JobSettings jobSettings = null;
        Job response = api.createJob(jobSettings);

        // TODO: test validations
    }
    
    /**
     * Delete a job manually
     *
     * Delete the job and all related files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJobTest() throws ApiException {
        String jobid = null;
        Job response = api.deleteJob(jobid);

        // TODO: test validations
    }
    
    /**
     * Job definition and state
     *
     * Get the keyword extraction job definition and current state. Please note that you can differentiate based on http response status.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTest() throws ApiException {
        String jobid = null;
        Job response = api.getJob(jobid);

        // TODO: test validations
    }
    
    /**
     * Get the extraction results
     *
     * Get the keywords that are extracted from the text. The keyword extraction response contains a list of keywords for each text. For each keyword the weight is given with other text statistics.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getResultTest() throws ApiException {
        String jobid = null;
        KeywordExtractionResponse response = api.getResult(jobid);

        // TODO: test validations
    }
    
    /**
     * Submit keyword extraction job for processing
     *
     * Start keyword extraction. The extraction is done on the previously texts. The settings supplied with the job in the request body are used for the keyword extraction. You can only submit the job after a new Job is created with status INPUTS_UPLOADED or resubmit an existing Job with status ERROR. In all cases the job Id in the path must match the jobId in the request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitJobTest() throws ApiException {
        String jobid = null;
        JobSettings settings = null;
        Job response = api.submitJob(jobid, settings);

        // TODO: test validations
    }
    
}
