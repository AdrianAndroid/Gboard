package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: mnp  reason: default package */
/* loaded from: classes2.dex */
public final class mnp extends fra {
    public mnp(Context context, Looper looper, fqs fqsVar, fob fobVar, foc focVar) {
        super(context, looper, 131, fqsVar, fobVar, focVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        return queryLocalInterface instanceof mnv ? (mnv) queryLocalInterface : new mnv(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final String c() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    @Override // defpackage.fqq
    protected final String d() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    @Override // defpackage.fqq
    public final boolean e() {
        return true;
    }
}
