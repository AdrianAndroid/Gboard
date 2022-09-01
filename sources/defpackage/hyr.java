package defpackage;

import android.util.Printer;
import com.google.android.libraries.inputmethod.staticflag.AllFlags;
import j$.time.Duration;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: hyr  reason: default package */
/* loaded from: classes.dex */
public final class hyr implements ijh {
    public static final long a = Duration.ofSeconds(AllFlags.CRASHRECOVERYEFFECTIVETIMEINSECONDS).toMillis();
    public final long b;
    public final boolean c;
    public final boolean d;

    public hyr(long j, boolean z, boolean z2) {
        this.b = j;
        this.c = z;
        this.d = z2;
    }

    public static final boolean b() {
        hyr a2 = hyq.a();
        if (a2 != null) {
            return a2.c;
        }
        return false;
    }

    @Override // defpackage.ijg
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        long j = this.b;
        String format = simpleDateFormat.format(Long.valueOf(j));
        printer.println("skipExperimentFlagsTimestam p = " + j + ", " + format);
        long j2 = AllFlags.CRASHRECOVERYEFFECTIVETIMEINSECONDS;
        StringBuilder sb = new StringBuilder("effectiveTimeInSeconds = ");
        sb.append(j2);
        printer.println(sb.toString());
        boolean z2 = this.c;
        printer.println("recoverDecoder = " + z2);
        boolean z3 = this.d;
        printer.println("clearCache = " + z3);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "CrashRecoveryNotification";
    }
}
