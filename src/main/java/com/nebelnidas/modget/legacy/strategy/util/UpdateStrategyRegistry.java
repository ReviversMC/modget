package com.nebelnidas.modget.legacy.strategy.util;

import javax.annotation.Nullable;

import com.nebelnidas.modget.api.UpdateStrategy;
import com.nebelnidas.modget.legacy.strategy.CurseForgeStrategy;
import com.nebelnidas.modget.legacy.strategy.GitHubReleasesStrategy;
import com.nebelnidas.modget.legacy.strategy.JSONStrategy;
import com.nebelnidas.modget.legacy.strategy.MavenStrategy;

import java.util.HashMap;
import java.util.Map;

public class UpdateStrategyRegistry {
    private static final Map<String, UpdateStrategy> data = new HashMap<>();

    @Nullable
    static UpdateStrategy get(String name) {
        return data.get(name);
    }

    static {
        data.put("curseforge", new CurseForgeStrategy());
        data.put("maven", new MavenStrategy());
        data.put("github", new GitHubReleasesStrategy());
        data.put("json", new JSONStrategy());
    }
}