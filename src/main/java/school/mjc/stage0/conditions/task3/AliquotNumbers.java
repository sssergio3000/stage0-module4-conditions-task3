package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if (second%first==0){
            System.out.println("Aliquot");
        }
        else{
            System.out.println("Not aliquot");
        }
    }

    public static void main(String[] args) {
        AliquotNumbers an = new AliquotNumbers();
        an.isFirstAliquot(5,26);
    }
}
