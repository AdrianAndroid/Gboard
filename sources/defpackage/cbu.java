package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: cbu  reason: default package */
/* loaded from: classes.dex */
public final class cbu implements mix {
    private static final lug a = lug.i("Delight5Facilitator");
    private final Delight5Facilitator b;
    private final dlr c;

    public cbu(Context context, Delight5Facilitator delight5Facilitator) {
        this.b = delight5Facilitator;
        this.c = dlr.b(context);
    }

    @Override // defpackage.mix
    public final mko a() {
        ((luc) ((luc) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/KeyCorrectionTfliteModelLoader", "call", 29, "KeyCorrectionTfliteModelLoader.java")).t("Running Key Correction Tflite Model loader");
        ArrayList arrayList = new ArrayList();
        if (((Boolean) cas.w.c()).booleanValue()) {
            String d = this.c.d();
            if (d != null) {
                arrayList.add(this.b.h.b(cbw.d(mvl.TFLITE_KEY_CORRECTION, d, this.b.q())));
            }
            String c = this.c.c();
            if (c != null) {
                arrayList.add(this.b.h.b(cbw.d(mvl.TFLITE_COMMON_KEY_CORRECTION, c, this.b.q())));
            }
            String e = this.c.e();
            if (e != null) {
                arrayList.add(this.b.h.b(cbw.d(mvl.TFLITE_SPACEBAR_CORRECTION, e, this.b.q())));
            }
        }
        return hiz.K(arrayList).f();
    }
}
