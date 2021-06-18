package ru.goryachev.multichief.auth.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table (name = "app_user")
public class AppUser {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email ;

    @Column(name = "role_id")
    private Long role_id;

    @Column(name = "status")
    private String status ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AppUser)) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(getId(), appUser.getId()) &&
                Objects.equals(getLogin(), appUser.getLogin()) &&
                Objects.equals(getPassword(), appUser.getPassword()) &&
                Objects.equals(getEmail(), appUser.getEmail()) &&
                Objects.equals(getRole_id(), appUser.getRole_id()) &&
                Objects.equals(getStatus(), appUser.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLogin(), getPassword(), getEmail(), getRole_id(), getStatus());
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role_id=" + role_id +
                ", status='" + status + '\'' +
                '}';
    }
}