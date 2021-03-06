// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201710.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineDataUploadFailureReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfflineDataUploadFailureReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="INSUFFICIENT_MATCHED_TRANSACTIONS"/>
 *     &lt;enumeration value="INSUFFICIENT_TRANSACTIONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OfflineDataUploadFailureReason")
@XmlEnum
public enum OfflineDataUploadFailureReason {


    /**
     * 
     *                 UNKNOWN value cannot be passed as input.
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Indicates the matched transactions don?t cross the minimum threshold.
     *               
     * 
     */
    INSUFFICIENT_MATCHED_TRANSACTIONS,

    /**
     * 
     *                 Indicates the insufficient transactions uploaded.
     *               
     * 
     */
    INSUFFICIENT_TRANSACTIONS;

    public String value() {
        return name();
    }

    public static OfflineDataUploadFailureReason fromValue(String v) {
        return valueOf(v);
    }

}
