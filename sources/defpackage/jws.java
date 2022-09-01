package defpackage;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: jws  reason: default package */
/* loaded from: classes.dex */
public final class jws implements jty, jtb {
    public static final lzh a = new jwo();
    public final ScheduledExecutorService b;
    private final List f;
    public final jls e = jls.e();
    public final Map c = new HashMap();

    public jws(ScheduledExecutorService scheduledExecutorService, List list) {
        this.b = scheduledExecutorService;
        this.f = list;
    }

    @Override // defpackage.jty
    public final jtv a(juc jucVar) {
        if (jucVar.g().isEmpty()) {
            return null;
        }
        try {
            f((String) lre.ao(jucVar.g()));
            return jtv.b(jucVar);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // defpackage.jrs
    public final mko b(jsr jsrVar) {
        mld mldVar;
        lug lugVar = jsh.a;
        synchronized (this) {
            jwr jwrVar = (jwr) this.c.get(jsrVar);
            if (jwrVar == null) {
                return kcu.K(null);
            }
            synchronized (jwrVar) {
                mldVar = jwrVar.g;
                if (mldVar == null) {
                    jwrVar.a.a(jwrVar.d);
                    jwrVar.g = mld.e();
                    mldVar = jwrVar.g;
                }
            }
            return mldVar;
        }
    }

    @Override // defpackage.jty
    public final mko c(juc jucVar, jtw jtwVar, File file) {
        mko mkoVar;
        llp g = jucVar.g();
        String str = (String) lre.ao(g);
        lug lugVar = jsh.a;
        if (!g.isEmpty()) {
            synchronized (this) {
                jwr jwrVar = (jwr) this.c.get(jucVar.o());
                if (jwrVar == null) {
                    if (jtwVar == null) {
                        jtwVar = jtw.f;
                    }
                    jwr jwrVar2 = new jwr(this, f(str), jucVar, jtwVar, file);
                    this.c.put(jucVar.o(), jwrVar2);
                    synchronized (jwrVar2) {
                        ihp ihpVar = new ihp(jwrVar2, 7);
                        lzd lzdVar = new lzd(((lrl) jwrVar2.b.g()).c);
                        lfe lfeVar = jwrVar2.e;
                        ScheduledExecutorService scheduledExecutorService = jwrVar2.i.b;
                        lzh lzhVar = a;
                        Object obj = lzi.a;
                        lgh lghVar = lgh.a;
                        lfb g2 = lfb.g(scheduledExecutorService);
                        jdg.G(true, "Either executor or scheduledExecutorService needs to be set.");
                        Object obj2 = ((lfm) g2).a;
                        jwrVar2.h = lvw.A(new lzi(ihpVar, lzdVar, lfeVar, (Executor) obj2, (ScheduledExecutorService) obj2, lghVar, lzhVar), new jiz(jwrVar2, 3), jwrVar2.i.b);
                    }
                    jwrVar = jwrVar2;
                }
                synchronized (jwrVar) {
                    mkoVar = jwrVar.h;
                }
            }
            return mkoVar;
        }
        throw new IllegalArgumentException("Manifest has no download URLs");
    }

    @Override // defpackage.jsj
    public final String d() {
        return "DownloadFetcher";
    }

    @Override // defpackage.jtb
    public final void e(PrintWriter printWriter, boolean z) {
        synchronized (this) {
            printWriter.println("## DownloadFetcher status report");
            jti a2 = jtj.a();
            a2.b('|');
            printWriter.println("Ongoing downloads:");
            jth a3 = jtq.a();
            a2.a = "pack";
            a3.b(a2.a());
            a2.a = "file";
            a3.b(a2.a());
            a3.b = "-There are no ongoing downloads-";
            for (Map.Entry entry : this.c.entrySet()) {
                a3.c(entry.getKey(), ((jwr) entry.getValue()).d.getName());
            }
            a3.a().m(printWriter);
        }
    }

    final jwu f(String str) {
        for (jwu jwuVar : this.f) {
            if (str != null && jwuVar.b(str)) {
                return jwuVar;
            }
        }
        throw new IllegalArgumentException(String.format("No registered download protocol could support URL %s", str));
    }
}
