package defpackage;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: boi  reason: default package */
/* loaded from: classes.dex */
public final class boi extends gvn {
    final /* synthetic */ boj a;

    public boi(boj bojVar) {
        this.a = bojVar;
    }

    @Override // defpackage.gvn
    public final void a() {
        Context applicationContext = this.a.getApplicationContext();
        if (!jai.b.b()) {
            ((ltd) ((ltd) esw.a.d()).k("com/google/android/apps/inputmethod/libs/theme/listing/DownloadableThemeBackupHelper", "restore", 86, "DownloadableThemeBackupHelper.java")).t("Cannot restore downloadable themes while the device is locked.");
            return;
        }
        esw eswVar = new esw(applicationContext.getApplicationContext(), gxo.a(10), ett.c(applicationContext), etg.c(applicationContext), eti.a(applicationContext));
        for (eul eulVar : eswVar.e) {
            String k = eulVar.k();
            if (k != null && erj.i(k)) {
                gyc.b.execute(new emq(eswVar, 9));
                return;
            }
        }
    }
}
