/*
 * Keyword Extraction
 * The Keyword Extraction API allows you to extract keyword from text. Keyword can be extracted from text, file or stream location. With each extracted keyword a weight will be given.    The flow is generally as follows:  1. Create an extraction job. If no settings are provided, default settings are used.  2. Upload content for extraction.  3. Start the extraction job.  3. Get the result when the extraction is completed.    Full API Documentation: https://docs.sphereon.com/api/extraction/keyword/0.0/html  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 0.0
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.extraction.keyword.api;

import com.sphereon.sdk.extraction.keyword.handler.ApiException;
import com.sphereon.sdk.extraction.keyword.model.Job;
import com.sphereon.sdk.extraction.keyword.model.JobSettings;
import com.sphereon.sdk.extraction.keyword.model.Keyword;
import com.sphereon.sdk.extraction.keyword.model.KeywordExtractionResponse;
import com.sphereon.sdk.extraction.keyword.model.TextInput;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;
import java.util.Map;

/**
 * API tests for KeywordExtractionApi
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KeywordExtractionApiTest {

    private final KeywordExtractionApi api = new KeywordExtractionApi();

    private static String jobid;


    /**
     * Create a keyword extraction job
     *
     * Create a keyword extraction job with settings. For optional settings defaults will be used
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void _01_createJobTest() throws ApiException {
        JobSettings jobSettings = new JobSettings();
        jobSettings.setEngine(JobSettings.EngineEnum.BASIC);
        jobSettings.setTfidfScheme(JobSettings.TfidfSchemeEnum.TF_IDF);
        jobSettings.setMaxKeywords(10);

        Job response = api.createJob(jobSettings);

        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getJobId());
        Assert.assertEquals(Job.StateEnum.INPUTS_UPLOADED, response.getState());

        jobid = response.getJobId();
    }

    /**
     * Upload text
     *
     * Upload text for keyword extraction. Keyword extraction will start after submitting the job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void _02_addInputTextTest() throws ApiException {
        String text = "Gratis af te halen in Assen: een monumentaal kunstwerk. Er is één maar: het kunstwerk is 15 meter hoog.\n" +
                "Het gaat om een kunstwerk dat vanaf 1989 voor het station in Assen stond en door de Haarlemse kunstenaar Jan Jacobs Mulder is gemaakt. Het werk heet Aarde, Water, Huis en bestaat uit drie delen: een stalen sokkel met daarboven twee stalen frames.\n" +
                "Het kunstwerk is van de gemeente. Die verwijderde het in 2013 omdat het stationsgebied wordt heringericht, schrijft RTV Drenthe. De werkgroep Monumentale Kunst van erfgoedvereniging Heemschut kwam erachter dat het sindsdien - zo omschrijft Norman Vervat van de werkgroep - \"op een werf lag weg te roesten.\"\n" +
                "Plein, rotonde of verzamelaar\n" +
                "Assen gaat het niet terugplaatsen en vroeg de werkgroep te helpen bij het zoeken naar een ander \"tehuis\". Vervat: \"We denken aan een plein, park of rotonde. Of aan een verzamelaar met een grote tuin.\"\n" +
                "Hij heeft al enkele mailtjes van belangstellenden binnen. De nieuwe eigenaar moet wel over geld beschikken: het werk moet worden opgeknapt en moet bij herplaatsing een fundering krijgen (kosten: 15.000 euro). Het tienjaarlijkse onderhoud kost ook enkele duizenden euro's.";

        TextInput textInput = new TextInput();
        textInput.setText(text);
        Job response = api.addInputText(jobid, textInput);

        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getInputs());
        Assert.assertEquals(1, response.getInputs().size());
        Assert.assertEquals(text, response.getInputs().get(0).getTextInput().getText());
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
    public void _03_submitJobTest() throws ApiException {
        JobSettings settings = new JobSettings();
        settings.setEngine(JobSettings.EngineEnum.BASIC);
        settings.setTfidfScheme(JobSettings.TfidfSchemeEnum.TF_IDF);
        settings.setMaxKeywords(10);

        Job response = api.submitJob(jobid, settings);

        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getInputs());
        Assert.assertNotNull(response.getJobSettings());
        Assert.assertEquals(Job.StateEnum.PROCESSING, response.getState());
        Assert.assertEquals(1, response.getInputs().size());
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
    public void _04_getJobTest() throws ApiException, InterruptedException {
        // poll job state change
        int sleepTime = 1000;
        int maxCount = 180; // wait at most 3 min for api to complete
        int count = 0;

        while (count < maxCount) {
            Thread.sleep(sleepTime);

            count++;
            Job response = api.getJob(jobid);
            Assert.assertNotNull(response);

            if (response.getState().equals(Job.StateEnum.DONE)) {
                Assert.assertNotNull(response.getCreationTime());
                Assert.assertNotNull(response.getUpdateTime());
                Assert.assertNotNull(response.getQueueTime());
                Assert.assertNotNull(response.getCompletionTime());

                break;
            }
        }
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
    public void _05_getResultTest() throws ApiException {
        KeywordExtractionResponse response = api.getResult(jobid);

        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getJob());
        Assert.assertNotNull(response.getKeywords());
        Assert.assertEquals(1, response.getKeywords().size());

        for (Map.Entry<String, List<Keyword>> entry : response.getKeywords().entrySet()) {
            Assert.assertEquals(10, entry.getValue().size());
        }
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
    public void _06_deleteJobTest() throws ApiException {
        Job response = api.deleteJob(jobid);

        Assert.assertNotNull(response);
        Assert.assertEquals(Job.StateEnum.DELETED, response.getState());
    }

}
