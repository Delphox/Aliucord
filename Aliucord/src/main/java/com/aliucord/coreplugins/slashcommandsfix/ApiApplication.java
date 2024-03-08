/*
 * This file is part of Aliucord, an Android Discord client mod.
 * Copyright (c) 2021 Juby210 & Vendicated
 * Licensed under the Open Software License version 3.0
 */

package com.aliucord.coreplugins.slashcommandsfix;

class ApiApplication {
    public final long id;
    public final String name;
    public final String icon;
    public final ApiPermissions permissions;

    public ApiApplication() {
        this.id = 0;
        this.name = null;
        this.icon = null;
        this.permissions = null;
    }

    public Application toModel(int commandCount) {
        Permissions permissions = null;
        if (this.permissions != null) {
            permissions = this.permissions.toModel();
        } else {
            permissions = new Permissions(null, null, null);
        }
        return new Application(this.id, this.name, this.icon, permissions, commandCount);
    }
}
