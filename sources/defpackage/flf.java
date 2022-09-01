package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: flf  reason: default package */
/* loaded from: classes.dex */
public final class flf extends fnz implements fky {
    private static final fgy a;
    private static final ijk k = fhr.B("GoogleAuthServiceClient");
    private static final ijk l;

    static {
        fld fldVar = new fld();
        a = fldVar;
        l = new ijk("GoogleAuthService.API", fldVar, null, null, null);
    }

    public flf(Context context) {
        super(context, l, fnu.a, fny.a, null, null, null, null);
    }

    public static void a(Status status, Object obj, fxa fxaVar) {
        boolean e;
        if (status.a()) {
            e = fxaVar.f(obj);
        } else {
            e = fxaVar.e(fyb.aM(status));
        }
        if (!e) {
            k.q("The task is already complete.", new Object[0]);
        }
    }
}
