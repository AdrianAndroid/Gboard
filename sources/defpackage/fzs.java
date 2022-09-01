package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: fzs  reason: default package */
/* loaded from: classes.dex */
public final class fzs extends bkf implements fzu {
    public fzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.IExampleStoreV2");
    }

    @Override // defpackage.fzu
    public final void e(String str, ftm ftmVar, ftm ftmVar2, fzr fzrVar) {
        Parcel a = a();
        a.writeString(str);
        bkh.f(a, ftmVar);
        bkh.f(a, ftmVar2);
        bkh.f(a, fzrVar);
        hI(2, a);
    }

    @Override // defpackage.fzu
    public final void f(String str, ftm ftmVar, ftm ftmVar2, fzr fzrVar, ftm ftmVar3) {
        Parcel a = a();
        a.writeString(str);
        bkh.f(a, ftmVar);
        bkh.f(a, ftmVar2);
        bkh.f(a, fzrVar);
        bkh.f(a, ftmVar3);
        hI(4, a);
    }

    @Override // defpackage.fzu
    public final boolean g() {
        Parcel hG = hG(3, a());
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }
}
