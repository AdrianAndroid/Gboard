package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: fui  reason: default package */
/* loaded from: classes.dex */
public final class fui {
    public static final Status a = new Status(13);
    public static final ijk b;
    private static final fgy c;

    static {
        fuc fucVar = new fuc();
        c = fucVar;
        b = new ijk("Feedback.API", fucVar, null, null, null);
    }

    public static fnz a(Context context) {
        return new fnz(context);
    }
}
