package defpackage;

/* compiled from: PG */
/* renamed from: csy  reason: default package */
/* loaded from: classes.dex */
public enum csy implements ctc {
    RENDER_SUCCESS(1),
    RENDER_REQUEST_FAILURE(2),
    LOAD_LIBRARY_FAILURE(3),
    DIR_FAILURE(4),
    RENDER_FAILURE(5);
    
    private final int g;

    csy(int i) {
        this.g = i;
    }

    @Override // defpackage.ctc
    public final int a() {
        return this.g;
    }
}
