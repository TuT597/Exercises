public class MainColor{
    
    final static Color WHITE = new Color(255, 255, 255);
    final static Color BLACK = new Color(0, 0, 0);
    final static Color RED = new Color(255, 0, 0);
    final static Color ORANGE = new Color(255, 165, 0);
    final static Color YELLOW = new Color(255, 255, 0);
    final static Color GREEN = new Color(0, 128, 0);
    final static Color BLUE = new Color(0, 0, 255);
    final static Color PURPLE = new Color(128, 0, 128);
    
    public static void main(String[] args){
        Color customColor = new Color(123, 194, 39);
        System.out.println(customColor.toString());
        
        Color red = RED;
        System.out.println(red.toString());
    }
    
    
}

class Color{
    private int red;
    private int green;
    private int blue;
    
    public Color(int r, int g, int b){
        this.red = r;
        this.green = g;
        this.blue = b;
    }
    
    @Override
    public String toString(){
        return String.format("(R:%d G:%d B:%d)", this.red, this.green, this.blue);
    }
}

//I did not fully understand what was expected from me in this assignment so i just made what i thought i had to.