package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: gdj  reason: default package */
/* loaded from: classes.dex */
public final class gdj extends fra {
    public gdj(Context context, Looper looper, fqs fqsVar, fob fobVar, foc focVar) {
        super(context, looper, 51, fqsVar, fobVar, focVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return queryLocalInterface instanceof gdi ? (gdi) queryLocalInterface : new gdi(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final String c() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.fqq
    protected final String d() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override // defpackage.fqq
    public final fmv[] h() {
        return gcw.g;
    }
}
