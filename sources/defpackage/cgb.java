package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: cgb  reason: default package */
/* loaded from: classes.dex */
public final class cgb implements idm {
    private final idi b;
    public final nfh a = mbh.aT.t();
    private final idb c = new cgc(this);

    public cgb(idi idiVar) {
        this.b = idiVar;
    }

    public final void a(String str) {
        nfh t;
        if (!TextUtils.isEmpty(str)) {
            mbh mbhVar = (mbh) this.a.b;
            if ((mbhVar.a & 128) == 0) {
                t = mca.j.t();
            } else {
                mca mcaVar = mbhVar.j;
                if (mcaVar == null) {
                    mcaVar = mca.j;
                }
                t = (nfh) mcaVar.N(5);
                t.cG(mcaVar);
            }
            nfh nfhVar = this.a;
            String b = ieo.a().b(str);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mca mcaVar2 = (mca) t.b;
            b.getClass();
            mcaVar2.a |= 8;
            mcaVar2.e = b;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mbh mbhVar2 = (mbh) nfhVar.b;
            mca mcaVar3 = (mca) t.cz();
            mcaVar3.getClass();
            mbhVar2.j = mcaVar3;
            mbhVar2.a |= 128;
        }
    }

    public final void b(int i, String str, String str2, String str3) {
        char c;
        a(str3);
        nfh t = map.d.t();
        int hashCode = str.hashCode();
        if (hashCode != 1196892253) {
            if (hashCode == 1632314654 && str.equals("android:platform")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("android:autofill")) {
                c = 0;
            }
            c = 65535;
        }
        int i2 = c != 0 ? c != 1 ? 1 : 2 : 3;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        map mapVar = (map) t.b;
        mapVar.b = i2 - 1;
        int i3 = mapVar.a | 1;
        mapVar.a = i3;
        if (str2 != null) {
            mapVar.a = i3 | 2;
            mapVar.c = str2;
        }
        nfh nfhVar = this.a;
        map mapVar2 = (map) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mapVar2.getClass();
        mbhVar.av = mapVar2;
        mbhVar.d |= 32;
        c(this.a, i);
    }

    public final void c(nfh nfhVar, int i) {
        idb idbVar = this.c;
        this.b.f((mbh) nfhVar.cz(), i, idbVar.c, idbVar.d);
        nfhVar.b = (nfm) nfhVar.b.N(4);
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.c.b(idoVar, iduVar, j, j2, objArr);
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
        return cgc.a;
    }
}
