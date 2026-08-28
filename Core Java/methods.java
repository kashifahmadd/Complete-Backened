public class methods {
    public static void main(String[] args) {
        methods m1 = new methods();// creating object of class because non-static methods need object
        methods m2 = new methods();
        m1.display(); // methpd calling type 1

        m1.displayName("Ahmad", "m1", 22); //type 2
        m2.displayName("Muskan", "m2" , 21); //type 2

        int result = m1.otpGenerate(); //type 3
        System.out.println(result);
        int results = m2.otpGenerate(); //type 3
        System.out.println(results);

        int res = m1.add(3,6); //type 4
        System.out.println(res);

        int result3 = m1.adds(4,9);
        System.out.println(result3);
    }
    // 1. without parameter, no return
    public void display(){ //method creation
        System.out.println("Kashif Ahmad");
    }

    //2.  with parameter, no return
    public void displayName(String name, String method, int age){
        System.out.println("Name: " + name + " " + method + " " + age);
    }

    //3. No parameters, return
    public int otpGenerate(){
        return 8723423;
    }

    // with parameter and return
    public int add(int a, int b){
        return a + b;
    }
    public static int adds(int num, int num2){
//        int sum = num + num2;
//        System.out.println(sum);

          return num + num2;
    }
}
