package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: kje  reason: default package */
/* loaded from: classes.dex */
public final class kje {
    private static volatile lfb a;

    private kje() {
    }

    public static lfb a(Context context) {
        lfb lfbVar;
        synchronized (kje.class) {
            lfbVar = a;
            if (lfbVar == null) {
                lfbVar = kki.b(context);
                a = lfbVar;
            }
        }
        return lfbVar;
    }
}
