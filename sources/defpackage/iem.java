package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: iem  reason: default package */
/* loaded from: classes.dex */
public final class iem extends idz {
    public iem(Context context) {
        super(context, gkd.a(context, new gjb(-459522096, R.raw.f147420_resource_name_obfuscated_res_0x7f13005c)));
    }

    @Override // defpackage.idz, defpackage.idi
    public final void f(mbh mbhVar, int i, long j, long j2) {
        int i2 = mbhVar.cR;
        if (i2 == -1) {
            i2 = nhh.a.b(mbhVar).a(mbhVar);
            mbhVar.cR = i2;
        }
        if (i2 == 0) {
            mde mdeVar = ieo.a().a;
            nfh t = mbh.aT.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbh mbhVar2 = (mbh) t.b;
            mdeVar.getClass();
            mbhVar2.A = mdeVar;
            mbhVar2.a |= 536870912;
            mbhVar = (mbh) t.cz();
        }
        super.f(mbhVar, i, j, j2);
    }

    @Override // defpackage.idz
    protected final ieq k() {
        return new ieq(ino.L());
    }
}
