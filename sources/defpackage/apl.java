package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: apl  reason: default package */
/* loaded from: classes.dex */
public final class apl implements apo {
    private final ape a;
    private final ape b;

    public apl(ape apeVar, ape apeVar2) {
        this.a = apeVar;
        this.b = apeVar2;
    }

    @Override // defpackage.apo
    public final aoh a() {
        return new aos(this.a.a(), this.b.a());
    }

    @Override // defpackage.apo
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.apo
    public final boolean c() {
        return this.a.c() && this.b.c();
    }
}
