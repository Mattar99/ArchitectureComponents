package com.co.cousins.injectionlearn.database.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by Mattar on 8/24/2018.
 */

@Entity
public class User {

    @PrimaryKey
    @NonNull
    @SerializedName("id")
    private String id;

    @SerializedName("login")
    private String login;

    @SerializedName("avatar_url")
    private String avatar_url;

    @SerializedName("name")
    private String name;

    @SerializedName("company")
    private String company;

    @SerializedName("blog")
    private String blog;

    private Date lastRefresh;


    /**
    constructors
     */

    @Ignore
    public User() { }

    public User(@NonNull String id, String login, String avatar_url, String name, String company, String blog, Date lastRefresh) {
        this.id = id;
        this.login = login;
        this.avatar_url = avatar_url;
        this.name = name;
        this.company = company;
        this.blog = blog;
        this.lastRefresh = lastRefresh;
    }

    /**
     *
     * Getters
     */

    public String getId() { return id; }
    public String getAvatar_url() { return avatar_url; }
    public Date getLastRefresh() { return lastRefresh; }
    public String getLogin() { return login; }
    public String getName() { return name; }
    public String getCompany() { return company; }
    public String getBlog() { return blog; }


    /**
     * Setters
     */

    public void setId(String id) { this.id = id; }
    public void setAvatar_url(String avatar_url) { this.avatar_url = avatar_url; }
    public void setLastRefresh(Date lastRefresh) { this.lastRefresh = lastRefresh; }
    public void setLogin(String login) { this.login = login; }
    public void setName(String name) { this.name = name; }
    public void setCompany(String company) { this.company = company; }
    public void setBlog(String blog) { this.blog = blog; }

}
