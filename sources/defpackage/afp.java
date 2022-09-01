package defpackage;

/* compiled from: PG */
/* renamed from: afp  reason: default package */
/* loaded from: classes.dex */
public enum afp {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean a(afp afpVar) {
        return compareTo(afpVar) >= 0;
    }
}
