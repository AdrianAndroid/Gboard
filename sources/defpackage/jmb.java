package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jmb  reason: default package */
/* loaded from: classes.dex */
public final class jmb implements npe {
    private final oiy a;
    private final oiy b;
    private final oiy c;
    private final oiy d;
    private final oiy e;
    private final oiy f;
    private final /* synthetic */ int g;
    private final Object h;

    public jmb(jma jmaVar, oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, oiy oiyVar6, int i) {
        this.g = i;
        this.h = jmaVar;
        this.a = oiyVar;
        this.b = oiyVar2;
        this.c = oiyVar3;
        this.d = oiyVar4;
        this.e = oiyVar5;
        this.f = oiyVar6;
    }

    public jmb(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, oiy oiyVar6, oiy oiyVar7, int i) {
        this.g = i;
        this.a = oiyVar;
        this.e = oiyVar2;
        this.h = oiyVar3;
        this.c = oiyVar4;
        this.b = oiyVar5;
        this.d = oiyVar6;
        this.f = oiyVar7;
    }

    public jmb(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, oiy oiyVar6, oiy oiyVar7, int i, byte[] bArr) {
        this.g = i;
        this.f = oiyVar;
        this.h = oiyVar2;
        this.c = oiyVar3;
        this.b = oiyVar4;
        this.d = oiyVar5;
        this.a = oiyVar6;
        this.e = oiyVar7;
    }

    public jmb(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, oiy oiyVar6, oiy oiyVar7, int i, char[] cArr) {
        this.g = i;
        this.f = oiyVar;
        this.a = oiyVar2;
        this.h = oiyVar3;
        this.c = oiyVar4;
        this.b = oiyVar5;
        this.d = oiyVar6;
        this.e = oiyVar7;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [mkr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [mkr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [mkr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [mkr, java.lang.Object] */
    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        int i = this.g;
        if (i == 0) {
            Object obj = this.h;
            Context b = ((lba) this.a).b();
            kcq kcqVar = (kcq) this.c.a();
            kqg a = kqh.a();
            a.f((Uri) this.b.a());
            a.e(jio.d);
            a.g(false);
            jma jmaVar = (jma) obj;
            a.b(lre.aO(b, jmaVar.a, (lwm) this.d.a(), ((jkx) this.e).a(), (lfb) this.f.a()));
            return ((kqi) jmaVar.b).a(a.a());
        } else if (i == 1) {
            gjz gjzVar = (gjz) this.a.a();
            gms gmsVar = (gms) this.e.a();
            gmg gmgVar = (gmg) this.h.a();
            bmf bmfVar = (bmf) this.c.a();
            bvq bvqVar = (bvq) this.b.a();
            new fxa(20);
            return new gmo(gmsVar, gmgVar, bmfVar, new fxa(50), new fxa(50), (lfb) this.d.a(), (gnn) ((npf) this.f).b, null, null, null);
        } else if (i == 2) {
            Object obj2 = this.h;
            Context b2 = ((lba) this.a).b();
            kcq kcqVar2 = (kcq) this.c.a();
            kqg a2 = kqh.a();
            a2.f((Uri) this.b.a());
            a2.e(jiw.b);
            a2.g(false);
            jma jmaVar2 = (jma) obj2;
            a2.b(lre.aP(b2, jmaVar2.a, (lwm) this.d.a(), ((jkx) this.e).a(), (lfb) this.f.a()));
            return ((kqi) jmaVar2.b).a(a2.a());
        } else if (i == 3) {
            Object obj3 = this.h;
            Context b3 = ((lba) this.a).b();
            kcq kcqVar3 = (kcq) this.c.a();
            kqg a3 = kqh.a();
            a3.f((Uri) this.b.a());
            a3.e(jio.d);
            a3.g(false);
            jma jmaVar3 = (jma) obj3;
            a3.b(lre.aO(b3, jmaVar3.a, (lwm) this.d.a(), ((jkx) this.e).a(), (lfb) this.f.a()));
            return ((kqi) jmaVar3.b).a(a3.a());
        } else if (i != 4) {
            if (i == 5) {
                kdr a4 = ((kds) this.f).a();
                Context b4 = ((lba) this.h).b();
                mks mksVar = (mks) this.c.a();
                nox b5 = npd.b(this.b);
                oiy oiyVar = this.d;
                gjz gjzVar2 = (gjz) this.a.a();
                return new kdz(a4, b4, mksVar, b5, oiyVar, this.e);
            }
            return new kgv(((kds) this.f).a(), ((lba) this.a).b(), (kcl) this.h.a(), (Executor) this.c.a(), npd.b(this.b), ((khm) this.d).a(), this.e, null);
        } else {
            Object obj4 = this.h;
            Context b6 = ((lba) this.a).b();
            kcq kcqVar4 = (kcq) this.c.a();
            kqg a5 = kqh.a();
            a5.f((Uri) this.b.a());
            a5.e(jiw.b);
            a5.g(false);
            jma jmaVar4 = (jma) obj4;
            a5.b(lre.aP(b6, jmaVar4.a, (lwm) this.d.a(), ((jkx) this.e).a(), (lfb) this.f.a()));
            return ((kqi) jmaVar4.b).a(a5.a());
        }
    }
}
