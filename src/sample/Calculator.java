package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Calculator {

    /*
    @n numbers of inputs
    @m max value of input
     */
    public List<String> calculate(int n, int m){
        List<String> res=null;
        boolean isValid=false;
        while(!isValid) {
            List<Integer> inputs = createRandom(n,m);
            inputs.sort((i1, i2) -> i1 - i2);
            res = calculate(inputs);
            if(res.size()!=0) isValid=true;
        }
        return res;
    }

    public List<String> calculate(List<Integer> inputs){
        List<String> resultArr = new ArrayList();
        List<List<Integer>> inputsList = buildInputs(inputs);
        for(int i=0;i<inputsList.size();i++) {
            inputs = inputsList.get(i);
            int i1 =inputs.get(0);
            int i2 =inputs.get(1);
            int i3 =inputs.get(2);
            int i4 =inputs.get(3);
            double x = inputs.get(0);
            double y = inputs.get(1);
            double z = inputs.get(2);
            double w = inputs.get(3);
            if (x + y + z + w == 24) {
                String aResult = i1 + "+" + i2 + "+" + i3 + "+" + i4;
                resultArr.add(aResult);
            } else if (x + y + z - w == 24) {
                String aResult = i1 + "+" + i2 + "+" + i3 + "-" + i4;
                resultArr.add(aResult);
            } else if ((x + y) * (z + w) == 24) {
                String aResult = "(" + i1 + "+" + i2 + ")*(" + i3 + "+" + i4 + ")";
                resultArr.add(aResult);
            } else if ((x - y) * (z + w) == 24) {
                String aResult = "(" + i1 + "-" + i2 + ")*(" + i3 + "+" + i4 + ")";
                resultArr.add(aResult);
            } else if ((x - y) * (z - w) == 24) {
                String aResult = "(" + i1 + "-" + i2 + ")*(" + i3 + "-" + i4 + ")";
                resultArr.add(aResult);
            } else if ((x + y + z) * w == 24) {
                String aResult = "(" + i1 + "+" + i2 + "+" + i3 + ")*" + i4;
                resultArr.add(aResult);
            } else if ((x - y - z) * w == 24) {
                String aResult = "(" + i1 + "-" + i2 + "-" + i3 + ")*" + i4;
                resultArr.add(aResult);
            } else if ((x + y - z) * w == 24) {
                String aResult = "(" + i1 + "+" + i2 + "-" + i3 + ")*" + i4;
                resultArr.add(aResult);
            } else if ((x * y * z) / w == 24) {
                String aResult = "(" + i1 + "*" + i2 + "*" + i3 + ")/" + i4;
                resultArr.add(aResult);
            } else if (x * y * (z + w) == 24) {
                String aResult = "(" + i1 + "*" + i2 + ")*(" + i3 + "+" + i4 + ")";
                resultArr.add(aResult);
            } else if (x * y * (z - w) == 24) {
                String aResult = "(" + i1 + "*" + i2 + ")*(" + i3 + "-" + i4 + ")";
                resultArr.add(aResult);
            } else if (x * y * z - w == 24) {
                String aResult = "(" + i1 + "*" + i2 + ")*(" + i3 + ")-" + i4;
                resultArr.add(aResult);
            } else if (x * y * z + w == 24) {
                String aResult = "(" + i1 + "*" + i2 + ")*(" + i3 + ")+" + i4;
                resultArr.add(aResult);
            } else if (x * y * z * w == 24) {
                String aResult = i1 + "*" + i2 + "*" + i3 + "*" + i4;
                resultArr.add(aResult);
            } else if ((x + y) + (z / w) == 24) {
                String aResult = "(" + i1 + "+" + i2 + ")+(" + i3 + "/" + i4 + ")";
                resultArr.add(aResult);
            } else if ((x + y) * (z / w) == 24) {
                String aResult = "(" + i1 + "+" + i2 + ")*(" + i3 + "/" + i4 + ")";
                resultArr.add(aResult);
            } else if (x * y + z + w == 24) {
                String aResult = "(" + i1 + "*" + i2 + ")+" + i3 + "+" + i4;
                resultArr.add(aResult);
            } else if (x * y + z - w == 24) {
                String aResult = "(" + i1 + "*" + i2 + ")+" + i3 + "-" + i4;
                resultArr.add(aResult);
            } else if (x * y - (z / w) == 24) {
                String aResult = "(" + i1 + "*" + i2 + ")-(" + i3 + "/" + i4 + ")";
                resultArr.add(aResult);
            } else if (x * y + (z / w) == 24) {
                String aResult = "(" + i1 + "*" + i2 + ")-(" + i3 + "/" + i4 + ")";
                resultArr.add(aResult);
            } else if (x * y - z - w == 24) {
                String aResult = "(" + i1 + "*" + i2 + ")-" + i3 + "-" + i4;
                resultArr.add(aResult);
            } else if (x * y + (z * w) == 24) {
                String aResult = "(" + i1 + "*" + i2 + ")+(" + i3 + "*" + i4 + ")";
                resultArr.add(aResult);
            } else if (x * y - (z * w) == 24) {
                String aResult = "(" + i1 + "*" + i2 + ")-(" + i3 + "*" + i4 + ")";
                resultArr.add(aResult);
            } else if (x * y / (z * w) == 24) {
                String aResult = "(" + i1 + "*" + i2 + ")/(" + i3 + "*" + i4 + ")";
                resultArr.add(aResult);
            } else if ((z - w) != 0 && x * y / (z - w) == 24) {
                String aResult = "(" + i1 + "*" + i2 + ")/(" + i3 + "-" + i4 + ")";
                resultArr.add(aResult);
            } else if (x * y / (z + w) == 24) {
                String aResult = "(" + i1 + "*" + i2 + ")/(" + i3 + "+" + i4 + ")";
                resultArr.add(aResult);
            }
        }
        return resultArr;
    }

    private List<List<Integer>> buildInputs(List<Integer> inputs) {
        List<List<Integer>> inputsList = new ArrayList<>();
        for(int i=0;i<inputs.size();i++){
            for(int j=0;j<inputs.size();j++){
                for(int k=0;k<inputs.size();k++){
                    for(int p=0;p<inputs.size();p++){
                        if(i!=j && i!=k && i!=p && j!=k && j!=p && k!=p){
                            List<Integer> newList = new ArrayList<>();
                            newList.add(inputs.get(i));
                            newList.add(inputs.get(j));
                            newList.add(inputs.get(k));
                            newList.add(inputs.get(p));
                            if(!inputsList.contains(newList))
                                inputsList.add(newList);
                        }
                    }
                }
            }
        }
        return inputsList;
    }

    public List<Integer> createRandom(int n, int m){
        List<Integer> res=new ArrayList<>(n);
        Random random = new Random();
        for(int i=0;i<n;i++) {
             res.add(random.nextInt(m) + 1);
        }
        return res;
    }
}
