package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;

/* compiled from: PG */
/* renamed from: fkz  reason: default package */
/* loaded from: classes.dex */
public final class fkz extends fra {
    public fkz(Context context, Looper looper, fqs fqsVar, fpb fpbVar, fpw fpwVar) {
        super(context, looper, 224, fqsVar, fpbVar, fpwVar);
    }

    @Override // defpackage.fra, defpackage.fqq, defpackage.fnw
    public final int a() {
        return 17895000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return queryLocalInterface instanceof flb ? (flb) queryLocalInterface : new flb(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final String c() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // defpackage.fqq
    protected final String d() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override // defpackage.fqq
    public final boolean e() {
        return true;
    }

    @Override // defpackage.fqq, defpackage.fnw
    public final void f(String str) {
        Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(str));
        super.f(str);
    }

    @Override // defpackage.fqq
    protected final boolean g() {
        return true;
    }

    @Override // defpackage.fqq
    public final fmv[] h() {
        return new fmv[]{fkp.c, fkp.b, fkp.a};
    }
}
