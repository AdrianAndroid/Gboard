package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gvh  reason: default package */
/* loaded from: classes.dex */
public final class gvh {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/backup/FileBackupRestoreHelper");
    private static final llp b = llp.v("personal_dictionary", "user_history", "theme", "blocklist", "clipboard", "expression_history");

    public static void a(Context context) {
        File d = gvf.d(context);
        if (!d.exists()) {
            return;
        }
        gvf.l(d, gbq.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a3 A[Catch: all -> 0x01a7, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x01ad, blocks: (B:70:0x0102, B:83:0x0190, B:101:0x01ac, B:100:0x01a3), top: B:69:0x0102 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0182 A[Catch: all -> 0x019f, LOOP:3: B:77:0x017c->B:79:0x0182, LOOP_END, TryCatch #22 {all -> 0x019f, blocks: (B:65:0x00f2, B:66:0x00f5, B:76:0x0161, B:77:0x017c, B:79:0x0182, B:81:0x018c, B:116:0x0124, B:96:0x0130, B:109:0x0127), top: B:64:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190 A[Catch: all -> 0x01ad, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x01ad, blocks: (B:70:0x0102, B:83:0x0190, B:101:0x01ac, B:100:0x01a3), top: B:69:0x0102 }] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r21, int r22) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvh.b(android.content.Context, int):void");
    }

    public static String[] c(Context context, lfe lfeVar) {
        lmn lmnVar;
        File d = gvf.d(context);
        if (true != jan.b.h(d)) {
            d = null;
        }
        if (d == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/backup/FileBackupRestoreHelper", "getBackupFiles", 78, "FileBackupRestoreHelper.java")).t("Failed to create reserved directory for backup.");
            ieh.j().e(gvd.b, 1);
            return gvw.g;
        }
        nfh t = gvp.b.t();
        llw b2 = gvf.b(context, gvl.class);
        if (b2.isEmpty()) {
            return gvw.g;
        }
        b2.values();
        llg<gvl> values = b2.values();
        lmx g = lmz.g();
        g.j(b);
        lmh s = lmn.s();
        for (gvl gvlVar : values) {
            s.e(gvlVar.c(), gvlVar);
            g.d(gvlVar.c());
        }
        lmn a2 = s.a();
        lmh s2 = lmn.s();
        lsz it = g.g().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            llg a3 = a2.a(str);
            if (a3 != null && !a3.isEmpty()) {
                s2.d(str, a3);
            }
        }
        lmn a4 = s2.a();
        File e = gvf.e(context);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(e);
            gvg gvgVar = new gvg(fileOutputStream);
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/backup/FileBackupRestoreHelper", "prepareBackupFiles", 284, "FileBackupRestoreHelper.java")).w("Preparing backup files: providers=%s", a4.t());
            long j = gvgVar.c;
            lsz it2 = a4.u().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                if (j > 0) {
                    llg a5 = a4.a(str2);
                    if (a5 == null || a5.isEmpty()) {
                        lmnVar = a4;
                    } else {
                        lsz it3 = a5.iterator();
                        while (it3.hasNext()) {
                            gvl gvlVar2 = (gvl) it3.next();
                            lmnVar = a4;
                            if (lfeVar.a(gvlVar2)) {
                                gvlVar2.e(gvgVar);
                                j = gvgVar.c;
                                if (j <= 0) {
                                    ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/backup/FileBackupRestoreHelper", "prepareBackupFiles", 306, "FileBackupRestoreHelper.java")).v("Exceeds quota (%d)", j);
                                }
                            }
                            a4 = lmnVar;
                        }
                        a4 = a4;
                    }
                    a4 = lmnVar;
                } else {
                    ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/backup/FileBackupRestoreHelper", "prepareBackupFiles", 289, "FileBackupRestoreHelper.java")).v("Exceeds quota (%d)", j);
                    break;
                }
            }
            lmn a6 = gvgVar.b.a();
            nfh t2 = gvr.d.t();
            ArrayList arrayList = new ArrayList();
            lsz it4 = a6.u().iterator();
            while (it4.hasNext()) {
                String str3 = (String) it4.next();
                llg a7 = a6.a(str3);
                t2.b = (nfm) t2.b.N(4);
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                gvr gvrVar = (gvr) t2.b;
                str3.getClass();
                gvrVar.a |= 1;
                gvrVar.b = str3;
                nga ngaVar = gvrVar.c;
                if (!ngaVar.c()) {
                    gvrVar.c = nfm.H(ngaVar);
                }
                ndt.cs(a7, gvrVar.c);
                arrayList.add((gvr) t2.cz());
            }
            if (!arrayList.isEmpty()) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                gvp gvpVar = (gvp) t.b;
                nga ngaVar2 = gvpVar.a;
                if (!ngaVar2.c()) {
                    gvpVar.a = nfm.H(ngaVar2);
                }
                ndt.cs(arrayList, gvpVar.a);
                gvgVar.close();
                fileOutputStream.close();
                gvf.m(context, b2.keySet());
                File c = gvf.c(context);
                gvp gvpVar2 = (gvp) t.cz();
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(c);
                    try {
                        gvpVar2.p(fileOutputStream2);
                        fileOutputStream2.close();
                        long j2 = 0;
                        for (gvr gvrVar2 : gvpVar2.a) {
                            for (gvq gvqVar : gvrVar2.c) {
                                j2 += gvqVar.c;
                            }
                        }
                        long length = e.length();
                        long length2 = c.length();
                        ieh j3 = ieh.j();
                        j3.e(gvd.f, Long.valueOf(j2), Long.valueOf(length2 + length));
                        j3.e(gvd.g, Integer.valueOf((int) ((((float) length) / ((float) j2)) * 100.0f)));
                        j3.e(gvd.e, new Object[0]);
                        return new String[]{gvf.h(), gvf.g()};
                    } catch (Throwable th) {
                        try {
                            fileOutputStream2.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException | SecurityException e2) {
                    ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/libraries/inputmethod/backup/FileBackupRestoreHelper", "getBackupFiles", '|', "FileBackupRestoreHelper.java")).t("Failed to write BackupInfo to the file.");
                    ieh.j().e(gvd.b, 3);
                    return gvw.g;
                }
            }
            String[] strArr = gvw.g;
            gvgVar.close();
            fileOutputStream.close();
            return strArr;
        } catch (IOException | SecurityException e3) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e3)).k("com/google/android/libraries/inputmethod/backup/FileBackupRestoreHelper", "getBackupFiles", 'l', "FileBackupRestoreHelper.java")).t("Failed to backup files");
            ieh.j().e(gvd.b, 2);
            return gvw.g;
        }
    }

    public static String[] d() {
        return new String[]{gvf.h(), gvf.g()};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(Context context, Map map) {
        llw b2 = gvf.b(context, gvl.class);
        b2.values();
        llg<gvl> values = b2.values();
        lls h = llw.h();
        for (gvl gvlVar : values) {
            h.a(gvlVar.d(), gvlVar);
        }
        llw l = h.l();
        while (true) {
            boolean z = true;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                gvl gvlVar2 = (gvl) l.get(str);
                if (gvlVar2 == null) {
                    ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/backup/FileBackupRestoreHelper", "restoreFilesToDataProviders", 226, "FileBackupRestoreHelper.java")).G("There is no provider with id %s (entry: %s)", str, entry);
                    if (!z || !((llw) entry.getValue()).isEmpty()) {
                        z = false;
                    }
                } else {
                    llw llwVar = (llw) entry.getValue();
                    Collection<String> g = gvlVar2.g(llwVar);
                    z = z && g.containsAll(llwVar.keySet());
                    for (String str2 : g) {
                        gvf.k((File) llwVar.get(str2));
                    }
                }
            }
            gvf.m(context, b2.keySet());
            return z;
        }
    }
}
