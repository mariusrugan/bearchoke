/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bearchoke.platform.user.repositories;

import com.bearchoke.platform.user.document.User;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Bjorn Harvold
 * Date: 1/9/14
 * Time: 8:03 PM
 * Responsibility:
 */
public interface UserRepositoryCustom {
    User findUserByUsername(String username);

    User findUserByEmail(String email);

    boolean isUsernameUnique(String username);

    boolean isEmailUnique(String email);

    User findUserByUserIdentifier(String userIdentifier);
}
