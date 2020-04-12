class Pair{
   int x;
   int y;
   public Pair(int x,int y)
   {
       this.x = x;
       this.y = y;
   }
}

class Solution
{
    int min_lights(int hallway[], int n)
    {
        List <Pair> lights = new ArrayList<>();
        for(int i=0; i<n; i++)
            if(hallway[i] > -1)
                lights.add( new Pair( i-hallway[i], i+hallway[i] ) );
        
        Collections.sort(lights, new Comparator<Pair>(){
            @Override
            public int compare(Pair p1,Pair p2)
            {
                return p1.x - p2.x;
            }
            
        });
        
        int target=0, lights_on=0, i=0;
        while(target<n)
        {
            if(i==lights.size() || lights.get(i).x>target)
                return -1;
            
            int max_range = lights.get(i).y;
            while( i+1<lights.size() && lights.get(i+1).x<=target )
            {
                i++;
                max_range = Math.max( max_range,  lights.get(i).y );
            }
            if(max_range<target)
                return -1;
            
            lights_on++;
            target = max_range +1;
            i++;
        }
        
        return lights_on;
    }



}