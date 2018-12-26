class Solution {
    // by using stack to solve
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] parentheses = s.toCharArray();
        for (int i = 0; i < parentheses.length; i++) {
            // traverse the whole char array;
            if (parentheses[i] == '(' || parentheses[i] == '[' || parentheses[i] == '{') {
                // push to stack if opening parentheses;
                stack.push(parentheses[i]);
            } else {
                if (stack.empty()) {
                    // edge case: start by closing ones;
                    return false;
                }
                char to_compare = stack.peek();
                if (to_compare == '(' && parentheses[i] == ')' || to_compare == '[' && parentheses[i] == ']' || to_compare == '{' && parentheses[i] == '}') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return (stack.empty());

    }
}