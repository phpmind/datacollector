/**
 * Copyright 2015 StreamSets Inc.
 *
 * Licensed under the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sun.org.mozilla.javascript.internal;

/**
 * Dummy class to be able to compile the Java7 scripting support classes using javac from Java8.
 * Note that if the SDC is compiled with Java8, even if using bytecode compatible with Java7, the Javascript processor
 * will not work with Java7.
 */
public class NativeObject {

  public static final int PERMANENT = 0;

  public void defineProperty(String var1, Object var2, int var3) {
  }

}