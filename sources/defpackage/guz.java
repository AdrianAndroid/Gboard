package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Printer;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: guz  reason: default package */
/* loaded from: classes.dex */
public final class guz implements gzv {
    public static final ltg a = ltg.i();
    public final SharedPreferences b;
    public final int c;
    public final boolean d;
    public final int e;
    public final long f;
    public boolean g;
    private final Context h;
    private final long i;

    public guz(Context context) {
        long h = jam.h(context);
        this.h = context;
        this.i = h;
        SharedPreferences o = gwc.o(context);
        this.b = o;
        boolean z = false;
        int i = o.getInt("app_start_counter", 0) + 1;
        this.c = i;
        long j = o.getLong("app_first_start_timestamp", 0L);
        if (j > 0) {
            h = j;
        } else if (h <= 0 || i == 1) {
            h = System.currentTimeMillis();
            if (h < 1661189302700L) {
                h = 1661189302700L;
            }
        }
        this.f = h;
        int e = jam.e(context);
        this.e = e;
        this.d = e != o.getInt("app_version", -1) ? true : z;
        gzt.a.a(this);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        int i = this.c;
        printer.println("appStartCounter = " + i);
        boolean z2 = this.d;
        printer.println("appVersionChanged = " + z2);
        int i2 = this.e;
        printer.println("appVersionCode = " + i2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        gwc.n(printer, "estimatedAppFirstStartTimestamp=", this.f, simpleDateFormat);
        gwc.n(printer, "packageFirstInstallTime=", this.i, simpleDateFormat);
        gwc.n(printer, "packageLastUpgradeTime=", jam.i(this.h), simpleDateFormat);
        gwc.n(printer, "packageBuildTime=", 1661189302700L, simpleDateFormat);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "AppStartTracker";
    }
}
