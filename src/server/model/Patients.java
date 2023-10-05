package server.model;

import java.math.BigInteger;



public class Patients {
    String identification;
    String name;
    BigInteger phone;
    String email;

    public Patients (){
    }
    public Patients (String identification, String name, BigInteger phone, String email){
        this.identification = identification;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public String getIdentification() {
        return identification;
    }
    public void setIdentification(String identification) {
        this.identification = identification;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BigInteger getPhone() {
        return phone;
    }
    public void setPhone(BigInteger phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    


}
