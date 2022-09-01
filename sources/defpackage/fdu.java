package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;
import j$.time.Duration;

/* compiled from: PG */
/* renamed from: fdu  reason: default package */
/* loaded from: classes.dex */
public final class fdu implements fdk {
    public ino b;
    private Context e;
    private fdy f;
    private static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDevicePackDownloadModule");
    public static final long a = Duration.ofDays(1).toMillis();
    public final irw c = new fdt(this);
    private final inm g = new fdo(this, 2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(ino inoVar) {
        return inoVar.x(R.string.f162190_resource_name_obfuscated_res_0x7f1406fc, false);
    }

    public final void c() {
        if (!fdy.c(this.b)) {
            this.f.a(gyc.b);
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean b = fdz.b();
        printer.println("Feature enabled: " + b);
        boolean a2 = fdz.a(this.e);
        StringBuilder sb = new StringBuilder("Ondevice setting enabled: ");
        sb.append(!a2);
        printer.println(sb.toString());
        boolean c = fdy.c(this.b);
        StringBuilder sb2 = new StringBuilder("Ondevice notice has been displayed: ");
        sb2.append(!c);
        printer.println(sb2.toString());
    }

    public final boolean e() {
        return this.b.b("number_of_schedule_times", 0) >= 2;
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "OnDevicePackDownloadModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        ((ltd) ((ltd) d.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDevicePackDownloadModule", "onCreate", 59, "OnDevicePackDownloadModule.java")).t("onCreate()");
        this.e = context;
        ino K = ino.K(context, null);
        this.b = K;
        K.Y(this.g, "number_of_schedule_times");
        this.b.X(this.g, R.string.f162190_resource_name_obfuscated_res_0x7f1406fc);
        this.f = new fdy(context, fea.b);
        if (fdz.a(context) || d(this.b) || e()) {
            c();
        } else {
            this.c.f(gyc.b);
        }
    }

    @Override // defpackage.ifw
    public final void gn() {
        ((ltd) ((ltd) d.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDevicePackDownloadModule", "onDestroy", 94, "OnDevicePackDownloadModule.java")).t("onDestroy()");
        this.f.b();
        this.b.ae(this.g, R.string.f162190_resource_name_obfuscated_res_0x7f1406fc);
        this.b.af(this.g, "number_of_schedule_times");
        this.c.g();
    }
}
