package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: jkg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jkg implements miy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jkg(jip jipVar, jlk jlkVar, jit jitVar, int i) {
        this.d = i;
        this.c = jipVar;
        this.a = jlkVar;
        this.b = jitVar;
    }

    public /* synthetic */ jkg(jkk jkkVar, jie jieVar, jig jigVar, int i) {
        this.d = i;
        this.a = jkkVar;
        this.c = jieVar;
        this.b = jigVar;
    }

    public /* synthetic */ jkg(jkk jkkVar, jig jigVar, jiq jiqVar, int i) {
        this.d = i;
        this.a = jkkVar;
        this.c = jigVar;
        this.b = jiqVar;
    }

    public /* synthetic */ jkg(jkk jkkVar, jiq jiqVar, jig jigVar, int i) {
        this.d = i;
        this.a = jkkVar;
        this.b = jiqVar;
        this.c = jigVar;
    }

    public /* synthetic */ jkg(jkm jkmVar, jiq jiqVar, jig jigVar, int i) {
        this.d = i;
        this.a = jkmVar;
        this.b = jiqVar;
        this.c = jigVar;
    }

    public /* synthetic */ jkg(jkm jkmVar, jmp jmpVar, Comparator comparator, int i) {
        this.d = i;
        this.c = jkmVar;
        this.b = jmpVar;
        this.a = comparator;
    }

    public /* synthetic */ jkg(jkp jkpVar, jit jitVar, jiu jiuVar, int i) {
        this.d = i;
        this.a = jkpVar;
        this.c = jitVar;
        this.b = jiuVar;
    }

    public /* synthetic */ jkg(jkp jkpVar, jmp jmpVar, Comparator comparator, int i) {
        this.d = i;
        this.c = jkpVar;
        this.b = jmpVar;
        this.a = comparator;
    }

    public /* synthetic */ jkg(jkv jkvVar, jie jieVar, jig jigVar, int i) {
        this.d = i;
        this.a = jkvVar;
        this.c = jieVar;
        this.b = jigVar;
    }

    public /* synthetic */ jkg(jli jliVar, PrintWriter printWriter, jit jitVar, int i) {
        this.d = i;
        this.b = jliVar;
        this.a = printWriter;
        this.c = jitVar;
    }

    public /* synthetic */ jkg(jli jliVar, jit jitVar, PrintWriter printWriter, int i) {
        this.d = i;
        this.b = jliVar;
        this.c = jitVar;
        this.a = printWriter;
    }

    public /* synthetic */ jkg(jli jliVar, jit jitVar, jie jieVar, int i) {
        this.d = i;
        this.a = jliVar;
        this.b = jitVar;
        this.c = jieVar;
    }

    public /* synthetic */ jkg(jli jliVar, jiu jiuVar, jie jieVar, int i) {
        this.d = i;
        this.a = jliVar;
        this.b = jiuVar;
        this.c = jieVar;
    }

    public /* synthetic */ jkg(jli jliVar, jiu jiuVar, jit jitVar, int i) {
        this.d = i;
        this.a = jliVar;
        this.b = jiuVar;
        this.c = jitVar;
    }

    public /* synthetic */ jkg(jli jliVar, nfh nfhVar, jit jitVar, int i) {
        this.d = i;
        this.b = jliVar;
        this.a = nfhVar;
        this.c = jitVar;
    }

    public /* synthetic */ jkg(jqx jqxVar, jtr jtrVar, jsq jsqVar, int i) {
        this.d = i;
        this.c = jqxVar;
        this.a = jtrVar;
        this.b = jsqVar;
    }

    public /* synthetic */ jkg(jqx jqxVar, jtr jtrVar, mko mkoVar, int i) {
        this.d = i;
        this.c = jqxVar;
        this.b = jtrVar;
        this.a = mkoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v70, types: [jlk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r3v50, types: [mko, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        switch (this.d) {
            case 0:
                Object obj2 = this.a;
                Object obj3 = this.b;
                Object obj4 = this.c;
                if (((Boolean) obj).booleanValue()) {
                    jkk jkkVar = (jkk) obj2;
                    return jkkVar.m(jkkVar.b.a((jig) obj4), new ivo((jiq) obj3, 15));
                }
                jiq jiqVar = (jiq) obj3;
                jmk.d("%s: Failed to remove the downloaded version for group: '%s'; account: '%s'", "FileGroupManager", jiqVar.b, jiqVar.d);
                return kcu.J(new IOException("Failed to remove downloaded group: ".concat(String.valueOf(jiqVar.b))));
            case 1:
                Object obj5 = this.a;
                Object obj6 = this.c;
                Object obj7 = this.b;
                Void r4 = (Void) obj;
                jkk jkkVar2 = (jkk) obj5;
                if (jkkVar2.g.e()) {
                    jig jigVar = (jig) obj6;
                    int o = jez.o(jigVar.p);
                    if (o != 0 && o != 1) {
                        int i = jigVar.p;
                        String str = ((jiq) obj7).b;
                        return ((jne) ((lgb) jkkVar2.g.a()).a()).b();
                    }
                }
                return kcu.K(true);
            case 2:
                Object obj8 = this.a;
                Object obj9 = this.b;
                Object obj10 = this.c;
                Void r5 = (Void) obj;
                jkk jkkVar3 = (jkk) obj8;
                jiq jiqVar2 = (jiq) obj9;
                jnd e = jnd.c(jkkVar3.b.g(jiqVar2)).e(jkc.a, jkkVar3.e);
                return e.g(new cvr(jkkVar3, jiqVar2, (jig) obj10, 16), jkkVar3.e).g(new hzb(jiqVar2, e, 14), jkkVar3.e);
            case 3:
                Object obj11 = this.a;
                Object obj12 = this.c;
                Object obj13 = this.b;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    ((jkk) obj11).a(uri, (jie) obj12, (jig) obj13);
                }
                return mkk.a;
            case 4:
                Object obj14 = this.a;
                Object obj15 = this.b;
                Object obj16 = this.c;
                Void r42 = (Void) obj;
                nfm nfmVar = (nfm) obj15;
                nfh nfhVar = (nfh) nfmVar.N(5);
                nfhVar.cG(nfmVar);
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                jiq jiqVar3 = (jiq) nfhVar.b;
                jiq jiqVar4 = jiq.f;
                jiqVar3.a |= 8;
                jiqVar3.e = true;
                jiq jiqVar5 = (jiq) nfhVar.cz();
                jkk jkkVar4 = (jkk) obj14;
                return jkkVar4.m(jkkVar4.b.g(jiqVar5), new fem(jkkVar4, jiqVar5, (jiq) obj15, (jig) obj16, 11));
            case 5:
                jkm jkmVar = (jkm) this.a;
                return jco.j(jkmVar.n(jkmVar.a.l((jiq) this.b, (jig) this.c)), new jki(jkmVar, (jmp) obj, 16), jkmVar.b);
            case 6:
                return ((jkm) this.c).p((jmp) this.b, (jmp) obj, this.a);
            case 7:
                return ((jkm) this.c).p((jmp) this.b, (jmp) obj, this.a);
            case 8:
                Object obj17 = this.c;
                Object obj18 = this.b;
                ?? r3 = this.a;
                jmp jmpVar = (jmp) obj;
                ((jkp) obj17).d.y();
                if (jmk.i()) {
                    jmp.g((jmp) obj18, jmpVar, r3);
                }
                jmp jmpVar2 = (jmp) obj18;
                if (jmpVar2.a) {
                    List list = (List) jmpVar2.c();
                    jdg.u(list);
                    return kcu.K(list);
                }
                Object d = jmpVar2.d();
                jdg.u(d);
                return kcu.J((Throwable) d);
            case 9:
                jkp jkpVar = (jkp) this.a;
                return jco.i(jkpVar.b.g((jit) this.c, (jiu) this.b), new iul((Boolean) obj, 20), jkpVar.c);
            case 10:
                jkp jkpVar2 = (jkp) this.a;
                return jco.j(jkpVar2.b(jkpVar2.b.g((jit) this.c, (jiu) this.b)), new jko(jkpVar2, (jmp) obj, 2), jkpVar2.c);
            case 11:
                Object obj19 = this.a;
                Object obj20 = this.c;
                Void r52 = (Void) obj;
                jkv jkvVar = (jkv) obj19;
                jig jigVar2 = (jig) this.b;
                jie jieVar = (jie) obj20;
                return jco.i(jkvVar.c.g(jieVar, jigVar2), new crj(jkvVar, jigVar2, jieVar, 14), jkvVar.h);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj21 = this.a;
                Object obj22 = this.b;
                Object obj23 = this.c;
                jmk.c("%s: reVerifyFile lost or corrupted code %s", "SharedFileManager", ((jhv) obj).a);
                nfm nfmVar2 = (nfm) obj22;
                nfh nfhVar2 = (nfh) nfmVar2.N(5);
                nfhVar2.cG(nfmVar2);
                jip jipVar = jip.CORRUPTED;
                if (nfhVar2.c) {
                    nfhVar2.cD();
                    nfhVar2.c = false;
                }
                jiu jiuVar = (jiu) nfhVar2.b;
                jiu jiuVar2 = jiu.h;
                jiuVar.c = jipVar.h;
                jiuVar.a |= 2;
                jli jliVar = (jli) obj21;
                return jnd.c(jliVar.b.g((jit) obj23, (jiu) nfhVar2.cz())).g(jlf.c, jliVar.i);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Void r43 = (Void) obj;
                jli jliVar2 = (jli) this.b;
                jit jitVar = (jit) this.c;
                return jco.j(jliVar2.b.e(jitVar), new jkg(jliVar2, (PrintWriter) this.a, jitVar, 16), jliVar2.i);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj24 = this.a;
                Object obj25 = this.b;
                Object obj26 = this.c;
                jiu jiuVar3 = (jiu) obj;
                jip b = jip.b(jiuVar3.c);
                if (b == null) {
                    b = jip.NONE;
                }
                if (b != jip.DOWNLOAD_COMPLETE) {
                    return mkk.a;
                }
                jit jitVar2 = (jit) obj25;
                jli jliVar3 = (jli) obj24;
                return jnd.c(jliVar3.c(jitVar2)).g(new jkg(jliVar3, jiuVar3, (jie) obj26, 17), jliVar3.i).b(jhv.class, new jkg(jliVar3, jiuVar3, jitVar2, 12), jliVar3.i);
            case 15:
                Object obj27 = this.b;
                Object obj28 = this.a;
                Object obj29 = this.c;
                Uri uri2 = (Uri) obj;
                jip jipVar2 = jip.DOWNLOAD_IN_PROGRESS;
                nfh nfhVar3 = (nfh) obj28;
                if (nfhVar3.c) {
                    nfhVar3.cD();
                    nfhVar3.c = false;
                }
                jiu jiuVar4 = (jiu) nfhVar3.b;
                jiu jiuVar5 = jiu.h;
                jiuVar4.c = jipVar2.h;
                jiuVar4.a |= 2;
                return ((jli) obj27).b.g((jit) obj29, (jiu) nfhVar3.cz());
            case 16:
                Object obj30 = this.b;
                Object obj31 = this.a;
                Object obj32 = this.c;
                jiu jiuVar6 = (jiu) obj;
                if (jiuVar6 == null) {
                    jmk.b("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
                    return mkk.a;
                }
                PrintWriter printWriter = (PrintWriter) obj31;
                printWriter.format("FileKey: %s\nFileName: %s\nSharedFile: %s\n", obj32, jiuVar6.b, jiuVar6.toString());
                if (jiuVar6.d) {
                    printWriter.format("Checksum Android-shared file: %s\n", jiuVar6.f);
                } else {
                    jli jliVar4 = (jli) obj30;
                    Context context = jliVar4.a;
                    jit jitVar3 = (jit) obj32;
                    int h = ker.h(jitVar3.e);
                    Uri y = lxj.y(context, h == 0 ? 1 : h, jiuVar6.b, jitVar3.d, jliVar4.h, false);
                    if (y != null) {
                        printWriter.format("Checksum downloaded file: %s\n", jmf.c(jliVar4.k, y));
                    }
                }
                return mkk.a;
            case 17:
                Object obj33 = this.a;
                Object obj34 = this.b;
                Object obj35 = this.c;
                Uri uri3 = (Uri) obj;
                if (uri3 == null) {
                    nzv a = jhv.a();
                    a.a = jhu.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                    throw a.e();
                }
                if (((jiu) obj34).d) {
                    if (!((jli) obj33).k.v(uri3)) {
                        nzv a2 = jhv.a();
                        a2.a = jhu.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                        throw a2.e();
                    }
                } else {
                    jie jieVar2 = (jie) obj35;
                    jmf.d(((jli) obj33).k, jieVar2, uri3, jieVar2.f);
                }
                return mkk.a;
            case 18:
                Object obj36 = this.c;
                ?? r2 = this.a;
                Object obj37 = this.b;
                jiu jiuVar7 = (jiu) obj;
                nfh nfhVar4 = (nfh) jiuVar7.N(5);
                nfhVar4.cG(jiuVar7);
                if (nfhVar4.c) {
                    nfhVar4.cD();
                    nfhVar4.c = false;
                }
                jiu jiuVar8 = (jiu) nfhVar4.b;
                jiu jiuVar9 = jiu.h;
                jip jipVar3 = (jip) obj36;
                jiuVar8.c = jipVar3.h;
                jiuVar8.a = 2 | jiuVar8.a;
                if (jipVar3.equals(jip.CORRUPTED)) {
                    int i2 = jiuVar7.g + 1;
                    if (nfhVar4.c) {
                        nfhVar4.cD();
                        nfhVar4.c = false;
                    }
                    jiu jiuVar10 = (jiu) nfhVar4.b;
                    jiuVar10.a |= 32;
                    jiuVar10.g = i2;
                }
                return r2.g((jit) obj37, (jiu) nfhVar4.cz());
            case 19:
                jqm jqmVar = (jqm) obj;
                return ((jqx) this.c).f(((jrn) this.a).a, (jsq) this.b);
            default:
                Object obj38 = this.c;
                Object obj39 = this.b;
                ?? r32 = this.a;
                Throwable w = lwm.w((Throwable) obj);
                String str2 = ((jrn) obj39).a;
                if (!(w instanceof CancellationException)) {
                    ((jqx) obj38).m.a(new jqp(2));
                    String message = w.getMessage();
                    jrz a3 = jsf.a(str2);
                    a3.f(2);
                    Object[] objArr = new Object[1];
                    if (message == null) {
                        message = "";
                    }
                    objArr[0] = message;
                    a3.c("api", "register_failed", objArr);
                }
                return r32;
        }
    }
}
