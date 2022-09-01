package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: dox  reason: default package */
/* loaded from: classes.dex */
public final class dox {
    private static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/latin5/handler/keyprediction/KeyPredictionLayoutHelper");
    public final jde a;
    public final SparseIntArray b = new SparseIntArray();
    public final SparseArray c = new SparseArray();

    public dox(jde jdeVar) {
        this.a = jdeVar;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(SoftKeyView softKeyView) {
        iay e = softKeyView.e();
        if (e == null) {
            ((ltd) ((ltd) d.c()).k("com/google/android/apps/inputmethod/libs/latin5/handler/keyprediction/KeyPredictionLayoutHelper", "isSpaceCommaPeriod", 95, "KeyPredictionLayoutHelper.java")).w("isSpaceCommaPeriod() : keyData for key %s is null", softKeyView);
            return false;
        }
        int i = e.c;
        return i == 62 || i == 56 || i == 55 || i == 74 || i == 75;
    }

    public final void a() {
        this.b.clear();
        this.c.clear();
        int size = this.a.a.size();
        for (int i = 0; i < size; i++) {
            ial c = ((SoftKeyView) this.a.a.valueAt(i)).c(iah.PRESS);
            if (c != null) {
                iay d2 = c.d();
                int a = ccn.a(d2);
                if (a > 0) {
                    this.b.put(i, Character.toLowerCase(a));
                }
                String c2 = ccn.c(d2);
                if (!TextUtils.isEmpty(c2)) {
                    this.c.put(i, c2.toLowerCase(Locale.ROOT));
                }
            }
        }
    }
}
