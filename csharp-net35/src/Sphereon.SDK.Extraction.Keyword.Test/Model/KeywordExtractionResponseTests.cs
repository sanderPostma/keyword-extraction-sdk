/* 
 * Keyword Extraction
 *
 * The Keyword Extraction API allows you to extract keywords from text. Keywords can be extracted from text, file or stream location. With each extracted keyword a weight will be given.    The flow is generally as follows:  1. Create an extraction job. If no settings are provided, default settings are used.  2. Upload content for extraction.  3. Start the extraction job.  3. Get the result when the extraction is completed.    Full API Documentation: https://docs.sphereon.com/api/extraction/keyword/0.0/html  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 0.0
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Sphereon.SDK.Extraction.Keyword.Api;
using Sphereon.SDK.Extraction.Keyword.Model;
using Sphereon.SDK.Extraction.Keyword.Client;
using System.Reflection;

namespace Sphereon.SDK.Extraction.Keyword.Test
{
    /// <summary>
    ///  Class for testing KeywordExtractionResponse
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class KeywordExtractionResponseTests
    {
        // TODO uncomment below to declare an instance variable for KeywordExtractionResponse
        //private KeywordExtractionResponse instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of KeywordExtractionResponse
            //instance = new KeywordExtractionResponse();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of KeywordExtractionResponse
        /// </summary>
        [Test]
        public void KeywordExtractionResponseInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" KeywordExtractionResponse
            //Assert.IsInstanceOfType<KeywordExtractionResponse> (instance, "variable 'instance' is a KeywordExtractionResponse");
        }

        /// <summary>
        /// Test the property 'JobId'
        /// </summary>
        [Test]
        public void JobIdTest()
        {
            // TODO unit test for the property 'JobId'
        }
        /// <summary>
        /// Test the property 'KeywordList'
        /// </summary>
        [Test]
        public void KeywordListTest()
        {
            // TODO unit test for the property 'KeywordList'
        }
        /// <summary>
        /// Test the property 'Keywords'
        /// </summary>
        [Test]
        public void KeywordsTest()
        {
            // TODO unit test for the property 'Keywords'
        }
        /// <summary>
        /// Test the property 'Job'
        /// </summary>
        [Test]
        public void JobTest()
        {
            // TODO unit test for the property 'Job'
        }
        /// <summary>
        /// Test the property 'Errors'
        /// </summary>
        [Test]
        public void ErrorsTest()
        {
            // TODO unit test for the property 'Errors'
        }

    }

}
