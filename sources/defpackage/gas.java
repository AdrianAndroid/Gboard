package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: gas  reason: default package */
/* loaded from: classes.dex */
public final class gas extends bkf implements gau {
    public gas(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppTrainer");
    }

    @Override // defpackage.gau
    public final boolean initV26(ftm ftmVar, ftm ftmVar2, fwm fwmVar, fpo fpoVar) {
        Parcel a = a();
        bkh.f(a, ftmVar);
        bkh.f(a, ftmVar2);
        bkh.d(a, fwmVar);
        bkh.f(a, fpoVar);
        Parcel hG = hG(6, a);
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }

    @Override // defpackage.gau
    public final boolean initW24(ftm ftmVar, ftm ftmVar2, fwm fwmVar, fpo fpoVar) {
        Parcel a = a();
        bkh.f(a, ftmVar);
        bkh.f(a, ftmVar2);
        bkh.d(a, fwmVar);
        bkh.f(a, fpoVar);
        Parcel hG = hG(7, a);
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }

    @Override // defpackage.gau
    public final boolean initY2020W18(ftm ftmVar, ftm ftmVar2, fwm fwmVar, fpo fpoVar) {
        Parcel a = a();
        bkh.f(a, ftmVar);
        bkh.f(a, ftmVar2);
        bkh.d(a, fwmVar);
        bkh.f(a, fpoVar);
        Parcel hG = hG(8, a);
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }

    @Override // defpackage.gau
    public final boolean initY2020W30(ftm ftmVar, ftm ftmVar2, fwm fwmVar, fpo fpoVar) {
        Parcel a = a();
        bkh.f(a, ftmVar);
        bkh.f(a, ftmVar2);
        bkh.d(a, fwmVar);
        bkh.f(a, fpoVar);
        Parcel hG = hG(9, a);
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }

    @Override // defpackage.gau
    public final boolean initY2020W36(ftm ftmVar, ftm ftmVar2, fwm fwmVar, fpo fpoVar) {
        Parcel a = a();
        bkh.f(a, ftmVar);
        bkh.f(a, ftmVar2);
        bkh.d(a, fwmVar);
        bkh.f(a, fpoVar);
        Parcel hG = hG(10, a);
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }

    @Override // defpackage.gau
    public final boolean initY2021W30(ftm ftmVar, ftm ftmVar2, fwm fwmVar, fpo fpoVar) {
        throw null;
    }

    @Override // defpackage.gau
    public final boolean initY2022W24(ftm ftmVar, ftm ftmVar2, fwm fwmVar, fpo fpoVar) {
        Parcel a = a();
        bkh.f(a, ftmVar);
        bkh.f(a, ftmVar2);
        bkh.d(a, fwmVar);
        bkh.f(a, fpoVar);
        Parcel hG = hG(12, a);
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }

    @Override // defpackage.gau
    public final void start(int i, fpo fpoVar) {
        Parcel a = a();
        a.writeInt(0);
        bkh.f(a, fpoVar);
        hI(3, a);
    }

    @Override // defpackage.gau
    public final void stop(fpo fpoVar) {
        Parcel a = a();
        bkh.f(a, fpoVar);
        hI(4, a);
    }
}
