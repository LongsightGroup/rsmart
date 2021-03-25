/*
 * Copyright 2008 The rSmart Group
 *
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Contributor(s): jbush
 */

package com.rsmart.sakai.security.model;

import org.sakaiproject.metaobj.shared.model.IdentifiableObject;

import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.Hashtable;

/**
 * Created by IntelliJ IDEA.
 * User: johnellis
 * Date: Apr 20, 2007
 * Time: 11:57:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class SiteTypePermissionsMap extends IdentifiableObject {

   private Map defaultPerms;

   public SiteTypePermissionsMap() {
   }

   public SiteTypePermissionsMap(Map defaultPerms) {
      this.defaultPerms = replaceClasses(defaultPerms);
   }

   protected Map replaceClasses(Map defaultPerms) {
      for (Iterator<Map.Entry> i=defaultPerms.entrySet().iterator();i.hasNext();) {
         Map.Entry current = i.next();
         current.setValue(new PermissionList((List) current.getValue()));
      }
      return defaultPerms;
   }

   public Map getDefaultPerms() {
      return defaultPerms;
   }

   public void setDefaultPerms(Map defaultPerms) {
      this.defaultPerms = defaultPerms;
   }

   public Map getDefaultPermsNative() {
      Map returned = new Hashtable(getDefaultPerms());
      for (Iterator<Map.Entry> i=returned.entrySet().iterator();i.hasNext();) {
         Map.Entry current = i.next();
         current.setValue(((PermissionList)current.getValue()).getDefaultPerms());
      }
      return returned;
   }
}
