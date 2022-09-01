package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: dmi  reason: default package */
/* loaded from: classes.dex */
public final class dmi extends dkl {
    private static final String[] c = {"korean_gesture_setting_scheme"};
    private static dmi d;

    protected dmi(Context context) {
        super(dmh.l(context));
    }

    public static dmi h(Context context) {
        dmi dmiVar;
        synchronized (dmi.class) {
            if (d == null) {
                d = new dmi(context);
            }
            dmiVar = d;
        }
        return dmiVar;
    }

    @Override // defpackage.dkl
    protected final String d() {
        return "gesture_data_scheme";
    }

    @Override // defpackage.dkl
    protected final String[] f() {
        return c;
    }
}
