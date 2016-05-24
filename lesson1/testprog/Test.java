// You can use this program to run experiments
// 1. Add statements inside main
// 2. Compile 
// 3. Right-click on the Test rectangle and select main
// 4. Click Ok on the next dialog
// 5. The output is displayed in a terminal window

public class Test
{
    public static void main(String[] args)
    {
        // Add something inside the ( )
        int gas = 4;
        int miles = 50000;
        int price1 = 15000;
        int mpg1 = 10;
        int price2 = 30000;
        int mpg2 = 50;
        int cost1 = 0;
        int cost2 = 0;
        cost1 = price1 + ((miles/mpg1)*gas);
        cost2 = price2 + ((miles/mpg2)*gas);
        if (cost1 < cost2) {
            System.out.println("Buy car 1");
        } else {
            System.out.println("Buy car 2" +" "+ cost1 +" "+ cost2);
        }
        // Add more statements below, as needed
    }
}
