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
/**
 * Interface definition allowing different random suppliers
 *
 * @author George Bloggs
 */
public interface RandomSupplier {
    double random(double min, double max);

    float random(float min, float max);

    long random(long min, long max);

    int random(int min, int max);

    short random(short min, short max);

    byte random(byte min, byte max);

    boolean randomBoolean();

    default boolean randomBoolean(Boolean bool) {
        if (Boolean.TRUE.equals(bool))
            return true;
        else if (Boolean.FALSE.equals(bool))
            return false;
        else {
            return randomBoolean();
        }
    }
}
