import com.sun.source.tree.WhileLoopTree;

// How to write for , while, do while loops
public class LoopDemo {
    public static void main(String[] args){
        for (int i=1; i<=5; i++){
            if(i==3) continue;
            System.out.print(i +"");
        }
        int j = 1;
        while(j <= 3){
            System.out.print("\n"+ j);
            j++;
        }
        int k = 1;
        do{
            System.out.print("\nDO: "+ k);
            k++;
        } while (k <=2);
    }
}

