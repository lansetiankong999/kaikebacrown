package com.jump.kaikebacrown;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Jump
 */
@SpringBootApplication
public class KaikebacrownApplication {

    private static Crown crown;

    @Autowired
    public KaikebacrownApplication(Crown crown) {
        KaikebacrownApplication.crown = crown;
    }

    public static void main(String[] args) {
        SpringApplication.run(KaikebacrownApplication.class, args);
        crown.generateBat();
    }

}
