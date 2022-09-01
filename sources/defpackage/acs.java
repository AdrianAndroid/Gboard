package defpackage;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: acs  reason: default package */
/* loaded from: classes.dex */
public final class acs {
    static PrecomputedText.Params a(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static void b(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    static String[] c(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }
}
