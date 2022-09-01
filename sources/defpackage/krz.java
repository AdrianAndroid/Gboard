package defpackage;

import android.view.View;
import android.widget.ScrollView;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* renamed from: krz  reason: default package */
/* loaded from: classes.dex */
public final class krz extends yd {
    final /* synthetic */ AppBarLayout.BaseBehavior a;

    public krz(AppBarLayout.BaseBehavior baseBehavior) {
        this.a = baseBehavior;
    }

    @Override // defpackage.yd
    public final void b(View view, abj abjVar) {
        super.b(view, abjVar);
        abjVar.l(this.a.d);
        abjVar.h(ScrollView.class.getName());
    }
}
