package com.github.yoruhinda.Wheather_Music_Api.models;

public class Music {
    private String genre;
    private Climate climate;

    public Music(Climate climate){
        getHumorMusical();
    }

    private void getHumorMusical(){
        switch(climate){
            case RAIN -> genre = "acoustic";
            case SNOW -> genre = "jazz";
            case CLEAR -> genre = "pop";
            case CLOUDS -> genre = "indie";
            case THUNDERSTORM -> genre = "sad";
        }
    }
}
