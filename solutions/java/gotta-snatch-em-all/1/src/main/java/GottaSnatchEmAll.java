import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

     static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);

    }

    static boolean addCard(String card, Set<String> collection) {
       return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        for(String card : myCollection){
            if(!theirCollection.contains(card)){
                for(String theirCard : theirCollection){
                    if(!myCollection.contains(theirCard)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>();
        if(!collections.isEmpty()){
            common.addAll(collections.get(0));
            collections.forEach(common::retainAll);
            }

        return common;
        }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> cards = new HashSet<>();
        if (!collections.isEmpty()) {
            if (collections.size() == 1) {
                cards.addAll(collections.get(0));
            }else{
                for (Set<String> e: collections){
                    for (String b: e){
                        cards.add(b);
                    }
                }
            }
        }
        return cards;
    }
}
