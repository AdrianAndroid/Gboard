package defpackage;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import com.google.android.apps.inputmethod.libs.proactivesuggestion.ProactiveSuggestionsClippableHolderView;

/* compiled from: PG */
/* renamed from: dyj  reason: default package */
/* loaded from: classes.dex */
public final class dyj implements View.OnScrollChangeListener {
    final /* synthetic */ ProactiveSuggestionsClippableHolderView a;

    public dyj(ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView) {
        this.a = proactiveSuggestionsClippableHolderView;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        HorizontalScrollView horizontalScrollView;
        ImageView imageView;
        ImageView imageView2;
        ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView = this.a;
        if (proactiveSuggestionsClippableHolderView.f == null || (horizontalScrollView = proactiveSuggestionsClippableHolderView.g) == null || (imageView = proactiveSuggestionsClippableHolderView.h) == null || (imageView2 = proactiveSuggestionsClippableHolderView.i) == null) {
            return;
        }
        ProactiveSuggestionsClippableHolderView.i(imageView, imageView2, i, horizontalScrollView.getWidth(), this.a.f.getWidth());
    }
}
