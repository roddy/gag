/**
 * Copyright 2010 Google Inc.
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

package com.github.stokito.gag.annotation.disclaimer;

import com.github.stokito.gag.enumeration.RegionType;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Discloses the best-guess number of regions that the annotated code might
 * be illegal in.
 * <p/>
 * Not certain whether your code is actually legal in a given region? Better to be safe than sorry.
 * It's probably a good idea to slap one of these on your code.
 * Valid regions are in {@link RegionType}.
 * <pre>
 * &#064;ProbablyIllegalIn(number = 17, region = STATES)
 * public Money extractFractionalPennies(Account account);
 * </pre>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ProbablyIllegalIn {
    int number();

    RegionType region();
}
