package com.mrrightli.test;

import com.mrrightli.algs.Stack;

public class Evaluate {
    public static void main(String[] args) {

        String pol = "(1+((2+3)*(4*5)))";
        char polynomial[] = pol.toCharArray();

        Stack<Double> vals = new Stack<Double>();
        Stack<String> ops = new Stack<>();
        for (int i = 0; i < polynomial.length; i++) {
            String s = String.valueOf(polynomial[i]);
            if (s.equals("("));
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                Double v = vals.pop();
                String op = ops.pop();
                if (op.equals("+")) v = v + vals.pop();
                if (op.equals("-")) v = v - vals.pop();
                if (op.equals("*")) v = v * vals.pop();
                if (op.equals("/")) v = v / vals.pop();
                if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            }
            else vals.push(Double.parseDouble(s));
        }
        System.out.println(vals.pop());
    }
}
