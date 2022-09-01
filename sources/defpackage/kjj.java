package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: kjj  reason: default package */
/* loaded from: classes.dex */
public final class kjj {
    public static Context b;
    private static volatile kjj d;
    private static volatile kjj e;
    public final Context c;
    private final lgb g;
    private final lgb h;
    private final lfb i;
    private final lgb j;
    public static final Object a = new Object();
    private static final lgb f = jdg.n(jgf.i);

    public kjj(Context context) {
        lgb lgbVar = f;
        lgb n = jdg.n(new ihp(context, 16));
        lfb g = lfb.g(new kkq(lgbVar));
        lgb n2 = jdg.n(new ihp(context, 17));
        Context applicationContext = context.getApplicationContext();
        jdg.u(applicationContext);
        jdg.u(lgbVar);
        jdg.u(n);
        jdg.u(n2);
        this.c = applicationContext;
        this.g = jdg.n(lgbVar);
        this.h = jdg.n(n);
        this.i = g;
        this.j = jdg.n(n2);
    }

    public static kjj a() {
        kjl.b = true;
        Context context = b;
        if (context == null) {
            kjl.a();
            if (kjl.c == null) {
                kjl.c = new kjk();
            }
            throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
        }
        return b(context);
    }

    public static kjj b(Context context) {
        kji kjiVar;
        Context applicationContext;
        kjl.a();
        kjj kjjVar = d;
        if (kjjVar == null) {
            synchronized (a) {
                kjjVar = d;
                if (kjjVar == null) {
                    Context applicationContext2 = context.getApplicationContext();
                    try {
                        applicationContext = applicationContext2.getApplicationContext();
                    } catch (IllegalStateException unused) {
                        kjiVar = null;
                    }
                    if (applicationContext instanceof npa) {
                        try {
                            kjiVar = (kji) kji.class.cast(((npa) applicationContext).a());
                            if (kjiVar == null && (applicationContext2 instanceof kji)) {
                                ((kji) applicationContext2).b();
                            }
                            kjjVar = new kjj(applicationContext2);
                            d = kjjVar;
                        } catch (ClassCastException e2) {
                            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e2);
                        }
                    } else {
                        throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(String.valueOf(applicationContext.getClass()))));
                    }
                }
            }
        }
        return kjjVar;
    }

    public static void f() {
        kjl.a();
        if (b == null && kjl.a == null) {
            kjl.a = new kjk();
        }
    }

    public final kjz c() {
        return (kjz) this.h.a();
    }

    public final kkv d() {
        return (kkv) ((lfm) this.i).a;
    }

    public final mks e() {
        return (mks) this.g.a();
    }

    public final kcq g() {
        return (kcq) this.j.a();
    }
}
