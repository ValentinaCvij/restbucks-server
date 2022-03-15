/*
 * Copyright 2012-2019 the original author or authors.
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
package org.springsource.restbucks.payment;

import lombok.Getter;

import org.springframework.util.Assert;
import org.springsource.restbucks.order.Order;

/**
 * @author Oliver Gierke
 */
@Getter
public class PaymentFailed extends RuntimeException {

	private static final long serialVersionUID = -4929826142920520541L;

	private final Order order;

	public PaymentFailed(Order order, String message) {

		super(message);

		Assert.notNull(order, "Order must not be null!");

		this.order = order;
	}
}
