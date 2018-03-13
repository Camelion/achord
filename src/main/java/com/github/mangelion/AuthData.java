/*
 * Copyright 2017-2018 Mangelion
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

package com.github.mangelion;

/**
 * @author Camelion
 * @since 14/02/2018
 */
final class AuthData {
    final String database;
    final String username;
    final String password;

    AuthData(String database, String username, String password) {
        this.database = database;
        this.username = username;
        this.password = password;
    }
}
