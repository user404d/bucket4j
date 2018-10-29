/*
 *
 *   Copyright 2015-2017 Vladimir Bukhtoyarov
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.github.bucket4j.lua.state

import io.github.bucket4j.BucketState
import io.github.bucket4j.core_algorithms.ieee754.BucketStateSpecification
import io.github.bucket4j.local.LocalBucket

class LuaStateSpecification extends BucketStateSpecification {



    @Override
    protected BucketState replace(LocalBucket bucket) {
        return super.getState(state)
    }

}
