package com.webweaver.dennis.audiencenetworkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.NativeAd;

public class MainActivity extends AppCompatActivity {
    private NativeAd nativeAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showNativeAd(){
        nativeAd = new NativeAd(this, "335666830289637_336998793489774");
        //instantiate a NativeAd object, set an AdListener, and call loadAd():
        nativeAd.setAdListener(new AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {

            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        });
        nativeAd.loadAd();
    }
}
