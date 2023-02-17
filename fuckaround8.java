import java.util.ArrayList;

public class fuckaround8 {
    public static void main(String[] args) {
        /*ArrayList<Integer> list = fillData();*/
    }
}
class SLL<T>{
    private class SLLNode<T>{
        private T info ;
        private SLLNode <T> next;
        public SLLNode(){
            info = null;
            next = null;
        }
        public SLLNode(T elem){
            info = elem;
            next = null;
        }
        public SLLNode(T e , SLLNode<T> ptr){
            info = e;
            next = ptr;
        }

    }
}
