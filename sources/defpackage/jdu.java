package defpackage;

import android.graphics.Rect;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: PG */
/* renamed from: jdu  reason: default package */
/* loaded from: classes.dex */
public final class jdu implements TransformationMethod {
    private final /* synthetic */ int a;

    public jdu(int i) {
        this.a = i;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (this.a == 0) {
            adq b = hdn.instance.b();
            if (TextUtils.isEmpty(charSequence) || b == null) {
                return charSequence;
            }
            hdl hdlVar = hdn.instance.h;
            if (!hdlVar.b()) {
                return jdw.a(charSequence, adt.class);
            }
            int length = charSequence.length();
            return b.c(charSequence, 0, length, length, true != hdlVar.c ? 2 : 1);
        }
        if (charSequence != null) {
            charSequence = SingleLineTransformationMethod.getInstance().getTransformation(charSequence, view);
        }
        CharSequence charSequence2 = charSequence;
        hdn hdnVar = hdn.instance;
        adq b2 = hdnVar.b();
        if (TextUtils.isEmpty(charSequence2) || b2 == null) {
            return charSequence2;
        }
        hdl hdlVar2 = hdnVar.h;
        int length2 = charSequence2.length();
        return b2.c(charSequence2, 0, length2, length2, true != hdlVar2.c ? 2 : 1);
    }
}
