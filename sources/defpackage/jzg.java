package defpackage;

import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jzg  reason: default package */
/* loaded from: classes.dex */
public final class jzg {
    public static final khv c;
    public static final jls d;
    public static final Object a = new Object();
    private static final Map e = new HashMap();
    private static final Map f = new HashMap();
    public static final jtb b = new jzf(0);

    static {
        jls f2 = jls.f(mjl.a);
        d = f2;
        c = new khv(f2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.mko a(defpackage.jzm r9, defpackage.jux r10, java.lang.String r11, long r12) {
        /*
            r0 = 0
            r2 = 1
            r3 = 0
            int r4 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r4 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            defpackage.jdg.v(r0)
            java.lang.Object r0 = defpackage.jzg.a
            monitor-enter(r0)
            java.util.Map r1 = defpackage.jzg.f     // Catch: java.lang.Throwable -> Ldb
            java.lang.Object r4 = r1.get(r11)     // Catch: java.lang.Throwable -> Ldb
            mko r4 = (defpackage.mko) r4     // Catch: java.lang.Throwable -> Ldb
            if (r4 == 0) goto L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ldb
            return r4
        L1d:
            juu r4 = r10.a(r11)     // Catch: java.lang.Throwable -> Ldb
            if (r4 == 0) goto Lc8
            boolean r5 = r4.c     // Catch: java.lang.Throwable -> Ldb
            if (r5 != 0) goto La2
            khv r5 = defpackage.jzg.c     // Catch: java.lang.Throwable -> Ldb
            boolean r6 = r5.c(r11)     // Catch: java.lang.Throwable -> Ldb
            if (r6 == 0) goto L6e
            lug r9 = defpackage.jsh.a     // Catch: java.lang.Throwable -> Ldb
            ltv r9 = r9.b()     // Catch: java.lang.Throwable -> Ldb
            luc r9 = (defpackage.luc) r9     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r10 = "com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager"
            java.lang.String r12 = "cancel"
            java.lang.String r13 = "ScheduledDownloadManager.java"
            r2 = 222(0xde, float:3.11E-43)
            ltv r9 = r9.k(r10, r12, r2, r13)     // Catch: java.lang.Throwable -> Ldb
            luc r9 = (defpackage.luc) r9     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r10 = "Canceling active download: %s"
            jsr r12 = r4.f()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r12 = r12.f()     // Catch: java.lang.Throwable -> Ldb
            r9.w(r10, r12)     // Catch: java.lang.Throwable -> Ldb
            java.lang.Object r9 = r5.b     // Catch: java.lang.Throwable -> Ldb
            java.lang.Object r9 = r9.get(r11)     // Catch: java.lang.Throwable -> Ldb
            jyc r9 = (defpackage.jyc) r9     // Catch: java.lang.Throwable -> Ldb
            if (r9 == 0) goto L65
            jxy r10 = defpackage.jxy.CANCELLATION     // Catch: java.lang.Throwable -> Ldb
            java.lang.Object r12 = r5.a     // Catch: java.lang.Throwable -> Ldb
            jls r12 = (defpackage.jls) r12     // Catch: java.lang.Throwable -> Ldb
            r9.b(r10, r12)     // Catch: java.lang.Throwable -> Ldb
        L65:
            mld r9 = defpackage.mld.e()     // Catch: java.lang.Throwable -> Ldb
            r1.put(r11, r9)     // Catch: java.lang.Throwable -> Ldb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ldb
            return r9
        L6e:
            lug r1 = defpackage.jsh.a     // Catch: java.lang.Throwable -> Ldb
            ltv r1 = r1.b()     // Catch: java.lang.Throwable -> Ldb
            luc r1 = (defpackage.luc) r1     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r5 = "com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager"
            java.lang.String r6 = "cancel"
            java.lang.String r7 = "ScheduledDownloadManager.java"
            r8 = 239(0xef, float:3.35E-43)
            ltv r1 = r1.k(r5, r6, r8, r7)     // Catch: java.lang.Throwable -> Ldb
            luc r1 = (defpackage.luc) r1     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r5 = "Canceling inactive download: %s"
            jsr r4 = r4.f()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = r4.f()     // Catch: java.lang.Throwable -> Ldb
            r1.w(r5, r4)     // Catch: java.lang.Throwable -> Ldb
            java.util.Map r1 = defpackage.jzg.e     // Catch: java.lang.Throwable -> Ldb
            java.lang.Object r1 = r1.remove(r11)     // Catch: java.lang.Throwable -> Ldb
            mld r1 = (defpackage.mld) r1     // Catch: java.lang.Throwable -> Ldb
            if (r1 == 0) goto L9e
            r1.cancel(r3)     // Catch: java.lang.Throwable -> Ldb
        L9e:
            r10.c(r11)     // Catch: java.lang.Throwable -> Ldb
            goto Lc9
        La2:
            lug r1 = defpackage.jsh.a     // Catch: java.lang.Throwable -> Ldb
            ltv r1 = r1.b()     // Catch: java.lang.Throwable -> Ldb
            luc r1 = (defpackage.luc) r1     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = "com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager"
            java.lang.String r5 = "cancel"
            java.lang.String r6 = "ScheduledDownloadManager.java"
            r7 = 256(0x100, float:3.59E-43)
            ltv r1 = r1.k(r2, r5, r7, r6)     // Catch: java.lang.Throwable -> Ldb
            luc r1 = (defpackage.luc) r1     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = "Canceling completed download: %s"
            jsr r4 = r4.f()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = r4.f()     // Catch: java.lang.Throwable -> Ldb
            r1.w(r2, r4)     // Catch: java.lang.Throwable -> Ldb
            r10.c(r11)     // Catch: java.lang.Throwable -> Ldb
        Lc8:
            r2 = 0
        Lc9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ldb
            if (r2 == 0) goto Ld5
            r5 = 0
            java.lang.String r8 = "download cancelled"
            r3 = r9
            r4 = r10
            r6 = r12
            e(r3, r4, r5, r6, r8)
        Ld5:
            r9 = 0
            mko r9 = defpackage.kcu.K(r9)
            return r9
        Ldb:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ldb
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzg.a(jzm, jux, java.lang.String, long):mko");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map, java.lang.Object] */
    public static mko b(jzm jzmVar, jux juxVar, juu juuVar, long j) {
        jdg.v(j > 0);
        String l = juuVar.l();
        synchronized (a) {
            juu a2 = juxVar.a(l);
            String str = null;
            if (a2 == null) {
                lug lugVar = jsh.a;
                try {
                    if (((jvi) juxVar).a.getWritableDatabase().insertOrThrow("pending_downloads", null, juuVar.e()) < 0) {
                        jum jumVar = ((jvi) juxVar).a;
                        String l2 = juuVar.l();
                        IOException iOException = new IOException("SqlitePendingDownloadQueue#insert, SQL insert failed, download: " + l2);
                        jumVar.a(iOException);
                        throw iOException;
                    }
                } catch (SQLiteException e2) {
                    jum jumVar2 = ((jvi) juxVar).a;
                    IOException iOException2 = new IOException("SqlitePendingDownloadQueue#insert, SQL insert failed, download: ".concat(juuVar.l()), e2);
                    jumVar2.a(iOException2);
                    throw iOException2;
                }
            } else {
                boolean z = a2.c;
                lug lugVar2 = jsh.a;
                if (!z) {
                    if ((juuVar.b() & 1) == 0) {
                        long j2 = juuVar.e;
                        long j3 = a2.e;
                        if (j2 < j3) {
                            juuVar.m(j3);
                            juuVar.f = a2.f;
                        }
                    }
                    juxVar.d(juuVar);
                } else {
                    juxVar.c(l);
                    String str2 = a2.d;
                    if (str2 == null || str2.isEmpty()) {
                        lug lugVar3 = jsh.a;
                        if (!a2.i().isEmpty()) {
                            str = (String) a2.i().get(0);
                        }
                        return kcu.K(jtx.a(str));
                    }
                    lug lugVar4 = jsh.a;
                    return kcu.J(new jyl(str2));
                }
            }
            Map map = e;
            mld mldVar = (mld) map.get(l);
            if (mldVar == null) {
                mldVar = mld.e();
                map.put(l, mldVar);
            }
            mld mldVar2 = mldVar;
            khv khvVar = c;
            jyc jycVar = (jyc) khvVar.b.get(juuVar.l());
            if (jycVar != null) {
                int a3 = juuVar.a();
                int a4 = jycVar.a.a();
                if (jycVar.b.equals(jzk.a(juuVar)) && a3 >= a4) {
                    if (a3 > a4 && !jycVar.a()) {
                        jycVar.a = juuVar;
                        jycVar.b = jzk.a(juuVar);
                        for (jyc jycVar2 : khvVar.b.values()) {
                            if (jycVar2 != jycVar) {
                                jycVar2.b(jxy.PREEMPTED, (jls) khvVar.a);
                            }
                        }
                    }
                }
                jycVar.b(jxy.PARAMETERS_CHANGED, (jls) khvVar.a);
            }
            e(jzmVar, juxVar, null, j, "download registered");
            return kcu.L(mldVar2);
        }
    }

    static String c(Throwable th) {
        StringBuilder sb = new StringBuilder();
        while (th != null) {
            if (sb.length() > 0) {
                sb.append(" >>>> ");
            }
            sb.append(th.getClass().getSimpleName());
            sb.append(":");
            sb.append(th.getMessage());
            th = th.getCause();
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0131 A[Catch: all -> 0x0259, TryCatch #1 {, blocks: (B:14:0x0029, B:16:0x0035, B:18:0x0041, B:19:0x0044, B:24:0x005b, B:26:0x005f, B:29:0x0068, B:31:0x006b, B:34:0x0070, B:35:0x007c, B:37:0x0087, B:40:0x0093, B:60:0x00fb, B:74:0x0131, B:77:0x013d, B:78:0x0141, B:79:0x0146, B:81:0x0150, B:84:0x0158, B:87:0x0173, B:90:0x024a, B:94:0x018e, B:95:0x01b4, B:98:0x01b6, B:99:0x01d1, B:100:0x01d2, B:103:0x01dd, B:104:0x01ea, B:106:0x01f3, B:111:0x01fc), top: B:13:0x0029, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(defpackage.jzm r26, defpackage.jux r27, java.lang.String r28, defpackage.jtx r29, java.lang.Throwable r30, defpackage.jza r31, long r32) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzg.d(jzm, jux, java.lang.String, jtx, java.lang.Throwable, jza, long):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:82:0x045e A[Catch: all -> 0x0462, TryCatch #2 {, blocks: (B:232:0x0016, B:7:0x001f, B:80:0x044e, B:82:0x045e, B:83:0x0461, B:72:0x0425, B:74:0x0433, B:75:0x0436), top: B:231:0x0016 }] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v38, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(defpackage.jzm r30, defpackage.jux r31, defpackage.jzj r32, long r33, java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzg.e(jzm, jux, jzj, long, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Map, java.lang.Object] */
    private static void f(jzj jzjVar, String str, List list, Set set, int i, int i2, int i3) {
        String str2;
        if (((luc) jsh.a.b()).P() && !list.isEmpty()) {
            luc lucVar = (luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "logPendingDownloads", 604, "ScheduledDownloadManager.java");
            if (jzjVar == null) {
                str2 = "";
            } else {
                str2 = " (" + jzjVar.f.toString() + ")";
            }
            String str3 = str2;
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(i2);
            Integer valueOf3 = Integer.valueOf(i3);
            Integer valueOf4 = Integer.valueOf(list.size());
            StringBuilder sb = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                juu juuVar = (juu) it.next();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(juuVar.f().f());
                if (c.b.containsKey(juuVar.l())) {
                    sb.append(" @");
                }
                if (set.contains(juuVar)) {
                    sb.append(" *");
                }
                sb.append(" ");
                sb.append(juuVar.b.m());
            }
            lucVar.N("Scheduling: %s%s, %d started, %d paused, %d scheduled, %d pending: %s", str, str3, valueOf, valueOf2, valueOf3, valueOf4, sb.toString());
        }
    }
}
