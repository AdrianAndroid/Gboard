package defpackage;

/* compiled from: PG */
/* renamed from: luk  reason: default package */
/* loaded from: classes.dex */
public enum luk {
    GENERAL(true),
    BOOLEAN(false),
    CHARACTER(false),
    INTEGRAL(false),
    FLOAT(true);
    
    public final boolean f;

    luk(boolean z) {
        this.f = z;
    }
}
