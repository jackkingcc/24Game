package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by e604847 on 10/9/2018.
 */
public class Calculator {

    /*
    @n numbers of inputs
    @m max value of input
     */
    public List<String> calculate(int n, int m){
        List<Integer> inputs = new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            inputs.add(createRandom(m));
        }
        inputs.stream();
        List<String> res = calculate(inputs);
        return res;
    }
    public List<String> calculate(List<Integer> inputs){
        List<String> res = new ArrayList();
        return res;
    }

    private int createRandom(int m){
        Random random = new Random();
        return random.nextInt(m+1);
    }
}
