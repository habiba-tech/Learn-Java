class MethodOverloading {
    // method 1 sum of two integer
    public void sum (int a , int b ){
        System.out.println("Sum: " + (a+b));
    }
    // method 2 Square of number
    public void sum (int x){
        System.out.println("Square: "+ (x*x));
    }
    // method 3
    public void sum (char m, int n){
        System.out.println("char M:"+ m);
        System.out.println("Int N :" + n);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.sum(4,6);
        obj.sum(5);
        obj.sum('A',8);
    }
}

