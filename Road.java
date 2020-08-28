
/**
 * Write a description of class Road here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Road
{
    private char [][] roadGrid;

    public Road(int i, int j){
        roadGrid = new char[i][j];
    }

    public Road(){
        roadGrid = new char[8][8];
    }

    public void buildRoad(int row, int col){
        this.roadGrid[row][col] =  '#';
    }

    public void addHorizontalBorder(int row,int col,int num){
        for(; num > 0; num --, col++){
            roadGrid[row][col] = '#';
        }
    }

    public void addVirticalBorder(int row,int col,int num){
        for(; num > 0;num--, row--){
            roadGrid[row][col] = '#';
        }
    }

    public void addVirticalBorder2(int row, int col,int num){
        for(;num >0; num--, row++){
            roadGrid[row][col] = '#';
        }
    }

    public void printRoad(){
        printRoad(0, 0);
    }

    private void printRoad(int row, int col){
        if(row >= roadGrid.length || col > roadGrid[0].length)
            return;
        if(col > roadGrid[0].length -1){
            printRoad(row+1,0);
        }
        else{
            if(col < roadGrid[0].length-1)
                System.out.print(roadGrid[row][col]);
            else if(col == roadGrid[0].length-1)
                System.out.println(roadGrid[row][col]);
            printRoad(row,col+1);
        }
    }

    public void fillRoadGrid(){
        for(int i = 0; i < roadGrid.length; i++){
            for(int j = 0; j < roadGrid[0].length;j++){
                if(roadGrid[i][j] != '#')
                    roadGrid[i][j] = ' ';
            }
        }
    }

}
