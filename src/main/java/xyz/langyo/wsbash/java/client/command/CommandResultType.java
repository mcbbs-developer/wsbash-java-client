/*
  Copyright 2019 langyo<langyo.china@gmail.com> and contributors

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */

package net.mcbbs.app.desktop.java.api.plugin.command;

public enum CommandResultType {
    /**
     * 成功执行命令
     */
    SUCCESS,
    /**
     * 命令执行失败
     */
    FAIL,
    /**
     * 命令被拒绝执行
     */
    DENY,
    /**
     * 该命令被无视了
     */
    IGNORE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}