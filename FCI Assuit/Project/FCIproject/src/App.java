import java.util.Scanner;
import java.util.ArrayList;
public class App {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Student>storeStudents = new ArrayList<Student>();
    private static ArrayList<Instructor>storeInstructor = new ArrayList<Instructor>();
    private static ArrayList<Administrator>storeAdministrators = new ArrayList<Administrator>();
    private static ArrayList<Technician>storeTechnicians = new ArrayList<Technician>();
    private static ArrayList<Worker>storeWorker = new ArrayList<Worker>();
    private static ArrayList<Building>storeBuilding = new ArrayList<Building>();
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        boolean flag = true;
        while(flag){
            System.out.println("1.Students\n2.Instructors\n3.Administrators");
            System.out.println("4.Technicians\n5.Worker\n6.Building");
            System.out.print("7.Log out\nAnswer : ");
            try {
                int ans = sc.nextInt();
                switch(ans){
                    case 1: {
                        student();
                        break;
                    }
                    case 2: {
                        Instructor();
                        break;
                    }
                    case 3: {
                        Administrator();
                        break;
                    }
                    case 4: {
                        Technician();
                        break;
                    }
                    case 5: {
                        Worker();
                        break;
                    }
                    case 6: {
                        Building();
                        break;
                    }
                    case 7: flag = false; break;
                    default: System.out.println("Out of range");
                }
            } catch(Exception e){
                System.out.println("Invalid Input");
                flag = false;
            }
        }
    }

    public static void student(){
        boolean flag = true;
        while(flag){
            System.out.println("Choose operation on Students");
            System.out.print("1.Add\n2.Delete\n3.Edit\n4.View\n5.Go back\nAnswer : ");
            try {
                int ans = sc.nextInt();
                switch(ans){
                    case 1: {
                        Student test = Student.addStudent();
                        if(test.getFirstName()!=null) storeStudents.add(test);
                        else test = null;
                        break;
                    }
                    case 2: {
                        try {
                            System.out.print("Enter Students' SSN : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeStudents.size(); i++){
                                if (storeStudents.get(i).getSSN().equals(ssn)) {
                                    storeStudents.remove(i);
                                    f = true;
                                    break;
                                }
                            }
                            if(f) System.out.println("Student removed");
                            else System.out.println("Student not found");
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 3: {
                        try {
                            System.out.print("Enter Students' SSN : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeStudents.size(); i++){
                                if (storeStudents.get(i).getSSN().equals(ssn)) {
                                    storeStudents.get(i).editStudent();
                                    f = true;
                                    break;
                                }
                            }
                            if(f) System.out.println("Student edited");
                            else System.out.println("Student not found");
                            break;
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 4: {
                        try {
                            System.out.print("Enter Students' SSN : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeStudents.size(); i++){
                                if (storeStudents.get(i).getSSN().equals(ssn)) {
                                    storeStudents.get(i).printDetails();
                                    f = true;
                                    break;
                                }
                            }
                            if(!f) System.out.println("Student not found");
                            break;
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 5: flag = false; break;
                    default: System.out.println("Out of range");
                }
            } catch(Exception e){
                System.out.println("Invalid Input");
                flag = false;
            }
        }
    }

    public static void Instructor(){
        boolean flag = true;
        while(flag){
            System.out.println("Choose operation on Instructor");
            System.out.print("1.Add\n2.Delete\n3.Edit\n4.View\n5.Go back\nAnswer : ");
            try {
                int ans = sc.nextInt();
                switch(ans){
                    case 1: {
                        Instructor test = Instructor.addInstructor();
                        if(test.getFirstName()!=null) storeInstructor.add(test);
                        else test = null;
                        break;
                    }
                    case 2: {
                        try {
                            System.out.print("Enter Instructor' SSN : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeInstructor.size(); i++){
                                if (storeInstructor.get(i).getSSN().equals(ssn)) {
                                    storeInstructor.remove(i);
                                    f = true;
                                    break;
                                }
                            }
                            if(f) System.out.println("Instructor removed");
                            else System.out.println("Instructor not found");
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 3: {
                        try {
                            System.out.print("Enter Instructor' SSN : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeInstructor.size(); i++){
                                if (storeInstructor.get(i).getSSN().equals(ssn)) {
                                    storeInstructor.get(i).editInstructor();
                                    f = true;
                                    break;
                                }
                            }
                            if(f) System.out.println("Instructor edited");
                            else System.out.println("Instructor not found");
                            break;
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 4: {
                        try {
                            System.out.print("Enter Instructor' SSN : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeInstructor.size(); i++){
                                if (storeInstructor.get(i).getSSN().equals(ssn)) {
                                    storeInstructor.get(i).printDetails();
                                    f = true;
                                    break;
                                }
                            }
                            if(!f) System.out.println("Instructor not found");
                            break;
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 5: flag = false; break;
                    default: System.out.println("Out of range");
                }
            } catch(Exception e){
                System.out.println("Invalid Input");
                flag = false;
            }
        }
    }

    public static void Administrator(){
        boolean flag = true;
        while(flag){
            System.out.println("Choose operation on Administrator");
            System.out.print("1.Add\n2.Delete\n3.Edit\n4.View\n5.Go back\nAnswer : ");
            try {
                int ans = sc.nextInt();
                switch(ans){
                    case 1: {
                        Administrator test = Administrator.addAdministrators();
                        if(test.getFirstName()!=null) storeAdministrators.add(test);
                        else test = null;
                        break;
                    }
                    case 2: {
                        try {
                            System.out.print("Enter Administrator' SSN : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeAdministrators.size(); i++){
                                if (storeAdministrators.get(i).getSSN().equals(ssn)) {
                                    storeAdministrators.remove(i);
                                    f = true;
                                    break;
                                }
                            }
                            if(f) System.out.println("Administrator removed");
                            else System.out.println("Administrator not found");
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 3: {
                        try {
                            System.out.print("Enter Administrator' SSN : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeAdministrators.size(); i++){
                                if (storeAdministrators.get(i).getSSN().equals(ssn)) {
                                    storeAdministrators.get(i).editAdministrators();
                                    f = true;
                                    break;
                                }
                            }
                            if(f) System.out.println("Administrator edited");
                            else System.out.println("Administrator not found");
                            break;
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 4: {
                        try {
                            System.out.print("Enter Administrator' SSN : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeAdministrators.size(); i++){
                                if (storeAdministrators.get(i).getSSN().equals(ssn)) {
                                    storeAdministrators.get(i).printDetails();
                                    f = true;
                                    break;
                                }
                            }
                            if(!f) System.out.println("Administrator not found");
                            break;
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 5: flag = false; break;
                    default: System.out.println("Out of range");
                }
            } catch(Exception e){
                System.out.println("Invalid Input");
                flag = false;
            }
        }
    }

    public static void Technician(){
        boolean flag = true;
        while(flag){
            System.out.println("Choose operation on Technician");
            System.out.print("1.Add\n2.Delete\n3.Edit\n4.View\n5.Go back\nAnswer : ");
            try {
                int ans = sc.nextInt();
                switch(ans){
                    case 1: {
                        Technician test = Technician.addTechnicians();
                        if(test.getFirstName()!=null) storeTechnicians.add(test);
                        else test = null;
                        break;
                    }
                    case 2: {
                        try {
                            System.out.print("Enter Technician' SSN : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeTechnicians.size(); i++){
                                if (storeTechnicians.get(i).getSSN().equals(ssn)) {
                                    storeTechnicians.remove(i);
                                    f = true;
                                    break;
                                }
                            }
                            if(f) System.out.println("Technician removed");
                            else System.out.println("Technician not found");
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 3: {
                        try {
                            System.out.print("Enter Technician' SSN : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeTechnicians.size(); i++){
                                if (storeTechnicians.get(i).getSSN().equals(ssn)) {
                                    storeTechnicians.get(i).editTechnicians();
                                    f = true;
                                    break;
                                }
                            }
                            if(f) System.out.println("Technician edited");
                            else System.out.println("Technician not found");
                            break;
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 4: {
                        try {
                            System.out.print("Enter Technician' SSN : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeTechnicians.size(); i++){
                                if (storeTechnicians.get(i).getSSN().equals(ssn)) {
                                    storeTechnicians.get(i).printDetails();
                                    f = true;
                                    break;
                                }
                            }
                            if(!f) System.out.println("Technician not found");
                            break;
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 5: flag = false; break;
                    default: System.out.println("Out of range");
                }
            } catch(Exception e){
                System.out.println("Invalid Input");
                flag = false;
            }
        }
    }

    public static void Worker(){
        boolean flag = true;
        while(flag){
            System.out.println("Choose operation on Worker");
            System.out.print("1.Add\n2.Delete\n3.Edit\n4.View\n5.Go back\nAnswer : ");
            try {
                int ans = sc.nextInt();
                switch(ans){
                    case 1: {
                        Worker test = Worker.addWorker();
                        if(test.getFirstName()!=null) storeWorker.add(test);
                        else test = null;
                        break;
                    }
                    case 2: {
                        try {
                            System.out.print("Enter Worker' SSN : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeWorker.size(); i++){
                                if (storeWorker.get(i).getSSN().equals(ssn)) {
                                    storeWorker.remove(i);
                                    f = true;
                                    break;
                                }
                            }
                            if(f) System.out.println("Worker removed");
                            else System.out.println("Worker not found");
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 3: {
                        try {
                            System.out.print("Enter Worker' SSN : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeWorker.size(); i++){
                                if (storeWorker.get(i).getSSN().equals(ssn)) {
                                    storeWorker.get(i).editWorker();
                                    f = true;
                                    break;
                                }
                            }
                            if(f) System.out.println("Worker edited");
                            else System.out.println("Worker not found");
                            break;
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 4: {
                        try {
                            System.out.print("Enter Worker' SSN : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeWorker.size(); i++){
                                if (storeWorker.get(i).getSSN().equals(ssn)) {
                                    storeWorker.get(i).printDetails();
                                    f = true;
                                    break;
                                }
                            }
                            if(!f) System.out.println("Worker not found");
                            break;
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 5: flag = false; break;
                    default: System.out.println("Out of range");
                }
            } catch(Exception e){
                System.out.println("Invalid Input");
                flag = false;
            }
        }
    }

    public static void Building(){
        boolean flag = true;
        while(flag){
            System.out.println("Choose operation on Building");
            System.out.print("1.Add\n2.Delete\n3.Edit\n4.View\n5.Go back\nAnswer : ");
            try {
                int ans = sc.nextInt();
                switch(ans){
                    case 1: {
                        Building test = Building.addBuilding();
                        if(test.getName()!=null) storeBuilding.add(test);
                        else test = null;
                        break;
                    }
                    case 2: {
                        try {
                            System.out.print("Enter Building' Name : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeBuilding.size(); i++){
                                if (storeBuilding.get(i).getName().equals(ssn)) {
                                    storeBuilding.remove(i);
                                    f = true;
                                    break;
                                }
                            }
                            if(f) System.out.println("Building removed");
                            else System.out.println("Building not found");
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 3: {
                        try {
                            System.out.print("Enter Building' Name : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeBuilding.size(); i++){
                                if (storeBuilding.get(i).getName().equals(ssn)) {
                                    storeBuilding.get(i).editBuilding();
                                    f = true;
                                    break;
                                }
                            }
                            if(f) System.out.println("Building edited");
                            else System.out.println("Building not found");
                            break;
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 4: {
                        try {
                            System.out.print("Enter Building' Name : ");
                            String ssn = sc.next();
                            boolean f = false;
                            for (int i = 0; i < storeBuilding.size(); i++){
                                if (storeBuilding.get(i).getName().equals(ssn)) {
                                    storeBuilding.get(i).printDetails();
                                    f = true;
                                    break;
                                }
                            }
                            if(!f) System.out.println("Building not found");
                            break;
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                        break;
                    }
                    case 5: flag = false; break;
                    default: System.out.println("Out of range");
                }
            } catch(Exception e){
                System.out.println("Invalid Input");
                flag = false;
            }
        }
    }
}