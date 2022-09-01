package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: kju  reason: default package */
/* loaded from: classes.dex */
public abstract class kju {
    public static final /* synthetic */ int d = 0;
    private static volatile kjt e = null;
    private static volatile boolean f = false;
    final kjs b;
    final String c;
    private final Object i;
    private volatile int j = -1;
    private volatile Object k;
    private final boolean l;
    private static final Object a = new Object();
    private static final kkc g = new kkc(kkx.b);
    private static final AtomicInteger h = new AtomicInteger();

    static {
        new AtomicReference();
    }

    public kju(kjs kjsVar, String str, Object obj, boolean z) {
        if (kjsVar.b != null) {
            this.b = kjsVar;
            this.c = str;
            this.i = obj;
            this.l = z;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static kju b(kjs kjsVar, String str, Object obj, kjr kjrVar, boolean z) {
        return new kjq(kjsVar, str, obj, z, kjrVar);
    }

    public static void e() {
        h.incrementAndGet();
    }

    public static void f(Context context) {
        if (e == null) {
            Object obj = a;
            synchronized (obj) {
                if (e == null) {
                    synchronized (obj) {
                        kjt kjtVar = e;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (kjtVar == null || kjtVar.a != context) {
                            kix.b();
                            kjw.b();
                            kjd.c();
                            e = new kjt(context, jdg.n(new ihp(context, 18)));
                            e();
                        }
                    }
                }
            }
        }
    }

    private final String g(String str) {
        return str.isEmpty() ? this.c : str.concat(String.valueOf(this.c));
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Can't wrap try/catch for region: R(11:71|(1:73)(8:86|(1:88)(1:94)|89|(2:91|(1:93))|83|80|81|82)|74|75|76|77|(4:79|80|81|82)|83|80|81|82) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c() {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kju.c():java.lang.Object");
    }

    public final String d() {
        return g(this.b.d);
    }
}
