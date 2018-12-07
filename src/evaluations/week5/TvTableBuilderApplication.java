package evaluations.week5;

public class TvTableBuilderApplication {

    public static void main(String[] args) {
        TvTableBuilder builder = new TvTableBuilder();
        TvTable table = builder.build();
        System.out.println(table);
    }
}
