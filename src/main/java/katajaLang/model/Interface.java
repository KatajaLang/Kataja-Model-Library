/*
 * Copyright (C) ni271828mand
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License 3.0 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package katajaLang.model;

import java.util.HashMap;

/**
 * Interface for plugin integration
 */
public interface Interface {

    /**
     * returns a full list of all supported target types
     */
    String[] getTargetTypes();

    /**
     * loads the library at the given path and return all contained classes, or null if the given path is invalid
     */
    HashMap<String, Compilable> loadLibrary(String absolutePath);

    /**
     * compiles the given classes into the given output Folder
     */
    void compile(HashMap<String, Compilable> classes, String targetType, String outFolder);
}
