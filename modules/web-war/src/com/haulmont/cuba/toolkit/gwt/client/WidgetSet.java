/*
 * Copyright (c) 2008 Haulmont Technology Ltd. All Rights Reserved.
 * Haulmont Technology proprietary and confidential.
 * Use is subject to license terms.
 *
 * Author: Nikolay Gorodnov
 * Created: 10.12.2008 11:51:21
 * $Id$
 */
package com.haulmont.cuba.toolkit.gwt.client;

import com.itmill.toolkit.terminal.gwt.client.DefaultWidgetSet;
import com.itmill.toolkit.terminal.gwt.client.UIDL;
import com.google.gwt.user.client.ui.Widget;
import com.haulmont.cuba.toolkit.gwt.client.ui.IPagingTable;

public class WidgetSet extends DefaultWidgetSet {
    protected String resolveWidgetTypeName(UIDL uidl) {
        final String tag = uidl.getTag();
        if ("pagingtable".equals(tag)) {
            return "com.haulmont.cuba.webtoolkit.gwt.client.ui.IPagingTable";
        }
        return super.resolveWidgetTypeName(uidl);
    }

    public Widget createWidget(UIDL uidl) {
        final String className = resolveWidgetTypeName(uidl);
        if ("com.haulmont.cuba.webtoolkit.gwt.client.ui.IPagingTable".equals(className)) {
            return new IPagingTable();
        }
        return super.createWidget(uidl);
    }
}
