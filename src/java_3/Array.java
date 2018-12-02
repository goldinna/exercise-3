package java_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {

    private ArrayList<Patient> ar = new ArrayList<Patient>();

    public void add(Patient p) {
        ar.add(p);
    }

    public ArrayList getArray() {
        return this.ar;
    }

    public void print() {
        System.out.println("All patients");
        for (Iterator<Patient> it = ar.iterator(); it.hasNext();) {
            Patient p = it.next();
            System.out.println(p.toString());
        }
    }

    public void findByDiagnosis(String diag) {
        System.out.println("Patients with diagnosis " + diag);
        boolean finded = false;
        for (Iterator<Patient> it = ar.iterator(); it.hasNext();) {
            Patient p = it.next();
            if (p.getDiagnosis() == diag) {
                System.out.println(p.toString());
                finded = true;
            }
        }
        if (!finded) {
            System.out.println("Diagnosis " + diag + " not found");
        }
    }

    public void findByNum(int num1, int num2) {
        System.out.println("Patients with medical numbers in " + String.valueOf(num1) + " "
                + String.valueOf(num2));
        boolean finded = false;
        for (Iterator<Patient> it = ar.iterator(); it.hasNext();) {
            Patient p = it.next();
            if (p.getNum() >= num1 && p.getNum() <= num2) {
                System.out.println(p.toString());
                finded = true;
            }
        }
        if (!finded) {
            System.out.println("Patients with medical numbers in " + String.valueOf(num1) + " "
                    + String.valueOf(num2) + " not found");

        }
    }
}
