package defpackage;

import android.content.ContentValues;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jvr  reason: default package */
/* loaded from: classes.dex */
public final class jvr implements jtb {
    public static final /* synthetic */ int o = 0;
    public final juq e;
    public final jtf f;
    public final jru g;
    public final File h;
    final jtc j;
    public long m;
    private final long q;
    private final jur r;
    static final lfe a = dyv.s;
    private static final long p = TimeUnit.DAYS.toMillis(2);
    public final Object b = new Object();
    public final Map c = new HashMap();
    public final Map k = new HashMap();
    public final long l = p;
    public final jls n = jls.f(mjl.a);
    public final jvu i = new jvu(new opu(this), jky.n, null, null, null);

    private jvr(File file, juq juqVar, jtf jtfVar, jru jruVar, long j, jtc jtcVar) {
        this.f = jtfVar;
        this.g = jruVar;
        this.h = file;
        this.e = juqVar;
        this.q = j;
        this.j = jtcVar;
        this.r = new jur(file, jruVar, 1);
    }

    public static jvr d(File file, juq juqVar, jtf jtfVar, jru jruVar, long j, jtc jtcVar) {
        if (j <= 0) {
            throw new IllegalArgumentException("Quota must be a positive number: 0");
        }
        return new jvr(file, juqVar, jtfVar, jruVar, j, jtcVar);
    }

    private static void v(jwb jwbVar) {
        lfa T = jdg.T("");
        T.g("reserved all", jwbVar.a());
        T.g("reserved ns", jwbVar.b());
        T.g("used all", jwbVar.c());
        T.g("used ns", jwbVar.d());
        T.g("cum. used", jwbVar.h);
        T.g("cum. deleted", jwbVar.i);
        T.toString();
    }

    public final int a(jsr jsrVar) {
        return Math.max(0, ((jui) this.e.a(jsrVar)).g);
    }

    public final jrp b(String str) {
        jrp jrpVar;
        synchronized (this.b) {
            jrpVar = (jrp) this.k.get(str);
            if (jrpVar == null) {
                jrpVar = jrp.a;
            }
        }
        return jrpVar;
    }

    public final jtr c(jsr jsrVar) {
        return ((jui) this.e.a(jsrVar)).a;
    }

    @Override // defpackage.jtb
    public final void e(PrintWriter printWriter, boolean z) {
        String d;
        synchronized (this.b) {
            printWriter.println("## FileManager status report");
            printWriter.printf(Locale.US, "- root dir: %s\n", this.h.getAbsolutePath());
            printWriter.printf(Locale.US, "- gc min ttl: %d ms\n", Long.valueOf(this.l));
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            long j = this.m;
            objArr[0] = j == 0 ? "never" : jtq.e(j);
            printWriter.printf(locale, "- last gc: %s\n", objArr);
            printWriter.printf(Locale.US, "- free space on device storage: %s\n", jtq.d(jtf.a(this.h)));
            printWriter.println();
            this.i.e(printWriter, z);
            printWriter.println();
            printWriter.println("## Namespace table");
            jti a2 = jtj.a();
            a2.b('|');
            jth a3 = jtq.a();
            a2.a = "namespace";
            a3.b(a2.a());
            a2.a = "quota";
            a3.b(a2.a());
            a2.a = "total reserved";
            a3.b(a2.a());
            a2.a = "total used";
            a3.b(a2.a());
            a2.a = "gc prio";
            a3.b(a2.a());
            a2.a = "gc behavior";
            a3.b(a2.a());
            a3.b = "-There are no registered namespaces-";
            for (jwa jwaVar : this.c.values()) {
                String i = jwaVar.c ? "(detached)" : jtq.i(jwaVar.b);
                String str = "";
                try {
                    Map m = m(jwaVar.a, a);
                    str = jtq.d(lwm.p(m.values()));
                    d = jtq.d(lwm.q(m.values()));
                } catch (IOException e) {
                    printWriter.printf(Locale.US, "Error reading file stats: %s\n", e.toString());
                }
                String str2 = jwaVar.a;
                this.j.g(str2);
                a3.c(str2, i, str, d, b(str2), jtq.y());
            }
            a3.a().m(printWriter);
            printWriter.println();
            ((jvg) this.e).c.e(printWriter, z);
            printWriter.println();
            this.r.e(printWriter, z);
        }
    }

