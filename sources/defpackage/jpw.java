package defpackage;

import android.util.LruCache;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jpw  reason: default package */
/* loaded from: classes.dex */
public final class jpw implements jtb {
    public final jqa a;
    public final Map b;
    private final LruCache c;

    public jpw(jqa jqaVar, Map map) {
        this.a = jqaVar;
        this.b = map;
    }

    public jpw(jqa jqaVar, Map map, byte[] bArr) {
        this(jqaVar, map);
        this.c = new LruCache(32);
    }

    public final jqm a(String str, int i, File file, boolean z) {
        jpv jpvVar;
        lyu a;
        synchronized (this) {
            jpv jpvVar2 = (jpv) this.c.get(file);
            if (!file.exists()) {
                if (jpvVar2 != null) {
                    this.c.remove(file);
                }
                return null;
            }
            if (jpvVar2 != null && file.lastModified() > jpvVar2.a) {
                this.c.remove(file);
                jpvVar2 = null;
            }
            if (jpvVar2 == null) {
                if (z) {
                    return null;
                }
                try {
                    a = lyu.a();
                } catch (jpz e) {
                    jpvVar = new jpv(e, file.lastModified());
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    a.d(fileInputStream);
                    jqa jqaVar = (jqa) this.b.get(str);
                    if (jqaVar == null) {
                        jqaVar = this.a;
                    }
                    lug lugVar = jsh.a;
                    jtq.g(file);
                    jpvVar = new jpv(jqaVar.w(fileInputStream, str, i), file.lastModified());
                    jpvVar2 = jpvVar;
                    this.c.put(file, jpvVar2);
                } finally {
                }
            }
            Object obj = jpvVar2.c;
            if (obj == null) {
                return (jqm) jpvVar2.b;
            }
            throw ((Throwable) obj);
        }
    }

    public final void b(String str) {
        synchronized (this) {
            for (Map.Entry entry : this.c.snapshot().entrySet()) {
                Object obj = ((jpv) entry.getValue()).b;
                if (obj == null || ((jrn) ((jqm) obj).e()).a.equals(str)) {
                    this.c.remove((File) entry.getKey());
                }
            }
        }
    }

    @Override // defpackage.jtb
    public final void e(PrintWriter printWriter, boolean z) {
        synchronized (this) {
            printWriter.println("## Manifest parsers");
            printWriter.println();
            jti a = jtj.a();
            a.b('|');
            jth a2 = jtq.a();
            a.a = "namespace";
            a2.b(a.a());
            a.a = "parser";
            a2.b(a.a());
            a2.b = "-There are manifest parsers-";
            a2.c("<default>", lwm.s(this.a));
            for (Map.Entry entry : this.b.entrySet()) {
                a2.c(entry.getKey(), lwm.s((jqa) entry.getValue()));
            }
            a2.a().m(printWriter);
        }
    }
}
