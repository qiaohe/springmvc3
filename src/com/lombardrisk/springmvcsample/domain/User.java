package com.lombardrisk.springmvcsample.domain;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: johnson
 * Date: 1/3/12
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private String userName;
    private String password;
    private Date birthDate;
    private boolean enabled;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
