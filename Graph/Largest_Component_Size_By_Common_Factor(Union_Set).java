public int largestComponentSize(int[] A) {
        if(A == null || A.length == 0) return 0;
        int max = A[0];
        for(int num : A) max = Math.max(max,num);
        int[] roots = new int[max + 1];
         //init
        for(int i = 1; i< roots.length;i++){
            roots[i] = i;
        }
        for(int num : A){
            for(int factor = (int)Math.sqrt(num); factor >= 2 ;factor--){
                if(num % factor ==0){
                    roots[find(roots,num)] = roots[find(roots, factor)];
                    roots[find(roots,num)] = roots[find(roots, num / factor)];
                }
            }
        }
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(int num : A){
            int ancestor = find(roots,num);
            map.put(ancestor,map.getOrDefault(ancestor,0) + 1);
            res = Math.max(res, map.get(ancestor));
        }
        return res;
    }
    private int find(int[] roots, int num){
        return roots[num]==num ? num : (roots[num]=find(roots,roots[num])) ;
    }