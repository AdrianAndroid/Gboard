package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: cqy  reason: default package */
/* loaded from: classes.dex */
public final class cqy {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/image/ImageMigrator");
    public final Context b;
    public final idk c;
    public final ino d;
    public final leq e;
    Future f;
    private final ExecutorService g;

    public cqy(Context context) {
        ieh j = ieh.j();
        mks a2 = gxo.a(10);
        cli cliVar = cli.r;
        this.b = context.getApplicationContext();
        this.c = j;
        this.g = a2;
        this.d = ino.K(context, null);
        this.e = cliVar;
    }

    public final synchronized void a() {
        if (!this.d.ak("pref_key_ran_image_migrator")) {
            try {
                PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 128);
                if (packageInfo.firstInstallTime == packageInfo.lastUpdateTime) {
                    this.d.f("pref_key_ran_image_migrator", true);
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (this.f == null) {
                this.f = ((mjz) this.g).submit(new Runnable() { // from class: cqx
                    /* JADX WARN: Removed duplicated region for block: B:34:0x0174  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x017a  */
                    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.CharSequence, java.lang.Object] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 476
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqx.run():void");
                    }
                });
            }
        }
    }
}
