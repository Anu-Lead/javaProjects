package CollectionsChapter16;
import java.util.List;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {
        String[] patient1 = {"matthew", "luke", "james", "thomas", "elizabeth"};
        List<String> inPatients = new java.util.LinkedList<>();

            for (String patient : patient1) {
                inPatients.add(patient);
            }

        String[] patient2 = {"ruth", "mary", "love", "amina", "gabriel"};
        List<String> outPatients = new java.util.LinkedList<>();
            for (String patient : patient2) {
                outPatients.add(patient);
            }

        inPatients.addAll(outPatients);
        outPatients = null;

        printList(inPatients);
        convertToUppercaseStrings(inPatients);
        printList(inPatients);

        System.out.printf("%nDeleting Elements 3 to 5");
            removeItems(inPatients);
        printList(inPatients);
        printReversedList(inPatients);

    }

    private static void printList(List<String> patientLists) {
        System.out.printf("%nlist: %n");
        for (String list : patientLists) {
            System.out.printf("%s ", list);
        }
        System.out.println();
    }
    private static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator =
                list.listIterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static void removeItems(List<String> list) {
        list.subList(3, 5).clear();
    }

    private static void printReversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.printf("%nReversed List:%n");
        while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
    }
}

