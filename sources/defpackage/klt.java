package defpackage;

import com.google.android.libraries.search.p6glow.AssistantP6GlowView;

/* compiled from: PG */
/* renamed from: klt  reason: default package */
/* loaded from: classes.dex */
public final class klt extends olt {
    final /* synthetic */ okq a;
    final /* synthetic */ AssistantP6GlowView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klt(Object obj, okq okqVar, AssistantP6GlowView assistantP6GlowView) {
        super(obj);
        this.a = okqVar;
        this.b = assistantP6GlowView;
    }

    @Override // defpackage.olt
    protected final void a(ome omeVar, Object obj, Object obj2) {
        oll.e(omeVar, "property");
        if (!oll.g(obj, obj2)) {
            this.a.a(obj2);
            this.b.k();
        }
    }
}
