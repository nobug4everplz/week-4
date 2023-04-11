import java.util.*;

class animal{
    String name;
    double height;
    int weight;
    int speed;
    void show(){
        System.out.println("姓名："+this.name);
        System.out.println("身高："+this.height);
        System.out.println("體重："+this.weight);
        System.out.println("速度："+this.speed);
        System.out.println();
    }
    double distance(int x,double y){
        return x*y*this.speed;
    }
    int distance(int x){
        return x*this.speed;
    }
}

public class A1113351_0324_1 {
    public static void main(String[] argv){
        animal []animals = new animal [4];

        String []name = {"雪寶","驢子","安那","愛沙"};
        double []height = {1.1,1.5,1.7,1.7} ;
        int []weight = {52,99,48,50};
        int []speed = {100,200,120,120};

        for(int i = 0;i<4;i++){
            animals[i] = new animal();
            animals[i].name = name[i];
            animals[i].height = height[i];
            animals[i].weight = weight[i];
            animals[i].speed = speed[i];
            animals[i].show();
        }

        Scanner sc = new Scanner(System.in);
        
        for (animal a : animals){
            System.out.println("請輸入"+a.name+"的奔跑時間(x)");
            int x = sc.nextInt();
            System.out.println("請輸入"+a.name+"的加速度(y)。若無請輸入0");
            double y = sc.nextDouble();
            double dist;
            if (y>0)
                dist = a.distance(x,y);
            else
                dist = a.distance(x);
            System.out.println(a.name+"的奔跑距離為"+dist);
        }   
    }
}
