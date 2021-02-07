

import java.util.*;
import java.io.*;

class Main {
   

    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[][]=new int[n][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        Arrays.sort(a,(p,q)->p[1]==q[1]?p[0]-q[0]:p[1]-q[1]);
        int m=s.nextInt();
        int c=1;
        int st=a[0][1];
        int en=st+a[0][2];
        int ans=0;
        PriorityQueue<int[]>pq=new PriorityQueue<>((p,q)->p[0]==q[0]?p[1]-q[1]:p[0]-q[0]);
        int y[]=new int[3];
        int max=0,ind=0;
        y[0]=en;
        y[1]=c;
        y[2]=1;
        if(a[0][0]==m)
            ans=c;
        pq.add(y);
        max=1;
        ind=1;
        for(int i=1;i<n;i++)
        {
            st=a[i][1];
            en=st+a[i][2];
            int x[]=pq.peek();
            if(x[0]<st)
            {
                pq.poll();
                x[0]=en;
                x[2]++;
                if(x[2]>max)
                {
                    max=x[2];
                    ind=x[1];
                }
                if(a[i][0]==m)
                {
                    ans=x[1];
                }
                pq.add(x);
            }
            else
            {
                c++;
                int z[]=new int[3];
                z[0]=en;
                z[1]=c;
                z[2]=1;
                if(z[2]>max)
                {
                    max=z[2];
                    ind=z[1];
                }
                if(a[i][0]==m)
                {
                    ans=z[1];
                }
                pq.add(z);
            }
        }
        System.out.println(ans);
        ArrayList<Integer>al=new ArrayList<>();
        while(!pq.isEmpty())
        {
            int x[]=pq.poll();
            if(x[2]==max)
            {
                al.add(x[1]);
            }
        }
        Collections.sort(al);
        for(int i:al)
        System.out.println(i);
    }
}
  
  
  
/*
Station master of Codington railway station is working on automation of trains to platform allocation. This allocation will not only prevent manual errors but also bring about a consistency in train to platform allocation. This will improve the passenger experience. Your job is to help the station master achieve the objectives.

The data and the rules that need to be considered for this automation are as follows-

     Codington is a large railway junction. Hence assume that there is always a platform at which the incoming train can be accommodated (infinitely many platforms). However, operating using a less number of platforms is economical and hence preferred.
      Safety is of paramount importance. Hence, safety cannot be traded off for cost. For example, if Train A's departure time is x and Train B's arrival time is x, then we can't accommodate Train B on the same platform as Train A.
    The trains to platforms allocation rules are as follows-
o   The platform which is being freed earlier has to be considered earlier for allocation to the next train. For example, if platform #2 is freed at t=5 and platform #1 is freed at t=6, in that case the next train arriving at t=7 will arrive at platform #2.

o   If two or more platforms are freed at the same time, then the train arrives on the platform with the lowest number. For example, if platform #1 and #2 are freed at t=5 and the train is arriving at time t=6, then the train needs to arrive at platform #1.

o   If two or more trains are arriving at the same time then above two rules should be applied first for a train with smaller train number. This train's allocation will be decided first and the next qualified platform will be allocated to the other train. For example, consider the table below

*/
  