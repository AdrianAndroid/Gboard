package com.google.android.libraries.inputmethod.widgets;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinkableTextView extends AppCompatTextView {
    public jdj a;

    public LinkableTextView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void setContentDescription(CharSequence charSequence) {
    }

    public LinkableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMovementMethod(LinkMovementMethod.getInstance());
        setSpannableFactory(new jbn(new jbm(new jbl(new jbk(new jdh(new bwd(this, 9))))), gwc.h(context)));
    }
}
