public class CWH_14_STRINGmethods {
    public static void main(String[] args) {
        String name = "Amruta";
        String a1 = new String("Amu");
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String value1 = name.toLowerCase();
        System.out.println(value1);

        String value2 = name.toUpperCase();
        System.out.println(value2);

        String nontrimString = "   Atharva       ";
        System.out.println(nontrimString);
        System.out.println(nontrimString.trim());

        String trimedString = nontrimString.trim();
        System.out.println(trimedString);

        System.out.println(name.substring(4));
        System.out.println(name.substring(2,6));

        System.out.println(name.replace("r","p"));
        System.out.println(name.replace("rut","pat"));

        System.out.println(name.startsWith("Amu"));
        System.out.println(name.startsWith("Amr"));

        System.out.println(name.endsWith("ta"));
        System.out.println(name.endsWith("tyy"));

        System.out.println(name.charAt(2));
        System.out.println(name.charAt(4));

        System.out.println(name.indexOf("ta"));
        System.out.println(name.indexOf("mru"));
        System.out.println(name.indexOf("mru",5));

        String name1 = "Amrumruruta";
        System.out.println(name1.indexOf("ru",5));
        System.out.println(name1.lastIndexOf("ru",7));

        System.out.println("I am an escaping character \\ double quot ");
    }
}
