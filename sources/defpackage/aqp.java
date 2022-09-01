package defpackage;

/* compiled from: PG */
/* renamed from: aqp  reason: default package */
/* loaded from: classes.dex */
public enum aqp {
    JSON(".json"),
    ZIP(".zip");
    
    public final String c;

    aqp(String str) {
        this.c = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.c;
    }
}
