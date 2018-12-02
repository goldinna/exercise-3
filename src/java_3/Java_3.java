package java_3;

public class Java_3 {

    public static void main(String[] args) {
        Array patients = new Array();
        patients.add(new Patient(1, 2, "Ivanov", "Ivan", "Ivanovich", "Vitebsk", "123-123-5", "gripp"));
        patients.add(new Patient(2, 5, "Petrov", "Petr", "Petrovich", "Kiev", "5645-123-5", "rak"));
        patients.add(new Patient(56, 23, "Alekseev", "Aleksei", "Ivanovich", "Moscow", "457-56-77", "gripp"));
        
        patients.print();
        patients.findByDiagnosis("gripp");
        patients.findByNum(1, 13);
        
        patients.findByDiagnosis("test");
        patients.findByNum(200, 300);
    }

}
