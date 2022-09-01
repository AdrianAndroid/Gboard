package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cjq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cjq implements leq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cjq(Context context, his hisVar, int i) {
        this.c = i;
        this.b = context;
        this.a = hisVar;
    }

    public /* synthetic */ cjq(View.OnClickListener onClickListener, AtomicBoolean atomicBoolean, int i) {
        this.c = i;
        this.b = onClickListener;
        this.a = atomicBoolean;
    }

    public /* synthetic */ cjq(buk bukVar, String str, int i) {
        this.c = i;
        this.b = bukVar;
        this.a = str;
    }

    public /* synthetic */ cjq(cjt cjtVar, EditorInfo editorInfo, int i) {
        this.c = i;
        this.a = cjtVar;
        this.b = editorInfo;
    }

    public /* synthetic */ cjq(cqq cqqVar, File file, int i) {
        this.c = i;
        this.b = cqqVar;
        this.a = file;
    }

    public /* synthetic */ cjq(crf crfVar, cra craVar, int i) {
        this.c = i;
        this.a = crfVar;
        this.b = craVar;
    }

    public /* synthetic */ cjq(crt crtVar, cru cruVar, int i) {
        this.c = i;
        this.b = crtVar;
        this.a = cruVar;
    }

    public /* synthetic */ cjq(cwu cwuVar, String str, int i) {
        this.c = i;
        this.b = cwuVar;
        this.a = str;
    }

    public /* synthetic */ cjq(dpe dpeVar, his hisVar, int i, byte[] bArr, byte[] bArr2) {
        this.c = i;
        this.b = dpeVar;
        this.a = hisVar;
    }

    public /* synthetic */ cjq(dxs dxsVar, cyu cyuVar, int i, byte[] bArr, byte[] bArr2) {
        this.c = i;
        this.a = dxsVar;
        this.b = cyuVar;
    }

    public /* synthetic */ cjq(eck eckVar, idn idnVar, int i) {
        this.c = i;
        this.b = eckVar;
        this.a = idnVar;
    }

    public /* synthetic */ cjq(hpl hplVar, String str, int i) {
        this.c = i;
        this.b = hplVar;
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [hpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, cyu] */
    /* JADX WARN: Type inference failed for: r1v26, types: [his, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [idn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [his, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [his, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [his, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [his, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [his, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [his, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [his, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [his, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40, types: [his, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [his, java.lang.Object] */
    @Override // defpackage.leq
    public final Object a(Object obj) {
        lfb lfbVar;
        crq crqVar = null;
        switch (this.c) {
            case 0:
                return ((cjt) this.a).a((EditorInfo) this.b, (cjo) obj);
            case 1:
                Object obj2 = this.b;
                Object obj3 = this.a;
                List<List> list = (List) obj;
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (List list2 : list) {
                        if (list2 != null) {
                            arrayList.addAll(list2);
                        }
                    }
                }
                Collections.sort(arrayList, xr.c);
                lna g = lnd.g();
                if (arrayList.isEmpty() || !((hex) arrayList.get(0)).a.equals(obj3)) {
                    g.g(obj3, 0);
                }
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    hex hexVar = (hex) arrayList.get(i3);
                    String str = hexVar.a;
                    int length = str.length();
                    int i4 = hexVar.b;
                    int i5 = hexVar.c;
                    int i6 = length + i5;
                    if (i5 == i && i6 == i2) {
                        g.g(str, Integer.valueOf(i4));
                    } else if (i6 > i2) {
                        g.g(str, Integer.valueOf(i4));
                        i = i5;
                        i2 = i6;
                    }
                }
                lnd f = g.f();
                ArrayList arrayList2 = new ArrayList();
                buk bukVar = (buk) obj2;
                long j = bukVar.e;
                int d = bukVar.d();
                int e = f.e() - 1;
                for (Map.Entry entry : f.x()) {
                    buj g2 = buk.g();
                    g2.a = j - e;
                    g2.e((String) entry.getKey());
                    g2.b(((Integer) entry.getValue()).intValue());
                    g2.d(d);
                    g2.b = j;
                    arrayList2.add(g2.a());
                    e--;
                }
                return llp.o(arrayList2);
            case 2:
                Object obj4 = this.b;
                Object obj5 = this.a;
                cra craVar = (cra) obj;
                cqo h = craVar.a.h();
                LinkedHashMap t = lre.t();
                t.putAll(craVar.a.l());
                File file = (File) obj5;
                String f2 = jbc.f(file);
                if (!craVar.a.k().containsKey(f2)) {
                    h.b(file);
                }
                if (!t.containsKey(f2)) {
                    lfb a = crk.a(((cqq) obj4).e, file);
                    if (a.e()) {
                        t.put(f2, (Uri) a.a());
                    }
                }
                if (!t.containsKey("image/webp.wasticker")) {
                    crr crrVar = ((cqq) obj4).h;
                    if (!crp.b(crrVar.b, craVar.c) || !crp.c(file, craVar.a.r())) {
                        craVar.a.d();
                        file.getAbsolutePath();
                        lfbVar = ldu.a;
                    } else {
                        File file2 = (File) craVar.a.k().get("image/webp.wasticker");
                        if (file2 == null) {
                            try {
                                File a2 = crrVar.c.a((File) obj5, craVar.a.r());
                                lfb a3 = crk.a(crrVar.b, a2);
                                if (!a3.e()) {
                                    ((ltd) ((ltd) crr.a.c()).k("com/google/android/apps/inputmethod/libs/expression/image/WhatsAppWebpShareHelper", "createWhatsAppWebpFile", 73, "WhatsAppWebpShareHelper.java")).t("Failed to get webp uri");
                                } else {
                                    ((ltd) ((ltd) crr.a.b()).k("com/google/android/apps/inputmethod/libs/expression/image/WhatsAppWebpShareHelper", "createWhatsAppWebpFile", 76, "WhatsAppWebpShareHelper.java")).w("Created webp for %s", craVar.a.d());
                                    crqVar = new crq((Uri) a3.a(), a2);
                                }
                            } catch (Throwable th) {
                                ((ltd) ((ltd) ((ltd) crr.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/expression/image/WhatsAppWebpShareHelper", "createWhatsAppWebpFile", 79, "WhatsAppWebpShareHelper.java")).w("Failed to create webp for %s", craVar.a.d());
                            }
                            if (crqVar != null) {
                                h.b(crqVar.b);
                                lfbVar = lfb.g(crqVar.a);
                            } else {
                                lfbVar = ldu.a;
                            }
                        } else {
                            lfbVar = crk.a(crrVar.b, file2);
                        }
                    }
                    if (lfbVar.e()) {
                        t.put("image/webp.wasticker", (Uri) lfbVar.a());
                    }
                }
                h.k(llw.k(t));
                cqz b = craVar.b();
                b.b(h.a());
                return b.a();
            case 3:
                Object obj6 = this.a;
                Object obj7 = this.b;
                ((ltd) ((ltd) ((ltd) crf.a.c()).i((Throwable) obj)).k("com/google/android/apps/inputmethod/libs/expression/image/ImageShareWorker", "lambda$share$0", (char) 135, "ImageShareWorker.java")).t("Sharing failed");
                crb a4 = crc.a();
                a4.g((cra) obj7);
                a4.c(mcb.KEYBOARD_IMAGE_INSERT_RESULT_EXCEPTION);
                crc a5 = a4.a();
                ((crf) obj6).b(a5);
                return a5;
            case 4:
                Object obj8 = this.b;
                Object obj9 = this.a;
                crv crvVar = (crv) obj;
                if (crvVar != null) {
                    hew hewVar = new hew((cru) obj9);
                    hewVar.f(crvVar.c + 1);
                    obj9 = hewVar.e();
                }
                crt crtVar = (crt) obj8;
                ihq ihqVar = crtVar.c;
                iig a6 = iih.a();
                a6.g();
                a6.d();
                cru cruVar = (cru) obj9;
                a6.h(cva.c.buildUpon().appendQueryParameter("q", String.format(Locale.US, "%s gif", cruVar.b)).appendQueryParameter("asearch", "isch").appendQueryParameter("tbm", "isch").appendQueryParameter("safe", "high").appendQueryParameter("client", "gboard-gif").appendQueryParameter("async", String.format(Locale.US, "ijn:%d,_fmt:json", Integer.valueOf(cruVar.c))).appendQueryParameter("tbs", cru.a.f(lre.D("itp:animated"))).build());
                a6.e(iil.n);
                a6.f(cruVar.d);
                return hiz.k(ihqVar.c(a6.a())).u(new byi(cruVar, 19), crtVar.b);
            case 5:
                return ((cwu) this.b).a(((cwx) obj).n((String) this.a));
            case 6:
                Object obj10 = this.a;
                ?? r1 = this.b;
                cyn cynVar = (cyn) obj;
                cyu cyuVar = r1;
                if (cynVar != null) {
                    cyt b2 = r1.b();
                    b2.g(cynVar.a);
                    cyuVar = b2.b();
                }
                dxs dxsVar = (dxs) obj10;
                return dxsVar.i(cyuVar).u(cuv.s, dxsVar.b);
            case 7:
                ?? r0 = this.b;
                Object obj11 = this.a;
                Bundle bundle = (Bundle) obj;
                if (bundle != null) {
                    r0.a((String) obj11, bundle);
                }
                return null;
            case 8:
                return new ebm((Context) this.b, (View) obj, this.a);
            case 9:
                Object obj12 = this.b;
                llp llpVar = (llp) obj;
                this.a.a();
                if (llpVar != null && !llpVar.isEmpty()) {
                    return ((eck) obj12).d(llpVar);
                }
                return llp.q();
            case 10:
                return new edi((View) obj, this.b, (AtomicBoolean) this.a);
            case 11:
                return new eem((Context) this.b, (View) obj, this.a);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new eel((Context) this.b, (View) obj, this.a);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new eiv((Context) this.b, (View) obj, this.a);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new eiu((Context) this.b, (View) obj, this.a);
            case 15:
                return new eix((Context) this.b, (View) obj, this.a);
            case 16:
                return new eiw((Context) this.b, (View) obj, this.a);
            case 17:
                return new ejg((View) obj, (dpe) this.b, this.a, null, null);
            case 18:
                return new eje((Context) this.b, (View) obj, this.a);
            case 19:
                return new ekk((Context) this.b, (View) obj, this.a);
            default:
                return new ekj((Context) this.b, (View) obj, this.a);
        }
    }
}
