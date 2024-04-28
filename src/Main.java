/**
 * @author：JIANG YU
 * @DATE:2024/4/28
 */
public class Main {
    public static double calculatePrice(int appleAmount, int strawberryAmount) {
        if(appleAmount < 0 || strawberryAmount < 0) {
            System.out.println("输入错误，请重新输入！！！");
            return -1;
        }

        int applePrice = 8;
        int strawberryPrice = 13;

        double totalPrice = appleAmount * applePrice + strawberryAmount * strawberryPrice;

        return totalPrice;
    }

    public static double calculatePrice2(int appleAmount, int strawberryAmount, int mangoAmount) {
        if(appleAmount < 0 || strawberryAmount < 0 || mangoAmount < 0) {
            System.out.println("输入错误，请重新输入！！！");
            return -1;
        }

        int applePrice = 8;
        int strawberryPrice = 13;
        int mangoPrice = 20;

        double totalPrice = appleAmount * applePrice + strawberryAmount * strawberryPrice + mangoAmount*mangoPrice;

        return totalPrice;
    }

    public static double calculatePrice3(int appleAmount, int strawberryAmount, int mangoAmount) {
        if(appleAmount < 0 || strawberryAmount < 0 || mangoAmount < 0) {
            System.out.println("输入错误，请重新输入！！！");
            return -1;
        }

        int applePrice = 8;
        int strawberryPrice = 13;
        int mangoPrice = 20;

        // 草莓打 8 折
        double discount = 0.8;

        double totalPrice = appleAmount * applePrice + strawberryAmount * strawberryPrice * discount + mangoAmount*mangoPrice;

        return totalPrice;
    }

    public static double calculatePrice4(int appleAmount, int strawberryAmount, int mangoAmount) {
        if(appleAmount < 0 || strawberryAmount < 0 || mangoAmount < 0) {
            System.out.println("输入错误，请重新输入！！！");
            return -1;
        }

        int applePrice = 8;
        int strawberryPrice = 13;
        int mangoPrice = 20;

        // 草莓打 8 折
        double discount = 0.8;

        double totalPrice = appleAmount * applePrice + strawberryAmount * strawberryPrice * discount + mangoAmount*mangoPrice;

        if(totalPrice >= 100){
            totalPrice -= 10 * (int)(totalPrice/100);
        }

        return totalPrice;
    }

    public static void main(String[] args) {
        System.out.println(calculatePrice(2, 3));  // 输出：55
        System.out.println(calculatePrice(0, 5));  // 输出：65
        System.out.println(calculatePrice(3, -1));  // 输出：输入不合法
        System.out.println(calculatePrice2(2, 3, 1));  // 输出：75
        System.out.println(calculatePrice2(0, 5, 2));  // 输出：105
        System.out.println(calculatePrice2(3, -1, 4));  // 输出：输入不合法
        System.out.println(calculatePrice3(2, 3, 1));  // 输出：67.2
        System.out.println(calculatePrice3(0, 5, 2));  // 输出：92
        System.out.println(calculatePrice3(3, -1, 4));  // 输出：输入不合法
        System.out.println(calculatePrice4(20, 3, 1));  // 输出：191.2
        System.out.println(calculatePrice4(0, 5, 2));  // 输出：92
        System.out.println(calculatePrice4(3, -1, 4));  // 输出：输入不合法
    }

}