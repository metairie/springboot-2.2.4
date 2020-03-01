package net.metairie.rest;

import net.metairie.service.GenerateLogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/generatelogs")
public class GenerateLogsRest {
    @Autowired
    public GenerateLogsService generateLogsService;

    @GetMapping
    public void GenerateLogs() {
        generateLogsService.GenerateLogs();
    }
}
