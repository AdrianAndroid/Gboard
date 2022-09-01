package defpackage;

import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ffm  reason: default package */
/* loaded from: classes.dex */
public final class ffm extends hst {
    final /* synthetic */ ffn a;

    public ffm(ffn ffnVar) {
        this.a = ffnVar;
    }

    @Override // defpackage.hst
    public final void a() {
        Runnable runnable = this.a.c;
        if (runnable != null) {
            kki.k(runnable);
            this.a.c = null;
        }
    }

    @Override // defpackage.hst
    public final void b(EditorInfo editorInfo, EditorInfo editorInfo2, boolean z) {
        hqt b;
        final ffn ffnVar = this.a;
        if (editorInfo2 != null) {
            editorInfo = editorInfo2;
        }
        ffh ffhVar = ffnVar.g;
        ffhVar.c = 0L;
        if (lre.aG(ffhVar.b, editorInfo)) {
            ffhVar.c(mey.HIDDEN_SETTING_OFF);
            ffh.b(mey.HIDDEN_SETTING_OFF);
        }
        if (z) {
            ffhVar.c(mey.HIDDEN_INCOGNITO_MODE);
            ffh.b(mey.HIDDEN_INCOGNITO_MODE);
        }
        if (ham.aq(ffhVar.b, editorInfo)) {
            ffhVar.c(mey.HIDDEN_EDITOR_NO_MIC_IME_OPTION);
            ffh.b(mey.HIDDEN_EDITOR_NO_MIC_IME_OPTION);
        }
        if (ham.G(editorInfo)) {
            ffhVar.c(mey.HIDDEN_EMAIL_INPUT_TYPE);
            ffh.b(mey.HIDDEN_EMAIL_INPUT_TYPE);
        }
        if (ham.V(editorInfo)) {
            ffhVar.c(mey.HIDDEN_PASSWORD_NUMBER_DATE_INPUT_TYPE);
            ffh.b(mey.HIDDEN_PASSWORD_NUMBER_DATE_INPUT_TYPE);
        }
        if (ffhVar.c == 0) {
            ffhVar.c(mey.AVAILABLE);
            ffh.b(mey.AVAILABLE);
        } else {
            ((ltd) ((ltd) ffh.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/extension/CurrentMicStatusHolder", "onStartInputView", 79, "CurrentMicStatusHolder.java")).w("Current Mic status = %s", ffhVar.a());
        }
        boolean z2 = false;
        if (!ham.aw(ffnVar.d, editorInfo)) {
            ((ltd) ((ltd) ffn.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/extension/VoiceImeExtension", "shouldStartVoiceInputAutomatically", 382, "VoiceImeExtension.java")).t("No private IME option set to start voice input.");
        } else {
            String m = ham.m(editorInfo);
            if (TextUtils.isEmpty(m)) {
                ((ltd) ((ltd) ffn.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/extension/VoiceImeExtension", "shouldStartVoiceInputAutomatically", 387, "VoiceImeExtension.java")).t("Empty app package name. Voice input will not start.");
            } else if (ffnVar.h.j(m)) {
                fbr.i("auto start voice");
                ieh.j().e(fbm.DIRECT_TO_DICTATION_MODE_TRIGGERED, new Object[0]);
                return;
            }
        }
        if (editorInfo2 != null || !ffnVar.e() || ffnVar.i) {
            return;
        }
        if (((Boolean) fbh.b.c()).booleanValue() && (b = hqp.b()) != null && "en-IN".equals(b.i().n)) {
            z2 = true;
        }
        hkr a = hkt.a();
        a.d(R.layout.f147110_resource_name_obfuscated_res_0x7f0e0614);
        a.i(ffnVar.d.getString(z2 ? R.string.f163190_resource_name_obfuscated_res_0x7f14076c : R.string.f188170_resource_name_obfuscated_res_0x7f1411ab));
        a.e("tag_voice_promo_notice");
        a.f(ffn.b);
        a.g(1);
        a.a = new fci(ffnVar, 8);
        a.b = new fci(ffnVar, 9);
        a.e = new bdx(ffnVar, z2, 2);
        a.c = new bdx(ffnVar, z2, 3);
        a.f = new hks() { // from class: ffj
            @Override // defpackage.hks
            public final boolean a() {
                ffn ffnVar2 = ffn.this;
                if (!ffnVar2.e() || !ffnVar2.f.q() || !ffnVar2.f.n()) {
                    return false;
                }
                int b2 = ffnVar2.e.b("voice_promo_notice_diaplay_times", 0);
                if (b2 == 0) {
                    if (jam.r(ffnVar2.d)) {
                        return false;
                    }
                    b2 = 0;
                }
                hpy b3 = hqj.b();
                if (b3 != null && b3.e()) {
                    return false;
                }
                ffnVar2.e.h("voice_promo_notice_diaplay_times", b2 + 1);
                return true;
            }
        };
        hkv.b(a.a());
    }
}
