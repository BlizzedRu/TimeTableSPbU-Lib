/*
 * Copyright (c) 2017 BlizzedRu (Ivan Vlasov)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.blizzed.timetablespbulib;

import ru.blizzed.timetablespbulib.model.ApiError;

/**
 * This exception can be thrown when API has been called but response contains an error
 *
 * @author BlizzedRu
 */
public class ApiErrorException extends Exception {

    private ApiError error;

    public ApiErrorException(ApiError error) {
        this.error = error;
    }

    public ApiError getError() {
        return error;
    }
}
