package defpackage;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.clipboard.ClipboardKeyboard;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.inputmethod.latin.R;
import j$.util.Collection$EL;
import j$.util.Objects;
import j$.util.function.Function;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: brs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class brs implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ brs(bov bovVar, jls jlsVar, int i, byte[] bArr) {
        this.c = i;
        this.a = bovVar;
        this.b = jlsVar;
    }

    public /* synthetic */ brs(brt brtVar, ewj ewjVar, int i, byte[] bArr, byte[] bArr2) {
        this.c = i;
        this.a = brtVar;
        this.b = ewjVar;
    }

    public /* synthetic */ brs(bvp bvpVar, List list, int i) {
        this.c = i;
        this.a = bvpVar;
        this.b = list;
    }

    public /* synthetic */ brs(clr clrVar, String str, int i) {
        this.c = i;
        this.a = clrVar;
        this.b = str;
    }

    public /* synthetic */ brs(ClipboardKeyboard clipboardKeyboard, List list, int i) {
        this.c = i;
        this.a = clipboardKeyboard;
        this.b = list;
    }

    public /* synthetic */ brs(ClipboardKeyboard clipboardKeyboard, llp llpVar, int i) {
        this.c = i;
        this.a = clipboardKeyboard;
        this.b = llpVar;
    }

    public /* synthetic */ brs(Delight5Facilitator delight5Facilitator, Locale locale, int i) {
        this.c = i;
        this.a = delight5Facilitator;
        this.b = locale;
    }

    public /* synthetic */ brs(cqq cqqVar, Uri uri, int i) {
        this.c = i;
        this.b = cqqVar;
        this.a = uri;
    }

    public /* synthetic */ brs(dng dngVar, jav javVar, int i) {
        this.c = i;
        this.a = dngVar;
        this.b = javVar;
    }

    public /* synthetic */ brs(epl eplVar, Bitmap bitmap, int i) {
        this.c = i;
        this.b = eplVar;
        this.a = bitmap;
    }

    public /* synthetic */ brs(exa exaVar, String str, int i) {
        this.c = i;
        this.a = exaVar;
        this.b = str;
    }

    public /* synthetic */ brs(faa faaVar, ezq ezqVar, int i) {
        this.c = i;
        this.b = faaVar;
        this.a = ezqVar;
    }

    public /* synthetic */ brs(hiz hizVar, hiz hizVar2, int i) {
        this.c = i;
        this.a = hizVar;
        this.b = hizVar2;
    }

    public /* synthetic */ brs(ijk ijkVar, Context context, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = i;
        this.b = ijkVar;
        this.a = context;
    }

    public /* synthetic */ brs(List list, cqv cqvVar, int i) {
        this.c = i;
        this.b = list;
        this.a = cqvVar;
    }

    /* JADX WARN: Type inference failed for: r0v69, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [idn, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.Collection, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Stream concat;
        Stream concat2;
        int i = 12;
        llp llpVar = null;
        File file = null;
        llpVar = null;
        llpVar = null;
        boolean z = true;
        switch (this.c) {
            case 0:
                Object obj = this.a;
                ewj ewjVar = (ewj) this.b;
                while (true) {
                    boolean z2 = true;
                    for (mvm mvmVar : cfm.b((Context) ewjVar.b, ino.M((Context) ewjVar.b).y(R.string.f160340_resource_name_obfuscated_res_0x7f14063f))) {
                        if (!z2 || !new cau().b((Delight5Facilitator) ewjVar.a, mvmVar)) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        Context context = ((brt) obj).a;
                        HashMap hashMap = new HashMap();
                        hrx.y(context);
                        llp b = hqr.b();
                        int size = b.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String locale = ((hqt) b.get(i2)).i().q().toString();
                            if (TextUtils.equals(locale, "zh_CN")) {
                                bvq.c(dxu.l(context), hashMap);
                            } else if (TextUtils.equals(locale, "zh_HK")) {
                                bvq.c(btg.a(context), hashMap);
                            } else if (TextUtils.equals(locale, "zh_TW")) {
                                bvq.c(fgj.l(context), hashMap);
                            } else if (TextUtils.equals(locale, "ko")) {
                                bvq.c(dmh.l(context), hashMap);
                            }
                        }
                        int size2 = hashMap.size();
                        dij[] dijVarArr = new dij[size2];
                        int i3 = 0;
                        for (Map.Entry entry : hashMap.entrySet()) {
                            dijVarArr[i3] = (dij) entry.getValue();
                            i3++;
                        }
                        if (size2 != 0) {
                            for (int i4 = 0; i4 < size2; i4++) {
                                dij dijVar = dijVarArr[i4];
                                dio dioVar = new dio(dijVar, 3);
                                if (dijVar.q() == null) {
                                    String H = dijVar.H(3);
                                    if (H != null) {
                                        new File(context.getFilesDir(), H).delete();
                                    }
                                } else if (!dioVar.a()) {
                                    dioVar.close();
                                } else {
                                    if (dioVar.b()) {
                                        dijVar.I(3);
                                    }
                                    dioVar.close();
                                }
                            }
                        }
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                    break;
                }
            case 1:
                return iav.f(((bov) this.a).a, (jls) this.b);
            case 2:
                bvi.f(((bvp) this.a).c, this.b);
                return null;
            case 3:
                bvi.d(((ClipboardKeyboard) this.a).u, this.b);
                return null;
            case 4:
                Object obj2 = this.a;
                ?? r1 = this.b;
                Context context2 = ((ClipboardKeyboard) obj2).u;
                ArrayList<ContentProviderOperation> arrayList = new ArrayList<>(r1.size());
                for (buk bukVar : r1) {
                    arrayList.add(bvi.a(bvi.b(context2, 1, bukVar.d), bukVar));
                }
                try {
                    context2.getContentResolver().applyBatch(jbt.w(context2, ".clipboard_content"), arrayList);
                } catch (Exception e) {
                    ((ltd) ((ltd) bvi.a.a(hip.a).i(e)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardContentProviderUtils", "updateItems", 116, "ClipboardContentProviderUtils.java")).t("pin failed.");
                }
                return null;
            case 5:
                bvi.f(((ClipboardKeyboard) this.a).u, this.b);
                return null;
            case 6:
                bvi.f(((ClipboardKeyboard) this.a).u, this.b);
                return null;
            case 7:
                return Boolean.valueOf(((Delight5Facilitator) this.a).J(Collections.singletonList(this.b), null));
            case 8:
                Object obj3 = this.b;
                Object obj4 = this.a;
                ijk ijkVar = (ijk) obj3;
                File file2 = new File((String) ijkVar.a);
                File c = ccd.c((Context) obj4, (jav) ijkVar.b);
                jan janVar = jan.b;
                File parentFile = c.getParentFile();
                if (parentFile == null) {
                    ((luc) ((luc) ccd.a.c()).k("com/google/android/apps/inputmethod/libs/delight5/PersonalizedNeuralRescoringModelLoader", "lambda$checkAndMoveNewModels$2", 139, "PersonalizedNeuralRescoringModelLoader.java")).w("nrm: No parent dir of %s", c);
                    return false;
                }
                janVar.b(parentFile.getAbsolutePath());
                if (!janVar.i(file2, c)) {
                    ((luc) ((luc) ccd.a.c()).k("com/google/android/apps/inputmethod/libs/delight5/PersonalizedNeuralRescoringModelLoader", "lambda$checkAndMoveNewModels$2", 145, "PersonalizedNeuralRescoringModelLoader.java")).G("nrm: failed to move model from %s to %s", file2, c);
                    return false;
                }
                return true;
            case 9:
                Object obj5 = this.a;
                Object obj6 = this.b;
                ebr ebrVar = (ebr) ((clr) obj5).c.a();
                if (ebrVar.e) {
                    String trim = ((String) obj6).trim();
                    if (trim.isEmpty()) {
                        llpVar = llp.q();
                    } else {
                        ebv ebvVar = (ebv) ebrVar.f.a(ebv.class);
                        if (ebvVar == null) {
                            ((ltd) ((ltd) ebr.a.b()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsHelper", "predictQueries", 126, "ExpressiveConceptsHelper.java")).t("ExpressiveConceptsPredictionModule unavailable for the current locale.");
                        } else if (!ebvVar.c()) {
                            ((ltd) ((ltd) ebr.a.d()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsHelper", "predictQueries", 130, "ExpressiveConceptsHelper.java")).t("ExpressiveConceptsPredictionModule available but inactive.");
                        } else {
                            llpVar = llp.o(lre.H(ebvVar.a(bxg.b(trim, ebrVar.c), ((Long) ebrVar.d.c()).intValue()), dzr.n));
                        }
                    }
                }
                return llpVar != null ? llpVar : llp.q();
            case 10:
                Object obj7 = this.b;
                Object obj8 = this.a;
                idn a = ((cqq) obj7).i.a(crh.BITMOJI_SHARE_INSERT_AND_COPY);
                try {
                    try {
                        File c2 = crk.c(((cqq) obj7).e, "bitmoji", jbc.c("image/png"));
                        try {
                            try {
                                Uri a2 = ((cqq) obj7).a((Uri) obj8, ((cqq) obj7).e.getPackageName(), cre.PNG);
                                idn a3 = ((cqq) obj7).i.a(crh.BITMOJI_SHARE_COPY);
                                try {
                                    InputStream k = ((cqq) obj7).j.k(a2, null);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(c2);
                                        lyp.b(k, fileOutputStream);
                                        fileOutputStream.close();
                                        k.close();
                                        a3.a();
                                        return c2;
                                    } catch (Throwable th) {
                                        try {
                                            k.close();
                                        } catch (Throwable th2) {
                                            cnx.a(th, th2);
                                        }
                                        throw th;
                                    }
                                } catch (Exception e2) {
                                    if (e2 instanceof irf) {
                                        i = 9;
                                    } else if (e2 instanceof ird) {
                                        i = 10;
                                    } else if (e2 instanceof irg) {
                                        i = 11;
                                    } else if (!(e2 instanceof irb)) {
                                        i = 13;
                                    }
                                    ((cqq) obj7).i.e(cqw.BITMOJI_SHARE_API_RESPONSE_DETAILED_FAILURE, Integer.valueOf(i));
                                    throw e2;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                file = c2;
                                if (file != null) {
                                    file.delete();
                                }
                                throw e;
                            }
                        } finally {
                        }
                    } catch (Exception e4) {
                        e = e4;
                    }
                } finally {
                }
            case 11:
                ?? r0 = this.b;
                Object obj9 = this.a;
                llk e5 = llp.e();
                for (hiz hizVar : r0) {
                    cqp cqpVar = (cqp) hizVar.B();
                    if (cqpVar != null) {
                        e5.h(cqpVar);
                    }
                }
                llp g = e5.g();
                lrl lrlVar = (lrl) g;
                int i5 = lrlVar.c;
                r0.size();
                cqv cqvVar = (cqv) obj9;
                if (lrlVar.c < cqvVar.c) {
                    throw new IllegalStateException(String.format(Locale.US, "Found %d results, but require at least %d", Integer.valueOf(lrlVar.c), Integer.valueOf(cqvVar.c)));
                }
                return g;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ((dng) this.a).a((jav) this.b);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj10 = this.a;
                Object obj11 = this.b;
                ltg ltgVar = egf.a;
                llp llpVar2 = (llp) ((hiz) obj10).z();
                llp llpVar3 = (llp) ((hiz) obj11).A(llp.q());
                if (llpVar2.isEmpty()) {
                    return (llp) Collection$EL.stream(llpVar3).map(dwn.o).collect(ljr.a);
                }
                if (llpVar3.isEmpty()) {
                    return (llp) Collection$EL.stream(llpVar2).map(dwn.p).collect(ljr.a);
                }
                String lowerCase = ((cxc) llpVar2.get(0)).h.toLowerCase(Locale.US);
                efx g2 = efq.g((cxc) llpVar2.get(0));
                dwn dwnVar = dwn.q;
                llw llwVar = (llw) Collection$EL.stream(llpVar2.subList(1, llpVar2.size())).map(dwn.p).collect(ljr.a(dwnVar, Function.CC.identity()));
                llw llwVar2 = (llw) Collection$EL.stream(llpVar3).filter(new cjx(lowerCase, 11)).limit(((Long) cwz.g.c()).longValue()).map(new chd(llwVar, 9)).map(dwn.o).collect(ljr.a(dwnVar, Function.CC.identity()));
                if (((Boolean) cwz.f.c()).booleanValue()) {
                    concat = Stream.CC.concat(Stream.CC.of(g2), Collection$EL.stream(llwVar2.values()));
                } else {
                    concat = Stream.CC.concat(Collection$EL.stream(llwVar2.values()), Stream.CC.of(g2));
                }
                return (llp) Stream.CC.concat(concat, Collection$EL.stream(llwVar.entrySet()).filter(new cjx(llwVar2, 12)).map(dwn.r)).filter(dzj.d).collect(ljr.a);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj12 = this.a;
                Object obj13 = this.b;
                ltg ltgVar2 = egf.a;
                cvv cvvVar = (cvv) ((hiz) obj12).z();
                if (cvvVar != cvv.READY) {
                    return egd.a(cvvVar, llp.q());
                }
                return egd.a(cvvVar, (llp) ((hiz) obj13).z());
            case 15:
                Object obj14 = this.a;
                Object obj15 = this.b;
                llp llpVar4 = (llp) ((hiz) obj14).z();
                llp llpVar5 = (llp) ((hiz) obj15).A(llp.q());
                if (llpVar4.isEmpty()) {
                    return (llp) Collection$EL.stream(llpVar5).map(dwn.s).collect(ljr.a);
                }
                if (llpVar5.isEmpty()) {
                    return (llp) Collection$EL.stream(llpVar4).map(dwn.t).collect(ljr.a);
                }
                String lowerCase2 = ((cxc) llpVar4.get(0)).h.toLowerCase(Locale.US);
                efx g3 = efq.g((cxc) llpVar4.get(0));
                dwn dwnVar2 = dwn.u;
                llw llwVar3 = (llw) Collection$EL.stream(llpVar4.subList(1, llpVar4.size())).map(dwn.t).collect(ljr.a(dwnVar2, Function.CC.identity()));
                llw llwVar4 = (llw) Collection$EL.stream(llpVar5).filter(new cjx(lowerCase2, 13)).limit(((Long) cwz.g.c()).longValue()).map(new chd(llwVar3, 10)).map(dwn.s).collect(ljr.a(dwnVar2, Function.CC.identity()));
                if (((Boolean) cwz.f.c()).booleanValue()) {
                    concat2 = Stream.CC.concat(Stream.CC.of(g3), Collection$EL.stream(llwVar4.values()));
                } else {
                    concat2 = Stream.CC.concat(Collection$EL.stream(llwVar4.values()), Stream.CC.of(g3));
                }
                return (llp) Stream.CC.concat(concat2, Collection$EL.stream(llwVar3.entrySet()).filter(new cjx(llwVar4, 14)).map(eoe.b)).filter(dzj.e).collect(ljr.a);
            case 16:
                Object obj16 = this.a;
                Object obj17 = this.b;
                cvv cvvVar2 = (cvv) ((hiz) obj16).z();
                if (cvvVar2 != cvv.READY) {
                    return egh.a(cvvVar2, llp.q());
                }
                return egh.a(cvvVar2, (llp) ((hiz) obj17).z());
            case 17:
                Object obj18 = this.a;
                Object obj19 = this.b;
                llk e6 = llp.e();
                e6.j((Iterable) ((hiz) obj18).A(llp.q()));
                e6.j((Iterable) ((hiz) obj19).A(llp.q()));
                return e6.g();
            case 18:
                Object obj20 = this.b;
                Object obj21 = this.a;
                File u = ((epl) obj20).a.u();
                File parentFile2 = u.getParentFile();
                if (parentFile2 == null || !jan.b.h(parentFile2)) {
                    throw new IOException("Failed to create a directory: ".concat(String.valueOf(String.valueOf(parentFile2))));
                }
                eqf.e((Bitmap) obj21, lwm.e(u, new lyw[0]));
                return lwm.f(u);
            case 19:
                exa exaVar = (exa) this.a;
                Stream stream = Collection$EL.stream(exa.a(exr.c(exaVar.c), (String) this.b));
                jan janVar2 = exaVar.d;
                Objects.requireNonNull(janVar2);
                return Boolean.valueOf(stream.map(new chd(janVar2, 11)).allMatch(dzj.g));
            default:
                return ((faa) this.b).g((ezq) this.a);
        }
    }
}
