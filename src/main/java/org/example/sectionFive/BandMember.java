package org.example.sectionFive;

public class BandMember {
    private final String name;
    private final String role;

    public BandMember(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return name + " - " + role;
    }
}
