package cn.javabs.entity;

public class User {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private  Integer id;

    public Integer getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private  Integer  password;

    public Integer getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private  Integer   sex;

    public void setUsername(String username) {
    }
}
