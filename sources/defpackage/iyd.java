package defpackage;

/* compiled from: PG */
/* renamed from: iyd  reason: default package */
/* loaded from: classes.dex */
public enum iyd implements ids {
    TYPING_INTERVAL("TypingInterval.Tap"),
    SELECT_CANDIDATE_INTERVAL("TypingInterval.SelectCandidate");
    
    private final String d;
    private final int e = -1;

    iyd(String str) {
        this.d = str;
    }

    @Override // defpackage.idt
    public final int a() {
        return this.e;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.d;
    }
}
