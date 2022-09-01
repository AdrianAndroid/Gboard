package defpackage;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jzc  reason: default package */
/* loaded from: classes.dex */
public final class jzc implements jty, jtb {
    public static final long a = TimeUnit.DAYS.toMillis(1);
    public final jux b;
    private jzm c;
    private final boolean e;
    private final long f;

    public jzc(jzb jzbVar) {
        this.c = jzbVar.b;
        this.b = jzbVar.c;
        this.e = jzbVar.d;
        this.f = jzbVar.e;
    }

    public static jzb f() {
        return new jzb();
    }

    public static jls i() {
        return jzg.d;
    }

    @Override // defpackage.jty
    public final jtv a(juc jucVar) {
        if (jucVar.g().isEmpty()) {
            lug lugVar = jsh.a;
            return null;
        }
        return jtv.b(jucVar);
    }

    @Override // defpackage.jrs
    public final synchronized mko b(jsr jsrVar) {
        lug lugVar = jsh.a;
        try {
            return jzg.a(this.c, this.b, jsrVar.toString(), System.currentTimeMillis());
        } catch (IOException | jzl e) {
            return kcu.J(e);
        }
    }

    @Override // defpackage.jty
    public final mko c(juc jucVar, jtw jtwVar, File file) {
        mko b;
        lug lugVar = jsh.a;
        jucVar.o();
        if (jucVar.g().isEmpty()) {
            throw new IllegalArgumentException("The pack manifest has no download URLs.");
        }
        if (jtwVar == null) {
            jtwVar = jtw.f;
        }
        String jsrVar = jucVar.o().toString();
        juv n = juw.n();
        n.c(jsrVar);
        n.a = jucVar.e();
        jts jtsVar = (jts) jtwVar;
        n.d(jtsVar.a.c(jucVar.a()));
        n.l(jucVar.g());
        n.j(System.currentTimeMillis());
        n.h(jtwVar.h(this.e));
        boolean z = false;
        n.f(jtsVar.b == 1);
        n.g(jtsVar.c == 1);
        if (jtsVar.d == 1) {
            z = true;
        }
        n.e(z);
        n.k(this.f);
        n.b(file.getAbsolutePath());
        int i = jtsVar.e;
        if (i == 0) {
            i = 2;
        }
        n.i(i);
        juu juuVar = new juu(n.a(), false, null, 0L, 0L);
        try {
            synchronized (this) {
                b = jzg.b(this.c, this.b, juuVar, System.currentTimeMillis());
            }
            jzg.d.a(new jpi(jucVar, juuVar, 7));
            return b;
        } catch (IOException e) {
            return kcu.J(e);
        } catch (jzl e2) {
            jzg.d.a(new jpi(jucVar, e2, 8));
            return kcu.J(e2);
        }
    }

    @Override // defpackage.jsj
    public final String d() {
        return "ScheduledDownloadFetcher";
    }

    @Override // defpackage.jtb
    public final void e(PrintWriter printWriter, boolean z) {
        printWriter.println("## ScheduledDownloadFetcher status report");
        printWriter.printf(Locale.US, "- requires charging: %b\n", false);
        printWriter.printf(Locale.US, "- requires unmetered: %b\n", Boolean.valueOf(this.e));
        printWriter.printf(Locale.US, "- requires idle: %b\n", false);
        printWriter.printf(Locale.US, "- requires battery-not-low: %b\n", false);
        printWriter.printf(Locale.US, "- scheduling flags: %s\n", jtq.m(2));
        printWriter.println();
        ((jvi) this.b).b.e(printWriter, z);
    }

    public final synchronized jzm g() {
        return this.c;
    }

    public final synchronized void h(jzm jzmVar) {
        this.c.b();
        this.c = jzmVar;
        jzg.e(jzmVar, this.b, null, SystemClock.currentThreadTimeMillis(), "scheduler changed");
    }
}
