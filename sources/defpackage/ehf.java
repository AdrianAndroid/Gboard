package defpackage;

import android.app.Application;

/* compiled from: PG */
/* renamed from: ehf  reason: default package */
/* loaded from: classes.dex */
public final class ehf extends agm {
    public final csu a;
    public final cwx b;
    public final dpe c;

    public ehf(Application application) {
        if (!(application instanceof knl)) {
            throw new IllegalStateException("No ExpressiveStickerClientApplication from activity.");
        }
        this.c = new dpe(((knn) ((knl) application).b()).g, (byte[]) null);
        this.b = cwo.a(application.getApplicationContext());
        this.a = new csu();
    }
}
