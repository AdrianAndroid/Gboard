package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: jko  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jko implements miy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jko(jkm jkmVar, jmp jmpVar, int i) {
        this.c = i;
        this.a = jkmVar;
        this.b = jmpVar;
    }

    public /* synthetic */ jko(jkp jkpVar, Boolean bool, int i) {
        this.c = i;
        this.a = jkpVar;
        this.b = bool;
    }

    public /* synthetic */ jko(jkp jkpVar, Comparator comparator, int i) {
        this.c = i;
        this.a = jkpVar;
        this.b = comparator;
    }

    public /* synthetic */ jko(jkp jkpVar, jit jitVar, int i) {
        this.c = i;
        this.b = jkpVar;
        this.a = jitVar;
    }

    public /* synthetic */ jko(jkp jkpVar, jmp jmpVar, int i) {
        this.c = i;
        this.a = jkpVar;
        this.b = jmpVar;
    }

    public /* synthetic */ jko(jkv jkvVar, PrintWriter printWriter, int i) {
        this.c = i;
        this.a = jkvVar;
        this.b = printWriter;
    }

    public /* synthetic */ jko(jkv jkvVar, jiq jiqVar, int i) {
        this.c = i;
        this.b = jkvVar;
        this.a = jiqVar;
    }

    public /* synthetic */ jko(jkv jkvVar, miy miyVar, int i) {
        this.c = i;
        this.a = jkvVar;
        this.b = miyVar;
    }

    public /* synthetic */ jko(jla jlaVar, jkr jkrVar, int i) {
        this.c = i;
        this.b = jlaVar;
        this.a = jkrVar;
    }

    public /* synthetic */ jko(jli jliVar, PrintWriter printWriter, int i) {
        this.c = i;
        this.a = jliVar;
        this.b = printWriter;
    }

    public /* synthetic */ jko(jli jliVar, jit jitVar, int i) {
        this.c = i;
        this.b = jliVar;
        this.a = jitVar;
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, miy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Comparator] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        switch (this.c) {
            case 0:
                return ((jkp) this.a).h((jmp) this.b, (jmp) obj);
            case 1:
                return ((jkm) this.a).o((jmp) this.b, (jmp) obj);
            case 2:
                return ((jkp) this.a).h((jmp) this.b, (jmp) obj);
            case 3:
                jkp jkpVar = (jkp) this.b;
                return jco.j(jkpVar.b(jkpVar.b.e((jit) this.a)), new jko(jkpVar, (jmp) obj, 0), jkpVar.c);
            case 4:
                Object obj2 = this.a;
                Object obj3 = this.b;
                List<jit> list = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (jit jitVar : list) {
                    arrayList.add(((jkp) obj2).a.e(jitVar));
                }
                jkp jkpVar2 = (jkp) obj2;
                return jez.p(arrayList).b(new iiq(jkpVar2, list, arrayList, (Boolean) obj3, 3), jkpVar2.c);
            case 5:
                return ((jkp) this.a).h((jmp) this.b, (jmp) obj);
            case 6:
                return ((jkp) this.a).h((jmp) this.b, (jmp) obj);
            case 7:
                jkp jkpVar3 = (jkp) this.b;
                return jco.j(jkpVar3.b(jkpVar3.b.f((jit) this.a)), new jko(jkpVar3, (jmp) obj, 5), jkpVar3.c);
            case 8:
                jkp jkpVar4 = (jkp) this.a;
                return jco.j(jkpVar4.b(jkpVar4.b.c()), new jkg(jkpVar4, (jmp) obj, (Comparator) this.b, 8), jkpVar4.c);
            case 9:
                Object obj4 = this.a;
                ?? r1 = this.b;
                Void r13 = (Void) obj;
                jkv jkvVar = (jkv) obj4;
                jkvVar.j.w();
                jkk jkkVar = jkvVar.c;
                return jkkVar.m(jkkVar.b.d(), ldd.c(new jki(jkkVar, (miy) r1, 0)));
            case 10:
                Void r132 = (Void) obj;
                return ((jkv) this.b).c.e((jiq) this.a, true);
            case 11:
                Object obj5 = this.a;
                Object obj6 = this.b;
                Void r133 = (Void) obj;
                jli jliVar = ((jkv) obj5).e;
                PrintWriter printWriter = (PrintWriter) obj6;
                printWriter.println("==== MDD_SHARED_FILES ====");
                return jco.j(jliVar.b.c(), new jko(jliVar, printWriter, 19), jliVar.i);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj7 = this.b;
                Object obj8 = this.a;
                Void r134 = (Void) obj;
                jkk jkkVar2 = ((jkv) obj7).c;
                nfm nfmVar = (nfm) obj8;
                nfh nfhVar = (nfh) nfmVar.N(5);
                nfhVar.cG(nfmVar);
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                jiq jiqVar = (jiq) nfhVar.b;
                jiq jiqVar2 = jiq.f;
                jiqVar.a = 8 | jiqVar.a;
                jiqVar.e = false;
                jiq jiqVar3 = (jiq) nfhVar.cz();
                return jkkVar2.m(jkkVar2.b.g(jiqVar3), new cvr(jkkVar2, jiqVar3, (jiq) obj8, 11));
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj9 = this.a;
                Object obj10 = this.b;
                Void r135 = (Void) obj;
                jkv jkvVar2 = (jkv) obj9;
                jkk jkkVar3 = jkvVar2.c;
                PrintWriter printWriter2 = (PrintWriter) obj10;
                printWriter2.println("==== MDD_FILE_GROUP_MANAGER ====");
                printWriter2.println("MDD_FRESH_FILE_GROUPS:");
                return jco.j(jkkVar3.m(jkkVar3.m(jkkVar3.b.c(), new ivo(printWriter2, 16)), new hzb(jkkVar3, printWriter2, 11)), new jko(jkvVar2, printWriter2, 11), jkvVar2.h);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((jla) this.b).h((jkr) this.a);
                return kcu.J((Exception) obj);
            case 15:
                ((jla) this.b).h((jkr) this.a);
                return kcu.K((Boolean) obj);
            case 16:
                Object obj11 = this.b;
                Object obj12 = this.a;
                jiu jiuVar = (jiu) obj;
                if (jiuVar == null) {
                    jmk.b("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
                    return kcu.J(new jlj());
                }
                jip b = jip.b(jiuVar.c);
                if (b == null) {
                    b = jip.NONE;
                }
                if (b != jip.DOWNLOAD_COMPLETE) {
                    jli jliVar2 = (jli) obj11;
                    Context context = jliVar2.a;
                    jit jitVar2 = (jit) obj12;
                    int h = ker.h(jitVar2.e);
                    Uri y = lxj.y(context, h == 0 ? 1 : h, jiuVar.b, jitVar2.d, jliVar2.h, false);
                    if (y != null) {
                        jliVar2.c.b(y);
                    }
                }
                return mkk.a;
            case 17:
                Object obj13 = this.b;
                Object obj14 = this.a;
                jiu jiuVar2 = (jiu) obj;
                if (jiuVar2 == null) {
                    jmk.c("%s: getOnDeviceUri called on file that doesn't exists. Key = %s!", "SharedFileManager", obj14);
                    return kcu.J(new jlj());
                }
                jli jliVar3 = (jli) obj13;
                Context context2 = jliVar3.a;
                int h2 = ker.h(((jit) obj14).e);
                return kcu.K(lxj.y(context2, h2 == 0 ? 1 : h2, jiuVar2.b, jiuVar2.f, jliVar3.h, jiuVar2.d));
            case 18:
                Object obj15 = this.b;
                Object obj16 = this.a;
                jiu jiuVar3 = (jiu) obj;
                if (jiuVar3 == null) {
                    jmk.c("%s: No file entry with key %s", "SharedFileManager", obj16);
                    return kcu.K(false);
                }
                jli jliVar4 = (jli) obj15;
                Context context3 = jliVar4.a;
                jit jitVar3 = (jit) obj16;
                int h3 = ker.h(jitVar3.e);
                Uri y2 = lxj.y(context3, h3 == 0 ? 1 : h3, jiuVar3.b, jitVar3.d, jliVar4.h, false);
                if (y2 != null) {
                    jliVar4.c.b(y2);
                }
                return jco.j(jliVar4.b.f(jitVar3), new jku(jitVar3, 11), jliVar4.i);
            case 19:
                Object obj17 = this.a;
                Object obj18 = this.b;
                mko mkoVar = mkk.a;
                for (jit jitVar4 : (List) obj) {
                    jli jliVar5 = (jli) obj17;
                    mkoVar = jco.j(mkoVar, new jkg(jliVar5, jitVar4, (PrintWriter) obj18, 13), jliVar5.i);
                }
                return mkoVar;
            default:
                Object obj19 = this.b;
                Object obj20 = this.a;
                if (((jiu) obj) != null) {
                    return kcu.K(true);
                }
                jli jliVar6 = (jli) obj19;
                SharedPreferences q = jez.q(jliVar6.a, "gms_icing_mdd_shared_file_manager_metadata", jliVar6.h);
                long j = q.getLong("next_file_name_v2", System.currentTimeMillis());
                if (!q.edit().putLong("next_file_name_v2", 1 + j).commit()) {
                    jmk.c("%s: Unable to update file name %s", "SharedFileManager", obj20);
                    return kcu.K(false);
                }
                String str = "datadownloadfile_" + j;
                nfh t = jiu.h.t();
                jip jipVar = jip.SUBSCRIBED;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                jiu jiuVar4 = (jiu) t.b;
                jiuVar4.c = jipVar.h;
                int i = jiuVar4.a | 2;
                jiuVar4.a = i;
                jiuVar4.a = i | 1;
                jiuVar4.b = str;
                jit jitVar5 = (jit) obj20;
                return jco.j(jliVar6.b.g(jitVar5, (jiu) t.cz()), new jku(jitVar5, 9), jliVar6.i);
        }
    }
}
