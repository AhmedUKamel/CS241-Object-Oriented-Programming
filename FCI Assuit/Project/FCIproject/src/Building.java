import java.util.Scanner;
public class Building {
    private static Scanner sc = new Scanner(System.in);
    private String name;
    private int stands;
    private int labs;
    private int offices;
    private static int no_of_buildings;

    // Constructors
    public Building(){
        no_of_buildings++;
    };
    
    public Building(String n, int s, int l, int o){
        this.name = n;
        this.stands = s;
        this.labs = l;
        this.offices = o;
        no_of_buildings++;
    }

    // Setters
    public void setName(String n){
        this.name = n;
    }

    public void setStands(int s){
        this.stands = s;
    }

    public void setLabs(int l){
        this.labs = l;
    }

    public void setOffices(int o){
        this.offices = o;
    }

    // Getters
    public String getName(){
        return this.name;
    }

    public int getStands(){
        return this.stands;
    }

    public int getLabs(){
        return this.labs;
    }

    public int getOffices(){
        return this.offices;
    }

    // Other Methods
    public String toString(){
        return  "Building Name : " + this.name +
                "\nBuilding Number : " + this.no_of_buildings + 
                "\nBuilding has : \n" +
                this.stands + " Stands\n" +
                this.labs + " Labs\n" + 
                this.offices + " Offices";
    }

    public void printDetails(){
        System.out.println(this.toString());
    }

    public static Building addBuilding(){
        Building b = new Building();
        try {
            System.out.print("Enter building's Name : ");
            b.setName(sc.next());
            System.out.print("Enter building's Stands Number : ");
            b.setStands(sc.nextInt());
            System.out.print("Enter building's Labs Number : ");
            b.setLabs(sc.nextInt());
            System.out.print("Enter building's Offices Number : ");
            b.setOffices(sc.nextInt());
            return b;
        } catch (Exception e){
            System.out.println("Invalid input.");
            return new Building();
        }
    }

    public void editBuilding(){
        boolean flag = true;
        while(flag){
            System.out.println("Choose attribute to edit for " + this.getName());
            System.out.println("1.Name\n2.Stands Number\n3.Labs Number");
            System.out.print("4.Offices Number\n5.Go back\nAnswer : ");
            try {
                int ans = sc.nextInt();
                switch(ans){
                    case 1: System.out.print("Enter new Name : "); this.setName(sc.next()); break;
                    case 2: System.out.print("Enter new Stands Number : "); this.setStands(sc.nextInt()); break;
                    case 3: System.out.print("Enter new Labs Number : "); this.setLabs(sc.nextInt()); break; 
                    case 4: System.out.print("Enter new Offices Number : "); this.setOffices(sc.nextInt()); break;
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