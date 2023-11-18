package employeeApp;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro) {
        this.id = id;
        this.name = name;
        if (giro >= 0) {
            this.giro = giro;
        } else {
            throw new IllegalArgumentException("Giro 0'dan küçük olamaz.");
        }
        this.developerNames = new String[10];
    }

    public int getId() {
        return id;
    }

    public double getGiro() {
        return giro;
    }

    public String getName() {
        return name;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void setGiro(double giro) {
        if (giro >= 0) {
            this.giro = giro;
        } else {
            throw new IllegalArgumentException("Giro 0'dan küçük olamaz.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }

    public void addEmployee(int index, String name) {
        if(developerNames[index] == null) {
            this.developerNames[index] = name;
        }
        else {
            System.out.println("Index'te eleman var!");
        }
    }
}
