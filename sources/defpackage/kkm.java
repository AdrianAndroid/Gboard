package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: PG */
/* renamed from: kkm  reason: default package */
/* loaded from: classes.dex */
public final class kkm {
    private static final Object f = new Object();
    private static volatile Map g;
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public kkm(Context context, kkn kknVar) {
        this.a = kknVar.b ? kjg.b(context, kknVar.a) : kknVar.a;
        int y = kcu.y(kknVar.c);
        this.e = y == 0 ? 1 : y;
        this.b = kknVar.f;
        this.c = kknVar.d;
        this.d = kknVar.e;
    }

    public static Map a(Context context) {
        String[] list;
        Map map = g;
        if (map == null) {
            synchronized (f) {
                map = g;
                if (map == null) {
                    lls h = llw.h();
                    try {
                        for (String str : context.getAssets().list("phenotype")) {
                            if (str.endsWith("_package_metadata.binarypb")) {
                                try {
                                    InputStream open = context.getAssets().open("phenotype/" + str);
                                    try {
                                        kkm kkmVar = new kkm(context, (kkn) nfm.x(kkn.g, open, nfb.b()));
                                        h.a(kkmVar.a, kkmVar);
                                        if (open != null) {
                                            open.close();
                                        }
                                    } catch (Throwable th) {
                                        if (open != null) {
                                            try {
                                                open.close();
                                            } catch (Throwable th2) {
                                                try {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        throw th;
                                        break;
                                    }
                                } catch (ngd e) {
                                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata for " + str, e);
                                }
                            }
                        }
                    } catch (IOException e2) {
                        Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e2);
                    }
                    llw l = h.l();
                    g = l;
                    map = l;
                }
            }
        }
        return map;
    }
}
