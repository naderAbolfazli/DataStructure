package ir.maktab;

/**
 * Created by Nader on 12/29/2017.
 */
public class Main {
    public static void main(String[] args) {
//        BST<Integer> bst = new BST<>();
//        bst.add(5);
//        bst.add(2);
//        bst.add(3);
//        bst.add(7);
//        bst.add(1);
//        bst.add(4);
//        bst.add(9);
//        bst.add(6);
//
//        System.out.println(bst.contains(1));
//        System.out.println(System.lineSeparator());
//        bst.clear();
//        System.out.println(bst.size());
        //bst.preorderTraverse(bst.root);

        Stack<Integer> stack = new Stack<>(8);
        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.push(1);
        stack.push(4);
        stack.push(9);
        stack.push(6);

        System.out.println(stack.pop());

    }
}
