package defpackage;

import com.google.android.libraries.search.p6glow.AssistantP6GlowView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kly  reason: default package */
/* loaded from: classes.dex */
public final class kly implements ghn {
    final /* synthetic */ klz a;

    public kly(klz klzVar) {
        this.a = klzVar;
    }

    @Override // defpackage.ghn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Float f = (Float) obj;
        AssistantP6GlowView assistantP6GlowView = this.a.a;
        oll.d(f, "it");
        assistantP6GlowView.setAlpha(f.floatValue());
    }
}
