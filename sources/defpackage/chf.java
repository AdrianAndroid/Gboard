package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;
import android.view.translation.TranslationResponse;
import android.view.translation.TranslationResponseValue;
import android.view.translation.Translator;
import com.google.android.apps.inputmethod.libs.latin5.LatinIme;
import com.google.android.apps.inputmethod.libs.mozc.ime.SimpleJapaneseIme;
import com.google.android.apps.inputmethod.libs.translate.SystemTranslateProvider;
import com.google.android.libraries.inputmethod.ime.AbstractIme;
import j$.util.Objects;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: chf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class chf implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ chf(Uri uri, int i) {
        this.b = i;
        this.a = uri;
    }

    public /* synthetic */ chf(chg chgVar, int i) {
        this.b = i;
        this.a = chgVar;
    }

    public /* synthetic */ chf(LatinIme latinIme, int i) {
        this.b = i;
        this.a = latinIme;
    }

    public /* synthetic */ chf(SimpleJapaneseIme simpleJapaneseIme, int i) {
        this.b = i;
        this.a = simpleJapaneseIme;
    }

    public /* synthetic */ chf(dnu dnuVar, int i) {
        this.b = i;
        this.a = dnuVar;
    }

    public /* synthetic */ chf(dvw dvwVar, int i) {
        this.b = i;
        this.a = dvwVar;
    }

    public /* synthetic */ chf(eym eymVar, int i) {
        this.b = i;
        this.a = eymVar;
    }

    public /* synthetic */ chf(hci hciVar, int i) {
        this.b = i;
        this.a = hciVar;
    }

    public /* synthetic */ chf(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    public /* synthetic */ chf(ArrayList arrayList, int i) {
        this.b = i;
        this.a = arrayList;
    }

    public /* synthetic */ chf(llk llkVar, int i) {
        this.b = i;
        this.a = llkVar;
    }

    public /* synthetic */ chf(nfh nfhVar, int i) {
        this.b = i;
        this.a = nfhVar;
    }

    public /* synthetic */ chf(rj rjVar, int i) {
        this.b = i;
        this.a = rjVar;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [chg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [eym, java.lang.Object] */
    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((chg) obj).b((Uri) this.a, chh.PENDING);
                return;
            case 1:
                this.a.b((Uri) obj, chh.PENDING);
                return;
            case 2:
                ((chg) obj).b((Uri) this.a, chh.DONE);
                return;
            case 3:
                ((dnu) this.a).b(iwc.CLEARCUT_LOG_EVENT, (mux) obj);
                return;
            case 4:
                ((dnu) this.a).b(iwc.CLEARCUT_LOG_EVENT, (mux) obj);
                return;
            case 5:
                ((dnu) this.a).b(iwc.CLEARCUT_LOG_EVENT, (mux) obj);
                return;
            case 6:
                ((dnu) this.a).b(iwc.CLEARCUT_LOG_EVENT, (mux) obj);
                return;
            case 7:
                ((LatinIme) this.a).E.l(Collections.singletonList((hln) obj), null, false);
                return;
            case 8:
                ((AbstractIme) this.a).gY((hln) obj, true);
                return;
            case 9:
                ((AbstractIme) this.a).gY((hln) obj, true);
                return;
            case 10:
                Context context = (Context) obj;
                this.a.run();
                return;
            case 11:
                fin finVar = (fin) obj;
                nfh nfhVar = (nfh) this.a;
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                fil filVar = (fil) nfhVar.b;
                fil filVar2 = fil.b;
                finVar.getClass();
                nga ngaVar = filVar.a;
                if (!ngaVar.c()) {
                    filVar.a = nfm.H(ngaVar);
                }
                filVar.a.add(finVar);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((llk) this.a).h((fim) obj);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                grd.b(((dvw) this.a).a(), (String) obj);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((ArrayList) this.a).add((String) obj);
                return;
            case 15:
                ?? r0 = this.a;
                TranslationResponse translationResponse = (TranslationResponse) obj;
                ltg ltgVar = SystemTranslateProvider.a;
                if (translationResponse == null) {
                    SystemTranslateProvider.e(r0, SystemTranslateProvider.b);
                    return;
                }
                SparseArray<TranslationResponseValue> translationResponseValues = translationResponse.getTranslationResponseValues();
                if (translationResponse.getTranslationStatus() != 0 || translationResponseValues.size() == 0) {
                    SystemTranslateProvider.e(r0, SystemTranslateProvider.c);
                    return;
                }
                CharSequence text = translationResponseValues.get(0).getText();
                if (text == null) {
                    SystemTranslateProvider.e(r0, SystemTranslateProvider.c);
                    return;
                } else {
                    SystemTranslateProvider.e(r0, new ezr(text.toString()));
                    return;
                }
            case 16:
                ((rj) this.a).c((Translator) obj);
                return;
            case 17:
                hdg hdgVar = (hdg) obj;
                hci hciVar = (hci) this.a;
                int i = hciVar.w;
                if (!hciVar.t.compareAndSet(false, true)) {
                    return;
                }
                hiz f = hdgVar.f();
                afp afpVar = afp.STARTED;
                boolean z = jam.b;
                llk e = llp.e();
                llk e2 = llp.e();
                llk e3 = llp.e();
                e.h(new eii(hciVar, hdgVar, 8));
                e2.h(new hcd(hciVar, i, hdgVar, 1));
                e3.h(new hcd(hciVar, i, hdgVar, 0));
                f.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
                return;
            default:
                ((llk) this.a).h((hdg) obj);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Objects.requireNonNull(consumer);
            case 1:
                return Objects.requireNonNull(consumer);
            case 2:
                return Objects.requireNonNull(consumer);
            case 3:
                return Objects.requireNonNull(consumer);
            case 4:
                return Objects.requireNonNull(consumer);
            case 5:
                return Objects.requireNonNull(consumer);
            case 6:
                return Objects.requireNonNull(consumer);
            case 7:
                return Objects.requireNonNull(consumer);
            case 8:
                return Objects.requireNonNull(consumer);
            case 9:
                return Objects.requireNonNull(consumer);
            case 10:
                return Objects.requireNonNull(consumer);
            case 11:
                return Objects.requireNonNull(consumer);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Objects.requireNonNull(consumer);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return Objects.requireNonNull(consumer);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Objects.requireNonNull(consumer);
            case 15:
                return Objects.requireNonNull(consumer);
            case 16:
                return Objects.requireNonNull(consumer);
            case 17:
                return Objects.requireNonNull(consumer);
            default:
                return Objects.requireNonNull(consumer);
        }
    }
}
