package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: PG */
/* renamed from: jnn  reason: default package */
/* loaded from: classes.dex */
public final class jnn implements jnw {
    private final ConnectivityManager a;

    public jnn(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    @Override // defpackage.jnw
    public final int a() {
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager == null) {
            return 1;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return 2;
        }
        return this.a.isActiveNetworkMetered() ? 3 : 4;
    }
}
