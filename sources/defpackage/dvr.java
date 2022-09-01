package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewTreeObserver;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;

/* compiled from: PG */
/* renamed from: dvr  reason: default package */
/* loaded from: classes.dex */
final class dvr implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ AssistantP6GlowView a;
    final /* synthetic */ Context b;

    public dvr(AssistantP6GlowView assistantP6GlowView, Context context) {
        this.a = assistantP6GlowView;
        this.b = context;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.a.getWidth() == 0.0f) {
            return;
        }
        Resources resources = this.b.getResources();
        float dimension = resources.getDimension(R.dimen.f41130_resource_name_obfuscated_res_0x7f0705a0);
        float width = this.a.getWidth() - (dimension + dimension);
        this.a.n((width - resources.getDimension(R.dimen.f41090_resource_name_obfuscated_res_0x7f07059c)) / 2.0f);
        this.a.o(width * 0.3888889f);
    }
}
