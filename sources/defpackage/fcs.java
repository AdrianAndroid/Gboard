package defpackage;

import android.content.Context;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: fcs  reason: default package */
/* loaded from: classes.dex */
public final class fcs implements fet {
    private static final lfy b = lfy.c(',');
    lmz a;
    private final hhk c;

    public fcs() {
        bvl bvlVar = new bvl(this, 18);
        this.c = bvlVar;
        c(ffa.g);
        ffa.g.e(bvlVar);
    }

    @Override // defpackage.fet
    public final fex a(Context context, ffd ffdVar) {
        if (!b(context, ffdVar)) {
            return null;
        }
        return new fcv(context);
    }

    @Override // defpackage.fet
    public final boolean b(Context context, ffd ffdVar) {
        jav javVar;
        return SpeechRecognizer.isOnDeviceRecognitionAvailable(context) && ((Boolean) ffa.f.c()).booleanValue() && (javVar = ffdVar.a) != null && this.a.contains(javVar.n);
    }

    public final void c(hhl hhlVar) {
        String str = (String) hhlVar.c();
        if (TextUtils.isEmpty(str)) {
            this.a = lrr.a;
        } else {
            this.a = lmz.p(b.k(str));
        }
    }
}
