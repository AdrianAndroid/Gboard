package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: fpp  reason: default package */
/* loaded from: classes.dex */
public final class fpp {
    public final Object a;

    public fpp() {
        this.a = DesugarCollections.synchronizedMap(new HashMap());
    }

    public fpp(Activity activity) {
        this.a = activity;
    }

    public fpp(Context context) {
        this.a = context;
    }

    private fpp(ghn ghnVar) {
        this.a = ghnVar;
    }

    public static fpp e(ghn ghnVar) {
        return new fpp(ghnVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Object a(Object obj) {
        return this.a.get(obj);
    }

    public final ApplicationInfo b(String str, int i) {
        return ((Context) this.a).getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo c(String str, int i) {
        return ((Context) this.a).getPackageManager().getPackageInfo(str, i);
    }

    public final ghn d(gmi gmiVar) {
        return new ghn(gmiVar.d(), null, null, null) { // from class: gho
            public final /* synthetic */ ght a;

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ghn] */
            @Override // defpackage.ghn
            public final void a(Object obj) {
                fpp.this.a.a(this.a.a(((Float) obj).floatValue()));
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ghn] */
    public final ijk f() {
        return new ijk((ghn) this.a);
    }

    public fpp(lfb lfbVar) {
        this.a = (gja) lfbVar.d();
    }

    public fpp(Context context, byte[] bArr) {
        this.a = context.getApplicationContext();
    }

    public fpp(byte[] bArr) {
        this.a = new AtomicInteger(0);
    }
}
