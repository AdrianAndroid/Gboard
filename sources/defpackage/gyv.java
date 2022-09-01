package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* renamed from: gyv  reason: default package */
/* loaded from: classes.dex */
public final class gyv {
    public final Context a;
    public final ist b;
    public final gyw c;
    public final ConcurrentHashMap d;
    public volatile Context e;

    public gyv(Context context) {
        this.d = new ConcurrentHashMap();
        this.a = context;
        this.b = new ist();
        this.c = new gyt();
    }

    public final void a() {
        this.d.clear();
    }

    public gyv(Context context, ist istVar, gyw gywVar) {
        this.d = new ConcurrentHashMap();
        this.a = context;
        this.b = istVar;
        this.c = gywVar;
    }
}
