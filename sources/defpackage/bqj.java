package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.latin.keyboard.widget.LatinFixedCountCandidatesHolderView;
import com.google.android.apps.inputmethod.latin.keyboard.widget.LatinPageableCandidatesHolderView;
import com.google.android.apps.inputmethod.latin.preference.VoiceSettingsFragment;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.concurrent.CountDownLatch;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bqj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bqj implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bqj(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public bqj(bpx bpxVar, int i) {
        this.b = i;
        this.a = bpxVar;
    }

    public /* synthetic */ bqj(bsk bskVar, int i) {
        this.b = i;
        this.a = bskVar;
    }

    public /* synthetic */ bqj(bsn bsnVar, int i) {
        this.b = i;
        this.a = bsnVar;
    }

    public /* synthetic */ bqj(bsr bsrVar, int i) {
        this.b = i;
        this.a = bsrVar;
    }

    public bqj(bxm bxmVar, int i) {
        this.b = i;
        this.a = bxmVar;
    }

    public /* synthetic */ bqj(bzv bzvVar, int i) {
        this.b = i;
        this.a = bzvVar;
    }

    public /* synthetic */ bqj(cbm cbmVar, int i) {
        this.b = i;
        this.a = cbmVar;
    }

    public /* synthetic */ bqj(cbo cboVar, int i) {
        this.b = i;
        this.a = cboVar;
    }

    public /* synthetic */ bqj(LatinFixedCountCandidatesHolderView latinFixedCountCandidatesHolderView, int i) {
        this.b = i;
        this.a = latinFixedCountCandidatesHolderView;
    }

    public bqj(LatinPageableCandidatesHolderView latinPageableCandidatesHolderView, int i) {
        this.b = i;
        this.a = latinPageableCandidatesHolderView;
    }

    public /* synthetic */ bqj(VoiceSettingsFragment voiceSettingsFragment, int i) {
        this.b = i;
        this.a = voiceSettingsFragment;
    }

    public /* synthetic */ bqj(Delight5Facilitator delight5Facilitator, int i) {
        this.b = i;
        this.a = delight5Facilitator;
    }

    public /* synthetic */ bqj(hlf hlfVar, int i) {
        this.b = i;
        this.a = hlfVar;
    }

    public /* synthetic */ bqj(CountDownLatch countDownLatch, int i) {
        this.b = i;
        this.a = countDownLatch;
    }

    public /* synthetic */ bqj(ovg ovgVar, int i, byte[] bArr) {
        this.b = i;
        this.a = ovgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bxi bxiVar;
        switch (this.b) {
            case 0:
                LatinFixedCountCandidatesHolderView latinFixedCountCandidatesHolderView = (LatinFixedCountCandidatesHolderView) this.a;
                SoftKeyView j = latinFixedCountCandidatesHolderView.j(latinFixedCountCandidatesHolderView.g);
                if (j == null) {
                    return;
                }
                j.setActivated(true);
                LatinFixedCountCandidatesHolderView.r(j);
                SoftKeyView j2 = latinFixedCountCandidatesHolderView.j(latinFixedCountCandidatesHolderView.g - 1);
                if (j2 == null) {
                    return;
                }
                LatinFixedCountCandidatesHolderView.r(j2);
                return;
            case 1:
                bpw bpwVar = ((bpx) this.a).n;
                if (bpwVar == null) {
                    return;
                }
                bpwVar.i(62, null, " ", null);
                return;
            case 2:
                ((LatinPageableCandidatesHolderView) this.a).J();
                return;
            case 3:
                ((LatinPageableCandidatesHolderView) this.a).B();
                return;
            case 4:
                ((CountDownLatch) this.a).countDown();
                return;
            case 5:
                ((VoiceSettingsFragment) this.a).az(true);
                return;
            case 6:
                ((VoiceSettingsFragment) this.a).az(false);
                return;
            case 7:
                bsk bskVar = (bsk) this.a;
                bskVar.b.v(R.string.f160370_resource_name_obfuscated_res_0x7f140642);
                bskVar.e = null;
                llp b = hqr.b();
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    ((hqt) b.get(i)).r(llp.q());
                }
                return;
            case 8:
                ((bsn) this.a).c();
                return;
            case 9:
                ((bsr) this.a).d();
                return;
            case 10:
                hkq.b((hlf) this.a);
                return;
            case 11:
                Object obj = this.a;
                ((ltd) ((ltd) bwf.a.b()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardScreenshotTooltip", "lambda$createClipboardScreenshotTooltip$2", 127, "ClipboardScreenshotTooltip.java")).t("Clipboard screenshot tooltip displayed");
                ino K = ino.K((Context) obj, null);
                K.i("screenshot_tooltip_shown_count", K.c("screenshot_tooltip_shown_count", 0L) + 1);
                K.i("screenshot_tooltip_latest_display_time", System.currentTimeMillis());
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                hkq.b((hlf) this.a);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((ovg) this.a).a = true;
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (((Boolean) bxn.aK.c()).booleanValue() || (bxiVar = ((bxm) this.a).g) == null) {
                    return;
                }
                bxiVar.d();
                return;
            case 15:
                if (((Boolean) bxn.aK.c()).booleanValue() || ((bxm) this.a).g == null) {
                    return;
                }
                lsz it = bxm.c.iterator();
                while (it.hasNext()) {
                    ((bxm) this.a).g.g((mqc) it.next());
                }
                return;
            case 16:
                ((bzv) this.a).d = gzc.b.d();
                return;
            case 17:
                Delight5Facilitator delight5Facilitator = (Delight5Facilitator) this.a;
                delight5Facilitator.w();
                delight5Facilitator.h.o();
                return;
            case 18:
                Delight5Facilitator delight5Facilitator2 = (Delight5Facilitator) this.a;
                delight5Facilitator2.w();
                delight5Facilitator2.h.o();
                return;
            case 19:
                ((cbm) this.a).b.c();
                return;
            default:
                ((cbo) this.a).b.c();
                return;
        }
    }
}
