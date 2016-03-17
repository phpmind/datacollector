/**
 * Copyright 2016 StreamSets Inc.
 *
 * Licensed under the Apache Software Foundation (ASF) under one
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
package com.streamsets.lib.security.http;

import com.streamsets.datacollector.util.Configuration;

public class ProxySSOService implements SSOService {
  private SSOService ssoService;

  public ProxySSOService(SSOService ssoService) {
    this.ssoService = ssoService;
  }

  @Override
  public void setDelegateTo(SSOService ssoService) {
    this.ssoService = ssoService;
  }

  @Override
  public void setConfiguration(Configuration configuration) {
    ssoService.setConfiguration(configuration);
  }

  @Override
  public String createRedirectToLoginURL(String requestUrl) {
    return ssoService.createRedirectToLoginURL(requestUrl);
  }

  @Override
  public SSOUserPrincipal validateAppToken(String authToken, String componentId) {
    return ssoService.validateAppToken(authToken, componentId);
  }

  @Override
  public SSOTokenParser getTokenParser() {
    return ssoService.getTokenParser();
  }

  @Override
  public void setListener(SSOService.Listener listener) {
    ssoService.setListener(listener);
  }

  @Override
  public void refresh() {
    ssoService.refresh();
  }

  @Override
  public boolean isAppAuthenticationEnabled() {
    return ssoService.isAppAuthenticationEnabled();
  }

  @Override
  public long getValidateAppTokenFrequency() {
    return ssoService.getValidateAppTokenFrequency();
  }

}