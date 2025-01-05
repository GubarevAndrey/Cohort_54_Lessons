package Nov_progi;

class hod_peshki {

//https://www.codewars.com/kata/56b012bbee8829c4ea00002c/train/java
    public static void main(String[] args) {
        String [] s= new String[] {};
        int q=movePawns(s).length;
        if (q>1) {
            for (int i = 0; i < q; i = i + 1) {
                for (int i1 = 0; i1 < q; i1 = i1 + 1) {
                    System.out.print(movePawns(s)[i][i1] + " ,");
                }
                System.out.println();
            }
        } else {
            System.out.print(movePawns(s)[0][0] + " ,");
        }
    }
    public static String[][] movePawns(String[] moves) {
        String [][] arr =  {
            new String[] {".",".",".",".",".",".",".","."},
            new String[] {"p","p","p","p","p","p","p","p"},
            new String[] {".",".",".",".",".",".",".","."},
            new String[] {".",".",".",".",".",".",".","."},
            new String[] {".",".",".",".",".",".",".","."},
            new String[] {".",".",".",".",".",".",".","."},
            new String[] {"P","P","P","P","P","P","P","P"},
            new String[] {".",".",".",".",".",".",".","."},
        };   // P-белые, p-черные
        if (moves.length==0) {
            return arr;
        }
        String s_pervaya="abcdefgh";
        int kon1=0;
        int kon2=0;
        int hod=1;// 1-ход черных, -1 - ход белых
        int j=-1;
        int pos=-1;
        String ch;
        boolean exi=false;
        // P-белые, p-черные
        while (exi==false) {
            hod=(-1)*hod;
            j=j+1;
            if (moves[j].length()==2) {
                ch = moves[j].substring(0, 1);
                pos = s_pervaya.indexOf(ch);
                kon2 = pos;
                ch = moves[j].substring(1, 2);
                kon1 = 8 - Integer.parseInt(ch);
                if (arr[kon1][kon2] == "." && hod == -1) {
                    if (arr[kon1-hod][kon2]=="P") {
                        arr[kon1][kon2] = "P";
                        arr[kon1-hod][kon2] = ".";
                    } else
                    if (arr[kon1-2*hod][kon2]=="P" && kon1==4) {
                        arr[kon1][kon2] = "P";
                        arr[kon1-2*hod][kon2] = ".";
                    }
                    else {
                        return new String[][] {{moves[j]+" is invalid"}};
                    }
                } else
                if (arr[kon1][kon2] == "." && hod == 1) {
                    if (arr[kon1-hod][kon2]=="p" ) {
                        arr[kon1][kon2] = "p";
                        arr[kon1-hod][kon2] = ".";
                    } else
                    if (arr[kon1-2*hod][kon2]=="p" && kon1==3 ) {
                        arr[kon1][kon2] = "p";
                        arr[kon1-2*hod][kon2] = ".";
                    } else {
                        return new String[][] {{moves[j]+" is invalid"}};
                    }
                } else {
                    return new String[][] {{moves[j]+" is invalid"}};
                }
            }
            if (moves[j].length()>2) {
                ch = moves[j].substring(2, 3);
                pos = s_pervaya.indexOf(ch);
                kon2 = pos;
                ch = moves[j].substring(3, 4);
                kon1 = 8 - Integer.parseInt(ch);
                ch = moves[j].substring(0, 1);
                pos = s_pervaya.indexOf(ch);
                if(Math.abs(pos-kon2)>1){
                    return new String[][] {{moves[j]+" is invalid"}};
                }
                if (arr[kon1][kon2] == "p" && hod == -1) {
                    if (arr[kon1-hod][kon2-(kon2-pos)]=="P") {
                        arr[kon1][kon2] = "P";
                        arr[kon1-hod][kon2-(kon2-pos)] = ".";
                    }
                    else {
                        return new String[][] {{moves[j]+" is invalid"}};
                    }
                } else
                if (arr[kon1][kon2] == "P" && hod == 1) {
                    if (arr[kon1-hod][kon2-(kon2-pos)]=="p") {
                        arr[kon1][kon2] = "p";
                        arr[kon1 - hod][kon2 - (kon2 - pos)] = ".";
                    }
                } else {
                    return new String[][] {{moves[j]+" is invalid"}};
                }
            }
            if (j==moves.length-1) {
              exi=true;
            }
        }
        return arr;
    }
}
