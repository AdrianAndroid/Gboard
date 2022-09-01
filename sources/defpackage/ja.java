package defpackage;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: ja  reason: default package */
/* loaded from: classes.dex */
public final class ja {
    public ja(rz rzVar) {
        new WeakReference(rzVar);
        rr.o(rzVar.J);
        rr.o(rzVar.K);
        rr.o(rzVar.L);
        rr.o(rzVar.M);
        rr.o(rzVar.N);
    }

    public static TextClassifier a(TextView textView) {
        TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
