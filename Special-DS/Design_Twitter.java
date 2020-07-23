class Twitter {
    
    HashMap<Integer,HashSet<Integer>>hm;
    ArrayList<Integer>al;
    ArrayList<Integer>bl;
    
    /** Initialize your data structure here. */
    public Twitter() {
        hm=new HashMap<>();
        al=new ArrayList<>();
        bl=new ArrayList<>();;
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        al.add(userId);
        bl.add(tweetId);
        
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer>ans=new ArrayList<>();
        int i=0,j=al.size()-1;
        HashSet<Integer>hs=hm.get(userId);
        while(i<10 && j>=0)
        {
            if(al.get(j)==userId||(hs!=null &&hs.contains(al.get(j))))
            {
                ans.add(bl.get(j));
                i++;
            }
            j--;
        }
        return ans;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if(!hm.containsKey(followerId))
        {
            hm.put(followerId,new HashSet<>());
        }        
        hm.get(followerId).add(followeeId);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if(hm.containsKey(followerId))
        {
            hm.get(followerId).remove(followeeId);
        }  
    }
    
}

