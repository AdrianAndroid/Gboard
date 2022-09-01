package defpackage;

/* compiled from: PG */
/* renamed from: beq  reason: default package */
/* loaded from: classes.dex */
public enum beq {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);
    
    public final boolean f;

    beq(boolean z) {
        this.f = z;
    }
}
