package net.metairie.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.SecureRandom;

@Service
@Slf4j
public class GenerateLogsService {
    static final SecureRandom secureRandom = new SecureRandom();

    /**
     * generate fake logs
     */
    public void GenerateLogs() {
        for (int i = 0; i < 10000; i++) {
            String word = "";
            for (int j = 0; j < 10; j++) {
                word += getNextRandomString();
            }
            log.info("This is a random generator phrase : " + word);
        }
    }

    // get next random string
    public String getNextRandomString() {
        // create 130 bits random BigInteger
        BigInteger bInt = new BigInteger(130, secureRandom);
        // return string representation of BigInteger in 32 radix
        return bInt.toString(32);
    }
}