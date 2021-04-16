public class Main{
    public static void main(String[] arg){
        BensiiniMootor bm = new BensiiniMootor();
        bm.eestisOn();
        System.out.println("");
        bm.bensiiniAutoVanus();
        System.out.println("");

        DiiselMootor dm = new DiiselMootor();
        dm.eestisOn();
        System.out.println("");
        dm.bensiiniAutoVanus();

        System.out.println();
    }
    
}
