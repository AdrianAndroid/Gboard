package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: gea  reason: default package */
/* loaded from: classes.dex */
public final class gea extends fra implements gdu {
    public final fqs s;
    public final Integer t;
    private final boolean u = true;
    private final Bundle v;

    public gea(Context context, Looper looper, fqs fqsVar, Bundle bundle, fob fobVar, foc focVar) {
        super(context, looper, 44, fqsVar, fobVar, focVar);
        this.s = fqsVar;
        this.v = bundle;
        this.t = fqsVar.g;
    }

    @Override // defpackage.fra, defpackage.fqq, defpackage.fnw
    public final int a() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof gdy ? (gdy) queryLocalInterface : new gdy(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.fqq
    protected final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.fqq, defpackage.fnw
    public final boolean o() {
        return this.u;
    }

    @Override // defpackage.fqq
    protected final Bundle v() {
        if (!this.a.getPackageName().equals(this.s.d)) {
            this.v.putString("com.google.android.gms.signin.internal.realClientPackageName", this.s.d);
        }
        return this.v;
    }
}
