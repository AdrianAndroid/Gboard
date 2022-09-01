package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: fkn  reason: default package */
/* loaded from: classes.dex */
public final class fkn extends fra {
    public fkn(Context context, Looper looper, fqs fqsVar, fob fobVar, foc focVar) {
        super(context, looper, 154, fqsVar, fobVar, focVar);
    }

    @Override // defpackage.fra, defpackage.fqq, defpackage.fnw
    public final int a() {
        return 12200000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.audit.internal.IAuditService");
        return queryLocalInterface instanceof fko ? (fko) queryLocalInterface : new fko(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final String c() {
        return "com.google.android.gms.audit.internal.IAuditService";
    }

    @Override // defpackage.fqq
    protected final String d() {
        return "com.google.android.gms.audit.service.START";
    }

    @Override // defpackage.fqq
    public final boolean e() {
        return true;
    }
}
