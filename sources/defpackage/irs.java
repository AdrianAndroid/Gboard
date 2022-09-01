package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: irs  reason: default package */
/* loaded from: classes.dex */
public final class irs extends iiy {
    public static final irs a;
    private static final gzy b = new gzy("DeviceUnlockTag");
    private static volatile Boolean c;

    static {
        irs irsVar = new irs();
        a = irsVar;
        ijf.g("DeviceUnlocked", irsVar);
    }

    private irs() {
    }

    public static void b(Context context, Printer printer) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (keyguardManager != null) {
            boolean isDeviceLocked = keyguardManager.isDeviceLocked();
            printer.println("isDeviceLocked = " + isDeviceLocked);
        }
        printer.println("simulatedDeviceLockedStatus = null");
    }

    public static void c(Context context) {
        boolean j;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        boolean isDeviceLocked = keyguardManager != null ? keyguardManager.isDeviceLocked() : false;
        if (isDeviceLocked) {
            j = ijf.k(a);
        } else {
            j = ijf.j(a);
        }
        if (j) {
            b.b("notifyDeviceLockStatusChanged(): deviceLocked=%b", Boolean.valueOf(isDeviceLocked));
        }
    }

    public static boolean d() {
        return ijf.i(a);
    }
}
