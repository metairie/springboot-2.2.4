package net.metairie.rest;

import net.metairie.service.ConfigLoaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/configloader")
public class ConfigLoaderRest {

    @Autowired
    public ConfigLoaderService configLoaderService;

    @GetMapping
    public String getInfoConfig() {
        return configLoaderService.getInfoConfig();
    }
}
