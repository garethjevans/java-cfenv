/*
 * Copyright 2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.pivotal.cfenv.boot.genai;

import org.junit.Test;

import io.pivotal.cfenv.test.AbstractCfEnvTests;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Gareth Evans
 */
public class GenAICfEnvProcessorTests extends AbstractCfEnvTests {

	@Test
	public void testGenAIBootPropertiesWithEndpointFormat() {
		String TEST_GENAI_JSON_FILE = "test-genai-endpoint-chat-model.json";

		mockVcapServices(getServicesPayload(readTestDataFile(TEST_GENAI_JSON_FILE)));

		assertThat(getEnvironment().getProperty("genai.locator.api-key")).isNotNull();
		assertThat(getEnvironment().getProperty("genai.locator.api-base")).isNotNull();
		assertThat(getEnvironment().getProperty("genai.locator.config-url")).isNotNull();
	}
}
