/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
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

package org.wso2.msf4j.delegates.client;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Class that tests org.wso2.msf4j.delegates.client.MSF4JClient
 */
public class MSF4JClientTest extends Assert {

    @Test
    public void testCreatingWebTarget() {
        Client client = MSF4JClientBuilder.newClient();
        WebTarget webTarget = client.target("http://wso2.com");
        assertTrue(MSF4JWebTarget.class.isInstance(webTarget));
    }

}
