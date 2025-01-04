//==============================================================================
//Programmed by: Vargas, John Lloyd E.
//Section: BSIT 11B
//Purpose: Task Performance
//Date: 12/14/23
//==============================================================================
package taskperf;

import java.util.Scanner;

public class TaskPerf {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name1 = "", name2 = "", name3 = "", selectedName = "";
        int selection = 0;

        System.out.println("Enter three first name:");
        name1 = in.next();
        name2 = in.next();
        name3 = in.next();

        System.out.println("Possible names are:");
        System.out.println("1 - " + name1 + " " + name2);
        System.out.println("2 - " + name1 + " " + name3);
        System.out.println("3 - " + name2 + " " + name1);
        System.out.println("4 - " + name2 + " " + name3);
        System.out.println("5 - " + name3 + " " + name1);
        System.out.println("6 - " + name3 + " " + name2);

        System.out.print("Enter 1-6 to select a name: ");
        selection = in.nextInt();
        switch (selection) {
            case 1:
                selectedName = name1.concat(" " + name2);
                break;
            case 2:
                selectedName = name1.concat(" " + name3);
                break;
            case 3:
                selectedName = name2.concat(" " + name1);
                break;
            case 4:
                selectedName = name2.concat(" " + name3);
                break;
            case 5:
                selectedName = name3.concat(" " + name1);
                break;
            case 6:
                selectedName = name3.concat(" " + name2);
                break;
        }
        if (selectedName != "") {
            System.out.print("The initial for " + selectedName + " is ");
            for (int i = 0; i < selectedName.length(); i++) {
                if (selectedName.charAt(i) == ' ') {
                    System.out.print(selectedName.charAt(0));
                    System.out.println(selectedName.charAt(i + 1) + ".");
                    break;
                }
            }
            System.out.println("Suggested username: "
                    + selectedName.toLowerCase().replace(' ', '_'));
        }

    }
}
