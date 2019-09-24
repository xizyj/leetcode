import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String args[]){
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> row=new ArrayList<>();
        if(numRows==0){
            return res;
        }
        row.add(1);
        res.add(row);
        if(numRows==1){
            return res;
        }
        row=new ArrayList<>();
        row.add(1);
        row.add(1);
        res.add(row);
        if(numRows==2){
            return res;
        }
        List<Integer> rowNext;
        for(int i=2;i<numRows;i++){
            rowNext=new ArrayList<>();
            rowNext.add(1);
            for(int j=1;j<i;j++){
                rowNext.add(row.get(j-1)+row.get(j));
            }
            rowNext.add(1);
            res.add(rowNext);
            row=rowNext;
            rowNext=null;
        }
        return res;
    }


}
