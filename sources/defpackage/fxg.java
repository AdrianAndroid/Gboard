package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: fxg  reason: default package */
/* loaded from: classes.dex */
final class fxg extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        String a = fxh.a(context);
        if (a.equals(stringExtra)) {
            gen d = gdd.a(context).d(a);
            d.k(new ewr(6));
            d.j(new doq(a, 11));
        }
    }
}
