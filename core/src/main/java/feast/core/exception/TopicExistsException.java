/*
 * Copyright 2018 The Feast Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package feast.core.exception;

/**
 * Exception thrown when creation of a topic in the stream fails because it already exists.
 */
public class TopicExistsException extends RuntimeException {
  public TopicExistsException() {
    super();
  }

  public TopicExistsException(String message) {
    super(message);
  }

  public TopicExistsException(String message, Throwable cause) {
    super(message, cause);
  }
}
