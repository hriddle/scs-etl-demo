/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.pivotal.scs.demo.etl.jdbc.processor;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

/**
 * Holds configuration properties for the Jdbc Event Processor module.
 *
 * @author Jeff Cherng
 */
@ConfigurationProperties("jdbc-event-processor-extension")
@Validated
public class JdbcEventProcessorExtensionProperties {
	private String customerSql;
	private String itemSql;
	private String customerOrderSql;

	public String getCustomerSql() {
		return customerSql;
	}

	public void setCustomerSql(String customerSql) {
		this.customerSql = customerSql;
	}

	public String getItemSql() {
		return itemSql;
	}

	public void setItemSql(String itemSql) {
		this.itemSql = itemSql;
	}

	public String getCustomerOrderSql() {
		return customerOrderSql;
	}

	public void setCustomerOrderSql(String customerOrderSql) {
		this.customerOrderSql = customerOrderSql;
	}

}
