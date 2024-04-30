package Parcial1_Practica;

import java.util.ArrayList;
import java.util.List;

public class Installation {
    private String category;
    private String localitation;
    private String name;
    private String type;
    private List<Test>tests;

    public Installation() {
    }

    public Installation(String category, String localitation, String name, String type) {
        this.category = category;
        this.localitation = localitation;
        this.name = name;
        this.type = type;
        tests= new ArrayList<>();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocalitation() {
        return localitation;
    }

    public void setLocalitation(String localitation) {
        this.localitation = localitation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }

    public void addTest(Test test){
        tests.add(test);
    }
}
