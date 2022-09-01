package defpackage;

/* compiled from: PG */
/* renamed from: enq  reason: default package */
/* loaded from: classes.dex */
public enum enq {
    UNKNOWN("unknown"),
    WHI_A0("gs101_0"),
    WHI_A1("gs101_1"),
    WHI_B0("gs101_2"),
    WHI_B1("gs101_3"),
    WHI_PRO("gs201");
    
    public static volatile enq g;
    public final String h;

    enq(String str) {
        this.h = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.h;
    }
}
