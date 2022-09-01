package defpackage;

import android.support.v7.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kr  reason: default package */
/* loaded from: classes.dex */
public final class kr implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    static final Comparator b = new kp(0);
    long d;
    public long e;
    public final ArrayList c = new ArrayList();
    private final ArrayList f = new ArrayList();

    private static final mo b(RecyclerView recyclerView, int i, long j) {
        int c = recyclerView.h.c();
        for (int i2 = 0; i2 < c; i2++) {
            mo j2 = RecyclerView.j(recyclerView.h.f(i2));
            if (j2.c == i && !j2.t()) {
                return null;
            }
        }
        me meVar = recyclerView.e;
        try {
            recyclerView.P();
            mo p = meVar.p(i, j);
            if (p != null) {
                if (!p.s() || p.t()) {
                    meVar.c(p, false);
                } else {
                    meVar.k(p.a);
                }
            }
            return p;
        } finally {
            recyclerView.R(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.p && this.d == 0) {
            this.d = RecyclerView.aq();
            recyclerView.post(this);
        }
        kq kqVar = recyclerView.I;
        kqVar.a = i;
        kqVar.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        djd djdVar;
        Object obj;
        WeakReference weakReference;
        RecyclerView recyclerView;
        djd djdVar2;
        long j = 0;
        try {
            if (this.c.isEmpty()) {
                this.d = 0L;
                return;
            }
            int size = this.c.size();
            long j2 = 0;
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView2 = (RecyclerView) this.c.get(i);
                if (recyclerView2.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView2.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.d = 0L;
                return;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.e;
            int size2 = this.c.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                RecyclerView recyclerView3 = (RecyclerView) this.c.get(i3);
                if (recyclerView3.getWindowVisibility() == 0) {
                    recyclerView3.I.c(recyclerView3, false);
                    i2 += recyclerView3.I.d;
                }
            }
            this.f.ensureCapacity(i2);
            int i4 = 0;
            int i5 = 0;
            while (i4 < size2) {
                RecyclerView recyclerView4 = (RecyclerView) this.c.get(i4);
                if (recyclerView4.getWindowVisibility() == 0) {
                    kq kqVar = recyclerView4.I;
                    int abs = Math.abs(kqVar.a) + Math.abs(kqVar.b);
                    int i6 = 0;
                    while (true) {
                        int i7 = kqVar.d;
                        if (i6 < i7 + i7) {
                            if (i5 >= this.f.size()) {
                                djdVar2 = new djd();
                                this.f.add(djdVar2);
                            } else {
                                djdVar2 = (djd) this.f.get(i5);
                            }
                            int[] iArr = kqVar.c;
                            try {
                                int i8 = iArr[i6 + 1];
                                djdVar2.d = i8 <= abs;
                                djdVar2.a = abs;
                                djdVar2.b = i8;
                                djdVar2.e = recyclerView4;
                                djdVar2.c = iArr[i6];
                                i5++;
                                i6 += 2;
                            } catch (Throwable th) {
                                th = th;
                                j = 0;
                                this.d = j;
                                throw th;
                            }
                        }
                    }
                }
                i4++;
                j = 0;
            }
            Collections.sort(this.f, b);
            for (int i9 = 0; i9 < this.f.size() && (obj = (djdVar = (djd) this.f.get(i9)).e) != null; i9++) {
                mo b2 = b((RecyclerView) obj, djdVar.c, true != djdVar.d ? nanos : Long.MAX_VALUE);
                if (b2 != null && (weakReference = b2.b) != null && b2.s() && !b2.t() && (recyclerView = (RecyclerView) weakReference.get()) != null) {
                    if (recyclerView.v && recyclerView.h.c() != 0) {
                        recyclerView.U();
                    }
                    kq kqVar2 = recyclerView.I;
                    kqVar2.c(recyclerView, true);
                    if (kqVar2.d != 0) {
                        ml mlVar = recyclerView.J;
                        ls lsVar = recyclerView.l;
                        mlVar.d = 1;
                        mlVar.e = lsVar.ha();
                        mlVar.g = false;
                        mlVar.h = false;
                        mlVar.i = false;
                        int i10 = 0;
                        while (true) {
                            int i11 = kqVar2.d;
                            if (i10 >= i11 + i11) {
                                break;
                            }
                            b(recyclerView, kqVar2.c[i10], nanos);
                            i10 += 2;
                        }
                    }
                }
                djdVar.d = false;
                djdVar.a = 0;
                djdVar.b = 0;
                djdVar.e = null;
                djdVar.c = 0;
            }
            this.d = 0L;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
