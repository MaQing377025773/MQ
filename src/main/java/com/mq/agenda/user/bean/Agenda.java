package com.mq.agenda.user.bean;

public class Agenda {
    private long id;
    private String usereamil;
    private String username;
    private String agen_title;
    private String class_name;
    private String agen_body;
    private String agen_date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getUsereamil() {
        return usereamil;
    }

    public void setUsereamil(String usereamil) {
        this.usereamil = usereamil;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAgen_title() {
        return agen_title;
    }

    public void setAgen_title(String agen_title) {
        this.agen_title = agen_title;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getAgen_body() {
        return agen_body;
    }

    public void setAgen_body(String agen_body) {
        this.agen_body = agen_body;
    }

    public String getAgen_date() {
        return agen_date;
    }

    public void setAgen_date(String agen_date) {
        this.agen_date = agen_date;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "id=" + id +
                ", usereamil='" + usereamil + '\'' +
                ", username='" + username + '\'' +
                ", agen_title='" + agen_title + '\'' +
                ", class_name='" + class_name + '\'' +
                ", agen_body='" + agen_body + '\'' +
                ", agen_date='" + agen_date + '\'' +
                '}';
    }
}
