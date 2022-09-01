package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jly  reason: default package */
/* loaded from: classes.dex */
public final class jly implements npe {
    private final oiy a;
    private final oiy b;
    private final oiy c;
    private final oiy d;
    private final oiy e;
    private final /* synthetic */ int f;

    public jly(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, int i) {
        this.f = i;
        this.a = oiyVar;
        this.b = oiyVar2;
        this.c = oiyVar3;
        this.d = oiyVar4;
        this.e = oiyVar5;
    }

    public jly(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, int i, byte[] bArr) {
        this.f = i;
        this.a = oiyVar;
        this.b = oiyVar2;
        this.d = oiyVar3;
        this.c = oiyVar4;
        this.e = oiyVar5;
    }

    public jly(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, int i, char[] cArr) {
        this.f = i;
        this.a = oiyVar;
        this.b = oiyVar2;
        this.d = oiyVar3;
        this.c = oiyVar4;
        this.e = oiyVar5;
    }

    public jly(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, int i, int[] iArr) {
        this.f = i;
        this.c = oiyVar;
        this.e = oiyVar2;
        this.d = oiyVar3;
        this.a = oiyVar4;
        this.b = oiyVar5;
    }

    public jly(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, int i, short[] sArr) {
        this.f = i;
        this.c = oiyVar;
        this.e = oiyVar2;
        this.d = oiyVar3;
        this.a = oiyVar4;
        this.b = oiyVar5;
    }

    public jly(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, int i, boolean[] zArr) {
        this.f = i;
        this.d = oiyVar;
        this.a = oiyVar2;
        this.b = oiyVar3;
        this.c = oiyVar4;
        this.e = oiyVar5;
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        kdt kdtVar;
        int i = this.f;
        if (i == 0) {
            ((lba) this.a).b();
            jlu jluVar = (jlu) this.c.a();
            return new jkw((jjd) this.b.a(), (kqr) this.d.a(), (Executor) this.e.a());
        } else if (i == 1) {
            return new jla(((lba) this.a).b(), (jlu) this.b.a(), (kqr) this.d.a(), (Executor) this.c.a(), (jhy) this.e.a());
        } else {
            if (i == 2) {
                return new jla(((lba) this.a).b(), (jlu) this.b.a(), (kqr) this.d.a(), (Executor) this.c.a(), (jhy) this.e.a());
            }
            if (i == 3) {
                kdr a = ((kds) this.c).a();
                mks mksVar = (mks) this.e.a();
                return new ker(a, (Executor) this.d.a(), npd.b(this.a), this.b);
            } else if (i == 4) {
                ((gmy) this.c).b();
                lfb a2 = ((kha) this.d).a();
                oiy oiyVar = this.a;
                oiy oiyVar2 = this.b;
                if (!((lfb) ((npf) this.e).b).e() || !a2.e()) {
                    kdtVar = (kdt) oiyVar.a();
                } else {
                    kdtVar = (kdt) oiyVar2.a();
                }
                return lmz.r(kdtVar);
            } else {
                kdr a3 = ((kds) this.d).a();
                Executor executor = (Executor) this.a.a();
                return new kgz(a3, npd.b(this.b), this.c, ((kho) this.e).a(), null, null);
            }
        }
    }
}
