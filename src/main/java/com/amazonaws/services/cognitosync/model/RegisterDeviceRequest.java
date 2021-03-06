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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitosync.AmazonCognitoSync#registerDevice(RegisterDeviceRequest) RegisterDevice operation}.
 * 
 *
 * @see com.amazonaws.services.cognitosync.AmazonCognitoSync#registerDevice(RegisterDeviceRequest)
 */
public class RegisterDeviceRequest extends AmazonWebServiceRequest implements Serializable {

    private String identityPoolId;

    private String identityId;

    private String platform;

    private String token;

    /**
     * Returns the value of the IdentityPoolId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return The value of the IdentityPoolId property for this object.
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }
    
    /**
     * Sets the value of the IdentityPoolId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId The new value for the IdentityPoolId property for this object.
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }
    
    /**
     * Sets the value of the IdentityPoolId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId The new value for the IdentityPoolId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterDeviceRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * Returns the value of the IdentityId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return The value of the IdentityId property for this object.
     */
    public String getIdentityId() {
        return identityId;
    }
    
    /**
     * Sets the value of the IdentityId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId The new value for the IdentityId property for this object.
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }
    
    /**
     * Sets the value of the IdentityId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId The new value for the IdentityId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterDeviceRequest withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * Returns the value of the Platform property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM, ADM
     *
     * @return The value of the Platform property for this object.
     *
     * @see Platform
     */
    public String getPlatform() {
        return platform;
    }
    
    /**
     * Sets the value of the Platform property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM, ADM
     *
     * @param platform The new value for the Platform property for this object.
     *
     * @see Platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * Sets the value of the Platform property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM, ADM
     *
     * @param platform The new value for the Platform property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Platform
     */
    public RegisterDeviceRequest withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Sets the value of the Platform property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM, ADM
     *
     * @param platform The new value for the Platform property for this object.
     *
     * @see Platform
     */
    public void setPlatform(Platform platform) {
        this.platform = platform.toString();
    }
    
    /**
     * Sets the value of the Platform property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM, ADM
     *
     * @param platform The new value for the Platform property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Platform
     */
    public RegisterDeviceRequest withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * Returns the value of the Token property for this object.
     *
     * @return The value of the Token property for this object.
     */
    public String getToken() {
        return token;
    }
    
    /**
     * Sets the value of the Token property for this object.
     *
     * @param token The new value for the Token property for this object.
     */
    public void setToken(String token) {
        this.token = token;
    }
    
    /**
     * Sets the value of the Token property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param token The new value for the Token property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterDeviceRequest withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getIdentityId() != null) sb.append("IdentityId: " + getIdentityId() + ",");
        if (getPlatform() != null) sb.append("Platform: " + getPlatform() + ",");
        if (getToken() != null) sb.append("Token: " + getToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode()); 
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode()); 
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RegisterDeviceRequest == false) return false;
        RegisterDeviceRequest other = (RegisterDeviceRequest)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getPlatform() == null ^ this.getPlatform() == null) return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false) return false; 
        if (other.getToken() == null ^ this.getToken() == null) return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false) return false; 
        return true;
    }
    
}
    