    public final jwa f(String str) {
        jwa jwaVar = (jwa) this.c.get(str);
        if (jwaVar != null) {
            return jwaVar;
        }
        throw new IllegalArgumentException("Namespace is not registered: ".concat(str));
    }

    public final File g(jsr jsrVar) {
        File h = h(jsrVar);
        File parentFile = h.getParentFile();
        jdg.u(parentFile);
        jtf.b(parentFile);
        return h;
    }

    public final File h(jsr jsrVar) {
        return new File(i(jsrVar.b()), jsrVar.a());
    }

    public final File i(String str) {
        return new File(this.h, str);
    }

    public final String j(jsr jsrVar) {
        return ((jui) this.e.a(jsrVar)).f;
    }

    public final String k(jsr jsrVar) {
        try {
            return j(jsrVar);
        } catch (IOException e) {
            ((luc) ((luc) ((luc) jsh.a.d()).i(e)).k("com/google/android/libraries/micore/superpacks/gc/FileManager", "getSourceOrLog", 481, "FileManager.java")).w("Failed to get source for %s", jsrVar.f());
            return null;
        }
    }

    public final List l(String str, long j, boolean z) {
        jwa jwaVar = (jwa) this.c.get(str);
        if (jwaVar == null) {
            ((luc) ((luc) jsh.a.d()).k("com/google/android/libraries/micore/superpacks/gc/FileManager", "findGcCandidates", 965, "FileManager.java")).w("Skipping unregistered directory found during GC: %s", str);
            return Collections.emptyList();
        } else if (jwaVar.c) {
            return Collections.emptyList();
        } else {
            List<File> e = jru.e(i(str));
            ArrayList arrayList = new ArrayList(e.size());
            for (File file : e) {
                arrayList.add(jsr.d(str, file.getName()));
            }
            jqf jqfVar = ((jqz) this.j).d(str).c;
            int i = jrx.b;
            int i2 = jrw.a;
            lrr lrrVar = lrr.a;
            LinkedList linkedList = new LinkedList();
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                jsr jsrVar = (jsr) arrayList.get(i3);
                if (!lrrVar.contains(jsrVar)) {
                    File h = h(jsrVar);
                    if (!this.i.b(h)) {
                        this.j.g(jsrVar.b());
                        if (!z) {
                            jui juiVar = (jui) this.e.a(jsrVar);
                            if (juiVar.d == 0) {
                                long j2 = juiVar.e;
                                long lastModified = h.lastModified();
                                long max = Math.max(j2, lastModified);
                                long currentTimeMillis = System.currentTimeMillis();
                                lug lugVar = jsh.a;
                                jtq.e(j2);
                                jtq.e(lastModified);
                                if (currentTimeMillis - max < j) {
                                }
                            }
                        }
                    }
                }
                linkedList.add(jsrVar);
            }
            return Collections.unmodifiableList(linkedList);
        }
    }

    public final Map m(String str, lfe lfeVar) {
        HashMap hashMap = new HashMap();
        File i = i(str);
        if (i.exists()) {
            for (File file : jru.e(i)) {
                kom d = jvn.d();
                d.a = jsr.d(str, file.getName());
                d.c = file;
                d.f = b(str);
                d.d = this.e;
                d.e = this.g;
                jvn a2 = d.a();
                hashMap.put(a2.a, a2);
            }
        }
        for (jup jupVar : ((jvg) this.e).d(str)) {
            if (lfeVar.a(Integer.valueOf(jupVar.b()))) {
                jsr f = jupVar.f();
                kom d2 = jvn.d();
                d2.c = h(f);
                d2.a = f;
                d2.f = b(str);
                d2.b = jupVar;
                d2.e = this.g;
                hashMap.put(f, d2.a());
            }
        }
        return hashMap;
    }

    public final void n(jsr jsrVar, boolean z, jxz jxzVar) {
        lug lugVar = jsh.a;
        File h = h(jsrVar);
        synchronized (this.b) {
            if (z) {
                if (!this.i.b(h)) {
                    r(jsrVar, jxzVar, true);
                } else {
                    lug lugVar2 = jsh.a;
                }
            }
            if (h.exists()) {
                this.e.c(jsrVar, 0);
            } else {
                this.e.b(jsrVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0396, code lost:
        r3 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x039c, code lost:
        if (r3 == r7.b) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x039e, code lost:
        r7.b = r3;
        r7.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03a3, code lost:
        r0 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x03ab, code lost:
        if (r0 == r7.e) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03ad, code lost:
        r7.e = r0;
        r7.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03b2, code lost:
        r0 = defpackage.jvn.d();
        r0.a = r2;
        r1 = r23;
        r0.c = r1.a.h(r2);
        r0.f = r1.a.b(((defpackage.jrh) r2).a);
        r0.d = r1.f;
        r0.e = r1.a.g;
        r0 = r0.a();
        r1.e.put(r2, r0);
        r1.d.put(r2, r0);
        r1.h += java.lang.Math.max(0L, r27.c() - r0.b());
        r0 = defpackage.jsh.a;
        defpackage.jtq.d(r1.d());
        defpackage.jtq.d(r1.b());
        defpackage.jtq.d(r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x040e, code lost:
        r5 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0410, code lost:
        defpackage.jtq.d(r5.q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x04ba, code lost:
        r14 = r1;
        r7 = r5;
        r10 = r6;
        r0 = r19;
        r9 = r20;
        r11 = 2;
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x05ad, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0417, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x041f, code lost:
        monitor-exit(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0420, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0421, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0321, code lost:
        r7 = defpackage.jvy.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x034f, code lost:
        r27 = r1;
        r28 = r12;
        r29 = r13;
        r23 = r0;
        r0 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0369, code lost:
        r11 = new defpackage.jvz(r4, ((defpackage.jui) r7).b, ((defpackage.jui) r7).c, ((defpackage.jui) r7).d, ((defpackage.jui) r7).e, ((defpackage.jui) r7).f, ((defpackage.jui) r7).a, ((defpackage.jui) r7).g);
        r3.b.put(r4, r11);
        r7 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0373, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0374, code lost:
        r28 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x041a, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x041b, code lost:
        r28 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0446, code lost:
        throw new defpackage.jsm(java.lang.String.format(java.util.Locale.US, "Not enough available space (%d) for reservation of %d bytes.", java.lang.Long.valueOf(r0.g), java.lang.Long.valueOf(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0236, code lost:
        r23 = r0.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x023a, code lost:
        r6 = r10;
        r9 = (r23 + r11) - r2;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0242, code lost:
        if (r9 <= r13) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0245, code lost:
        if (r4 > 1) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0247, code lost:
        r25 = r7;
        ((defpackage.luc) ((defpackage.luc) defpackage.jsh.a.b()).k("com/google/android/libraries/micore/superpacks/gc/FileManager", "checkActualSizeAgainstGlobalQuota", 1383, "FileManager.java")).K("An extra %d bytes are needed to stay under actual usage quota, total used: %d, quota: %d, requested: %d", java.lang.Long.valueOf(r9), java.lang.Long.valueOf(r23), java.lang.Long.valueOf(r2), java.lang.Long.valueOf(r11));
        r0.e(r9, r1, 3, r4);
        r9 = (r0.a() + r25) - r2;
        r4 = r4 + 1;
        r13 = 0;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0295, code lost:
        if (r9 <= 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0297, code lost:
        ((defpackage.luc) ((defpackage.luc) defpackage.jsh.a.d()).k("com/google/android/libraries/micore/superpacks/gc/FileManager", "checkActualSizeAgainstGlobalQuota", 1399, "FileManager.java")).v("Extra space needed is still needed for all namespaces, this should not happen: %d", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x044c, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01b5, code lost:
        r7 = r0.d();
        r14 = (r7 + r2) - r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01bf, code lost:
        if (r14 <= 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01c1, code lost:
        ((defpackage.luc) ((defpackage.luc) defpackage.jsh.a.b()).k("com/google/android/libraries/micore/superpacks/gc/FileManager", "checkActualSizeAgainstNamespaceQuota", 1342, "FileManager.java")).K("An extra %d bytes are needed to stay under actual usage quota, total used: %d, namespace quota: %d, requested: %d", java.lang.Long.valueOf(r14), java.lang.Long.valueOf(r7), java.lang.Long.valueOf(r21), java.lang.Long.valueOf(r2));
        r0.e(r14, r1, 2, 0);
        r4 = (r0.d() + r2) - r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0203, code lost:
        if (r4 <= 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0205, code lost:
        ((defpackage.luc) ((defpackage.luc) defpackage.jsh.a.d()).k("com/google/android/libraries/micore/superpacks/gc/FileManager", "checkActualSizeAgainstNamespaceQuota", 1357, "FileManager.java")).v("Extra space needed is still needed for namespace, this should not happen: %d", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x047b, code lost:
        throw new defpackage.jsl("Not enough global quota (" + r2 + ") for " + java.lang.String.valueOf(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0101, code lost:
        r19 = r0;
        ((defpackage.luc) ((defpackage.luc) defpackage.jsh.a.b()).k("com/google/android/libraries/micore/superpacks/gc/FileManager", "checkNamespaceQuota", 1285, "FileManager.java")).J("An extra %d bytes are needed to stay under namespace reservation quota for  %s, quota: %d", java.lang.Long.valueOf(r15), r1, java.lang.Long.valueOf(r4));
        r0 = r14;
        r14.e(r15, r1, 1, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x013c, code lost:
        if (((r0.b() + r11) - r4) > 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04a8, code lost:
        throw new defpackage.jsl("Not enough namespace quota (" + r4 + ") for " + java.lang.String.valueOf(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04a9, code lost:
        r19 = r0;
        r5 = r7;
        r20 = r9;
        r6 = r10;
        r1 = r14;
        r2 = r13.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04b6, code lost:
        if (r15 != r2) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04b8, code lost:
        r0 = defpackage.jsh.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04e7, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "File %s is already reserved with a different size of %d, new size: %d", r4, java.lang.Long.valueOf(r2), java.lang.Long.valueOf(r15)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04e8, code lost:
        r5 = r7;
        r6 = r10;
        r1 = r14;
        r7 = 0;
        r0 = r1.c;
        r2 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04f8, code lost:
        if (r2.hasNext() == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x04fa, code lost:
        r3 = (defpackage.jvn) r2.next();
        r7 = r7 + r3.b();
        r5.r(r3.a, defpackage.jxz.CHILL_GC, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0512, code lost:
        if (r0.isEmpty() != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0514, code lost:
        ((defpackage.luc) ((defpackage.luc) defpackage.jsh.a.b()).k("com/google/android/libraries/micore/superpacks/gc/FileManager", "commitReservation", 1177, "FileManager.java")).W(r0.size(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0531, code lost:
        r0 = defpackage.jsh.a;
        v(r1);
        r0 = r1.b.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0540, code lost:
        if (r0.hasNext() == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0542, code lost:
        r1 = (defpackage.jvw) r0.next();
        r2 = r5.e;
        r3 = r1.e();
        r4 = r1.f();
        r7 = r1.b();
        r8 = r1.c();
        r1 = new android.content.ContentValues(6);
        r1.put("namespace", ((defpackage.jrh) r3).a);
        r1.put("name", ((defpackage.jrh) r3).b);
        r1.put("gc_priority", java.lang.Integer.valueOf(r4));
        r1.put("reservation_state", java.lang.Integer.valueOf(r7));
        r1.put("reserved_size", java.lang.Long.valueOf(r8));
        r1.put("last_access_millis", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        ((defpackage.jvg) r2).e(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x05a2, code lost:
        monitor-exit(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x05a3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
        java.util.Collections.sort(r32, defpackage.jpf.g);
        r14 = new defpackage.jwb(r31, r3, r32, defpackage.jtf.a(r7.h));
        r0 = r32.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (r0.hasNext() == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
        r1 = (defpackage.jvw) r0.next();
        r4 = r1.e();
        r5 = ((defpackage.jrh) r4).a;
        r6 = defpackage.jvn.d();
        r6.a = r4;
        r6.c = r7.h(r4);
        r6.f = r7.b(r5);
        r6.d = r7.e;
        r6.e = r7.g;
        r6 = r6.a();
        r13 = r6.c();
        r15 = r1.c();
        r8 = r13.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d6, code lost:
        if (r8 == r12) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d8, code lost:
        if (r8 != r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
        r4 = r7.f(r5).b;
        r8 = defpackage.jsh.a;
        defpackage.jtq.d(r4);
        defpackage.jtq.d(r7.q);
        v(r14);
        r11 = r1.c();
        r15 = (r14.b() + r11) - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fb, code lost:
        if (r15 > 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fd, code lost:
        r19 = r0;
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013e, code lost:
        r2 = r7.q;
        r11 = r1.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0148, code lost:
        r14 = (r0.a() + r11) - r2;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0150, code lost:
        if (r14 <= 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0153, code lost:
        if (r8 > 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015d, code lost:
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015f, code lost:
        ((defpackage.luc) ((defpackage.luc) defpackage.jsh.a.b()).k("com/google/android/libraries/micore/superpacks/gc/FileManager", "checkGlobalQuota", 1312, "FileManager.java")).J("An extra %d bytes are needed to stay under global quota for %s, quota: %d", java.lang.Long.valueOf(r14), r1, java.lang.Long.valueOf(r2));
        r0.e(r14, r1, 3, r8);
        r14 = (r0.a() + r11) - r2;
        r8 = r8 + 1;
        r9 = r20;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x044f, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0450, code lost:
        r5 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x05a8, code lost:
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x05a9, code lost:
        monitor-exit(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x05aa, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x05ab, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x05b3, code lost:
        r5.n.a(new defpackage.jpi(r20, r0, 5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x05c1, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0196, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0197, code lost:
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019b, code lost:
        r21 = r4;
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a3, code lost:
        if (r14 > 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a5, code lost:
        r2 = r1.c() - r6.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b0, code lost:
        if (r2 > 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b2, code lost:
        r5 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0221, code lost:
        r2 = r5.q;
        r7 = r1.c();
        r11 = r7 - r6.b();
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0231, code lost:
        if (r11 > 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0233, code lost:
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02b2, code lost:
        r2 = r1.c();
        r14 = (r2 - r0.g) + r0.h;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02c3, code lost:
        if (r14 <= 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02c6, code lost:
        if (r4 > 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02c8, code lost:
        ((defpackage.luc) ((defpackage.luc) defpackage.jsh.a.b()).k("com/google/android/libraries/micore/superpacks/gc/FileManager", "checkDiskSpace", 1417, "FileManager.java")).v("An extra %d bytes are needed to fit within disk space", r14);
        r0.e(r14, r1, 3, r4);
        r14 = (r2 - r0.g) + r0.h;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0447, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0448, code lost:
        r5 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02fc, code lost:
        if (r14 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02fe, code lost:
        r2 = r1.e();
        r3 = r0.f;
        r4 = r1.e();
        r5 = r1.f();
        r15 = r1.b();
        r13 = r1.c();
        r12 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0316, code lost:
        monitor-enter(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0317, code lost:
        r7 = (defpackage.jvz) r3.b.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x031f, code lost:
        if (r7 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x037a, code lost:
        r23 = r0;
        r27 = r1;
        r28 = r12;
        r29 = r13;
        r0 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0383, code lost:
        monitor-exit(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0386, code lost:
        if (r5 == r7.c) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0388, code lost:
        r7.c = r5;
        r7.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x038f, code lost:
        if (r0 == r7.d) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0391, code lost:
        r7.d = r0;
        r7.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(java.util.List r32) {
        /*
            Method dump skipped, instructions count: 1475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvr.o(java.util.List):void");
    }

    public final void p(jsr jsrVar, String str) {
        juq juqVar = this.e;
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("source", str);
        ((jvg) juqVar).e(jsrVar, contentValues);
    }

    public final void q(jsr jsrVar, jtr jtrVar) {
        juq juqVar = this.e;
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("superpack_name", jtrVar.b());
        contentValues.put("superpack_version", Integer.valueOf(jtrVar.a()));
        ((jvg) juqVar).e(jsrVar, contentValues);
    }

    public final boolean r(jsr jsrVar, jxz jxzVar, boolean z) {
        File file = new File(i(jsrVar.b()), jsrVar.a());
        if (this.i.b(file)) {
            ((luc) ((luc) jsh.a.d()).k("com/google/android/libraries/micore/superpacks/gc/FileManager", "deleteFile", 829, "FileManager.java")).w("Deleting referenced file %s!", jtq.k(jsrVar.b(), jtq.g(file)));
        }
        boolean z2 = false;
        if (file.exists() && this.g.b(jsrVar.b(), file, jxzVar)) {
            this.n.a(new jqn(this, jsrVar, jxzVar, 2));
            z2 = true;
        }
        if (z) {
            this.e.b(jsrVar);
        }
        return z2;
    }

    public final boolean s(String str) {
        boolean z;
        synchronized (this.b) {
            jwa jwaVar = (jwa) this.c.get(str);
            z = false;
            if (jwaVar != null && jwaVar.c) {
                z = true;
            }
        }
        return z;
    }

    public final int t(List list, jxz jxzVar) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (r((jsr) it.next(), jxzVar, true)) {
                i++;
            }
        }
        return i;
    }

    public final void u(jsr jsrVar) {
        n(jsrVar, false, jxz.AGGRESSIVE_GC);
    }
}
