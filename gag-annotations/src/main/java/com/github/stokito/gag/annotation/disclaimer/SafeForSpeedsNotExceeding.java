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

import com.github.stokito.gag.enumeration.SpeedUnits;

import java.lang.annotation.*;

/**
 * Indicates the maximum speed that a device running the annotated code has
 * been tested to function correctly with.
 * <p/>
 * Meant for code residing on embedded devices propelled at breakneck speeds, this annotation let's you indicate the maximum speed your code-carrying device was successfully tested at.
 * Valid speed units can be found in {@link SpeedUnits}.
 * <pre>
 * &#064;SafeForSpeedsNotExceeding(
 *  value = 1.15572735,
 *  units = ATTOPARSECS_PER_MICROFORTNIGHT)
 * public class QuantumDecoherenceStabilizer {
 * }
 * </pre>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.TYPE,
        ElementType.METHOD,
        ElementType.CONSTRUCTOR})
public @interface SafeForSpeedsNotExceeding {
    double value();

    SpeedUnits units();
}
