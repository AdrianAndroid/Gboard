package defpackage;

import android.net.ConnectivityManager;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gmh  reason: default package */
/* loaded from: classes.dex */
public final class gmh implements npe {
    private final oiy a;
    private final oiy b;
    private final oiy c;
    private final oiy d;
    private final /* synthetic */ int e;

    public gmh(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, int i) {
        this.e = i;
        this.a = oiyVar;
        this.b = oiyVar2;
        this.c = oiyVar3;
        this.d = oiyVar4;
    }

    public gmh(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, int i, byte[] bArr) {
        this.e = i;
        this.b = oiyVar;
        this.d = oiyVar2;
        this.a = oiyVar3;
        this.c = oiyVar4;
    }

    public gmh(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, int i, char[] cArr) {
        this.e = i;
        this.c = oiyVar;
        this.a = oiyVar2;
        this.d = oiyVar3;
        this.b = oiyVar4;
    }

    public gmh(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, int i, int[] iArr) {
        this.e = i;
        this.b = oiyVar;
        this.c = oiyVar2;
        this.a = oiyVar3;
        this.d = oiyVar4;
    }

    public gmh(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, int i, short[] sArr) {
        this.e = i;
        this.b = oiyVar;
        this.c = oiyVar2;
        this.d = oiyVar3;
        this.a = oiyVar4;
    }

    public gmh(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, int i, boolean[] zArr) {
        this.e = i;
        this.b = oiyVar;
        this.d = oiyVar2;
        this.c = oiyVar3;
        this.a = oiyVar4;
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        int i = this.e;
        if (i == 0) {
            gjz gjzVar = (gjz) this.a.a();
            return new gmg((gnn) ((npf) this.b).b, (ConnectivityManager) this.c.a(), (gms) this.d.a());
        } else if (i == 1) {
            return new ehi(((egx) this.b).b(), ((csn) this.d).c(), (cou) this.a.a(), ((ehh) this.c).a());
        } else {
            if (i == 2) {
                return new key(npd.b(this.c), this.a, (lfb) ((npf) this.d).b, (Executor) this.b.a());
            }
            if (i == 3) {
                return new khv(this.b, this.c, this.d, this.a);
            }
            if (i == 4) {
                return new laz((lbg) this.b.a(), (lax) this.c.a(), (lav) this.a.a(), (lbi) this.d.a());
            }
            return new lbs(((lba) this.b).b(), (File) this.d.a(), (lav) this.c.a(), npd.b(this.a));
        }
    }
}
