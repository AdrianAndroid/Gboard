package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ee  reason: default package */
/* loaded from: classes.dex */
public final class ee extends aan {
    final /* synthetic */ eh a;

    public ee(eh ehVar) {
        this.a = ehVar;
    }

    @Override // defpackage.aan, defpackage.aam
    public final void a() {
        View view;
        eh ehVar = this.a;
        if (ehVar.k && (view = ehVar.f) != null) {
            view.setTranslationY(0.0f);
            this.a.c.setTranslationY(0.0f);
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        eh ehVar2 = this.a;
        ehVar2.m = null;
        fl flVar = ehVar2.i;
        if (flVar != null) {
            flVar.a(ehVar2.h);
            ehVar2.h = null;
            ehVar2.i = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.a.b;
        if (actionBarOverlayLayout != null) {
            aad.K(actionBarOverlayLayout);
        }
    }
}
