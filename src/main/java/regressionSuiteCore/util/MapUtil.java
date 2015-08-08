package regressionSuiteCore.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/**
 * Created by dylan on 6/12/15.
 */
public class MapUtil {

    public static <K,V> void addToMappedCollection(Map<K, Collection<V>> map,K key,  V newValue) {
        if (map.containsKey(key)) {
            map.get(key).add(newValue);
        } else {
            map.put(key, new ArrayList<V>(Arrays.asList(newValue)));
        }
    }

}
