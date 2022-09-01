package com.google.android.libraries.inputmethod.ondevicemetricaggregation;

import android.content.Context;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OnDeviceMetricAggregationProcessor implements idm {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/ondevicemetricaggregation/OnDeviceMetricAggregationProcessor");
    public final idi b;
    public hqt e;
    public Collection f;
    public final nfh j = mve.g.t();
    public long c = 0;
    public long d = 0;
    public final nfh g = mww.g.t();
    public final nfh h = mwz.h.t();
    public final idb i = new ijn(this);

    public OnDeviceMetricAggregationProcessor(Context context, idi idiVar) {
        hrx.y(context);
        this.b = idiVar;
    }

    public static native byte[] getAggregatedMetrics(byte[] bArr);

    public final long a() {
        return this.i.e.a(ide.c);
    }

    public final void b(mvi mviVar, boolean z) {
        nfh nfhVar = this.g;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mww mwwVar = (mww) nfhVar.b;
        mww mwwVar2 = mww.g;
        mwwVar.b = null;
        mwwVar.a &= -2;
        if (mviVar.c) {
            nfh nfhVar2 = this.h;
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            mwz mwzVar = (mwz) nfhVar2.b;
            mwz mwzVar2 = mwz.h;
            mwzVar.a |= 1;
            mwzVar.b = true;
        }
        if (mviVar.i) {
            nfh nfhVar3 = this.h;
            if (nfhVar3.c) {
                nfhVar3.cD();
                nfhVar3.c = false;
            }
            mwz mwzVar3 = (mwz) nfhVar3.b;
            mwz mwzVar4 = mwz.h;
            mwzVar3.a |= 2;
            mwzVar3.c = true;
        }
        if (mviVar.E) {
            nfh nfhVar4 = this.h;
            if (nfhVar4.c) {
                nfhVar4.cD();
                nfhVar4.c = false;
            }
            mwz mwzVar5 = (mwz) nfhVar4.b;
            mwz mwzVar6 = mwz.h;
            mwzVar5.a |= 8;
            mwzVar5.e = true;
        }
        if (mviVar.J) {
            if (z) {
                nfh nfhVar5 = this.h;
                if (nfhVar5.c) {
                    nfhVar5.cD();
                    nfhVar5.c = false;
                }
                mwz mwzVar7 = (mwz) nfhVar5.b;
                mwz mwzVar8 = mwz.h;
                mwzVar7.a |= 32;
                mwzVar7.g = true;
            } else {
                nfh nfhVar6 = this.h;
                if (nfhVar6.c) {
                    nfhVar6.cD();
                    nfhVar6.c = false;
                }
                mwz mwzVar9 = (mwz) nfhVar6.b;
                mwz mwzVar10 = mwz.h;
                mwzVar9.a |= 16;
                mwzVar9.f = true;
            }
        }
        if (mviVar.H) {
            nfh nfhVar7 = this.h;
            if (nfhVar7.c) {
                nfhVar7.cD();
                nfhVar7.c = false;
            }
            mwz mwzVar11 = (mwz) nfhVar7.b;
            mwz mwzVar12 = mwz.h;
            mwzVar11.a |= 4;
            mwzVar11.d = true;
        }
        nfh nfhVar8 = this.g;
        nfh nfhVar9 = this.h;
        if (nfhVar8.c) {
            nfhVar8.cD();
            nfhVar8.c = false;
        }
        mww mwwVar3 = (mww) nfhVar8.b;
        mwz mwzVar13 = (mwz) nfhVar9.cz();
        mwzVar13.getClass();
        mwwVar3.f = mwzVar13;
        mwwVar3.a |= 16;
    }

    @Override // defpackage.idj
    public final void e() {
        hqt b = hqp.b();
        this.e = b;
        if (b != null) {
            this.f = b.k();
        }
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.i.b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return ijn.a;
    }
}
