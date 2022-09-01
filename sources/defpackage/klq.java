package defpackage;

import com.google.android.libraries.search.p6glow.AssistantP6GlowView;

/* compiled from: PG */
/* renamed from: klq  reason: default package */
/* loaded from: classes.dex */
public final class klq extends olt {
    final /* synthetic */ okq a;
    final /* synthetic */ AssistantP6GlowView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klq(Object obj, okq okqVar, AssistantP6GlowView assistantP6GlowView) {
        super(obj);
        this.a = okqVar;
        this.b = assistantP6GlowView;
    }

    @Override // defpackage.olt
    protected final void a(ome omeVar, Object obj, Object obj2) {
        oll.e(omeVar, "property");
        this.a.a(obj2);
        this.b.k();
    }
}
