package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jwz  reason: default package */
/* loaded from: classes.dex */
public final class jwz {
    public final mkr b;
    public final jvr c;
    public final int d;
    public final opu f;
    public final Map a = new HashMap();
    public final jls e = jls.e();

    public jwz(jvr jvrVar, mkr mkrVar, opu opuVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = jvrVar;
        this.b = mkrVar;
        this.f = opuVar;
        this.d = i;
    }

    public static final mko g(juc jucVar) {
        lug lugVar = jsh.c;
        jucVar.o();
        return kcu.K(null);
    }

    private final mko h(juc jucVar, File file, jsr jsrVar, jwy jwyVar) {
        jsr o = jucVar.o();
        if (this.c.a(jsrVar) > this.d) {
            return kcu.J(new jtz(String.format(Locale.US, "Validation for pack %s has failed more times than maximum allowed of %d", o, Integer.valueOf(this.d))));
        }
        return c(((jwv) jwyVar.a).f().entrySet().iterator(), jucVar, file, jsrVar, jwyVar);
    }

    public final mko a(jsr jsrVar, jsr jsrVar2, jsr jsrVar3, jwy jwyVar) {
        jwv jwvVar = (jwv) jwyVar.a;
        juc f = jwvVar.d().f();
        File g = this.c.g(jsrVar);
        if (jwvVar.b().b == null) {
            lug lugVar = jsh.c;
            return mio.h(h(f, g, jsrVar, jwyVar), new fem(this, f, jsrVar, jsrVar3, 19), this.b);
        }
        return mio.h(h(f, g, jsrVar, jwyVar), new jww(this, jsrVar, jsrVar2, jwyVar, f, jsrVar3, 0), this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mko b(defpackage.jwy r18) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwz.b(jwy):mko");
    }

    public final mko c(Iterator it, juc jucVar, File file, jsr jsrVar, jwy jwyVar) {
        if (!it.hasNext()) {
            return kcu.K(null);
        }
        jsr o = jucVar.o();
        Map.Entry entry = (Map.Entry) it.next();
        jwf jwfVar = (jwf) entry.getValue();
        String str = (String) entry.getKey();
        lug lugVar = jsh.c;
        jtq.g(file);
        lwm.s(jwfVar);
        jdg.u(str);
        return kcu.L(mio.h(mhu.h(jwfVar.a(jucVar, str, file), Throwable.class, new kkt(this, jsrVar, o, jucVar, 1), this.b), new jww(this, jwyVar, it, jucVar, file, jsrVar, 3), this.b));
    }

    public final void d(jsr jsrVar, jsr jsrVar2, juc jucVar) {
        File g = this.c.g(jsrVar);
        File g2 = this.c.g(jsrVar2);
        jvr jvrVar = this.c;
        jvrVar.p(jsrVar2, jvrVar.j(jsrVar));
        jtr e = jucVar.e();
        if (e != null) {
            this.c.q(jsrVar2, e);
        }
        if (jucVar.m()) {
            f(g2, jucVar.d());
        }
        if (jsrVar.equals(jsrVar2) || !g.exists()) {
            return;
        }
        jvr jvrVar2 = this.c;
        jvrVar2.g.b(((jrh) jsrVar).a, jvrVar2.h(jsrVar), jxz.DELETE_FETCHED);
    }

    public final void e(juc jucVar, jsr jsrVar, jsr jsrVar2) {
        File g = this.c.g(jsrVar2);
        File g2 = this.c.g(jsrVar);
        d(jsi.a(jucVar.o(), jucVar.k()), jsrVar, jucVar);
        lug lugVar = jsh.c;
        jucVar.o();
        jtq.g(g2);
        jtq.g(g);
        this.c.r(jsrVar2, jxz.INVALID_UNSTAGED_FILE, false);
        jvr jvrVar = this.c;
        jvrVar.p(jsrVar2, jvrVar.j(jsrVar));
        jtr e = jucVar.e();
        if (e != null) {
            this.c.q(jsrVar2, e);
        }
        if (g2.renameTo(g)) {
            synchronized (this) {
            }
            return;
        }
        String obj = g2.toString();
        String obj2 = g.toString();
        throw new IOException("Failed to rename staged file " + obj + " to " + obj2);
    }

    public final void f(File file, long j) {
        if (!file.exists()) {
            String obj = file.toString();
            throw new jxb("File " + obj + " does not exist");
        }
        long a = this.c.g.a(file);
        if (a == j) {
            return;
        }
        String obj2 = file.toString();
        throw new jxb("File " + obj2 + " does not have the expected size: " + j + ", actual: " + a);
    }
}
