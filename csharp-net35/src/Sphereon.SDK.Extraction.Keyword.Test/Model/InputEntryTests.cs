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
    ///  Class for testing InputEntry
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class InputEntryTests
    {
        // TODO uncomment below to declare an instance variable for InputEntry
        //private InputEntry instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of InputEntry
            //instance = new InputEntry();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of InputEntry
        /// </summary>
        [Test]
        public void InputEntryInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" InputEntry
            //Assert.IsInstanceOfType<InputEntry> (instance, "variable 'instance' is a InputEntry");
        }

        /// <summary>
        /// Test the property 'TextInput'
        /// </summary>
        [Test]
        public void TextInputTest()
        {
            // TODO unit test for the property 'TextInput'
        }
        /// <summary>
        /// Test the property 'Id'
        /// </summary>
        [Test]
        public void IdTest()
        {
            // TODO unit test for the property 'Id'
        }

    }

}
