package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: gdq  reason: default package */
/* loaded from: classes.dex */
public final class gdq extends fra {
    public gdq(Context context, Looper looper, fqs fqsVar, fob fobVar, foc focVar) {
        super(context, looper, 38, fqsVar, fobVar, focVar);
    }

    @Override // defpackage.fra, defpackage.fqq, defpackage.fnw
    public final int a() {
        return 9410000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
        return queryLocalInterface instanceof gdp ? (gdp) queryLocalInterface : new gdp(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final String c() {
        return "com.google.android.gms.pseudonymous.internal.IPseudonymousIdService";
    }

    @Override // defpackage.fqq
    protected final String d() {
        return "com.google.android.gms.pseudonymous.service.START";
    }

    @Override // defpackage.fqq
    public final boolean e() {
        return true;
    }

    @Override // defpackage.fqq
    public final fmv[] h() {
        return gdk.b;
    }
}
