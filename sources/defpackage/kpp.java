package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: kpp  reason: default package */
/* loaded from: classes.dex */
public final class kpp implements koo {
    public boolean a;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
        if ((android.system.Os.lstat(r0.getAbsolutePath()).st_mode & android.system.OsConstants.S_IFLNK) != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(defpackage.kcq r3, android.net.Uri r4, java.util.List r5) {
        /*
            r2 = this;
            kpm r0 = defpackage.kpm.b()
            r0.c()
            boolean r1 = r3.w(r4)     // Catch: java.io.IOException -> L50
            if (r1 == 0) goto L4c
            boolean r1 = r2.a     // Catch: java.io.IOException -> L50
            if (r1 == 0) goto L30
            java.lang.Object r0 = r3.q(r4, r0)     // Catch: java.lang.Exception -> L30
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Exception -> L30
            if (r0 == 0) goto L30
            boolean r1 = r0.exists()     // Catch: java.lang.Exception -> L30
            if (r1 != 0) goto L20
            goto L30
        L20:
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L30
            android.system.StructStat r0 = android.system.Os.lstat(r0)     // Catch: java.lang.Exception -> L30
            int r0 = r0.st_mode     // Catch: java.lang.Exception -> L30
            int r1 = android.system.OsConstants.S_IFLNK     // Catch: java.lang.Exception -> L30
            r0 = r0 & r1
            if (r0 == 0) goto L30
            goto L48
        L30:
            java.lang.Iterable r0 = r3.p(r4)     // Catch: java.io.IOException -> L50
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L50
        L38:
            boolean r1 = r0.hasNext()     // Catch: java.io.IOException -> L50
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.next()     // Catch: java.io.IOException -> L50
            android.net.Uri r1 = (android.net.Uri) r1     // Catch: java.io.IOException -> L50
            r2.b(r3, r1, r5)     // Catch: java.io.IOException -> L50
            goto L38
        L48:
            r3.s(r4)     // Catch: java.io.IOException -> L50
            return
        L4c:
            r3.t(r4)     // Catch: java.io.IOException -> L50
            return
        L50:
            r3 = move-exception
            r5.add(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpp.b(kcq, android.net.Uri, java.util.List):void");
    }

    @Override // defpackage.koo
    public final /* bridge */ /* synthetic */ Object a(kon konVar) {
        ArrayList<IOException> arrayList = new ArrayList();
        b((kcq) konVar.f, (Uri) konVar.e, arrayList);
        if (!arrayList.isEmpty()) {
            IOException iOException = new IOException("Failed to delete one or more files");
            for (IOException iOException2 : arrayList) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(iOException, iOException2);
                } catch (Exception unused) {
                }
            }
            throw iOException;
        }
        return null;
    }
}
