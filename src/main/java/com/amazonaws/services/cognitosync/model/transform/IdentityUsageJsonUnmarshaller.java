/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cognitosync.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Identity Usage JSON Unmarshaller
 */
public class IdentityUsageJsonUnmarshaller implements Unmarshaller<IdentityUsage, JsonUnmarshallerContext> {

    public IdentityUsage unmarshall(JsonUnmarshallerContext context) throws Exception {
        IdentityUsage identityUsage = new IdentityUsage();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("IdentityId", targetDepth)) {
                    context.nextToken();
                    identityUsage.setIdentityId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IdentityPoolId", targetDepth)) {
                    context.nextToken();
                    identityUsage.setIdentityPoolId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    identityUsage.setLastModifiedDate(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DatasetCount", targetDepth)) {
                    context.nextToken();
                    identityUsage.setDatasetCount(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataStorage", targetDepth)) {
                    context.nextToken();
                    identityUsage.setDataStorage(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return identityUsage;
    }

    private static IdentityUsageJsonUnmarshaller instance;
    public static IdentityUsageJsonUnmarshaller getInstance() {
        if (instance == null) instance = new IdentityUsageJsonUnmarshaller();
        return instance;
    }
}
    