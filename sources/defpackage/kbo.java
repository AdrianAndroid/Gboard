package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: kbo  reason: default package */
/* loaded from: classes.dex */
public final class kbo implements npe {
    private final oiy a;
    private final /* synthetic */ int b;

    public kbo(oiy oiyVar, int i) {
        this.b = i;
        this.a = oiyVar;
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return (gjz) ((lfb) ((npf) this.a).b).c(new gjz());
            case 1:
                kbj a = ((kbg) this.a).a();
                kbj.a(new opu(a));
                return a;
            case 2:
                gjz gjzVar = (gjz) this.a.a();
                return new kbn();
            case 3:
                return Boolean.valueOf(nqj.a.a().b(((lba) this.a).b()));
            case 4:
                ona a2 = nqj.a.a().a(((lba) this.a).b());
                nxp.X(a2);
                return a2;
            case 5:
                oor a3 = nqm.a.a().a(((lba) this.a).b());
                nxp.X(a3);
                return a3;
            case 6:
                oor a4 = nqp.a.a().a(((lba) this.a).b());
                nxp.X(a4);
                return a4;
            case 7:
                return Boolean.valueOf(nqv.a.a().c(((lba) this.a).b()));
            case 8:
                return Boolean.valueOf(nrh.a.a().c(((lba) this.a).b()));
            case 9:
                return Long.valueOf(nrh.a.a().a(((lba) this.a).b()));
            case 10:
                kfn a5 = nqv.a.a().a(((lba) this.a).b());
                nxp.X(a5);
                return a5;
            case 11:
                oor b = nqv.a.a().b(((lba) this.a).b());
                nxp.X(b);
                return b;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                oor a6 = nqy.a.a().a(((lba) this.a).b());
                nxp.X(a6);
                return a6;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                oor a7 = nre.a.a().a(((lba) this.a).b());
                nxp.X(a7);
                return a7;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                kej a8 = nqs.a.a().a(((lba) this.a).b());
                nxp.X(a8);
                return a8;
            case 15:
                return Boolean.valueOf(nqv.a.a().d(((lba) this.a).b()));
            case 16:
                oor b2 = nrh.a.a().b(((lba) this.a).b());
                nxp.X(b2);
                return b2;
            case 17:
                oor a9 = nrk.a.a().a(((lba) this.a).b());
                nxp.X(a9);
                return a9;
            case 18:
                oor a10 = nrn.a.a().a(((lba) this.a).b());
                nxp.X(a10);
                return a10;
            case 19:
                oor a11 = nrq.a.a().a(((lba) this.a).b());
                nxp.X(a11);
                return a11;
            default:
                return new kcm((jlr) this.a.a(), null);
        }
    }
}
