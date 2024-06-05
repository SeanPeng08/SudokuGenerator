import java.util.Arrays;
import java.util.Random;

public class SudokuGenerator {

    public static void main(String[]args){

        int [][] theBoard = new int[9][9] ;

        for (int a = 0; a<=8; a++){

            for (int b=0; b <=8; b++){

                theBoard[a][b]=0;
        
            }
        }

        Random randomnumber = new Random();
        int highest =40;
        int lowest= 20;
        int result = randomnumber.nextInt(highest-lowest)+lowest;
        System.out.println(result);

        for(int ba =0;ba<=result-1;ba++){
            while(true){
                int theRandomRow =(int)(Math.random()*10-1);
                int theRandomColumn = (int)(Math.random()*10-1);
                if (theBoard[theRandomRow][theRandomColumn]==0){
                    Random randomnumber2 = new Random();
                    int highest2 = 9;
                    int lowest2 = 1;
                    theBoard[theRandomRow][theRandomColumn] =randomnumber2.nextInt(highest2-lowest2)+lowest2+1;
                    break;
                }
            }
        }

        for (int c=0; c<=8; c++){
            for(int d=0;d<=8; d++){
                
                
                if (theBoard[c][d]==0){
                    continue;
                }
                    while(true){
                        int z = theBoard[c][d];
                        for(int e = 0;e<=8;e++){
                            //Checking the row
                            if (e ==c){
                                continue;
                            }
                            if (theBoard[c][d]==theBoard[e][d]){
                                Random randomnumber3 = new Random();
                                int highest3 = 9;
                                int lowest3 = 1;
                                theBoard[c][d] =randomnumber3.nextInt(highest3-lowest3)+lowest3+1;
                                break;
                            }
                            //Checking the column
                            if(e==d){
                                continue;
                            }
                            if(theBoard[c][d]==theBoard[c][e]||theBoard[c][d]==theBoard[c][c]){
                                Random randomnumber4 = new Random();
                                int highest4 = 9;
                                int lowest4 = 1;
                                theBoard[c][d] =randomnumber4.nextInt(highest4-lowest4)+lowest4+1;
                                break;
                            }
                            //Checking the box
                            if(Math.abs(c-1)<=1&&Math.abs(d-1)<=1){
                                for(int f=0; f<=2;f++){
                                    for(int g=0; g<=2;g++){
                                        if(f==c&g==d){
                                            continue;
                                        }
                                        if (theBoard[c][d]==theBoard[f][g]){
                                            Random randomnumber5 = new Random();
                                            int highest5 = 9;
                                            int lowest5 = 1;
                                            theBoard[c][d] =randomnumber5.nextInt(highest5-lowest5)+lowest5+1;
                                            break;
                                        }
                                    }
                                    if (z!=theBoard[c][d]){
                                        break;
                                    }
                                    
                                }
                                if (z!=theBoard[c][d]){
                                    break;
                                }
                            }
                            if(Math.abs(c-1)<=1&&Math.abs(d-4)<=1){
                                for(int h=0; h<=2;h++){
                                    for(int i=3; i<=5;i++){
                                        if(h==c&i==d){
                                            continue;
                                        }
                                        if (theBoard[c][d]==theBoard[h][i]){
                                            Random randomnumber6 = new Random();
                                            int highest6 = 9;
                                            int lowest6 = 1;
                                            theBoard[c][d] =randomnumber6.nextInt(highest6-lowest6)+lowest6+1;
                                            break;
                                        }
                                    }
                                    if (z!=theBoard[c][d]){
                                        break;
                                    }
                                    
                                }
                                if (z!=theBoard[c][d]){
                                    break;
                                }
                            }
                            if(Math.abs(c-1)<=1&&Math.abs(d-7)<=1){
                                for(int j=0; j<=2;j++){
                                    for(int k=6; k<=8;k++){
                                        if(j==c&k==d){
                                            continue;
                                        }
                                        if (theBoard[c][d]==theBoard[j][k]){
                                            Random randomnumber7 = new Random();
                                            int highest7 = 9;
                                            int lowest7 = 1;
                                            theBoard[c][d] =randomnumber7.nextInt(highest7-lowest7)+lowest7+1;
                                            break;
                                        }
                                    }
                                    if (z!=theBoard[c][d]){
                                        break;
                                    }
                                    
                                }
                                if (z!=theBoard[c][d]){
                                    break;
                                }
                            }
                            if(Math.abs(c-4)<=1&&Math.abs(d-1)<=1){
                                for(int l=3; l<=5;l++){
                                    for(int m=0; m<=2;m++){
                                        if(l==c&m==d){
                                            continue;
                                        }
                                        if (theBoard[c][d]==theBoard[l][m]){
                                            Random randomnumber8 = new Random();
                                            int highest8 = 9;
                                            int lowest8 = 1;
                                            theBoard[c][d] =randomnumber8.nextInt(highest8-lowest8)+lowest8+1;
                                            break;
                                        }
                                    }
                                    if (z!=theBoard[c][d]){
                                        break;
                                    }
                                    
                                }
                                if (z!=theBoard[c][d]){
                                    break;
                                }
                            }
                            if(Math.abs(c-4)<=1&&Math.abs(d-4)<=1){
                                for(int n=3; n<=5;n++){
                                    for(int o=3; o<=5;o++){
                                        if(n==c&o==d){
                                            continue;
                                        }
                                        if (theBoard[c][d]==theBoard[n][o]){
                                            Random randomnumber9 = new Random();
                                            int highest9 = 9;
                                            int lowest9 = 1;
                                            theBoard[c][d] =randomnumber9.nextInt(highest9-lowest9)+lowest9+1;
                                            break;
                                        }
                                    }
                                    if (z!=theBoard[c][d]){
                                        break;
                                    }
                                    
                                }
                                if (z!=theBoard[c][d]){
                                    break;
                                }
                            }
                            if(Math.abs(c-4)<=1&&Math.abs(d-7)<=1){
                                for(int p=3; p<=5;p++){
                                    for(int q=6; q<=8;q++){
                                        if(p==c&q==d){
                                            continue;
                                        }
                                        if (theBoard[c][d]==theBoard[p][q]){
                                            Random randomnumber10 = new Random();
                                            int highest10 = 9;
                                            int lowest10 = 1;
                                            theBoard[c][d] =randomnumber10.nextInt(highest10-lowest10)+lowest10+1;
                                            break;
                                        }
                                    }
                                    if (z!=theBoard[c][d]){
                                        break;
                                    }
                                    
                                }
                                if (z!=theBoard[c][d]){
                                    break;
                                }
                            }
                            if(Math.abs(c-7)<=1&&Math.abs(d-1)<=1){
                                for(int r=6; r<=8;r++){
                                    for(int s=0; s<=2;s++){
                                        if(r==c&s==d){
                                            continue;
                                        }
                                        if (theBoard[c][d]==theBoard[r][s]){
                                            Random randomnumber11 = new Random();
                                            int highest11 = 9;
                                            int lowest11 = 1;
                                            theBoard[c][d] =randomnumber11.nextInt(highest11-lowest11)+lowest11+1;
                                            break;
                                        }
                                    }
                                    if (z!=theBoard[c][d]){
                                        break;
                                    }
                                    
                                }
                                if (z!=theBoard[c][d]){
                                    break;
                                }
                            }
                            if(Math.abs(c-7)<=1&&Math.abs(d-4)<=1){
                                for(int t=6; t<=8;t++){
                                    for(int u=3; u<=5;u++){
                                        if(t==c&u==d){
                                            continue;
                                        }
                                        if (theBoard[c][d]==theBoard[t][u]){
                                            Random randomnumber12 = new Random();
                                            int highest12 = 9;
                                            int lowest12 = 1;
                                            theBoard[c][d] =randomnumber12.nextInt(highest12-lowest12)+lowest12+1;
                                            break;
                                        }
                                    }
                                    if (z!=theBoard[c][d]){
                                        break;
                                    }
                                    
                                }
                                if (z!=theBoard[c][d]){
                                    break;
                                }
                            }
                            if(Math.abs(c-7)<=1&&Math.abs(d-7)<=1){
                                for(int v=6; v<=8;v++){
                                    for(int w=6; w<=8;w++){
                                        if(v==c&w==d){
                                            continue;
                                        }
                                        if (theBoard[c][d]==theBoard[v][w]){
                                            Random randomnumber13 = new Random();
                                            int highest13 = 9;
                                            int lowest13 = 1;
                                            theBoard[c][d] =randomnumber13.nextInt(highest13-lowest13)+lowest13+1;
                                            break;
                                        }
                                    }
                                    if (z!=theBoard[c][d]){
                                        break;
                                    }
                                    
                                }
                                if (z!=theBoard[c][d]){
                                    break;
                                }
                            }
                            

                        }
                        if(z ==theBoard[c][d]){
                            break;
                        }
                    }
                
                }
            
            }
                
            
        System.out.println(Arrays.deepToString(theBoard));
        }

}

        
        

    

