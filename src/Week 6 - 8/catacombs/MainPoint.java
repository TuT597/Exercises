public class MainPoint{
    public static void main(String[] args){
        Point origin = new Point();
        System.out.printf("(%d, %d)", origin.getX(), origin.getY());
        
        Point twoThree = new Point(2, 3);
        System.out.printf("(%d, %d)", twoThree.getX(), twoThree.getY());
        
        Point minusFourZero = new Point(-4, 0);
        System.out.printf("(%d, %d)", minusFourZero.getX(), minusFourZero.getY());
    }
}

class Point{
    private int x;
    private int y;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
}

//Question, are x and y immutable? Yes, once the Point object is created by the constructor the x and y values can never be changed. I did this becuase
//as a baseline i try to keep variable scope as small as possible. At no point did x and y need to be accesible so i kept them private.