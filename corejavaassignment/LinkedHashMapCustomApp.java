
public class LinkedHashMapCustomApp {
	public static void main(String[] args) {
        LinkedHashMapCustom<Integer, Integer> linkedHashMapCustom = new LinkedHashMapCustom<Integer, Integer>();

        linkedHashMapCustom.put(5, 62);
        linkedHashMapCustom.put(10, 55);
        linkedHashMapCustom.put(15, 85);
        linkedHashMapCustom.put(20, 14);
        linkedHashMapCustom.put(25, 89);

        System.out.println("Display values corresponding to keys>");
        System.out.println("value corresponding to key 10="
                     + linkedHashMapCustom.get(10));
        System.out.println("value corresponding to key 17="
                     + linkedHashMapCustom.get(17));

        System.out.print("Display : ");
        linkedHashMapCustom.display();

        System.out.println("\n\nvalue corresponding to key 10 removed: "
                     + linkedHashMapCustom.remove(10));
        System.out.println("value corresponding to key 11 removed: "
                     + linkedHashMapCustom.remove(15));

        System.out.print("Display : ");
        linkedHashMapCustom.display();

 }

}
