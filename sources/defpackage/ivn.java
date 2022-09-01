package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ivn  reason: default package */
/* loaded from: classes.dex */
public final class ivn {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/localcomputation/BrellaInAppTrainerWrapper");
    public final Executor b;
    private final Context c;

    public ivn(Context context, Executor executor) {
        this.c = context;
        this.b = executor;
    }

    public final mko a(fwm fwmVar) {
        return gni.c(gbh.c(this.c, this.b, fwmVar));
    }
}
