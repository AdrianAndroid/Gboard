package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: fzz  reason: default package */
/* loaded from: classes.dex */
public final class fzz implements gaa {
    private final Context a;

    public fzz(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
        if (r7 == Long.MIN_VALUE) goto L13;
     */
    @Override // defpackage.gaa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.gab a() {
        /*
            r11 = this;
            android.content.Context r0 = r11.a
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r1.<init>(r2)
            r2 = 0
            android.content.Intent r0 = defpackage.gcl.g(r0, r2, r1)
            java.lang.String r1 = "status"
            r2 = 0
            int r4 = r0.getIntExtra(r1, r2)
            java.lang.String r1 = "plugged"
            int r5 = r0.getIntExtra(r1, r2)
            java.lang.String r1 = "level"
            r2 = -1
            int r1 = r0.getIntExtra(r1, r2)
            java.lang.String r3 = "scale"
            int r0 = r0.getIntExtra(r3, r2)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == r2) goto L35
            if (r0 == r2) goto L35
            if (r0 <= 0) goto L35
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            r6 = r1
            goto L37
        L35:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
        L37:
            android.content.Context r0 = r11.a
            java.lang.String r1 = "batterymanager"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.os.BatteryManager r0 = (android.os.BatteryManager) r0
            r1 = 0
            if (r0 == 0) goto L50
            r3 = 5
            long r7 = r0.getLongProperty(r3)
            r9 = -9223372036854775808
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L51
        L50:
            r7 = r1
        L51:
            gab r0 = new gab
            r3 = r0
            r3.<init>(r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzz.a():gab");
    }
}
