package server.model;

import java.util.ArrayList;

public class PatientsDB {

    public PatientsDB(){
    }

    public boolean createPatients (Patients patients){

        return patients != null;
    }

    public boolean updatePatients (Patients patients){

        return patients != null;
    }

    public Patients consultPatients (Patients patients){
        return patients;
    }
    
    public ArrayList<Patients> listPatients (){
        ArrayList<Patients> listPatients= new ArrayList<>();
        
        return listPatients;
    }

}
