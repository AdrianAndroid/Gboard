package defpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ivo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ivo implements miy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ivo(hrx hrxVar, int i) {
        this.b = i;
        this.a = hrxVar;
    }

    public /* synthetic */ ivo(ivr ivrVar, int i) {
        this.b = i;
        this.a = ivrVar;
    }

    public /* synthetic */ ivo(iyu iyuVar, int i) {
        this.b = i;
        this.a = iyuVar;
    }

    public /* synthetic */ ivo(PrintWriter printWriter, int i) {
        this.b = i;
        this.a = printWriter;
    }

    public /* synthetic */ ivo(Exception exc, int i) {
        this.b = i;
        this.a = exc;
    }

    public /* synthetic */ ivo(jig jigVar, int i) {
        this.b = i;
        this.a = jigVar;
    }

    public /* synthetic */ ivo(jiq jiqVar, int i) {
        this.b = i;
        this.a = jiqVar;
    }

    public /* synthetic */ ivo(jjb jjbVar, int i) {
        this.b = i;
        this.a = jjbVar;
    }

    public /* synthetic */ ivo(jkk jkkVar, int i) {
        this.b = i;
        this.a = jkkVar;
    }

    public /* synthetic */ ivo(jmi jmiVar, int i, byte[] bArr) {
        this.b = i;
        this.a = jmiVar;
    }

    /* JADX WARN: Type inference failed for: r13v35, types: [java.lang.Object, jkl] */
    /* JADX WARN: Type inference failed for: r13v40, types: [java.lang.Object, jkl] */
    /* JADX WARN: Type inference failed for: r13v45, types: [java.lang.Object, jkl] */
    /* JADX WARN: Type inference failed for: r13v49, types: [java.lang.Object, jkl] */
    /* JADX WARN: Type inference failed for: r13v54, types: [java.lang.Object, jkl] */
    /* JADX WARN: Type inference failed for: r1v23, types: [jlk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [jjd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [jjd, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        int o;
        switch (this.b) {
            case 0:
                return ((ivr) this.a).h.b(new iul((llw) obj, 3), mjl.a);
            case 1:
                Object obj2 = this.a;
                llp i = llp.i(lre.Z((List) obj, dyv.r));
                if (i.isEmpty()) {
                    hrx hrxVar = (hrx) obj2;
                    if (hrxVar.P != null) {
                        ((ltd) ((ltd) hrx.a.d()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "lambda$startLoadingInputMethodEntrySettings$4", 786, "InputMethodEntryManager.java")).t("The entries list is empty, start to load default entry");
                        hrxVar.v(3);
                        return mio.g(hrxVar.c(jav.f((String) hrxVar.P.e)), new hdp(14), mjl.a);
                    }
                }
                return kcu.K(i);
            case 2:
                Void r13 = (Void) obj;
                return ((iyu) this.a).c.k();
            case 3:
                Object obj3 = this.a;
                mko K = kcu.K(llp.e());
                for (jlq jlqVar : (List) obj) {
                    jjb jjbVar = (jjb) obj3;
                    K = jco.j(K, new hzb(jjbVar, jlqVar, 6), jjbVar.d);
                }
                return jco.i(K, iuu.t, ((jjb) obj3).d);
            case 4:
                jjb jjbVar2 = (jjb) this.a;
                return jjb.i((jig) obj, null, 2, jjbVar2.c, jjbVar2.d, jjbVar2.h);
            case 5:
                Void r132 = (Void) obj;
                jjb jjbVar3 = (jjb) this.a;
                jkv jkvVar = jjbVar3.c;
                miy miyVar = jjbVar3.f;
                int i2 = jmk.a;
                return jco.j(jkvVar.c(), new jko(jkvVar, miyVar, 9), jkvVar.h);
            case 6:
                Void r133 = (Void) obj;
                return ((jjb) this.a).f();
            case 7:
                Object obj4 = this.a;
                ArrayList arrayList = new ArrayList();
                for (jlq jlqVar2 : (List) obj) {
                    jiq jiqVar = jlqVar2.a;
                    jig jigVar = jlqVar2.b;
                    Long valueOf = Long.valueOf(lre.aw(jigVar));
                    int i3 = jmk.a;
                    jmi jmiVar = (jmi) obj4;
                    if (lre.aC(valueOf.longValue(), jmiVar.h)) {
                        arrayList.add(jiqVar);
                        if (lre.aD(jigVar)) {
                            lre.aN(jmiVar.a, (lfb) jmiVar.i, jigVar, (kcq) jmiVar.d);
                        }
                    }
                }
                jmi jmiVar2 = (jmi) obj4;
                return jco.i(jmiVar2.f.j(arrayList), new jkc(1), jmiVar2.b);
            case 8:
                Object obj5 = this.a;
                ArrayList arrayList2 = new ArrayList();
                for (jig jigVar2 : (List) obj) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    jif jifVar = jigVar2.b;
                    if (jifVar == null) {
                        jifVar = jif.g;
                    }
                    jmi jmiVar3 = (jmi) obj5;
                    if (lre.aC(Math.min(timeUnit.toMillis(jifVar.b), lre.aw(jigVar2)), jmiVar3.h)) {
                        String str = jigVar2.c;
                        int i4 = jigVar2.e;
                        long j = jigVar2.q;
                        String str2 = jigVar2.r;
                        if (lre.aD(jigVar2)) {
                            lre.aN(jmiVar3.a, (lfb) jmiVar3.i, jigVar2, (kcq) jmiVar3.d);
                        }
                    } else {
                        arrayList2.add(jigVar2);
                    }
                }
                jmi jmiVar4 = (jmi) obj5;
                return jco.j(jmiVar4.f.k(), new hzb(jmiVar4, arrayList2, 8, (byte[]) null), jmiVar4.b);
            case 9:
                Object obj6 = this.a;
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (jlq jlqVar3 : (List) obj) {
                    arrayList3.add(jlqVar3.b);
                }
                jmi jmiVar5 = (jmi) obj6;
                return jco.i(jmiVar5.f.e(), new crj(jmiVar5, arrayList3, hashSet, 13, null), jmiVar5.b);
            case 10:
                Void r134 = (Void) obj;
                jmi jmiVar6 = (jmi) this.a;
                return jco.j(jco.j(jmiVar6.f.c(), new ivo(jmiVar6, 7, null), jmiVar6.b), new ivo(jmiVar6, 11, null), jmiVar6.b);
            case 11:
                Void r135 = (Void) obj;
                jmi jmiVar7 = (jmi) this.a;
                return jco.j(jco.j(jmiVar7.f.c(), new ivo(jmiVar7, 9, null), jmiVar7.b), new ivo(jmiVar7, 12, null), jmiVar7.b);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                jmi jmiVar8 = (jmi) this.a;
                return jco.j(jmiVar8.g.c(), new hzb(jmiVar8, (Set) obj, 7, (byte[]) null), jmiVar8.b);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj7 = this.a;
                for (jig jigVar3 : (List) obj) {
                    ((PrintWriter) obj7).format("GroupName: %s\nDataFileGroup:\n%s\n", jigVar3.c, jigVar3.toString());
                }
                return mkk.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj8 = this.a;
                jlq jlqVar4 = (jlq) obj;
                jig jigVar4 = jlqVar4.b;
                for (jie jieVar : jigVar4.m) {
                    int h = ker.h(jigVar4.h);
                    if (h == 0) {
                        h = 1;
                    }
                    jit t = kki.t(jieVar, h);
                    jkk jkkVar = (jkk) obj8;
                    jli jliVar = jkkVar.c;
                    jco.h(jnd.c(jliVar.d(t)).g(new jkg(jliVar, t, jieVar, 14), jliVar.i), jlj.class, new cvr(jkkVar, jigVar4, jlqVar4, 12), jkkVar.e);
                }
                return mkk.a;
            case 15:
                Object obj9 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    return mkk.a;
                }
                jiq jiqVar2 = (jiq) obj9;
                jmk.d("%s: Failed to add to stale for group: '%s'; account: '%s'", "FileGroupManager", jiqVar2.b, jiqVar2.d);
                return kcu.J(new IOException("Failed to add downloaded group to stale: ".concat(String.valueOf(jiqVar2.b))));
            case 16:
                Object obj10 = this.a;
                ArrayList arrayList4 = new ArrayList((List) obj);
                Collections.sort(arrayList4, xr.s);
                int size = arrayList4.size();
                for (int i5 = 0; i5 < size; i5++) {
                    jlq jlqVar5 = (jlq) arrayList4.get(i5);
                    jiq jiqVar3 = jlqVar5.a;
                    ((PrintWriter) obj10).format("GroupName: %s\nAccount: %s\nDataFileGroup:\n %s\n\n", jiqVar3.b, jiqVar3.d, jlqVar5.b.toString());
                }
                return mkk.a;
            case 17:
                Void r136 = (Void) obj;
                throw ((Throwable) this.a);
            case 18:
                jmk.g((jhv) obj, "%s: Unable to correct isolated structure, returning null instead of group %s", "FileGroupManager", ((jig) this.a).c);
                return mkk.a;
            case 19:
                jlj jljVar = (jlj) obj;
                jmk.c("%s: Encountered SharedFileMissingException for group: %s", "FileGroupManager", ((jig) this.a).c);
                return kcu.K(jip.NONE);
            default:
                Object obj11 = this.a;
                jig jigVar5 = (jig) obj;
                if (jigVar5 == null || (o = jez.o(jigVar5.p)) == 0 || o == 1) {
                    return kcu.K(true);
                }
                return ((jne) ((lgb) ((jkk) obj11).g.a()).a()).b();
        }
    }
}
