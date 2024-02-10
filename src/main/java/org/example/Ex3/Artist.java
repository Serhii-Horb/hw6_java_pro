package org.example.Ex3;

public abstract class Artist {
    private String name;
    private int age;
    private String skills;

    public Artist(String name, int age, String skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void showsTalent() {
        System.out.println("Всем привет меня зовут " + name + " мне " + age + " я умею " + skills);
    }

}
