package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int countL = 0;
        int countR = 0;
        int l = startIndex;
        int r = startIndex;

        for (int i = 0; i < playList.length; i++) {
            if (this.playList[l].equals(selection)) {
                return countL;
            } else if (this.playList[r].equals(selection)) {
                return countR;
            }
            l--;
            r++;
            if (l < 0) {
                l = playList.length - 1;
            }
            if (r > playList.length -1); {
                r = 0;
            }
            countR++;
            countL++;

        }
        return 0;
    }
}
