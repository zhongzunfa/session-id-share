package com.zzf.session.vo;


import java.io.Serializable;

/**
 * Company: <a href=www.jd.com>京东</a><br>
 * author:  <a href=mailto:zhongzunfa@jd.com>zunfa.zhong</a>
 * description :
 */
public class User implements Serializable {

    private String name;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
