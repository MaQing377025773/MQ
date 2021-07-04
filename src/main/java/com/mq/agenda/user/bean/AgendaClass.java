package com.mq.agenda.user.bean;

public class AgendaClass {
    private Integer id;
    private String name;
    private String ClassName;
    private String AgenTitle;
    private String AgenDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getAgenTitle() {
        return AgenTitle;
    }

    public void setAgenTitle(String agenTitle) {
        AgenTitle = agenTitle;
    }

    public String getAgenDate() {
        return AgenDate;
    }

    public void setAgenDate(String agenDate) {
        AgenDate = agenDate;
    }

    @Override
    public String toString() {
        return "AgendaClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ClassName='" + ClassName + '\'' +
                ", AgenTitle='" + AgenTitle + '\'' +
                ", AgenDate='" + AgenDate + '\'' +
                '}';
    }
}
