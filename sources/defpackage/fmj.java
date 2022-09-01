package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: fmj  reason: default package */
/* loaded from: classes.dex */
public final class fmj extends fra {
    public fmj(Context context, Looper looper, fqs fqsVar, fob fobVar, foc focVar) {
        super(context, looper, 40, fqsVar, fobVar, focVar);
    }

    @Override // defpackage.fra, defpackage.fqq, defpackage.fnw
    public final int a() {
        return 11925000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof fml ? (fml) queryLocalInterface : new fml(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final String c() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // defpackage.fqq
    protected final String d() {
        return "com.google.android.gms.clearcut.service.START";
    }

    @Override // defpackage.fqq
    public final fmv[] h() {
        return fmb.b;
    }
}
