package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: fvm  reason: default package */
/* loaded from: classes.dex */
public final class fvm extends fra {
    public fvm(Context context, Looper looper, fqs fqsVar, fob fobVar, foc focVar) {
        super(context, looper, 63, fqsVar, fobVar, focVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        return queryLocalInterface instanceof fvo ? (fvo) queryLocalInterface : new fvo(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final String c() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }

    @Override // defpackage.fqq
    protected final String d() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }
}
