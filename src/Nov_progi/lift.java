package Nov_progi;

public class lift {
    public static void main(String[] args) {
        int[][] q = {
                new int[0], // G
                new int[]{0}, // 1
                new int[0], // 2
                new int[0], // 3
                new int[]{2}, // 4
                new int[]{3}, // 5
                new int[0], // 6

        };
        for (int i=0; i< theLift(q,5).length; i=i+1) {
            System.out.print(theLift(q,5)[i]+" ");
        } //0, 1, 2, 1, 0, 1, 2, 0
    }
    public static int[] theLift(final int[][] queues, final int capacity) {
         int napravlenie=1;
         int etag=0;
         int max=0;
         int N_vlift=0;
         int N=0;
         int N1=0;
         int [] kto_vlifte = new int[capacity];
         int [] ostan = new int[1000];
         boolean vihod=false;
         boolean vverch=false;
         boolean vniz=false;
         boolean vlifte_vverch=false;
         boolean vlifte_vniz=false;
         boolean osta_out=false;
        boolean osta_in=false;
         int N_ostanovki=0;
         ostan[0]=0;
         for (int i=0; i< queues.length;i=i+1){
                if (queues[i].length>max) max= queues[i].length;
         }
        for (int i=0; i< kto_vlifte.length;i=i+1){
            kto_vlifte[i]=-1;
        }
         int [][] arr = new int[queues.length][max];
         for (int i=0; i< arr.length;i=i+1){
             for (int j=0;j<max;j=j+1) {
                 arr[i][j]=-1;
             }
         }
         for (int i=0; i< queues.length;i=i+1){
            if (queues[i].length>0){
                for (int j=0;j<queues[i].length;j=j+1) {
                    arr[i][j]=queues[i][j];
                }
            }
         }
         etag=0;
         while (vihod==false) {
             vverch=false;
             vniz=false;
             vlifte_vverch=false;
             vlifte_vniz=false;
             N=0;
             N1=0;
             // Проверяем есть ли ктото ниже нашего этажа
             if (etag>0) {
                 for (int i = 0; i < etag; i = i + 1) {
                     for (int j = 0; j < max; j = j + 1) {
                         if (arr[i][j] > -1) {
                             vniz = true;
                             N = N + 1;
                         }
                     }
                 }
             }
             // Проверяем есть ли ктото выше нашего этажа
             if (etag<arr.length-1) {
                 for (int i = etag+1; i < arr.length; i = i + 1) {
                     for (int j = 0; j < max; j = j + 1) {
                         if (arr[i][j] > -1) {
                             vverch = true;
                             N = N + 1;
                         }
                     }
                 }
             }
             osta_out=false;
             // Проверяем есть ли ктото у входа в лифт на нашем этаже
             for (int i = 0; i < max; i = i + 1) {
                 if ((arr[etag][i]>-1 && arr[etag][i]>etag && napravlenie>0) ||
                         (arr[etag][i]>-1 && arr[etag][i]<etag && napravlenie<0)){
                     osta_out=true;
                 }
             }
             osta_in=false;
             // Проверяем есть ли ктото в лифте, кто выходит на нашем этаже
          /*   for (int i=0;i<capacity;i=i+1) {
                 if (kto_vlifte[i] == etag) {
                     osta_in=true;
                 }
             }*/
             if (etag >0 || ostan[N_ostanovki] >0) {
                 if(osta_out==true) {
                     N_ostanovki = N_ostanovki + 1;
                     ostan[N_ostanovki] = etag;
                 }
             }
             // Выходим из лифта
             for (int i=0;i<capacity;i=i+1) {
                 if (kto_vlifte[i]==etag){
                     kto_vlifte[i]=-1;
                     N_vlift=N_vlift-1;
                     osta_in=true;
                 }
             }
             //Предварительно  Проверяем едет ли ктото внутри лифта вверх или вниз
             for (int i=0;i<capacity;i=i+1) {
                 if (kto_vlifte[i] < etag && kto_vlifte[i]>-1) {
                     vlifte_vniz = true;
                     N1=N1+1;
                 }
                 if (kto_vlifte[i] > etag) {
                     vlifte_vverch = true;
                     N1=N1+1;
                 }
             }
             // заходим в лифт
             for (int i=0;i<max;i=i+1) {
                  if ((napravlenie>0 && arr[etag][i]>etag && N_vlift<capacity) ||
                          (napravlenie>0 && arr[etag][i]<etag && arr[etag][i]>-1 && vlifte_vverch==false &&vverch==false && N_vlift<capacity) ||
                          (napravlenie<0 && arr[etag][i]>etag && vniz==false  && vlifte_vniz==false && N_vlift>0 && N_vlift<capacity) ||
                          (napravlenie<0 && arr[etag][i]>etag && vniz==false  &&  N_vlift==0 && osta_out==false && N_vlift<capacity) ||
                          (napravlenie<0 && arr[etag][i]<etag && arr[etag][i]>-1 && N_vlift<capacity)) {
                      N_vlift=N_vlift+1;
                      osta_in=true;
                      for (int k=0; k<capacity;k=k+1) {
                          if(kto_vlifte[k]==-1) {
                              kto_vlifte[k] = arr[etag][i];
                              arr[etag][i] = -1;
                              break;
                          }
                      }
                  }
             }
             if (etag >0 || ostan[N_ostanovki] >0) {
                 if(osta_in==true && ostan[N_ostanovki] != etag) {
                     N_ostanovki = N_ostanovki + 1;
                     ostan[N_ostanovki] = etag;
                 }
             }
             vlifte_vverch=false;
             vlifte_vniz=false;
             N1=0;
             // Проверяем едит ли ктото внутри лифта вверх или вниз
             for (int i=0;i<capacity;i=i+1) {
                 if (kto_vlifte[i] < etag && kto_vlifte[i]>-1) {
                     vlifte_vniz = true;
                     N1=N1+1;
                 }
                 if (kto_vlifte[i] > etag) {
                     vlifte_vverch = true;
                     N1=N1+1;
                 }
             }

             if ((napravlenie>0 && vverch==false && vniz==false  && N1>0 && vlifte_vniz==true && vlifte_vverch==false) ||
                     (napravlenie>0 && vverch==false && vniz==true  && vlifte_vniz==true && vlifte_vverch==false) ||
                     (napravlenie>0 && vverch==false && vniz==true  && N_vlift==0) ||
                     (napravlenie<0 && vverch==false && vniz==false  && N1>0 && vlifte_vverch==true && vlifte_vniz==false) ||
                     (napravlenie<0 && vverch==true && vniz==false  && N_vlift==0) ||
                     (napravlenie<0 && vverch==true && vniz==false  && vlifte_vverch==true && vlifte_vniz==false)){
                napravlenie=napravlenie*(-1);
             }
             if(N==0 && N1==0) {
                 if (etag>0) {
                     N_ostanovki = N_ostanovki + 1;
                     ostan[N_ostanovki] = 0;
                 }
                 etag=0;
                 vihod=true;
             } else {
                 etag = etag + napravlenie;
             }
         }
        int [] ostanOut = new int[N_ostanovki+1];
         for (int i=0; i<=N_ostanovki;i=i+1) {
             ostanOut[i]=ostan[i];
         }
        return ostanOut;
    }
}
