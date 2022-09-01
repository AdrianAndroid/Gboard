package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: PG */
/* renamed from: kuu  reason: default package */
/* loaded from: classes.dex */
public final class kuu extends yd {
    final /* synthetic */ CheckableImageButton a;

    public kuu(CheckableImageButton checkableImageButton) {
        this.a = checkableImageButton;
    }

    @Override // defpackage.yd
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }

    @Override // defpackage.yd
    public final void b(View view, abj abjVar) {
        super.b(view, abjVar);
        abjVar.g(this.a.b);
        abjVar.b.setChecked(this.a.a);
    }
}
