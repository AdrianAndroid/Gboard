package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: orb  reason: default package */
/* loaded from: classes2.dex */
public final class orb implements Closeable, Flushable {
    static final Pattern a = Pattern.compile("[a-z0-9_-]{1,120}");
    final otm b;
    final File c;
    public ous e;
    public int g;
    boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    private final File m;
    private final File n;
    private final File o;
    private final long q;
    private final Executor t;
    private long r = 0;
    final LinkedHashMap f = new LinkedHashMap(0, 0.75f, true);
    private long s = 0;
    private final Runnable u = new obv(this, 19);
    private final int p = 201105;
    final int d = 2;

    public orb(otm otmVar, File file, long j, Executor executor) {
        this.b = otmVar;
        this.c = file;
        this.m = new File(file, "journal");
        this.n = new File(file, "journal.tmp");
        this.o = new File(file, "journal.bkp");
        this.q = j;
        this.t = executor;
    }

    public static orb i(otm otmVar, File file, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        return new orb(otmVar, file, j, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), oqs.o("OkHttp DiskLruCache", true)));
    }

    private final ous l() {
        ovn a2;
        File file = this.m;
        try {
            a2 = ovb.a(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            a2 = ovb.a(file);
        }
        return oix.d(new oqw(this, a2));
    }

    private final synchronized void m() {
        if (g()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x010b, code lost:
        throw new java.io.IOException("unexpected journal line: ".concat(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void n() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.orb.n():void");
    }

    private static final void o(String str) {
        if (a.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    public final synchronized oqy a(String str, long j) {
        d();
        m();
        o(str);
        oqz oqzVar = (oqz) this.f.get(str);
        if (j == -1 || (oqzVar != null && oqzVar.g == j)) {
            if (oqzVar != null && oqzVar.f != null) {
                return null;
            }
            if (!this.k && !this.l) {
                ous ousVar = this.e;
                ousVar.aa("DIRTY");
                ousVar.X(32);
                ousVar.aa(str);
                ousVar.X(10);
                this.e.flush();
                if (this.h) {
                    return null;
                }
                if (oqzVar == null) {
                    oqzVar = new oqz(this, str);
                    this.f.put(str, oqzVar);
                }
                oqy oqyVar = new oqy(this, oqzVar);
                oqzVar.f = oqyVar;
                return oqyVar;
            }
            this.t.execute(this.u);
            return null;
        }
        return null;
    }

    public final synchronized ora b(String str) {
        d();
        m();
        o(str);
        oqz oqzVar = (oqz) this.f.get(str);
        if (oqzVar != null && oqzVar.e) {
            ora a2 = oqzVar.a();
            if (a2 == null) {
                return null;
            }
            this.g++;
            ous ousVar = this.e;
            ousVar.aa("READ");
            ousVar.X(32);
            ousVar.aa(str);
            ousVar.X(10);
            if (h()) {
                this.t.execute(this.u);
            }
            return a2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(oqy oqyVar, boolean z) {
        oqz oqzVar = oqyVar.a;
        if (oqzVar.f != oqyVar) {
            throw new IllegalStateException();
        }
        if (z && !oqzVar.e) {
            for (int i = 0; i < this.d; i++) {
                if (oqyVar.b[i]) {
                    if (!oqzVar.d[i].exists()) {
                        oqyVar.b();
                        return;
                    }
                } else {
                    oqyVar.b();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
            }
        }
        for (int i2 = 0; i2 < this.d; i2++) {
            File file = oqzVar.d[i2];
            if (z) {
                if (file.exists()) {
                    File file2 = oqzVar.c[i2];
                    this.b.d(file, file2);
                    long j = oqzVar.b[i2];
                    long length = file2.length();
                    oqzVar.b[i2] = length;
                    this.r = (this.r - j) + length;
                }
            } else {
                this.b.b(file);
            }
        }
        this.g++;
        oqzVar.f = null;
        if (oqzVar.e | z) {
            oqzVar.e = true;
            ous ousVar = this.e;
            ousVar.aa("CLEAN");
            ousVar.X(32);
            this.e.aa(oqzVar.a);
            oqzVar.b(this.e);
            this.e.X(10);
            if (z) {
                long j2 = this.s;
                this.s = 1 + j2;
                oqzVar.g = j2;
            }
        } else {
            this.f.remove(oqzVar.a);
            ous ousVar2 = this.e;
            ousVar2.aa("REMOVE");
            ousVar2.X(32);
            this.e.aa(oqzVar.a);
            this.e.X(10);
        }
        this.e.flush();
        if (this.r <= this.q && !h()) {
            return;
        }
        this.t.execute(this.u);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.i && !this.j) {
            for (oqz oqzVar : (oqz[]) this.f.values().toArray(new oqz[this.f.size()])) {
                oqy oqyVar = oqzVar.f;
                if (oqyVar != null) {
                    oqyVar.b();
                }
            }
            f();
            this.e.close();
            this.e = null;
            this.j = true;
            return;
        }
        this.j = true;
    }

    public final synchronized void d() {
        if (this.i) {
            return;
        }
        if (this.o.exists()) {
            if (this.m.exists()) {
                this.b.b(this.o);
            } else {
                this.b.d(this.o, this.m);
            }
        }
        if (this.m.exists()) {
            try {
                n();
                this.b.b(this.n);
                Iterator it = this.f.values().iterator();
                while (it.hasNext()) {
                    oqz oqzVar = (oqz) it.next();
                    if (oqzVar.f == null) {
                        for (int i = 0; i < this.d; i++) {
                            this.r += oqzVar.b[i];
                        }
                    } else {
                        oqzVar.f = null;
                        for (int i2 = 0; i2 < this.d; i2++) {
                            this.b.b(oqzVar.c[i2]);
                            this.b.b(oqzVar.d[i2]);
                        }
                        it.remove();
                    }
                }
                this.i = true;
                return;
            } catch (IOException e) {
                otu.c.h(5, "DiskLruCache " + String.valueOf(this.c) + " is corrupt: " + e.getMessage() + ", removing", e);
                close();
                this.b.c(this.c);
                this.j = false;
            }
        }
        e();
        this.i = true;
    }

    public final synchronized void e() {
        ous ousVar = this.e;
        if (ousVar != null) {
            ousVar.close();
        }
        ous d = oix.d(this.b.a(this.n));
        d.aa("libcore.io.DiskLruCache");
        d.X(10);
        d.aa("1");
        d.X(10);
        d.Z(this.p);
        d.X(10);
        d.Z(this.d);
        d.X(10);
        d.X(10);
        for (oqz oqzVar : this.f.values()) {
            if (oqzVar.f != null) {
                d.aa("DIRTY");
                d.X(32);
                d.aa(oqzVar.a);
                d.X(10);
            } else {
                d.aa("CLEAN");
                d.X(32);
                d.aa(oqzVar.a);
                oqzVar.b(d);
                d.X(10);
            }
        }
        d.close();
        if (this.m.exists()) {
            this.b.d(this.m, this.o);
        }
        this.b.d(this.n, this.m);
        this.b.b(this.o);
        this.e = l();
        this.h = false;
        this.l = false;
    }

    public final void f() {
        while (this.r > this.q) {
            k((oqz) this.f.values().iterator().next());
        }
        this.k = false;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.i) {
            return;
        }
        m();
        f();
        this.e.flush();
    }

    public final synchronized boolean g() {
        return this.j;
    }

    public final boolean h() {
        int i = this.g;
        return i >= 2000 && i >= this.f.size();
    }

    public final synchronized void j(String str) {
        d();
        m();
        o(str);
        oqz oqzVar = (oqz) this.f.get(str);
        if (oqzVar == null) {
            return;
        }
        k(oqzVar);
        if (this.r > this.q) {
            return;
        }
        this.k = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(oqz oqzVar) {
        oqy oqyVar = oqzVar.f;
        if (oqyVar != null) {
            oqyVar.d();
        }
        for (int i = 0; i < this.d; i++) {
            this.b.b(oqzVar.c[i]);
            long j = this.r;
            long[] jArr = oqzVar.b;
            this.r = j - jArr[i];
            jArr[i] = 0;
        }
        this.g++;
        ous ousVar = this.e;
        ousVar.aa("REMOVE");
        ousVar.X(32);
        ousVar.aa(oqzVar.a);
        ousVar.X(10);
        this.f.remove(oqzVar.a);
        if (h()) {
            this.t.execute(this.u);
        }
    }
}
