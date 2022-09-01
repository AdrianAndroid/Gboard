package defpackage;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.google.android.apps.inputmethod.libs.proactivesuggestion.ProactiveSuggestionsClippableHolderView;
import com.google.android.apps.inputmethod.libs.search.contentsuggestion.ContentSuggestionKeyboard;
import com.google.android.inputmethod.latin.R;
import java.util.Iterator;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: dvd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dvd implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dvd(ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView, int i) {
        this.b = i;
        this.a = proactiveSuggestionsClippableHolderView;
    }

    public /* synthetic */ dvd(ContentSuggestionKeyboard contentSuggestionKeyboard, int i) {
        this.b = i;
        this.a = contentSuggestionKeyboard;
    }

    public /* synthetic */ dvd(dat datVar, int i) {
        this.b = i;
        this.a = datVar;
    }

    public /* synthetic */ dvd(duz duzVar, int i) {
        this.b = i;
        this.a = duzVar;
    }

    public /* synthetic */ dvd(dvf dvfVar, int i) {
        this.b = i;
        this.a = dvfVar;
    }

    public /* synthetic */ dvd(dvt dvtVar, int i) {
        this.b = i;
        this.a = dvtVar;
    }

    public /* synthetic */ dvd(dvu dvuVar, int i) {
        this.b = i;
        this.a = dvuVar;
    }

    public /* synthetic */ dvd(dvw dvwVar, int i) {
        this.b = i;
        this.a = dvwVar;
    }

    public /* synthetic */ dvd(dwi dwiVar, int i) {
        this.b = i;
        this.a = dwiVar;
    }

    public /* synthetic */ dvd(dwq dwqVar, int i) {
        this.b = i;
        this.a = dwqVar;
    }

    public /* synthetic */ dvd(dxa dxaVar, int i) {
        this.b = i;
        this.a = dxaVar;
    }

    public /* synthetic */ dvd(dxi dxiVar, int i) {
        this.b = i;
        this.a = dxiVar;
    }

    public /* synthetic */ dvd(dxm dxmVar, int i) {
        this.b = i;
        this.a = dxmVar;
    }

    public /* synthetic */ dvd(dyk dykVar, int i) {
        this.b = i;
        this.a = dykVar;
    }

    public /* synthetic */ dvd(eac eacVar, int i) {
        this.b = i;
        this.a = eacVar;
    }

    public /* synthetic */ dvd(eae eaeVar, int i) {
        this.b = i;
        this.a = eaeVar;
    }

    public /* synthetic */ dvd(ge geVar, int i, byte[] bArr) {
        this.b = i;
        this.a = geVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mko g;
        HorizontalScrollView horizontalScrollView;
        SurfaceView surfaceView;
        switch (this.b) {
            case 0:
                dvf dvfVar = (dvf) this.a;
                dvj b = dvfVar.d.b();
                nfh t = bkp.b.t();
                boolean z = b.f;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((bkp) t.b).a = z;
                bkp bkpVar = (bkp) t.cz();
                dur durVar = dvfVar.c;
                bkl a = durVar.a();
                nfh t2 = bkq.k.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                bkq bkqVar = (bkq) t2.b;
                a.getClass();
                bkqVar.a = a;
                bkqVar.b = cf.l(b.g);
                int i = true != b.e ? 3 : 4;
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                ((bkq) t2.b).h = i - 2;
                int length = b.c.length();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                ((bkq) t2.b).c = length;
                bkt c = dur.c(dur.d(b.b));
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                c.getClass();
                ((bkq) t2.b).d = c;
                bkt c2 = dur.c(b.d);
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                c2.getClass();
                ((bkq) t2.b).e = c2;
                bkt c3 = dur.c(b.c);
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                c3.getClass();
                ((bkq) t2.b).f = c3;
                bkt c4 = dur.c(dur.d(b.c));
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                c4.getClass();
                ((bkq) t2.b).g = c4;
                kcq kcqVar = (kcq) durVar.f.get();
                if (kcqVar != null) {
                    g = kcu.K(kcqVar);
                } else {
                    g = mio.g(kcu.O(new bof(durVar, 19), durVar.c), new cus(durVar, 15), durVar.c);
                }
                dtx.a("Starting oration.", mio.h(mkh.q(mhu.g(mio.g(mkh.q(g), new crj(durVar, t2, a, 3), durVar.c), Throwable.class, new cus(t2, 14), durVar.c)), new dvb(dvfVar, bkpVar, 0), dvfVar.f));
                return;
            case 1:
                duz duzVar = (duz) this.a;
                duzVar.a();
                duzVar.e();
                return;
            case 2:
                ((dvt) this.a).c();
                return;
            case 3:
                ((dvu) this.a).a();
                return;
            case 4:
                dvw dvwVar = (dvw) this.a;
                dvwVar.a.e(dvwVar.c);
                return;
            case 5:
                ((dwi) this.a).a();
                return;
            case 6:
                ((dwi) this.a).d();
                return;
            case 7:
                ((dwi) this.a).c();
                return;
            case 8:
                dwq dwqVar = (dwq) this.a;
                dwj dwjVar = dwqVar.b;
                if (dwjVar == null || dwqVar.c == null) {
                    return;
                }
                dwjVar.f();
                return;
            case 9:
                Object obj = this.a;
                ((ltd) ((ltd) dxa.a.b()).k("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerController", "onAutoDetectSelected", 373, "NgaLanguagePickerController.java")).t("Selected \"Basic dictation\" from language picker.");
                dxa dxaVar = (dxa) obj;
                dxaVar.c();
                if (dxaVar.e == null) {
                    ((ltd) ((ltd) dxa.a.b()).k("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerController", "onAutoDetectSelected", 376, "NgaLanguagePickerController.java")).t("Dictation is already auto-detecting language. Nothing to do.");
                    return;
                }
                ((ltd) ((ltd) dxa.a.b()).k("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerController", "onAutoDetectSelected", 379, "NgaLanguagePickerController.java")).t("Switching to basic dictation.");
                dwv a2 = dwv.a();
                Context context = dxaVar.b;
                hrx.y(context);
                hqt b2 = hqp.b();
                if (b2 == null) {
                    ((ltd) ((ltd) dwv.a.c()).k("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerActionHandler", "switchToBasicDictationAndRestart", 104, "NgaLanguagePickerActionHandler.java")).t("Unable to switch to basic dictation: No current input method entry!");
                    return;
                }
                dwv.c();
                dwv.d(context, true);
                a2.b(b2, fgt.NON_ELIGIBLE_LANGUAGE_AUTO_DETECT_NOT_SUPPORTED);
                return;
            case 10:
                ((dxa) ((ge) this.a).a).c();
                return;
            case 11:
                dxi dxiVar = (dxi) this.a;
                dxm dxmVar = dxiVar.b;
                if (dxmVar == null || !dxmVar.n()) {
                    return;
                }
                gqa.a(dxiVar.a).g(R.string.f154460_resource_name_obfuscated_res_0x7f140370, new Object[0]);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((imo) this.a).m();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView = (ProactiveSuggestionsClippableHolderView) this.a;
                Iterator it = proactiveSuggestionsClippableHolderView.b.iterator();
                while (it.hasNext()) {
                    proactiveSuggestionsClippableHolderView.j((View) it.next(), null);
                }
                proactiveSuggestionsClippableHolderView.b.clear();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                HorizontalScrollView horizontalScrollView2 = ((ProactiveSuggestionsClippableHolderView) this.a).g;
                if (horizontalScrollView2 == null) {
                    return;
                }
                horizontalScrollView2.fullScroll(66);
                return;
            case 15:
                ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView2 = (ProactiveSuggestionsClippableHolderView) this.a;
                LinearLayout linearLayout = proactiveSuggestionsClippableHolderView2.f;
                if (linearLayout == null || linearLayout.getChildCount() <= 0 || (horizontalScrollView = proactiveSuggestionsClippableHolderView2.g) == null || horizontalScrollView.getWidth() != 0) {
                    return;
                }
                proactiveSuggestionsClippableHolderView2.g.requestLayout();
                return;
            case 16:
                dyk dykVar = (dyk) this.a;
                ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView3 = dykVar.a;
                if (!proactiveSuggestionsClippableHolderView3.o || (surfaceView = proactiveSuggestionsClippableHolderView3.d) == null) {
                    return;
                }
                surfaceView.setVisibility(8);
                dykVar.a.o = false;
                return;
            case 17:
                ContentSuggestionKeyboard contentSuggestionKeyboard = (ContentSuggestionKeyboard) this.a;
                if (contentSuggestionKeyboard.e.get() != mdi.NO_SUGGESTIONS_ERROR) {
                    return;
                }
                contentSuggestionKeyboard.l(mdi.ZERO);
                return;
            case 18:
                dzu.d((dat) this.a);
                return;
            case 19:
                eac eacVar = (eac) this.a;
                if (eacVar.a.get() != mdi.NO_SUGGESTIONS_ERROR) {
                    return;
                }
                eacVar.a(mdi.ZERO);
                return;
            default:
                eae eaeVar = (eae) this.a;
                eaeVar.a = false;
                eaeVar.b.run();
                return;
        }
    }
}
