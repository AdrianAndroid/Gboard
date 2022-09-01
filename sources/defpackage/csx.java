package defpackage;

/* compiled from: PG */
/* renamed from: csx  reason: default package */
/* loaded from: classes.dex */
public enum csx implements ctc {
    CONTEXTUAL_BITMOJI_CATEGORY_SUGGESTED(1),
    CONTEXTUAL_BITMOJI_CATEGORY_DROPPED_FEW_RESULTS(2);
    
    private final int d;

    csx(int i) {
        this.d = i;
    }

    @Override // defpackage.ctc
    public final int a() {
        return this.d;
    }
}
