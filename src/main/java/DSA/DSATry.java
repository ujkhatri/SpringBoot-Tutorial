package DSA;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DSATry {

    public void testMethod() {
        String testString = new String();
        testString.hashCode();

        Hashtable<String, String> hashtable = new Hashtable<>();
        Dictionary<String, String> dictionary = new Dictionary<String, String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Enumeration<String> keys() {
                return null;
            }

            @Override
            public Enumeration<String> elements() {
                return null;
            }

            @Override
            public String get(Object key) {
                return null;
            }

            @Override
            public String put(String key, String value) {
                return null;
            }

            @Override
            public String remove(Object key) {
                return null;
            }
        };

    }

}
