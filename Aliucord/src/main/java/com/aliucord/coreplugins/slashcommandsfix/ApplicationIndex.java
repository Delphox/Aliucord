/*
 * This file is part of Aliucord, an Android Discord client mod.
 * Copyright (c) 2021 Juby210 & Vendicated
 * Licensed under the Open Software License version 3.0
 */

package com.aliucord.coreplugins.slashcommandsfix;

import com.discord.models.commands.ApplicationCommand;
import java.util.List;

class ApplicationIndex {
    public List<Application> applications;
    public List<ApplicationCommand> applicationCommands;

    public ApplicationIndex(List<Application> applications, List<ApplicationCommand> applicationCommands) {
        this.applications = applications;
        this.applicationCommands = applicationCommands;
    }
}