package P0055;

import java.util.HashMap;

public class DoctorHash {
    private HashMap<String, Doctor> doctors = new HashMap<>();

    //Add Doctor
    public boolean addDoctor (Doctor doctor) throws Exception{
        if(doctor == null) throw new Exception("Data does not exist");
        if(doctors == null) throw new Exception("Database does not exist");
        if(doctors.containsKey(doctor.getCode())) throw new Exception("Doctor code" + doctor.getCode() + "is duplicate");

        doctors.put(doctor.getCode(), doctor);
        return true;
    }
    //Update Doctor
    public boolean updateDoctor (Doctor doctor) throws Exception{
        if(doctors == null)  throw new Exception("Database does not exist");
        if(doctor == null) throw new Exception("Data does not exist");
        if(!doctors.containsValue(doctor.getCode())) throw new Exception();

        Doctor existingDoctor = doctors.get(doctor.getCode());
        if(!doctor.getName().isEmpty()) existingDoctor.setName(doctor.getName());
        if(!doctor.getSpecialization().isEmpty()) existingDoctor.setSpecialization(doctor.getSpecialization());
        if(doctor.getAvailability() >= 0) existingDoctor.setAvailability(doctor.getAvailability());


        return true;

    }
    //Delete Doctor
    public boolean deleteDoctor(String code) throws Exception {
        if (doctors == null) throw new Exception("Database does not exist");
        if (!doctors.containsKey(code)) throw new Exception("Doctor code doesn’t exist");

        doctors.remove(code);
        return true;
    }

    public HashMap<String, Doctor> searchDoctor(String input) throws Exception {
        if (doctors == null) throw new Exception("Database does not exist");

        HashMap<String, Doctor> result = new HashMap<>();
        for (Doctor doctor : doctors.values()) {
            if (doctor.getCode().contains(input) || doctor.getName().contains(input) ||
                    doctor.getSpecialization().contains(input)) {
                result.put(doctor.getCode(), doctor);
            }
        }
        return result;
    }

    public void displayDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
        } else {
            for (Doctor doctor : doctors.values()) {
                System.out.println(doctor);
            }
        }
    }


}
