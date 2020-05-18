package com.exercices.load;

import java.util.List;

public class LoadApplication
{
    public boolean itCanBeBalanced(List<Integer> request)
    {
        if (request.size() < 5) {
            return false;
        }

        for (int i = 1; i < request.size()-3; i++) {
            int workerOne = request.subList(0,i).stream().mapToInt(Integer::intValue).sum();
            for(int j = i+2; j < request.size()-1; j++) {
                int workerTwo = request.subList(i+1, j).stream().mapToInt(Integer::intValue).sum();
                int workerThree = request.subList(j+1, request.size()).stream().mapToInt(Integer::intValue).sum();

                if (workerOne < workerTwo || workerThree < workerTwo || workerOne > workerThree) {
                    break;
                }

                if (workerOne == workerTwo && workerThree == workerOne) {
                    return true;
                }
            }
        }

        return false;
    }
}