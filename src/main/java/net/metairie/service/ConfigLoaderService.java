package net.metairie.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigLoaderService {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${logging.level.root}")
    private String loggingLevelRoot;

    /**
     * get info from web service
     *
     * @return
     */
    public String getInfoConfig() {
        StringBuilder sb = new StringBuilder();

        sb.append("application name: ");
        sb.append(applicationName);
        sb.append("\n<br />");

        sb.append("logging level: ");
        sb.append(loggingLevelRoot);
        sb.append("\n<br />");

        return sb.toString();
    }
}
