public class ComparatorMas implements java.util.Comparator {

            public int compare(Object obj1, Object obj2) {
                if (obj1 instanceof Integer && obj2 instanceof Integer) {
                    int o1 = (Integer) obj1;
                    int o2 = (Integer) obj2;
                    if (o1<o2)return -1;
                    if (o1==o2)return 0;   else return 1;
                }
                return -1;
            }

        }


