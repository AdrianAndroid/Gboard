package defpackage;

import android.content.Context;
import android.util.Printer;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gvi  reason: default package */
/* loaded from: classes.dex */
public final class gvi implements ifw {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/backup/FileRestoreModule");

    private static void c(Context context) {
        gvf.j(context);
        File d = gvf.d(context);
        if (d.exists()) {
            gvf.l(d, gbq.c);
        }
        ino L = ino.L();
        L.w("restore_app_version");
        L.w("last_manual_restore_app_version");
        L.w("restore_times");
        L.w("restore_timestamp");
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "FileRestoreModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        ino L = ino.L();
        if (L.b("restore_app_version", -1) == -1) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/backup/FileRestoreModule", "maybePerformRestore", 40, "FileRestoreModule.java")).t("There is no restore app version, skip restore");
        } else {
            long c = L.c("last_manual_restore_app_version", -1L);
            long l = jbt.l(context);
            if (c == -1 || l <= c) {
                ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/backup/FileRestoreModule", "maybePerformRestore", 47, "FileRestoreModule.java")).t("Skip restore and try next time because it is not apk upgrade.");
            } else {
                ino L2 = ino.L();
                if (L2.D("restore_times") == 1) {
                    ieh.j().e(gvd.d, Long.valueOf(TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - L2.I("restore_timestamp"))));
                }
                gvp a2 = gvf.a(context);
                if (a2 == null || a2.a.size() == 0) {
                    ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/backup/FileRestoreModule", "maybePerformRestore", 54, "FileRestoreModule.java")).t("There is no backup entry in backup data.");
                    ieh j = ieh.j();
                    j.e(gvd.c, Integer.valueOf(L.D("restore_times") + 1));
                    j.e(gvd.b, 4);
                    c(context);
                } else {
                    qo qoVar = new qo();
                    for (gvr gvrVar : a2.a) {
                        nga<gvq> ngaVar = gvrVar.c;
                        if (!ngaVar.isEmpty()) {
                            String str = gvrVar.b;
                            qo qoVar2 = new qo();
                            for (gvq gvqVar : ngaVar) {
                                File f = gvf.f(context, str, gvqVar.b);
                                if (f.exists()) {
                                    qoVar2.put(gvqVar.b, f);
                                }
                            }
                            if (!qoVar2.isEmpty()) {
                                qoVar.put(str, llw.k(qoVar2));
                            }
                        }
                    }
                    if (gvh.e(context, qoVar)) {
                        ieh.j().e(gvd.c, Integer.valueOf(L.D("restore_times") + 1));
                        c(context);
                    } else {
                        L.i("last_manual_restore_app_version", l);
                        L.h("restore_times", L.D("restore_times") + 1);
                    }
                }
            }
        }
        igr.d(context).g(gvi.class);
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
