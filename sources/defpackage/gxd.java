package defpackage;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.ime.processor.AppCompletionsProcessor;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: gxd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gxd implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gxd(AppCompletionsProcessor appCompletionsProcessor, int i) {
        this.b = i;
        this.a = appCompletionsProcessor;
    }

    public /* synthetic */ gxd(gxe gxeVar, int i) {
        this.b = i;
        this.a = gxeVar;
    }

    public /* synthetic */ gxd(gxl gxlVar, int i) {
        this.b = i;
        this.a = gxlVar;
    }

    public gxd(gyk gykVar, int i) {
        this.b = i;
        this.a = gykVar;
    }

    public /* synthetic */ gxd(hci hciVar, int i) {
        this.b = i;
        this.a = hciVar;
    }

    public /* synthetic */ gxd(hkb hkbVar, int i) {
        this.b = i;
        this.a = hkbVar;
    }

    public gxd(hlj hljVar, int i) {
        this.b = i;
        this.a = hljVar;
    }

    public /* synthetic */ gxd(hls hlsVar, int i) {
        this.b = i;
        this.a = hlsVar;
    }

    public /* synthetic */ gxd(hoe hoeVar, int i) {
        this.b = i;
        this.a = hoeVar;
    }

    public /* synthetic */ gxd(RuntimeException runtimeException, int i) {
        this.b = i;
        this.a = runtimeException;
    }

    public /* synthetic */ gxd(lls llsVar, int i) {
        this.b = i;
        this.a = llsVar;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, hlq] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, hlq] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, hlq] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, hlq] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, hlq] */
    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.b) {
            case 0:
                ((gxe) this.a).a();
                return;
            case 1:
                ((gxe) this.a).b();
                return;
            case 2:
                ((gxl) this.a).a.cancel(false);
                return;
            case 3:
                Object obj = this.a;
                int i = gxn.b;
                throw ((Throwable) obj);
            case 4:
                ((gyk) this.a).a = false;
                ((gyj) this.a).t();
                return;
            case 5:
                ((hci) this.a).f();
                return;
            case 6:
                hci hciVar = (hci) this.a;
                hdj c = hciVar.c();
                if (c == null) {
                    ((ltd) ((ltd) hci.a.d()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "onSwitchRecentCategory", 989, "EmojiPickerController.java")).t("next emoji provider is not available. ");
                    return;
                }
                c.f();
                hciVar.d.set(c);
                hiz r = hyq.r(hciVar.o, (hdj) hciVar.d.get(), hciVar.l, hciVar.u, hciVar.f);
                afp afpVar = afp.STARTED;
                boolean z = jam.b;
                llk e = llp.e();
                llk e2 = llp.e();
                llk e3 = llp.e();
                e.h(new ehz(hciVar, 9));
                r.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
                return;
            case 7:
                Object obj2 = this.a;
                ltg ltgVar = hhu.a;
                for (Map.Entry entry : ((lls) obj2).l().entrySet()) {
                    ((hho) entry.getKey()).gW((Set) entry.getValue());
                }
                return;
            case 8:
                ((hkb) this.a).c();
                return;
            case 9:
                hlj hljVar = (hlj) this.a;
                hljVar.g = false;
                hljVar.j = null;
                hljVar.e.k();
                return;
            case 10:
                this.a.hW();
                return;
            case 11:
                this.a.B();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                this.a.D();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                this.a.G();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                this.a.x();
                return;
            case 15:
                ((AppCompletionsProcessor) this.a).a(null);
                return;
            case 16:
                ((hoe) this.a).R = SystemClock.elapsedRealtime();
                return;
            case 17:
                hoe hoeVar = (hoe) this.a;
                if (hoeVar.R <= 0) {
                    return;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime() - hoeVar.R;
                if (hoeVar.W && elapsedRealtime >= ((Long) hof.n.c()).longValue()) {
                    int i2 = hoeVar.F + 1;
                    hoeVar.F = i2;
                    hoeVar.l.h("pref_key_inline_suggestion_tooltip_v2_chip_shown_count", i2);
                    hoeVar.l.i("pref_key_inline_suggestion_tooltip_v2_chip_last_shown_ms", System.currentTimeMillis());
                    hoeVar.W = false;
                }
                ieh.j().g(hok.PROMO_TOOLTIP_V2_CHIP_DURATION, elapsedRealtime);
                hoeVar.R = 0L;
                return;
            case 18:
                hoe hoeVar2 = (hoe) this.a;
                hoeVar2.B = true;
                hoeVar2.m();
                int i3 = hoeVar2.D + 1;
                hoeVar2.D = i3;
                hoeVar2.l.h("pref_key_inline_suggestion_tooltip_shown_count", i3);
                hoeVar2.l.i("pref_key_inline_suggestion_tooltip_last_shown_ms", System.currentTimeMillis());
                return;
            case 19:
                ((hoe) this.a).l(hok.PROMO_TOOLTIP_DURATION);
                return;
            default:
                hoe hoeVar3 = (hoe) this.a;
                hoeVar3.B = true;
                if (hoeVar3.U == null) {
                    hoeVar3.U = LayoutInflater.from(hoeVar3.k).inflate(R.layout.f133590_resource_name_obfuscated_res_0x7f0e0037, (ViewGroup) hoeVar3.V, false);
                }
                hoeVar3.U.setOnTouchListener(cnn.e);
                hoeVar3.U.setOnClickListener(bwk.k);
                imn imnVar = hoeVar3.Q;
                if (imnVar != null && (view = hoeVar3.P) != null) {
                    imnVar.e(hoeVar3.U, view, 1024, 0, 0, null);
                }
                hoeVar3.m();
                int i4 = hoeVar3.E + 1;
                hoeVar3.E = i4;
                hoeVar3.l.h("pref_key_inline_suggestion_tooltip_v2_shown_count", i4);
                hoeVar3.l.i("pref_key_inline_suggestion_tooltip_v2_last_shown_ms", System.currentTimeMillis());
                return;
        }
    }
}
