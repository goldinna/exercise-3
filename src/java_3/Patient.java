package java_3;

public class Patient {

    private int id, num;
    private String surname, name, sname, address, phone, diagnosis;

    public Patient(int id, int num, String sur, String name, String sname, String address, String phone, String diag) {
        this.id = id;
        this.address = address;
        this.diagnosis = diag;
        this.name = name;
        this.num = num;
        this.phone = phone;
        this.sname = sname;
        this.surname = sur;
    }

    public Patient() {
        id = num = 0;
        surname = name = sname = address = phone = diagnosis = "";
    }

    @Override
    public String toString() {
        return String.valueOf(id) + " " + surname + " " + name + " " + sname + " " + address + " "
                + phone + " " + String.valueOf(num) + " " + diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getNum() {
        return num;
    }
}
