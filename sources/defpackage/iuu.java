package defpackage;

import android.text.TextUtils;
import android.text.style.URLSpan;
import com.google.android.libraries.inputmethod.trainingcache.maintenance.maintainer.MaintenanceTaskRunner;
import java.util.Locale;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: iuu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iuu implements leq {
    private final /* synthetic */ int u;
    public static final /* synthetic */ iuu t = new iuu(19);
    public static final /* synthetic */ iuu s = new iuu(18);
    public static final /* synthetic */ iuu r = new iuu(17);
    public static final /* synthetic */ iuu q = new iuu(16);
    public static final /* synthetic */ iuu p = new iuu(15);
    public static final /* synthetic */ iuu o = new iuu(14);
    public static final /* synthetic */ iuu n = new iuu(13);
    public static final /* synthetic */ iuu m = new iuu(12);
    public static final /* synthetic */ iuu l = new iuu(11);
    public static final /* synthetic */ iuu k = new iuu(10);
    public static final /* synthetic */ iuu j = new iuu(9);
    public static final /* synthetic */ iuu i = new iuu(8);
    public static final /* synthetic */ iuu h = new iuu(7);
    public static final /* synthetic */ iuu g = new iuu(6);
    public static final /* synthetic */ iuu f = new iuu(5);
    public static final /* synthetic */ iuu e = new iuu(4);
    public static final /* synthetic */ iuu d = new iuu(3);
    public static final /* synthetic */ iuu c = new iuu(2);
    public static final /* synthetic */ iuu b = new iuu(1);
    public static final /* synthetic */ iuu a = new iuu(0);

    public /* synthetic */ iuu(int i2) {
        this.u = i2;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.lang.AutoCloseable] */
    @Override // defpackage.leq
    public final Object a(Object obj) {
        switch (this.u) {
            case 0:
                return ((muz) obj).a;
            case 1:
                mxy mxyVar = iur.a;
                return jav.e((String) obj).q().toLanguageTag();
            case 2:
                muz muzVar = (muz) obj;
                ltg ltgVar = iuv.a;
                nfh t2 = mrc.d.t();
                nem nemVar = muzVar.a;
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mrc mrcVar = (mrc) t2.b;
                nemVar.getClass();
                int i2 = 1 | mrcVar.a;
                mrcVar.a = i2;
                mrcVar.b = nemVar;
                long j2 = muzVar.b;
                mrcVar.a = i2 | 2;
                mrcVar.c = j2;
                return (mrc) t2.cz();
            case 3:
                mvm mvmVar = (mvm) obj;
                return new Locale(mvmVar.g, mvmVar.h).toLanguageTag();
            case 4:
                return Long.valueOf(((mvm) obj).j);
            case 5:
                mxd mxdVar = (mxd) obj;
                ltg ltgVar2 = ivr.a;
                nfh t3 = jhs.h.t();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                jhs jhsVar = (jhs) t3.b;
                jhsVar.a = 1 | jhsVar.a;
                jhsVar.b = "nebulae-lc-artifacts";
                Iterable ab = lre.ab(ivr.d(mxdVar).values(), g);
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                jhs jhsVar2 = (jhs) t3.b;
                jhsVar2.b();
                ndt.cs(ab, jhsVar2.f);
                return (jhs) t3.cz();
            case 6:
                mxc mxcVar = (mxc) obj;
                ltg ltgVar3 = ivr.a;
                nfh t4 = jhr.k.t();
                String str = mxcVar.b;
                if (t4.c) {
                    t4.cD();
                    t4.c = false;
                }
                jhr jhrVar = (jhr) t4.b;
                str.getClass();
                jhrVar.a = 1 | jhrVar.a;
                jhrVar.b = str;
                mxb mxbVar = mxcVar.d;
                if (mxbVar == null) {
                    mxbVar = mxb.d;
                }
                String str2 = mxbVar.b;
                if (t4.c) {
                    t4.cD();
                    t4.c = false;
                }
                jhr jhrVar2 = (jhr) t4.b;
                str2.getClass();
                int i3 = jhrVar2.a | 16;
                jhrVar2.a = i3;
                jhrVar2.f = str2;
                mxb mxbVar2 = mxcVar.d;
                String str3 = (mxbVar2 == null ? mxb.d : mxbVar2).a;
                str3.getClass();
                int i4 = i3 | 2;
                jhrVar2.a = i4;
                jhrVar2.c = str3;
                if (mxbVar2 == null) {
                    mxbVar2 = mxb.d;
                }
                int i5 = mxbVar2.c;
                jhrVar2.a = i4 | 4;
                jhrVar2.d = i5;
                nfh t5 = ndy.c.t();
                if (t5.c) {
                    t5.cD();
                    t5.c = false;
                }
                ((ndy) t5.b).a = "type.googleapis.com/keyboard.nebulae.LocalComputationArtifacts";
                mxb mxbVar3 = mxcVar.d;
                if (mxbVar3 == null) {
                    mxbVar3 = mxb.d;
                }
                nem n2 = mxbVar3.n();
                if (t5.c) {
                    t5.cD();
                    t5.c = false;
                }
                ((ndy) t5.b).b = n2;
                if (t4.c) {
                    t4.cD();
                    t4.c = false;
                }
                jhr jhrVar3 = (jhr) t4.b;
                ndy ndyVar = (ndy) t5.cz();
                ndyVar.getClass();
                jhrVar3.j = ndyVar;
                jhrVar3.a |= 8192;
                return (jhr) t4.cz();
            case 7:
                ixe ixeVar = (ixe) obj;
                ltg ltgVar4 = MaintenanceTaskRunner.a;
                ixeVar.j();
                gvt.a(ixeVar);
                return null;
            case 8:
                ixe ixeVar2 = (ixe) obj;
                ixeVar2.m();
                gvt.a(ixeVar2);
                return null;
            case 9:
                jls jlsVar = (jls) obj;
                gvt.a(jlsVar.b);
                iwq iwqVar = (iwq) jlsVar.a;
                hst hstVar = iwqVar.f;
                if (hstVar != null) {
                    hstVar.h();
                }
                hzr hzrVar = iwqVar.e;
                if (hzrVar != null) {
                    hzrVar.e();
                }
                return null;
            case 10:
                return ((ipl) obj).d();
            case 11:
                return jay.f((String) obj);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new jbq((URLSpan) obj);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((jen) obj).a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                gdn gdnVar = (gdn) obj;
                ltg ltgVar5 = jgg.a;
                if (gdnVar != null) {
                    String str4 = gdnVar.a;
                    if (!TextUtils.isEmpty(str4)) {
                        return new jge(str4);
                    }
                    throw new IllegalStateException("getZwiebackFuture: token=<empty>");
                }
                throw new IllegalStateException("getZwiebackFuture: token=null");
            case 15:
                Void r7 = (Void) obj;
                return true;
            case 16:
                jho jhoVar = (jho) obj;
                jdg.u(jhoVar);
                return jhoVar;
            case 17:
                return (jho) ((nfh) obj).cz();
            case 18:
                jhv jhvVar = (jhv) obj;
                return null;
            case 19:
                return ((llk) obj).g();
            default:
                jho jhoVar2 = (jho) obj;
                if (jhoVar2 != null) {
                    nfh t6 = mgy.h.t();
                    String str5 = jhoVar2.b;
                    if (t6.c) {
                        t6.cD();
                        t6.c = false;
                    }
                    mgy mgyVar = (mgy) t6.b;
                    str5.getClass();
                    int i6 = 1 | mgyVar.a;
                    mgyVar.a = i6;
                    mgyVar.b = str5;
                    String str6 = jhoVar2.c;
                    str6.getClass();
                    int i7 = i6 | 4;
                    mgyVar.a = i7;
                    mgyVar.d = str6;
                    int i8 = jhoVar2.e;
                    mgyVar.a = i7 | 2;
                    mgyVar.c = i8;
                    int size = jhoVar2.g.size();
                    if (t6.c) {
                        t6.cD();
                        t6.c = false;
                    }
                    mgy mgyVar2 = (mgy) t6.b;
                    int i9 = mgyVar2.a | 8;
                    mgyVar2.a = i9;
                    mgyVar2.e = size;
                    String str7 = jhoVar2.i;
                    str7.getClass();
                    int i10 = i9 | 128;
                    mgyVar2.a = i10;
                    mgyVar2.g = str7;
                    long j3 = jhoVar2.h;
                    mgyVar2.a = i10 | 64;
                    mgyVar2.f = j3;
                    mgy mgyVar3 = (mgy) t6.cz();
                }
                return jhoVar2;
        }
    }
}
