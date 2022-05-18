package ss9_bai_tap_ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("zakuza");
        list.add("giang ho");
        list.add(" internet");
        list.add("mafia");

        print(list.getElements());

        System.out.println(list.indexOf("Yes"));
        System.out.println(list.indexOf("No"));

        list.remove(1);
        list.add("very", 1);
        print(list.getElements());

        ArrayList<String> clone = list.clone();

        System.out.println(clone.contains("Đẹp"));
        System.out.println(clone.contains("handsome"));

        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getElements());


    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }
}
