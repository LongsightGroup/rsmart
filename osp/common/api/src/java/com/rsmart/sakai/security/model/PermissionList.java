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

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: johnellis
 * Date: Apr 20, 2007
 * Time: 12:04:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class PermissionList extends IdentifiableObject {

   private List defaultPerms;

   public PermissionList() {
   }

   public PermissionList(List defaultPerms) {
      this.defaultPerms = defaultPerms;
   }

   public List getDefaultPerms() {
      return defaultPerms;
   }

   public void setDefaultPerms(List defaultPerms) {
      this.defaultPerms = defaultPerms;
   }
}
