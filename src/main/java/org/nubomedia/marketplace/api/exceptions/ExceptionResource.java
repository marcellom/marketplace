/*
 *
 *  *  Copyright (c) 2015 Technische Universität Berlin
 *  *   Licensed under the Apache License, Version 2.0 (the "License");
 *  *   you may not use this file except in compliance with the License.
 *  *   You may obtain a copy of the License at
 *  *
 *  *          http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *   Unless required by applicable law or agreed to in writing, software
 *  *   distributed under the License is distributed on an "AS IS" BASIS,
 *  *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *   See the License for the specific language governing permissions and
 *  *   limitations under the License.
 *
 */

package org.nubomedia.marketplace.api.exceptions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by gca on 28/08/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExceptionResource {

    private String code;
    private String message;

    public ExceptionResource() {
    }

    public ExceptionResource(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
