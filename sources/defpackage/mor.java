package defpackage;

import android.content.pm.PackageManager;

/* compiled from: PG */
/* renamed from: mor  reason: default package */
/* loaded from: classes2.dex */
public final class mor extends nwh {
    final /* synthetic */ PackageManager a;
    final /* synthetic */ lmz b;
    final /* synthetic */ fno c;

    public mor(PackageManager packageManager, lmz lmzVar, fno fnoVar) {
        this.a = packageManager;
        this.b = lmzVar;
        this.c = fnoVar;
    }

    @Override // defpackage.nwh
    public final nvu a(int i) {
        fnk a;
        int length;
        PackageManager packageManager = this.a;
        lmz lmzVar = this.b;
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid != null) {
            int length2 = packagesForUid.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                } else if (lmzVar.contains(packagesForUid[i3])) {
                    fno fnoVar = this.c;
                    String[] packagesForUid2 = fnoVar.a.getPackageManager().getPackagesForUid(i);
                    if (packagesForUid2 != null && (length = packagesForUid2.length) != 0) {
                        a = null;
                        while (true) {
                            if (i2 < length) {
                                a = fnoVar.a(packagesForUid2[i2]);
                                if (a.b) {
                                    break;
                                }
                                i2++;
                            } else {
                                fyb.ax(a);
                                break;
                            }
                        }
                    } else {
                        a = fnk.a();
                    }
                    if (a.b) {
                        return nvu.b;
                    }
                } else {
                    i3++;
                }
            }
        }
        return nvu.g.f("Rejected by (1st-party only Allowlist) security policy");
    }
}
