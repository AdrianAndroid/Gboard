package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.Uri;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.apps.inputmethod.libs.hmm.EngineFactory;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardTablet;
import com.google.android.apps.inputmethod.libs.trainingcache.replaycache.precomputedfeature.speech.examplestoreservice.SpeechPrecomputedFeatureExampleStoreService;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.trainingcache.storage.StorageAdapterFactory;
import j$.util.Comparator;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cak  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cak implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ cak(Context context, String str, String[] strArr, int i) {
        this.d = i;
        this.a = context;
        this.c = str;
        this.b = strArr;
    }

    public /* synthetic */ cak(bye byeVar, String str, jav javVar, int i) {
        this.d = i;
        this.a = byeVar;
        this.b = str;
        this.c = javVar;
    }

    public /* synthetic */ cak(Delight5Facilitator delight5Facilitator, List list, mql mqlVar, int i) {
        this.d = i;
        this.a = delight5Facilitator;
        this.b = list;
        this.c = mqlVar;
    }

    public /* synthetic */ cak(GifKeyboardM2 gifKeyboardM2, hiz hizVar, hiz hizVar2, int i) {
        this.d = i;
        this.a = gifKeyboardM2;
        this.c = hizVar;
        this.b = hizVar2;
    }

    public /* synthetic */ cak(GifKeyboardTablet gifKeyboardTablet, hiz hizVar, hiz hizVar2, int i) {
        this.d = i;
        this.a = gifKeyboardTablet;
        this.c = hizVar;
        this.b = hizVar2;
    }

    public /* synthetic */ cak(StorageAdapterFactory storageAdapterFactory, mko mkoVar, mko mkoVar2, int i) {
        this.d = i;
        this.a = storageAdapterFactory;
        this.c = mkoVar;
        this.b = mkoVar2;
    }

    public /* synthetic */ cak(cqq cqqVar, cra craVar, cre creVar, int i) {
        this.d = i;
        this.a = cqqVar;
        this.c = craVar;
        this.b = creVar;
    }

    public /* synthetic */ cak(cvx cvxVar, String str, Locale locale, int i) {
        this.d = i;
        this.a = cvxVar;
        this.c = str;
        this.b = locale;
    }

    public /* synthetic */ cak(cwc cwcVar, llp llpVar, String str, int i) {
        this.d = i;
        this.a = cwcVar;
        this.c = llpVar;
        this.b = str;
    }

    public /* synthetic */ cak(dkj dkjVar, dij dijVar, dki dkiVar, int i) {
        this.d = i;
        this.b = dkjVar;
        this.a = dijVar;
        this.c = dkiVar;
    }

    public /* synthetic */ cak(exv exvVar, jav javVar, evg evgVar, int i) {
        this.d = i;
        this.c = exvVar;
        this.b = javVar;
        this.a = evgVar;
    }

    public /* synthetic */ cak(gwk gwkVar, String str, Object obj, int i) {
        this.d = i;
        this.a = gwkVar;
        this.b = str;
        this.c = obj;
    }

    public /* synthetic */ cak(heh hehVar, Paint paint, hee heeVar, int i) {
        this.d = i;
        this.b = hehVar;
        this.a = paint;
        this.c = heeVar;
    }

    public /* synthetic */ cak(hqn hqnVar, iaw iawVar, jls jlsVar, int i, byte[] bArr) {
        this.d = i;
        this.a = hqnVar;
        this.c = iawVar;
        this.b = jlsVar;
    }

    public /* synthetic */ cak(File file, String str, nnx nnxVar, int i) {
        this.d = i;
        this.c = file;
        this.b = str;
        this.a = nnxVar;
    }

    public /* synthetic */ cak(jxr jxrVar, jvc jvcVar, Map map, int i) {
        this.d = i;
        this.c = jxrVar;
        this.a = jvcVar;
        this.b = map;
    }

    public /* synthetic */ cak(llp llpVar, hiz hizVar, hiz hizVar2, int i) {
        this.d = i;
        this.b = llpVar;
        this.a = hizVar;
        this.c = hizVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [iww, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v78, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v84, types: [jvc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v26, types: [iws, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        llw llwVar;
        Boolean valueOf;
        boolean z = true;
        int i = 0;
        switch (this.d) {
            case 0:
                if (((Delight5Facilitator) this.a).J(this.b, (mql) this.c)) {
                    return Boolean.TRUE;
                }
                ((ltd) ((ltd) Delight5Facilitator.a.c()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5Facilitator", "lambda$initializeForIme$8", 805, "Delight5Facilitator.java")).t("initializeForIme() : Failed to reset decoder");
                return Boolean.FALSE;
            case 1:
                Object obj = this.a;
                Object obj2 = this.b;
                Object obj3 = this.c;
                jan janVar = jan.b;
                String str = (String) obj2;
                File file = new File(str, "nwp.int8.mmap.tflite");
                File file2 = new File(str, "nwp.csym");
                if (!janVar.g(file) || !janVar.g(file2)) {
                    return false;
                }
                File file3 = new File(((bye) obj).b, "p13n/next_word_predictor_".concat(String.valueOf(String.valueOf(obj3))));
                janVar.b(file3.getAbsolutePath());
                File file4 = new File(file3, "nwp.int8.mmap.tflite");
                File file5 = new File(file3, "nwp.csym");
                janVar.i(file, file4);
                janVar.i(file2, file5);
                return true;
            case 2:
                Object obj4 = this.a;
                Object obj5 = this.c;
                Object obj6 = this.b;
                cra craVar = (cra) obj5;
                cqz b = craVar.b();
                cqo h = craVar.a.h();
                try {
                    llwVar = llw.l(((cre) obj6).c, ((cqq) obj4).a(((cra) obj5).a.d(), ham.m(((cra) obj5).c), (cre) obj6));
                } catch (RuntimeException unused) {
                    llwVar = lrq.b;
                }
                h.k(llwVar);
                b.b(h.a());
                return b.a();
            case 3:
                Object obj7 = this.a;
                Object obj8 = this.c;
                Object obj9 = this.b;
                llk e = llp.e();
                Uri.Builder appendQueryParameter = cvo.a().appendPath("search").appendPath("tags").appendQueryParameter("query", (String) obj8);
                if (obj9 != null) {
                    appendQueryParameter.appendQueryParameter("locale", cvo.e((Locale) obj9));
                }
                irh m = ((cvx) obj7).d.m(appendQueryParameter.build());
                try {
                    int columnIndexOrThrow = m.getColumnIndexOrThrow("tag");
                    while (m.moveToNext() && i < 5) {
                        String string = m.getString(columnIndexOrThrow);
                        if (TextUtils.isEmpty(string)) {
                            ((ltd) ((ltd) cvx.a.c()).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiFetcher", "fetchSuggestionsResult", 619, "BitmojiFetcher.java")).t("fetchSuggestionsResult(): Bitmoji tag is empty.");
                        } else {
                            e.h(string);
                            i++;
                            cvx.i();
                        }
                    }
                    llp g = e.g();
                    m.close();
                    return g;
                } catch (Throwable th) {
                    try {
                        m.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            case 4:
                Object obj10 = this.a;
                ?? r1 = this.c;
                Object obj11 = this.b;
                lmx g2 = lmz.g();
                int i2 = ((lrl) r1).c;
                while (i < i2) {
                    llp llpVar = (llp) ((hiz) r1.get(i)).B();
                    if (llpVar != null) {
                        g2.j(llpVar);
                    }
                    i++;
                }
                llp k = g2.g().k();
                if (k.isEmpty()) {
                    throw new IllegalStateException("zero result returned from queries. Not expected to happen. ");
                }
                cxb a = cxc.a();
                a.b = 2;
                a.e((String) obj11);
                cwc cwcVar = (cwc) obj10;
                a.d(cwcVar.b);
                a.a = cwcVar.b;
                a.g(iil.o);
                a.h(k);
                return llp.r(a.a());
            case 5:
                Object obj12 = this.b;
                Object obj13 = this.a;
                Object obj14 = this.c;
                EngineFactory engineFactory = ((dij) obj13).j;
                dki dkiVar = (dki) obj14;
                boolean nativeMigrateUserDictionary = engineFactory.nativeMigrateUserDictionary(engineFactory.b, dkiVar.b, "", dkiVar.g, dkiVar.i.getAbsolutePath());
                synchronized (((dkj) obj12).c) {
                    ((dkj) obj12).d.remove(((dki) obj14).a);
                }
                return Boolean.valueOf(nativeMigrateUserDictionary);
            case 6:
                Object obj15 = this.b;
                Object obj16 = this.a;
                Object obj17 = this.c;
                hhl hhlVar = eal.a;
                return new eak((llp) obj15, (llp) ((hiz) obj16).A(llp.q()), (llp) ((hiz) obj17).A(llp.q()));
            case 7:
                Object obj18 = this.a;
                Object obj19 = this.c;
                Object obj20 = this.b;
                llk e2 = llp.e();
                GifKeyboardM2 gifKeyboardM2 = (GifKeyboardM2) obj18;
                Resources resources = gifKeyboardM2.u.getResources();
                djc a2 = cnz.a();
                a2.c(mba.RECENTS);
                a2.b(resources.getString(R.string.f153220_resource_name_obfuscated_res_0x7f1402ce));
                e2.h(a2.a());
                llp llpVar2 = (llp) ((hiz) obj19).z();
                llp llpVar3 = (llp) ((hiz) obj20).z();
                if (llpVar3 != null && !llpVar3.isEmpty()) {
                    gifKeyboardM2.b.e(ctd.PROACTIVE_GIF_CATEGORY_IMPRESSION, new Object[0]);
                    llk e3 = llp.e();
                    int size = llpVar3.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        djc a3 = cnz.a();
                        a3.b((String) llpVar3.get(i3));
                        a3.c(mba.CONTEXTUAL);
                        e3.h(a3.a());
                    }
                    int size2 = llpVar2.size();
                    while (i < size2) {
                        cnz cnzVar = (cnz) llpVar2.get(i);
                        if (!llpVar3.contains(cnzVar.a)) {
                            e3.h(cnzVar);
                        }
                        i++;
                    }
                    llpVar2 = e3.g();
                }
                e2.j(llpVar2);
                return e2.g();
            case 8:
                Object obj21 = this.a;
                Object obj22 = this.c;
                Object obj23 = this.b;
                llk e4 = llp.e();
                GifKeyboardTablet gifKeyboardTablet = (GifKeyboardTablet) obj21;
                Resources resources2 = gifKeyboardTablet.u.getResources();
                djc a4 = cnz.a();
                a4.c(mba.RECENTS);
                a4.b(resources2.getString(R.string.f153220_resource_name_obfuscated_res_0x7f1402ce));
                e4.h(a4.a());
                llp llpVar4 = (llp) ((hiz) obj22).z();
                llp llpVar5 = (llp) ((hiz) obj23).z();
                if (llpVar5 != null && !llpVar5.isEmpty()) {
                    gifKeyboardTablet.b.e(ctd.PROACTIVE_GIF_CATEGORY_IMPRESSION, new Object[0]);
                    llk e5 = llp.e();
                    int size3 = llpVar5.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        djc a5 = cnz.a();
                        a5.b((String) llpVar5.get(i4));
                        a5.c(mba.CONTEXTUAL);
                        e5.h(a5.a());
                    }
                    int size4 = llpVar4.size();
                    while (i < size4) {
                        cnz cnzVar2 = (cnz) llpVar4.get(i);
                        if (!llpVar5.contains(cnzVar2.a)) {
                            e5.h(cnzVar2);
                        }
                        i++;
                    }
                    llpVar4 = e5.g();
                }
                e4.j(llpVar4);
                return e4.g();
            case 9:
                Object obj24 = this.c;
                Object obj25 = this.b;
                Object obj26 = this.a;
                nfh t = nji.n.t();
                exv exvVar = (exv) obj24;
                exu e6 = exvVar.e(t, llp.r("p13n_training_plan.pb"));
                if (e6 != null) {
                    exvVar.f(e6.a, (jav) obj25, (evg) obj26, e6.c, e6.b, t);
                } else {
                    ((ltd) ((ltd) exv.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/speech/SpeechPersonalizationTrainerManager", "scheduleTrainingOnlyJob", 429, "SpeechPersonalizationTrainerManager.java")).t("Not eligible for training.");
                    exvVar.d.a((nji) t.cz());
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                Object obj27 = this.c;
                Object obj28 = this.b;
                Object obj29 = this.a;
                ArrayList arrayList = new ArrayList();
                try {
                    File[] listFiles = ((File) obj27).listFiles(new cbb((String) obj28, 5, (char[]) null));
                    if (listFiles != null) {
                        ArrayList<ijk> arrayList2 = new ArrayList();
                        for (File file6 : listFiles) {
                            nnx b2 = SpeechPrecomputedFeatureExampleStoreService.b(file6.getName());
                            if (b2 != null) {
                                arrayList2.add(new ijk(b2, file6));
                            }
                        }
                        if (obj29 == null) {
                            Collections.sort(arrayList2, Comparator.CC.comparing(eoe.d, xr.o));
                        } else {
                            Collections.sort(arrayList2, Comparator.CC.comparing(eoe.d, xr.n));
                        }
                        ArrayList<File> arrayList3 = new ArrayList();
                        for (ijk ijkVar : arrayList2) {
                            Object obj30 = ijkVar.a;
                            if (obj29 != null) {
                                long j = ((nnx) obj30).a;
                                long j2 = ((nnx) obj29).a;
                                if (j != j2) {
                                    valueOf = Boolean.valueOf(j < j2);
                                } else {
                                    valueOf = Boolean.valueOf(((nnx) obj30).b <= ((nnx) obj29).b);
                                }
                            } else {
                                valueOf = false;
                            }
                            if (!valueOf.booleanValue()) {
                                arrayList3.add(ijkVar.b);
                            }
                        }
                        for (File file7 : arrayList3) {
                            FileInputStream fileInputStream = new FileInputStream(file7);
                            arrayList.add((oxu) nfm.x(oxu.d, fileInputStream, nfb.b()));
                            fileInputStream.close();
                        }
                    }
                } catch (IOException e7) {
                    ((ltd) ((ltd) ((ltd) SpeechPrecomputedFeatureExampleStoreService.a.d()).i(e7)).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/precomputedfeature/speech/examplestoreservice/SpeechPrecomputedFeatureExampleStoreService", "getSpeechPrecomputedFeatureExamples", (char) 237, "SpeechPrecomputedFeatureExampleStoreService.java")).t("getSpeechPrecomputedFeatureExamples() : Failed reading pre-computed features.");
                }
                return arrayList;
            case 11:
                return ((gwk) this.a).b((String) this.b, this.c);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj31 = this.b;
                Object obj32 = this.a;
                Object obj33 = this.c;
                heh hehVar = (heh) obj31;
                hehVar.c.set((Paint) obj32);
                hee heeVar = (hee) obj33;
                CharSequence charSequence = heeVar.b;
                hdn hdnVar = hdn.instance;
                adq b3 = hdnVar.b();
                hdl hdlVar = hdnVar.h;
                if (b3 != null && hdlVar.b()) {
                    int length = charSequence.length();
                    charSequence = adq.b().c(charSequence, 0, length, length, true != hdlVar.c ? 2 : 1);
                }
                if (((Boolean) heh.a.c()).booleanValue() || (charSequence instanceof Spanned)) {
                    StaticLayout c = heh.c(charSequence, hehVar.c);
                    int width = c.getWidth();
                    int height = c.getHeight();
                    int b4 = heh.b(heeVar.c, width);
                    int b5 = heh.b(heeVar.d, height);
                    float textSize = hehVar.c.getTextSize();
                    while (textSize > hehVar.f && (width > b4 || height > b5)) {
                        textSize = hehVar.a(textSize, Math.min(b4 / width, b5 / height));
                        hehVar.c.setTextSize(textSize);
                        c = heh.c(charSequence, hehVar.c);
                        width = c.getWidth();
                        height = c.getHeight();
                        b4 = heh.b(heeVar.c, width);
                        b5 = heh.b(heeVar.d, height);
                    }
                    Bitmap a6 = hehVar.e.a(b4, b5, Bitmap.Config.ARGB_8888);
                    hehVar.b.setBitmap(a6);
                    c.draw(hehVar.b);
                    hehVar.b.setBitmap(null);
                    return heg.a(heeVar, a6);
                }
                hehVar.c.setTextAlign(Paint.Align.CENTER);
                String obj34 = charSequence.toString();
                hehVar.c.getTextBounds(obj34, 0, obj34.length(), hehVar.g);
                int width2 = hehVar.g.width();
                int height2 = hehVar.g.height();
                int b6 = heh.b(heeVar.c, width2);
                int b7 = heh.b(heeVar.d, height2);
                float textSize2 = hehVar.c.getTextSize();
                while (textSize2 > hehVar.f && (width2 > b6 || height2 > b7)) {
                    heh.d();
                    textSize2 = hehVar.a(textSize2, Math.min(b6 / width2, b7 / height2));
                    hehVar.c.setTextSize(textSize2);
                    hehVar.c.getTextBounds(obj34, 0, obj34.length(), hehVar.g);
                    width2 = hehVar.g.width();
                    height2 = hehVar.g.height();
                    b6 = heh.b(heeVar.c, width2);
                    b7 = heh.b(heeVar.d, height2);
                }
                float exactCenterY = hehVar.g.exactCenterY();
                heh.d();
                Bitmap a7 = hehVar.e.a(b6, b7, Bitmap.Config.ARGB_8888);
                hehVar.b.setBitmap(a7);
                hehVar.b.drawText(obj34, b6 / 2, (int) ((b7 / 2.0f) - exactCenterY), hehVar.c);
                hehVar.b.setBitmap(null);
                return heg.a(heeVar, a7);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj35 = this.a;
                ?? r12 = this.c;
                List asList = Arrays.asList((Object[]) this.b);
                ArrayList arrayList4 = new ArrayList(hez.a);
                arrayList4.removeAll(asList);
                ajp a8 = ajp.a((Context) obj35);
                synchronized (a8.a) {
                }
                beh behVar = a8.b;
                nq.g(r12);
                ajt b8 = behVar.b(new ajr(r12, new ajq(asList, arrayList4)));
                llk e8 = llp.e();
                for (ajs ajsVar : b8.a) {
                    int i5 = ajsVar.b;
                    hew a9 = hex.a();
                    a9.d(((String) r12).substring(i5, ajsVar.c));
                    a9.b(hgw.b((String) Collections.unmodifiableList(ajsVar.a.b).get(0)));
                    a9.c(i5);
                    e8.h(a9.a());
                }
                return e8.g();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                hqn hqnVar = (hqn) this.a;
                return hqnVar.b(hqnVar.a, (iaw) this.c, (jls) this.b);
            case 15:
                return new iwx(((jls) kcu.S(this.b)).b, new boe(((ixc) kcu.S(this.c)).b), this.a, ieh.j(), null, null);
            default:
                Object obj36 = this.c;
                ?? r13 = this.a;
                ?? r2 = this.b;
                jxr jxrVar = (jxr) obj36;
                List<jvb> b9 = r13.b(jxrVar.a);
                lug lugVar = jsh.a;
                for (jvb jvbVar : b9) {
                    jxrVar.f.i(jxrVar.a, jvbVar, true != jxrVar.c.contains(jvbVar.a) ? 2 : 3);
                }
                jro.b(r2.values(), "Request of " + r2.size() + " packs for " + jxrVar.a + " failed", new Object[0]);
                return null;
        }
    }
}
