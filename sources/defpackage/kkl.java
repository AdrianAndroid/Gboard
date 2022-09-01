package defpackage;

import android.util.Log;
import j$.util.Objects;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: kkl  reason: default package */
/* loaded from: classes.dex */
public final class kkl {
    public static final kcl i = new kcl((byte[]) null);
    public final kjj a;
    public final String b;
    public volatile String f;
    public final kle g;
    public final String c = "";
    public final boolean e = false;
    final kkw d = new kkw(new ihp(this, 19));
    final kcl h = new kcl();

    public kkl(kjj kjjVar, String str, boolean z) {
        this.a = kjjVar;
        this.b = str;
        this.g = new kle(kjjVar, str, "", z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, java.lang.Object] */
    public final Object a(String str) {
        Object obj;
        kkw kkwVar = this.d;
        Map map = kkwVar.b;
        if (map == null) {
            synchronized (kkwVar.a) {
                Map map2 = kkwVar.b;
                Map map3 = map2;
                if (map2 == null) {
                    ?? a = kkwVar.c.a();
                    kkwVar.b = a;
                    kkwVar.c = null;
                    map3 = a;
                }
                obj = map3.get(str);
            }
            return obj;
        }
        return map.get(str);
    }

    public final mko b() {
        if (this.f.isEmpty()) {
            return mkk.a;
        }
        return mhu.h(this.a.c().a(this.f), kka.class, new jzh(this, 3), this.a.e());
    }

    public final void c() {
        mko b = this.g.b(this.c);
        kle kleVar = this.g;
        Objects.requireNonNull(kleVar);
        mio.h(b, new jzh(kleVar, 2), this.a.e()).d(new kht(this, b, 4), this.a.e());
    }

    public final /* synthetic */ void d(mko mkoVar) {
        try {
            llw a = kle.a((klf) kcu.S(mkoVar));
            kkw kkwVar = this.d;
            synchronized (kkwVar.a) {
                if (kkwVar.b != null) {
                    boolean equals = kkwVar.b.equals(a);
                    if (!equals) {
                        this.a.d();
                        this.a.d().a();
                        return;
                    }
                } else {
                    kkwVar.b = a;
                    kkwVar.c = null;
                }
                ((AtomicInteger) this.h.a).incrementAndGet();
            }
        } catch (CancellationException | ExecutionException e) {
            String str = this.b;
            Log.w("MobStoreFlagStore", "Unable to update local snapshot for " + str + ", may result in stale flags.", e);
        }
    }
}
