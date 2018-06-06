package sample;


import javafx.beans.property.SimpleStringProperty;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Product {

    private SimpleStringProperty id;
    private SimpleStringProperty spec_expiren;
    private SimpleStringProperty education;
    private SimpleStringProperty data;
    private SimpleStringProperty newspeciality;
    private SimpleStringProperty salary;
    public Product () {
    }

    public Product (String s1, String s2, String s3, String s4,  String s6) {

        id = new SimpleStringProperty(s1);
        spec_expiren = new SimpleStringProperty(s2);
        education = new SimpleStringProperty(s3);
        data = new SimpleStringProperty(s4);
        salary = new SimpleStringProperty(s6);
    }

    public String getId() {
        return id.get();
    }
    public void setId(String s) {
        if ((s.matches("^\\d+"))){
            id.set(s);
        } else {
            id.set("Input please corect id");
        }

    }

    public String getEducation() {

        return education.get();
    }
    public void setEducation(String s) {
            education.set(s);
    }

    public String getSpec_expiren() {
        return spec_expiren.get();
    }
    public void setSpec_expiren(String s) {
            spec_expiren.set(s);
    }

    public String getData() {
        return data.get();
    }
    public void setData(String s) {
        data.set(s);
    }

    public  String getNewSpeciality() {
        return newspeciality.get();
    }
    public  void  setNewSpeciality(String s) {
        newspeciality.set(s);
    }
    public String getSalary() {
        return salary.get();
    }
    public  void setSalary(String s) {
        salary.set(s);
    }

}