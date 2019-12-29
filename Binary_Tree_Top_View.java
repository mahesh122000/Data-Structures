public static void topView(Node root) { 
    int a[] = new int[1000];
    Queue<Object[]> q = new ArrayDeque<>();
    q.add(new Object[]{root, 500});
    while(!q.isEmpty()) {
        Object[] array = q.remove();
        Node node = (Node)array[0];
        Integer order = (Integer)array[1];
        if(node == null) continue;

        if(a[order] == 0) a[order] = node.data;
        q.add(new Object[]{node.left, order-1});
        q.add(new Object[]{node.right, order+1});
    }

    for(int data: a) if(data != 0) System.out.print(data + " ");
}