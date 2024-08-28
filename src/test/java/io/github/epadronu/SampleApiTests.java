/***************************************************************************************************
 * Copyright 2024 Edinson E. Padrón Urdaneta
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **************************************************************************************************/

/* ************************************************************************************************/
package io.github.epadronu;
/* ************************************************************************************************/

/* ************************************************************************************************/
import io.github.epadronu.dwalin.qa.DwalinTest;
import io.qameta.allure.restassured.AllureRestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
/* ************************************************************************************************/

/**
 * <p>
 * This class demonstrates how the Allure-REST Assured integration works.
 * </p>
 */
@DisplayName("Sample API tests")
public final class SampleApiTests extends DwalinTest {

  @Test
  void testSomeRequest() {
    given()
        .filter(new AllureRestAssured())
        .get("https://jsonplaceholder.typicode.com/todos/1")
        .then()
        .body("userId", equalTo(1));
  }
}

