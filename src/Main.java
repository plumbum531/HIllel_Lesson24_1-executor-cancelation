public class Main {
    public static void main(String[] args) {

    }

    public static float pow(float value, int pow){
        float result = 1;

        for(int i =0; i< pow; i++){
            result *=value;
        }
        return result;
    }
}
