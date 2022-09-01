package defpackage;

/* compiled from: PG */
/* renamed from: omv  reason: default package */
/* loaded from: classes2.dex */
public enum omv implements omq {
    IGNORE_CASE(2),
    MULTILINE(8),
    LITERAL(16),
    UNIX_LINES(1),
    COMMENTS(4),
    DOT_MATCHES_ALL(32),
    CANON_EQ(128);
    
    private final int i;

    omv(int i) {
        this.i = i;
    }

    @Override // defpackage.omq
    public final int a() {
        return this.i;
    }
}
