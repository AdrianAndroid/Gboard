package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: lbs  reason: default package */
/* loaded from: classes.dex */
public final class lbs implements lay {
    public static final long a = TimeUnit.SECONDS.toMillis(1);
    public final Context b;
    public final Executor c;
    private final lav i;
    private final nox j;
    private final File k;
    private final lbi o;
    private final Handler h = new Handler(Looper.getMainLooper());
    private final AtomicReference l = new AtomicReference();
    private final Set m = Collections.synchronizedSet(new HashSet());
    private final Set n = Collections.synchronizedSet(new HashSet());
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final jlt g = new jlt((byte[]) null);
    public final jlt f = new jlt((byte[]) null);
    public final lan d = lar.a;

    public lbs(Context context, File file, lav lavVar, nox noxVar) {
        Executor c = laq.c();
        lbi lbiVar = new lbi(context, (byte[]) null);
        this.b = context;
        this.k = file;
        this.i = lavVar;
        this.j = noxVar;
        this.c = c;
        this.o = lbiVar;
    }

    public static String i(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    private final gen n(final int i) {
        o(new lbr() { // from class: lbp
            @Override // defpackage.lbr
            public final lbh a(lbh lbhVar) {
                int i2 = i;
                long j = lbs.a;
                if (lbhVar == null) {
                    return null;
                }
                return lbh.a(lbhVar.a, 6, i2, lbhVar.c, lbhVar.d, lbhVar.d(), lbhVar.c());
            }
        });
        return gni.d(new lau(i));
    }

    private final synchronized lbh o(lbr lbrVar) {
        lbh h = h();
        lbh a2 = lbrVar.a(h);
        AtomicReference atomicReference = this.l;
        while (!atomicReference.compareAndSet(h, a2)) {
            if (atomicReference.get() != h) {
                return null;
            }
        }
        return a2;
    }

    private final lbi p() {
        lbi f = this.i.f();
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
    }

    @Override // defpackage.lay
    public final gen a(List list) {
        return gni.d(new lau(-5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0160, code lost:
        if (r2.contains(r13) == false) goto L54;
     */
    @Override // defpackage.lay
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.gen b(final defpackage.lbb r22) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbs.b(lbb):gen");
    }

    @Override // defpackage.lay
    public final Set c() {
        HashSet hashSet = new HashSet();
        if (this.i.c() != null) {
            hashSet.addAll(this.i.c());
        }
        hashSet.addAll(this.n);
        return hashSet;
    }

    @Override // defpackage.lay
    public final Set d() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.i.b());
        hashSet.addAll(this.m);
        return hashSet;
    }

    @Override // defpackage.lay
    public final void e(hgo hgoVar) {
        this.g.i(hgoVar);
    }

    @Override // defpackage.lay
    public final void f(hgo hgoVar) {
        this.g.j(hgoVar);
    }

    @Override // defpackage.lay
    public final boolean g(lbh lbhVar, Activity activity) {
        return false;
    }

    public final lbh h() {
        return (lbh) this.l.get();
    }

    public final void j(List list, List list2, List list3, long j, boolean z) {
        this.d.a().b(list, new lbq(this, list2, list3, j, z, list));
    }

    public final void k(List list, List list2, long j) {
        this.m.addAll(list);
        this.n.addAll(list2);
        Long valueOf = Long.valueOf(j);
        m(5, 0, valueOf, valueOf, null, null, null);
    }

    public final void l(int i) {
        m(6, i, null, null, null, null, null);
    }

    public final void m(final int i, final int i2, final Long l, final Long l2, final List list, final Integer num, final List list2) {
        lbh o = o(new lbr() { // from class: lbm
            @Override // defpackage.lbr
            public final lbh a(lbh lbhVar) {
                long longValue;
                long longValue2;
                Integer num2 = num;
                int i3 = i;
                int i4 = i2;
                Long l3 = l;
                Long l4 = l2;
                List list3 = list;
                List list4 = list2;
                long j = lbs.a;
                lbh a2 = lbhVar == null ? lbh.a(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : lbhVar;
                int intValue = num2 == null ? a2.a : num2.intValue();
                if (l3 == null) {
                    longValue = a2.c;
                } else {
                    longValue = l3.longValue();
                }
                if (l4 == null) {
                    longValue2 = a2.d;
                } else {
                    longValue2 = l4.longValue();
                }
                return lbh.a(intValue, i3, i4, longValue, longValue2, list3 == null ? a2.d() : list3, list4 == null ? a2.c() : list4);
            }
        });
        if (o != null) {
            this.h.post(new kht(this, o, 11));
        }
    }
}
