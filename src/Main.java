import employees.Chef;
import employees.Staff;

public class Main {

    public static void main (String[] args) {

        Staff emp1 = new Staff(1, "Mohamed", 1500.0);

        Menu item1 = new Menu("pizza", 199.99);
        Menu item2 = new Menu("pasta", 150.0);
        Menu item3 = new Menu("chicken burger", 170.0);
        Menu item4 = new Menu("beef burger", 200.0);

        String [] chefQualifications = {"Pastry employees.Chef Diploma", "Advanced Baking Techniques"};
        Chef chef1 = new Chef(1, "Ahmed", chefQualifications, 3000.0);

        String [] chef2Qualifications = {"Nutrition and Dietetics", "Sushi Making"};
        Chef chef2 = new Chef(2, "Omar", chef2Qualifications, 3500.0);

        emp1.setName("Ali");
        emp1.setStaffId(2);
        emp1.setSalary(2500.0);
        System.out.println(emp1.getName());
        System.out.println(emp1.getStaffId());
        System.out.println(emp1.getSalary());

        System.out.println("");

        System.out.println(chef1.getName());
        System.out.println("Chef qualifications: ");
        String [] qualifications = chef1.getQualifications();
        for (String ele : qualifications){
            System.out.println(ele);
        }

        System.out.println("");

        System.out.println(item1.getTitle() + ", price is : " + item1.getPrice());
        item2.setTitle("donates");
        item2.setPrice(75.0);
        System.out.println(item2.getTitle() + ", price is : " + item2.getPrice());

    }

}
