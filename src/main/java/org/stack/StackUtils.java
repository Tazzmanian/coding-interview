package org.stack;

import org.apache.commons.lang3.StringUtils;

import java.util.Stack;

public interface StackUtils {

    static boolean isBalanced(String str) {
        if (StringUtils.isAllBlank(str) || str.length() < 2)
            return false;

        Stack<Character> stack = new Stack<>();
        for (var ch : str.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[' ) {
                stack.push(ch);
                continue;
            }

            var c = stack.empty() ? '0' : stack.peek();

            if (ch == '}' &&  c == '{' ||
                    ch == ']' && c == '[' ||
                    ch == ')' && c == '(') {
                stack.pop();
            } else {
                System.out.println("Skip: " + ch);
            }
        }

        return stack.empty();
    }
}
