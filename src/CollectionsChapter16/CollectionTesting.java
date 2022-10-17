package CollectionsChapter16;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTesting {
    public static void main(String[] args) {
        String[] pharmacyStores = {"STARLIGHT PHARMACEUTICALS,", "LIVE-SAVER MOBILE STORE,", "BAMBOO MATERNAL STORE AND CARE,", "DOMINIC PHARMACY, and", "C-LOVE STORE."};
            List<String> list = new ArrayList<>();
            for (String pharmacy : pharmacyStores) {
                list.add(pharmacy);
            }

        String[] removePharmacy = {"DOMINIC PHARMACY,", "LIVE-SAVER MOBILE STORE,", "BAMBOO MATERNAL STORE AND CARE."};
            List<String> removeList = new ArrayList<>();
            for (String pharmacy : removePharmacy) {
                removeList.add(pharmacy);
            }

        System.out.println("ArrayList Pharmacy is: ");
        for (int count = 0; count < list.size(); count++) {
            System.out.printf("%s ", list.get(count));
        }

        removePharmacy(list, removeList);
            System.out.printf("%n%n=======================================================================================================================" + "%nArrayList after calling removePharmacies:%n");
            for (String pharmacy : removeList) {
                System.out.printf("%s ", pharmacy);
            }
    }
    private static void removePharmacy(Collection<String> collection1, Collection<String> collection2) {
        Iterator<String> iterator = collection1.iterator();
            while (iterator.hasNext()) {
                if (collection2.contains(iterator.next())) {
                iterator.remove();
                }
            }
        }
}

