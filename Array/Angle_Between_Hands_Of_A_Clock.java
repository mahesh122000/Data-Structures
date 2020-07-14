public double angleClock(int h, int m) {
        if(h==12)
            h=0;
        if(m==60)
        {
            m=0;
            h+=1;
            if(h>12)
                h=h-12;
        }
        double hangle=(0.5*(h*60+m));
        double mangle=6*m;
        double angle=Math.abs(hangle-mangle);
        angle=Math.min(angle,360-angle);
        return angle;
    }