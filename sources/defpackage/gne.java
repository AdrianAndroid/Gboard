package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: gne  reason: default package */
/* loaded from: classes.dex */
public final class gne implements npe {
    private final oiy a;
    private final /* synthetic */ int b;
    private final Object c;

    public gne(jlv jlvVar, oiy oiyVar, int i) {
        this.b = i;
        this.c = jlvVar;
        this.a = oiyVar;
    }

    public gne(oiy oiyVar, oiy oiyVar2, int i) {
        this.b = i;
        this.a = oiyVar;
        this.c = oiyVar2;
    }

    public gne(oiy oiyVar, oiy oiyVar2, int i, byte[] bArr) {
        this.b = i;
        this.c = oiyVar;
        this.a = oiyVar2;
    }

    public gne(oiy oiyVar, oiy oiyVar2, int i, char[] cArr) {
        this.b = i;
        this.c = oiyVar;
        this.a = oiyVar2;
    }

    public gne(oiy oiyVar, oiy oiyVar2, int i, float[] fArr) {
        this.b = i;
        this.c = oiyVar;
        this.a = oiyVar2;
    }

    public gne(oiy oiyVar, oiy oiyVar2, int i, int[] iArr) {
        this.b = i;
        this.c = oiyVar;
        this.a = oiyVar2;
    }

    public gne(oiy oiyVar, oiy oiyVar2, int i, short[] sArr) {
        this.b = i;
        this.c = oiyVar;
        this.a = oiyVar2;
    }

    public gne(oiy oiyVar, oiy oiyVar2, int i, boolean[] zArr) {
        this.b = i;
        this.c = oiyVar;
        this.a = oiyVar2;
    }

    public gne(oiy oiyVar, oiy oiyVar2, int i, byte[][] bArr) {
        this.b = i;
        this.c = oiyVar;
        this.a = oiyVar2;
    }

    public gne(oiy oiyVar, oiy oiyVar2, int i, char[][] cArr) {
        this.b = i;
        this.c = oiyVar;
        this.a = oiyVar2;
    }

    public gne(oiy oiyVar, oiy oiyVar2, int i, int[][] iArr) {
        this.b = i;
        this.c = oiyVar;
        this.a = oiyVar2;
    }

    public gne(oiy oiyVar, oiy oiyVar2, int i, short[][] sArr) {
        this.b = i;
        this.c = oiyVar;
        this.a = oiyVar2;
    }

    public gne(oiy oiyVar, oiy oiyVar2, int i, boolean[][] zArr) {
        this.b = i;
        this.c = oiyVar;
        this.a = oiyVar2;
    }

    /* JADX WARN: Type inference failed for: r0v112, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, gja] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, oiy] */
    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        Object obj;
        Object r;
        Object obj2;
        Object obj3;
        Object obj4;
        switch (this.b) {
            case 0:
                gjz gjzVar = (gjz) gni.b((gjz) ((npf) this.a).b, npd.b(this.c));
                nxp.X(gjzVar);
                return gjzVar;
            case 1:
                return new cik((Context) ((npf) this.c).b, ((cvy) this.a).b(), new cqu(ciz.d(), ciz.e()), ciz.d(), ciz.i());
            case 2:
                bvq bvqVar = (bvq) gni.b((bvq) ((npf) this.a).b, npd.b(this.c));
                nxp.X(bvqVar);
                return bvqVar;
            case 3:
                gll a = ((glm) this.c).a();
                ((bmm) this.a.a()).b(a);
                return a;
            case 4:
                Object obj5 = this.c;
                ((lba) this.a).b();
                lfb lfbVar = ((jlv) obj5).f;
                nxp.X(lfbVar);
                return lfbVar;
            case 5:
                kor a2 = kos.a(((lba) this.c).b());
                a2.d("mdd_pds_config");
                a2.e(lxj.w("DestFileGroups", (lfb) this.a.a()));
                Uri a3 = a2.a();
                nxp.X(a3);
                return a3;
            case 6:
                kor a4 = kos.a(((lba) this.c).b());
                a4.d("mdd_pds_config");
                a4.e(lxj.w("DiagFileGroups", (lfb) this.a.a()));
                Uri a5 = a4.a();
                nxp.X(a5);
                return a5;
            case 7:
                kor a6 = kos.a(((lba) this.c).b());
                a6.d("mdd_pds_config");
                a6.e(lxj.w("DestSharedFiles", (lfb) this.a.a()));
                Uri a7 = a6.a();
                nxp.X(a7);
                return a7;
            case 8:
                kor a8 = kos.a(((lba) this.c).b());
                a8.d("mdd_pds_config");
                a8.e(lxj.w("DiagSharedFiles", (lfb) this.a.a()));
                Uri a9 = a8.a();
                nxp.X(a9);
                return a9;
            case 9:
                SharedPreferences sharedPreferences = (SharedPreferences) ((lgb) ((khi) this.a).a().c(new ihp(((lba) this.c).b(), 9))).a();
                nxp.X(sharedPreferences);
                return sharedPreferences;
            case 10:
                return new kbe((mks) this.c.a(), (kcl) this.a.a());
            case 11:
                kbt kbtVar = (kbt) this.a.a();
                fpp a10 = ((giz) this.c).a();
                int i = kbtVar.b;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, new kbs(kbtVar.a, 0), new kbr());
                scheduledThreadPoolExecutor.setMaximumPoolSize(i);
                mks D = kcu.D(scheduledThreadPoolExecutor);
                ?? r1 = a10.a;
                if (r1 != 0) {
                    D = r1.a();
                }
                nxp.X(D);
                return D;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new kcl(((lba) this.c).b(), (kdg) this.a.a(), (byte[]) null);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((gmy) this.a).b();
                ?? r0 = this.c;
                if (!ker.a()) {
                    obj = lrr.a;
                } else {
                    obj = lmz.r((kdt) r0.a());
                }
                nxp.X(obj);
                return obj;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ?? r12 = this.c;
                if (!((lfb) ((npf) this.a).b).e()) {
                    r = lrr.a;
                } else {
                    r = lmz.r((kdt) r12.a());
                }
                nxp.X(r);
                return r;
            case 15:
                ((gmy) this.a).b();
                return lmz.r((kdt) this.c.a());
            case 16:
                ((gmy) this.a).b();
                ?? r02 = this.c;
                if (!kfl.e()) {
                    obj2 = lrr.a;
                } else {
                    obj2 = lmz.r((kdt) r02.a());
                }
                nxp.X(obj2);
                return obj2;
            case 17:
                return new kfw((kcl) this.c.a(), (mks) this.a.a());
            case 18:
                kgh kghVar = (kgh) this.c.a();
                if (!((lfb) ((npf) this.a).b).e()) {
                    obj3 = lrr.a;
                } else {
                    obj3 = lmz.r(kghVar);
                }
                nxp.X(obj3);
                return obj3;
            case 19:
                ((gmy) this.a).b();
                ?? r03 = this.c;
                if (!kez.d()) {
                    obj4 = lrr.a;
                } else {
                    obj4 = lmz.r((kdt) r03.a());
                }
                nxp.X(obj4);
                return obj4;
            default:
                kgz kgzVar = (kgz) this.c.a();
                return new kgy(((kha) this.a).a());
        }
    }
}
