public class App{
    static boolean iwillBehave =true;
    static boolean IwillGraduate =true;

    public static void main(String []args) throws Exception{
    
        assert iwillBehave == true : "BI blockmates";

        college();

        assert IwillGraduate  == true : "Inom ng inom";
    }
    static void college(){
        IwillGraduate = false;
    }
}
