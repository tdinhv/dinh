package com.luuva.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.widget.Toast;

/**
 * Created by ASUS on 3/24/2018.
 */

public class CheckConnectNetwork {
    public boolean checkInternetConenction(Context c) {
        // get Connectivity Manager object to check connection
        ConnectivityManager connec
                =(ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);

        // Check for network connections
        if ( connec.getNetworkInfo(0).getState() ==
                android.net.NetworkInfo.State.CONNECTED ||
                connec.getNetworkInfo(0).getState() ==
                        android.net.NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() ==
                        android.net.NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTED ) {
            Toast.makeText(c.getApplicationContext(), " Connected ", Toast.LENGTH_LONG).show();
            return true;
        }else if (
                connec.getNetworkInfo(0).getState() ==
                        android.net.NetworkInfo.State.DISCONNECTED ||
                        connec.getNetworkInfo(1).getState() ==
                                android.net.NetworkInfo.State.DISCONNECTED  ) {
            Toast.makeText(c.getApplicationContext(), " Not Connected ", Toast.LENGTH_LONG).show();
            return false;
        }
        return false;
    }

}
