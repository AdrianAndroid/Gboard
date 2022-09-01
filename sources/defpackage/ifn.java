package defpackage;

import android.content.Context;
import android.util.Printer;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: ifn  reason: default package */
/* loaded from: classes.dex */
public final class ifn implements hho, inm, gzv {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/metricstracker/TypingMetricsTracker");
    public static final hhl b = hhq.a("enable_slowness_detect", false);
    public static final hic c = hhq.k("slowness_detect_strategy", ifi.e);
    public static final hhl d = hhq.a("show_slowness_report_ui", false);
    public static final hhl e = hhq.a("reset_typing_latency", false);
    private final idk A;
    private final ifm B;
    public final int n;
    public final int o;
    public final int p;
    public final AtomicInteger u;
    public final Context x;
    public final ino y;
    private volatile ifi z;
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicInteger g = new AtomicInteger(0);
    public final AtomicInteger h = new AtomicInteger(0);
    public final AtomicInteger i = new AtomicInteger(0);
    public final AtomicInteger j = new AtomicInteger(0);
    public final AtomicInteger k = new AtomicInteger(0);
    public final AtomicInteger l = new AtomicInteger(0);
    public final AtomicInteger m = new AtomicInteger(0);
    public final AtomicInteger q = new AtomicInteger(0);
    public final AtomicInteger r = new AtomicInteger(0);
    public final AtomicInteger s = new AtomicInteger(0);
    public final AtomicInteger t = new AtomicInteger(0);
    public volatile long v = 0;
    public volatile boolean w = false;

    public ifn(int i, int i2, int i3, Context context) {
        ino M = ino.M(context);
        ieh j = ieh.j();
        this.n = i;
        this.o = i2;
        this.p = i3;
        this.x = context;
        this.y = M;
        this.A = j;
        this.B = new ifm(context, j);
        this.u = new AtomicInteger(M.b("pref_key_slowness_reported_times", 0));
        gzt.a.a(this);
    }

    private final void f() {
        this.z = null;
        this.q.set(0);
        this.g.set(0);
        this.s.set(0);
        this.k.set(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g(defpackage.ifi r19, final boolean r20) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ifn.g(ifi, boolean):void");
    }

    public final void c(long j) {
        if (j <= 0) {
            return;
        }
        if (j < this.n) {
            this.j.incrementAndGet();
        } else if (j < this.o) {
            this.k.incrementAndGet();
        } else if (j < this.p) {
            this.l.incrementAndGet();
        } else {
            this.m.incrementAndGet();
        }
        ifi ifiVar = this.z;
        if (ifiVar == null || (ifiVar.a & 1) == 0) {
            return;
        }
        ifj ifjVar = ifiVar.b;
        if (ifjVar == null) {
            ifjVar = ifj.g;
        }
        int i = ifjVar.f;
        if (i <= 0) {
            return;
        }
        this.s.incrementAndGet();
        if (j >= i) {
            this.t.incrementAndGet();
        }
        ifj ifjVar2 = ifiVar.b;
        if (ifjVar2 == null) {
            ifjVar2 = ifj.g;
        }
        int i2 = ifjVar2.c;
        int i3 = ifjVar2.e;
        if (i2 <= 0 || i3 <= 0 || this.s.get() < i2) {
            return;
        }
        this.s.set(0);
        if (this.t.getAndSet(0) < i3) {
            return;
        }
        g(ifiVar, false);
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/metricstracker/TypingMetricsTracker", "trackTextCandidatesUpdatedLatency", 300, "TypingMetricsTracker.java")).t("Detected typing slowness of candidate update.");
    }

    public final void d(long j) {
        if (j < this.n) {
            this.f.incrementAndGet();
        } else if (j < this.o) {
            this.g.incrementAndGet();
        } else if (j < this.p) {
            this.h.incrementAndGet();
        } else {
            this.i.incrementAndGet();
        }
        ifi ifiVar = this.z;
        if (ifiVar == null || (ifiVar.a & 1) == 0) {
            return;
        }
        ifj ifjVar = ifiVar.b;
        if (ifjVar == null) {
            ifjVar = ifj.g;
        }
        int i = ifjVar.d;
        if (i <= 0) {
            return;
        }
        this.q.incrementAndGet();
        if (j >= i) {
            this.r.incrementAndGet();
        }
        ifj ifjVar2 = ifiVar.b;
        if (ifjVar2 == null) {
            ifjVar2 = ifj.g;
        }
        int i2 = ifjVar2.a;
        int i3 = ifjVar2.b;
        if (i2 <= 0 || i3 <= 0 || this.q.get() < i2) {
            return;
        }
        this.q.set(0);
        if (this.r.getAndSet(0) < i3) {
            return;
        }
        g(ifiVar, true);
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/metricstracker/TypingMetricsTracker", "trackTextUpdatedLatency", 248, "TypingMetricsTracker.java")).t("Detected typing slowness of text update.");
    }

    public final void e() {
        if (!((Boolean) b.c()).booleanValue()) {
            f();
            return;
        }
        ifi ifiVar = (ifi) c.j();
        if (ifiVar == null || (ifiVar.a & 1) == 0) {
            f();
        } else {
            this.z = ifiVar;
        }
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        e();
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "TypingMetricsTracker";
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        if (inoVar.al("pref_key_disable_typing_slowness_report_by_user", false, false)) {
            f();
            hhq.q(this);
            inoVar.af(this, "pref_key_disable_typing_slowness_report_by_user");
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        if (this.z == null || (this.z.a & 1) == 0) {
            printer.println("Typing metrics tracker with slowness detection disabled.");
            return;
        }
        ifj ifjVar = this.z.b;
        if (ifjVar == null) {
            ifjVar = ifj.g;
        }
        printer.println("TypingSlownessDetectStrategy: ");
        int i = this.z.c;
        printer.println("minimum_interval_since_last_report_in_minutes: " + i);
        int i2 = ifjVar.d;
        printer.println("typing_text_bad_threshold: " + i2);
        int i3 = ifjVar.b;
        printer.println("typing_text_bad_count_to_report: " + i3);
        int i4 = ifjVar.a;
        printer.println("typing_text_count_to_detect: " + i4);
        int i5 = ifjVar.f;
        printer.println("typing_candidate_bad_threshold: " + i5);
        int i6 = ifjVar.e;
        printer.println("typing_candidate_bad_count_to_report: " + i6);
        int i7 = ifjVar.c;
        printer.println("typing_candidate_count_to_detect: " + i7);
        int i8 = this.r.get();
        int i9 = this.q.get();
        printer.println("Text filed update latency: " + i8 + "/" + i9);
        int i10 = this.t.get();
        int i11 = this.s.get();
        printer.println("Candidates update latency: " + i10 + "/" + i11);
        int i12 = this.u.get();
        int i13 = this.z.d;
        printer.println("Reported times: " + i12 + ", max reported times: " + i13);
    }
}
