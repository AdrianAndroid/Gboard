package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputConnection;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.inputmethod.libs.search.widget.CategoryViewPager;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ov  reason: default package */
/* loaded from: classes2.dex */
public final class ov implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ov(int i, duo duoVar, hox hoxVar, int i2) {
        this.d = i2;
        this.a = i;
        this.c = duoVar;
        this.b = hoxVar;
    }

    public /* synthetic */ ov(Context context, int i, CharSequence charSequence, int i2) {
        this.d = i2;
        this.c = context;
        this.a = i;
        this.b = charSequence;
    }

    public /* synthetic */ ov(InputConnection inputConnection, CharSequence charSequence, int i, int i2) {
        this.d = i2;
        this.c = inputConnection;
        this.b = charSequence;
        this.a = i;
    }

    public ov(TextView textView, Typeface typeface, int i, int i2) {
        this.d = i2;
        this.b = textView;
        this.c = typeface;
        this.a = i;
    }

    public /* synthetic */ ov(CategoryViewPager categoryViewPager, int i, ela elaVar, int i2) {
        this.d = i2;
        this.b = categoryViewPager;
        this.a = i;
        this.c = elaVar;
    }

    public /* synthetic */ ov(LicenseActivity licenseActivity, int i, ScrollView scrollView, int i2) {
        this.d = i2;
        this.b = licenseActivity;
        this.a = i;
        this.c = scrollView;
    }

    public ov(BottomSheetBehavior bottomSheetBehavior, View view, int i, int i2) {
        this.d = i2;
        this.b = bottomSheetBehavior;
        this.c = view;
        this.a = i;
    }

    public /* synthetic */ ov(dre dreVar, List list, int i, int i2) {
        this.d = i2;
        this.c = dreVar;
        this.b = list;
        this.a = i;
    }

    public /* synthetic */ ov(dxa dxaVar, jav javVar, int i, int i2) {
        this.d = i2;
        this.c = dxaVar;
        this.b = javVar;
        this.a = i;
    }

    public /* synthetic */ ov(gqa gqaVar, int i, CharSequence charSequence, int i2) {
        this.d = i2;
        this.c = gqaVar;
        this.a = i;
        this.b = charSequence;
    }

    public /* synthetic */ ov(hmd hmdVar, CharSequence charSequence, int i, int i2) {
        this.d = i2;
        this.c = hmdVar;
        this.b = charSequence;
        this.a = i;
    }

    public /* synthetic */ ov(idz idzVar, String str, int i, int i2) {
        this.d = i2;
        this.c = idzVar;
        this.b = str;
        this.a = i;
    }

    public /* synthetic */ ov(isq isqVar, CharSequence charSequence, int i, int i2) {
        this.d = i2;
        this.c = isqVar;
        this.b = charSequence;
        this.a = i;
    }

    public /* synthetic */ ov(nxd nxdVar, int i, Parcel parcel, int i2) {
        this.d = i2;
        this.b = nxdVar;
        this.a = i;
        this.c = parcel;
    }

    public ov(pf pfVar, int i, IntentSender.SendIntentException sendIntentException, int i2) {
        this.d = i2;
        this.b = pfVar;
        this.a = i;
        this.c = sendIntentException;
    }

    public ov(pf pfVar, int i, aqq aqqVar, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.d = i2;
        this.c = pfVar;
        this.a = i;
        this.b = aqqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v75, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, duo] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, ela] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [pe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r3;
        flw flwVar;
        View view = null;
        switch (this.d) {
            case 0:
                Object obj = this.c;
                int i = this.a;
                Object obj2 = ((aqq) this.b).a;
                pf pfVar = (pf) obj;
                String str = (String) pfVar.b.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                bek bekVar = (bek) pfVar.f.get(str);
                if (bekVar == null || (r3 = bekVar.b) == 0) {
                    pfVar.h.remove(str);
                    pfVar.g.put(str, obj2);
                    return;
                } else if (!pfVar.e.remove(str)) {
                    return;
                } else {
                    r3.a(obj2);
                    return;
                }
            case 1:
                ((TextView) this.b).setTypeface((Typeface) this.c, this.a);
                return;
            case 2:
                ((pf) this.b).b(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable) this.c));
                return;
            case 3:
                Object obj3 = this.c;
                ?? r1 = this.b;
                int i2 = this.a;
                synchronized (((dre) obj3).c) {
                    long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                    for (gyn gynVar : r1) {
                        gynVar.a(i2, currentThreadTimeMillis);
                    }
                    Collections.sort(r1, new kp(9));
                    List<gyn> b = drl.b(r1);
                    ArrayList arrayList = new ArrayList(b.size());
                    for (gyn gynVar2 : b) {
                        arrayList.add((drk) gynVar2.a);
                    }
                    byte[] e = drl.e(arrayList);
                    if (Arrays.equals(e, ((dre) obj3).d)) {
                        return;
                    }
                    ((dre) obj3).d = e;
                    ((dre) obj3).c.a("__auto_imported_android_contacts_dictionary", drl.a(arrayList, "人名"));
                    return;
                }
            case 4:
                int i3 = this.a;
                ?? r12 = this.c;
                Object obj4 = this.b;
                if (i3 <= 0) {
                    r12.a(false);
                    return;
                } else if (dum.c()) {
                    dum.d();
                    r12.a(true);
                    return;
                } else {
                    hox hoxVar = (hox) obj4;
                    hoxVar.L(new KeyEvent(0L, 0L, 0, 61, 0, 1));
                    hoxVar.L(new KeyEvent(0L, 0L, 1, 61, 0, 1));
                    kki.i(dum.b(hoxVar, r12, i3 - 1), 20L);
                    return;
                }
            case 5:
                Object obj5 = this.c;
                Object obj6 = this.b;
                int i4 = this.a;
                jav javVar = (jav) obj6;
                ((ltd) ((ltd) dxa.a.b()).k("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerController", "onLanguageSelected", 343, "NgaLanguagePickerController.java")).w("Selected language from language picker: %s", javVar.p());
                dxa dxaVar = (dxa) obj5;
                dxaVar.c();
                if (javVar.equals(dxaVar.e)) {
                    ((ltd) ((ltd) dxa.a.b()).k("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerController", "onLanguageSelected", 347, "NgaLanguagePickerController.java")).t("Selected language is already primary language. Nothing to do.");
                    return;
                }
                fgt fgtVar = fgt.UNKNOWN;
                int i5 = i4 - 1;
                if (i5 == 1) {
                    ((ltd) ((ltd) dxa.a.b()).k("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerController", "onLanguageSelected", 358, "NgaLanguagePickerController.java")).t("Switching language.");
                    dwv a = dwv.a();
                    Context context = dxaVar.b;
                    hqy y = hrx.y(context);
                    hqt a2 = y.a(javVar);
                    if (a2 == null) {
                        ((ltd) ((ltd) dwv.a.c()).k("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerActionHandler", "switchToSmartDictationLanguageAndRestart", 84, "NgaLanguagePickerActionHandler.java")).w("Unable to switch keyboard language to %s: No matching enabled input method entry!", javVar.p());
                        return;
                    }
                    dwv.c();
                    dwv.d(context, false);
                    if (!a2.equals(hqp.b())) {
                        y.k(a2);
                    }
                    a.b(a2, fgt.ELIGIBLE);
                    return;
                } else if (i5 != 2) {
                    ((ltd) ((ltd) dxa.a.b()).k("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerController", "onLanguageSelected", 367, "NgaLanguagePickerController.java")).t("Language download is already in progress. Nothing to do.");
                    return;
                } else {
                    ((ltd) ((ltd) dxa.a.b()).k("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerController", "onLanguageSelected", 363, "NgaLanguagePickerController.java")).t("Starting language download.");
                    dwv a3 = dwv.a();
                    if (a3.c == null) {
                        ((ltd) ((ltd) dwv.a.d()).k("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerActionHandler", "startDownload", 116, "NgaLanguagePickerActionHandler.java")).t("startDownload: no ngaInteractionManager");
                        return;
                    }
                    dwv.c();
                    dup dupVar = ((dtc) a3.c).g;
                    nfh t = fia.b.t();
                    String str2 = javVar.n;
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    str2.getClass();
                    ((fia) t.b).a = str2;
                    duz duzVar = (duz) dupVar;
                    dtx.a("requestLanguageDownload", mio.g(mhu.g(mkh.q(kcu.P(new dus(duzVar, (fia) t.cz(), 0), duzVar.b)), nvw.class, dar.g, mjl.a), dar.h, mjl.a));
                    return;
                }
            case 6:
                Object obj7 = this.b;
                int i6 = this.a;
                ?? r2 = this.c;
                CategoryViewPager categoryViewPager = (CategoryViewPager) obj7;
                if (i6 != categoryViewPager.i) {
                    ((ltd) ((ltd) CategoryViewPager.h.c()).k("com/google/android/apps/inputmethod/libs/search/widget/CategoryViewPager", "lambda$notifyPageSelected$0", 96, "CategoryViewPager.java")).y("Selected page %d changed to %d while waiting for view instantiation", i6, categoryViewPager.i);
                    return;
                } else {
                    categoryViewPager.A(r2, i6, false);
                    return;
                }
            case 7:
                Object obj8 = this.c;
                int i7 = this.a;
                ?? r6 = this.b;
                gqa gqaVar = (gqa) obj8;
                if (!gqaVar.f) {
                    return;
                }
                AccessibilityEvent obtain = AccessibilityEvent.obtain(i7 == 2 ? 128 : li.f() ? 16384 : 32);
                obtain.setClassName("");
                obtain.setPackageName(gqaVar.d.getPackageName());
                obtain.setEnabled(true);
                obtain.setContentDescription(r6);
                obtain.getText().add(r6);
                if (Build.VERSION.SDK_INT == 24) {
                    obtain.setSource(null);
                } else {
                    if (i7 != 2) {
                        view = gqaVar.j;
                    }
                    obtain.setSource(view);
                }
                try {
                    ((gqa) obj8).c.sendAccessibilityEvent(obtain);
                    return;
                } catch (IllegalStateException e2) {
                    ((ltd) ((ltd) gqa.a.a(hip.a).i(e2)).k("com/google/android/libraries/inputmethod/accessibility/AccessibilityUtils", "lambda$announceInternal$4", 508, "AccessibilityUtils.java")).t("accessibilityManager can't send event when accessibility is not enabled");
                    ieh.j().e(gpv.a, new Object[0]);
                    return;
                }
            case 8:
                ((hmd) this.c).a.g(this.b, this.a);
                return;
            case 9:
                ?? r0 = this.c;
                ?? r13 = this.b;
                int i8 = this.a;
                ltg ltgVar = hpr.a;
                hpw.i(r0, r13, i8);
                return;
            case 10:
                ?? r02 = this.c;
                ?? r14 = this.b;
                int i9 = this.a;
                ltg ltgVar2 = hpr.a;
                hpw.k(r02, r14, 1, null);
                hpw.m(r02, i9, i9);
                return;
            case 11:
                Object obj9 = this.c;
                Object obj10 = this.b;
                int i10 = this.a;
                fma fmaVar = ((idz) obj9).e;
                fmaVar.g.writeLock().lock();
                try {
                    flq flqVar = (flq) fmaVar.k.get(obj10);
                    if (flqVar == null) {
                        fmaVar.g.writeLock().lock();
                        flwVar = new flw(fmaVar, (String) obj10);
                        fmaVar.k.put(obj10, flwVar);
                        fmaVar.g.writeLock().unlock();
                    } else {
                        try {
                            flw flwVar2 = (flw) flqVar;
                            fmaVar.g.writeLock().unlock();
                            flwVar = flwVar2;
                        } catch (ClassCastException e3) {
                            throw new IllegalArgumentException("another type of counter exists with name: " + ((String) obj10), e3);
                        }
                    }
                    flwVar.a(i10, fma.d);
                    return;
                } finally {
                    fmaVar.g.writeLock().unlock();
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((isq) this.c).z(this.b, this.a);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ker.q((Context) this.c, this.a, this.b);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj11 = this.b;
                int i11 = this.a;
                Object obj12 = this.c;
                Layout layout = ((TextView) ((cx) obj11).findViewById(R.id.f65570_resource_name_obfuscated_res_0x7f0b0776)).getLayout();
                if (layout == null) {
                    return;
                }
                ((ScrollView) obj12).scrollTo(0, layout.getLineTop(layout.getLineForOffset(i11)));
                return;
            case 15:
                ((BottomSheetBehavior) this.b).D((View) this.c, this.a, false);
                return;
            default:
                try {
                    if (((nxf) this.b).c(this.a, (Parcel) this.c)) {
                        return;
                    }
                    nxf.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "lambda$transact$0", "A oneway transaction was not understood - ignoring");
                    return;
                } catch (Exception e4) {
                    nxf.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "lambda$transact$0", "A oneway transaction threw - ignoring", (Throwable) e4);
                    return;
                }
        }
    }
}
