package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.voiceime.backend.ondevice.OnDeviceDownloadNowReceiver;
import com.google.android.inputmethod.latin.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fem  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fem implements miy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ fem(clg clgVar, lfb lfbVar, hiz hizVar, cll cllVar, int i) {
        this.e = i;
        this.d = clgVar;
        this.b = lfbVar;
        this.c = hizVar;
        this.a = cllVar;
    }

    public /* synthetic */ fem(fen fenVar, String str, ieh iehVar, uh uhVar, int i) {
        this.e = i;
        this.a = fenVar;
        this.b = str;
        this.c = iehVar;
        this.d = uhVar;
    }

    public /* synthetic */ fem(gmk gmkVar, gmm gmmVar, gmm gmmVar2, blo bloVar, int i) {
        this.e = i;
        this.a = gmkVar;
        this.c = gmmVar;
        this.b = gmmVar2;
        this.d = bloVar;
    }

    public /* synthetic */ fem(jhy jhyVar, String str, kcq kcqVar, Uri uri, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.e = i;
        this.a = jhyVar;
        this.b = str;
        this.c = kcqVar;
        this.d = uri;
    }

    public /* synthetic */ fem(jkk jkkVar, jie jieVar, jig jigVar, jit jitVar, int i) {
        this.e = i;
        this.b = jkkVar;
        this.d = jieVar;
        this.a = jigVar;
        this.c = jitVar;
    }

    public /* synthetic */ fem(jkk jkkVar, jig jigVar, jie jieVar, jit jitVar, int i) {
        this.e = i;
        this.b = jkkVar;
        this.a = jigVar;
        this.d = jieVar;
        this.c = jitVar;
    }

    public /* synthetic */ fem(jkk jkkVar, jij jijVar, jiq jiqVar, miy miyVar, int i) {
        this.e = i;
        this.c = jkkVar;
        this.d = jijVar;
        this.a = jiqVar;
        this.b = miyVar;
    }

    public /* synthetic */ fem(jkk jkkVar, jiq jiqVar, jhv jhvVar, jig jigVar, int i) {
        this.e = i;
        this.b = jkkVar;
        this.c = jiqVar;
        this.d = jhvVar;
        this.a = jigVar;
    }

    public /* synthetic */ fem(jkk jkkVar, jiq jiqVar, jiq jiqVar2, jig jigVar, int i) {
        this.e = i;
        this.b = jkkVar;
        this.a = jiqVar;
        this.c = jiqVar2;
        this.d = jigVar;
    }

    public /* synthetic */ fem(jkk jkkVar, jit jitVar, jig jigVar, jie jieVar, int i) {
        this.e = i;
        this.b = jkkVar;
        this.c = jitVar;
        this.a = jigVar;
        this.d = jieVar;
    }

    public /* synthetic */ fem(jkk jkkVar, lvw lvwVar, jig jigVar, jiq jiqVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.e = i;
        this.c = jkkVar;
        this.b = lvwVar;
        this.d = jigVar;
        this.a = jiqVar;
    }

    public /* synthetic */ fem(jkv jkvVar, jiq jiqVar, jig jigVar, miy miyVar, int i) {
        this.e = i;
        this.c = jkvVar;
        this.a = jiqVar;
        this.d = jigVar;
        this.b = miyVar;
    }

    public /* synthetic */ fem(jkv jkvVar, jiq jiqVar, lfb lfbVar, miy miyVar, int i) {
        this.e = i;
        this.a = jkvVar;
        this.d = jiqVar;
        this.c = lfbVar;
        this.b = miyVar;
    }

    public /* synthetic */ fem(jmd jmdVar, jit jitVar, Uri uri, Uri uri2, int i) {
        this.e = i;
        this.b = jmdVar;
        this.c = jitVar;
        this.d = uri;
        this.a = uri2;
    }

    public /* synthetic */ fem(jmi jmiVar, List list, jit jitVar, AtomicInteger atomicInteger, int i, byte[] bArr) {
        this.e = i;
        this.a = jmiVar;
        this.c = list;
        this.d = jitVar;
        this.b = atomicInteger;
    }

    public /* synthetic */ fem(jwz jwzVar, jsr jsrVar, jsr jsrVar2, juc jucVar, int i) {
        this.e = i;
        this.b = jwzVar;
        this.d = jsrVar;
        this.a = jsrVar2;
        this.c = jucVar;
    }

    public /* synthetic */ fem(jwz jwzVar, juc jucVar, jsr jsrVar, jsr jsrVar2, int i) {
        this.e = i;
        this.b = jwzVar;
        this.c = jucVar;
        this.d = jsrVar;
        this.a = jsrVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [jkk] */
    /* JADX WARN: Type inference failed for: r0v146, types: [java.lang.Object, jhy] */
    /* JADX WARN: Type inference failed for: r0v17, types: [gmk] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v95, types: [jij] */
    /* JADX WARN: Type inference failed for: r0v96, types: [jij] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, miy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object, miy] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object, miy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [blo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v47, types: [jkk] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [jig] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r8v23, types: [jkk] */
    /* JADX WARN: Type inference failed for: r8v27, types: [jkk] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        jig jigVar;
        jig jigVar2;
        mko u;
        miy miyVar;
        jkk jkkVar;
        mko u2;
        cex cexVar;
        jkk jkkVar2;
        mko J;
        switch (this.e) {
            case 0:
                Object obj2 = this.a;
                Object obj3 = this.b;
                Object obj4 = this.c;
                Object obj5 = this.d;
                jav javVar = (jav) obj;
                if (javVar == null) {
                    ((ltd) ((ltd) feo.a.c()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager$SpeechpackNotificationUpdater", "lambda$updateNotificationWaitForWifi$0", 560, "SpeechPackManager.java")).w("Unable to find language tag associated with pack name: %s", obj3);
                    ((ieh) obj4).e(fbm.ON_DEVICE_FOREGROUND_AUTO_DOWNLOAD_STATUS, 4);
                    return mkk.a;
                }
                fen fenVar = (fen) obj2;
                String string = fenVar.a.getString(R.string.f188070_resource_name_obfuscated_res_0x7f14119d);
                Context context = fenVar.a;
                Intent intent = new Intent();
                intent.setClass(context, OnDeviceDownloadNowReceiver.class);
                intent.putExtra("language_tag", javVar.n);
                ((uh) obj5).d(R.drawable.f49030_resource_name_obfuscated_res_0x7f08028b, string, kmm.a(context, intent));
                return mkk.a;
            case 1:
                Object obj6 = this.d;
                Object obj7 = this.b;
                ?? r3 = this.c;
                Object obj8 = this.a;
                llr llrVar = (llr) obj;
                int i = ((cla) ((lfb) obj7).a()).b;
                llr llrVar2 = (llr) kcu.S(r3);
                clg clgVar = (clg) obj6;
                HashMap hashMap = clgVar.j;
                llw llwVar = ((cll) obj8).b;
                mko e = clgVar.e(llrVar, hashMap, i, llrVar2, llwVar, true);
                mhu.h(e, CancellationException.class, new hap(clgVar, llrVar, hashMap, i, llrVar2, llwVar, 1), mjl.a);
                return e;
            case 2:
                return ((gmk) this.a).b((gmm) this.c, (gmm) this.b, (gmm) obj, this.d);
            case 3:
                Object obj9 = this.a;
                ?? r2 = this.c;
                Object obj10 = this.d;
                Object obj11 = this.b;
                jiu jiuVar = (jiu) obj;
                if (jiuVar != null && jiuVar.d) {
                    r2.add(lxj.v(((jmi) obj9).a, jiuVar.f));
                }
                jmi jmiVar = (jmi) obj9;
                jli jliVar = (jli) jmiVar.e;
                jit jitVar = (jit) obj10;
                return jco.i(jco.j(jliVar.b.e(jitVar), new jko(jliVar, jitVar, 18), jliVar.i), new fyn((AtomicInteger) obj11, jitVar, 18), jmiVar.b);
            case 4:
                Object obj12 = this.c;
                Object obj13 = this.a;
                Object obj14 = this.d;
                jmk.c("%s: Shared file not found, newFileKey = %s", "FileGroupManager", obj12);
                jkk.w((jig) obj13, (jie) obj14, 26);
                return kcu.J((jlj) obj);
            case 5:
                Object obj15 = this.b;
                Object obj16 = this.d;
                Object obj17 = this.a;
                Object obj18 = this.c;
                jiu jiuVar2 = (jiu) obj;
                final jie jieVar = (jie) obj16;
                ?? r6 = jieVar.n;
                final jig jigVar3 = (jig) obj17;
                final long j = jigVar3.j;
                jip b = jip.b(jiuVar2.c);
                if (b == null) {
                    b = jip.NONE;
                }
                if (b != jip.DOWNLOAD_COMPLETE) {
                    return mkk.a;
                }
                if (jiuVar2.d) {
                    if (!jkk.t(jiuVar2, j)) {
                        return mkk.a;
                    }
                    String str = jieVar.b;
                    String str2 = jigVar3.c;
                    int i2 = jmk.a;
                    final jit jitVar2 = (jit) obj18;
                    final jkk jkkVar3 = (jkk) obj15;
                    return jkkVar3.m(jkkVar3.u(jigVar3, jieVar, jiuVar2, jitVar2, jiuVar2.f, j, 27), new miy() { // from class: jjx
                        @Override // defpackage.miy
                        public final mko a(Object obj19) {
                            return !((Boolean) obj19).booleanValue() ? jkk.this.n(jigVar3, jieVar, jitVar2, j) : mkk.a;
                        }
                    });
                }
                try {
                    try {
                        if (!TextUtils.isEmpty(r6)) {
                            final Uri b2 = ((jkk) obj15).b((jie) obj16, (jit) obj18, jiuVar2);
                            if (lxj.B(((jkk) obj15).a, r6, (jig) obj17, (jie) obj16, ((jkk) obj15).j)) {
                                String str3 = ((jie) obj16).b;
                                String str4 = ((jig) obj17).c;
                                int i3 = jmk.a;
                                u = ((jkk) obj15).u((jig) obj17, (jie) obj16, jiuVar2, (jit) obj18, r6, j, 5);
                                final jit jitVar3 = (jit) obj18;
                                final jig jigVar4 = (jig) obj17;
                                final jie jieVar2 = (jie) obj16;
                                final jkk jkkVar4 = (jkk) obj15;
                                miyVar = new miy() { // from class: jjy
                                    @Override // defpackage.miy
                                    public final mko a(Object obj19) {
                                        if (r8 == 0) {
                                            jkk jkkVar5 = jkkVar4;
                                            Uri uri = b2;
                                            jig jigVar5 = jigVar4;
                                            jie jieVar3 = jieVar2;
                                            jit jitVar4 = jitVar3;
                                            long j2 = j;
                                            if (((Boolean) obj19).booleanValue()) {
                                                jkkVar5.p(uri, jigVar5, jieVar3);
                                                return mkk.a;
                                            }
                                            return jkkVar5.n(jigVar5, jieVar3, jitVar4, j2);
                                        }
                                        jkk jkkVar6 = jkkVar4;
                                        Uri uri2 = b2;
                                        jig jigVar6 = jigVar4;
                                        jie jieVar4 = jieVar2;
                                        jit jitVar5 = jitVar3;
                                        long j3 = j;
                                        if (((Boolean) obj19).booleanValue()) {
                                            jkkVar6.p(uri2, jigVar6, jieVar4);
                                            return mkk.a;
                                        }
                                        return jkkVar6.n(jigVar6, jieVar4, jitVar5, j3);
                                    }
                                };
                                jkkVar = (jkk) obj15;
                            } else {
                                try {
                                    int j2 = ker.j(((jie) obj16).l);
                                    if (j2 != 0 && j2 == 2) {
                                        String str5 = ((jie) obj16).b;
                                        String str6 = ((jig) obj17).c;
                                        int i4 = jmk.a;
                                        lxj.A(((jkk) obj15).a, r6, b2, (jig) obj17, (jie) obj16, ((jkk) obj15).j, true);
                                        u = ((jkk) obj15).u((jig) obj17, (jie) obj16, jiuVar2, (jit) obj18, r6, j, 7);
                                        final jit jitVar4 = (jit) obj18;
                                        final jig jigVar5 = (jig) obj17;
                                        final jie jieVar3 = (jie) obj16;
                                        final jkk jkkVar5 = (jkk) obj15;
                                        miyVar = new miy() { // from class: jjy
                                            @Override // defpackage.miy
                                            public final mko a(Object obj19) {
                                                if (r8 == 0) {
                                                    jkk jkkVar52 = jkkVar5;
                                                    Uri uri = b2;
                                                    jig jigVar52 = jigVar5;
                                                    jie jieVar32 = jieVar3;
                                                    jit jitVar42 = jitVar4;
                                                    long j22 = j;
                                                    if (((Boolean) obj19).booleanValue()) {
                                                        jkkVar52.p(uri, jigVar52, jieVar32);
                                                        return mkk.a;
                                                    }
                                                    return jkkVar52.n(jigVar52, jieVar32, jitVar42, j22);
                                                }
                                                jkk jkkVar6 = jkkVar5;
                                                Uri uri2 = b2;
                                                jig jigVar6 = jigVar5;
                                                jie jieVar4 = jieVar3;
                                                jit jitVar5 = jitVar4;
                                                long j3 = j;
                                                if (((Boolean) obj19).booleanValue()) {
                                                    jkkVar6.p(uri2, jigVar6, jieVar4);
                                                    return mkk.a;
                                                }
                                                return jkkVar6.n(jigVar6, jieVar4, jitVar5, j3);
                                            }
                                        };
                                        jkkVar = (jkk) obj15;
                                    } else {
                                        jigVar2 = jigVar3;
                                    }
                                } catch (jmo e2) {
                                    e = e2;
                                    r6 = jigVar3;
                                    jkk.w(r6, jieVar, e.a);
                                    jigVar = r6;
                                    String str7 = jieVar.b;
                                    String str8 = jigVar.c;
                                    int i5 = jmk.a;
                                    return ((jkk) obj15).n(jigVar, jieVar, (jit) obj18, j);
                                }
                            }
                            return jkkVar.m(u, miyVar);
                        }
                        jigVar2 = jigVar3;
                        int j3 = ker.j(((jie) obj16).l);
                        jigVar = jigVar2;
                        if (j3 == 0) {
                            jigVar = jigVar2;
                        } else if (j3 == 2) {
                            jkk.w((jig) obj17, (jie) obj16, 16);
                            jigVar = jigVar2;
                        }
                    } catch (jmo e3) {
                        e = e3;
                    }
                } catch (jmo e4) {
                    e = e4;
                    r6 = jigVar3;
                }
                String str72 = jieVar.b;
                String str82 = jigVar.c;
                int i52 = jmk.a;
                return ((jkk) obj15).n(jigVar, jieVar, (jit) obj18, j);
            case 6:
                Object obj19 = this.b;
                Object obj20 = this.a;
                Object obj21 = this.d;
                Void r5 = (Void) obj;
                jkk jkkVar6 = (jkk) obj19;
                jit jitVar5 = (jit) this.c;
                jie jieVar4 = (jie) obj21;
                jig jigVar6 = (jig) obj20;
                return jkkVar6.m(jco.h(jkkVar6.c.d(jitVar5), jlj.class, new fem(jkkVar6, jitVar5, jigVar6, jieVar4, 4), jkkVar6.e), new fem(jkkVar6, jieVar4, jigVar6, jitVar5, 5));
            case 7:
                Object obj22 = this.c;
                Object obj23 = this.a;
                Object obj24 = this.d;
                jmk.c("%s: Shared file not found, newFileKey = %s", "FileGroupManager", obj22);
                jkk.w((jig) obj23, (jie) obj24, 26);
                return kcu.J((jlj) obj);
            case 8:
                Object obj25 = this.b;
                Object obj26 = this.a;
                Object obj27 = this.d;
                Object obj28 = this.c;
                jiu jiuVar3 = (jiu) obj;
                jig jigVar7 = (jig) obj26;
                long j4 = jigVar7.j;
                try {
                } catch (jmo e5) {
                    jkk.w(jigVar7, (jie) obj27, e5.a);
                }
                if (!jiuVar3.d) {
                    String str9 = ((jie) obj27).n;
                    if (!TextUtils.isEmpty(str9)) {
                        if (lxj.B(((jkk) obj25).a, str9, (jig) obj26, (jie) obj27, ((jkk) obj25).j)) {
                            String str10 = ((jie) obj27).b;
                            String str11 = ((jig) obj26).c;
                            int i6 = jmk.a;
                            u2 = ((jkk) obj25).u((jig) obj26, (jie) obj27, jiuVar3, (jit) obj28, str9, j4, 4);
                            cexVar = cex.n;
                            jkkVar2 = (jkk) obj25;
                        } else {
                            int j5 = ker.j(((jie) obj27).l);
                            if (j5 != 0 && j5 == 2) {
                                jip b3 = jip.b(jiuVar3.c);
                                if (b3 == null) {
                                    b3 = jip.NONE;
                                }
                                if (b3 == jip.DOWNLOAD_COMPLETE) {
                                    String str12 = ((jie) obj27).b;
                                    String str13 = ((jig) obj26).c;
                                    int i7 = jmk.a;
                                    lxj.A(((jkk) obj25).a, str9, ((jkk) obj25).b((jie) obj27, (jit) obj28, jiuVar3), (jig) obj26, (jie) obj27, ((jkk) obj25).j, false);
                                    u2 = ((jkk) obj25).u((jig) obj26, (jie) obj27, jiuVar3, (jit) obj28, str9, j4, 6);
                                    cexVar = cex.o;
                                    jkkVar2 = (jkk) obj25;
                                }
                            }
                        }
                    }
                    String str14 = ((jie) obj27).b;
                    String str15 = jigVar7.c;
                    int i8 = jmk.a;
                    return mkk.a;
                }
                String str16 = ((jie) obj27).b;
                String str17 = ((jig) obj26).c;
                int i9 = jmk.a;
                jkk jkkVar7 = (jkk) obj25;
                u2 = jkkVar7.u((jig) obj26, (jie) obj27, jiuVar3, (jit) obj28, jiuVar3.f, j4, 3);
                cexVar = cex.m;
                jkkVar2 = (jkk) obj25;
                return jkkVar2.m(u2, cexVar);
            case 9:
                Object obj29 = this.b;
                Object obj30 = this.c;
                Object obj31 = this.d;
                Void r52 = (Void) obj;
                jig jigVar8 = (jig) this.a;
                return ((jkk) obj29).i((jiq) obj30, (jhv) obj31, jigVar8.q, jigVar8.r);
            case 10:
                Object obj32 = this.b;
                Object obj33 = this.c;
                Object obj34 = this.d;
                Void r53 = (Void) obj;
                jig jigVar9 = (jig) this.a;
                return ((jkk) obj32).i((jiq) obj33, (jhv) obj34, jigVar9.q, jigVar9.r);
            case 11:
                Object obj35 = this.b;
                Object obj36 = this.a;
                Object obj37 = this.c;
                Object obj38 = this.d;
                jig jigVar10 = (jig) obj;
                mko mkoVar = mkk.a;
                if (jigVar10 != null) {
                    jkk jkkVar8 = (jkk) obj35;
                    mkoVar = jkkVar8.m(jkkVar8.b.i((jiq) obj36), new jkg(jkkVar8, (jiq) obj37, jigVar10, 0));
                }
                jkk jkkVar9 = (jkk) obj35;
                return jkkVar9.m(mkoVar, new hzb(jkkVar9, (jig) obj38, 17));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj39 = this.c;
                Object obj40 = this.d;
                Object obj41 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    return mkk.a;
                }
                lvw.B((jig) obj40);
                kcu.K(true);
                jkk jkkVar10 = (jkk) obj39;
                jiq jiqVar = (jiq) obj41;
                return jkkVar10.m(jkkVar10.b.i(jiqVar), new jke(jiqVar, 5));
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj42 = this.c;
                ?? r0 = this.d;
                Object obj43 = this.a;
                ?? r13 = this.b;
                jig jigVar11 = (jig) obj;
                if (r0 == null && (r0 = jigVar11.k) == null) {
                    r0 = jij.f;
                }
                jij jijVar = r0;
                ArrayList arrayList = new ArrayList();
                for (jie jieVar5 : jigVar11.m) {
                    if (!lre.aE(jieVar5)) {
                        int h = ker.h(jigVar11.h);
                        if (h == 0) {
                            h = 1;
                        }
                        jit t = kki.t(jieVar5, h);
                        if (Build.VERSION.SDK_INT >= 30) {
                            jkk jkkVar11 = (jkk) obj42;
                            J = jkkVar11.m(jkkVar11.m(jco.h(jkkVar11.c.d(t), jlj.class, new fem(jkkVar11, t, jigVar11, jieVar5, 7), jkkVar11.e), new fem(jkkVar11, jigVar11, jieVar5, t, 8)), new jww(jkkVar11, (jiq) obj43, jieVar5, t, jijVar, jigVar11, 1));
                        } else {
                            try {
                                J = ((jkk) obj42).c.e((jiq) obj43, jieVar5, t, jijVar, jigVar11.n, jigVar11.o);
                            } catch (RuntimeException e6) {
                                nzv a = jhv.a();
                                a.a = jhu.UNKNOWN_ERROR;
                                a.c = e6;
                                J = kcu.J(a.e());
                            }
                        }
                        arrayList.add(J);
                    }
                }
                jkk jkkVar12 = (jkk) obj42;
                return jez.p(arrayList).b(new jjw(jkkVar12, (jiq) obj43, jigVar11, r13, arrayList, 0), jkkVar12.e);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Void r54 = (Void) obj;
                jkk jkkVar13 = (jkk) this.b;
                return jkkVar13.m(jkkVar13.b.i((jiq) this.a), new hzb((jiq) this.c, (jig) this.d, 15));
            case 15:
                Object obj44 = this.c;
                Object obj45 = this.a;
                Object obj46 = this.d;
                ?? r4 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    return kcu.K(true);
                }
                jkv jkvVar = (jkv) obj44;
                jig jigVar12 = (jig) obj46;
                return jco.i(jkvVar.c.o((jiq) obj45, jigVar12, r4), new jks(jigVar12, 0), jkvVar.h);
            case 16:
                Void r55 = (Void) obj;
                return ((jkv) this.a).c.d((jiq) this.d, (jij) ((lfb) this.c).d(), this.b);
            case 17:
                Object obj47 = this.b;
                Object obj48 = this.c;
                Object obj49 = this.d;
                Object obj50 = this.a;
                jiu jiuVar4 = (jiu) obj;
                Uri uri = null;
                if (jiuVar4 != null) {
                    jip b4 = jip.b(jiuVar4.c);
                    if (b4 == null) {
                        b4 = jip.NONE;
                    }
                    if (b4 == jip.DOWNLOAD_COMPLETE) {
                        jmd jmdVar = (jmd) obj47;
                        uri = lxj.y(jmdVar.a, jmdVar.l, jiuVar4.b, ((jit) obj48).d, jmdVar.j, false);
                    }
                }
                if (uri == null) {
                    nzv a2 = jhv.a();
                    a2.a = jhu.DELTA_DOWNLOAD_BASE_FILE_NOT_FOUND_ERROR;
                    return kcu.J(a2.e());
                }
                try {
                    if (((jmd) obj47).m.v((Uri) obj49)) {
                        ((jmd) obj47).m.t((Uri) obj49);
                    }
                    ((jmd) obj47).d.a();
                    ((jmd) obj47).m.t((Uri) obj50);
                    nfh t2 = mgy.h.t();
                    jmd jmdVar2 = (jmd) obj47;
                    String str18 = jmdVar2.f.b;
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    mgy mgyVar = (mgy) t2.b;
                    str18.getClass();
                    int i10 = mgyVar.a | 1;
                    mgyVar.a = i10;
                    mgyVar.b = str18;
                    int i11 = jmdVar2.g;
                    int i12 = i10 | 2;
                    mgyVar.a = i12;
                    mgyVar.c = i11;
                    String str19 = jmdVar2.f.c;
                    str19.getClass();
                    int i13 = 4 | i12;
                    mgyVar.a = i13;
                    mgyVar.d = str19;
                    long j6 = jmdVar2.h;
                    int i14 = i13 | 64;
                    mgyVar.a = i14;
                    mgyVar.f = j6;
                    String str20 = jmdVar2.i;
                    str20.getClass();
                    mgyVar.a = i14 | 128;
                    mgyVar.g = str20;
                    mgy mgyVar2 = (mgy) t2.cz();
                    jie jieVar6 = jmdVar2.c;
                    int i15 = jieVar6.d;
                    String str21 = jieVar6.b;
                    for (int i16 = 0; i16 < jmdVar2.c.k.size() && !jdg.Z(((jii) jmdVar2.c.k.get(i16)).d, jmdVar2.e.d); i16++) {
                    }
                    return mkk.a;
                } catch (IOException e7) {
                    jmd jmdVar3 = (jmd) obj47;
                    jmk.e(e7, "%s: Failed to decode delta file with url = %s failed. checksum = %s ", "DeltaFileDownloaderCallbackImpl", jmdVar3.e.b, jmdVar3.c.f);
                    nzv a3 = jhv.a();
                    a3.a = jhu.DELTA_DOWNLOAD_DECODE_IO_ERROR;
                    a3.c = e7;
                    return kcu.J(a3.e());
                }
            case 18:
                ?? r02 = this.a;
                Object obj51 = this.b;
                Object obj52 = this.c;
                Object obj53 = this.d;
                int i17 = ((jiu) obj).g;
                r02.g();
                if (i17 >= 5) {
                    int i18 = jmk.a;
                } else {
                    int i19 = jmk.a;
                    try {
                        ((kcq) obj52).t((Uri) obj53);
                    } catch (IOException e8) {
                        jmk.e(e8, "%s: Failed to remove corrupted file %s", "DownloaderCallbackImpl", obj51);
                        return kcu.J(e8);
                    }
                }
                return mkk.a;
            case 19:
                Object obj54 = this.b;
                Void r56 = (Void) obj;
                juc jucVar = (juc) this.c;
                ((jwz) obj54).e(jucVar, (jsr) this.d, (jsr) this.a);
                return jwz.g(jucVar);
            default:
                Object obj55 = this.b;
                Object obj56 = this.d;
                Object obj57 = this.a;
                Object obj58 = this.c;
                Throwable th = (Throwable) obj;
                jsf.a(((jrh) obj56).a).a(((jrh) obj57).b, "unpack_failed", new Object[0]);
                jwz jwzVar = (jwz) obj55;
                jwzVar.e.a(new jwx(jwzVar, (jsr) obj57, (juc) obj58, (jsr) obj56, th, 0));
                return kcu.J(th);
        }
    }
}
