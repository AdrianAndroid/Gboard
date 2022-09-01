package defpackage;

import com.google.android.libraries.search.p6glow.AssistantP6GlowView;

/* compiled from: PG */
/* renamed from: kmh  reason: default package */
/* loaded from: classes.dex */
public final class kmh implements ghn {
    final /* synthetic */ AssistantP6GlowView a;
    private final float[] b;

    public kmh(AssistantP6GlowView assistantP6GlowView) {
        this.a = assistantP6GlowView;
        this.b = new float[assistantP6GlowView.p().length];
    }

    @Override // defpackage.ghn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Float[] fArr = (Float[]) obj;
        oll.e(fArr, "value");
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            this.b[i] = fArr[i].floatValue();
        }
        this.a.m(this.b);
    }
}
