/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.webank.wedatasphere.dss.oneservice.core.util;


import com.webank.wedatasphere.dss.oneservice.core.restful.exception.AssertException;

/**
 * @author lidongzhang
 */
public class AssertUtil {

    public static void isTrue(boolean b, String message) {
        if (!b) {
            throw new AssertException(message);
        }
    }

    public static void isFalse(boolean b, String message) {
        if (b) {
            throw new AssertException(message);
        }
    }

    public static void notEmpty(String str, String message) {
        if (str == null || str.isEmpty()) {
            throw new AssertException(message);
        }
    }

    public static void notNull(Object str, String message) {
        if (str == null) {
            throw new AssertException(message);
        }
    }
}
