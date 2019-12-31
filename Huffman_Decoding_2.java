class Decode
{
    static String decodeHuffmanData(MinHeapNode root, String s)
    {
        String c="";
        MinHeapNode temp=root;
        for(int i=0;i<s.length();i++)
        {if(s.charAt(i)=='0')
        {root=root.left;
            if(root.left==null && root.right==null)
            {c=c+String.valueOf(root.data);
                root=temp;
            }
        }
        else
        {root=root.right;
            if(root.left==null && root.right==null)
            {c=c+String.valueOf(root.data);
                root=temp;
            }
        }}
        return c;
    }
}
