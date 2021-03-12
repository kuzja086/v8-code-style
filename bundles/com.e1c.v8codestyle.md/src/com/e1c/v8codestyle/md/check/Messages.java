/*******************************************************************************
 * Copyright (C) 2021, 1C-Soft LLC and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     1C-Soft LLC - initial API and implementation
 *******************************************************************************/
/**
 *
 */
package com.e1c.v8codestyle.md.check;

import org.eclipse.osgi.util.NLS;

/**
 * @author Dmitriy Marmyshev
 *
 */
final class Messages
    extends NLS
{
    private static final String BUNDLE_NAME = "com.e1c.v8codestyle.md.check.messages"; //$NON-NLS-1$
    public static String CommonModuleNameClient_description;
    public static String CommonModuleNameClient_message;
    public static String MdObjectNameWithoutSuffix_Name_suffix_list_title;
    public static String CommonModuleNameClient_title;
    public static String CommonModuleNameClientServer_description;
    public static String CommonModuleNameClientServer_message;
    public static String CommonModuleNameClientServer_title;
    public static String CommonModuleNameGlobal_description;
    public static String CommonModuleNameGlobal_message;
    public static String CommonModuleNameGlobal_title;
    public static String CommonModuleType_description;
    public static String CommonModuleType_message;
    public static String CommonModuleType_title;
    public static String ConfigurationDataLock_description;
    public static String ConfigurationDataLock_message;
    public static String ConfigurationDataLock_title;
    public static String MdObjectNameLength_description;
    public static String MdObjectNameLength_Maximum_name_length_description;
    public static String MdObjectNameLength_message;
    public static String MdObjectNameLength_title;
    static
    {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages()
    {
    }
}
