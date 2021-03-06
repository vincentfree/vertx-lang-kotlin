/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.core.http

import io.vertx.core.http.HttpMethod

/**
 * A function providing a DSL for building [io.vertx.core.http.HttpMethod] objects.
 *
 * Represents an HTTP method.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpMethod original] using Vert.x codegen.
 */
fun httpMethodOf(
): HttpMethod = io.vertx.core.http.HttpMethod(String()).apply {

}

/**
 * A function providing a DSL for building [io.vertx.core.http.HttpMethod] objects.
 *
 * Represents an HTTP method.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpMethod original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("httpMethodOf()")
)
fun HttpMethod(
): HttpMethod = io.vertx.core.http.HttpMethod(String()).apply {

}

