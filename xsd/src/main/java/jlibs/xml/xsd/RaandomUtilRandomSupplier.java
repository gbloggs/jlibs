/**
 * Copyright 2015 Santhosh Kumar Tekuri
 *
 * The JLibs authors license this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */


package jlibs.xml.xsd;

import jlibs.core.util.RandomUtil;

/**
 * Default implementation of the interface definition allowing different random suppliers
 *
 * @author George Bloggs
 */
public class RaandomUtilRandomSupplier implements RandomSupplier {
    public double random(double min, double max) {
        return RandomUtil.random(min, max);
    }

    public float random(float min, float max) {
        return RandomUtil.random(min, max);
    }

    public long random(long min, long max) {
        return RandomUtil.random(min, max);
    }

    public int random(int min, int max) {
        return RandomUtil.random(min, max);
    }

    public short random(short min, short max) {
        return RandomUtil.random(min, max);
    }

    public byte random(byte min, byte max) {
        return RandomUtil.random(min, max);
    }

    public boolean randomBoolean() {
        return RandomUtil.randomBoolean();
    }
}
