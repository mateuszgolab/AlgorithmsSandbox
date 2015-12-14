package com.codility;

import java.util.List;
import java.util.Stack;

/**
 * Created by mgo12 on 10/10/2015.
 */
public class Leader {

    public static int findLeader(List<Integer> list) {
        Stack<Integer> stack = new Stack<Integer>();
        for(Integer i : list) {
            if(stack.empty()) {
                stack.push(i);
            } else {
                if(i.equals(stack.peek())) {
                    stack.push(i);
                } else {
                    stack.pop();
                }
            }
        }

        if(stack.empty()) return -1;

        Integer candidate = stack.pop();
        int count = 0;
        for(Integer i : list) {
            if(i.equals(candidate)) {
                count++;
            }
        }

        if(count > (list.size() / 2)) {
            return candidate;
        }

        return -1;

    }

}
