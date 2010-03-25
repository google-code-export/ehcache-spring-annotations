/**
 * Copyright 2010 Nicholas Blair, Eric Dalquist
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.wisc.services.cache;

import edu.wisc.services.cache.annotations.Cacheable;
import edu.wisc.services.cache.annotations.TriggersRemove;

/**
 * Possible types of cache related advice
 * 
 * @author Eric Dalquist
 * @version $Revision$
 */
public enum AdviceType {
    /**
     * No advice
     */
    NONE,
    /**
     * {@link Cacheable} advice
     */
    CACHE,
    /**
     * {@link TriggersRemove} advice
     */
    REMOVE;
}
