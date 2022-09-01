package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: PG */
/* renamed from: bdr  reason: default package */
/* loaded from: classes.dex */
final class bdr implements bgd {
    final /* synthetic */ Context a;

    public bdr(Context context) {
        this.a = context;
    }

    @Override // defpackage.bgd
    public final /* bridge */ /* synthetic */ Object a() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }
}
