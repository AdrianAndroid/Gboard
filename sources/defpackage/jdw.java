package defpackage;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import com.google.android.libraries.inputmethod.widgets.TransformationTextView;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jdw  reason: default package */
/* loaded from: classes.dex */
public final class jdw {
    public static final jdw a = new jdw();
    public final Set b;
    public final TransformationMethod c = new jdu(0);

    public jdw() {
        lox loxVar = new lox();
        loxVar.f(lpn.WEAK);
        this.b = Collections.newSetFromMap(loxVar.e());
        hdn.instance.i(new jdv(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CharSequence a(CharSequence charSequence, Class cls) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        Object[] spans = spanned.getSpans(0, spanned.length(), cls);
        int length = spans.length;
        if (length == 0) {
            return charSequence;
        }
        if (spanned.getSpans(0, spanned.length(), Object.class).length == length) {
            return charSequence.toString();
        }
        SpannableString spannableString = new SpannableString(spanned);
        for (Object obj : spans) {
            spannableString.removeSpan(obj);
        }
        return spannableString;
    }

    public final void b() {
        for (TextView textView : this.b) {
            if (textView != null) {
                if (textView.getTransformationMethod() != this.c) {
                    ((luc) TransformationTextView.r.a(hip.a).k("com/google/android/libraries/inputmethod/widgets/TransformationTextView$TransformationHelper", "notifyAllTextViews", 201, "TransformationTextView.java")).w("TransformationMethod (%s) overrode label transformation", textView.getTransformationMethod());
                    textView.setTransformationMethod(this.c);
                }
                textView.setText(textView.getText());
            }
        }
    }
}
