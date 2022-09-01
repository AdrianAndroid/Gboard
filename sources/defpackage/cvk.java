package defpackage;

/* compiled from: PG */
/* renamed from: cvk  reason: default package */
/* loaded from: classes.dex */
public enum cvk implements ctc {
    SUCCESS(1),
    SUCCESS_WITH_EMPTY_RESULT(2),
    FILE_NOT_FOUND(3),
    IO_EXCEPTION(4),
    OTHER_EXCEPTION(5),
    SUCCESS_WITH_STALE_RESULT(6),
    SUCCESS_WITH_STALE_EMPTY_RESULT(7);
    
    private final int i;

    cvk(int i) {
        this.i = i;
    }

    @Override // defpackage.ctc
    public final int a() {
        return this.i;
    }
}
