package AssesmentsPractice.A3007;

public class Java8Practice {
    public static void main(String[] args) {
        try {
            int a = 12;
            throw new CustomException("Checked exception");
        }catch(CustomException ex){
            throw new UncheckedException("Unched Exception");
        }

    }
}
