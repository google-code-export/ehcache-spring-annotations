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

package com.googlecode.ehcache.annotations.integration;

import net.sf.ehcache.CacheManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author Eric Dalquist
 * @version $Revision$
 */
@Component
public class AutowiringTestImpl implements AutowiringTestInterface {
    @Autowired
    private CacheManager cacheManagerField;
    private CacheManager cacheManager;
    private int interfaceAnnotatedNoArgCachedCount = 0;

    public String interfaceAnnotatedNoArgCached() {
        this.interfaceAnnotatedNoArgCachedCount++;
        return "interfaceAnnotatedNoArgCached()";
    }

    public int interfaceAnnotatedNoArgCachedCount() {
        return this.interfaceAnnotatedNoArgCachedCount;
    }
    
    @Autowired
    public void setCacheManager(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    public CacheManager getCacheManager() {
        return cacheManager;
    }

    public CacheManager getCacheManagerField() {
        return this.cacheManagerField;
    }
}
