package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cvr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cvr implements miy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ cvr(cqu cquVar, AtomicInteger atomicInteger, cqp cqpVar, int i) {
        this.d = i;
        this.c = cquVar;
        this.b = atomicInteger;
        this.a = cqpVar;
    }

    public /* synthetic */ cvr(cvx cvxVar, AtomicBoolean atomicBoolean, Locale locale, int i) {
        this.d = i;
        this.a = cvxVar;
        this.b = atomicBoolean;
        this.c = locale;
    }

    public /* synthetic */ cvr(feo feoVar, Integer num, String str, int i) {
        this.d = i;
        this.a = feoVar;
        this.c = num;
        this.b = str;
    }

    public /* synthetic */ cvr(hyy hyyVar, jhs jhsVar, hyz hyzVar, int i) {
        this.d = i;
        this.a = hyyVar;
        this.b = jhsVar;
        this.c = hyzVar;
    }

    public /* synthetic */ cvr(List list, jig jigVar, jiq jiqVar, int i) {
        this.d = i;
        this.b = list;
        this.a = jigVar;
        this.c = jiqVar;
    }

    public /* synthetic */ cvr(jkk jkkVar, List list, miy miyVar, int i) {
        this.d = i;
        this.a = jkkVar;
        this.b = list;
        this.c = miyVar;
    }

    public /* synthetic */ cvr(jkk jkkVar, AtomicReference atomicReference, jiq jiqVar, int i) {
        this.d = i;
        this.c = jkkVar;
        this.b = atomicReference;
        this.a = jiqVar;
    }

    public /* synthetic */ cvr(jkk jkkVar, jie jieVar, jig jigVar, int i) {
        this.d = i;
        this.b = jkkVar;
        this.a = jieVar;
        this.c = jigVar;
    }

    public /* synthetic */ cvr(jkk jkkVar, jig jigVar, jiq jiqVar, int i) {
        this.d = i;
        this.b = jkkVar;
        this.a = jigVar;
        this.c = jiqVar;
    }

    public /* synthetic */ cvr(jkk jkkVar, jig jigVar, jlq jlqVar, int i) {
        this.d = i;
        this.c = jkkVar;
        this.a = jigVar;
        this.b = jlqVar;
    }

    public /* synthetic */ cvr(jkk jkkVar, jiq jiqVar, jig jigVar, int i) {
        this.d = i;
        this.b = jkkVar;
        this.c = jiqVar;
        this.a = jigVar;
    }

    public /* synthetic */ cvr(jkk jkkVar, jiq jiqVar, jiq jiqVar2, int i) {
        this.d = i;
        this.b = jkkVar;
        this.a = jiqVar;
        this.c = jiqVar2;
    }

    public /* synthetic */ cvr(jkk jkkVar, jiq jiqVar, miy miyVar, int i) {
        this.d = i;
        this.c = jkkVar;
        this.a = jiqVar;
        this.b = miyVar;
    }

    public /* synthetic */ cvr(kcq kcqVar, nfh nfhVar, jie jieVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = i;
        this.c = kcqVar;
        this.b = nfhVar;
        this.a = jieVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v69, types: [java.lang.Object, miy] */
    /* JADX WARN: Type inference failed for: r3v74, types: [java.lang.Object, miy] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        jav javVar = null;
        ndy ndyVar = null;
        switch (this.d) {
            case 0:
                Object obj2 = this.a;
                Object obj3 = this.b;
                Object obj4 = this.c;
                ((ltd) ((ltd) ((ltd) cvx.a.d()).i((Throwable) obj)).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiFetcher", "lambda$getStickerPacks$0", (char) 196, "BitmojiFetcher.java")).t("Bitmoji pack cache failed");
                ((AtomicBoolean) obj3).set(false);
                return ((cvx) obj2).j(2, (Locale) obj4);
            case 1:
                return ((AtomicInteger) this.b).getAndDecrement() <= 0 ? hiz.m((Throwable) obj) : ((cqu) this.c).c.a(this.a, false);
            case 2:
                Object obj5 = this.a;
                Object obj6 = this.c;
                Object obj7 = this.b;
                jqm jqmVar = (jqm) obj;
                if (jqmVar == null) {
                    ((ltd) ((ltd) feo.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "lambda$getLanguageTagAssociatedWithPackName$5", 625, "SpeechPackManager.java")).G("Could not find SuperpackManifest for superpack %s and version %d", ((feo) obj5).e, obj6);
                    return kcu.K(null);
                }
                Iterator it = jqmVar.i().iterator();
                while (true) {
                    if (it.hasNext()) {
                        juc jucVar = (juc) it.next();
                        if (((String) obj7).equals(jucVar.i())) {
                            javVar = feq.a(jucVar);
                        }
                    }
                }
                return kcu.K(javVar);
            case 3:
                Object obj8 = this.a;
                Object obj9 = this.b;
                jho jhoVar = (jho) obj;
                return (jhoVar == null || jhoVar.e != ((jhs) obj9).d) ? ((hyy) obj8).c((jhs) obj9, (hyz) this.c) : kcu.K(jhoVar);
            case 4:
                Boolean bool = (Boolean) obj;
                return ((hyy) this.a).c((jhs) this.b, (hyz) this.c);
            case 5:
                Object obj10 = this.c;
                Object obj11 = this.b;
                Object obj12 = this.a;
                Uri uri = (Uri) obj;
                if (uri == null) {
                    nzv a = jhv.a();
                    a.a = jhu.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                    a.b = "getDataFileUri() resolved to null";
                    return kcu.J(a.e());
                }
                try {
                    if (((kcq) obj10).w(uri)) {
                        String path = uri.getPath();
                        if (path != null) {
                            List h = jjb.h((kcq) obj10, uri, path);
                            if (((nfh) obj11).c) {
                                ((nfh) obj11).cD();
                                ((nfh) obj11).c = false;
                            }
                            jho jhoVar2 = (jho) ((nfh) obj11).b;
                            jho jhoVar3 = jho.m;
                            jhoVar2.b();
                            ndt.cs(h, jhoVar2.g);
                        }
                    } else {
                        String str = ((jie) obj12).b;
                        int i = ((jie) obj12).d;
                        int i2 = ((jie) obj12).i;
                        String uri2 = uri.toString();
                        if ((((jie) obj12).a & 8192) != 0 && (ndyVar = ((jie) obj12).p) == null) {
                            ndyVar = ndy.c;
                        }
                        ((nfh) obj11).cY(jjb.d(str, i, i2, uri2, ndyVar));
                    }
                } catch (IOException e) {
                    jmk.h(e, "Failed to list files under directory:".concat(uri.toString()));
                }
                return kcu.K(obj11);
            case 6:
                Object obj13 = this.c;
                Object obj14 = this.a;
                jir jirVar = (jir) obj;
                if (jirVar == null) {
                    jirVar = jir.b;
                }
                if (jirVar.a) {
                    return kcu.K(null);
                }
                jiq jiqVar = (jiq) obj13;
                String str2 = jiqVar.b;
                String str3 = jiqVar.c;
                int i3 = jmk.a;
                jkk.v((jig) obj14);
                throw new jjt();
            case 7:
                Object obj15 = this.b;
                Object obj16 = this.c;
                Object obj17 = this.a;
                Boolean bool2 = (Boolean) obj;
                nfm nfmVar = (nfm) obj16;
                nfh nfhVar = (nfh) nfmVar.N(5);
                nfhVar.cG(nfmVar);
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                jiq jiqVar2 = (jiq) nfhVar.b;
                jiq jiqVar3 = jiq.f;
                jiqVar2.a = 8 | jiqVar2.a;
                jiqVar2.e = false;
                jkk jkkVar = (jkk) obj15;
                return jkkVar.m(jkkVar.b.g((jiq) nfhVar.cz()), new cvr(jkkVar, (jig) obj17, (jiq) obj16, 19));
            case 8:
                Object obj18 = this.b;
                Object obj19 = this.c;
                Object obj20 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    String str4 = ((jiq) obj19).b;
                    int i4 = jmk.a;
                    return kcu.K(false);
                }
                jig jigVar = (jig) obj20;
                jig jigVar2 = obj20;
                if (lre.aD(jigVar)) {
                    lxv b = lxy.c().b();
                    b.e(jigVar.r);
                    b.e("|");
                    b.e(((jiq) obj19).d);
                    b.e("|");
                    lxl lxlVar = (lxl) b;
                    lxlVar.a.putLong(jigVar.q);
                    lxlVar.b(8);
                    String format = String.format("%s_%s", jigVar.c, b.k().toString());
                    nfm nfmVar2 = (nfm) obj20;
                    nfh nfhVar2 = (nfh) nfmVar2.N(5);
                    nfhVar2.cG(nfmVar2);
                    if (nfhVar2.c) {
                        nfhVar2.cD();
                        nfhVar2.c = false;
                    }
                    jig jigVar3 = (jig) nfhVar2.b;
                    format.getClass();
                    jigVar3.a |= 131072;
                    jigVar3.u = format;
                    jigVar2 = (jig) nfhVar2.cz();
                }
                nfm nfmVar3 = (nfm) obj19;
                nfh nfhVar3 = (nfh) nfmVar3.N(5);
                nfhVar3.cG(nfmVar3);
                if (nfhVar3.c) {
                    nfhVar3.cD();
                    nfhVar3.c = false;
                }
                jiq jiqVar4 = (jiq) nfhVar3.b;
                jiq jiqVar5 = jiq.f;
                jiqVar4.a = 8 | jiqVar4.a;
                jiqVar4.e = false;
                jkk jkkVar2 = (jkk) obj18;
                return jkkVar2.m(jkkVar2.m(jkkVar2.b.g((jiq) nfhVar3.cz()), new hzb(jkkVar2, (jig) jigVar2, 18)), new hzb(jkkVar2, (jiq) obj19, 13));
            case 9:
                ?? r0 = this.b;
                Object obj21 = this.a;
                Object obj22 = this.c;
                if (((jkj) obj) != jkj.DOWNLOADED) {
                    jiq jiqVar6 = (jiq) obj22;
                    jmk.d("%s downloadFileGroup %s %s can't finish!", "FileGroupManager", jiqVar6.b, jiqVar6.c);
                    jhq.b(r0, jiqVar6.b);
                    jmk.b("%s: An unknown error has occurred during download", "FileGroupManager");
                    nzv a2 = jhv.a();
                    a2.a = jhu.UNKNOWN_ERROR;
                    throw a2.e();
                }
                nfh t = mgy.h.t();
                jiq jiqVar7 = (jiq) obj22;
                String str5 = jiqVar7.b;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mgy mgyVar = (mgy) t.b;
                str5.getClass();
                int i5 = mgyVar.a | 1;
                mgyVar.a = i5;
                mgyVar.b = str5;
                String str6 = jiqVar7.c;
                str6.getClass();
                int i6 = 4 | i5;
                mgyVar.a = i6;
                mgyVar.d = str6;
                jig jigVar4 = (jig) obj21;
                int i7 = jigVar4.e;
                int i8 = i6 | 2;
                mgyVar.a = i8;
                mgyVar.c = i7;
                long j = jigVar4.q;
                int i9 = i8 | 64;
                mgyVar.a = i9;
                mgyVar.f = j;
                String str7 = jigVar4.r;
                str7.getClass();
                mgyVar.a = i9 | 128;
                mgyVar.g = str7;
                mgy mgyVar2 = (mgy) t.cz();
                return kcu.K(obj21);
            case 10:
                Object obj23 = this.b;
                Uri uri3 = (Uri) obj;
                jkk jkkVar3 = (jkk) obj23;
                Uri ax = lre.ax(jkkVar3.a, jkkVar3.f, (jie) this.a, (jig) this.c);
                try {
                    Uri parse = Uri.parse(ax.toString().substring(0, ax.toString().lastIndexOf("/")));
                    if (!((jkk) obj23).j.v(parse)) {
                        ((jkk) obj23).j.r(parse);
                    }
                    Context context = ((jkk) obj23).a;
                    jdg.u(uri3);
                    jmt.b(context, ax, uri3);
                    return mkk.a;
                } catch (IOException e2) {
                    nzv a3 = jhv.a();
                    a3.a = jhu.UNABLE_TO_CREATE_SYMLINK_STRUCTURE;
                    a3.b = "Unable to create symlink";
                    a3.c = e2;
                    return kcu.J(a3.e());
                }
            case 11:
                Object obj24 = this.b;
                Object obj25 = this.a;
                Object obj26 = this.c;
                jig jigVar5 = (jig) obj;
                mko mkoVar = mkk.a;
                if (jigVar5 != null) {
                    int o = jez.o(jigVar5.p);
                    if (o != 0 && o != 1) {
                        jkk jkkVar4 = (jkk) obj24;
                        if (jkkVar4.g.e()) {
                            mkoVar = ((jne) ((lgb) jkkVar4.g.a()).a()).a();
                        }
                    }
                    jiq jiqVar8 = (jiq) obj25;
                    jkk jkkVar5 = (jkk) obj24;
                    mkoVar = jkkVar5.m(mkoVar, new fem(jkkVar5, jiqVar8, (jiq) obj26, jigVar5, 14));
                }
                jkk jkkVar6 = (jkk) obj24;
                return jkkVar6.m(mkoVar, new jkg(jkkVar6, (jiq) obj26, jigVar5, 4));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj27 = this.c;
                Object obj28 = this.a;
                Object obj29 = this.b;
                jlj jljVar = (jlj) obj;
                jmk.b("%s: Missing file. Logging and deleting file group.", "FileGroupManager");
                jkk.v((jig) obj28);
                jkk jkkVar7 = (jkk) obj27;
                jkkVar7.h.f();
                return jkkVar7.m(jkkVar7.b.i(((jlq) obj29).a), cex.p);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj30 = this.c;
                Object obj31 = this.b;
                Object obj32 = this.a;
                Exception exc = (Exception) obj;
                jig jigVar6 = (jig) ((AtomicReference) obj31).get();
                if (jigVar6 == null) {
                    jigVar6 = jig.v;
                }
                mko mkoVar2 = mkk.a;
                if (exc instanceof jhv) {
                    int i10 = jmk.a;
                    jiq jiqVar9 = (jiq) obj32;
                    jkk jkkVar8 = (jkk) obj30;
                    mkoVar2 = jkkVar8.m(mkoVar2, new fem(jkkVar8, jiqVar9, (jhv) exc, jigVar6, 9));
                } else if (exc instanceof jhq) {
                    int i11 = jmk.a;
                    llp llpVar = ((jhq) exc).a;
                    int i12 = ((lrl) llpVar).c;
                    for (int i13 = 0; i13 < i12; i13++) {
                        Throwable th = (Throwable) llpVar.get(i13);
                        if (!(th instanceof jhv)) {
                            jmk.b("%s: Expecting DownloadException's in AggregateException", "FileGroupManager");
                        } else {
                            jkk jkkVar9 = (jkk) obj30;
                            mkoVar2 = jkkVar9.m(mkoVar2, new fem(jkkVar9, (jiq) obj32, (jhv) th, jigVar6, 10));
                        }
                    }
                }
                return ((jkk) obj30).m(mkoVar2, new ivo(exc, 17));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj33 = this.a;
                Object obj34 = this.c;
                if (!((Boolean) obj).booleanValue()) {
                    jie jieVar = (jie) obj33;
                    jig jigVar7 = (jig) obj34;
                    jmk.d("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", jieVar.b, jigVar7.c);
                    jkk.w(jigVar7, jieVar, 14);
                }
                return mkk.a;
            case 15:
                jig jigVar8 = (jig) obj;
                return jigVar8 == null ? kcu.K(null) : ((jkk) this.c).o((jiq) this.a, jigVar8, this.b);
            case 16:
                lfb lfbVar = (lfb) obj;
                return ((jkk) this.b).b.l((jiq) this.c, (jig) this.a);
            case 17:
                jig jigVar9 = (jig) obj;
                return ((jkk) this.b).b.l((jiq) this.c, (jig) this.a);
            case 18:
                Object obj35 = this.a;
                ?? r2 = this.b;
                ?? r3 = this.c;
                for (jiq jiqVar10 : (List) obj) {
                    jkk jkkVar10 = (jkk) obj35;
                    r2.add(jkkVar10.m(jkkVar10.b.g(jiqVar10), new hzb((miy) r3, jiqVar10, 10)));
                }
                return jez.p(r2).a(hcb.g, ((jkk) obj35).e);
            case 19:
                Object obj36 = this.b;
                Object obj37 = this.a;
                Object obj38 = this.c;
                jig jigVar10 = (jig) obj;
                if (jigVar10 != null) {
                    return kcu.K(Boolean.valueOf(jkk.q((jig) obj37, jigVar10)));
                }
                nfm nfmVar4 = (nfm) obj38;
                nfh nfhVar4 = (nfh) nfmVar4.N(5);
                nfhVar4.cG(nfmVar4);
                if (nfhVar4.c) {
                    nfhVar4.cD();
                    nfhVar4.c = false;
                }
                jiq jiqVar11 = (jiq) nfhVar4.b;
                jiq jiqVar12 = jiq.f;
                jiqVar11.a |= 8;
                jiqVar11.e = true;
                jkk jkkVar11 = (jkk) obj36;
                return jkkVar11.m(jkkVar11.b.g((jiq) nfhVar4.cz()), new jke((jig) obj37, 1));
            default:
                Object obj39 = this.b;
                Object obj40 = this.c;
                Object obj41 = this.a;
                if (!((Boolean) obj).booleanValue()) {
                    throw new IOException("Subscribing to group failed");
                }
                nfm nfmVar5 = (nfm) obj40;
                nfh nfhVar5 = (nfh) nfmVar5.N(5);
                nfhVar5.cG(nfmVar5);
                if (nfhVar5.c) {
                    nfhVar5.cD();
                    nfhVar5.c = false;
                }
                jiq jiqVar13 = (jiq) nfhVar5.b;
                jiq jiqVar14 = jiq.f;
                jiqVar13.a = 8 | jiqVar13.a;
                jiqVar13.e = false;
                jiq jiqVar15 = (jiq) nfhVar5.cz();
                jkk jkkVar12 = (jkk) obj39;
                mko g = jkkVar12.b.g(jiqVar15);
                jig jigVar11 = (jig) obj41;
                return jkkVar12.m(jnd.c(g).g(new cvr(jkkVar12, jiqVar15, jigVar11, 17), jkkVar12.e).g(new cex(18), jkkVar12.e).g(new jke(jigVar11, 0), jkkVar12.e).g(new jke(g, 2), jkkVar12.e), new jkg(jkkVar12, jigVar11, (jiq) obj40, 1));
        }
    }
}
