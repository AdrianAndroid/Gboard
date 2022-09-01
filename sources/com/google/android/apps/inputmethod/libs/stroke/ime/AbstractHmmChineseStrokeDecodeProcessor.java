package com.google.android.apps.inputmethod.libs.stroke.ime;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractHmmChineseStrokeDecodeProcessor extends AbstractHmmChineseDecodeProcessor {
    private static final Pattern m = Pattern.compile("[hspnz\\*]");
    private final dcv n = new eoy();

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final void D(dim dimVar) {
        dimVar.b = null;
        dimVar.c = null;
        dimVar.e = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    public final did c() {
        did c = super.c();
        c.e = this.n;
        c.f = new eox(0);
        return c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    public final did d(Context context, iav iavVar) {
        did d = super.d(context, iavVar);
        dcv dcvVar = this.n;
        d.e = dcvVar;
        d.f = dcvVar;
        return d;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, defpackage.dji
    public final djf f() {
        return null;
    }

    @Override // defpackage.hlu
    public final boolean o(iay iayVar) {
        return btp.b(iayVar) && m.matcher((String) iayVar.e).matches();
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    protected final boolean p(hfd hfdVar) {
        if (hfdVar.a == iah.DOWN || hfdVar.a == iah.UP) {
            return false;
        }
        iay iayVar = hfdVar.b[0];
        if (o(iayVar)) {
            return R(hfdVar);
        }
        int i = hfdVar.g;
        if (iayVar.c == 67) {
            return W();
        }
        B();
        int i2 = iayVar.c;
        if (i2 != 62) {
            if (i2 == 66) {
                if (!X("ENTER")) {
                    as(null, 1, true);
                    return false;
                }
            } else if (!ab(iayVar) && !Q(iayVar) && !P(iayVar)) {
                return false;
            }
        } else if (!X("SPACE")) {
            as(null, 1, true);
            return false;
        }
        return true;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final boolean q(boolean z) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public final boolean r() {
        return false;
    }
}
