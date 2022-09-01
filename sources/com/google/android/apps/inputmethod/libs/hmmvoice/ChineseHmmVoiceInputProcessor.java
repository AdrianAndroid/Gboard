package com.google.android.apps.inputmethod.libs.hmmvoice;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ChineseHmmVoiceInputProcessor extends HmmVoiceInputProcessor {
    obc d;
    private jav g;
    private static final lug f = hin.a;
    protected static final jav a = jav.e("zh_CN");
    protected static final jav b = jav.e("zh_TW");
    protected static final jav c = jav.e("zh_HK");

    protected final int a() {
        ino M = ino.M(this.e);
        if (a.equals(this.g)) {
            return M.aj(R.string.f160950_resource_name_obfuscated_res_0x7f14067f) ? 2 : 1;
        } else if (b.equals(this.g)) {
            return M.aj(R.string.f160970_resource_name_obfuscated_res_0x7f140681) ? 1 : 2;
        } else if (c.equals(this.g)) {
            return M.aj(R.string.f160960_resource_name_obfuscated_res_0x7f140680) ? 1 : 3;
        } else {
            ((luc) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmmvoice/ChineseHmmVoiceInputProcessor", "getDisplayLocale", 84, "ChineseHmmVoiceInputProcessor.java")).w("Language %s not supported", this.g);
            return 1;
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.hmmvoice.HmmVoiceInputProcessor, defpackage.hnj
    public final void ad(Context context, gwv gwvVar, iav iavVar) {
        super.ad(context, gwvVar, iavVar);
        hrx.y(context);
        hqt b2 = hqp.b();
        this.g = b2 == null ? null : b2.i();
        this.d = new obc(c(), a());
    }

    protected final int c() {
        if (a.equals(this.g)) {
            return 1;
        }
        if (b.equals(this.g)) {
            return 2;
        }
        if (c.equals(this.g)) {
            return 3;
        }
        ((luc) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmmvoice/ChineseHmmVoiceInputProcessor", "getInternalLocale", 64, "ChineseHmmVoiceInputProcessor.java")).w("Language %s not supported", this.g);
        return 1;
    }

    @Override // com.google.android.apps.inputmethod.libs.hmmvoice.HmmVoiceInputProcessor
    protected final String d(String str) {
        obc obcVar = this.d;
        return obcVar != null ? obcVar.h(str) : str;
    }

    @Override // com.google.android.apps.inputmethod.libs.hmmvoice.HmmVoiceInputProcessor
    public final void e() {
        super.e();
        obc obcVar = this.d;
        if (obcVar != null) {
            obcVar.k(c(), a());
        }
    }
}
