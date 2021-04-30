public class BSTree<T extends Comparable <T>> implements Tree<T>{
    protected Node<T> root;

    public void add(T item) {
        
        
    }

    public boolean contains(T item) {
        
        return false;
    }

    public int size() {
        
        return 0;
    }

    public void inOrderPrint() {

        
    }

    class Node<T> {
		//------- data
		protected T data;
		protected Node<T> left;
		protected Node<T> right;

		//------- constructors
		public Node(T theData) {
			this.data = theData;
			left = null;
			right = null;
		}

        public void add(T item) {
            Node<T> temp = new Node<T>(item);

            
        }

	}	 
	
}
