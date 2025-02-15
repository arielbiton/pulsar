/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.pulsar.common.policies.data;

/**
 * Topic authorization operations.
 */
public enum TopicOperation {
    LOOKUP,
    PRODUCE,
    CONSUME,

    COMPACT,
    EXPIRE_MESSAGES,
    OFFLOAD,
    PEEK_MESSAGES,
    RESET_CURSOR,
    SKIP,
    TERMINATE,
    UNLOAD,

    GRANT_PERMISSION,
    GET_PERMISSION,
    REVOKE_PERMISSION,

    ADD_BUNDLE_RANGE,
    GET_BUNDLE_RANGE,
    DELETE_BUNDLE_RANGE,

    SUBSCRIBE,
    GET_SUBSCRIPTIONS,
    UNSUBSCRIBE,

    GET_STATS,
    GET_METADATA,
    GET_BACKLOG_SIZE,

    SET_REPLICATED_SUBSCRIPTION_STATUS,
    GET_REPLICATED_SUBSCRIPTION_STATUS,

    SET_SCHEMA_COMPATIBILITY_STRATEGY,
    GET_SCHEMA_COMPATIBILITY_STRATEGY,
}
