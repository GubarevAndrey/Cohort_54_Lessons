package Nov_progi;

public class hod_konia {
    public static void main(String[] args) {
            System.out.print("Ходов="+knight("a1","f8"));
    }
    public static int knight(String start, String  finish) {
        int[][] Arr = {
                new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1},
                new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1},
                new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1},
                new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1},
                new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1},
                new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1},
                new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1},
                new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1},
                new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1},
        };
        String s_pervaya=" abcdefgh";
        int n1=0;
        int k1=0;
        int n2=0;
        int k2=0;
        int pos=0;
        int x=0;
        int y=0;
        String ch;
        int hod=0;
        boolean ex=false;
        ch=start.substring(0,1);
        pos=s_pervaya.indexOf(ch);
        n2=pos;
        ch=start.substring(1,2);
        n1=Integer.parseInt(ch);
        ch=finish.substring(0,1);
        pos=s_pervaya.indexOf(ch);
        k2=pos;
        ch=finish.substring(1,2);
        k1=Integer.parseInt(ch);
        Arr[n1][n2]=0;
        while (ex==false) {
            for (y=1; y<=8; y=y+1){
                for (x=1; x<=8; x=x+1) {
                    if (Arr[y][x]==hod) {
                        if ((y+1)==k1 && (x+2)==k2) {
                            ex=true;
                            return hod+1;
                        }
                        if (y<=7 && x<=6)  {
                            if (Arr[y+1][x+2]==-1) {
                                Arr[y + 1][x + 2] = hod + 1;
                            }
                        }


                        if ((y+2)==k1 && (x+1)==k2) {
                            ex=true;
                            return hod+1;
                        }
                        if (y<=6 && x<=7) {
                            if(Arr[y+2][x+1]==-1) {
                                Arr[y + 2][x + 1] = hod + 1;
                            }
                        }


                        if ((y+2)==k1 && (x-1)==k2) {
                            ex=true;
                            return hod+1;
                        }
                        if (y<=6 && x>=2) {
                            if (Arr[y+2][x-1]==-1) {
                                Arr[y + 2][x - 1] = hod + 1;
                            }
                        }


                        if ((y+1)==k1 && (x-2)==k2) {
                            ex=true;
                            return hod+1;
                        }
                        if (y<=7 && x>=3)  {
                            if (Arr[y+1][x-2]==-1) {
                                Arr[y + 1][x - 2] = hod + 1;//tut
                            }
                        }


                        if ((y-1)==k1 && (x-2)==k2) {
                            ex=true;
                            return hod+1;
                        }
                        if (y>=2 && x>=3) {
                            if (Arr[y-1][x-2]==-1) {
                                Arr[y - 1][x - 2] = hod + 1;
                            }
                        }


                        if ((y-2)==k1 && (x-1)==k2) {
                            ex=true;
                            return hod+1;
                        }
                        if (y>=3 && x>=2)  {
                            if (Arr[y-2][x-1]==-1) {
                                Arr[y - 2][x - 1] = hod + 1;
                            }
                        }


                        if ((y-2)==k1 && (x+1)==k2) {
                            ex=true;
                            return hod+1;
                        }
                        if (y>=3 && x<=7)  {
                            if ( Arr[y-2][x+1]==-1) {
                                Arr[y - 2][x + 1] = hod + 1;
                            }
                        }


                        if ((y-1)==k1 && (x+2)==k2) {
                            ex=true;
                            return hod+1;
                        }
                        if (y>=2 && x<=6) {
                            if(Arr[y-1][x+2]==-1) {
                                Arr[y - 1][x + 2] = hod + 1;
                            }
                        }

                    }
                }
            }
             hod=hod+1;
        }
        return hod+1;
    }
}
