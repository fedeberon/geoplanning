package com.ideasYSoluciones.config;

import org.apache.commons.logging.Log;
import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomPasswordEncoder implements PasswordEncoder {

    private Log logger;

    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String password) {
        if (password != null && password.length() != 0) {
            if (!charSequence.toString().equals(password)) {
                this.logger.warn("Encoded password doesn't match");
                return false;
            } else {
                return charSequence.toString().equals(password);
            }
        } else {
            this.logger.warn("Empty encoded password");
            return false;
        }
    }
}
