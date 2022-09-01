package defpackage;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* renamed from: gkb  reason: default package */
/* loaded from: classes.dex */
public final class gkb {
    public static boolean a = false;
    private static final String[] c = {"COLLECTION_BASIS_VERIFIER"};
    public static final Object b = new Object();

    public static void a(gjd gjdVar, oir oirVar) {
        Executor a2;
        gdh a3 = gdd.a(gjdVar.a);
        String concat = "com.google.android.libraries.consentverifier#".concat(String.valueOf(gjdVar.a.getPackageName()));
        gen c2 = a3.c(concat, oirVar.e(gjdVar.a), c, null);
        if (gjz.b(gjdVar.a)) {
            gjz gjzVar = gcn.a;
            a2 = gjz.e(10, Executors.defaultThreadFactory());
        } else {
            a2 = gkj.a();
        }
        try {
            c2.l(a2, new gka(a3, concat, a2, 0));
            c2.h(a2, new doq(concat, 13));
        } catch (RejectedExecutionException e) {
            Log.w("CBVerifier", String.format("Execution failure when updating phenotypeflags for %s. %s", concat, e));
        }
    }
}
