/**
 * Keyword Extraction
 * The Keyword Extraction API allows you to extract keywords from text. Keywords can be extracted from text, file or stream location. With each extracted keyword a weight will be given.    The flow is generally as follows:  1. Create an extraction job. If no settings are provided, default settings are used.  2. Upload content for extraction.  3. Start the extraction job.  3. Get the result when the extraction is completed.    Full API Documentation: https://docs.sphereon.com/api/extraction/keyword/0.0/html  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.KeywordExtraction);
  }
}(this, function(expect, KeywordExtraction) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new KeywordExtraction.KeywordExtractionApi();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('KeywordExtractionApi', function() {
    describe('addInputText', function() {
      it('should call addInputText successfully', function(done) {
        //uncomment below and update the code to test addInputText
        //instance.addInputText(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createJob', function() {
      it('should call createJob successfully', function(done) {
        //uncomment below and update the code to test createJob
        //instance.createJob(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteJob', function() {
      it('should call deleteJob successfully', function(done) {
        //uncomment below and update the code to test deleteJob
        //instance.deleteJob(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getJob', function() {
      it('should call getJob successfully', function(done) {
        //uncomment below and update the code to test getJob
        //instance.getJob(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getResult', function() {
      it('should call getResult successfully', function(done) {
        //uncomment below and update the code to test getResult
        //instance.getResult(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('submitJob', function() {
      it('should call submitJob successfully', function(done) {
        //uncomment below and update the code to test submitJob
        //instance.submitJob(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));