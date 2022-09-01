package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: irr  reason: default package */
/* loaded from: classes.dex */
public final class irr {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/statusmonitors/DeviceStatusMonitor");
    public static final hhl b = hhq.h("device_country_for_testing", "");
    public final Context f;
    private final TelephonyManager g;
    private final ConnectivityManager h;
    private String i;
    private String j;
    public final mks c = gxo.b(1);
    public final BroadcastReceiver d = new irq(this);
    public final hhk e = new ffp(this, 8);
    private iru k = iru.UNKNOWN;
    private boolean l = false;

    public irr(Context context) {
        this.f = context;
        this.g = (TelephonyManager) context.getSystemService("phone");
        this.h = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static boolean d(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    private final iru e(Network network) {
        TelephonyManager telephonyManager;
        if (network == null) {
            return iru.NO_CONNECTION;
        }
        try {
            NetworkCapabilities networkCapabilities = this.h.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/statusmonitors/DeviceStatusMonitor", "getNetworkState", 259, "DeviceStatusMonitor.java")).t("Network capabilities are unknown.");
                return iru.CONNECTION_UNKNOWN;
            } else if (!networkCapabilities.hasCapability(12)) {
                ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/statusmonitors/DeviceStatusMonitor", "getNetworkState", 264, "DeviceStatusMonitor.java")).t("Network has no NET_CAPABILITY_INTERNET capability.");
                return iru.NO_CONNECTION;
            } else if (networkCapabilities.hasCapability(11)) {
                return iru.NON_METERED;
            } else {
                if (networkCapabilities.hasTransport(1)) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/statusmonitors/DeviceStatusMonitor", "getNetworkState", 277, "DeviceStatusMonitor.java")).t("Network has WIFI transport but no NET_CAPABILITY_NOT_METERED capability.");
                        return iru.METERED;
                    }
                    return iru.NON_METERED;
                } else if (networkCapabilities.hasTransport(0)) {
                    return iru.METERED;
                } else {
                    if (Build.VERSION.SDK_INT < 26 || (telephonyManager = this.g) == null || !telephonyManager.isDataEnabled()) {
                        return iru.CONNECTION_UNKNOWN;
                    }
                    return iru.METERED;
                }
            }
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/statusmonitors/DeviceStatusMonitor", "getNetworkState", (char) 296, "DeviceStatusMonitor.java")).t("Failed to get network state.");
            return iru.NO_CONNECTION;
        }
    }

    private static boolean f(String str, String str2) {
        if (str == null && str2 == null) {
            return false;
        }
        return str == null || str2 == null || !str.equals(str2);
    }

    public final iru a(Intent intent) {
        ConnectivityManager connectivityManager = this.h;
        if (connectivityManager != null) {
            try {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                if (allNetworks.length > 0) {
                    Network activeNetwork = this.h.getActiveNetwork();
                    if (activeNetwork == null) {
                        iru iruVar = iru.UNKNOWN;
                        for (Network network : allNetworks) {
                            iru e = e(network);
                            if (e.f > iruVar.f) {
                                iruVar = e;
                            }
                        }
                        return iruVar;
                    }
                    return e(activeNetwork);
                }
                ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/statusmonitors/DeviceStatusMonitor", "getCurrentNetworkState", 195, "DeviceStatusMonitor.java")).t("getCurrentNetworkState(): no networks");
                return iru.NO_CONNECTION;
            } catch (RuntimeException e2) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/libraries/inputmethod/statusmonitors/DeviceStatusMonitor", "getCurrentNetworkState", (char) 216, "DeviceStatusMonitor.java")).t("Failed to get active network state.");
            }
        }
        if (intent != null) {
            if (intent.getBooleanExtra("noConnectivity", false)) {
                ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/statusmonitors/DeviceStatusMonitor", "getCurrentNetworkState", 224, "DeviceStatusMonitor.java")).t("getCurrentNetworkState(): intent has EXTRA_NO_CONNECTIVITY");
                return iru.NO_CONNECTION;
            }
            iru iruVar2 = iru.CONNECTION_UNKNOWN;
            Bundle extras = intent.getExtras();
            if (extras != null) {
                int i = extras.getInt("networkType");
                if (i == 1 || i == 9) {
                    iruVar2 = iru.NON_METERED;
                } else {
                    iruVar2 = iru.METERED;
                }
                ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/statusmonitors/DeviceStatusMonitor", "getCurrentNetworkState", 239, "DeviceStatusMonitor.java")).z("getCurrentNetworkState(): networkType = %s, newState = %s", i, iruVar2);
            }
            return iruVar2;
        }
        return iru.UNKNOWN;
    }

    public final synchronized void b(iru iruVar, boolean z, boolean z2) {
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/statusmonitors/DeviceStatusMonitor", "notifyIfNetworkChanged", 180, "DeviceStatusMonitor.java")).J("notifyIfNetworkChanged: newState = %s, airplaneModeOn = %s, notifyAnyway = %s", iruVar, Boolean.valueOf(z), Boolean.valueOf(z2));
        if (!z2 && iruVar == this.k && this.l == z) {
            return;
        }
        this.k = iruVar;
        this.l = z;
        ijl.b().g(new irv(iruVar, z));
    }

    public final synchronized void c(boolean z) {
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/statusmonitors/DeviceStatusMonitor", "updateCountryInfo", 139, "DeviceStatusMonitor.java")).w("updateCountryInfo(), notifyAnyway = %s", Boolean.valueOf(z));
        String str = this.i;
        String str2 = this.j;
        String str3 = (String) b.c();
        if (!TextUtils.isEmpty(str3)) {
            str = str3;
            str2 = str;
        } else {
            TelephonyManager telephonyManager = this.g;
            if (telephonyManager != null) {
                str = telephonyManager.getSimCountryIso();
                str2 = this.g.getNetworkCountryIso();
            }
        }
        if (z || f(str, this.i) || f(str2, this.j)) {
            ijl.b().g(new irp(str, str2));
        }
        this.i = str;
        this.j = str2;
    }
}
