package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bou  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bou implements leq {
    private final /* synthetic */ int v;
    public static final /* synthetic */ bou u = new bou(20);
    public static final /* synthetic */ bou t = new bou(19);
    public static final /* synthetic */ bou s = new bou(18);
    public static final /* synthetic */ bou r = new bou(17);
    public static final /* synthetic */ bou q = new bou(16);
    public static final /* synthetic */ bou p = new bou(15);
    public static final /* synthetic */ bou o = new bou(14);
    public static final /* synthetic */ bou n = new bou(13);
    public static final /* synthetic */ bou m = new bou(12);
    public static final /* synthetic */ bou l = new bou(11);
    public static final /* synthetic */ bou k = new bou(10);
    public static final /* synthetic */ bou j = new bou(9);
    public static final /* synthetic */ bou i = new bou(8);
    public static final /* synthetic */ bou h = new bou(7);
    public static final /* synthetic */ bou g = new bou(6);
    public static final /* synthetic */ bou f = new bou(5);
    public static final /* synthetic */ bou e = new bou(4);
    public static final /* synthetic */ bou d = new bou(3);
    public static final /* synthetic */ bou c = new bou(2);
    public static final /* synthetic */ bou b = new bou(1);
    public static final /* synthetic */ bou a = new bou(0);

    private /* synthetic */ bou(int i2) {
        this.v = i2;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        mbr mbrVar;
        File file = null;
        boolean z = false;
        switch (this.v) {
            case 0:
                iav iavVar = (iav) obj;
                if (iavVar != null) {
                    return llp.r(iavVar);
                }
                return llp.q();
            case 1:
                hqt hqtVar = (hqt) obj;
                iav g2 = hqtVar != null ? hqtVar.g() : null;
                if (g2 == null) {
                    return null;
                }
                return g2.y;
            case 2:
                llk e2 = llp.e();
                for (List list : (List) obj) {
                    e2.j(list);
                }
                return e2.g();
            case 3:
                List list2 = (List) obj;
                int i2 = byv.a;
                return null;
            case 4:
                return ((mrc) obj).b;
            case 5:
                Exception exc = (Exception) obj;
                hhl hhlVar = cfd.a;
                return jre.k(llp.q(), llp.q());
            case 6:
                llp llpVar = (llp) obj;
                nfh t2 = chm.b.t();
                int size = llpVar.size();
                for (int i3 = 0; i3 < size; i3++) {
                    cqb cqbVar = (cqb) llpVar.get(i3);
                    nfh t3 = chl.f.t();
                    String str = cqbVar.a;
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    chl chlVar = (chl) t3.b;
                    str.getClass();
                    int i4 = chlVar.a | 1;
                    chlVar.a = i4;
                    chlVar.b = str;
                    long j2 = cqbVar.b;
                    int i5 = i4 | 2;
                    chlVar.a = i5;
                    chlVar.c = j2;
                    long j3 = cqbVar.c;
                    int i6 = i5 | 4;
                    chlVar.a = i6;
                    chlVar.d = j3;
                    int i7 = cqbVar.d;
                    chlVar.a = i6 | 8;
                    chlVar.e = i7;
                    chl chlVar2 = (chl) t3.cz();
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    chm chmVar = (chm) t2.b;
                    chlVar2.getClass();
                    nga ngaVar = chmVar.a;
                    if (!ngaVar.c()) {
                        chmVar.a = nfm.H(ngaVar);
                    }
                    chmVar.a.add(chlVar2);
                }
                return (chm) t2.cz();
            case 7:
                llp llpVar2 = (llp) obj;
                nfh t4 = chk.b.t();
                int size2 = llpVar2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    cpw cpwVar = (cpw) llpVar2.get(i8);
                    nfh t5 = chj.g.t();
                    String str2 = cpwVar.a;
                    if (t5.c) {
                        t5.cD();
                        t5.c = false;
                    }
                    chj chjVar = (chj) t5.b;
                    str2.getClass();
                    int i9 = chjVar.a | 1;
                    chjVar.a = i9;
                    chjVar.b = str2;
                    String str3 = cpwVar.b;
                    str3.getClass();
                    int i10 = i9 | 2;
                    chjVar.a = i10;
                    chjVar.c = str3;
                    long j4 = cpwVar.c;
                    int i11 = i10 | 4;
                    chjVar.a = i11;
                    chjVar.d = j4;
                    long j5 = cpwVar.d;
                    int i12 = i11 | 8;
                    chjVar.a = i12;
                    chjVar.e = j5;
                    int i13 = cpwVar.e;
                    chjVar.a = i12 | 16;
                    chjVar.f = i13;
                    chj chjVar2 = (chj) t5.cz();
                    if (t4.c) {
                        t4.cD();
                        t4.c = false;
                    }
                    chk chkVar = (chk) t4.b;
                    chjVar2.getClass();
                    nga ngaVar2 = chkVar.a;
                    if (!ngaVar2.c()) {
                        chkVar.a = nfm.H(ngaVar2);
                    }
                    chkVar.a.add(chjVar2);
                }
                return (chk) t4.cz();
            case 8:
                llp llpVar3 = (llp) obj;
                nfh t6 = cho.b.t();
                int size3 = llpVar3.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    String str4 = ((cxc) llpVar3.get(i14)).b;
                    if (t6.c) {
                        t6.cD();
                        t6.c = false;
                    }
                    cho choVar = (cho) t6.b;
                    str4.getClass();
                    nga ngaVar3 = choVar.a;
                    if (!ngaVar3.c()) {
                        choVar.a = nfm.H(ngaVar3);
                    }
                    choVar.a.add(str4);
                }
                return (cho) t6.cz();
            case 9:
                return (String) ((Map.Entry) obj).getKey();
            case 10:
                return ((cww) obj).a();
            case 11:
                mse mseVar = (mse) obj;
                return (mseVar.b & 64) != 0 ? mseVar.o : mseVar.d;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                mse mseVar2 = (mse) obj;
                return ffb.l((mseVar2.b & 64) != 0 ? mseVar2.o : mseVar2.d);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                mse mseVar3 = (mse) obj;
                return (mseVar3.b & 64) != 0 ? mseVar3.o : mseVar3.d;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((mse) obj).d;
            case 15:
                mse mseVar4 = (mse) obj;
                return (mseVar4.b & 64) != 0 ? mseVar4.o : mseVar4.d;
            case 16:
                return Integer.valueOf(((llw) obj).size());
            case 17:
                cja cjaVar = (cja) obj;
                if (cjaVar instanceof cjo) {
                    z = czs.c(((cjo) cjaVar).d().d());
                }
                return Boolean.valueOf(z);
            case 18:
                return ((cjo) obj).d();
            case 19:
                cqp cqpVar = (cqp) obj;
                File u2 = cqpVar.u();
                nfh t7 = cks.i.t();
                int c2 = cqpVar.c();
                if (t7.c) {
                    t7.cD();
                    t7.c = false;
                }
                cks cksVar = (cks) t7.b;
                cksVar.a |= 1;
                cksVar.b = c2;
                int b2 = cqpVar.b();
                if (t7.c) {
                    t7.cD();
                    t7.c = false;
                }
                cks cksVar2 = (cks) t7.b;
                cksVar2.a |= 2;
                cksVar2.c = b2;
                String d2 = lfd.d(cqpVar.r());
                if (t7.c) {
                    t7.cD();
                    t7.c = false;
                }
                cks cksVar3 = (cks) t7.b;
                cksVar3.a |= 4;
                cksVar3.d = d2;
                String uri = cqpVar.d().toString();
                if (t7.c) {
                    t7.cD();
                    t7.c = false;
                }
                cks cksVar4 = (cks) t7.b;
                uri.getClass();
                cksVar4.a |= 8;
                cksVar4.e = uri;
                String absolutePath = u2 != null ? u2.getAbsolutePath() : "";
                if (t7.c) {
                    t7.cD();
                    t7.c = false;
                }
                cks cksVar5 = (cks) t7.b;
                absolutePath.getClass();
                cksVar5.a |= 16;
                cksVar5.f = absolutePath;
                String o2 = cqpVar.o();
                if (t7.c) {
                    t7.cD();
                    t7.c = false;
                }
                cks cksVar6 = (cks) t7.b;
                cksVar6.a |= 32;
                cksVar6.g = o2;
                String d3 = lfd.d(cqpVar.p());
                if (t7.c) {
                    t7.cD();
                    t7.c = false;
                }
                cks cksVar7 = (cks) t7.b;
                cksVar7.a |= 64;
                cksVar7.h = d3;
                return (cks) t7.cz();
            default:
                cks cksVar8 = (cks) obj;
                String str5 = cksVar8.g;
                String str6 = cksVar8.f;
                if (str5.isEmpty() && !str6.isEmpty()) {
                    jdg.u(str6);
                    str5 = new File(str6).getName();
                    int lastIndexOf = str5.lastIndexOf(46);
                    if (lastIndexOf != -1) {
                        str5 = str5.substring(0, lastIndexOf);
                    }
                }
                cqo t8 = cqp.t();
                t8.n(cksVar8.b);
                t8.f(cksVar8.c);
                t8.l(cksVar8.d);
                t8.h(Uri.parse(cksVar8.e));
                if (str6 != null) {
                    file = new File(str6).getAbsoluteFile();
                }
                t8.o(file);
                t8.g(str5);
                t8.c = cksVar8.h;
                if ("sticker".equals(cksVar8.d)) {
                    mbrVar = mbr.TENOR_STICKER;
                } else {
                    mbrVar = mbr.TENOR_GIF;
                }
                t8.e(mbrVar);
                return t8.a();
        }
    }
}
