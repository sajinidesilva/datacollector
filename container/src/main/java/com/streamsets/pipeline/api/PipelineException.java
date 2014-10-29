/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.pipeline.api;

public class PipelineException extends com.streamsets.pipeline.api.impl.PipelineException {
  private static final String PIPELINE_AGENT_BUNDLE = "pipeline-container-bundle";

  public PipelineException(ErrorId id, Object... params) {
    super(PIPELINE_AGENT_BUNDLE, id, params);
  }

  public static void setContext(ClassLoader classLoader) {
    com.streamsets.pipeline.api.impl.PipelineException.setContext(null, classLoader);
  }

  public static boolean isContextSet() {
    return com.streamsets.pipeline.api.impl.PipelineException.isContextSet();
  }

  public static void resetContext() {
    com.streamsets.pipeline.api.impl.PipelineException.resetContext();
  }

}
