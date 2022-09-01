package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: eyf  reason: default package */
/* loaded from: classes.dex */
public final class eyf {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/superpacks/SanityCheckEvalSuperpacksManager");
    private static final Map i = new HashMap();
    public final Context b;
    public final bze c;
    public final Executor d;
    public final AtomicReference e = new AtomicReference();
    public final AtomicReference f = new AtomicReference();
    public final jan g;
    public final String h;

    private eyf(Context context, String str, bze bzeVar, jan janVar, Executor executor) {
        this.b = context;
        this.h = str;
        this.c = bzeVar;
        this.d = executor;
        this.g = janVar;
    }

    public static synchronized eyf a(Context context, String str) {
        synchronized (eyf.class) {
            Map map = i;
            eyf eyfVar = (eyf) map.get(str);
            if (eyfVar == null) {
                eyf eyfVar2 = new eyf(context, str, bzd.a(context.getApplicationContext()), jan.b, gxo.a(10));
                map.put(str, eyfVar2);
                bze bzeVar = eyfVar2.c;
                bzt a2 = bzu.a("sanitycheckevaluation");
                a2.e = 100;
                a2.f = 100;
                bzeVar.i(a2.a());
                return eyfVar2;
            }
            return eyfVar;
        }
    }
}
